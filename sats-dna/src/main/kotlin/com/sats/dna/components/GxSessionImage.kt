package com.sats.dna.components

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import coil.compose.AsyncImage
import com.sats.dna.R
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

@Composable
fun GxSessionImage(
    imageUrl: String?,
    modifier: Modifier = Modifier,
    contentDescription: String? = null,
) {
    AsyncImage(
        modifier = modifier,
        model = imageUrl,
        placeholder = painterResource(R.drawable.placeholder_gx),
        error = painterResource(R.drawable.placeholder_gx),
        contentDescription = contentDescription,
        contentScale = ContentScale.Crop,
    )
}

@LightDarkPreview
@Composable
private fun GxSessionImagePreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            GxSessionImage(imageUrl = null, Modifier.padding(SatsTheme.spacing.m))
        }
    }
}
