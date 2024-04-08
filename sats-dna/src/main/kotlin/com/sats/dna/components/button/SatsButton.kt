package com.sats.dna.components.button

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewFontScale
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.tooling.preview.PreviewParameter
import com.sats.dna.components.SatsSurface
import com.sats.dna.components.button.internal.SatsBaseButtonLayout
import com.sats.dna.components.button.internal.SatsTextButtonContent
import com.sats.dna.components.button.internal.previewBackgroundColorFor
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsButton(
    onClick: () -> Unit,
    label: String,
    modifier: Modifier = Modifier,
    colors: SatsButtonColor = SatsButtonColor.Primary,
    size: SatsButtonSize = SatsButtonSize.Basic,
    isEnabled: Boolean = true,
    isLoading: Boolean = false,
    icon: ImageVector? = null,
) {
    SatsBaseButtonLayout(
        onClick = onClick,
        onClickLabel = null,
        modifier = modifier,
        color = colors,
        isEnabled = isEnabled,
        isLoading = isLoading,
    ) {
        SatsTextButtonContent(
            label = label,
            size = size,
            isLoading = isLoading,
            icon = icon,
        )
    }
}

@PreviewLightDark
@Composable
private fun SatsButtonColorPreview(@PreviewParameter(SatsButtonColorProvider::class) color: SatsButtonColor) {
    SatsTheme {
        SatsSurface(color = previewBackgroundColorFor(color), useMaterial3 = true) {
            Column(
                Modifier
                    .width(IntrinsicSize.Max)
                    .padding(SatsTheme.spacing.m),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                SatsButton(
                    onClick = {},
                    label = "${color.name} (Enabled)",
                    modifier = Modifier.fillMaxWidth(),
                    colors = color,
                )

                SatsButton(
                    onClick = {},
                    label = "${color.name} (Disabled)",
                    modifier = Modifier.fillMaxWidth(),
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
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg, useMaterial3 = true) {
            SatsButton(
                onClick = {},
                label = "Font scale: ${LocalConfiguration.current.fontScale}x",
                modifier = Modifier.padding(SatsTheme.spacing.s),
            )
        }
    }
}

@Preview("Sizes")
@Composable
private fun SatsButtonSizePreview(@PreviewParameter(SatsButtonSizeProvider::class) size: SatsButtonSize) {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors.backgrounds.primary.default.bg,
            useMaterial3 = true,
        ) {
            SatsButton(
                onClick = {},
                label = "Button Size: $size",
                modifier = Modifier.padding(SatsTheme.spacing.s),
                size = size,
            )
        }
    }
}
