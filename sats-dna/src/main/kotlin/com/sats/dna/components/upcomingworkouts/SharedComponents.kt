package com.sats.dna.components.upcomingworkouts

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.SatsSurface
import com.sats.dna.internal.MaterialText
import com.sats.dna.theme.SatsTheme

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
            color = SatsTheme.colors.backgrounds.primary.default.fgAlternate,
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
    waitingListStatus: SatsWaitingListStatus? = null,
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
                color = SatsTheme.colors.backgrounds.primary.default.fgAlternate,
            )
        }

        instructor?.let { instructor ->
            MaterialText(
                text = instructor,
                style = SatsTheme.typography.normal.small,
                color = SatsTheme.colors.backgrounds.primary.default.fgAlternate,
            )
        }

        workoutType?.let { workoutType ->
            MaterialText(
                text = workoutType,
                style = SatsTheme.typography.normal.small,
                color = SatsTheme.colors.backgrounds.primary.default.fgAlternate,
            )
        }

        waitingListStatus?.let { status ->
            WaitingListStatus(status)
        }
    }
}

@Composable
private fun WaitingListStatus(status: SatsWaitingListStatus) {
    val color = when (status) {
        is SatsWaitingListStatus.OnWaitingList -> SatsTheme.colors.surfaces.primary.default.fgWaitingList
        is SatsWaitingListStatus.SpotSecured -> SatsTheme.colors.surfaces.primary.default.fgSuccess
    }

    MaterialText(
        text = status.text,
        color = color,
        style = SatsTheme.typography.normal.small,
    )

    if (status is SatsWaitingListStatus.SpotSecured) {
        status.waitingListText?.let {
            MaterialText(
                text = status.waitingListText,
                color = SatsTheme.colors.surfaces.primary.default.fgWaitingList,
                style = SatsTheme.typography.normal.small,
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun TimeAndDurationPreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors.backgrounds.primary.default.bg,
            useMaterial3 = true,
        ) {
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
        SatsSurface(
            color = SatsTheme.colors.backgrounds.primary.default.bg,
            useMaterial3 = true,
        ) {
            WorkoutInfo(
                name = "Yoga Flow",
                location = "SATS Nydalen",
                instructor = "w/ Andrew Nielsen",
                waitingListStatus = SatsWaitingListStatus.SpotSecured("Spot secured! 32 on the waiting list."),
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
        SatsSurface(
            color = SatsTheme.colors.backgrounds.primary.default.bg,
            useMaterial3 = true,
        ) {
            WorkoutInfo(
                name = "Yoga Flow",
                location = "SATS Nydalen",
                instructor = "w/ Andrew Nielsen",
                waitingListStatus = SatsWaitingListStatus.OnWaitingList("You're number 5 on the waiting list."),
                workoutType = "Strength training",
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}