package com.sats.dna.components

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.sats.dna.R
import com.sats.dna.internal.MaterialIcon
import com.sats.dna.internal.materialIconTint
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

@Composable
fun BrandLogo(
    brand: Brand,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    isFullName: Boolean = false,
    useMaterial3: Boolean = false,
    tint: Color = materialIconTint(useMaterial3),
) {
    val painter = if (isFullName) brand.fullNameIconPainter() else brand.letterIconPainter()

    MaterialIcon(
        useMaterial3 = useMaterial3,
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

@LightDarkPreview
@Composable
private fun ElixiaLetterPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.background.primary, useMaterial3 = true) {
            BrandLogo(
                brand = Brand.Elixia,
                contentDescription = null,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

@LightDarkPreview
@Composable
private fun ElixiaFullPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.background.primary, useMaterial3 = true) {
            BrandLogo(
                brand = Brand.Elixia,
                contentDescription = null,
                isFullName = true,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

@LightDarkPreview
@Composable
private fun SatsLetterPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.background.primary, useMaterial3 = true) {
            BrandLogo(
                brand = Brand.Sats,
                contentDescription = null,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

@LightDarkPreview
@Composable
private fun SatsFullPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.background.primary, useMaterial3 = true) {
            BrandLogo(
                brand = Brand.Sats,
                contentDescription = null,
                isFullName = true,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}
