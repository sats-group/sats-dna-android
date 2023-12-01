package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import com.sats.dna.components.LocalUseMaterial3
import com.sats.dna.components.SatsSurface
import com.sats.dna.components.sessiondetails.SessionDetailsInfoLabel
import com.sats.dna.components.sessiondetails.SessionDetailsInfoSection
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

data object SessionDetailsInfoLabelSampleScreen : SampleScreen(
    name = "Session Details Info Label",
    route = "/components/session-details-info-label",
    screen = { SessionDetailsInfoLabelScreen(it::navigateUp) },
)

@Composable
private fun SessionDetailsInfoLabelScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen(
        title = "Friends Booking Status",
        navigateUp = navigateUp,
        modifier = modifier,
    ) { innerPadding ->
        Column(
            Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .wrapContentSize(),
        ) {
            CompositionLocalProvider(
                LocalUseMaterial3 provides false,
            ) {
                SatsSurface {
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
                    )
                }
            }
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
