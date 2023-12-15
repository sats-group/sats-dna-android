package com.sats.dna.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.sats.dna.internal.MaterialText
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

@Composable
fun SatsTag(
    text: String,
    modifier: Modifier = Modifier,
    color: SatsTagColor = SatsTagColor.Primary,
) {
    val backgroundColor = when (color) {
        SatsTagColor.Primary -> SatsTheme.colors2.graphicalElements.tags.primary.bg
        SatsTagColor.Secondary -> SatsTheme.colors2.graphicalElements.tags.secondary.bg
        SatsTagColor.Featured -> SatsTheme.colors2.graphicalElements.tags.featured.bg
    }

    val contentColor = when (color) {
        SatsTagColor.Primary -> SatsTheme.colors2.graphicalElements.tags.primary.fg
        SatsTagColor.Secondary -> SatsTheme.colors2.graphicalElements.tags.secondary.fg
        SatsTagColor.Featured -> SatsTheme.colors2.graphicalElements.tags.featured.fg
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
        SatsRewardsLevel.Blue -> SatsTheme.colors2.graphicalElements.rewards.blue.bg
        SatsRewardsLevel.Silver -> SatsTheme.colors2.graphicalElements.rewards.silver.bg
        SatsRewardsLevel.Gold -> SatsTheme.colors2.graphicalElements.rewards.gold.bg
        SatsRewardsLevel.Platinum -> SatsTheme.colors2.graphicalElements.rewards.platinum.bg
    }

    val contentColor = when (level) {
        SatsRewardsLevel.Blue -> SatsTheme.colors2.graphicalElements.rewards.blue.fg
        SatsRewardsLevel.Silver -> SatsTheme.colors2.graphicalElements.rewards.silver.fg
        SatsRewardsLevel.Gold -> SatsTheme.colors2.graphicalElements.rewards.gold.fg
        SatsRewardsLevel.Platinum -> SatsTheme.colors2.graphicalElements.rewards.platinum.fg
    }

    val text = when (level) {
        SatsRewardsLevel.Blue -> "BLUE"
        SatsRewardsLevel.Silver -> "SILVER"
        SatsRewardsLevel.Gold -> "GOLD"
        SatsRewardsLevel.Platinum -> "PLATINUM"
    }

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
    SatsSurface(
        modifier,
        shape = SatsTheme.shapes.roundedCorners.extraSmall,
        color = backgroundColor,
        contentColor = contentColor,
    ) {
        MaterialText(
            text.uppercase(),
            Modifier.padding(horizontal = SatsTheme.spacing.s, vertical = SatsTheme.spacing.xxs),
        )
    }
}

@LightDarkPreview
@Composable
private fun SatsTagPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default) {
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
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
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
