package com.sats.dna.sample.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sats.dna.components.SatsFilterChip
import com.sats.dna.components.SatsSurface
import com.sats.dna.components.button.SatsButton
import com.sats.dna.components.button.SatsButtonColor
import com.sats.dna.components.button.SatsIconButton
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

data object ButtonsSampleScreen : SampleScreen(
    name = "Buttons",
    route = "/components/buttons",
    screen = { ButtonsScreen(it::navigateUp) },
)

@Composable
private fun ButtonsScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    val controlPanelState = remember { ControlPanelState() }

    ComponentScreen(
        title = "Buttons",
        navigateUp = navigateUp,
        modifier = modifier,
        bottomBar = { ControlPanel(controlPanelState) },
    ) { innerPadding ->
        Column(
            Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(vertical = SatsTheme.spacing.m),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            listOf(
                SatsButtonColor.Primary,
                SatsButtonColor.Cta,
                SatsButtonColor.Secondary,
                SatsButtonColor.Clean,
                SatsButtonColor.CleanSecondary,
                SatsButtonColor.WaitingList,
                SatsButtonColor.Action,
                SatsButtonColor.Transparent,
            ).forEach { color ->
                val backgroundColor = if (color == SatsButtonColor.Clean || color == SatsButtonColor.CleanSecondary) {
                    SatsTheme.colors2.backgrounds.fixed.bg.default
                } else {
                    Color.Transparent
                }

                Box(
                    Modifier
                        .fillMaxWidth()
                        .background(backgroundColor)
                        .padding(SatsTheme.spacing.m),
                    contentAlignment = Alignment.Center,
                ) {
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
            }

            Column(verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s)) {
                Row(horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s)) {
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

                Row(horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s)) {
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
    SatsSurface(Modifier.fillMaxWidth(), elevation = 2.dp) {
        FlowRow(
            Modifier
                .navigationBarsPadding()
                .padding(SatsTheme.spacing.m),
            horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s),
        ) {
            SatsFilterChip(
                text = "Enabled",
                isEnabled = !state.isLoadingToggled,
                isSelected = state.isEnabledToggled && !state.isLoadingToggled,
                onClick = { state.isEnabledToggled = !state.isEnabledToggled },
                onClickLabel = null,
            )

            SatsFilterChip(
                text = "Loading",
                isSelected = state.isLoadingToggled,
                onClick = { state.isLoadingToggled = !state.isLoadingToggled },
                onClickLabel = null,
            )

            SatsFilterChip(
                text = "Large",
                isSelected = state.isLargeToggled,
                onClick = { state.isLargeToggled = !state.isLargeToggled },
                onClickLabel = null,
            )

            SatsFilterChip(
                text = "Icon",
                isSelected = state.isIconEnabled,
                isEnabled = !state.isLoadingToggled,
                onClick = { state.isIconEnabled = !state.isIconEnabled },
                onClickLabel = null,
            )
        }
    }
}

@LightDarkPreview
@Composable
private fun Preview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            ButtonsScreen(navigateUp = {})
        }
    }
}
