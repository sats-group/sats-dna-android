package com.sats.dna.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.button.SatsButton
import com.sats.dna.components.button.SatsButtonColor
import com.sats.dna.internal.MaterialText
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsBanner(
    title: String,
    modifier: Modifier = Modifier,
    action: SatsBannerAction? = null,
) {
    SatsSurface(
        modifier = modifier,
        color = SatsTheme.colors2.backgrounds.fixed.primary.default.bg,
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

            action?.composable?.invoke()
        }
    }
}

class SatsBannerAction(
    val label: String,
    val onClick: () -> Unit,
    val icon: ImageVector? = null,
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

@PreviewLightDark
@Composable
private fun SatsBannerPreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors2.backgrounds.primary.default.bg,
            useMaterial3 = true,
        ) {
            SatsBanner(
                modifier = Modifier.fillMaxWidth(),
                title = "Will the real Slim Shady please stand up?",
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsBannerWithActionPreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors2.backgrounds.primary.default.bg,
            useMaterial3 = true,
        ) {
            SatsBanner(
                modifier = Modifier.fillMaxWidth(),
                title = "Will the real Slim Shady please stand up?",
                action = SatsBannerAction("Stand up", onClick = {}),
            )
        }
    }
}
