package com.sats.dna.components

import androidx.compose.animation.core.InfiniteRepeatableSpec
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.toSize
import androidx.compose.ui.util.lerp
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview
import kotlin.math.max

@Composable
fun PlaceholderBox(
    modifier: Modifier = Modifier,
    shape: Shape = SatsTheme.shapes.roundedCorners.small,
    content: @Composable BoxScope.() -> Unit = {},
) {
    Box(
        modifier
            .placeholder(shape)
            .clearAndSetSemantics {}, // remove any semantics from potential children, as they're invisible anyway
        content = content,
    )
}

@Composable
fun PlaceholderText(
    text: String,
    modifier: Modifier = Modifier,
    style: TextStyle = SatsTheme.typography.default.basic,
) {
    Box(
        modifier
            .size(rememberTextSize(text, style))
            .placeholder(SatsTheme.shapes.roundedCorners.extraSmall),
    )
}

@Composable
fun PlaceholderParagraph(
    modifier: Modifier = Modifier,
    lines: Int = 5,
    style: TextStyle = SatsTheme.typography.default.basic,
) {
    @Suppress("SpellCheckingInspection")
    val texts = listOf(
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
        "Pellentesque bibendum a ligula vitae efficitur.",
        "Nunc a commodo lectus. Integer laoreet lobortis augue.",
        "Curabitur facilisis efficitur est a molestie.",
        "Suspendisse et facilisis mauris. In in diam ligula.",
        "Fusce vel tortor laoreet, rutrum est id, scelerisque sem.",
        "Maecenas venenatis fermentum ullamcorper.",
    )

    Column(modifier, spacedBy(SatsTheme.spacing.xs)) {
        repeat(lines) { lineNumber ->
            val line = texts[lineNumber % texts.count()]

            PlaceholderText(line, style = style)
        }
    }
}

@Composable
private fun rememberTextSize(text: String, style: TextStyle): DpSize {
    val textMeasurer = rememberTextMeasurer()

    return with(LocalDensity.current) {
        remember(text, style) { textMeasurer.measure(AnnotatedString(text), style).size.toSize().toDpSize() }
    }
}

@LightDarkPreview
@Composable
private fun PlaceholderBoxPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.background.primary) {
            Column(Modifier.padding(SatsTheme.spacing.m), spacedBy(SatsTheme.spacing.m)) {
                PlaceholderBox(
                    Modifier
                        .fillMaxWidth()
                        .height(48.dp),
                    RectangleShape,
                )

                PlaceholderBox(Modifier.size(50.dp), CircleShape)

                PlaceholderBox(Modifier.size(100.dp, 40.dp))
            }
        }
    }
}

@LightDarkPreview
@Composable
private fun PlaceholderTextPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.background.primary) {
            Column(Modifier.padding(SatsTheme.spacing.m), spacedBy(SatsTheme.spacing.m)) {
                PlaceholderText("Some Heading", style = SatsTheme.typography.emphasis.heading2)

                PlaceholderParagraph()
            }
        }
    }
}

private fun Modifier.placeholder(shape: Shape): Modifier = composed {
    val shimmer = Shimmer(SatsTheme.colors.surface.primary.copy(alpha = 0.75f))
    val color = SatsTheme.colors.onSurface.primary.copy(0.1f)
        .compositeOver(SatsTheme.colors.surface.primary)

    val infiniteTransition = rememberInfiniteTransition(label = "placeholder-transition")
    var highlightProgress by remember { mutableFloatStateOf(0f) }

    highlightProgress = infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = shimmer.animationSpec,
        label = "placeholder-highlight-progress",
    ).value

    remember(color, shape, shimmer) {
        drawWithContent {
            drawPlaceholder(
                shape = shape,
                color = color,
                shimmer = shimmer,
                progress = highlightProgress,
            )
        }
    }
}

private fun DrawScope.drawPlaceholder(
    shape: Shape,
    color: Color,
    shimmer: Shimmer,
    progress: Float,
): Outline? {
    // Shortcut to avoid Outline calculation and allocation
    if (shape === RectangleShape) {
        drawRect(color) // draw the background color

        drawRect(shimmer.brush(progress, size), alpha = shimmer.alpha(progress))

        return null // we didn't (need to) draw an outline
    }

    val outline = shape.createOutline(size, layoutDirection, this)

    drawOutline(outline, color)
    drawOutline(outline, shimmer.brush(progress, size), shimmer.alpha(progress))

    // Return the outline we used
    return outline
}

private data class Shimmer(private val highlightColor: Color) {
    val animationSpec: InfiniteRepeatableSpec<Float> = infiniteRepeatable(
        animation = tween(durationMillis = 1700, delayMillis = 200),
        repeatMode = RepeatMode.Restart,
    )

    fun brush(progress: Float, size: Size): Brush = Brush.radialGradient(
        colors = listOf(
            highlightColor.copy(alpha = 0f),
            highlightColor,
            highlightColor.copy(alpha = 0f),
        ),
        center = Offset.Zero,
        radius = (max(size.width, size.height) * progress * 2).coerceAtLeast(0.01f),
    )

    fun alpha(progress: Float): Float {
        val progressForMaxAlpha = 0.6f

        return when {
            // From 0f...progressForMaxAlpha we animate from 0..1
            progress <= progressForMaxAlpha -> lerp(
                start = 0f,
                stop = 1f,
                fraction = progress / progressForMaxAlpha,
            )

            // From progressForMaxAlpha..1f we animate from 1..0
            else -> lerp(
                start = 1f,
                stop = 0f,
                fraction = (progress - progressForMaxAlpha) / (1f - progressForMaxAlpha),
            )
        }
    }
}
