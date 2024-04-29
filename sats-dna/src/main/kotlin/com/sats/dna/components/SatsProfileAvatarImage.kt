package com.sats.dna.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import coil.compose.SubcomposeAsyncImage
import com.sats.dna.SatsIcons
import com.sats.dna.icons.Profilefilled
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsProfileAvatarImage(
    imageUrl: String?,
    modifier: Modifier = Modifier,
    contentDescription: String? = null,
    onClick: (() -> Unit)? = null,
) {
    val clickable = if (onClick != null) Modifier.clickable(onClick = onClick) else Modifier

    SubcomposeAsyncImage(
        modifier = modifier
            .clip(SatsTheme.shapes.circle)
            .then(clickable),
        model = imageUrl,
        loading = { SatsProfileAvatarImagePlaceholder(Modifier.fillMaxSize()) },
        error = { SatsProfileAvatarImageFallback(Modifier.fillMaxSize()) },
        contentDescription = contentDescription,
        contentScale = ContentScale.Crop,
    )
}

@Composable
fun SatsProfileAvatarImagePlaceholder(modifier: Modifier = Modifier) {
    SatsPlaceholderBox(modifier.clip(SatsTheme.shapes.circle))
}

@Composable
private fun SatsProfileAvatarImageFallback(modifier: Modifier = Modifier) {
    Icon(
        imageVector = SatsIcons.Profilefilled,
        contentDescription = null,
        tint = SatsTheme.colors.graphicalElements.icons.secondary,
        modifier = modifier,
    )
}

@PreviewLightDark
@Composable
private fun ProfileAvatarImagePlaceholderPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            SatsProfileAvatarImagePlaceholder(Modifier.size(96.dp))
        }
    }
}

@PreviewLightDark
@Composable
private fun ProfileAvatarImageFallbackPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            SatsProfileAvatarImageFallback(Modifier.size(96.dp))
        }
    }
}
