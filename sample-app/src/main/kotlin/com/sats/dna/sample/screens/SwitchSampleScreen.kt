package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.sats.dna.components.SatsSwitch
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

data object SwitchSampleScreen : SampleScreen(
    name = "Switch",
    route = "/components/switch",
    screen = { SwitchScreen(it::navigateUp) },
)

@Composable
private fun SwitchScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen("Switch", navigateUp, modifier) { innerPadding ->
        Column(
            Modifier
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m)
                .fillMaxSize()
                .wrapContentSize(),
            Arrangement.spacedBy(SatsTheme.spacing.m, Alignment.CenterVertically),
        ) {
            LabeledSwitch("Enabled, unselected", enabled = true, selected = false)
            LabeledSwitch("Enabled, selected", enabled = true, selected = true)
            LabeledSwitch("Disabled, unselected", enabled = false, selected = false)
            LabeledSwitch("Disabled, selected", enabled = false, selected = true)

            Divider()

            val (isSelected, onSelectChanged) = remember { mutableStateOf(false) }

            LabeledSwitch(
                label = "Selected: $isSelected",
                enabled = true,
                selected = isSelected,
                onSelectChanged = onSelectChanged,
            )
        }
    }
}

@Composable
private fun LabeledSwitch(
    label: String,
    enabled: Boolean,
    selected: Boolean,
    onSelectChanged: ((selected: Boolean) -> Unit)? = null,
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        SatsSwitch(selected, onSelectChanged, enabled = enabled)

        Text(label)
    }
}

@LightDarkPreview
@Composable
private fun Preview() {
    SatsTheme {
        SwitchScreen(navigateUp = {})
    }
}
