package com.sats.dna.sample.screens.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.components.SatsTrafficLight
import com.sats.dna.components.TrafficLightColor
import com.sats.dna.sample.screens.SampleScreen
import com.sats.dna.theme.SatsTheme

@Composable
fun TrafficLightsSampleScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    SampleScreen(
        title = "Traffic Lights",
        navigateUp = navigateUp,
        modifier = modifier,
        bottomBar = { Spacer(Modifier.navigationBarsPadding()) },
    ) { innerPadding ->
        Column(
            Modifier
                .verticalScroll(rememberScrollState())
                .padding(innerPadding),
        ) {
            TrafficLightColor.entries.forEach { color ->
                Row(
                    Modifier.padding(SatsTheme.spacing.m),
                    Arrangement.spacedBy(SatsTheme.spacing.m),
                    Alignment.CenterVertically,
                ) {
                    SatsTrafficLight(color, Modifier.size(32.dp))

                    Text(color.toString())
                }
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun TrafficLightsSampleScreenPreview() {
    SatsTheme {
        TrafficLightsSampleScreen(navigateUp = {})
    }
}
