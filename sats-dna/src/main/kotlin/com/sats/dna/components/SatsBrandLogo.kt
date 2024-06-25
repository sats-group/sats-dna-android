package com.sats.dna.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.CompositingStrategy
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.R
import com.sats.dna.SatsIcons
import com.sats.dna.icons.Elixia
import com.sats.dna.icons.Sats
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsBrandLogo(
    brand: SatsBrandLogoBrand,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    isFullName: Boolean = false,
    isPride: Boolean = false,
    tint: Color = LocalContentColor.current,
) {
    val imageVector = if (isFullName) brand.fullNameIconPainter() else brand.letterIconPainter()

    Icon(
        imageVector = imageVector,
        contentDescription = contentDescription,
        modifier = modifier
            .graphicsLayer(compositingStrategy = CompositingStrategy.Offscreen)
            .drawWithCache {
                val brush: Brush = if (isPride) {
                    Brush.linearGradient(
                        colors = listOf(
                            Color(0xFFBF3C23),
                            Color(0xFFF99826),
                            Color(0xFFFFE141),
                            Color(0xFF3D6B19),
                            Color(0xFF2E2BBE),
                            Color(0xFF9121AD),
                        ),
                    )
                } else {
                    SolidColor(tint)
                }

                onDrawWithContent {
                    drawContent()
                    drawRect(brush, blendMode = BlendMode.SrcAtop)
                }
            },
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
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
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
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
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
private fun SatsBrandLogoElixiaFullPridePreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            SatsBrandLogo(
                brand = SatsBrandLogoBrand.Elixia,
                contentDescription = null,
                isFullName = true,
                isPride = true,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsBrandLogoSatsLetterPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
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
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            SatsBrandLogo(
                brand = SatsBrandLogoBrand.Sats,
                contentDescription = null,
                isFullName = true,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsBrandLogoSatsFullPridePreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            SatsBrandLogo(
                brand = SatsBrandLogoBrand.Sats,
                contentDescription = null,
                isFullName = true,
                isPride = true,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}
