package com.sats.dna.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.R
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsImagePlaceholderIcon(
    modifier: Modifier = Modifier,
    tint: Color = SatsTheme.colors.backgrounds.primary.default.fg,
) {
    Icon(
        imageVector = ImageVector.vectorResource(R.drawable.image_placeholder),
        contentDescription = null,
        modifier = modifier,
        tint = tint,
    )
}

@PreviewLightDark
@Composable
private fun SatsImagePlaceholderIconPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg, useMaterial3 = true) {
            Box(modifier = Modifier.padding(SatsTheme.spacing.m)) {
                SatsImagePlaceholderIcon()
            }
        }
    }
}
