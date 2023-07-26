package com.sats.dna.components

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
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.toSize
import com.google.accompanist.placeholder.PlaceholderHighlight
import com.google.accompanist.placeholder.material.placeholder
import com.google.accompanist.placeholder.material.shimmer
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

@Composable
fun PlaceholderBox(
    modifier: Modifier = Modifier,
    shape: Shape? = null,
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

private fun Modifier.placeholder(shape: Shape?): Modifier = composed {
    placeholder(visible = true, highlight = PlaceholderHighlight.shimmer(), shape = shape)
}
