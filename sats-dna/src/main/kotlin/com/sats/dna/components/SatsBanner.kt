package com.sats.dna.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import com.sats.dna.colors.satsContentColor2For
import com.sats.dna.components.button.SatsButton
import com.sats.dna.components.button.SatsButtonColor
import com.sats.dna.internal.MaterialText
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

@Composable
fun SatsBanner(
    title: String,
    modifier: Modifier = Modifier,
    action: SatsBannerAction? = null,
) {
    SatsBanner(
        title = title,
        modifier = modifier,
        action = action?.composable,
    )
}

class SatsBannerAction(
    val label: String,
    val onClick: () -> Unit,
    val icon: Painter? = null,
    val isEnabled: Boolean = true,
    val isLoading: Boolean = false,
)

private val SatsBannerAction.composable: @Composable () -> Unit
    @Composable get() {
        return {
            SatsButton(
                onClick = onClick,
                label = label,
                colors = SatsButtonColor.Clean,
                isLoading = isLoading,
                isEnabled = isEnabled,
                icon = icon,
            )
        }
    }

@Deprecated("Use the SatsBanner that accepts a SatsBannerAction instead")
@Composable
fun SatsBanner(
    title: String,
    modifier: Modifier = Modifier,
    action: @Composable (() -> Unit)? = null,
    backgroundColor: Color = SatsTheme.colors2.backgrounds.fixed.bg.default,
    contentColor: Color = satsContentColor2For(backgroundColor),
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
            MaterialText(
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
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            SatsBanner(
                modifier = Modifier.fillMaxWidth(),
                title = "Will the real Slim Shady please stand up?",
            )
        }
    }
}

@LightDarkPreview
@Composable
private fun SatsBannerWithActionPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            SatsBanner(
                modifier = Modifier.fillMaxWidth(),
                title = "Will the real Slim Shady please stand up?",
                action = SatsBannerAction("Stand up", onClick = {}),
            )
        }
    }
}
