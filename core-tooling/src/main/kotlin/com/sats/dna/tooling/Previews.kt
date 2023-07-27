package com.sats.dna.tooling

import android.content.res.Configuration
import androidx.compose.ui.tooling.preview.Preview

@Preview("Light Mode", group = "Theme", uiMode = Configuration.UI_MODE_NIGHT_NO)
@Preview("Dark Mode", group = "Theme", uiMode = Configuration.UI_MODE_NIGHT_YES)
annotation class LightDarkPreview

@Preview("Small Font Size", group = "Font Sizes", fontScale = 0.75f)
@Preview("Large Font Size", group = "Font Sizes", fontScale = 1.50f)
annotation class FontSizePreview
