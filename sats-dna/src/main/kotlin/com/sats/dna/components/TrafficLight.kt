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
fun TrafficLight(color: TrafficLightColor, modifier: Modifier = Modifier) {
    val actualColor = when (color) {
        TrafficLightColor.Green -> SatsTheme.colors.signal.success
        TrafficLightColor.Yellow -> SatsTheme.colors.signal.warning
        TrafficLightColor.Red -> SatsTheme.colors.signal.error
        TrafficLightColor.Gray -> SatsTheme.colors.ui.graphicalElements1
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

enum class TrafficLightColor {
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
}
