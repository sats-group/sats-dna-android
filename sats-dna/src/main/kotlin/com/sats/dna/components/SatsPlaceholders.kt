package com.sats.dna.components

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
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.toSize
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsPlaceholderBox(
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
fun SatsPlaceholderText(
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
fun SatsPlaceholderParagraph(
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

    Column(modifier, spacedBy(SatsTheme.spacing.xxs)) {
        repeat(lines) { lineNumber ->
            val line = texts[lineNumber % texts.count()]

            SatsPlaceholderText(line, style = style)
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

@PreviewLightDark
@Composable
private fun SatsPlaceholderBoxPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg, useMaterial3 = true) {
            Column(Modifier.padding(SatsTheme.spacing.m), spacedBy(SatsTheme.spacing.m)) {
                SatsPlaceholderBox(
                    Modifier
                        .fillMaxWidth()
                        .height(48.dp),
                    RectangleShape,
                )

                SatsPlaceholderBox(Modifier.size(50.dp), CircleShape)

                SatsPlaceholderBox(Modifier.size(100.dp, 40.dp))
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun PlaceholderTextPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg, useMaterial3 = true) {
            Column(Modifier.padding(SatsTheme.spacing.m), spacedBy(SatsTheme.spacing.m)) {
                SatsPlaceholderText("Some Heading", style = SatsTheme.typography.emphasis.headline2)

                SatsPlaceholderParagraph()
            }
        }
    }
}

private fun Modifier.placeholder(shape: Shape): Modifier = composed {
    val infiniteTransition = rememberInfiniteTransition(label = "placeholder-transition")
    val color = SatsTheme.colors.graphicalElements.skeleton
    val highlightProgress = infiniteTransition.animateFloat(
        initialValue = 1f,
        targetValue = .2f,
        animationSpec = infiniteRepeatable(
            animation = tween(delayMillis = 200, durationMillis = 600),
            repeatMode = RepeatMode.Reverse,
        ),
        label = "placeholder-highlight-progress",
    ).value

    remember(shape, color, highlightProgress) {
        drawWithContent {
            if (shape === RectangleShape) { // avoid unnecessary outline calculation
                drawRect(color, alpha = highlightProgress)
            } else {
                val outline = shape.createOutline(size, layoutDirection, density = this)
                drawOutline(outline, color, alpha = highlightProgress)
            }
        }
    }
}
