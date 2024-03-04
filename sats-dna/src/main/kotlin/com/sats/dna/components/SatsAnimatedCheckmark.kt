package com.sats.dna.components

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.AnimationVector1D
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.clipRect
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsAnimatedCheckmark(modifier: Modifier = Modifier) {
    val circleSweepAngle = remember { Animatable(0f) }
    val tickProgress = remember { Animatable(0f) }

    LaunchedEffect(null) {
        circleSweepAngle.animateTo(
            targetValue = -360f,
            animationSpec = tween(delayMillis = 200, durationMillis = 500, easing = LinearEasing),
        )
        tickProgress.animateTo(
            targetValue = 1f,
            animationSpec = tween(delayMillis = 100, durationMillis = 500, easing = LinearEasing),
        )
    }

    val color = SatsTheme.colors2.graphicalElements.signal.success

    Canvas(modifier) {
        drawCircle(color, circleSweepAngle)

        clipRect(right = tickProgress.value * size.width) {
            drawTick(color)
        }
    }
}

private fun DrawScope.drawTick(
    color: Color,
) {
    val tickStartX = 28f / 100 * size.width
    val tickStartY = size.height / 2
    val tickMeetingPointX = tickStartX + (16f / 100 * size.width)
    val tickMeetingPointY = tickStartY + (18f / 100 * size.height)
    val tickEndX = tickMeetingPointX + 24f / 100 * size.width
    val tickEndY = tickMeetingPointY - 37f / 100 * size.height

    drawLine(
        color = color,
        start = Offset(tickStartX, tickStartY),
        end = Offset(tickMeetingPointX, tickMeetingPointY),
        cap = StrokeCap.Round,
        strokeWidth = strokeWidth,
    )

    drawLine(
        color = color,
        start = Offset(tickMeetingPointX, tickMeetingPointY),
        end = Offset(tickEndX, tickEndY),
        cap = StrokeCap.Round,
        strokeWidth = strokeWidth,
    )
}

private fun DrawScope.drawCircle(
    color: Color,
    animateFloat: Animatable<Float, AnimationVector1D>,
) {
    drawArc(
        color = color,
        startAngle = -90f,
        sweepAngle = animateFloat.value,
        style = Stroke(strokeWidth),
        size = size,
        useCenter = false,
    )
}

private const val strokeWidth = 2.73f

@PreviewLightDark
@Composable
private fun SatsAnimatedCheckIconPreview() {
    SatsTheme {
        SatsSurface(useMaterial3 = true) {
            SatsAnimatedCheckmark(
                modifier = Modifier
                    .size(80.dp)
                    .padding(SatsTheme.spacing.m),
            )
        }
    }
}
