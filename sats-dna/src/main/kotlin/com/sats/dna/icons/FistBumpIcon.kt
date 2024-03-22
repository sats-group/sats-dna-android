package com.sats.dna.icons

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun SatsIcons.fistbump(isLiked: Boolean): ImageVector {
    return if (isLiked) {
        fistbumpFilled
    } else {
        fistbump
    }
}
