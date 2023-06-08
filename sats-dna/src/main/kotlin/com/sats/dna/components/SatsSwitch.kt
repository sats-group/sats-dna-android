package com.sats.dna.components

import androidx.compose.material.Surface
import androidx.compose.material.Switch
import androidx.compose.material.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

@Composable
fun SatsSwitch(
    checked: Boolean,
    onCheckedChange: ((Boolean) -> Unit)?,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    Switch(
        checked = checked,
        onCheckedChange = onCheckedChange,
        modifier = modifier,
        enabled = enabled,
        colors = colors,
    )
}

private val colors
    @Composable get() = SwitchDefaults.colors(
        checkedThumbColor = SatsTheme.colors.onBackground.controls.enabledOn,
        uncheckedThumbColor = SatsTheme.colors.onBackground.controls.enabledOff,
        disabledCheckedThumbColor = SatsTheme.colors.onBackground.controls.disabledOn,
        disabledUncheckedThumbColor = SatsTheme.colors.onBackground.controls.disabledOff,
    )

@LightDarkPreview
@Composable
private fun EnabledSelectedPreview() {
    SatsTheme {
        Surface(color = SatsTheme.colors.background.primary) {
            SatsSwitch(checked = true, onCheckedChange = {})
        }
    }
}

@LightDarkPreview
@Composable
private fun EnabledUnselectedPreview() {
    SatsTheme {
        Surface(color = SatsTheme.colors.background.primary) {
            SatsSwitch(checked = false, onCheckedChange = {})
        }
    }
}

@LightDarkPreview
@Composable
private fun DisabledSelectedPreview() {
    SatsTheme {
        Surface(color = SatsTheme.colors.background.primary) {
            SatsSwitch(checked = true, onCheckedChange = {}, enabled = false)
        }
    }
}

@LightDarkPreview
@Composable
private fun DisabledUnselectedPreview() {
    SatsTheme {
        Surface(color = SatsTheme.colors.background.primary) {
            SatsSwitch(checked = false, onCheckedChange = {}, enabled = false)
        }
    }
}
