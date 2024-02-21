package com.sats.dna.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
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
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
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
    val textStyle = valueTextStyle(isSingleLine = lineLimits is TextFieldLineLimits.SingleLine)

    BasicTextField2(
        state = textFieldState,
        modifier = modifier.sizeIn(minWidth = MinSize, minHeight = MinSize),
        textStyle = textStyle,
        cursorBrush = SolidColor(textStyle.color),
        lineLimits = lineLimits,
        decorator = { innerTextField ->
            InputFieldContainer(
                isMultiline = lineLimits is TextFieldLineLimits.MultiLine,
                label = label,
                hint = hint,
                content = innerTextField,
            )
        },
    )
}

@Composable
fun SatsFormInputField(
    label: String,
    modifier: Modifier = Modifier,
    hint: String? = null,
    content: @Composable () -> Unit,
) {
    InputFieldContainer(
        modifier = modifier.sizeIn(minWidth = MinSize, minHeight = MinSize),
        isMultiline = false,
        label = label,
        hint = hint,
    ) {
        ProvideTextStyle(
            value = valueTextStyle(isSingleLine = true),
            content = content,
        )
    }
}

@Composable
private fun InputFieldContainer(
    isMultiline: Boolean,
    label: String,
    hint: String?,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    SatsSurface(modifier) {
        if (isMultiline) {
            Column(
                Modifier.padding(
                    vertical = SatsTheme.spacing.xs,
                    horizontal = SatsTheme.spacing.m,
                ),
            ) {
                LabelAndHint(label, hint)

                content()
            }
        } else {
            Row(
                modifier = Modifier.padding(
                    vertical = SatsTheme.spacing.xs,
                    horizontal = SatsTheme.spacing.m,
                ),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                LabelAndHint(label, hint)

                Box(Modifier.padding(start = SatsTheme.spacing.m)) {
                    content()
                }
            }
        }
    }
}

@Composable
private fun LabelAndHint(label: String, hint: String?) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xs),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(label)

        if (hint != null) {
            Text(
                text = hint,
                style = SatsTheme.typography.normal.small,
                color = SatsTheme.colors2.surfaces.primary.fg.alternate,
            )
        }
    }
}

@Composable
private fun valueTextStyle(isSingleLine: Boolean): TextStyle {
    return SatsTheme.typography.normal.basic.copy(
        color = SatsTheme.colors2.surfaces.primary.fg.alternate,
        textAlign = if (isSingleLine) TextAlign.End else TextAlign.Start,
    )
}

private val MinSize = 48.dp

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

@PreviewLightDark
@Composable
private fun SatsFormInputFieldPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            var value by remember { mutableStateOf(false) }

            SatsFormInputField(
                label = "Simply yes or no",
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { value = !value },
            ) {
                Text("$value")
            }
        }
    }
}
