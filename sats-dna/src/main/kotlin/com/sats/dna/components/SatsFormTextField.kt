package com.sats.dna.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.text2.BasicTextField2
import androidx.compose.foundation.text2.input.TextFieldLineLimits
import androidx.compose.foundation.text2.input.TextFieldState
import androidx.compose.foundation.text2.input.rememberTextFieldState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.movableContentOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.theme.SatsTheme

@ExperimentalFoundationApi
@Composable
fun SatsFormTextField(
    label: String,
    textFieldState: TextFieldState,
    modifier: Modifier = Modifier,
    hint: String? = null,
    lineLimits: TextFieldLineLimits = TextFieldLineLimits.SingleLine,
) {
    val inputTextColor = SatsTheme.colors2.surfaces.primary.fg.alternate

    BasicTextField2(
        state = textFieldState,
        modifier = modifier.sizeIn(minWidth = 48.dp, minHeight = 48.dp),
        textStyle = SatsTheme.typography.normal.basic.copy(
            color = inputTextColor,
            textAlign = when (lineLimits) {
                is TextFieldLineLimits.SingleLine -> TextAlign.End
                is TextFieldLineLimits.MultiLine -> TextAlign.Start
            },
        ),
        cursorBrush = SolidColor(inputTextColor),
        lineLimits = lineLimits,
        decorator = { innerTextField ->
            SatsSurface {
                val labelAndHint = movableContentOf {
                    LabelAndHint(label, hint, inputTextColor)
                }

                when (lineLimits) {
                    is TextFieldLineLimits.SingleLine -> {
                        Row(
                            modifier = Modifier.padding(
                                vertical = SatsTheme.spacing.xs,
                                horizontal = SatsTheme.spacing.m,
                            ),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically,
                        ) {
                            labelAndHint()

                            Box(Modifier.padding(start = SatsTheme.spacing.m)) {
                                innerTextField()
                            }
                        }
                    }

                    is TextFieldLineLimits.MultiLine -> {
                        Column(
                            Modifier.padding(
                                vertical = SatsTheme.spacing.xs,
                                horizontal = SatsTheme.spacing.m,
                            ),
                        ) {
                            labelAndHint()

                            innerTextField()
                        }
                    }
                }
            }
        },
    )
}

@Composable
private fun LabelAndHint(label: String, hint: String?, inputTextColor: Color) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xs),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(label)

        if (hint != null) {
            Text(
                text = hint,
                style = SatsTheme.typography.normal.small,
                color = inputTextColor,
            )
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@PreviewLightDark
@Composable
private fun SatsFormTextFieldSingleLinePreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            SatsFormTextField(
                textFieldState = rememberTextFieldState("Lorem ipsum dolor sit amet"),
                label = "Sample Text",
                hint = "(optional)",
                modifier = Modifier.fillMaxWidth(),
            )
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@PreviewLightDark
@Composable
private fun SatsFormTextFieldMultiLinePreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            val text = buildString {
                repeat(10) {
                    append("Lorem ipsum dolor sit amet. ")
                }
            }.trim()

            SatsFormTextField(
                textFieldState = rememberTextFieldState(text),
                label = "Sample Text",
                hint = "(optional)",
                lineLimits = TextFieldLineLimits.MultiLine(minHeightInLines = 5, maxHeightInLines = 6),
                modifier = Modifier.fillMaxWidth(),
            )
        }
    }
}
