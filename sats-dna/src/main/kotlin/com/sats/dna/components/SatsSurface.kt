package com.sats.dna.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sats.dna.LocalUseMaterial3
import com.sats.dna.colors.satsContentColor2For
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsSurface(
    modifier: Modifier = Modifier,
    color: Color = SatsTheme.colors.surfaces.primary.default.bg,
    contentColor: Color = satsContentColor2For(color),
    shape: Shape = RectangleShape,
    border: BorderStroke? = null,
    elevation: Dp = 0.dp,
    useMaterial3: Boolean = LocalUseMaterial3.current,
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(LocalUseMaterial3 provides useMaterial3) {
        Surface(
            modifier = modifier,
            shape = shape,
            color = color,
            contentColor = contentColor,
            shadowElevation = elevation,
            border = border,
            content = content,
        )
    }
}
