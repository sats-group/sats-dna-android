package com.sats.dna.components.button

import androidx.compose.ui.graphics.painter.Painter

internal sealed interface SatsButtonIconContent {
    data class Icon(val painter: Painter) : SatsButtonIconContent
    data object Loading : SatsButtonIconContent
    data object Empty : SatsButtonIconContent
}
