package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.SatsScaleBar
import com.sats.dna.components.SatsSurface
import com.sats.dna.sample.internal.ComponentScreen
import com.sats.dna.theme.SatsTheme

@Composable
fun ScaleBarSampleScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen("Scale Bar", navigateUp, modifier) { contentPadding ->
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(contentPadding)
                .padding(SatsTheme.spacing.m),
            verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xl),
        ) {
            val maxDifficulty = 4
            List(maxDifficulty + 1) { difficulty ->
                SatsScaleBar(
                    label = "Difficulty level $difficulty/$maxDifficulty",
                    difficultyLevel = difficulty,
                    maxDifficulty = maxDifficulty,
                )
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun ScaleBarSampleScreenPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            ScaleBarSampleScreen(navigateUp = {})
        }
    }
}
