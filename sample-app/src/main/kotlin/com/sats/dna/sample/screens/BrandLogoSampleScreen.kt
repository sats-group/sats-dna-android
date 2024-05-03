package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.SatsBrandLogo
import com.sats.dna.components.SatsBrandLogoBrand
import com.sats.dna.components.SatsHorizontalDivider
import com.sats.dna.theme.SatsTheme

data object BrandLogoSampleScreen : SampleScreen(
    screen = { BrandLogoScreen(it::navigateUp) },
)

@Composable
private fun BrandLogoScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen("Brand Logo", navigateUp, modifier) { innerPadding ->
        Column(
            Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(vertical = SatsTheme.spacing.m),
            verticalArrangement = Arrangement.Absolute.spacedBy(SatsTheme.spacing.xl, Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            SatsBrandLogo(
                brand = SatsBrandLogoBrand.Elixia,
                contentDescription = null,
            )

            SatsBrandLogo(
                brand = SatsBrandLogoBrand.Elixia,
                contentDescription = null,
                isFullName = true,
            )

            SatsHorizontalDivider()

            SatsBrandLogo(
                brand = SatsBrandLogoBrand.Sats,
                contentDescription = null,
            )

            SatsBrandLogo(
                brand = SatsBrandLogoBrand.Sats,
                contentDescription = null,
                isFullName = true,
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun BrandLogoScreenPreview() {
    SatsTheme {
        BrandLogoScreen(navigateUp = {})
    }
}
