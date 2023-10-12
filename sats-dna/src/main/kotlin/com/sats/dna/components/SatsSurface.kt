package com.sats.dna.components

import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

@Composable
fun SatsSurface(
    modifier: Modifier = Modifier,
    color: Color = SatsTheme.colors.surface.primary,
    contentColor: Color = SatsTheme.colors.onSurface.primary,
    shape: Shape = RectangleShape,
    elevation: Dp = 0.dp,
    useShadowElevation: Boolean = true,
    content: @Composable () -> Unit,
) {
    Surface(
        modifier = modifier,
        shape = shape,
        color = color,
        contentColor = contentColor,
        tonalElevation = if (useShadowElevation) 0.dp else elevation,
        shadowElevation = if (useShadowElevation) elevation else 0.dp,
        content = content,
    )
}

@LightDarkPreview
@Composable
private fun ShadowElevatedSurfacePreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.background.primary) {
            SatsSurface(
                Modifier
                    .padding(SatsTheme.spacing.m)
                    .aspectRatio(1920f / 1080)
                    .height(400.dp),
                elevation = 4.dp,
                useShadowElevation = true,
            ) {
                Text(
                    "Surface content",
                    Modifier
                        .fillMaxSize()
                        .wrapContentSize(),
                )
            }
        }
    }
}

@LightDarkPreview
@Composable
private fun TonalElevationSurfacePreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.background.primary) {
            SatsSurface(
                Modifier
                    .padding(SatsTheme.spacing.m)
                    .aspectRatio(1920f / 1080)
                    .height(400.dp),
                elevation = 4.dp,
                useShadowElevation = false,
            ) {
                Text(
                    "Surface content",
                    Modifier
                        .fillMaxSize()
                        .wrapContentSize(),
                )
            }
        }
    }
}
