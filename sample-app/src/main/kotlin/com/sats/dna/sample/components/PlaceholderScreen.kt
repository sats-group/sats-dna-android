package com.sats.dna.sample.components

import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import com.sats.dna.components.PlaceholderBox
import com.sats.dna.components.PlaceholderParagraph
import com.sats.dna.components.PlaceholderText
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

@Composable
internal fun PlaceholderScreen(navigateUp: () -> Unit) {
    ComponentScreen("Placeholders", navigateUp) { innerPadding ->
        Column(Modifier.padding(innerPadding)) {
            PlaceholderBox(
                Modifier
                    .aspectRatio(16f / 9)
                    .fillMaxWidth(),
                RectangleShape,
            )

            Column(
                Modifier.padding(SatsTheme.spacing.m),
                verticalArrangement = spacedBy(SatsTheme.spacing.m),
            ) {
                Row(horizontalArrangement = spacedBy(SatsTheme.spacing.m), verticalAlignment = CenterVertically) {
                    PlaceholderBox(Modifier.size(50.dp), SatsTheme.shapes.circle)

                    Column(verticalArrangement = spacedBy(SatsTheme.spacing.xxs)) {
                        PlaceholderText("Austin Powers", style = SatsTheme.typography.medium.basic)
                        PlaceholderText("International Man of Mystery", style = SatsTheme.typography.default.small)
                    }
                }

                PlaceholderParagraph(lines = 10)
            }
        }
    }
}

@LightDarkPreview
@Composable
private fun Preview() {
    SatsTheme {
        PlaceholderScreen(navigateUp = {})
    }
}
