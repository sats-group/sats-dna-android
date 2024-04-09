package com.sats.dna.components.button.internal

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sats.dna.components.button.SatsButtonSize
import com.sats.dna.theme.SatsTheme

@Composable
internal fun Modifier.iconButtonPadding(size: SatsButtonSize): Modifier {
    val padding = animateDpAsState(
        when (size) {
            SatsButtonSize.Small -> SatsTheme.spacing.xs
            SatsButtonSize.Basic -> SatsTheme.spacing.xs
            SatsButtonSize.Large -> SatsTheme.spacing.s
        },
        label = "Icon button padding",
    )

    return this.padding(PaddingValues(padding.value))
}
