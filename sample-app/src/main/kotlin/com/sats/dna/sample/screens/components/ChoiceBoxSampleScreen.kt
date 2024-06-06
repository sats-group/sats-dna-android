package com.sats.dna.sample.screens.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.SatsChoiceBox
import com.sats.dna.components.SatsChoiceBoxColor
import com.sats.dna.components.SatsChoiceBoxStyle
import com.sats.dna.components.SatsChoiceBoxType
import com.sats.dna.components.SatsHorizontalDivider
import com.sats.dna.components.SatsRadioButton
import com.sats.dna.components.SatsSurface
import com.sats.dna.components.SatsVerticalDivider
import com.sats.dna.sample.screens.SampleScreen
import com.sats.dna.theme.SatsTheme

@Composable
fun ChoiceBoxSampleScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {

    var style by remember { mutableStateOf(SatsChoiceBoxStyle()) }

    SampleScreen("ChoiceBox", navigateUp, modifier) { innerPadding ->
        SatsSurface(
            color = if (style.color == SatsChoiceBoxColor.Fixed) {
                SatsTheme.colors.backgrounds.fixed.primary.default.bg
            } else {
                SatsTheme.colors.backgrounds.primary.default.bg
            },
        ) {
            Column(
                Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .padding(SatsTheme.spacing.m),
                verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {

                SatsHorizontalDivider()
                Section("Unselected enabled") {
                    var isSelected by rememberSaveable { mutableStateOf(false) }

                    SatsChoiceBox(
                        title = "Accept",
                        description = "Description of whatever the user is accepting",
                        isSelected = isSelected,
                        isEnabled = true,
                        style = style,
                        onClick = {
                            isSelected = !isSelected
                        },
                    )
                }
                Section("Selected enabled") {

                    var isSelected by rememberSaveable { mutableStateOf(true) }

                    SatsChoiceBox(
                        title = "Accept",
                        description = "Description of whatever the user is accepting",
                        isSelected = isSelected,
                        isEnabled = true,
                        style = style,
                        onClick = {
                            isSelected = !isSelected
                        },
                    )
                }

                Section("Unselected disabled") {

                    var isSelected by rememberSaveable { mutableStateOf(false) }

                    SatsChoiceBox(
                        title = "Accept",
                        description = "Description of whatever the user is accepting",
                        isSelected = isSelected,
                        isEnabled = false,
                        style = style,
                        onClick = {
                            isSelected = !isSelected
                        },
                    )
                }
                Section("Selected disabled") {
                    var isSelected by rememberSaveable { mutableStateOf(true) }

                    SatsChoiceBox(
                        title = "Accept",
                        description = "Description of whatever the user is accepting",
                        isSelected = isSelected,
                        isEnabled = false,
                        style = style,
                        onClick = {
                            isSelected = !isSelected
                        },
                    )
                }
                Row(
                    Modifier.height(IntrinsicSize.Min)
                ) {
                    Column(
                        Modifier.weight(1f),
                    ) {
                        Row(
                            Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically,
                        ) {
                            Text(
                                text = "Radio",
                            )
                            SatsRadioButton(
                                onClick = {
                                    style = style.copy(choiceType = SatsChoiceBoxType.Radio)
                                },
                                selected = style.choiceType == SatsChoiceBoxType.Radio,
                            )
                        }
                        Row(
                            Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically,
                        ) {
                            Text(
                                text = "Check box",
                            )
                            SatsRadioButton(
                                onClick = {
                                    style = style.copy(choiceType = SatsChoiceBoxType.Checkbox)
                                },
                                selected = style.choiceType == SatsChoiceBoxType.Checkbox,
                            )
                        }
                    }
                    SatsVerticalDivider(Modifier.padding(SatsTheme.spacing.xs))
                    Column(
                        Modifier.weight(1f).padding(start = SatsTheme.spacing.s),
                    ) {
                        Row(
                            Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically,
                        ) {
                            Text(
                                text = "Default colors",
                            )
                            SatsRadioButton(
                                onClick = {
                                    style = style.copy(color = SatsChoiceBoxColor.Default)
                                },
                                selected = style.color == SatsChoiceBoxColor.Default,
                            )
                        }
                        Row(
                            Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically,
                        ) {
                            Text(
                                text = "Fixed Colors",
                            )
                            SatsRadioButton(
                                onClick = {
                                    style = style.copy(color = SatsChoiceBoxColor.Fixed)
                                },
                                selected = style.color == SatsChoiceBoxColor.Fixed,
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun Section(title: String, content: @Composable ColumnScope.() -> Unit) {
    Column(
        verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s),
    ) {
        Text(title, style = SatsTheme.typography.medium.headline3)

        Column(
            verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            content()
        }
    }
}

@PreviewLightDark
@Composable
private fun ChoiceBoxSampleScreenPreview() {
    SatsTheme {
        SatsSurface {
            ChoiceBoxSampleScreen(
                navigateUp = {},
            )
        }
    }
}
