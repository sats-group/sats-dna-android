package com.sats.dna.sample.screens.components

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
import com.sats.dna.sample.screens.SampleScreen
import com.sats.dna.theme.SatsTheme

@Composable
fun BrandLogoSampleScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    SampleScreen("Brand Logo", navigateUp, modifier) { innerPadding ->
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
private fun BrandLogoSampleScreenPreview() {
    SatsTheme {
        BrandLogoSampleScreen(navigateUp = {})
    }
}
