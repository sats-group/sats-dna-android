package com.sats.dna.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.sats.dna.colors.satsContentColorFor
import com.sats.dna.components.button.SatsButton
import com.sats.dna.components.button.SatsButtonColor
import com.sats.dna.internal.MaterialText
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

@Composable
fun SatsBanner(
    title: String,
    modifier: Modifier = Modifier,
    action: @Composable (() -> Unit)? = null,
    backgroundColor: Color = SatsTheme.colors.primary.default,
    contentColor: Color = satsContentColorFor(backgroundColor),
    useMaterial3: Boolean = false,
) {
    SatsSurface(
        modifier = modifier,
        color = backgroundColor,
        contentColor = contentColor,
        useMaterial3 = useMaterial3,
    ) {
        Row(
            Modifier.padding(horizontal = SatsTheme.spacing.m, vertical = SatsTheme.spacing.xs),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
        ) {
            MaterialText(
                useMaterial3 = useMaterial3,
                text = title,
                modifier = Modifier.weight(1f),
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
            useMaterial3 = true,
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
            useMaterial3 = true,
        )
    }
}
