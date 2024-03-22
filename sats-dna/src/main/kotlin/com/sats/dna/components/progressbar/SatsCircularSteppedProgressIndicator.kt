package com.sats.dna.components.progressbar

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.inset
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.components.SatsSurface
import com.sats.dna.icons.SatsIcons
import com.sats.dna.theme.SatsTheme

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun SatsCircularSteppedProgressIndicator(
    progress: SteppingProgress,
    modifier: Modifier = Modifier,
    arrangement: Arrangement.HorizontalOrVertical = Arrangement.spacedBy(SatsTheme.spacing.s),
) {
    FlowRow(
        modifier = modifier,
        horizontalArrangement = arrangement,
        verticalArrangement = arrangement,
    ) {
        progress.groups.forEachIndexed { index, group ->
            GroupCircle(group, index + 1)
        }
    }
}

@Suppress("UnnecessaryParentheses") // parentheses are used to clarify the calculations
@Composable
private fun GroupCircle(group: SteppingProgressGroup, groupNumber: Int, modifier: Modifier = Modifier) {
    val incompleteColor = SatsTheme.colors2.graphicalElements.graphs.bar.primary.bg
    val completeColor = SatsTheme.colors2.graphicalElements.graphs.bar.primary.default

    Box(modifier.size(36.dp)) {
        Canvas(Modifier.fillMaxSize()) {
            val strokeWidth = 3.5.dp.toPx()

            // THe line is being drawn out of bounds because of its thickness, so
            // we accommodate for this by insetting by half of the line's width.
            inset(strokeWidth / 2) {
                val stroke = Stroke(width = strokeWidth, cap = StrokeCap.Round)

                if (group.isSingle) {
                    val color = if (group.completedNumberOfSteps >= 1) completeColor else incompleteColor

                    drawCircle(color, style = stroke)
                } else {
                    // The rounded caps will draw further than we tell it to in order to get the
                    // rounded effect, so we add the stroke width again to accommodate for this.
                    val gapBetweenSteps = strokeWidth * 2

                    val gapAngle = (gapBetweenSteps / (size.height * Math.PI) * 360f).toFloat()
                    val sweepAngle = (360f - (group.maxNumberOfSteps * gapAngle)) / group.maxNumberOfSteps

                    for (step in 1..group.maxNumberOfSteps) {
                        // 0 means 3 o'clock, so subtract 90 degrees to start at the top.
                        val startAngle = (gapAngle / 2) + ((step - 1) * (sweepAngle + gapAngle)) - 90f
                        val color = if (step <= group.completedNumberOfSteps) completeColor else incompleteColor

                        drawArc(
                            color = color,
                            startAngle = startAngle,
                            sweepAngle = sweepAngle,
                            useCenter = false,
                            style = stroke,
                        )
                    }
                }
            }
        }

        if (group.isFinished) {
            val padding = if (group.isSingle) 0.dp else 7.dp

            CompletedCheckMark(
                Modifier
                    .padding(padding)
                    .align(Alignment.Center),
            )
        } else {
            GroupNumber(groupNumber, Modifier.align(Alignment.Center))
        }
    }
}

@Immutable
data class SteppingProgress(
    val groups: List<SteppingProgressGroup>,
)

@Immutable
data class SteppingProgressGroup(
    val completedNumberOfSteps: Int,
    val maxNumberOfSteps: Int,
)

private val SteppingProgressGroup.isFinished: Boolean
    get() = completedNumberOfSteps >= maxNumberOfSteps

private val SteppingProgressGroup.isSingle: Boolean
    get() = maxNumberOfSteps == 1

@Composable
private fun GroupNumber(number: Int, modifier: Modifier = Modifier) {
    Text(
        text = number.toString(),
        modifier = modifier,
        style = SatsTheme.typography.emphasis.large,
        color = SatsTheme.colors2.graphicalElements.graphs.bar.primary.bg,
    )
}

@Composable
private fun CompletedCheckMark(modifier: Modifier = Modifier) {
    Box(
        modifier
            .clip(SatsTheme.shapes.circle)
            .aspectRatio(1f)
            .background(SatsTheme.colors2.graphicalElements.progressBar.default.fg),
        contentAlignment = Alignment.Center,
    ) {
        Icon(
            imageVector = SatsIcons.check,
            contentDescription = null,
            modifier = Modifier
                .padding(1.75.dp)
                .fillMaxSize(),
            tint = Color.White,
        )
    }
}

@PreviewLightDark
@Composable
private fun SatsCircularSteppingProgressIndicatorPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.default.bg, useMaterial3 = true) {
            SatsCircularSteppedProgressIndicator(
                progress = SteppingProgress(
                    groups = listOf(
                        SteppingProgressGroup(4, 4),
                        SteppingProgressGroup(2, 4),
                        SteppingProgressGroup(0, 4),
                        SteppingProgressGroup(0, 4),
                        SteppingProgressGroup(1, 1),
                    ),
                ),
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}
