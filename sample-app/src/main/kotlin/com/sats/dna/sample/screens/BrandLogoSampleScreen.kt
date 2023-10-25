package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.sats.dna.components.Brand
import com.sats.dna.components.BrandLogo
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

data object BrandLogoSampleScreen : SampleScreen(
    name = "Brand Logo",
    route = "/components/brand-logo",
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
            BrandLogo(
                brand = Brand.Elixia,
                contentDescription = null,
            )

            BrandLogo(
                brand = Brand.Elixia,
                contentDescription = null,
                isFullName = true,
            )

            Divider()

            BrandLogo(
                brand = Brand.Sats,
                contentDescription = null,
            )

            BrandLogo(
                brand = Brand.Sats,
                contentDescription = null,
                isFullName = true,
            )
        }
    }
}

@LightDarkPreview
@Composable
private fun BrandLogoScreenPreview() {
    SatsTheme {
        BrandLogoScreen(navigateUp = {})
    }
}
