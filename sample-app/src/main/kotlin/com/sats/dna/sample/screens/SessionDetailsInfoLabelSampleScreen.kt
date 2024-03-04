package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.SatsHorizontalDivider
import com.sats.dna.components.sessiondetails.SatsSessionDetailsInfoLabel
import com.sats.dna.components.sessiondetails.SatsSessionDetailsInfoSection
import com.sats.dna.components.sessiondetails.SessionDetailsInfoSectionPlaceholder
import com.sats.dna.theme.SatsTheme

data object SessionDetailsInfoLabelSampleScreen : SampleScreen(
    name = "Session Details Info Label",
    route = "/components/session-details-info-label",
    screen = { SessionDetailsInfoLabelScreen(it::navigateUp) },
)

@Composable
private fun SessionDetailsInfoLabelScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen("Session Details Info Label", navigateUp, modifier) { innerPadding ->
        Column(
            Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .wrapContentSize(),
            verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
        ) {
            SatsSessionDetailsInfoSection(
                durationLabel = {
                    SatsSessionDetailsInfoLabel(
                        icon = SatsTheme.icons.time,
                        text = "60 min",
                    )
                },
                dateLabel = {
                    SatsSessionDetailsInfoLabel(
                        icon = SatsTheme.icons.calendar,
                        text = "Sat, Dec 2 2:30 PM",
                    )
                },
                locationLabel = {
                    SatsSessionDetailsInfoLabel(
                        icon = SatsTheme.icons.location,
                        text = "SATS Bergen LHG",
                        onClick = {},
                    )
                },
                workoutTypeLabel = {
                    SatsSessionDetailsInfoLabel(
                        icon = SatsTheme.icons.workoutGx,
                        text = "Strength Training",
                    )
                },
                gxNameLabel = {
                    SatsSessionDetailsInfoLabel(
                        icon = SatsTheme.icons.workoutPt,
                        text = "Pure Strength",
                    )
                },
            )

            SatsHorizontalDivider()

            SessionDetailsInfoSectionPlaceholder()
        }
    }
}

@PreviewLightDark
@Composable
private fun Preview() {
    SatsTheme {
        SessionDetailsInfoLabelScreen(navigateUp = {})
    }
}
