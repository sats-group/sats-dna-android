package com.sats.dna.components

import androidx.compose.material.CheckboxDefaults
import androidx.compose.material.Surface
import androidx.compose.material.TriStateCheckbox
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
        checkedColor = SatsTheme.colors.onBackground.controls.enabledOn,
        uncheckedColor = SatsTheme.colors.onBackground.controls.enabledOff,
        disabledColor = SatsTheme.colors.onBackground.controls.disabledOff,
        disabledIndeterminateColor = SatsTheme.colors.onBackground.controls.disabledOn,
    )

@LightDarkPreview
@Composable
private fun EnabledPreview(@PreviewParameter(ToggleableStatePreviewProvider::class) state: ToggleableState) {
    SatsTheme {
        Surface(color = SatsTheme.colors.background.primary) {
            SatsTriStateCheckbox(state, onClick = null, enabled = true)
        }
    }
}

@LightDarkPreview
@Composable
private fun DisabledPreview(@PreviewParameter(ToggleableStatePreviewProvider::class) state: ToggleableState) {
    SatsTheme {
        Surface(color = SatsTheme.colors.background.primary) {
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
