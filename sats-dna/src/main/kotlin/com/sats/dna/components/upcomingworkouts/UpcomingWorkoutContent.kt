package com.sats.dna.components.upcomingworkouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.components.SatsSurface
import com.sats.dna.internal.MaterialText
import com.sats.dna.theme.SatsTheme

@Composable
internal fun WorkoutTypeColorIndicator(
    workoutType: WorkoutType,
    modifier: Modifier = Modifier,
) {
    val color = when (workoutType) {
        WorkoutType.Pt -> SatsTheme.colors2.graphicalElements.workouts.pt.bg
        WorkoutType.Gx -> SatsTheme.colors2.graphicalElements.workouts.gx.bg
        WorkoutType.Treatment -> SatsTheme.colors2.graphicalElements.workouts.treatments.bg
        WorkoutType.Gymfloor -> SatsTheme.colors2.graphicalElements.workouts.gymfloor.bg
        WorkoutType.OwnTraining -> SatsTheme.colors2.graphicalElements.workouts.other.bg
    }

    Box(
        modifier
            .fillMaxHeight()
            .width(4.dp)
            .clip(SatsTheme.shapes.roundedCorners.medium)
            .background(color),
    )
}

@Composable
internal fun TimeAndDuration(
    time: String,
    duration: String,
    modifier: Modifier = Modifier,
) {
    Column(modifier) {
        MaterialText(
            text = time,
            style = SatsTheme.typography.medium.basic,
        )

        MaterialText(
            text = duration,
            style = SatsTheme.typography.normal.small,
            color = SatsTheme.colors2.backgrounds.primary.fg.alternate,
        )
    }
}

@Composable
internal fun WorkoutInfo(
    name: String,
    location: String?,
    instructor: String?,
    workoutType: String?,
    modifier: Modifier = Modifier,
    waitingListStatus: WaitingListStatus? = null,
) {
    Column(modifier) {
        MaterialText(
            text = name,
            style = SatsTheme.typography.medium.basic,
        )

        location?.let { location ->
            MaterialText(
                text = location,
                style = SatsTheme.typography.normal.small,
                color = SatsTheme.colors2.backgrounds.primary.fg.alternate,
            )
        }

        instructor?.let { instructor ->
            MaterialText(
                text = instructor,
                style = SatsTheme.typography.normal.small,
                color = SatsTheme.colors2.backgrounds.primary.fg.alternate,
            )
        }

        workoutType?.let { workoutType ->
            MaterialText(
                text = workoutType,
                style = SatsTheme.typography.normal.small,
                color = SatsTheme.colors2.backgrounds.primary.fg.alternate,
            )
        }

        waitingListStatus?.let { status ->
            WaitingListStatus(status)
        }
    }
}

@Composable
private fun WaitingListStatus(status: WaitingListStatus) {
    val color = when (status) {
        is WaitingListStatus.OnWaitingList -> SatsTheme.colors2.surfaces.primary.fg.waitlist
        is WaitingListStatus.SpotSecured -> SatsTheme.colors2.surfaces.primary.fg.success
    }

    MaterialText(
        text = status.text,
        color = color,
        style = SatsTheme.typography.normal.small,
    )

    if (status is WaitingListStatus.SpotSecured) {
        status.waitingListText?.let {
            MaterialText(
                text = status.waitingListText,
                color = SatsTheme.colors2.surfaces.primary.fg.waitlist,
                style = SatsTheme.typography.normal.small,
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun TimeAndDurationPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            TimeAndDuration(
                time = "9:00 PM",
                duration = "45 min",
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun WorkoutInfoPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            WorkoutInfo(
                name = "Yoga Flow",
                location = "SATS Nydalen",
                instructor = "w/ Andrew Nielsen",
                waitingListStatus = WaitingListStatus.SpotSecured("Spot secured! 32 on the waiting list."),
                workoutType = null,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun WorkoutInfoOnWaitingListPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            WorkoutInfo(
                name = "Yoga Flow",
                location = "SATS Nydalen",
                instructor = "w/ Andrew Nielsen",
                waitingListStatus = WaitingListStatus.OnWaitingList("You're number 5 on the waiting list."),
                workoutType = "Strength training",
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}
