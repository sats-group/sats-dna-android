package com.sats.dna.components

import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonColors
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsRadioButton(
    selected: Boolean,
    onClick: (() -> Unit)?,
    modifier: Modifier = Modifier,
    color: SatsRadioButtonColors = SatsRadioButtonColors.Primary,
    enabled: Boolean = true,
) {
    RadioButton(selected, onClick, modifier, enabled, colors = color.colors)
}

enum class SatsRadioButtonColors {
    Primary,
    Fixed,
}

private val SatsRadioButtonColors.colors: RadioButtonColors
    @Composable get() = when (this) {
        SatsRadioButtonColors.Primary -> {
            val primary = SatsTheme.colors.graphicalElements.selector.primary

            RadioButtonDefaults.colors(
                selectedColor = primary.selected.default.bg,
                unselectedColor = primary.unselected.default.outline,
                disabledSelectedColor = primary.selected.disabled.bg,
                disabledUnselectedColor = primary.unselected.disabled.outline,
            )
        }

        SatsRadioButtonColors.Fixed -> {
            val fixed = SatsTheme.colors.graphicalElements.selectorFixed

            RadioButtonDefaults.colors(
                selectedColor = fixed.selected.default.bg,
                unselectedColor = fixed.unselected.default.outline,
                disabledSelectedColor = fixed.selected.disabled.bg,
                disabledUnselectedColor = fixed.unselected.disabled.outline,
            )
        }
    }

@PreviewLightDark
@Composable
private fun EnabledSelectedPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            SatsRadioButton(selected = true, onClick = {})
        }
    }
}

@PreviewLightDark
@Composable
private fun EnabledUnselectedPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            SatsRadioButton(selected = false, onClick = {})
        }
    }
}

@PreviewLightDark
@Composable
private fun DisabledSelectedPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            SatsRadioButton(selected = true, onClick = {}, enabled = false)
        }
    }
}

@PreviewLightDark
@Composable
private fun DisabledUnselectedPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            SatsRadioButton(selected = false, onClick = {}, enabled = false)
        }
    }
}

@PreviewLightDark
@Composable
private fun EnabledSelectedFixedPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.fixed.primary.default.bg) {
            SatsRadioButton(
                selected = true,
                color = SatsRadioButtonColors.Fixed,
                onClick = {},
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun EnabledUnselectedFixedPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.fixed.primary.default.bg) {
            SatsRadioButton(
                selected = false,
                color = SatsRadioButtonColors.Fixed,
                onClick = {},
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun DisabledSelectedFixedPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.fixed.primary.default.bg) {
            SatsRadioButton(
                selected = true,
                onClick = {},
                color = SatsRadioButtonColors.Fixed,
                enabled = false,
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun DisabledUnselectedFixedPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.fixed.primary.default.bg) {
            SatsRadioButton(
                selected = false,
                onClick = {},
                color = SatsRadioButtonColors.Fixed,
                enabled = false,
            )
        }
    }
}
