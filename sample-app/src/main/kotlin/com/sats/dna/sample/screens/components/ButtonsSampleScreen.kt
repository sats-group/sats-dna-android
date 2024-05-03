package com.sats.dna.sample.screens.components

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.SatsIcons
import com.sats.dna.components.SatsFilterChip
import com.sats.dna.components.SatsPlaceholderParagraph
import com.sats.dna.components.SatsSurface
import com.sats.dna.components.button.SatsBellIconButton
import com.sats.dna.components.button.SatsButton
import com.sats.dna.components.button.SatsButtonColor
import com.sats.dna.components.button.SatsButtonSize
import com.sats.dna.components.button.SatsDismissButton
import com.sats.dna.components.button.SatsIconButton
import com.sats.dna.components.button.SatsInCardCardButton
import com.sats.dna.components.button.SatsNavigationCardButton
import com.sats.dna.components.button.SatsStandAloneCardButton
import com.sats.dna.components.button.SatsTwoOptionsInCardCardButton
import com.sats.dna.components.button.SatsTwoOptionsStandAloneCardButton
import com.sats.dna.components.button.rememberSatsDismissButtonState
import com.sats.dna.components.card.SatsCard
import com.sats.dna.icons.Add
import com.sats.dna.icons.Barbell
import com.sats.dna.icons.Calendar
import com.sats.dna.icons.Check
import com.sats.dna.sample.internal.ComponentScreen
import com.sats.dna.theme.SatsTheme

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun ButtonsSampleScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
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
                .verticalScroll(rememberScrollState())
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m),
            verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.l),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Section("Text buttons") {
                SatsButtonColor.entries.forEach { color ->
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .background(previewBackgroundColorFor(color))
                            .padding(SatsTheme.spacing.xxs),
                        contentAlignment = Alignment.Center,
                    ) {
                        SatsButton(
                            onClick = {},
                            label = color.name,
                            colors = color,
                            size = controlPanelState.size,
                            isEnabled = controlPanelState.isEnabledToggled,
                            isLoading = controlPanelState.isLoadingToggled,
                            icon = if (controlPanelState.isIconEnabled) SatsIcons.Barbell else null,
                        )
                    }
                }
            }

            Section("Icon buttons") {
                Column(
                    verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    FlowRow(
                        modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s),
                        horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s, Alignment.CenterHorizontally),
                    ) {
                        SatsButtonColor.entries.forEach { color ->
                            Box(
                                Modifier
                                    .background(previewBackgroundColorFor(color))
                                    .padding(SatsTheme.spacing.xxs),
                                contentAlignment = Alignment.Center,
                            ) {
                                SatsIconButton(
                                    onClick = {},
                                    icon = SatsIcons.Barbell,
                                    onClickLabel = null,
                                    colors = color,
                                    isEnabled = controlPanelState.isEnabledToggled,
                                    isLoading = controlPanelState.isLoadingToggled,
                                    size = controlPanelState.size,
                                )
                            }
                        }
                    }
                }
            }

            Section("Dismiss Button", Modifier.fillMaxWidth()) {
                FlowRow(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s),
                    horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s, Alignment.CenterHorizontally),
                ) {
                    SatsButtonColor.entries.forEach { color ->
                        val state = rememberSatsDismissButtonState()

                        LaunchedEffect(controlPanelState.isLoadingToggled) {
                            if (controlPanelState.isLoadingToggled) state.showAsLoading() else state.reset()
                        }

                        Box(
                            Modifier
                                .background(previewBackgroundColorFor(color))
                                .padding(SatsTheme.spacing.xxs),
                            contentAlignment = Alignment.Center,
                        ) {
                            SatsDismissButton(
                                state = state,
                                dismissLabel = "Dismiss",
                                isEnabled = controlPanelState.isEnabledToggled,
                                onDismissClicked = { state.reset() },
                                size = controlPanelState.size,
                                color = color,
                            )
                        }
                    }
                }
            }

            Section("Notification Bell Icon Button", Modifier.fillMaxWidth()) {
                Row(horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s)) {
                    SatsBellIconButton(
                        onClick = {},
                        onClickLabel = null,
                        showCherry = false,
                        isEnabled = controlPanelState.isEnabledToggled,
                    )

                    SatsBellIconButton(
                        onClick = {},
                        onClickLabel = null,
                        showCherry = true,
                        isEnabled = controlPanelState.isEnabledToggled,
                    )
                }
            }

            Section("Standalone Card Buttons", Modifier.fillMaxWidth()) {
                Column(verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xs)) {
                    SatsNavigationCardButton(
                        modifier = Modifier.fillMaxWidth(),
                        onClick = {},
                        text = "Give us feedback on the app",
                    )

                    SatsStandAloneCardButton(
                        modifier = Modifier.fillMaxWidth(),
                        onClick = {},
                        text = "Schedule",
                        icon = SatsIcons.Calendar,
                    )

                    SatsTwoOptionsStandAloneCardButton(
                        modifier = Modifier.fillMaxWidth(),
                        firstOptionOnClick = {},
                        firstOptionText = "Add workout",
                        firstOptionIcon = SatsIcons.Add,
                        secondOptionOnClick = {},
                        secondOptionText = "Schedule",
                        secondOptionIcon = SatsIcons.Calendar,
                    )
                }
            }

            Section("In-Card Buttons", Modifier.fillMaxWidth()) {
                Column(verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m)) {
                    SatsCard {
                        Column {
                            SatsPlaceholderParagraph(Modifier.padding(SatsTheme.spacing.m))

                            SatsInCardCardButton(
                                modifier = Modifier.fillMaxWidth(),
                                onClick = {},
                                text = "Schedule",
                                icon = SatsIcons.Calendar,
                            )
                        }
                    }

                    SatsCard {
                        Column {
                            SatsPlaceholderParagraph(Modifier.padding(SatsTheme.spacing.m))

                            SatsTwoOptionsInCardCardButton(
                                modifier = Modifier.fillMaxWidth(),
                                firstOptionOnClick = {},
                                firstOptionText = "Add workout",
                                firstOptionIcon = SatsIcons.Add,
                                secondOptionOnClick = {},
                                secondOptionText = "Schedule",
                                secondOptionIcon = SatsIcons.Calendar,
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun previewBackgroundColorFor(color: SatsButtonColor): Color {
    val isOnFixedBackground = color == SatsButtonColor.Clean ||
        color == SatsButtonColor.CleanSecondary ||
        color == SatsButtonColor.FixedAction

    return if (isOnFixedBackground) {
        SatsTheme.colors.backgrounds.fixed.primary.default.bg
    } else {
        Color.Transparent
    }
}

@Composable
private fun Section(label: String, modifier: Modifier = Modifier, content: @Composable () -> Unit) {
    Column(
        modifier,
        verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xs),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(label, style = SatsTheme.typography.satsHeadlineEmphasis.large)

        Column {
            content()
        }
    }
}

@Stable
private class ControlPanelState {
    var isEnabledToggled by mutableStateOf(true)
    var isLoadingToggled by mutableStateOf(false)
    var size by mutableStateOf(SatsButtonSize.Basic)
    var isIconEnabled by mutableStateOf(false)
}

@Composable
private fun ControlPanel(state: ControlPanelState) {
    SatsSurface(Modifier.fillMaxWidth(), elevation = 2.dp) {
        Row(
            Modifier
                .navigationBarsPadding()
                .horizontalScroll(rememberScrollState())
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

            Box {
                var isMenuOpen: Boolean by rememberSaveable { mutableStateOf(false) }

                SatsFilterChip(
                    text = "Size: ${state.size.name}",
                    isSelected = false,
                    onClick = { isMenuOpen = true },
                    onClickLabel = null,
                )

                DropdownMenu(expanded = isMenuOpen, onDismissRequest = { isMenuOpen = false }) {
                    DropdownMenuItem(
                        leadingIcon = {
                            if (state.size == SatsButtonSize.Small) {
                                Icon(imageVector = SatsIcons.Check, contentDescription = null)
                            }
                        },
                        text = { Text("Small") },
                        onClick = {
                            state.size = SatsButtonSize.Small
                            isMenuOpen = false
                        },
                    )

                    DropdownMenuItem(
                        leadingIcon = {
                            if (state.size == SatsButtonSize.Basic) {
                                Icon(imageVector = SatsIcons.Check, contentDescription = null)
                            }
                        },
                        text = { Text("Basic") },
                        onClick = {
                            state.size = SatsButtonSize.Basic
                            isMenuOpen = false
                        },
                    )

                    DropdownMenuItem(
                        leadingIcon = {
                            if (state.size == SatsButtonSize.Large) {
                                Icon(imageVector = SatsIcons.Check, contentDescription = null)
                            }
                        },
                        text = { Text("Large") },
                        onClick = {
                            state.size = SatsButtonSize.Large
                            isMenuOpen = false
                        },
                    )
                }
            }

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

@PreviewLightDark
@Composable
private fun ButtonsSampleScreenPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            ButtonsSampleScreen(navigateUp = {})
        }
    }
}
