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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import coil.compose.SubcomposeAsyncImage
import com.sats.dna.R
import com.sats.dna.theme.SatsTheme

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
                color = SatsTheme.colors.graphicalElements.progressBar.indicatorDefault.fg,
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
    SatsPlaceholderBox(modifier)
}

@Composable
private fun ErrorFallback(contentDescription: String?, modifier: Modifier = Modifier) {
    Image(ImageVector.vectorResource(R.drawable.placeholder_challenges), contentDescription, modifier)
}

@PreviewLightDark
@Composable
private fun SatsChallengeBadgePreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
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

@PreviewLightDark
@Composable
private fun SatsChallengeBadgeProgressPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
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
