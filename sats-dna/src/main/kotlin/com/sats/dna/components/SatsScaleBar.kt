package com.sats.dna.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.PreviewFontScale
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsScaleBar(
    label: String,
    difficultyLevel: Int,
    maxDifficulty: Int,
    modifier: Modifier = Modifier,
) {
    Column(modifier, verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xs)) {
        Text(label, style = SatsTheme.typography.medium.basic)

        Row(
            Modifier
                .height(8.dp)
                .clip(SatsTheme.shapes.circle),
            horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xxs),
        ) {
            repeat(difficultyLevel) {
                Box(
                    Modifier
                        .weight(1f)
                        .background(SatsTheme.colors.graphicalElements.progressBar.default.fg)
                        .fillMaxHeight(),
                )
            }

            repeat(maxDifficulty - difficultyLevel) {
                Box(
                    Modifier
                        .weight(1f)
                        .background(SatsTheme.colors.graphicalElements.progressBar.default.bg)
                        .fillMaxHeight(),
                )
            }
        }
    }
}

@PreviewLightDark
@PreviewFontScale
@Composable
private fun SatsScaleBarPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            SatsScaleBar(
                label = "Choreography",
                difficultyLevel = 3,
                maxDifficulty = 4,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}
