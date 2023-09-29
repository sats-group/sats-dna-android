package com.sats.dna.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.SubcomposeAsyncImage
import com.sats.dna.R
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

@Composable
fun SatsChallengeBadge(imageUrl: String?, contentDescription: String?, modifier: Modifier = Modifier) {
    SubcomposeAsyncImage(
        imageUrl,
        contentDescription,
        modifier
            .aspectRatio(1f)
            .clip(SatsTheme.shapes.circle),
        contentScale = ContentScale.Crop,
        loading = { LoadingPlaceholder(Modifier.fillMaxSize()) },
        error = { ErrorFallback(contentDescription, Modifier.fillMaxSize()) },
    )
}

@Composable
private fun LoadingPlaceholder(modifier: Modifier = Modifier) {
    PlaceholderBox(modifier)
}

@Composable
private fun ErrorFallback(contentDescription: String?, modifier: Modifier = Modifier) {
    Image(painterResource(R.drawable.placeholder_challenges), contentDescription, modifier)
}

@LightDarkPreview
@Composable
private fun PlaceholderPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.background.primary) {
            SatsChallengeBadge(
                imageUrl = null,
                contentDescription = null,
                Modifier
                    .size(128.dp)
                    .padding(SatsTheme.spacing.m),
            )
        }
    }
}
