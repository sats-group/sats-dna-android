package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sats.dna.components.SatsHorizontalDivider
import com.sats.dna.components.sessiondetails.SessionDetailsInfoLabel
import com.sats.dna.components.sessiondetails.SessionDetailsInfoSection
import com.sats.dna.components.sessiondetails.SessionDetailsInfoSectionPlaceholder
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

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
            SessionDetailsInfoSection(
                durationLabel = {
                    SessionDetailsInfoLabel(
                        icon = SatsTheme.icons.time,
                        text = "60 min",
                    )
                },
                dateLabel = {
                    SessionDetailsInfoLabel(
                        icon = SatsTheme.icons.calendar,
                        text = "Sat, Dec 2 2:30 PM",
                    )
                },
                locationLabel = {
                    SessionDetailsInfoLabel(
                        icon = SatsTheme.icons.location,
                        text = "SATS Bergen LHG",
                        onClick = {},
                    )
                },
                workoutTypeLabel = {
                    SessionDetailsInfoLabel(
                        icon = SatsTheme.icons.workoutGx,
                        text = "Strength Training",
                    )
                },
                gxNameLabel = {
                    SessionDetailsInfoLabel(
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

@LightDarkPreview
@Composable
private fun Preview() {
    SatsTheme {
        SessionDetailsInfoLabelScreen(navigateUp = {})
    }
}
