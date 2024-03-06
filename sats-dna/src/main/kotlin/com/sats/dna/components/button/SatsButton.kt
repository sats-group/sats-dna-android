package com.sats.dna.components.button

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.PreviewFontScale
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.tooling.preview.PreviewParameter
import com.sats.dna.components.SatsSurface
import com.sats.dna.theme.SatsTheme

@Deprecated("Replace with SatsButton2")
@Composable
fun SatsButton(
    onClick: () -> Unit,
    label: String,
    modifier: Modifier = Modifier,
    colors: SatsButtonColor = SatsButtonColor.Primary,
    isEnabled: Boolean = true,
    isLoading: Boolean = false,
    isLarge: Boolean = false,
    icon: Painter? = null,
) {
    SatsButton2(
        onClick = onClick,
        label = label,
        modifier = modifier,
        colors = colors,
        isEnabled = isEnabled,
        isLoading = isLoading,
        size = if (isLarge) SatsButtonSize.Large else SatsButtonSize.Basic,
        icon = icon,
    )
}

@PreviewLightDark
@Composable
private fun SatsButtonPreview(@PreviewParameter(SatsButtonColorProvider::class) color: SatsButtonColor) {
    SatsTheme {
        val backgroundColor = when (color) {
            SatsButtonColor.Clean -> SatsTheme.colors2.backgrounds.fixed.primary.bg.default
            SatsButtonColor.CleanSecondary -> SatsTheme.colors2.backgrounds.fixed.primary.bg.default
            else -> SatsTheme.colors2.backgrounds.primary.bg.default
        }

        SatsSurface(color = backgroundColor, useMaterial3 = true) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                SatsButton(onClick = {}, color.name, Modifier.padding(SatsTheme.spacing.s), color)
                SatsButton(
                    onClick = {},
                    label = "${color.name} disabled",
                    modifier = Modifier.padding(SatsTheme.spacing.s),
                    colors = color,
                    isEnabled = false,
                )
            }
        }
    }
}

@PreviewFontScale
@Composable
private fun SatsButtonFontScalePreview() {
    SatsTheme {
        SatsSurface(
            modifier = Modifier.fillMaxWidth(),
            color = SatsTheme.colors2.backgrounds.primary.bg.default,
            useMaterial3 = true,
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                SatsButton(
                    onClick = {},
                    label = "${LocalConfiguration.current.fontScale}x",
                    modifier = Modifier.padding(SatsTheme.spacing.s),
                    colors = SatsButtonColor.Primary,
                )
            }
        }
    }
}
