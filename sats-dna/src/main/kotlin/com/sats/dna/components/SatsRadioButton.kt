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
    enabled: Boolean = true,
) {
    RadioButton(selected, onClick, modifier, enabled, colors = colors)
}

private val colors: RadioButtonColors
    @Composable get() {
        val primary = SatsTheme.colors.graphicalElements.selector.primary

        return RadioButtonDefaults.colors(
            selectedColor = primary.selected.default.bg,
            unselectedColor = primary.unselected.default.outline,
            disabledSelectedColor = primary.selected.disabled.bg,
            disabledUnselectedColor = primary.unselected.disabled.outline,
        )
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
