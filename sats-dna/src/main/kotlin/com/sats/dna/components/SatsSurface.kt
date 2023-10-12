package com.sats.dna.components

import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sats.dna.colors.satsContentColorFor
import com.sats.dna.theme.SatsTheme
import androidx.compose.material3.Surface as Material3Surface

@Composable
fun SatsSurface(
    modifier: Modifier = Modifier,
    color: Color = SatsTheme.colors.surface.primary,
    contentColor: Color = satsContentColorFor(color),
    shape: Shape = RectangleShape,
    elevation: Dp = 0.dp,
    useMaterial3: Boolean = false,
    content: @Composable () -> Unit,
) {
    if (useMaterial3) {
        Material3Surface(
            modifier = modifier,
            shape = shape,
            color = color,
            contentColor = contentColor,
            shadowElevation = elevation,
            content = content,
        )
    } else {
        Surface(
            modifier = modifier,
            shape = shape,
            color = color,
            contentColor = contentColor,
            elevation = elevation,
            content = content,
        )
    }
}
