package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.components.PlaceholderBox
import com.sats.dna.components.PlaceholderParagraph
import com.sats.dna.components.PlaceholderText
import com.sats.dna.theme.SatsTheme

data object PlaceholdersSampleScreen : SampleScreen(
    name = "Placeholders",
    route = "/components/placeholders",
    screen = { PlaceholderScreen(it::navigateUp) },
)

@Composable
private fun PlaceholderScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen("Placeholders", navigateUp, modifier) { innerPadding ->
        Column(Modifier.padding(innerPadding)) {
            PlaceholderBox(
                Modifier
                    .aspectRatio(16f / 9)
                    .fillMaxWidth(),
                RectangleShape,
            )

            Column(
                Modifier.padding(SatsTheme.spacing.m),
                verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    PlaceholderBox(Modifier.size(50.dp), SatsTheme.shapes.circle)

                    Column(verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xxs)) {
                        PlaceholderText("Austin Powers", style = SatsTheme.typography.medium.basic)
                        PlaceholderText("International Man of Mystery", style = SatsTheme.typography.normal.small)
                    }
                }

                PlaceholderParagraph(lines = 10)
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun Preview() {
    SatsTheme {
        PlaceholderScreen(navigateUp = {})
    }
}
