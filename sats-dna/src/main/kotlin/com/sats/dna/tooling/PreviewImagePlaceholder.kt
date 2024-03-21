package com.sats.dna.tooling

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.vectorResource
import com.sats.dna.R

@Composable
internal fun PreviewImagePlaceholder(modifier: Modifier = Modifier) {
    Image(
        ImageVector.vectorResource(R.drawable.debug_img_placeholder),
        contentDescription = null,
        modifier = modifier,
        contentScale = ContentScale.Crop,
    )
}
