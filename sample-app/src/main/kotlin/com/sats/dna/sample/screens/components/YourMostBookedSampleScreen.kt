package com.sats.dna.sample.screens.components

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.SatsSurface
import com.sats.dna.components.SatsYourMostBookedCard
import com.sats.dna.sample.screens.SampleScreen
import com.sats.dna.theme.SatsTheme

@Composable
fun YourMostBookedSampleScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    SampleScreen("Your Most Booked", navigateUp, modifier) { innerPadding ->
        SatsYourMostBookedCard(
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

@PreviewLightDark
@Composable
private fun YourMostBookedSampleScreenPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            YourMostBookedSampleScreen(navigateUp = {})
        }
    }
}
