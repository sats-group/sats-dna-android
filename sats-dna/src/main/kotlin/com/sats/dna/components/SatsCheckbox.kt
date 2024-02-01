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
    colors: SatsCheckboxColors = SatsCheckboxColors.Default,
) {
    Checkbox(
        checked = checked,
        onCheckedChange = onCheckedChange,
        modifier = modifier,
        enabled = enabled,
        colors = when (colors) {
            SatsCheckboxColors.Default -> defaultColors
            SatsCheckboxColors.Fixed -> fixedColors
        },
    )
}

enum class SatsCheckboxColors {
    Default, Fixed
}

private val defaultColors
    @Composable get() = CheckboxDefaults.colors(
        checkedColor = SatsTheme.colors2.graphicalElements.selector.selected.default,
        uncheckedColor = SatsTheme.colors2.graphicalElements.selector.unselected.default,
        disabledCheckedColor = SatsTheme.colors2.graphicalElements.selector.selected.disabled,
        disabledIndeterminateColor = SatsTheme.colors2.graphicalElements.selector.selected.disabled,
        disabledUncheckedColor = SatsTheme.colors2.graphicalElements.selector.unselected.disabled,
        checkmarkColor = SatsTheme.colors2.graphicalElements.selector.indicator,
    )

private val fixedColors
    @Composable get() = CheckboxDefaults.colors(
        checkedColor = SatsTheme.colors2.graphicalElements.selectorFixed.selected.default,
        uncheckedColor = SatsTheme.colors2.graphicalElements.selectorFixed.unselected.default,
        disabledCheckedColor = SatsTheme.colors2.graphicalElements.selectorFixed.selected.disabled,
        disabledIndeterminateColor = SatsTheme.colors2.graphicalElements.selectorFixed.selected.disabled,
        disabledUncheckedColor = SatsTheme.colors2.graphicalElements.selectorFixed.unselected.disabled,
        checkmarkColor = SatsTheme.colors2.graphicalElements.selectorFixed.indicator,
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

@LightDarkPreview
@Composable
private fun EnabledCheckedFixedColorsPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.fixed.bg.default, useMaterial3 = true) {
            SatsCheckbox(checked = true, onCheckedChange = {}, colors = SatsCheckboxColors.Fixed)
        }
    }
}

@LightDarkPreview
@Composable
private fun EnabledUncheckedFixedColorsPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.fixed.bg.default, useMaterial3 = true) {
            SatsCheckbox(checked = false, onCheckedChange = {}, colors = SatsCheckboxColors.Fixed)
        }
    }
}

@LightDarkPreview
@Composable
private fun DisabledCheckedFixedColorsPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.fixed.bg.default, useMaterial3 = true) {
            SatsCheckbox(checked = true, onCheckedChange = {}, enabled = false, colors = SatsCheckboxColors.Fixed)
        }
    }
}

@LightDarkPreview
@Composable
private fun DisabledUncheckedFixedColorsPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.fixed.bg.default, useMaterial3 = true) {
            SatsCheckbox(checked = false, onCheckedChange = {}, enabled = false, colors = SatsCheckboxColors.Fixed)
        }
    }
}
