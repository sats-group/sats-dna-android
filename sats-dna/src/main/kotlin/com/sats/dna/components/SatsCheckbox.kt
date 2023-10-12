package com.sats.dna.components

import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

@Composable
fun SatsCheckbox(
    checked: Boolean,
    onCheckedChange: ((Boolean) -> Unit)?,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    Checkbox(
        checked = checked,
        onCheckedChange = onCheckedChange,
        modifier = modifier,
        enabled = enabled,
        colors = colors,
    )
}

private val colors
    @Composable get() = CheckboxDefaults.colors(
        checkedColor = SatsTheme.colors.onBackground.controls.enabledOn,
        uncheckedColor = SatsTheme.colors.onBackground.controls.enabledOff,
        disabledCheckedColor = SatsTheme.colors.onBackground.controls.disabledOn,
        disabledIndeterminateColor = SatsTheme.colors.onBackground.controls.disabledOn,
        disabledUncheckedColor = SatsTheme.colors.onBackground.controls.disabledOff,
    )

@LightDarkPreview
@Composable
private fun EnabledCheckedPreview() {
    SatsTheme {
        Surface(color = SatsTheme.colors.background.primary) {
            SatsCheckbox(checked = true, onCheckedChange = {})
        }
    }
}

@LightDarkPreview
@Composable
private fun EnabledUncheckedPreview() {
    SatsTheme {
        Surface(color = SatsTheme.colors.background.primary) {
            SatsCheckbox(checked = false, onCheckedChange = {})
        }
    }
}

@LightDarkPreview
@Composable
private fun DisabledCheckedPreview() {
    SatsTheme {
        Surface(color = SatsTheme.colors.background.primary) {
            SatsCheckbox(checked = true, onCheckedChange = {}, enabled = false)
        }
    }
}

@LightDarkPreview
@Composable
private fun DisabledUncheckedPreview() {
    SatsTheme {
        Surface(color = SatsTheme.colors.background.primary) {
            SatsCheckbox(checked = false, onCheckedChange = {}, enabled = false)
        }
    }
}
