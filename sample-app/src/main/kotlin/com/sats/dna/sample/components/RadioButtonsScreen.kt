package com.sats.dna.sample.components

import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import com.sats.dna.components.SatsRadioButton
import com.sats.dna.theme.SatsTheme

@Composable
internal fun RadioButtonsScreen(navigateUp: () -> Unit) {
    ComponentScreen("Radio Buttons", navigateUp) { innerPadding ->
        Column(
            Modifier
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m)
                .fillMaxSize()
                .wrapContentSize(),
            spacedBy(SatsTheme.spacing.m, CenterVertically),
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
    Row(horizontalArrangement = spacedBy(SatsTheme.spacing.s), verticalAlignment = CenterVertically) {
        SatsRadioButton(selected, null, enabled = enabled)

        Text(label)
    }
}
