package com.sats.dna.sample.components

import androidx.compose.foundation.layout.Arrangement.Absolute.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sats.dna.components.Brand
import com.sats.dna.components.BrandLogo
import com.sats.dna.theme.SatsTheme

@Composable
internal fun BrandLogoScreen(navigateUp: () -> Unit) {
    ComponentScreen("Brand Logo", navigateUp) { innerPadding ->
        Column(
            Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(vertical = SatsTheme.spacing.m),
            verticalArrangement = spacedBy(SatsTheme.spacing.xl, CenterVertically),
            horizontalAlignment = CenterHorizontally,
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

@Preview
@Composable
private fun BrandLogoScreenPreview() {
    SatsTheme {
        BrandLogoScreen(navigateUp = {})
    }
}
