package com.sats.dna.sample.screens.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.SatsRadioButton
import com.sats.dna.sample.internal.ComponentScreen
import com.sats.dna.theme.SatsTheme

@Composable
fun RadioButtonsSampleScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen("Radio Buttons", navigateUp, modifier) { innerPadding ->
        Column(
            Modifier
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m)
                .fillMaxSize()
                .wrapContentSize(),
            Arrangement.spacedBy(SatsTheme.spacing.m, Alignment.CenterVertically),
        ) {
            LabeledRadioButton("Enabled, unselected", enabled = true, selected = false)
            LabeledRadioButton("Enabled, selected", enabled = true, selected = true)
            LabeledRadioButton("Disabled, unselected", enabled = false, selected = false)
            LabeledRadioButton("Disabled, selected", enabled = false, selected = true)
        }
    }
}

@Composable
private fun LabeledRadioButton(label: String, enabled: Boolean, selected: Boolean) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        SatsRadioButton(selected, null, enabled = enabled)

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
