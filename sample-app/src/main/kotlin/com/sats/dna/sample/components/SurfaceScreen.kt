package com.sats.dna.sample.components

import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Slider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sats.dna.components.SatsSurface
import com.sats.dna.theme.SatsTheme
import kotlin.math.roundToInt

@Composable
internal fun SurfaceScreen(navigateUp: () -> Unit) {
    ComponentScreen("Surface", navigateUp) { innerPadding ->
        Column(
            Modifier
                .padding(innerPadding)
                .padding(SatsTheme.spacing.xl)
                .fillMaxSize(),
            spacedBy(SatsTheme.spacing.l, CenterVertically),
            CenterHorizontally,
        ) {
            val (elevation, setElevation) = rememberSaveable { mutableStateOf(0f) }

            SatsSurface(
                Modifier
                    .fillMaxWidth()
                    .height(256.dp),
                shape = SatsTheme.shapes.roundedCorners.medium,
                elevation = elevation.dp,
            ) {
                Column(
                    Modifier
                        .fillMaxSize()
                        .wrapContentSize(),
                    horizontalAlignment = CenterHorizontally,
                ) {
                    Text("Elevation", style = SatsTheme.typography.medium.heading1)
                    Text("${elevation.roundToInt()} dp", style = SatsTheme.typography.emphasis.large)
                }
            }

            Slider(elevation, setElevation, Modifier.fillMaxWidth(), valueRange = 0f..5f, steps = 4)
        }
    }
}
