package com.sats.dna.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

@Composable
fun TrafficLights(color: TrafficLightsColor, modifier: Modifier = Modifier) {
    val actualColor = when (color) {
        TrafficLightsColor.Green -> SatsTheme.colors.signal.success
        TrafficLightsColor.Yellow -> SatsTheme.colors.signal.warning
        TrafficLightsColor.Red -> SatsTheme.colors.signal.error
        TrafficLightsColor.Gray -> SatsTheme.colors.ui.graphicalElements1
    }

    Box(
        modifier
            .clip(CircleShape)
            .background(actualColor.copy(alpha = .2f)),
    ) {
        Box(
            Modifier
                .align(Alignment.Center)
                .fillMaxSize(fraction = .5f)
                .clip(CircleShape)
                .background(actualColor),
        )
    }
}

enum class TrafficLightsColor {
    Green,
    Yellow,
    Red,
    Gray,
}

@LightDarkPreview
@Composable
private fun TrafficLightPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.background.primary) {
            Column(
                Modifier.padding(SatsTheme.spacing.m),
                Arrangement.spacedBy(SatsTheme.spacing.m),
            ) {
                val openStates = listOf(
                    TrafficLightsColor.Gray,
                    TrafficLightsColor.Green,
                    TrafficLightsColor.Yellow,
                    TrafficLightsColor.Red,
                )

                openStates.forEach { color ->
                    Row(
                        Modifier.padding(SatsTheme.spacing.m),
                        Arrangement.spacedBy(SatsTheme.spacing.m),
                        Alignment.CenterVertically,
                    ) {
                        TrafficLights(color, Modifier.size(32.dp))

                        Text(color.toString())
                    }
                }
            }
        }
    }
}
