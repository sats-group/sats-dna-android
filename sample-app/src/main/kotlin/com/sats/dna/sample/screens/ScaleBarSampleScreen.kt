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
import com.sats.dna.theme.SatsTheme

data object ScaleBarSampleScreen : SampleScreen(
    name = "Scale Bar",
    route = "/components/scale-bar",
    screen = { ScaleBarScreen(it::navigateUp) },
)

@Composable
private fun ScaleBarScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
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
private fun ScaleBarScreenPreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors2.backgrounds2.primary.default.bg,
            useMaterial3 = true,
        ) {
            ScaleBarScreen(navigateUp = {})
        }
    }
}
