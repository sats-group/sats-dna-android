@file:OptIn(ExperimentalMaterialApi::class)

package com.sats.dna.sample.components

import androidx.compose.foundation.layout.Arrangement.Absolute.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.FilterChip
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sats.dna.components.button.SatsButton
import com.sats.dna.components.button.SatsButtonColor
import com.sats.dna.components.button.SatsIconButton
import com.sats.dna.theme.SatsTheme

@Composable
internal fun ButtonsScreen(navigateUp: () -> Unit) {
    val controlPanelState = remember { ControlPanelState() }

    ComponentScreen("Buttons", navigateUp, bottomBar = { ControlPanel(controlPanelState) }) { innerPadding ->
        Column(
            Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(vertical = SatsTheme.spacing.m),
            verticalArrangement = spacedBy(SatsTheme.spacing.m),
            horizontalAlignment = CenterHorizontally,
        ) {
            listOf(
                SatsButtonColor.Primary,
                SatsButtonColor.Cta,
                SatsButtonColor.Secondary,
                SatsButtonColor.Clean,
                SatsButtonColor.WaitingList,
                SatsButtonColor.Transparent,
            ).forEach { color ->
                SatsButton(
                    onClick = {},
                    label = color.name,
                    colors = color,
                    isEnabled = controlPanelState.isEnabledToggled,
                    isLoading = controlPanelState.isLoadingToggled,
                    isLarge = controlPanelState.isLargeToggled,
                    icon = if (controlPanelState.isIconEnabled) SatsTheme.icons.barbell else null,
                )
            }

            Column(verticalArrangement = spacedBy(SatsTheme.spacing.s)) {
                Row(horizontalArrangement = spacedBy(SatsTheme.spacing.s)) {
                    listOf(
                        SatsButtonColor.Primary,
                        SatsButtonColor.Cta,
                        SatsButtonColor.Secondary,
                    ).forEach { color ->
                        SatsIconButton(
                            onClick = {},
                            icon = SatsTheme.icons.barbell,
                            onClickLabel = null,
                            colors = color,
                            isEnabled = controlPanelState.isEnabledToggled,
                            isLoading = controlPanelState.isLoadingToggled,
                            isLarge = controlPanelState.isLargeToggled,
                        )
                    }
                }

                Row(horizontalArrangement = spacedBy(SatsTheme.spacing.s)) {
                    listOf(
                        SatsButtonColor.Clean,
                        SatsButtonColor.WaitingList,
                        SatsButtonColor.Transparent,
                    ).forEach { color ->
                        SatsIconButton(
                            onClick = {},
                            icon = SatsTheme.icons.barbell,
                            onClickLabel = null,
                            colors = color,
                            isEnabled = controlPanelState.isEnabledToggled,
                            isLoading = controlPanelState.isLoadingToggled,
                            isLarge = controlPanelState.isLargeToggled,
                        )
                    }
                }
            }
        }
    }
}

@Stable
private class ControlPanelState {
    var isEnabledToggled by mutableStateOf(true)
    var isLoadingToggled by mutableStateOf(false)
    var isLargeToggled by mutableStateOf(false)
    var isIconEnabled by mutableStateOf(false)
}

@Composable
@OptIn(ExperimentalLayoutApi::class)
private fun ControlPanel(state: ControlPanelState) {
    Surface(Modifier.fillMaxWidth(), elevation = 2.dp) {
        FlowRow(
            Modifier
                .navigationBarsPadding()
                .padding(SatsTheme.spacing.m),
            horizontalArrangement = spacedBy(SatsTheme.spacing.s),
        ) {
            FilterChip(
                enabled = !state.isLoadingToggled,
                selected = state.isEnabledToggled && !state.isLoadingToggled,
                onClick = { state.isEnabledToggled = !state.isEnabledToggled },
            ) {
                Text("Enabled")
            }

            FilterChip(
                selected = state.isLoadingToggled,
                onClick = { state.isLoadingToggled = !state.isLoadingToggled },
            ) {
                Text("Loading")
            }

            FilterChip(
                selected = state.isLargeToggled,
                onClick = { state.isLargeToggled = !state.isLargeToggled },
            ) {
                Text("Large")
            }

            FilterChip(
                selected = state.isIconEnabled,
                enabled = !state.isLoadingToggled,
                onClick = { state.isIconEnabled = !state.isIconEnabled },
            ) {
                Text("Icon")
            }
        }
    }
}
