package com.sats.dna.components

import androidx.compose.material3.RadioButton
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

private val colors
    @Composable get() = RadioButtonDefaults.colors(
        selectedColor = SatsTheme.colors.graphicalElements.selector.selected.default,
        unselectedColor = SatsTheme.colors.graphicalElements.selector.unselected.default,
        disabledSelectedColor = SatsTheme.colors.graphicalElements.selector.selected.disabled,
        disabledUnselectedColor = SatsTheme.colors.graphicalElements.selector.unselected.disabled,
    )

@PreviewLightDark
@Composable
private fun EnabledSelectedPreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors.backgrounds.primary.default.bg,
            useMaterial3 = true,
        ) {
            SatsRadioButton(selected = true, onClick = {})
        }
    }
}

@PreviewLightDark
@Composable
private fun EnabledUnselectedPreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors.backgrounds.primary.default.bg,
            useMaterial3 = true,
        ) {
            SatsRadioButton(selected = false, onClick = {})
        }
    }
}

@PreviewLightDark
@Composable
private fun DisabledSelectedPreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors.backgrounds.primary.default.bg,
            useMaterial3 = true,
        ) {
            SatsRadioButton(selected = true, onClick = {}, enabled = false)
        }
    }
}

@PreviewLightDark
@Composable
private fun DisabledUnselectedPreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors.backgrounds.primary.default.bg,
            useMaterial3 = true,
        ) {
            SatsRadioButton(selected = false, onClick = {}, enabled = false)
        }
    }
}
