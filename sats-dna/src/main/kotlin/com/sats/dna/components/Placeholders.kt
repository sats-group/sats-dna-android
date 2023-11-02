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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
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
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

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
    style: TextStyle = SatsTheme.typography.normal.basic,
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
    style: TextStyle = SatsTheme.typography.normal.basic,
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
                PlaceholderText("Some Heading", style = SatsTheme.typography.emphasis.headline2)

                PlaceholderParagraph()
            }
        }
    }
}

private fun Modifier.placeholder(shape: Shape): Modifier = composed {
    val fade = Fade(SatsTheme.colors.surface.primary.copy(alpha = 0.75f))
    val color = SatsTheme.colors.onSurface.primary.copy(0.1f)
        .compositeOver(SatsTheme.colors.surface.primary)

    val infiniteTransition = rememberInfiniteTransition(label = "placeholder-transition")
    var highlightProgress by remember { mutableFloatStateOf(0f) }

    highlightProgress = infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = fade.animationSpec,
        label = "placeholder-highlight-progress",
    ).value

    remember(color, shape, fade) {
        drawWithContent {
            drawPlaceholder(
                shape = shape,
                color = color,
                fade = fade,
                progress = highlightProgress,
            )
        }
    }
}

private fun DrawScope.drawPlaceholder(
    shape: Shape,
    color: Color,
    fade: Fade,
    progress: Float,
): Outline? {
    // Shortcut to avoid Outline calculation and allocation
    if (shape === RectangleShape) {
        drawRect(color) // draw the background color

        drawRect(fade.brush(), alpha = fade.alpha(progress))

        return null // we didn't (need to) draw an outline
    }

    return shape.createOutline(size, layoutDirection, this).also { outline ->
        drawOutline(outline, color)
        drawOutline(outline, fade.brush(), fade.alpha(progress))
    }
}

private class Fade(highlightColor: Color) {
    val animationSpec: InfiniteRepeatableSpec<Float> = infiniteRepeatable(
        animation = tween(delayMillis = 200, durationMillis = 600),
        repeatMode = RepeatMode.Reverse,
    )

    private val brush = SolidColor(highlightColor)

    fun brush(): Brush = brush
    fun alpha(progress: Float): Float = progress
}
