package com.sats.dna.internal

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import com.sats.dna.components.LocalUseMaterial3
import com.sats.dna.components.SatsSurface
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview
import androidx.compose.material.Icon as Material2Icon
import androidx.compose.material.LocalContentAlpha as Material2LocalContentAlpha
import androidx.compose.material.LocalContentColor as Material2LocalContentColor
import androidx.compose.material3.Icon as Material3Icon
import androidx.compose.material3.LocalContentColor as Material3LocalContentColor

@Composable
internal fun MaterialIcon(
    painter: Painter,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    tint: Color = materialIconTint(),
) {
    if (LocalUseMaterial3.current) {
        Material3Icon(painter, contentDescription, modifier, tint)
    } else {
        Material2Icon(painter, contentDescription, modifier, tint)
    }
}

@Composable
internal fun materialIconTint(): Color {
    return if (LocalUseMaterial3.current) {
        Material3LocalContentColor.current
    } else {
        Material2LocalContentColor.current.copy(alpha = Material2LocalContentAlpha.current)
    }
}

@LightDarkPreview
@Composable
private fun M2Preview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.background.primary, useMaterial3 = false) {
            MaterialIcon(SatsTheme.icons.barbell, contentDescription = null, Modifier.padding(SatsTheme.spacing.m))
        }
    }
}

@LightDarkPreview
@Composable
private fun M3Preview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.background.primary, useMaterial3 = true) {
            MaterialIcon(SatsTheme.icons.barbell, contentDescription = null, Modifier.padding(SatsTheme.spacing.m))
        }
    }
}
