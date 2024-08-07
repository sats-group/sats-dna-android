package com.sats.dna.components.progressbar

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.focusable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.progressSemantics
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.inset
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsLinearProgressBar(
    progress: Float,
    modifier: Modifier = Modifier,
) {
    val foregroundColor = SatsTheme.colors.graphicalElements.progressBar.indicatorDefault.fg
    val backgroundColor = SatsTheme.colors.graphicalElements.progressBar.indicatorDefault.bg

    Canvas(
        modifier
            .progressSemantics(progress)
            .height(4.dp)
            .focusable(),
    ) {
        // Remove extra padding added by the rounded line cap
        inset(horizontal = size.height / 2) {
            drawBackground(backgroundColor)

            if (progress > 0f) {
                drawProgress(progress.coerceIn(0f, 1f), foregroundColor)
            }
        }
    }
}

private fun DrawScope.drawBackground(color: Color) {
    // Start drawing from the vertical center of the stroke
    val yOffset = size.height / 2

    drawLine(
        color = color,
        start = Offset(0f, yOffset),
        end = Offset(size.width, yOffset),
        strokeWidth = size.height,
        cap = StrokeCap.Round,
    )
}

private fun DrawScope.drawProgress(progress: Float, color: Color) {
    // Start drawing from the vertical center of the stroke
    val yOffset = size.height / 2

    drawLine(
        color = color,
        start = Offset(0f, yOffset),
        end = Offset(progress * size.width, yOffset),
        strokeWidth = size.height,
        cap = StrokeCap.Round,
    )
}

@PreviewLightDark
@Composable
private fun SatsLinearProgressBarPreview() {
    SatsTheme {
        Surface {
            SatsLinearProgressBar(
                progress = 1 / 3f,
                modifier = Modifier
                    .padding(SatsTheme.spacing.m)
                    .fillMaxWidth(),
            )
        }
    }
}
