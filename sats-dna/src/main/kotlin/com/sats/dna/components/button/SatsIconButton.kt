package com.sats.dna.components.button

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.tooling.preview.PreviewParameter
import com.sats.dna.SatsIcons
import com.sats.dna.components.SatsSurface
import com.sats.dna.components.button.internal.SatsBaseButtonLayout
import com.sats.dna.components.button.internal.SatsIconButtonContent
import com.sats.dna.components.button.internal.previewBackgroundColorFor
import com.sats.dna.icons.Barbell
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsIconButton(
    onClick: () -> Unit,
    icon: ImageVector,
    onClickLabel: String?,
    modifier: Modifier = Modifier,
    colors: SatsButtonColor = SatsButtonColor.Primary,
    size: SatsButtonSize = SatsButtonSize.Basic,
    isEnabled: Boolean = true,
    isLoading: Boolean = false,
) {
    SatsBaseButtonLayout(
        onClick = onClick,
        onClickLabel = onClickLabel,
        modifier = modifier,
        color = colors,
        isEnabled = isEnabled,
        isLoading = isLoading,
    ) {
        SatsIconButtonContent(
            size = size,
            isLoading = isLoading,
            icon = icon,
            modifier = modifier,
        )
    }
}

@PreviewLightDark
@Composable
private fun SatsIconButtonColorPreview(@PreviewParameter(SatsButtonColorProvider::class) color: SatsButtonColor) {
    SatsTheme {
        SatsSurface(
            color = previewBackgroundColorFor(color),
            useMaterial3 = true,
        ) {
            Row {
                SatsIconButton(
                    onClick = {},
                    icon = SatsIcons.Barbell,
                    onClickLabel = null,
                    modifier = Modifier.padding(SatsTheme.spacing.s),
                    colors = color,
                )

                SatsIconButton(
                    onClick = {},
                    icon = SatsIcons.Barbell,
                    onClickLabel = null,
                    modifier = Modifier.padding(SatsTheme.spacing.s),
                    colors = color,
                    isEnabled = false,
                )
            }
        }
    }
}

@Preview("Sizes")
@Composable
private fun SatsIconButtonSizePreview(@PreviewParameter(SatsButtonSizeProvider::class) size: SatsButtonSize) {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg, useMaterial3 = true) {
            SatsIconButton(
                onClick = {},
                icon = SatsIcons.Barbell,
                onClickLabel = null,
                modifier = Modifier.padding(SatsTheme.spacing.s),
                size = size,
            )
        }
    }
}
