package com.sats.dna.components

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.PreviewFontScale
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsChoiceBox(
    title: String,
    description: String,
    isSelected: Boolean,
    onClick: (isSelected: Boolean) -> Unit,
    modifier: Modifier = Modifier,
    style: SatsChoiceBoxStyle = SatsChoiceBoxStyle(),
    isEnabled: Boolean = true,
) {
    val colors = style.color.getSatsChoiceBoxColors(
        isEnabled = isEnabled,
        isSelected = isSelected,
    )

    SatsSurface(
        modifier
            .border(
                width = 2.dp,
                color = colors.borderColor,
                shape = SatsTheme.shapes.roundedCorners.small,
            )
            .clip(SatsTheme.shapes.roundedCorners.small)
            .then(
                if (isEnabled) {
                    Modifier.clickable(
                        onClick = { onClick(!isSelected) },
                        role = when (style.choiceType) {
                            SatsChoiceBoxType.Radio -> Role.RadioButton
                            SatsChoiceBoxType.Checkbox -> Role.Checkbox
                        },
                    )
                } else {
                    Modifier
                },
            ),
        color = colors.backgroundColor,
    ) {
        Column(
            Modifier.padding(start = SatsTheme.spacing.s, bottom = SatsTheme.spacing.s),
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Text(
                    modifier = Modifier.padding(
                        top = SatsTheme.spacing.m,
                        end = SatsTheme.spacing.s,
                    ),
                    text = title,
                    style = SatsTheme.typography.emphasis.large,
                    color = colors.titleColor,
                )

                if (style.choiceType == SatsChoiceBoxType.Radio) {
                    SatsRadioButton(
                        selected = isSelected,
                        enabled = isEnabled,
                        color = if (style.color == SatsChoiceBoxColor.Fixed) {
                            SatsRadioButtonColors.Fixed
                        } else {
                            SatsRadioButtonColors.Primary
                        },
                        onClick = { onClick(!isSelected) },
                    )
                } else {
                    SatsCheckbox(
                        checked = isSelected,
                        enabled = isEnabled,
                        colors = if (style.color == SatsChoiceBoxColor.Fixed) {
                            SatsCheckboxColors.Fixed
                        } else {
                            SatsCheckboxColors.Primary
                        },
                        onCheckedChange = {
                            onClick(!isSelected)
                        },
                    )
                }
            }
            Text(
                modifier = Modifier.padding(end = SatsTheme.spacing.s),
                text = description,
                color = colors.descriptionColor,
            )
        }
    }
}

private data class SatsChoiceBoxColors(
    val backgroundColor: Color,
    val borderColor: Color,
    val titleColor: Color,
    val descriptionColor: Color,
)

data class SatsChoiceBoxStyle(
    val choiceType: SatsChoiceBoxType = SatsChoiceBoxType.Radio,
    val color: SatsChoiceBoxColor = SatsChoiceBoxColor.Default,
)

enum class SatsChoiceBoxType {
    Radio,
    Checkbox,
}

enum class SatsChoiceBoxColor {
    Fixed,
    Default,
}

@Composable
private fun SatsChoiceBoxColor.getSatsChoiceBoxColors(
    isEnabled: Boolean,
    isSelected: Boolean,
): SatsChoiceBoxColors {
    return when {
        isEnabled && isSelected -> selected
        isEnabled && !isSelected -> unselected
        !isEnabled && isSelected -> selectedDisabled
        else -> unselectedDisabled
    }
}

private val SatsChoiceBoxColor.unselected: SatsChoiceBoxColors
    @Composable get() = when (this) {
        SatsChoiceBoxColor.Default -> SatsChoiceBoxColors(
            backgroundColor = Color.Transparent,
            borderColor = SatsTheme.colors.graphicalElements.selector.primary.unselected.default.outline,
            titleColor = SatsTheme.colors.backgrounds.primary.default.fg,
            descriptionColor = SatsTheme.colors.backgrounds.primary.default.fgAlternate,
        )

        SatsChoiceBoxColor.Fixed -> SatsChoiceBoxColors(
            backgroundColor = Color.Transparent,
            borderColor = SatsTheme.colors.graphicalElements.selectorFixed.unselected.default.outline,
            titleColor = SatsTheme.colors.backgrounds.fixed.primary.default.fg,
            descriptionColor = SatsTheme.colors.backgrounds.fixed.primary.default.fgAlternate,
        )
    }

private val SatsChoiceBoxColor.selected: SatsChoiceBoxColors
    @Composable get() = when (this) {
        SatsChoiceBoxColor.Default -> SatsChoiceBoxColors(
            backgroundColor = SatsTheme.colors.graphicalElements.selector.primary.selectedSurface.default,
            borderColor = SatsTheme.colors.graphicalElements.selector.primary.selected.default.bg,
            descriptionColor = SatsTheme.colors.backgrounds.primary.default.fgAlternate,
            titleColor = SatsTheme.colors.backgrounds.primary.default.fg,
        )

        SatsChoiceBoxColor.Fixed -> SatsChoiceBoxColors(
            backgroundColor = SatsTheme.colors.graphicalElements.selectorFixed.selectedBackground.default,
            borderColor = SatsTheme.colors.graphicalElements.selectorFixed.selected.default.bg,
            titleColor = SatsTheme.colors.backgrounds.fixed.primary.default.fg,
            descriptionColor = SatsTheme.colors.backgrounds.fixed.primary.default.fgAlternate,
        )
    }

private val SatsChoiceBoxColor.unselectedDisabled: SatsChoiceBoxColors
    @Composable get() = when (this) {
        SatsChoiceBoxColor.Default -> SatsChoiceBoxColors(
            backgroundColor = Color.Transparent,
            borderColor = SatsTheme.colors.graphicalElements.selector.primary.unselected.disabled.outline,
            titleColor = SatsTheme.colors.backgrounds.primary.default.fgDisabled,
            descriptionColor = SatsTheme.colors.backgrounds.primary.default.fgDisabled,
        )

        SatsChoiceBoxColor.Fixed -> SatsChoiceBoxColors(
            backgroundColor = Color.Transparent,
            borderColor = SatsTheme.colors.graphicalElements.selectorFixed.unselected.disabled.outline,
            titleColor = SatsTheme.colors.backgrounds.fixed.primary.default.fgDisabled,
            descriptionColor = SatsTheme.colors.backgrounds.fixed.primary.default.fgDisabled,
        )
    }

private val SatsChoiceBoxColor.selectedDisabled: SatsChoiceBoxColors
    @Composable get() = when (this) {
        SatsChoiceBoxColor.Default -> SatsChoiceBoxColors(
            backgroundColor = SatsTheme.colors.graphicalElements.selector.primary.selectedSurface.disabled,
            borderColor = SatsTheme.colors.graphicalElements.selector.primary.selected.disabled.bg,
            titleColor = SatsTheme.colors.backgrounds.primary.default.fgDisabled,
            descriptionColor = SatsTheme.colors.backgrounds.primary.default.fgDisabled,
        )

        SatsChoiceBoxColor.Fixed -> SatsChoiceBoxColors(
            backgroundColor = SatsTheme.colors.graphicalElements.selectorFixed.selectedBackground.disabled,
            borderColor = SatsTheme.colors.graphicalElements.selectorFixed.selected.disabled.fg,
            titleColor = SatsTheme.colors.backgrounds.fixed.primary.default.fgDisabled,
            descriptionColor = SatsTheme.colors.backgrounds.fixed.primary.default.fgDisabled,
        )
    }

@PreviewLightDark
@Composable
private fun SatsChoiceBoxDefaultUnselectedPreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors.backgrounds.primary.default.bg,
        ) {
            Column(
                modifier = Modifier.padding(SatsTheme.spacing.m),
                verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
            ) {
                SatsChoiceBox(
                    title = "Accept",
                    description = "This is a description of the choice to be taken",
                    isSelected = false,
                    isEnabled = true,
                    onClick = {},
                    style = SatsChoiceBoxStyle(
                        choiceType = SatsChoiceBoxType.Radio,
                        color = SatsChoiceBoxColor.Default,
                    ),
                )
                SatsChoiceBox(
                    title = "Accept",
                    description = "This is a description of the choice to be taken",
                    isSelected = false,
                    isEnabled = false,
                    onClick = {},
                    style = SatsChoiceBoxStyle(
                        choiceType = SatsChoiceBoxType.Radio,
                        color = SatsChoiceBoxColor.Default,
                    ),
                )
                SatsChoiceBox(
                    title = "Accept",
                    description = "This is a description of the choice to be taken",
                    isSelected = false,
                    isEnabled = true,
                    onClick = {},
                    style = SatsChoiceBoxStyle(
                        choiceType = SatsChoiceBoxType.Checkbox,
                        color = SatsChoiceBoxColor.Default,
                    ),
                )
                SatsChoiceBox(
                    title = "Accept",
                    description = "This is a description of the choice to be taken",
                    isSelected = false,
                    isEnabled = false,
                    onClick = {},
                    style = SatsChoiceBoxStyle(
                        choiceType = SatsChoiceBoxType.Checkbox,
                        color = SatsChoiceBoxColor.Default,
                    ),
                )
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsChoiceBoxDefaultSelectedPreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors.backgrounds.primary.default.bg,
        ) {
            Column(
                modifier = Modifier.padding(SatsTheme.spacing.m),
                verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
            ) {
                SatsChoiceBox(
                    title = "Accept",
                    description = "This is a description of the choice to be taken",
                    isSelected = true,
                    isEnabled = true,
                    onClick = {},
                    style = SatsChoiceBoxStyle(
                        choiceType = SatsChoiceBoxType.Radio,
                        color = SatsChoiceBoxColor.Default,
                    ),
                )
                SatsChoiceBox(
                    title = "Accept",
                    description = "This is a description of the choice to be taken",
                    isSelected = true,
                    isEnabled = false,
                    onClick = {},
                    style = SatsChoiceBoxStyle(
                        choiceType = SatsChoiceBoxType.Radio,
                        color = SatsChoiceBoxColor.Default,
                    ),
                )
                SatsChoiceBox(
                    title = "Accept",
                    description = "This is a description of the choice to be taken",
                    isSelected = true,
                    isEnabled = true,
                    onClick = {},
                    style = SatsChoiceBoxStyle(
                        choiceType = SatsChoiceBoxType.Checkbox,
                        color = SatsChoiceBoxColor.Default,
                    ),
                )
                SatsChoiceBox(
                    title = "Accept",
                    description = "This is a description of the choice to be taken",
                    isSelected = true,
                    isEnabled = false,
                    onClick = {},
                    style = SatsChoiceBoxStyle(
                        choiceType = SatsChoiceBoxType.Checkbox,
                        color = SatsChoiceBoxColor.Default,
                    ),
                )
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsChoiceBoxFixedUnselectedPreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors.backgrounds.fixed.primary.default.bg,
        ) {
            Column(
                modifier = Modifier.padding(SatsTheme.spacing.m),
                verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
            ) {
                SatsChoiceBox(
                    title = "Accept",
                    description = "This is a description of the choice to be taken",
                    isSelected = false,
                    isEnabled = true,
                    onClick = {},
                    style = SatsChoiceBoxStyle(
                        choiceType = SatsChoiceBoxType.Radio,
                        color = SatsChoiceBoxColor.Fixed,
                    ),
                )
                SatsChoiceBox(
                    title = "Accept",
                    description = "This is a description of the choice to be taken",
                    isSelected = false,
                    isEnabled = false,
                    onClick = {},
                    style = SatsChoiceBoxStyle(
                        choiceType = SatsChoiceBoxType.Radio,
                        color = SatsChoiceBoxColor.Fixed,
                    ),
                )

                SatsChoiceBox(
                    title = "Accept",
                    description = "This is a description of the choice to be taken",
                    isSelected = false,
                    isEnabled = true,
                    onClick = {},
                    style = SatsChoiceBoxStyle(
                        choiceType = SatsChoiceBoxType.Checkbox,
                        color = SatsChoiceBoxColor.Fixed,
                    ),
                )
                SatsChoiceBox(
                    title = "Accept",
                    description = "This is a description of the choice to be taken",
                    isSelected = false,
                    isEnabled = false,
                    onClick = {},
                    style = SatsChoiceBoxStyle(
                        choiceType = SatsChoiceBoxType.Checkbox,
                        color = SatsChoiceBoxColor.Fixed,
                    ),
                )
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsChoiceBoxFixedSelectedPreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors.backgrounds.fixed.primary.default.bg,
        ) {
            Column(
                modifier = Modifier.padding(SatsTheme.spacing.m),
                verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
            ) {
                SatsChoiceBox(
                    title = "Accept",
                    description = "This is a description of the choice to be taken",
                    isSelected = true,
                    isEnabled = true,
                    onClick = {},
                    style = SatsChoiceBoxStyle(
                        choiceType = SatsChoiceBoxType.Radio,
                        color = SatsChoiceBoxColor.Fixed,
                    ),
                )
                SatsChoiceBox(
                    title = "Accept",
                    description = "This is a description of the choice to be taken",
                    isSelected = true,
                    isEnabled = false,
                    onClick = {},
                    style = SatsChoiceBoxStyle(
                        choiceType = SatsChoiceBoxType.Radio,
                        color = SatsChoiceBoxColor.Fixed,
                    ),
                )
                SatsChoiceBox(
                    title = "Accept",
                    description = "This is a description of the choice to be taken",
                    isSelected = true,
                    isEnabled = true,
                    onClick = {},
                    style = SatsChoiceBoxStyle(
                        choiceType = SatsChoiceBoxType.Checkbox,
                        color = SatsChoiceBoxColor.Fixed,
                    ),
                )
                SatsChoiceBox(
                    title = "Accept",
                    description = "This is a description of the choice to be taken",
                    isSelected = true,
                    isEnabled = false,
                    onClick = {},
                    style = SatsChoiceBoxStyle(
                        choiceType = SatsChoiceBoxType.Checkbox,
                        color = SatsChoiceBoxColor.Fixed,
                    ),
                )
            }
        }
    }
}

@PreviewFontScale
@Composable
private fun SatsChoiceBoxFontScalePreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            SatsChoiceBox(
                title = "Accept",
                description = "This is a description of the choice to be taken",
                isSelected = true,
                onClick = {},
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}
