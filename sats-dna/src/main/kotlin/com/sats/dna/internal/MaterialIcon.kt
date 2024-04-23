package com.sats.dna.internal

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.SatsIcons
import com.sats.dna.components.SatsSurface
import com.sats.dna.icons.Barbell
import com.sats.dna.theme.SatsTheme

@Composable
internal fun MaterialIcon(
    imageVector: ImageVector,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    tint: Color = materialIconTint(),
) {
    Icon(imageVector, contentDescription, modifier, tint)
}

@Composable
internal fun materialIconTint(): Color {
    return LocalContentColor.current
}

@PreviewLightDark
@Composable
private fun MaterialIconM2Preview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors.backgrounds.primary.default.bg,
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
            color = SatsTheme.colors.backgrounds.primary.default.bg,
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
