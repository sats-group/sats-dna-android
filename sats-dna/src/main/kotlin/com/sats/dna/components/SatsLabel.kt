package com.sats.dna.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

enum class SatsLabelColor {
    Primary, Secondary, Cta,
}

enum class SatsRewardsLevel {
    Blue, Silver, Gold, Platinum,
}

@Composable
fun SatsLabel(
    text: String,
    modifier: Modifier = Modifier,
    color: SatsLabelColor = SatsLabelColor.Primary,
) {
    val backgroundColor = when (color) {
        SatsLabelColor.Primary -> SatsTheme.colors.primary.default
        SatsLabelColor.Secondary -> SatsTheme.colors.secondary.default
        SatsLabelColor.Cta -> SatsTheme.colors.cta.default
    }

    val contentColor = when (color) {
        SatsLabelColor.Primary -> SatsTheme.colors.onPrimary.default
        SatsLabelColor.Secondary -> SatsTheme.colors.onSecondary.default
        SatsLabelColor.Cta -> SatsTheme.colors.onCta.default
    }

    SatsLabelLayout(text, backgroundColor = backgroundColor, contentColor = contentColor, modifier)
}

@Composable
fun SatsRewardsLabel(
    level: SatsRewardsLevel,
    modifier: Modifier = Modifier,
) {
    val backgroundColor = when (level) {
        SatsRewardsLevel.Blue -> SatsTheme.colors.rewards.blue
        SatsRewardsLevel.Silver -> SatsTheme.colors.rewards.silver
        SatsRewardsLevel.Gold -> SatsTheme.colors.rewards.gold
        SatsRewardsLevel.Platinum -> SatsTheme.colors.rewards.platinum
    }

    val text = when (level) {
        SatsRewardsLevel.Blue -> "BLUE"
        SatsRewardsLevel.Silver -> "SILVER"
        SatsRewardsLevel.Gold -> "GOLD"
        SatsRewardsLevel.Platinum -> "PLATINUM"
    }

    val contentColor = SatsTheme.colors.onRewards.primary

    SatsLabelLayout(text, backgroundColor = backgroundColor, contentColor = contentColor, modifier)
}

@Composable
private fun SatsLabelLayout(
    text: String,
    backgroundColor: Color,
    contentColor: Color,
    modifier: Modifier = Modifier,
) {
    Surface(
        modifier,
        shape = SatsTheme.shapes.roundedCorners.extraSmall,
        color = backgroundColor,
        contentColor = contentColor,
    ) {
        Text(
            text.uppercase(),
            Modifier.padding(horizontal = SatsTheme.spacing.s, vertical = SatsTheme.spacing.xxs),
        )
    }
}

@LightDarkPreview
@Composable
private fun SatsLabelPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.background.primary) {
            Column(
                Modifier.padding(SatsTheme.spacing.m),
                verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xs),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                SatsLabelColor.entries.forEach { color ->
                    SatsLabel("$color", color = color)
                }
            }
        }
    }
}

@LightDarkPreview
@Composable
private fun SatsRewardsLabelPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.background.primary) {
            Column(
                Modifier.padding(SatsTheme.spacing.m),
                verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xs),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                SatsRewardsLevel.entries.forEach { level ->
                    SatsRewardsLabel(level)
                }
            }
        }
    }
}
