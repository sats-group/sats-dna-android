package com.sats.dna.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.internal.MaterialText
import com.sats.dna.theme.SatsTheme
import androidx.compose.material.ContentAlpha as M2ContentAlpha
import androidx.compose.material.LocalContentAlpha as M2LocalContentAlpha
import androidx.compose.material.LocalContentColor as M2LocalContentColor
import androidx.compose.material.MaterialTheme as M2MaterialTheme
import androidx.compose.material.OutlinedTextField as M2OutlinedTextField
import androidx.compose.material.TextFieldColors as M2TextFieldColors
import androidx.compose.material.TextFieldDefaults as M2TextFieldDefaults
import androidx.compose.material3.OutlinedTextField as M3OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults as M3OutlinedTextFieldDefaults
import androidx.compose.material3.TextFieldColors as M3TextFieldColors

@Composable
fun SatsOutlinedTextField(
    value: String,
    onValueChange: (newValue: String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    label: @Composable (() -> Unit)? = null,
    placeholder: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    singleLine: Boolean = false,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    minLines: Int = 1,
    colors: M2TextFieldColors = SatsOutlinedTextFieldDefaults.colors(),
) {
    M2OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        enabled = enabled,
        label = label,
        placeholder = placeholder,
        trailingIcon = trailingIcon,
        visualTransformation = visualTransformation,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        maxLines = maxLines,
        minLines = minLines,
        colors = colors,
    )
}

object SatsOutlinedTextFieldDefaults {
    @Composable
    fun colors(
        textColor: Color = M2LocalContentColor.current.copy(M2LocalContentAlpha.current),
        disabledTextColor: Color = textColor.copy(M2ContentAlpha.disabled),
        backgroundColor: Color = Color.Transparent,
        cursorColor: Color = M2MaterialTheme.colors.primary,
        errorCursorColor: Color = M2MaterialTheme.colors.error,
        focusedBorderColor: Color = SatsTheme.colors2.graphicalElements.border.focused,
        unfocusedBorderColor: Color = SatsTheme.colors2.graphicalElements.border.default,
        disabledBorderColor: Color = SatsTheme.colors2.graphicalElements.border.default,
        errorBorderColor: Color = SatsTheme.colors2.graphicalElements.signal.error,
        leadingIconColor: Color = M2MaterialTheme.colors.onSurface.copy(alpha = M2TextFieldDefaults.IconOpacity),
        disabledLeadingIconColor: Color = leadingIconColor.copy(alpha = M2ContentAlpha.disabled),
        errorLeadingIconColor: Color = leadingIconColor,
        trailingIconColor: Color = M2MaterialTheme.colors.onSurface.copy(alpha = M2TextFieldDefaults.IconOpacity),
        disabledTrailingIconColor: Color = trailingIconColor.copy(alpha = M2ContentAlpha.disabled),
        errorTrailingIconColor: Color = M2MaterialTheme.colors.error,
        focusedLabelColor: Color = M2MaterialTheme.colors.primary.copy(alpha = M2ContentAlpha.high),
        unfocusedLabelColor: Color = M2MaterialTheme.colors.onSurface.copy(M2ContentAlpha.medium),
        disabledLabelColor: Color = unfocusedLabelColor.copy(M2ContentAlpha.disabled),
        errorLabelColor: Color = M2MaterialTheme.colors.error,
        placeholderColor: Color = M2MaterialTheme.colors.onSurface.copy(M2ContentAlpha.medium),
        disabledPlaceholderColor: Color = placeholderColor.copy(M2ContentAlpha.disabled),
    ): M2TextFieldColors {
        return M2TextFieldDefaults.outlinedTextFieldColors(
            textColor = textColor,
            disabledTextColor = disabledTextColor,
            backgroundColor = backgroundColor,
            cursorColor = cursorColor,
            errorCursorColor = errorCursorColor,
            focusedBorderColor = focusedBorderColor,
            unfocusedBorderColor = unfocusedBorderColor,
            disabledBorderColor = disabledBorderColor,
            errorBorderColor = errorBorderColor,
            leadingIconColor = leadingIconColor,
            disabledLeadingIconColor = disabledLeadingIconColor,
            errorLeadingIconColor = errorLeadingIconColor,
            trailingIconColor = trailingIconColor,
            disabledTrailingIconColor = disabledTrailingIconColor,
            errorTrailingIconColor = errorTrailingIconColor,
            focusedLabelColor = focusedLabelColor,
            unfocusedLabelColor = unfocusedLabelColor,
            disabledLabelColor = disabledLabelColor,
            errorLabelColor = errorLabelColor,
            placeholderColor = placeholderColor,
            disabledPlaceholderColor = disabledPlaceholderColor,
        )
    }
}

@Composable
fun M3SatsOutlinedTextField(
    value: String,
    onValueChange: (newValue: String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    label: @Composable (() -> Unit)? = null,
    placeholder: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    supportingText: @Composable (() -> Unit)? = null,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    singleLine: Boolean = false,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    minLines: Int = 1,
    colors: M3TextFieldColors = M3SatsOutlinedTextFieldDefaults.colors(),
) {
    M3OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        enabled = enabled,
        label = label,
        placeholder = placeholder,
        trailingIcon = trailingIcon,
        supportingText = supportingText,
        visualTransformation = visualTransformation,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        maxLines = maxLines,
        minLines = minLines,
        colors = colors,
    )
}

object M3SatsOutlinedTextFieldDefaults {
    @Composable
    fun colors(
        focusedTextColor: Color = Color.Unspecified,
        unfocusedTextColor: Color = Color.Unspecified,
        disabledTextColor: Color = Color.Unspecified,
        errorTextColor: Color = Color.Unspecified,
        focusedContainerColor: Color = Color.Unspecified,
        unfocusedContainerColor: Color = Color.Unspecified,
        disabledContainerColor: Color = Color.Unspecified,
        errorContainerColor: Color = Color.Unspecified,
        cursorColor: Color = Color.Unspecified,
        errorCursorColor: Color = Color.Unspecified,
        selectionColors: TextSelectionColors? = null,
        focusedBorderColor: Color = SatsTheme.colors2.graphicalElements.border.focused,
        unfocusedBorderColor: Color = SatsTheme.colors2.graphicalElements.border.default,
        disabledBorderColor: Color = SatsTheme.colors2.graphicalElements.border.default,
        errorBorderColor: Color = SatsTheme.colors2.graphicalElements.signal.error,
        focusedLeadingIconColor: Color = Color.Unspecified,
        unfocusedLeadingIconColor: Color = Color.Unspecified,
        disabledLeadingIconColor: Color = Color.Unspecified,
        errorLeadingIconColor: Color = Color.Unspecified,
        focusedTrailingIconColor: Color = Color.Unspecified,
        unfocusedTrailingIconColor: Color = Color.Unspecified,
        disabledTrailingIconColor: Color = Color.Unspecified,
        errorTrailingIconColor: Color = Color.Unspecified,
        focusedLabelColor: Color = Color.Unspecified,
        unfocusedLabelColor: Color = Color.Unspecified,
        disabledLabelColor: Color = Color.Unspecified,
        errorLabelColor: Color = Color.Unspecified,
        focusedPlaceholderColor: Color = Color.Unspecified,
        unfocusedPlaceholderColor: Color = Color.Unspecified,
        disabledPlaceholderColor: Color = Color.Unspecified,
        errorPlaceholderColor: Color = Color.Unspecified,
        focusedSupportingTextColor: Color = Color.Unspecified,
        unfocusedSupportingTextColor: Color = Color.Unspecified,
        disabledSupportingTextColor: Color = Color.Unspecified,
        errorSupportingTextColor: Color = Color.Unspecified,
        focusedPrefixColor: Color = Color.Unspecified,
        unfocusedPrefixColor: Color = Color.Unspecified,
        disabledPrefixColor: Color = Color.Unspecified,
        errorPrefixColor: Color = Color.Unspecified,
        focusedSuffixColor: Color = Color.Unspecified,
        unfocusedSuffixColor: Color = Color.Unspecified,
        disabledSuffixColor: Color = Color.Unspecified,
        errorSuffixColor: Color = Color.Unspecified,
    ): M3TextFieldColors {
        return M3OutlinedTextFieldDefaults.colors(
            focusedTextColor = focusedTextColor,
            unfocusedTextColor = unfocusedTextColor,
            disabledTextColor = disabledTextColor,
            errorTextColor = errorTextColor,
            focusedContainerColor = focusedContainerColor,
            unfocusedContainerColor = unfocusedContainerColor,
            disabledContainerColor = disabledContainerColor,
            errorContainerColor = errorContainerColor,
            cursorColor = cursorColor,
            errorCursorColor = errorCursorColor,
            selectionColors = selectionColors,
            focusedBorderColor = focusedBorderColor,
            unfocusedBorderColor = unfocusedBorderColor,
            disabledBorderColor = disabledBorderColor,
            errorBorderColor = errorBorderColor,
            focusedLeadingIconColor = focusedLeadingIconColor,
            unfocusedLeadingIconColor = unfocusedLeadingIconColor,
            disabledLeadingIconColor = disabledLeadingIconColor,
            errorLeadingIconColor = errorLeadingIconColor,
            focusedTrailingIconColor = focusedTrailingIconColor,
            unfocusedTrailingIconColor = unfocusedTrailingIconColor,
            disabledTrailingIconColor = disabledTrailingIconColor,
            errorTrailingIconColor = errorTrailingIconColor,
            focusedLabelColor = focusedLabelColor,
            unfocusedLabelColor = unfocusedLabelColor,
            disabledLabelColor = disabledLabelColor,
            errorLabelColor = errorLabelColor,
            focusedPlaceholderColor = focusedPlaceholderColor,
            unfocusedPlaceholderColor = unfocusedPlaceholderColor,
            disabledPlaceholderColor = disabledPlaceholderColor,
            errorPlaceholderColor = errorPlaceholderColor,
            focusedSupportingTextColor = focusedSupportingTextColor,
            unfocusedSupportingTextColor = unfocusedSupportingTextColor,
            disabledSupportingTextColor = disabledSupportingTextColor,
            errorSupportingTextColor = errorSupportingTextColor,
            focusedPrefixColor = focusedPrefixColor,
            unfocusedPrefixColor = unfocusedPrefixColor,
            disabledPrefixColor = disabledPrefixColor,
            errorPrefixColor = errorPrefixColor,
            focusedSuffixColor = focusedSuffixColor,
            unfocusedSuffixColor = unfocusedSuffixColor,
            disabledSuffixColor = disabledSuffixColor,
            errorSuffixColor = errorSuffixColor,
        )
    }
}

@PreviewLightDark
@Composable
private fun SatsOutlinedTextFieldEnabledPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default) {
            SatsOutlinedTextField(
                value = "Text",
                onValueChange = { },
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsOutlinedTextFieldDisabledPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default) {
            SatsOutlinedTextField(
                value = "Text",
                onValueChange = { },
                enabled = false,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun M3SatsOutlinedTextFieldEnabledPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default) {
            M3SatsOutlinedTextField(
                value = "Text",
                onValueChange = { },
                supportingText = { MaterialText("This is a hint text for the user.") },
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun M3SatsOutlinedTextFieldDisabledPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default) {
            M3SatsOutlinedTextField(
                value = "Text",
                onValueChange = { },
                supportingText = { MaterialText("This is a hint text for the user.") },
                enabled = false,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}
