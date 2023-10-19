package com.sats.dna.internal

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.material.Icon as Material2Icon
import androidx.compose.material.LocalContentAlpha as Material2LocalContentAlpha
import androidx.compose.material.LocalContentColor as Material2LocalContentColor
import androidx.compose.material3.Icon as Material3Icon
import androidx.compose.material3.LocalContentColor as Material3LocalContentColor

@Composable
internal fun MaterialIcon(
    useMaterial3: Boolean,
    painter: Painter,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    tint: Color = materialIconTint(useMaterial3),
) {
    if (useMaterial3) {
        Material3Icon(painter, contentDescription, modifier, tint)
    } else {
        Material2Icon(painter, contentDescription, modifier, tint)
    }
}

@Composable
internal fun materialIconTint(useMaterial3: Boolean): Color {
    return if (useMaterial3) {
        Material3LocalContentColor.current
    } else {
        Material2LocalContentColor.current.copy(alpha = Material2LocalContentAlpha.current)
    }
}
