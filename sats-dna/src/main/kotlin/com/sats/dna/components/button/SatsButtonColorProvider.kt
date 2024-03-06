package com.sats.dna.components.button

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

internal class SatsButtonColorProvider : PreviewParameterProvider<SatsButtonColor> {
    override val values = SatsButtonColor.entries.asSequence()
}
