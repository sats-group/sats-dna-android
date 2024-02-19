package com.sats.dna.tooling

import androidx.compose.ui.tooling.preview.PreviewFontScale
import androidx.compose.ui.tooling.preview.PreviewLightDark

@Deprecated(
    message = "Use `PreviewLightDark` from androidx.compose.ui.tooling instead.",
    replaceWith = ReplaceWith("androidx.compose.ui.tooling.preview.PreviewLightDark"),
)
typealias LightDarkPreview = PreviewLightDark

@Deprecated(
    message = "Use `PreviewFontScale` from androidx.compose.ui.tooling instead.",
    replaceWith = ReplaceWith("androidx.compose.ui.tooling.preview.PreviewFontScale"),
)
typealias FontSizePreview = PreviewFontScale
