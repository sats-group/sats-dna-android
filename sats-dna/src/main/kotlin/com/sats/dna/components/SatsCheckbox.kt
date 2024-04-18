package com.sats.dna.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxColors
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
    colors: SatsCheckboxColors = SatsCheckboxColors.Primary,
) {
    Checkbox(
        checked = checked,
        onCheckedChange = onCheckedChange,
        modifier = modifier,
        enabled = enabled,
        colors = when (colors) {
            SatsCheckboxColors.Primary -> primaryColors
            SatsCheckboxColors.Secondary -> secondaryColors
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
    colors: SatsCheckboxColors = SatsCheckboxColors.Primary,
) {
    TriStateCheckbox(
        state = state,
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = when (colors) {
            SatsCheckboxColors.Primary -> primaryColors
            SatsCheckboxColors.Secondary -> secondaryColors
            SatsCheckboxColors.Fixed -> fixedColors
        },
    )
}

enum class SatsCheckboxColors {
    Primary, Secondary, Fixed
}

private val primaryColors: CheckboxColors
    @Composable get() {
        val primary = SatsTheme.colors.graphicalElements.selector.primary

        return CheckboxDefaults.colors(
            checkedColor = primary.selected.default.bg,
            uncheckedColor = primary.unselected.default.bg,
            disabledCheckedColor = primary.selected.disabled.bg,
            disabledIndeterminateColor = primary.selected.disabled.bg,
            disabledUncheckedColor = primary.unselected.disabled.bg,
            checkmarkColor = primary.selected.default.fg,
        )
    }

private val secondaryColors: CheckboxColors
    @Composable get() {
        val secondary = SatsTheme.colors.graphicalElements.selector.secondary

        return CheckboxDefaults.colors(
            checkedColor = secondary.selected.default.bg,
            uncheckedColor = secondary.unselected.default.bg,
            disabledCheckedColor = secondary.selected.disabled.bg,
            disabledIndeterminateColor = secondary.selected.disabled.bg,
            disabledUncheckedColor = secondary.unselected.disabled.bg,
            checkmarkColor = secondary.selected.default.fg,
        )
    }

private val fixedColors: CheckboxColors
    @Composable get() {
        val selectorFixed = SatsTheme.colors.graphicalElements.selectorFixed

        return CheckboxDefaults.colors(
            checkedColor = selectorFixed.selected.default.bg,
            uncheckedColor = selectorFixed.unselected.default.bg,
            disabledCheckedColor = selectorFixed.selected.disabled.bg,
            disabledIndeterminateColor = selectorFixed.selected.disabled.bg,
            disabledUncheckedColor = selectorFixed.unselected.disabled.bg,
            checkmarkColor = selectorFixed.selected.default.fg,
        )
    }

@PreviewLightDark
@Composable
private fun BooleanEnabledCheckedPrimaryPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg, useMaterial3 = true) {
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
private fun BooleanEnabledUncheckedPrimaryPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg, useMaterial3 = true) {
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
private fun BooleanDisabledCheckedPrimaryPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg, useMaterial3 = true) {
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
private fun BooleanDisabledUncheckedPrimaryPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg, useMaterial3 = true) {
            SatsCheckbox(
                checked = false,
                onCheckedChange = null,
                enabled = false,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun BooleanEnabledCheckedSecondaryPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg, useMaterial3 = true) {
            SatsCheckbox(
                colors = SatsCheckboxColors.Secondary,
                checked = true,
                onCheckedChange = null,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun BooleanEnabledUncheckedSecondaryPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg, useMaterial3 = true) {
            SatsCheckbox(
                colors = SatsCheckboxColors.Secondary,
                checked = false,
                onCheckedChange = null,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun BooleanDisabledCheckedSecondaryPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg, useMaterial3 = true) {
            SatsCheckbox(
                colors = SatsCheckboxColors.Secondary,
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
private fun BooleanDisabledUncheckedSecondaryPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg, useMaterial3 = true) {
            SatsCheckbox(
                colors = SatsCheckboxColors.Secondary,
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
            color = SatsTheme.colors.backgrounds.fixed.primary.default.bg,
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
            color = SatsTheme.colors.backgrounds.fixed.primary.default.bg,
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
            color = SatsTheme.colors.backgrounds.fixed.primary.default.bg,
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
            color = SatsTheme.colors.backgrounds.fixed.primary.default.bg,
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
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg, useMaterial3 = true) {
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
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg, useMaterial3 = true) {
            SatsTriStateCheckbox(
                state = state,
                onClick = null,
                enabled = false,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun TriStateEnabledDefaultSecondaryPreview(
    @PreviewParameter(ToggleableStatePreviewProvider::class) state: ToggleableState,
) {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg, useMaterial3 = true) {
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
private fun TriStateDisabledDefaultSecondaryPreview(
    @PreviewParameter(ToggleableStatePreviewProvider::class) state: ToggleableState,
) {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg, useMaterial3 = true) {
            SatsTriStateCheckbox(
                colors = SatsCheckboxColors.Secondary,
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
            color = SatsTheme.colors.backgrounds.fixed.primary.default.bg,
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
            color = SatsTheme.colors.backgrounds.fixed.primary.default.bg,
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
