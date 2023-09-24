package com.sats.dna.tooling

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.sats.dna.R

@Composable
internal fun PreviewImagePlaceholder(modifier: Modifier = Modifier) {
    Image(
        painterResource(R.drawable.debug_img_placeholder),
        contentDescription = null,
        modifier = modifier,
        contentScale = ContentScale.Crop,
    )
}
