package com.sats.dna.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

@Composable
fun SatsTag(
    text: String,
    modifier: Modifier = Modifier,
    color: SatsTagColor = SatsTagColor.Primary,
) {
    val backgroundColor = when (color) {
        SatsTagColor.Primary -> SatsTheme.colors.primary.default
        SatsTagColor.Secondary -> SatsTheme.colors.secondary.default
        SatsTagColor.Featured -> SatsTheme.colors.cta.default
    }

    val contentColor = when (color) {
        SatsTagColor.Primary -> SatsTheme.colors.onPrimary.default
        SatsTagColor.Secondary -> SatsTheme.colors.onSecondary.default
        SatsTagColor.Featured -> SatsTheme.colors.onCta.default
    }

    SatsTagLayout(text, backgroundColor = backgroundColor, contentColor = contentColor, modifier)
}

enum class SatsTagColor {
    Primary, Secondary, Featured,
}

@Deprecated("Renamed to SatsTag", ReplaceWith("SatsTag(text, modifier, color)"))
@Composable
fun SatsLabel(
    text: String,
    modifier: Modifier = Modifier,
    color: SatsLabelColor = SatsLabelColor.Primary,
) {
    SatsTag(text, modifier, color)
}

@Deprecated("Renamed to SatsTagColor", ReplaceWith("SatsTagColor"))
typealias SatsLabelColor = SatsTagColor

@Composable
fun SatsRewardsTag(
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

    val contentColor = SatsTheme.colors.onRewards.default

    SatsTagLayout(text, backgroundColor = backgroundColor, contentColor = contentColor, modifier)
}

@Deprecated("Renamed to SatsRewardsTag", ReplaceWith("SatsRewardsTag(level, modifier)"))
@Composable
fun SatsRewardsLabel(level: SatsRewardsLevel, modifier: Modifier = Modifier) {
    SatsRewardsTag(level, modifier)
}

enum class SatsRewardsLevel {
    Blue, Silver, Gold, Platinum,
}

@Composable
private fun SatsTagLayout(
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
private fun SatsTagPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.background.primary) {
            Column(
                Modifier.padding(SatsTheme.spacing.m),
                verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xs),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                SatsTagColor.entries.forEach { color ->
                    SatsTag("$color", color = color)
                }
            }
        }
    }
}

@LightDarkPreview
@Composable
private fun SatsRewardsTagPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.background.primary) {
            Column(
                Modifier.padding(SatsTheme.spacing.m),
                verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xs),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                SatsRewardsLevel.entries.forEach { level ->
                    SatsRewardsTag(level)
                }
            }
        }
    }
}
