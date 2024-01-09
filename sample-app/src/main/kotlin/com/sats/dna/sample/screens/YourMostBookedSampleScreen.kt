package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sats.dna.components.SatsSurface
import com.sats.dna.components.YourMostBookedCard
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

data object YourMostBookedSampleScreen : SampleScreen(
    name = "Your Most Booked",
    route = "/your-most-booked",
    screen = { YourMostBookedSampleScreen(it::navigateUp) },
)

@Composable
private fun YourMostBookedSampleScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen("Your Most Booked", navigateUp, modifier) { innerPadding ->
        YourMostBookedCard(
            imageUrl = null,
            title = "Indoor Running",
            subtitle = "Solli",
            onClick = { },
            modifier = Modifier
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m),
        )
    }
}

@LightDarkPreview
@Composable
private fun YourMostBookedSampleScreenPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            YourMostBookedSampleScreen(navigateUp = {})
        }
    }
}