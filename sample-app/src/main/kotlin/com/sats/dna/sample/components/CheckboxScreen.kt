package com.sats.dna.sample.components

import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import com.sats.dna.components.SatsTriStateCheckbox
import com.sats.dna.theme.SatsTheme

@Composable
internal fun CheckboxScreen(navigateUp: () -> Unit) {
    ComponentScreen("Checkbox", navigateUp) { innerPadding ->
        Box(
            Modifier
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m)
                .fillMaxSize()
                .wrapContentHeight(),
        ) {
            TriStateRow()
        }
    }
}

@Composable
private fun TriStateRow() {
    Row(horizontalArrangement = spacedBy(SatsTheme.spacing.s), verticalAlignment = CenterVertically) {
        var toggleableState by remember { mutableStateOf(ToggleableState.Off) }

        SatsTriStateCheckbox(toggleableState, onClick = { toggleableState = toggleableState.next() })

        Text(toggleableState.name)
    }
}

private fun ToggleableState.next() = when (this) {
    ToggleableState.Off -> ToggleableState.Indeterminate
    ToggleableState.Indeterminate -> ToggleableState.On
    ToggleableState.On -> ToggleableState.Off
}
