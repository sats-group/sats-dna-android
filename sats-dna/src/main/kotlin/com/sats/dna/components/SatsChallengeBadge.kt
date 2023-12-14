package com.sats.dna.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
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
fun SatsChallengeBadge(
    imageUrl: String?,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    progress: Float? = null,
) {
    Box(modifier) {
        if (progress != null) {
            SatsCircularProgressIndicator(
                modifier = Modifier.fillMaxSize(),
                progress = progress,
                strokeWidth = 2.dp,
                color = SatsTheme.colors2.graphicalElements.progressBar.indicator,
            )
        }

        SubcomposeAsyncImage(
            imageUrl,
            contentDescription,
            Modifier
                .fillMaxSize()
                .padding(if (progress != null) 4.dp else 0.dp)
                .aspectRatio(1f)
                .clip(SatsTheme.shapes.circle),
            contentScale = ContentScale.Crop,
            loading = { LoadingPlaceholder(Modifier.fillMaxSize()) },
            error = { ErrorFallback(contentDescription, Modifier.fillMaxSize()) },
        )
    }
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
private fun Preview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default) {
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

@LightDarkPreview
@Composable
private fun ProgressPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default) {
            SatsChallengeBadge(
                imageUrl = null,
                contentDescription = null,
                Modifier
                    .size(128.dp)
                    .padding(SatsTheme.spacing.m),
                progress = .75f,
            )
        }
    }
}
