@file:OptIn(ExperimentalMaterialApi::class)

package com.sats.dna.sample.components.buttons

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement.Absolute.spacedBy
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.FilterChip
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.google.accompanist.insets.ui.Scaffold
import com.google.accompanist.insets.ui.TopAppBar
import com.sats.dna.components.button.SatsButton
import com.sats.dna.components.button.SatsButtonColor
import com.sats.dna.theme.SatsTheme

@Composable
internal fun ButtonsScreen(navigateUp: () -> Unit) {
    val controlPanelState = remember { ControlPanelState() }

    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = SatsTheme.colors.surface.primary,
                contentPadding = WindowInsets.statusBars.asPaddingValues(),
                navigationIcon = {
                    IconButton(onClick = navigateUp) {
                        Icon(SatsTheme.icons.back, contentDescription = null)
                    }
                },
                title = { Text("Buttons") },
            )
        },
        bottomBar = { ControlPanel(controlPanelState) },
    ) { innerPadding ->
        Column(
            Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(vertical = SatsTheme.spacing.m),
            verticalArrangement = spacedBy(SatsTheme.spacing.m),
            horizontalAlignment = CenterHorizontally,
        ) {
            SatsButton(
                onClick = {},
                label = "Primary",
                colors = SatsButtonColor.Primary,
                isEnabled = controlPanelState.isEnabledToggled,
                isLoading = controlPanelState.isLoadingToggled,
                isLarge = controlPanelState.isLargeToggled,
                icon = if (controlPanelState.isIconEnabled) SatsTheme.icons.barbell else null,
            )

            SatsButton(
                onClick = {},
                label = "Cta",
                colors = SatsButtonColor.Cta,
                isEnabled = controlPanelState.isEnabledToggled,
                isLoading = controlPanelState.isLoadingToggled,
                isLarge = controlPanelState.isLargeToggled,
                icon = if (controlPanelState.isIconEnabled) SatsTheme.icons.barbell else null,
            )

            SatsButton(
                onClick = {},
                label = "Secondary",
                colors = SatsButtonColor.Secondary,
                isEnabled = controlPanelState.isEnabledToggled,
                isLoading = controlPanelState.isLoadingToggled,
                isLarge = controlPanelState.isLargeToggled,
                icon = if (controlPanelState.isIconEnabled) SatsTheme.icons.barbell else null,
            )

            Box(
                Modifier
                    .fillMaxWidth()
                    .background(SatsTheme.colors.primary.default)
                    .padding(SatsTheme.spacing.l),
                contentAlignment = Center,
            ) {
                SatsButton(
                    onClick = {},
                    label = "Clean",
                    colors = SatsButtonColor.Clean,
                    isEnabled = controlPanelState.isEnabledToggled,
                    isLoading = controlPanelState.isLoadingToggled,
                    isLarge = controlPanelState.isLargeToggled,
                    icon = if (controlPanelState.isIconEnabled) SatsTheme.icons.barbell else null,
                )
            }

            SatsButton(
                onClick = {},
                label = "WaitingList",
                colors = SatsButtonColor.WaitingList,
                isEnabled = controlPanelState.isEnabledToggled,
                isLoading = controlPanelState.isLoadingToggled,
                isLarge = controlPanelState.isLargeToggled,
                icon = if (controlPanelState.isIconEnabled) SatsTheme.icons.barbell else null,
            )
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
