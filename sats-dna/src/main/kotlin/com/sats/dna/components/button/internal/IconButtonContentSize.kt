package com.sats.dna.components.button.internal

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sats.dna.components.button.SatsButtonSize

@Composable
internal fun iconButtonContentSize(size: SatsButtonSize) = animateDpAsState(
    when (size) {
        SatsButtonSize.Small -> 18.dp
        SatsButtonSize.Basic -> 22.dp
        SatsButtonSize.Large -> 24.dp
    },
    label = "Icon content size",
).value
