package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.sats.dna.components.SatsBanner
import com.sats.dna.components.SatsBannerAction
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

data object BannerSampleScreen : SampleScreen(
    name = "Banner",
    route = "/components/banner",
    screen = { BannerScreen(it::navigateUp) },
)

@Composable
private fun BannerScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen("Banner", navigateUp, modifier) { innerPadding ->
        Column(
            Modifier
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m)
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.l, Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            SatsBanner(
                modifier = Modifier.fillMaxWidth(),
                title = "You woke the bear from his sleep, you cannot cry when he tangos.",
            )

            SatsBanner(
                modifier = Modifier.fillMaxWidth(),
                title = "Will the real Slim Shady please stand up?",
                action = SatsBannerAction("Stand up", onClick = {}),
            )
        }
    }
}

@LightDarkPreview
@Composable
private fun BannerScreenPreview() {
    SatsTheme {
        BannerScreen(navigateUp = {})
    }
}
