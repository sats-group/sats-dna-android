package com.sats.dna.components

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text2.BasicTextField2
import androidx.compose.foundation.text2.input.InputTransformation
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
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.LocalTime
import kotlinx.datetime.toJavaLocalDate
import kotlinx.datetime.toJavaLocalTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

@ExperimentalFoundationApi
@Composable
fun SatsFormTextField(
    label: String,
    textFieldState: TextFieldState,
    modifier: Modifier = Modifier,
    hint: String? = null,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    inputTransformation: InputTransformation? = null,
    trailingText: String? = null,
    lineLimits: TextFieldLineLimits = TextFieldLineLimits.SingleLine,
) {
    val isSingleLine = lineLimits is TextFieldLineLimits.SingleLine
    val textStyle = valueTextStyle(isSingleLine = isSingleLine)

    BasicTextField2(
        state = textFieldState,
        modifier = modifier.sizeIn(minWidth = MinSize, minHeight = MinSize),
        textStyle = textStyle,
        cursorBrush = SolidColor(textStyle.color),
        lineLimits = lineLimits,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        inputTransformation = inputTransformation,
        decorator = { innerTextField ->
            InputFieldContainer(
                isSingleLine = isSingleLine,
                label = label,
                hint = hint,
            ) {
                Row {
                    innerTextField()

                    if (isSingleLine && trailingText != null) {
                        Text(" $trailingText", style = textStyle)
                    }
                }
            }
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
        isSingleLine = true,
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
fun SatsFormDateTimeInputField(
    label: String,
    value: LocalDateTime,
    formatDate: (LocalDate) -> String,
    formatTime: (LocalTime) -> String,
    onDateClicked: () -> Unit,
    onTimeClicked: () -> Unit,
    modifier: Modifier = Modifier,
    hint: String? = null,
) {
    InputFieldContainer(
        modifier = modifier.sizeIn(minWidth = MinSize, minHeight = MinSize),
        isSingleLine = true,
        label = label,
        hint = hint,
    ) {
        Row(horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xxs)) {
            DateTimeBox(label = formatDate(value.date), onClick = onDateClicked)

            DateTimeBox(label = formatTime(value.time), onClick = onTimeClicked)
        }
    }
}

@Composable
private fun DateTimeBox(label: String, onClick: () -> Unit, modifier: Modifier = Modifier) {
    SatsSurface(
        modifier = modifier,
        color = SatsTheme.colors2.surfaces.secondary.bg.default,
        shape = SatsTheme.shapes.roundedCorners.extraSmall,
    ) {
        Text(
            text = label,
            modifier = Modifier
                .clickable(onClick = onClick)
                .padding(
                    horizontal = SatsTheme.spacing.xs,
                    vertical = SatsTheme.spacing.xxs,
                ),
            color = SatsTheme.colors2.buttons.action.default,
        )
    }
}

@Composable
private fun InputFieldContainer(
    isSingleLine: Boolean,
    label: String,
    hint: String?,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    SatsSurface(modifier) {
        if (isSingleLine) {
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
        } else {
            Column(
                Modifier.padding(
                    vertical = SatsTheme.spacing.xs,
                    horizontal = SatsTheme.spacing.m,
                ),
            ) {
                LabelAndHint(label, hint)

                content()
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
                textFieldState = rememberTextFieldState("Lorem ipsum"),
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
private fun SatsFormTextFieldSingleLineDurationPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            SatsFormTextField(
                textFieldState = rememberTextFieldState("45"),
                label = "Duration",
                trailingText = "min",
                modifier = Modifier.fillMaxWidth(),
                inputTransformation = { _, valueWithChanges ->
                    if (valueWithChanges.asCharSequence().any { !it.isDigit() }) {
                        valueWithChanges.revertAllChanges()
                    }
                },
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

@RequiresApi(Build.VERSION_CODES.O)
@PreviewLightDark
@Composable
private fun SatsFormDateTimeInputFieldPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            val selectedDateTime by remember { mutableStateOf(LocalDateTime(2020, 1, 1, 12, 0)) }

            SatsFormDateTimeInputField(
                label = "Date and time",
                value = selectedDateTime,
                onDateClicked = { },
                onTimeClicked = { },
                formatDate = { DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(it.toJavaLocalDate()) },
                formatTime = { DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).format(it.toJavaLocalTime()) },
                modifier = Modifier.fillMaxWidth(),
            )
        }
    }
}
