package com.sats.dna.components.button

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.tooling.preview.PreviewParameter
import com.sats.dna.components.SatsSurface
import com.sats.dna.theme.SatsTheme

@Deprecated("Replace with either SatsIconButton2 or SatsTopAppBarIconButton")
@Composable
fun SatsIconButton(
    onClick: () -> Unit,
    icon: Painter,
    onClickLabel: String?,
    modifier: Modifier = Modifier,
    colors: SatsButtonColor = SatsButtonColor.Primary,
    isEnabled: Boolean = true,
    isLoading: Boolean = false,
    isLarge: Boolean = false,
) {
    SatsIconButton2(
        onClick = onClick,
        icon = icon,
        onClickLabel = onClickLabel,
        modifier = modifier,
        colors = colors,
        isEnabled = isEnabled,
        isLoading = isLoading,
        size = if (isLarge) SatsButtonSize.Large else SatsButtonSize.Basic,
    )
}

@PreviewLightDark
@Composable
private fun SatsIconButtonPreview(@PreviewParameter(SatsButtonColorProvider::class) color: SatsButtonColor) {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            SatsIconButton(
                onClick = {},
                icon = SatsTheme.icons.barbell,
                onClickLabel = null,
                modifier = Modifier.padding(SatsTheme.spacing.s),
                colors = color,
            )
        }
    }
}
