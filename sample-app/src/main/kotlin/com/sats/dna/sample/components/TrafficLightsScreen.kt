package com.sats.dna.sample.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sats.dna.components.TrafficLight
import com.sats.dna.components.TrafficLightColor
import com.sats.dna.theme.SatsTheme

@Composable
internal fun TrafficLightsScreen(navigateUp: () -> Unit) {
    ComponentScreen(
        title = "Traffic Lights",
        navigateUp = navigateUp,
        bottomBar = { Spacer(Modifier.navigationBarsPadding()) },
    ) { innerPadding ->
        Column(
            Modifier
                .verticalScroll(rememberScrollState())
                .padding(innerPadding),
        ) {
            val openStates = listOf(
                TrafficLightColor.Gray,
                TrafficLightColor.Green,
                TrafficLightColor.Yellow,
                TrafficLightColor.Red,
            )

            openStates.forEach { color ->
                Row(
                    Modifier.padding(SatsTheme.spacing.m),
                    Arrangement.spacedBy(SatsTheme.spacing.m),
                    Alignment.CenterVertically,
                ) {
                    TrafficLight(color, Modifier.size(32.dp))

                    Text(color.toString())
                }
            }
        }
    }
}

@Preview
@Composable
private fun TrafficLightsScreenPreview() {
    SatsTheme {
        TrafficLightsScreen(navigateUp = {})
    }
}