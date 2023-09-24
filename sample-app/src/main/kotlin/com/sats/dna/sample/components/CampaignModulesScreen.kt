package com.sats.dna.sample.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sats.dna.components.SatsCampaignModule
import com.sats.dna.theme.SatsTheme

@Composable
internal fun CampaignModulesScreen(navigateUp: () -> Unit) {
    ComponentScreen("Campaign Modules", navigateUp) { innerPadding ->
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
        }
    }
}

@Preview
@Composable
private fun CampaignModulesScreenPreview() {
    SatsTheme {
        CampaignModulesScreen(navigateUp = {})
    }
}
