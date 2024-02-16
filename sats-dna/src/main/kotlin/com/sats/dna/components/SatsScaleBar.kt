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
import androidx.compose.ui.unit.dp
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.FontSizePreview
import com.sats.dna.tooling.LightDarkPreview

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
                        .background(SatsTheme.colors2.graphicalElements.progressBar.indicator)
                        .fillMaxHeight(),
                )
            }

            repeat(maxDifficulty - difficultyLevel) {
                Box(
                    Modifier
                        .weight(1f)
                        .background(SatsTheme.colors2.graphicalElements.progressBar.bg)
                        .fillMaxHeight(),
                )
            }
        }
    }
}

@LightDarkPreview
@FontSizePreview
@Composable
private fun SatsScaleBarPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            SatsScaleBar(
                label = "Choreography",
                difficultyLevel = 3,
                maxDifficulty = 4,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}
