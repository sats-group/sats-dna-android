package com.sats.dna.components.upcomingworkouts

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sats.dna.components.SatsSurface
import com.sats.dna.internal.MaterialText
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

@Composable
internal fun TimeAndDuration(
    time: String,
    duration: String,
    useMaterial3: Boolean,
    modifier: Modifier = Modifier,
) {
    Column(modifier) {
        MaterialText(
            useMaterial3 = useMaterial3,
            text = time,
            style = SatsTheme.typography.medium.basic,
        )

        MaterialText(
            useMaterial3 = useMaterial3,
            text = duration,
            style = SatsTheme.typography.default.small,
            color = SatsTheme.colors.onBackground.secondary,
        )
    }
}

@Composable
internal fun WorkoutInfo(
    name: String,
    location: String,
    instructor: String,
    useMaterial3: Boolean,
    modifier: Modifier = Modifier,
    waitingListStatus: WaitingListStatus? = null,
) {
    Column(modifier) {
        MaterialText(
            useMaterial3,
            name,
            style = SatsTheme.typography.medium.basic,
        )

        MaterialText(
            useMaterial3,
            location,
            color = SatsTheme.colors.onSurface.secondary,
            style = SatsTheme.typography.default.small,
        )

        MaterialText(
            useMaterial3,
            instructor,
            style = SatsTheme.typography.default.small,
            color = SatsTheme.colors.onBackground.secondary,
        )

        waitingListStatus?.let { status ->
            WaitingListStatus(status, useMaterial3)
        }
    }
}

@Composable
private fun WaitingListStatus(status: WaitingListStatus, useMaterial3: Boolean) {
    val color = when (status) {
        is WaitingListStatus.OnWaitingList -> SatsTheme.colors.waitingList.text
        is WaitingListStatus.SpotSecured -> SatsTheme.colors.signalText.success
    }

    MaterialText(
        useMaterial3 = useMaterial3,
        text = status.text,
        color = color,
        style = SatsTheme.typography.default.small,
    )

    if (status is WaitingListStatus.SpotSecured) {
        status.waitingListText?.let {
            MaterialText(
                useMaterial3,
                text = status.waitingListText,
                color = SatsTheme.colors.waitingList.text,
                style = SatsTheme.typography.default.small,
            )
        }
    }
}

@LightDarkPreview
@Composable
private fun TimeAndDurationPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.background.primary) {
            TimeAndDuration(
                time = "9:00 PM",
                duration = "45 min",
                modifier = Modifier.padding(SatsTheme.spacing.m),
                useMaterial3 = true,
            )
        }
    }
}

@LightDarkPreview
@Composable
private fun WorkoutInfoPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.background.primary) {
            WorkoutInfo(
                name = "Yoga Flow",
                location = "SATS Nydalen",
                instructor = "w/ Andrew Nielsen",
                waitingListStatus = WaitingListStatus.SpotSecured("Spot secured! 32 on the waiting list."),
                modifier = Modifier.padding(SatsTheme.spacing.m),
                useMaterial3 = true,
            )
        }
    }
}
