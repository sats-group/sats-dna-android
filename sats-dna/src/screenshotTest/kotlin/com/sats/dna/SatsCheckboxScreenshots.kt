package com.sats.dna

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.sats.dna.components.SatsCheckbox
import com.sats.dna.components.SatsCheckboxColors
import com.sats.dna.components.SatsSurface
import com.sats.dna.components.SatsTriStateCheckbox
import com.sats.dna.theme.SatsTheme

class SatsCheckboxScreenshots {
    @PreviewLightDark
    @Composable
    private fun BooleanEnabledCheckedPrimaryPreview() {
        SatsTheme {
            SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
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
            SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
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
            SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
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
            SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
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
            SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
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
            SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
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
            SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
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
            SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
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
            SatsSurface(color = SatsTheme.colors.backgrounds.fixed.primary.default.bg) {
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
            SatsSurface(color = SatsTheme.colors.backgrounds.fixed.primary.default.bg) {
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
            SatsSurface(color = SatsTheme.colors.backgrounds.fixed.primary.default.bg) {
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
            SatsSurface(color = SatsTheme.colors.backgrounds.fixed.primary.default.bg) {
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
            SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
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
            SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
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
            SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
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
            SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
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
            SatsSurface(color = SatsTheme.colors.backgrounds.fixed.primary.default.bg) {
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
            SatsSurface(color = SatsTheme.colors.backgrounds.fixed.primary.default.bg) {
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
}
