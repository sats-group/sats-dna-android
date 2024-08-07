package com.sats.dna.sample.screens.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.SatsBanner
import com.sats.dna.components.SatsBannerAction
import com.sats.dna.sample.screens.SampleScreen
import com.sats.dna.theme.SatsTheme

@Composable
fun BannerSampleScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    SampleScreen("Banner", navigateUp, modifier) { innerPadding ->
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

@PreviewLightDark
@Composable
private fun BannerSampleScreenPreview() {
    SatsTheme {
        BannerSampleScreen(navigateUp = {})
    }
}
