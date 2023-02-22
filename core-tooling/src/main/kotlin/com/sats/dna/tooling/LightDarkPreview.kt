package com.sats.dna.tooling

import android.content.res.Configuration
import androidx.compose.ui.tooling.preview.Preview

@Preview("Light Mode", uiMode = Configuration.UI_MODE_NIGHT_NO)
@Preview("Dark Mode", uiMode = Configuration.UI_MODE_NIGHT_YES)
annotation class LightDarkPreview
