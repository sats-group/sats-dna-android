package com.sats.dna.components

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.R
import com.sats.dna.internal.MaterialIcon
import com.sats.dna.internal.materialIconTint
import com.sats.dna.theme.SatsTheme

@Composable
fun BrandLogo(
    brand: Brand,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    isFullName: Boolean = false,
    tint: Color = materialIconTint(),
) {
    val painter = if (isFullName) brand.fullNameIconPainter() else brand.letterIconPainter()

    MaterialIcon(
        painter = painter,
        contentDescription = contentDescription,
        modifier = modifier,
        tint = tint,
    )
}

enum class Brand {
    Sats,
    Elixia,
}

@Composable
private fun Brand.letterIconPainter() = when (this) {
    Brand.Sats -> painterResource(R.drawable.ic_letter_s)
    Brand.Elixia -> painterResource(R.drawable.ic_letter_e)
}

@Composable
private fun Brand.fullNameIconPainter() = when (this) {
    Brand.Sats -> painterResource(R.drawable.ic_sats)
    Brand.Elixia -> painterResource(R.drawable.ic_elixia)
}

@PreviewLightDark
@Composable
private fun ElixiaLetterPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            BrandLogo(
                brand = Brand.Elixia,
                contentDescription = null,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun ElixiaFullPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            BrandLogo(
                brand = Brand.Elixia,
                contentDescription = null,
                isFullName = true,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsLetterPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            BrandLogo(
                brand = Brand.Sats,
                contentDescription = null,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsFullPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            BrandLogo(
                brand = Brand.Sats,
                contentDescription = null,
                isFullName = true,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}
