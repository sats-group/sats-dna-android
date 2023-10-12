package com.sats.dna.components

import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.VisualTransformation
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

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
    colors: TextFieldColors = OutlinedTextFieldDefaults.colors(),
) {
    OutlinedTextField(
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

@LightDarkPreview
@Composable
private fun EnabledOutlinedTextFieldPreview() {
    SatsTheme {
        Surface(color = SatsTheme.colors.background.primary) {
            SatsOutlinedTextField(value = "Text", onValueChange = { })
        }
    }
}

@LightDarkPreview
@Composable
private fun DisabledOutlinedTextFieldPreview() {
    SatsTheme {
        Surface(color = SatsTheme.colors.background.primary) {
            SatsOutlinedTextField(value = "Text", onValueChange = { }, enabled = false)
        }
    }
}
