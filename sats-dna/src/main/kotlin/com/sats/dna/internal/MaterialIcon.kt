package com.sats.dna.internal

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.LocalUseMaterial3
import com.sats.dna.SatsIcons
import com.sats.dna.components.SatsSurface
import com.sats.dna.icons.Barbell
import com.sats.dna.theme.SatsTheme
import androidx.compose.material.Icon as Material2Icon
import androidx.compose.material.LocalContentAlpha as Material2LocalContentAlpha
import androidx.compose.material.LocalContentColor as Material2LocalContentColor
import androidx.compose.material3.Icon as Material3Icon
import androidx.compose.material3.LocalContentColor as Material3LocalContentColor

@Composable
internal fun MaterialIcon(
    imageVector: ImageVector,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    tint: Color = materialIconTint(),
) {
    if (LocalUseMaterial3.current) {
        Material3Icon(imageVector, contentDescription, modifier, tint)
    } else {
        Material2Icon(imageVector, contentDescription, modifier, tint)
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

@PreviewLightDark
@Composable
private fun MaterialIconM2Preview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors2.backgrounds.primary.default.bg,
            useMaterial3 = false,
        ) {
            MaterialIcon(
                SatsIcons.Barbell,
                contentDescription = null,
                Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun MaterialIconM3Preview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors2.backgrounds.primary.default.bg,
            useMaterial3 = true,
        ) {
            MaterialIcon(
                SatsIcons.Barbell,
                contentDescription = null,
                Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}
