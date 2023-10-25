package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sats.dna.components.SatsCampaignModule
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

data object CampaignModuleSampleScreen : SampleScreen(
    name = "Campaign Module",
    route = "/components/campaign-modules",
    screen = { CampaignModulesScreen(it::navigateUp) },
)

@Composable
private fun CampaignModulesScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen("Campaign Modules", navigateUp, modifier) { innerPadding ->
        Column(
            Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m),
            verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
        ) {
            SatsCampaignModule(
                imageUrl = "https://picsum.photos/id/10/1920/1080.webp",
                title = "Happy Training Day",
                subtitle = "Today is a day to learn, grow, and challenge yourself. " +
                    "It's a day to step outside of your comfort zone and try new things. " +
                    "It's a day to invest in yourself and your future.",
                onClick = {},
            )

            SatsCampaignModule(
                imageUrl = "https://picsum.photos/id/30/1920/1080.webp",
                title = "Happy Training Day",
                subtitle = "Today is a day to learn, grow, and challenge yourself.",
                onClick = {},
            )

            SatsCampaignModule(
                imageUrl = "https://picsum.photos/id/30/1920/1080.webp",
                title = "Happy Training Day",
                subtitle = null,
                onClick = {},
            )
        }
    }
}

@LightDarkPreview
@Composable
private fun CampaignModulesScreenPreview() {
    SatsTheme {
        CampaignModulesScreen(navigateUp = {})
    }
}
