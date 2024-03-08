package com.sats.dna.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewFontScale
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsBadge(
    label: String,
    modifier: Modifier = Modifier,
    hierarchy: SatsBadgeHierarchy = SatsBadgeHierarchy.Primary,
) {
    SatsBadgeLayout(
        label = label,
        containerColor = hierarchy.containerColor,
        contentColor = hierarchy.contentColor,
        modifier = modifier,
    )
}

@Composable
fun SatsFixedBadge(
    label: String,
    modifier: Modifier = Modifier,
    hierarchy: SatsBadgeHierarchy = SatsBadgeHierarchy.Primary,
) {
    SatsBadgeLayout(
        label = label,
        containerColor = hierarchy.fixedContainerColor,
        contentColor = hierarchy.fixedContentColor,
        modifier = modifier,
    )
}

@Composable
private fun SatsBadgeLayout(
    label: String,
    containerColor: Color,
    contentColor: Color,
    modifier: Modifier = Modifier,
) {
    SatsSurface(
        modifier = modifier,
        color = containerColor,
        shape = SatsTheme.shapes.circle,
        useMaterial3 = true,
    ) {
        Text(
            text = label,
            modifier = Modifier.padding(horizontal = SatsTheme.spacing.xxs),
            style = SatsTheme.typography.normal.small,
            color = contentColor,
        )
    }
}

enum class SatsBadgeHierarchy {
    Primary, Secondary, Tertiary
}

private val SatsBadgeHierarchy.containerColor: Color
    @Composable get() = when (this) {
        SatsBadgeHierarchy.Primary -> SatsTheme.colors2.graphicalElements.badge.primary.bg
        SatsBadgeHierarchy.Secondary -> SatsTheme.colors2.graphicalElements.badge.secondary.bg
        SatsBadgeHierarchy.Tertiary -> SatsTheme.colors2.graphicalElements.badge.tertiary.bg
    }

private val SatsBadgeHierarchy.contentColor: Color
    @Composable get() = when (this) {
        SatsBadgeHierarchy.Primary -> SatsTheme.colors2.graphicalElements.badge.primary.fg
        SatsBadgeHierarchy.Secondary -> SatsTheme.colors2.graphicalElements.badge.secondary.fg
        SatsBadgeHierarchy.Tertiary -> SatsTheme.colors2.graphicalElements.badge.tertiary.fg
    }

private val SatsBadgeHierarchy.fixedContainerColor: Color
    @Composable get() = when (this) {
        SatsBadgeHierarchy.Primary -> SatsTheme.colors2.graphicalElements.fixedBadge.primary.bg
        SatsBadgeHierarchy.Secondary -> SatsTheme.colors2.graphicalElements.fixedBadge.secondary.bg
        SatsBadgeHierarchy.Tertiary -> SatsTheme.colors2.graphicalElements.fixedBadge.tertiary.bg
    }

private val SatsBadgeHierarchy.fixedContentColor: Color
    @Composable get() = when (this) {
        SatsBadgeHierarchy.Primary -> SatsTheme.colors2.graphicalElements.fixedBadge.primary.fg
        SatsBadgeHierarchy.Secondary -> SatsTheme.colors2.graphicalElements.fixedBadge.secondary.fg
        SatsBadgeHierarchy.Tertiary -> SatsTheme.colors2.graphicalElements.fixedBadge.tertiary.fg
    }

@PreviewLightDark
@Composable
private fun SatsBadgePrimaryPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            SatsBadge("5", Modifier.padding(SatsTheme.spacing.m), hierarchy = SatsBadgeHierarchy.Primary)
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsBadgeSecondaryPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            SatsBadge("5", Modifier.padding(SatsTheme.spacing.m), hierarchy = SatsBadgeHierarchy.Secondary)
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsBadgeTertiaryPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            SatsBadge("5", Modifier.padding(SatsTheme.spacing.m), hierarchy = SatsBadgeHierarchy.Tertiary)
        }
    }
}

@Preview
@Composable
private fun SatsFixedBadgePrimaryPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.fixed.primary.bg.default, useMaterial3 = true) {
            SatsFixedBadge("5", Modifier.padding(SatsTheme.spacing.m), hierarchy = SatsBadgeHierarchy.Primary)
        }
    }
}

@Preview
@Composable
private fun SatsFixedBadgeSecondaryPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.fixed.primary.bg.default, useMaterial3 = true) {
            SatsFixedBadge("5", Modifier.padding(SatsTheme.spacing.m), hierarchy = SatsBadgeHierarchy.Secondary)
        }
    }
}

@Preview
@Composable
private fun SatsFixedBadgeTertiaryPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.fixed.primary.bg.default, useMaterial3 = true) {
            SatsFixedBadge("5", Modifier.padding(SatsTheme.spacing.m), hierarchy = SatsBadgeHierarchy.Tertiary)
        }
    }
}

@PreviewFontScale
@Composable
private fun SatsBadgeFontScalePreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            SatsBadge("5", Modifier.padding(SatsTheme.spacing.m))
        }
    }
}
