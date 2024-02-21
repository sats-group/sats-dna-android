package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.progressbar.LinearProgressBar
import com.sats.dna.theme.SatsTheme

data object ProgressBarsSampleScreen : SampleScreen(
    name = "Progress Bars",
    route = "/components/progress-bars",
    screen = { ProgressBarsScreen(it::navigateUp) },
)

@Composable
private fun ProgressBarsScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen("Progress Bars", navigateUp, modifier) { innerPadding ->
        Column(
            Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m),
            verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
        ) {
            LinearProgressBar(0.00f, Modifier.fillMaxWidth())
            LinearProgressBar(0.25f, Modifier.fillMaxWidth())
            LinearProgressBar(0.50f, Modifier.fillMaxWidth())
            LinearProgressBar(0.75f, Modifier.fillMaxWidth())
            LinearProgressBar(1.00f, Modifier.fillMaxWidth())
        }
    }
}

@PreviewLightDark
@Composable
private fun Preview() {
    SatsTheme {
        ProgressBarsScreen(navigateUp = {})
    }
}
