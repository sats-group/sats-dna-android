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
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.InputTransformation
import androidx.compose.foundation.text.input.KeyboardActionHandler
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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

@Composable
fun SatsFormTextField(
    label: String,
    textFieldState: TextFieldState,
    modifier: Modifier = Modifier,
    hint: String? = null,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    onKeyboardAction: KeyboardActionHandler? = null,
    inputTransformation: InputTransformation? = null,
    trailingText: String? = null,
    lineLimits: TextFieldLineLimits = TextFieldLineLimits.SingleLine,
    isEnabled: Boolean = true,
) {
    val isSingleLine = lineLimits is TextFieldLineLimits.SingleLine
    val textStyle = valueTextStyle(isSingleLine = isSingleLine, isEnabled = isEnabled)

    BasicTextField(
        state = textFieldState,
        modifier = modifier.sizeIn(minWidth = MinSize, minHeight = MinSize),
        textStyle = textStyle,
        cursorBrush = SolidColor(textStyle.color),
        lineLimits = lineLimits,
        keyboardOptions = keyboardOptions,
        onKeyboardAction = onKeyboardAction,
        inputTransformation = inputTransformation,
        enabled = isEnabled,
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
fun SatsFormTextFieldSingleLinePlaceholder(
    label: String,
    value: String,
    modifier: Modifier = Modifier,
    hint: String? = null,
) {
    SatsSurface(modifier.sizeIn(minWidth = MinSize, minHeight = MinSize)) {
        InputFieldContainer(
            isSingleLine = true,
            label = label,
            hint = hint,
        ) {
            SatsPlaceholderText(value)
        }
    }
}

@Composable
fun SatsFormTextFieldMultiLinePlaceholder(
    label: String,
    placeholderLines: Int,
    minHeightInLines: Int,
    modifier: Modifier = Modifier,
    hint: String? = null,
) {
    SatsSurface(modifier.sizeIn(minWidth = MinSize, minHeight = MinSize)) {
        InputFieldContainer(
            isSingleLine = false,
            label = label,
            hint = hint,
        ) {
            Box {
                SatsPlaceholderText("\n".repeat((minHeightInLines - 1).coerceAtLeast(0)))
                SatsPlaceholderParagraph(lines = placeholderLines)
            }
        }
    }
}

@Composable
fun SatsFormInputField(
    label: String,
    modifier: Modifier = Modifier,
    hint: String? = null,
    isEnabled: Boolean = true,
    content: @Composable () -> Unit,
) {
    InputFieldContainer(
        modifier = modifier.sizeIn(minWidth = MinSize, minHeight = MinSize),
        isSingleLine = true,
        label = label,
        hint = hint,
    ) {
        ProvideTextStyle(
            value = valueTextStyle(isSingleLine = true, isEnabled = isEnabled),
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
    isEnabled: Boolean = true,
) {
    InputFieldContainer(
        modifier = modifier.sizeIn(minWidth = MinSize, minHeight = MinSize),
        isSingleLine = true,
        label = label,
        hint = hint,
    ) {
        Row(horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xxs)) {
            DateTimeBox(formatDate(value.date), onDateClicked, isEnabled = isEnabled)
            DateTimeBox(formatTime(value.time), onTimeClicked, isEnabled = isEnabled)
        }
    }
}

@Composable
fun SatsFormDateTimeInputFieldPlaceholder(
    label: String,
    formatDate: (LocalDate) -> String,
    formatTime: (LocalTime) -> String,
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
            val value = LocalDateTime(2000, 1, 10, 10, 10, 10)
            DateTimeBoxPlaceholder(formatDate(value.date))
            DateTimeBoxPlaceholder(formatTime(value.time))
        }
    }
}

@Composable
private fun DateTimeBox(
    label: String,
    onClick: () -> Unit,
    isEnabled: Boolean,
    modifier: Modifier = Modifier,
) {
    SatsSurface(
        modifier = modifier,
        color = SatsTheme.colors.surfaces.secondary.default.bg,
        shape = SatsTheme.shapes.roundedCorners.extraSmall,
    ) {
        val color: Color = if (isEnabled) {
            SatsTheme.colors.buttons.action.default.fg
        } else {
            SatsTheme.colors.buttons.action.disabled.fg
        }

        Text(
            text = label,
            modifier = Modifier
                .clickable(enabled = isEnabled, onClick = onClick)
                .padding(
                    horizontal = SatsTheme.spacing.xs,
                    vertical = SatsTheme.spacing.xxs,
                ),
            color = color,
        )
    }
}

@Composable
private fun DateTimeBoxPlaceholder(
    label: String,
    modifier: Modifier = Modifier,
) {
    SatsPlaceholderBox(
        modifier = modifier,
        shape = SatsTheme.shapes.roundedCorners.extraSmall,
    ) {
        SatsPlaceholderText(
            text = label,
            modifier = Modifier
                .padding(
                    horizontal = SatsTheme.spacing.xs,
                    vertical = SatsTheme.spacing.xxs,
                ),
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
                verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xs),
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
                color = SatsTheme.colors.surfaces.primary.default.fgAlternate,
            )
        }
    }
}

@Composable
private fun valueTextStyle(isSingleLine: Boolean, isEnabled: Boolean): TextStyle {
    val color = if (isEnabled) {
        SatsTheme.colors.surfaces.primary.default.fgAlternate
    } else {
        SatsTheme.colors.surfaces.primary.default.fgDisabled
    }

    return SatsTheme.typography.normal.basic.copy(
        color = color,
        textAlign = if (isSingleLine) TextAlign.End else TextAlign.Start,
    )
}

private val MinSize = 48.dp

@OptIn(ExperimentalFoundationApi::class)
@PreviewLightDark
@Composable
private fun SatsFormTextFieldSingleLinePreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
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
private fun SatsFormTextFieldPlaceholderSingleLinePreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors.backgrounds.primary.default.bg,
        ) {
            SatsFormTextFieldSingleLinePlaceholder(
                label = "Sample Text",
                value = "Sample text",
                modifier = Modifier.fillMaxWidth(),
                hint = "(optional)",
            )
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@PreviewLightDark
@Composable
private fun SatsFormTextFieldSingleLineDurationPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            SatsFormTextField(
                textFieldState = rememberTextFieldState("45"),
                label = "Duration",
                trailingText = "min",
                modifier = Modifier.fillMaxWidth(),
                inputTransformation = {
                    if (asCharSequence().any { !it.isDigit() }) {
                        revertAllChanges()
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
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            val text = buildString {
                repeat(10) {
                    append("Lorem ipsum dolor sit amet. ")
                }
            }.trim()

            SatsFormTextField(
                textFieldState = rememberTextFieldState(text),
                label = "Sample Text",
                hint = "(optional)",
                lineLimits = TextFieldLineLimits.MultiLine(
                    minHeightInLines = 5,
                    maxHeightInLines = 6,
                ),
                modifier = Modifier.fillMaxWidth(),
            )
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@PreviewLightDark
@Composable
private fun SatsFormTextFieldPlaceholderMultiLinePreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors.backgrounds.primary.default.bg,
        ) {
            SatsFormTextFieldMultiLinePlaceholder(
                label = "Sample Text",
                placeholderLines = 2,
                minHeightInLines = 6,
                modifier = Modifier.fillMaxWidth(),
                hint = "(optional)",
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsFormInputFieldPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
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
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            val selectedDateTime by remember { mutableStateOf(LocalDateTime(2020, 1, 1, 12, 0)) }

            SatsFormDateTimeInputField(
                label = "Date and time",
                value = selectedDateTime,
                onDateClicked = { },
                onTimeClicked = { },
                formatDate = {
                    DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)
                        .format(it.toJavaLocalDate())
                },
                formatTime = {
                    DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)
                        .format(it.toJavaLocalTime())
                },
                modifier = Modifier.fillMaxWidth(),
            )
        }
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@PreviewLightDark
@Composable
private fun SatsFormDateTimeInputFieldPlaceholderPreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors.backgrounds.primary.default.bg,
        ) {
            SatsFormDateTimeInputFieldPlaceholder(
                label = "Date and time",
                formatDate = {
                    DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)
                        .format(it.toJavaLocalDate())
                },
                formatTime = {
                    DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)
                        .format(it.toJavaLocalTime())
                },
                modifier = Modifier.fillMaxWidth(),
            )
        }
    }
}
