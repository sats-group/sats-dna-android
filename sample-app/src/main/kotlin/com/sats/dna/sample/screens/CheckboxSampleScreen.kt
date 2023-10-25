package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
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
                .fillMaxSize()
                .wrapContentHeight(),
        ) {
            RegularRow()
            TriStateRow()
        }
    }
}

@Composable
private fun RegularRow() {
    Row(
        horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        val (isChecked, setIsChecked) = remember { mutableStateOf(false) }

        SatsCheckbox(isChecked, setIsChecked)

        Text("Checked: $isChecked")
    }
}

@Composable
private fun TriStateRow() {
    Row(
        horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        var toggleableState by remember { mutableStateOf(ToggleableState.Off) }

        SatsTriStateCheckbox(toggleableState, onClick = { toggleableState = toggleableState.next() })

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
private fun Preview() {
    SatsTheme {
        CheckboxScreen(navigateUp = {})
    }
}
