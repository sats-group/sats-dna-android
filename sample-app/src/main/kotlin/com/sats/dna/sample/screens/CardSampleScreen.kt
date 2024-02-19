package com.sats.dna.sample.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.card.SatsCard
import com.sats.dna.theme.SatsTheme

data object CardSampleScreen : SampleScreen(
    name = "Card",
    route = "/components/card",
    screen = { SatsCardScreen(it::navigateUp) },
)

@Composable
private fun SatsCardScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen("Cards", navigateUp, modifier) { innerPadding ->
        Column(
            Modifier
                .verticalScroll(rememberScrollState())
                .fillMaxSize()
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m),
            verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            SatsCard {
                Column(Modifier.clickable { }) {
                    Image(
                        painterResource(com.sats.dna.R.drawable.debug_img_placeholder),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .aspectRatio(16f / 9)
                            .background(SatsTheme.colors2.surfaces.fixed.bg.default),
                        contentScale = ContentScale.Crop,
                    )

                    Column(Modifier.padding(SatsTheme.spacing.m), Arrangement.spacedBy(SatsTheme.spacing.xxs)) {
                        Text("SATS Card", style = SatsTheme.typography.medium.large)

                        Text(
                            "This is a SATS Card with an image, a title and a body text. It is not limited to these " +
                                "fields, nor are any of them required; this is just one way it can be presented.",
                        )
                    }
                }
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun Preview() {
    SatsTheme {
        SatsCardScreen(navigateUp = {})
    }
}
