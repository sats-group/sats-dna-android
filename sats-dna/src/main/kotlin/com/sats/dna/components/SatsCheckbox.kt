package com.sats.dna.components

import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
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
        checkedColor = SatsTheme.colors2.graphicalElements.selector.selected.default,
        uncheckedColor = SatsTheme.colors2.graphicalElements.selector.unselected.default,
        disabledCheckedColor = SatsTheme.colors2.graphicalElements.selector.selected.disabled,
        disabledIndeterminateColor = SatsTheme.colors2.graphicalElements.selector.selected.disabled,
        disabledUncheckedColor = SatsTheme.colors2.graphicalElements.selector.unselected.disabled,
        checkmarkColor = SatsTheme.colors2.graphicalElements.selector.indicator,
    )

@LightDarkPreview
@Composable
private fun EnabledCheckedPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            SatsCheckbox(checked = true, onCheckedChange = {})
        }
    }
}

@LightDarkPreview
@Composable
private fun EnabledUncheckedPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            SatsCheckbox(checked = false, onCheckedChange = {})
        }
    }
}

@LightDarkPreview
@Composable
private fun DisabledCheckedPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            SatsCheckbox(checked = true, onCheckedChange = {}, enabled = false)
        }
    }
}

@LightDarkPreview
@Composable
private fun DisabledUncheckedPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            SatsCheckbox(checked = false, onCheckedChange = {}, enabled = false)
        }
    }
}
