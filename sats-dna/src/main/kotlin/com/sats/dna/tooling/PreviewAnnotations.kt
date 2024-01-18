package com.sats.dna.tooling

import android.content.res.Configuration
import androidx.compose.ui.tooling.preview.Preview

@Preview("Light Mode", group = "Theme", uiMode = Configuration.UI_MODE_NIGHT_NO)
@Preview("Dark Mode", group = "Theme", uiMode = Configuration.UI_MODE_NIGHT_YES)
annotation class LightDarkPreview

@Preview("Small Font Size (0.75x)", group = "Font Sizes", fontScale = 0.75f)
@Preview("Large Font Size (1.50x)", group = "Font Sizes", fontScale = 1.5f)
@Preview("Huge Font Size (2.0x)", group = "Font Sizes", fontScale = 2f)
annotation class FontSizePreview
