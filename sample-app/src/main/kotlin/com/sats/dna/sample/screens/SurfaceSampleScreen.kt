package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sats.dna.components.SatsSurface
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview
import kotlin.math.roundToInt

data object SurfaceSampleScreen : SampleScreen(
    name = "Surface",
    route = "/components/surface",
    screen = { SurfaceScreen(it::navigateUp) },
)

@Composable
private fun SurfaceScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen("Surface", navigateUp, modifier) { innerPadding ->
        Column(
            Modifier
                .padding(innerPadding)
                .padding(SatsTheme.spacing.xl)
                .fillMaxSize(),
            Arrangement.spacedBy(SatsTheme.spacing.l, Alignment.CenterVertically),
            Alignment.CenterHorizontally,
        ) {
            val (elevation, setElevation) = rememberSaveable { mutableFloatStateOf(0f) }

            SatsSurface(
                Modifier
                    .fillMaxWidth()
                    .height(256.dp),
                shape = SatsTheme.shapes.roundedCorners.medium,
                elevation = elevation.dp,
                useMaterial3 = true,
            ) {
                Column(
                    Modifier
                        .fillMaxSize()
                        .wrapContentSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text("Elevation", style = SatsTheme.typography.medium.heading1)
                    Text("${elevation.roundToInt()} dp", style = SatsTheme.typography.emphasis.large)
                }
            }

            Slider(elevation, setElevation, Modifier.fillMaxWidth(), valueRange = 0f..5f, steps = 4)
        }
    }
}

@LightDarkPreview
@Composable
private fun Preview() {
    SatsTheme {
        SurfaceScreen(navigateUp = {})
    }
}
