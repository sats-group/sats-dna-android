package com.sats.dna.components

import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsSurface(
    modifier: Modifier = Modifier,
    color: Color = SatsTheme.colors.surface.primary,
    contentColor: Color = SatsTheme.colors.onSurface.primary,
    shape: Shape = RectangleShape,
    elevation: Dp = 0.dp,
    content: @Composable () -> Unit,
) {
    Surface(
        modifier = modifier,
        shape = shape,
        color = color,
        contentColor = contentColor,
        elevation = elevation,
        content = content,
    )
}
