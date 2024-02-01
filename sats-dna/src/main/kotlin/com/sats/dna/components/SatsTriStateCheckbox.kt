package com.sats.dna.components

import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

@Composable
fun SatsTriStateCheckbox(
    state: ToggleableState,
    onClick: (() -> Unit)?,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: SatsCheckboxColors = SatsCheckboxColors.Default,
) {
    TriStateCheckbox(
        state = state,
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = when (colors) {
            SatsCheckboxColors.Default -> defaultColors
            SatsCheckboxColors.Fixed -> fixedColors
        },
    )
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
private fun EnabledDefaultPreview(@PreviewParameter(ToggleableStatePreviewProvider::class) state: ToggleableState) {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            SatsTriStateCheckbox(state, onClick = null, enabled = true)
        }
    }
}

@LightDarkPreview
@Composable
private fun DisabledDefaultPreview(@PreviewParameter(ToggleableStatePreviewProvider::class) state: ToggleableState) {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            SatsTriStateCheckbox(state, onClick = null, enabled = false)
        }
    }
}

@LightDarkPreview
@Composable
private fun EnabledFixedPreview(@PreviewParameter(ToggleableStatePreviewProvider::class) state: ToggleableState) {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.fixed.bg.default, useMaterial3 = true) {
            SatsTriStateCheckbox(state, onClick = null, enabled = true, colors = SatsCheckboxColors.Fixed)
        }
    }
}

@LightDarkPreview
@Composable
private fun DisabledFixedPreview(@PreviewParameter(ToggleableStatePreviewProvider::class) state: ToggleableState) {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.fixed.bg.default, useMaterial3 = true) {
            SatsTriStateCheckbox(state, onClick = null, enabled = false, colors = SatsCheckboxColors.Fixed)
        }
    }
}

private class ToggleableStatePreviewProvider : PreviewParameterProvider<ToggleableState> {
    override val values = sequenceOf(
        ToggleableState.Off,
        ToggleableState.Indeterminate,
        ToggleableState.On,
    )
}
