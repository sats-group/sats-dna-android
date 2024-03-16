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
fun SatsBrandLogo(
    brand: SatsBrandLogoBrand,
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

enum class SatsBrandLogoBrand {
    Sats,
    Elixia,
}

@Composable
private fun SatsBrandLogoBrand.letterIconPainter() = when (this) {
    SatsBrandLogoBrand.Sats -> painterResource(R.drawable.ic_letter_s)
    SatsBrandLogoBrand.Elixia -> painterResource(R.drawable.ic_letter_e)
}

@Composable
private fun SatsBrandLogoBrand.fullNameIconPainter() = when (this) {
    SatsBrandLogoBrand.Sats -> painterResource(R.drawable.ic_sats)
    SatsBrandLogoBrand.Elixia -> painterResource(R.drawable.ic_elixia)
}

@PreviewLightDark
@Composable
private fun SatsBrandLogoElixiaLetterPreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors2.backgrounds2.primary.default.bg,
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
            color = SatsTheme.colors2.backgrounds2.primary.default.bg,
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
            color = SatsTheme.colors2.backgrounds2.primary.default.bg,
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
            color = SatsTheme.colors2.backgrounds2.primary.default.bg,
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
