package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sats.dna.components.GxFocusGraph
import com.sats.dna.components.SatsSurface
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

data object GxFocusGraphSampleScreen : SampleScreen(
    name = "GX Focus Graph",
    route = "/components/gx-focus-graph",
    screen = { GxFocusGraphScreen(it::navigateUp) },
)

@Composable
private fun GxFocusGraphScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen("GX Focus Graph", navigateUp, modifier) { contentPadding ->
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(contentPadding)
                .padding(SatsTheme.spacing.m),
            verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xl),
        ) {
            val maxDifficulty = 4
            List(maxDifficulty + 1) { difficulty ->
                GxFocusGraph(
                    label = "Difficulty level $difficulty/$maxDifficulty",
                    difficultyLevel = difficulty,
                    maxDifficulty = maxDifficulty,
                )
            }
        }
    }
}

@LightDarkPreview
@Composable
private fun GxFocusGraphScreenPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            GxFocusGraphScreen(navigateUp = {})
        }
    }
}
