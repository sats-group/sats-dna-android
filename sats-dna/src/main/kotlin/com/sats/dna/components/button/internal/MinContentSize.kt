package com.sats.dna.components.button.internal

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sats.dna.components.button.SatsButtonSize

@Composable
internal fun Modifier.minSatsButtonSize(size: SatsButtonSize): Modifier {
    val minDpSize = animateDpAsState(
        when (size) {
            SatsButtonSize.Small -> 16.dp
            SatsButtonSize.Basic -> 24.dp
            SatsButtonSize.Large -> 24.dp
        },
        label = "Minimum content size",
    ).value

    return this.sizeIn(minWidth = minDpSize, minHeight = minDpSize)
}
