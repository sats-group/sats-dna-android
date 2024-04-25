package com.sats.dna.components

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.PreviewLightDark
import coil.compose.AsyncImage
import com.sats.dna.R
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsGxSessionImage(
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

@PreviewLightDark
@Composable
private fun SatsGxSessionImagePreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            SatsGxSessionImage(imageUrl = null, Modifier.padding(SatsTheme.spacing.m))
        }
    }
}
