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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsTrafficLight(color: TrafficLightColor, modifier: Modifier = Modifier) {
    val defaultColor = when (color) {
        TrafficLightColor.Green -> SatsTheme.colors2.graphicalElements.indicators.positive.default
        TrafficLightColor.Yellow -> SatsTheme.colors2.graphicalElements.indicators.attention.default
        TrafficLightColor.Red -> SatsTheme.colors2.graphicalElements.indicators.negative.default
        TrafficLightColor.Gray -> SatsTheme.colors2.graphicalElements.indicators.neutral.default
    }

    val alternateColor = when (color) {
        TrafficLightColor.Green -> SatsTheme.colors2.graphicalElements.indicators.positive.alternate
        TrafficLightColor.Yellow -> SatsTheme.colors2.graphicalElements.indicators.attention.alternate
        TrafficLightColor.Red -> SatsTheme.colors2.graphicalElements.indicators.negative.alternate
        TrafficLightColor.Gray -> SatsTheme.colors2.graphicalElements.indicators.neutral.alternate
    }

    Box(
        modifier
            .clip(CircleShape)
            .background(alternateColor),
    ) {
        Box(
            Modifier
                .align(Alignment.Center)
                .fillMaxSize(fraction = .5f)
                .clip(CircleShape)
                .background(defaultColor),
        )
    }
}

enum class TrafficLightColor {
    Green,
    Yellow,
    Red,
    Gray,
}

@PreviewLightDark
@Composable
private fun SatsTrafficLightPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
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
                        SatsTrafficLight(color, Modifier.size(32.dp))

                        Text(color.toString())
                    }
                }
            }
        }
    }
}
