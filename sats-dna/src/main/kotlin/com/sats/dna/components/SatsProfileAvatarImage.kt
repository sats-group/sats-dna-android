package com.sats.dna.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.sats.dna.R
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsProfileAvatarImage(
    imageUrl: String?,
    modifier: Modifier = Modifier,
    contentDescription: String? = null,
    onClick: (() -> Unit)? = null,
) {
    val clipped = modifier.clip(SatsTheme.shapes.circle)

    AsyncImage(
        modifier = if (onClick != null) clipped.clickable(onClick = onClick) else clipped,
        model = imageUrl,
        placeholder = painterResource(R.drawable.placeholder_profile_picture),
        error = painterResource(R.drawable.placeholder_profile_picture),
        contentDescription = contentDescription,
        contentScale = ContentScale.Crop,
    )
}

@Composable
fun SatsProfileAvatarImagePlaceholder(modifier: Modifier = Modifier) {
    SatsPlaceholderBox(modifier.clip(SatsTheme.shapes.circle))
}

@PreviewLightDark
@Composable
private fun SatsProfileAvatarImagePreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            SatsProfileAvatarImage(
                imageUrl = null,
                Modifier
                    .padding(SatsTheme.spacing.m)
                    .size(56.dp),
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsProfileAvatarImagePlaceholderPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            SatsProfileAvatarImagePlaceholder(
                Modifier
                    .padding(SatsTheme.spacing.m)
                    .size(56.dp),
            )
        }
    }
}
