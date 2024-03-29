package com.sats.dna.icons

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import com.sats.dna.SatsIcons

@Composable
fun SatsIcons.fistbump(isLiked: Boolean): ImageVector {
    return if (isLiked) {
        FistbumpFilled
    } else {
        Fistbump
    }
}
