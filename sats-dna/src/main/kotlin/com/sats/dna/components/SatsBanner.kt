package com.sats.dna.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.sats.dna.components.button.SatsButton
import com.sats.dna.components.button.SatsButtonColor
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

@Composable
fun SatsBanner(
    title: String,
    modifier: Modifier = Modifier,
    action: @Composable (() -> Unit)? = null,
    backgroundColor: Color = SatsTheme.colors.primary.default,
    contentColor: Color = SatsTheme.colors.onPrimary.default,
) {
    SatsSurface(
        modifier = modifier,
        color = backgroundColor,
        contentColor = contentColor,
    ) {
        Row(
            Modifier.padding(horizontal = SatsTheme.spacing.m, vertical = SatsTheme.spacing.xs),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
        ) {
            Text(
                text = title,
                modifier = Modifier.weight(1f),
                color = SatsTheme.colors.onPrimary.default,
            )

            action?.invoke()
        }
    }
}

@LightDarkPreview
@Composable
private fun SatsBannerPreview() {
    SatsTheme {
        SatsBanner(
            modifier = Modifier.fillMaxWidth(),
            title = "Will the real Slim Shady please stand up?",
        )
    }
}

@LightDarkPreview
@Composable
private fun SatsBannerWithActionPreview() {
    SatsTheme {
        SatsBanner(
            modifier = Modifier.fillMaxWidth(),
            title = "Will the real Slim Shady please stand up?",
            action = { SatsButton(onClick = {}, "Stand up", colors = SatsButtonColor.Clean) },
        )
    }
}