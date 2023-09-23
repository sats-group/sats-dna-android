package com.sats.dna.sample.components

import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sats.dna.components.SatsBanner
import com.sats.dna.components.button.SatsButton
import com.sats.dna.components.button.SatsButtonColor
import com.sats.dna.theme.SatsTheme

@Composable
internal fun BannerScreen(navigateUp: () -> Unit) {
    ComponentScreen("Banner", navigateUp) { innerPadding ->
        Column(
            Modifier
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m)
                .fillMaxSize(),
            verticalArrangement = spacedBy(SatsTheme.spacing.l),
            horizontalAlignment = CenterHorizontally,
        ) {
            SatsBanner(
                modifier = Modifier.fillMaxWidth(),
                title = "You woke the bear from his sleep, you cannot cry when he tangos.",
            )

            SatsBanner(
                modifier = Modifier.fillMaxWidth(),
                title = "Will the real Slim Shady please stand up?",
                action = { SatsButton(onClick = {}, "Stand up", colors = SatsButtonColor.Clean) },
            )
        }
    }
}

@Preview
@Composable
private fun BannerScreenPreview() {
    BannerScreen(navigateUp = {})
}
