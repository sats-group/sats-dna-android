package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.components.SatsCircularProgressIndicator
import com.sats.dna.theme.SatsTheme

data object CircularProgressIndicatorSampleScreen : SampleScreen(
    name = "Circular Progress Indicator",
    route = "/components/circular-progress-indicator",
    screen = { CircularProgressIndicatorScreen(it::navigateUp) },
)

@Composable
private fun CircularProgressIndicatorScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen("Circular Progress Indicator", navigateUp, modifier) { innerPadding ->
        Column(
            Modifier
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m)
                .fillMaxSize()
                .wrapContentSize(),
            Arrangement.spacedBy(SatsTheme.spacing.m),
        ) {
            Row(horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m)) {
                SatsCircularProgressIndicator(progress = .2f, Modifier.size(72.dp))
                SatsCircularProgressIndicator(progress = .4f, Modifier.size(72.dp))
                SatsCircularProgressIndicator(progress = .6f, Modifier.size(72.dp))
            }

            Row(horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m)) {
                SatsCircularProgressIndicator(progress = .8f, Modifier.size(72.dp))
                SatsCircularProgressIndicator(progress = 1f, Modifier.size(72.dp))
                SatsCircularProgressIndicator(Modifier.size(72.dp))
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun Preview() {
    SatsTheme {
        CircularProgressIndicatorScreen(navigateUp = {})
    }
}
