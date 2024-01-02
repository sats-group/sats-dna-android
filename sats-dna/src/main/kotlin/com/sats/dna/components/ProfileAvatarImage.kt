package com.sats.dna.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.sats.dna.R
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

@Composable
fun ProfileAvatarImage(
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
fun ProfileAvatarImagePlaceholder(modifier: Modifier = Modifier) {
    PlaceholderBox(modifier.clip(SatsTheme.shapes.circle))
}

@LightDarkPreview
@Composable
private fun ProfileAvatarImagePreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            ProfileAvatarImage(
                imageUrl = null,
                Modifier
                    .padding(SatsTheme.spacing.m)
                    .size(56.dp),
            )
        }
    }
}

@LightDarkPreview
@Composable
private fun ProfileAvatarImagePlaceholderPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            ProfileAvatarImagePlaceholder(
                Modifier
                    .padding(SatsTheme.spacing.m)
                    .size(56.dp),
            )
        }
    }
}
