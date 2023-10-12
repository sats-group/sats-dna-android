package com.sats.dna.components

import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

@Composable
fun SatsRadioButton(
    selected: Boolean,
    onClick: (() -> Unit)?,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    RadioButton(selected, onClick, modifier, enabled, colors = colors)
}

private val colors
    @Composable get() = RadioButtonDefaults.colors(
        selectedColor = SatsTheme.colors.onBackground.controls.enabledOn,
        unselectedColor = SatsTheme.colors.onBackground.controls.enabledOff,
        disabledSelectedColor = SatsTheme.colors.onBackground.controls.disabledOn,
        disabledUnselectedColor = SatsTheme.colors.onBackground.controls.disabledOff,
    )

@LightDarkPreview
@Composable
private fun EnabledSelectedPreview() {
    SatsTheme {
        Surface(color = SatsTheme.colors.background.primary) {
            SatsRadioButton(selected = true, onClick = {})
        }
    }
}

@LightDarkPreview
@Composable
private fun EnabledUnselectedPreview() {
    SatsTheme {
        Surface(color = SatsTheme.colors.background.primary) {
            SatsRadioButton(selected = false, onClick = {})
        }
    }
}

@LightDarkPreview
@Composable
private fun DisabledSelectedPreview() {
    SatsTheme {
        Surface(color = SatsTheme.colors.background.primary) {
            SatsRadioButton(selected = true, onClick = {}, enabled = false)
        }
    }
}

@LightDarkPreview
@Composable
private fun DisabledUnselectedPreview() {
    SatsTheme {
        Surface(color = SatsTheme.colors.background.primary) {
            SatsRadioButton(selected = false, onClick = {}, enabled = false)
        }
    }
}
