package com.sats.dna.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.sats.dna.theme.SatsTheme

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

@PreviewLightDark
@Composable
private fun BooleanEnabledCheckedPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds2.primary.default.bg, useMaterial3 = true) {
            SatsCheckbox(
                checked = true,
                onCheckedChange = null,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun BooleanEnabledUncheckedPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds2.primary.default.bg, useMaterial3 = true) {
            SatsCheckbox(
                checked = false,
                onCheckedChange = null,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun BooleanDisabledCheckedPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds2.primary.default.bg, useMaterial3 = true) {
            SatsCheckbox(
                checked = true,
                onCheckedChange = null,
                enabled = false,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun BooleanDisabledUncheckedPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds2.primary.default.bg, useMaterial3 = true) {
            SatsCheckbox(
                checked = false,
                onCheckedChange = null,
                enabled = false,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

@Preview
@Composable
private fun BooleanEnabledCheckedFixedColorsPreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors2.backgrounds2.fixed.primary.default.bg,
            useMaterial3 = true,
        ) {
            SatsCheckbox(
                checked = true,
                onCheckedChange = null,
                colors = SatsCheckboxColors.Fixed,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

@Preview
@Composable
private fun BooleanEnabledUncheckedFixedColorsPreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors2.backgrounds2.fixed.primary.default.bg,
            useMaterial3 = true,
        ) {
            SatsCheckbox(
                checked = false,
                onCheckedChange = null,
                colors = SatsCheckboxColors.Fixed,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

@Preview
@Composable
private fun BooleanDisabledCheckedFixedColorsPreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors2.backgrounds2.fixed.primary.default.bg,
            useMaterial3 = true,
        ) {
            SatsCheckbox(
                checked = true,
                onCheckedChange = null,
                enabled = false,
                colors = SatsCheckboxColors.Fixed,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

@Preview
@Composable
private fun BooleanDisabledUncheckedFixedColorsPreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors2.backgrounds2.fixed.primary.default.bg,
            useMaterial3 = true,
        ) {
            SatsCheckbox(
                checked = false,
                onCheckedChange = null,
                enabled = false,
                colors = SatsCheckboxColors.Fixed,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun TriStateEnabledDefaultPreview(
    @PreviewParameter(ToggleableStatePreviewProvider::class) state: ToggleableState,
) {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds2.primary.default.bg, useMaterial3 = true) {
            SatsTriStateCheckbox(
                state = state,
                onClick = null,
                enabled = true,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun TriStateDisabledDefaultPreview(
    @PreviewParameter(ToggleableStatePreviewProvider::class) state: ToggleableState,
) {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds2.primary.default.bg, useMaterial3 = true) {
            SatsTriStateCheckbox(
                state = state,
                onClick = null,
                enabled = false,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

@Preview
@Composable
private fun TriStateEnabledFixedColorPreview(
    @PreviewParameter(ToggleableStatePreviewProvider::class) state: ToggleableState,
) {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors2.backgrounds2.fixed.primary.default.bg,
            useMaterial3 = true,
        ) {
            SatsTriStateCheckbox(
                state = state,
                onClick = null,
                enabled = true,
                colors = SatsCheckboxColors.Fixed,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

@Preview
@Composable
private fun TriStateDisabledFixedColorPreview(
    @PreviewParameter(ToggleableStatePreviewProvider::class) state: ToggleableState,
) {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors2.backgrounds2.fixed.primary.default.bg,
            useMaterial3 = true,
        ) {
            SatsTriStateCheckbox(
                state = state,
                onClick = null,
                enabled = false,
                colors = SatsCheckboxColors.Fixed,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
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
