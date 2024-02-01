package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import com.sats.dna.components.SatsCheckbox
import com.sats.dna.components.SatsCheckboxColors
import com.sats.dna.components.SatsSurface
import com.sats.dna.components.SatsTriStateCheckbox
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

data object CheckboxSampleScreen : SampleScreen(
    name = "Checkbox",
    route = "/components/checkbox",
    screen = { CheckboxScreen(it::navigateUp) },
)

@Composable
private fun CheckboxScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen("Checkbox", navigateUp, modifier) { innerPadding ->
        Column(
            Modifier
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m)
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
        ) {
            Section("Regular checkbox") {
                RegularRow()
            }

            Section("Tri-state checkbox") {
                TriStateRow()
            }

            Section("Regular checkbox, fixed", isFixedBackground = true) {
                RegularRow(isFixedBackground = true)
            }

            Section("Tri-state checkbox, fixed", isFixedBackground = true) {
                TriStateRow(isFixedBackground = true)
            }
        }
    }
}

@Composable
private fun Section(label: String, isFixedBackground: Boolean = false, content: @Composable () -> Unit) {
    val color = if (isFixedBackground) {
        SatsTheme.colors2.backgrounds.fixed.bg.default
    } else {
        SatsTheme.colors2.surfaces.primary.bg.default
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
private fun RegularRow(isFixedBackground: Boolean = false) {
    val colors = if (isFixedBackground) SatsCheckboxColors.Fixed else SatsCheckboxColors.Default

    Row(
        horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        val (isChecked, setIsChecked) = remember { mutableStateOf(false) }

        SatsCheckbox(isChecked, setIsChecked, colors = colors)

        Text("Checked: $isChecked")
    }
}

@Composable
private fun TriStateRow(isFixedBackground: Boolean = false) {
    val colors = if (isFixedBackground) SatsCheckboxColors.Fixed else SatsCheckboxColors.Default

    Row(
        horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        var toggleableState by remember { mutableStateOf(ToggleableState.Off) }

        SatsTriStateCheckbox(toggleableState, onClick = { toggleableState = toggleableState.next() }, colors = colors)

        Text("State: ${toggleableState.name}")
    }
}

private fun ToggleableState.next() = when (this) {
    ToggleableState.Off -> ToggleableState.Indeterminate
    ToggleableState.Indeterminate -> ToggleableState.On
    ToggleableState.On -> ToggleableState.Off
}

@LightDarkPreview
@Composable
private fun CheckboxScreenPreview() {
    SatsTheme {
        CheckboxScreen(navigateUp = {})
    }
}
