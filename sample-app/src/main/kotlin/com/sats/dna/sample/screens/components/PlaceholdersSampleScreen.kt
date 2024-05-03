package com.sats.dna.sample.screens.components

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
import com.sats.dna.components.SatsPlaceholderBox
import com.sats.dna.components.SatsPlaceholderParagraph
import com.sats.dna.components.SatsPlaceholderText
import com.sats.dna.sample.internal.ComponentScreen
import com.sats.dna.theme.SatsTheme

@Composable
fun PlaceholdersSampleScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen("Placeholders", navigateUp, modifier) { innerPadding ->
        Column(Modifier.padding(innerPadding)) {
            SatsPlaceholderBox(
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
                    SatsPlaceholderBox(Modifier.size(50.dp), SatsTheme.shapes.circle)

                    Column(verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xxs)) {
                        SatsPlaceholderText("Austin Powers", style = SatsTheme.typography.medium.basic)
                        SatsPlaceholderText("International Man of Mystery", style = SatsTheme.typography.normal.small)
                    }
                }

                SatsPlaceholderParagraph(lines = 10)
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun PlaceholdersSampleScreenPreview() {
    SatsTheme {
        PlaceholdersSampleScreen(navigateUp = {})
    }
}
