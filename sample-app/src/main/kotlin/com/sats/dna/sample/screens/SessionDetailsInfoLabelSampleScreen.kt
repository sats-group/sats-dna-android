package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.SatsIcons
import com.sats.dna.components.SatsHorizontalDivider
import com.sats.dna.components.sessiondetails.SatsSessionDetailsInfoLabel
import com.sats.dna.components.sessiondetails.SatsSessionDetailsInfoSection
import com.sats.dna.components.sessiondetails.SessionDetailsInfoSectionPlaceholder
import com.sats.dna.icons.Calendar
import com.sats.dna.icons.Gx
import com.sats.dna.icons.Location
import com.sats.dna.icons.Pt
import com.sats.dna.icons.Time
import com.sats.dna.theme.SatsTheme

@Composable
fun SessionDetailsInfoLabelSampleScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
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
                        icon = SatsIcons.Time,
                        text = "60 min",
                    )
                },
                dateLabel = {
                    SatsSessionDetailsInfoLabel(
                        icon = SatsIcons.Calendar,
                        text = "Sat, Dec 2 2:30 PM",
                    )
                },
                locationLabel = {
                    SatsSessionDetailsInfoLabel(
                        icon = SatsIcons.Location,
                        text = "SATS Bergen LHG",
                        onClick = {},
                    )
                },
                workoutTypeLabel = {
                    SatsSessionDetailsInfoLabel(
                        icon = SatsIcons.Gx,
                        text = "Strength Training",
                    )
                },
                gxNameLabel = {
                    SatsSessionDetailsInfoLabel(
                        icon = SatsIcons.Pt,
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
private fun SessionDetailsInfoLabelSampleScreenPreview() {
    SatsTheme {
        SessionDetailsInfoLabelSampleScreen(navigateUp = {})
    }
}
