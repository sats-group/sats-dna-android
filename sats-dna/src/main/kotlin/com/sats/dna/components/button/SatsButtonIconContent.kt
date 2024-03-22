package com.sats.dna.components.button

import androidx.compose.ui.graphics.vector.ImageVector

internal sealed interface SatsButtonIconContent {
    data class Icon(val painter: ImageVector) : SatsButtonIconContent
    data object Loading : SatsButtonIconContent
    data object Empty : SatsButtonIconContent
}
