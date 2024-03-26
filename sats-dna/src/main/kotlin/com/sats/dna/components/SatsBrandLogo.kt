package com.sats.dna.components

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.R
import com.sats.dna.SatsIcons
import com.sats.dna.icons.Elixia
import com.sats.dna.icons.Sats
import com.sats.dna.internal.MaterialIcon
import com.sats.dna.internal.materialIconTint
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsBrandLogo(
    brand: SatsBrandLogoBrand,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    isFullName: Boolean = false,
    tint: Color = materialIconTint(),
) {
    val imageVector = if (isFullName) brand.fullNameIconPainter() else brand.letterIconPainter()

    MaterialIcon(
        imageVector = imageVector,
        contentDescription = contentDescription,
        modifier = modifier,
        tint = tint,
    )
}

enum class SatsBrandLogoBrand {
    Sats,
    Elixia,
}

@Composable
private fun SatsBrandLogoBrand.letterIconPainter() = when (this) {
    SatsBrandLogoBrand.Sats -> SatsIcons.Sats
    SatsBrandLogoBrand.Elixia -> SatsIcons.Elixia
}

@Composable
private fun SatsBrandLogoBrand.fullNameIconPainter() = when (this) {
    SatsBrandLogoBrand.Sats -> ImageVector.vectorResource(R.drawable.brand_logo_full_sats)
    SatsBrandLogoBrand.Elixia -> ImageVector.vectorResource(R.drawable.brand_logo_full_elixia)
}

@PreviewLightDark
@Composable
private fun SatsBrandLogoElixiaLetterPreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors2.backgrounds.primary.default.bg,
            useMaterial3 = true,
        ) {
            SatsBrandLogo(
                brand = SatsBrandLogoBrand.Elixia,
                contentDescription = null,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsBrandLogoElixiaFullPreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors2.backgrounds.primary.default.bg,
            useMaterial3 = true,
        ) {
            SatsBrandLogo(
                brand = SatsBrandLogoBrand.Elixia,
                contentDescription = null,
                isFullName = true,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsBrandLogoSatsLetterPreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors2.backgrounds.primary.default.bg,
            useMaterial3 = true,
        ) {
            SatsBrandLogo(
                brand = SatsBrandLogoBrand.Sats,
                contentDescription = null,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsBrandLogoSatsFullPreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors2.backgrounds.primary.default.bg,
            useMaterial3 = true,
        ) {
            SatsBrandLogo(
                brand = SatsBrandLogoBrand.Sats,
                contentDescription = null,
                isFullName = true,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}
