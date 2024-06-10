package com.sats.dna.sample.screens.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.SatsRadioButton
import com.sats.dna.components.SatsRadioButtonColors
import com.sats.dna.components.SatsSurface
import com.sats.dna.sample.screens.SampleScreen
import com.sats.dna.theme.SatsTheme

@Composable
fun RadioButtonsSampleScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    SampleScreen("Radio Buttons", navigateUp, modifier) { innerPadding ->
        Column(
            Modifier
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m)
                .fillMaxSize()
                .wrapContentSize(),
            Arrangement.spacedBy(SatsTheme.spacing.m, Alignment.CenterVertically),
        ) {
            Section("Primary colors") {
                Column(
                    verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xs),
                ) {
                    LabeledRadioButton("Enabled, unselected", enabled = true, selected = false)
                    LabeledRadioButton("Enabled, selected", enabled = true, selected = true)
                    LabeledRadioButton("Disabled, unselected", enabled = false, selected = false)
                    LabeledRadioButton("Disabled, selected", enabled = false, selected = true)
                }
            }
            Section(
                label = "Fixed colors",
                isFixedBackground = true,
            ) {
                Column(
                    verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xs),
                ) {
                    LabeledRadioButton(
                        label = "Enabled, unselected",
                        enabled = true,
                        colors = SatsRadioButtonColors.Fixed,
                        selected = false,
                    )
                    LabeledRadioButton(
                        label = "Enabled, selected",
                        enabled = true,
                        colors = SatsRadioButtonColors.Fixed,
                        selected = true,
                    )
                    LabeledRadioButton(
                        label = "Disabled, unselected",
                        enabled = false,
                        colors = SatsRadioButtonColors.Fixed,
                        selected = false,
                    )
                    LabeledRadioButton(
                        label = "Disabled, selected",
                        enabled = false,
                        colors = SatsRadioButtonColors.Fixed,
                        selected = true,
                    )
                }
            }
        }
    }
}

@Composable
private fun Section(
    label: String,
    isFixedBackground: Boolean = false,
    content: @Composable () -> Unit,
) {
    val color = if (isFixedBackground) {
        SatsTheme.colors.backgrounds.fixed.primary.default.bg
    } else {
        SatsTheme.colors.surfaces.primary.default.bg
    }

    SatsSurface(Modifier.fillMaxWidth(), color = color, shape = SatsTheme.shapes.roundedCorners.medium) {
        Column(
            modifier = Modifier.padding(SatsTheme.spacing.s),
            verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xs),
        ) {
            Text(label, style = SatsTheme.typography.satsHeadlineEmphasis.small)

            content()
        }
    }
}

@Composable
private fun LabeledRadioButton(
    label: String,
    enabled: Boolean,
    selected: Boolean,
    colors: SatsRadioButtonColors = SatsRadioButtonColors.Primary,
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        SatsRadioButton(
            selected = selected,
            onClick = null,
            color = colors,
            enabled = enabled,
        )

        Text(label)
    }
}

@PreviewLightDark
@Composable
private fun RadioButtonsSampleScreenPreview() {
    SatsTheme {
        RadioButtonsSampleScreen(navigateUp = {})
    }
}
