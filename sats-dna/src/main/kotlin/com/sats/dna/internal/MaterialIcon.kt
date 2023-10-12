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
    fistBump: Painter,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    tint: Color = if (useMaterial3) {
        Material2LocalContentColor.current.copy(alpha = Material2LocalContentAlpha.current)
    } else {
        Material3LocalContentColor.current
    },
) {
    if (useMaterial3) {
        Material2Icon(fistBump, contentDescription, modifier, tint)
    } else {
        Material3Icon(fistBump, contentDescription, modifier, tint)
    }
}
