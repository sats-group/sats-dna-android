package com.sats.dna.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsTag(
    text: String,
    modifier: Modifier = Modifier,
    color: SatsTagColor = SatsTagColor.Primary,
    size: SatsTagSize = SatsTagSize.Small,
    shape: SatsTagShape = SatsTagShape.Default,
) {
    val colorSet = when (color) {
        SatsTagColor.Primary -> SatsTheme.colors.graphicalElements.tags.primary
        SatsTagColor.Secondary -> SatsTheme.colors.graphicalElements.tags.secondary
        SatsTagColor.Featured -> SatsTheme.colors.graphicalElements.tags.featured
        SatsTagColor.Positive -> SatsTheme.colors.graphicalElements.indicatorTag.positive.default
    }

    val paddingValues = when (size) {
        SatsTagSize.Small -> PaddingValues(vertical = SatsTheme.spacing.xxs, horizontal = SatsTheme.spacing.s)
        SatsTagSize.Basic -> PaddingValues(vertical = SatsTheme.spacing.xs, horizontal = SatsTheme.spacing.s)
    }

    val cornerShape = when (shape) {
        SatsTagShape.Default -> SatsTheme.shapes.roundedCorners.extraSmall
        SatsTagShape.Left -> SatsTheme.shapes.roundedCorners.extraSmall.copy(
            topStart = CornerSize(0.dp),
            bottomStart = CornerSize(0.dp),
        )

        SatsTagShape.Right -> SatsTheme.shapes.roundedCorners.extraSmall.copy(
            topEnd = CornerSize(0.dp),
            bottomEnd = CornerSize(0.dp),
        )
    }

    SatsTagLayout(
        text = text,
        backgroundColor = colorSet.bg,
        contentColor = colorSet.fg,
        cornerShape = cornerShape,
        paddingValues = paddingValues,
        modifier = modifier,
    )
}

enum class SatsTagColor {
    Primary, Secondary, Featured, Positive
}

enum class SatsTagSize {
    Small, Basic,
}

enum class SatsTagShape {
    Default, Left, Right,
}

@Composable
fun SatsRewardsTag(
    level: SatsRewardsLevel,
    modifier: Modifier = Modifier,
) {
    val backgroundColor = when (level) {
        SatsRewardsLevel.Blue -> SatsTheme.colors.graphicalElements.rewards.blue.bg
        SatsRewardsLevel.Silver -> SatsTheme.colors.graphicalElements.rewards.silver.bg
        SatsRewardsLevel.Gold -> SatsTheme.colors.graphicalElements.rewards.gold.bg
        SatsRewardsLevel.Platinum -> SatsTheme.colors.graphicalElements.rewards.platinum.bg
    }

    val contentColor = when (level) {
        SatsRewardsLevel.Blue -> SatsTheme.colors.graphicalElements.rewards.blue.fg
        SatsRewardsLevel.Silver -> SatsTheme.colors.graphicalElements.rewards.silver.fg
        SatsRewardsLevel.Gold -> SatsTheme.colors.graphicalElements.rewards.gold.fg
        SatsRewardsLevel.Platinum -> SatsTheme.colors.graphicalElements.rewards.platinum.fg
    }

    val text = when (level) {
        SatsRewardsLevel.Blue -> "BLUE"
        SatsRewardsLevel.Silver -> "SILVER"
        SatsRewardsLevel.Gold -> "GOLD"
        SatsRewardsLevel.Platinum -> "PLATINUM"
    }

    val shape = SatsTheme.shapes.roundedCorners.extraSmall

    val paddingValues = PaddingValues(
        horizontal = SatsTheme.spacing.s,
        vertical = SatsTheme.spacing.xxs,
    )

    SatsTagLayout(
        text = text,
        backgroundColor = backgroundColor,
        contentColor = contentColor,
        cornerShape = shape,
        paddingValues = paddingValues,
        modifier = modifier,
    )
}

enum class SatsRewardsLevel {
    Blue, Silver, Gold, Platinum,
}

@Composable
fun SatsWorkoutTag(
    text: String,
    color: SatsWorkoutTagColor,
    modifier: Modifier = Modifier,
) {
    val backgroundColor = when (color) {
        SatsWorkoutTagColor.Pt -> SatsTheme.colors.graphicalElements.workouts.pt.bg
        SatsWorkoutTagColor.Gx -> SatsTheme.colors.graphicalElements.workouts.gx.bg
        SatsWorkoutTagColor.Treatment -> SatsTheme.colors.graphicalElements.workouts.treatments.bg
        SatsWorkoutTagColor.Gymfloor -> SatsTheme.colors.graphicalElements.workouts.gymfloor.bg
        SatsWorkoutTagColor.OwnTrainingOther ->
            SatsTheme.colors.graphicalElements.workouts.other.bg
    }

    val contentColor = when (color) {
        SatsWorkoutTagColor.Pt -> SatsTheme.colors.graphicalElements.workouts.pt.fg
        SatsWorkoutTagColor.Gx -> SatsTheme.colors.graphicalElements.workouts.gx.fg
        SatsWorkoutTagColor.Treatment -> SatsTheme.colors.graphicalElements.workouts.treatments.fg
        SatsWorkoutTagColor.Gymfloor -> SatsTheme.colors.graphicalElements.workouts.gymfloor.fg
        SatsWorkoutTagColor.OwnTrainingOther ->
            SatsTheme.colors.graphicalElements.workouts.other.fg
    }

    val shape = SatsTheme.shapes.roundedCorners.extraSmall

    val paddingValues = PaddingValues(
        horizontal = SatsTheme.spacing.s,
        vertical = SatsTheme.spacing.xxs,
    )

    SatsTagLayout(
        text = text,
        backgroundColor = backgroundColor,
        contentColor = contentColor,
        cornerShape = shape,
        paddingValues = paddingValues,
        modifier = modifier,
    )
}

enum class SatsWorkoutTagColor {
    Pt, Gx, Treatment, Gymfloor, OwnTrainingOther,
}

@Composable
fun SatsTagPlaceholder(
    text: String,
    modifier: Modifier = Modifier,
) {
    SatsPlaceholderBox(modifier, SatsTheme.shapes.roundedCorners.extraSmall) {
        SatsPlaceholderText(
            text = text.uppercase(),
            modifier = Modifier.padding(
                horizontal = SatsTheme.spacing.s,
                vertical = SatsTheme.spacing.xxs,
            ),
        )
    }
}

@Composable
private fun SatsTagLayout(
    text: String,
    backgroundColor: Color,
    contentColor: Color,
    modifier: Modifier = Modifier,
    cornerShape: Shape,
    paddingValues: PaddingValues,
) {
    SatsSurface(
        modifier = modifier,
        shape = cornerShape,
        color = backgroundColor,
        contentColor = contentColor,
    ) {
        Text(
            text = text.uppercase(),
            modifier = Modifier.padding(
                paddingValues,
            ),
        )
    }
}

@PreviewLightDark
@Composable
private fun SmallSatsTagPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
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

@PreviewLightDark
@Composable
private fun BasicSatsTagPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            Column(
                Modifier.padding(SatsTheme.spacing.m),
                verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xs),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                SatsTagColor.entries.forEach { color ->
                    SatsTag("$color", color = color, size = SatsTagSize.Basic, shape = SatsTagShape.Default)
                }
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun SmallLeftAlignedSatsTagPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            Column(
                Modifier.padding(SatsTheme.spacing.m),
                verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xs),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                SatsTagColor.entries.forEach { color ->
                    SatsTag("$color", color = color, size = SatsTagSize.Small, shape = SatsTagShape.Left)
                }
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun BasicLeftAlignedSatsTagPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            Column(
                Modifier.padding(SatsTheme.spacing.m),
                verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xs),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                SatsTagColor.entries.forEach { color ->
                    SatsTag("$color", color = color, size = SatsTagSize.Basic, shape = SatsTagShape.Left)
                }
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun SmallRightAlignedSatsTagPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            Column(
                Modifier.padding(SatsTheme.spacing.m),
                verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xs),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                SatsTagColor.entries.forEach { color ->
                    SatsTag("$color", color = color, size = SatsTagSize.Small, shape = SatsTagShape.Right)
                }
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun BasicRightAlignedSatsTagPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            Column(
                Modifier.padding(SatsTheme.spacing.m),
                verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xs),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                SatsTagColor.entries.forEach { color ->
                    SatsTag("$color", color = color, size = SatsTagSize.Basic, shape = SatsTagShape.Right)
                }
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsRewardsTagPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
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

@PreviewLightDark
@Composable
private fun SatsTagPlaceholderPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            SatsTagPlaceholder("Tag Text", Modifier.padding(SatsTheme.spacing.m))
        }
    }
}
