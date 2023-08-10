package com.sats.dna.components.upcomingworkouts

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sats.dna.theme.SatsTheme

@Composable
internal fun TimeAndDuration(
    time: String,
    duration: String,
    modifier: Modifier = Modifier,
) {
    Column(modifier, Arrangement.spacedBy(SatsTheme.spacing.xxs)) {
        Text(
            time,
            style = SatsTheme.typography.medium.basic,
        )

        Text(
            duration,
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
    modifier: Modifier = Modifier,
    waitingListStatus: WaitingListStatus? = null,
) {
    Column(
        modifier,
        verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xxs),
    ) {
        Text(
            name,
            style = SatsTheme.typography.medium.basic,
        )

        Text(
            location,
            color = SatsTheme.colors.onSurface.secondary,
            style = SatsTheme.typography.default.small,
        )

        Text(
            instructor,
            style = SatsTheme.typography.default.small,
            color = SatsTheme.colors.onBackground.secondary,
        )

        waitingListStatus?.let { status ->
            WaitingListText(status)
        }
    }
}

@Composable
internal fun WaitingListText(status: WaitingListStatus) {
    val color = when (status) {
        is WaitingListStatus.OnWaitingList -> SatsTheme.colors.waitingList.text
        is WaitingListStatus.SpotSecured -> SatsTheme.colors.signalText.success
    }

    Text(status.text, color = color, style = SatsTheme.typography.default.small)
}
