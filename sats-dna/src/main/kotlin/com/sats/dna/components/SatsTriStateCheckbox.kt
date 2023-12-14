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
) {
    TriStateCheckbox(
        state = state,
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = colors,
    )
}

private val colors
    @Composable get() = CheckboxDefaults.colors(
        checkedColor = SatsTheme.colors2.graphicalElements.toggle.selected.default,
        uncheckedColor = SatsTheme.colors2.graphicalElements.toggle.unselected.default,
        disabledCheckedColor = SatsTheme.colors2.graphicalElements.toggle.selected.disabled,
        disabledIndeterminateColor = SatsTheme.colors2.graphicalElements.toggle.selected.disabled,
        disabledUncheckedColor = SatsTheme.colors2.graphicalElements.toggle.unselected.disabled,
        checkmarkColor = SatsTheme.colors2.graphicalElements.toggle.interactiveElement,
    )

@LightDarkPreview
@Composable
private fun EnabledPreview(@PreviewParameter(ToggleableStatePreviewProvider::class) state: ToggleableState) {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            SatsTriStateCheckbox(state, onClick = null, enabled = true)
        }
    }
}

@LightDarkPreview
@Composable
private fun DisabledPreview(@PreviewParameter(ToggleableStatePreviewProvider::class) state: ToggleableState) {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            SatsTriStateCheckbox(state, onClick = null, enabled = false)
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
