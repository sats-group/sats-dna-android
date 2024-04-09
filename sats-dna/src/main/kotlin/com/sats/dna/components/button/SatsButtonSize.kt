package com.sats.dna.components.button

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

enum class SatsButtonSize {
    Small, Basic, Large,
}

internal class SatsButtonSizeProvider : PreviewParameterProvider<SatsButtonSize> {
    override val values = SatsButtonSize.entries.asSequence()
}
