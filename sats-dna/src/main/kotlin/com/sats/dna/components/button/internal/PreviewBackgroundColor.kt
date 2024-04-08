package com.sats.dna.components.button.internal

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.sats.dna.components.button.SatsButtonColor
import com.sats.dna.theme.SatsTheme

@Composable
internal fun previewBackgroundColorFor(color: SatsButtonColor): Color {
    return if (color == SatsButtonColor.Clean || color == SatsButtonColor.CleanSecondary) {
        SatsTheme.colors.backgrounds.fixed.primary.default.bg
    } else {
        SatsTheme.colors.backgrounds.primary.default.bg
    }
}
