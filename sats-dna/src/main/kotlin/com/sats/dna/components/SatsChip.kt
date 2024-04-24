package com.sats.dna.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.SatsIcons
import com.sats.dna.icons.Close
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsFilterChip(
    text: String,
    isSelected: Boolean,
    onClick: () -> Unit,
    onClickLabel: String?,
    modifier: Modifier = Modifier,
    isEnabled: Boolean = true,
) {
    val backgroundColor = animateColorAsState(
        targetValue = when (isSelected) {
            true -> when (isEnabled) {
                true -> SatsTheme.colors.graphicalElements.chips.selected.default.bg
                false -> SatsTheme.colors.graphicalElements.chips.selected.disabled.bg
            }

            false -> Color.Transparent
        },
        label = "background color",
    )

    val contentColor = animateColorAsState(
        targetValue = when (isSelected) {
            true -> when (isEnabled) {
                true -> SatsTheme.colors.graphicalElements.chips.selected.default.fg
                false -> SatsTheme.colors.graphicalElements.chips.selected.disabled.fg
            }

            false -> when (isEnabled) {
                true -> SatsTheme.colors.graphicalElements.chips.unselected.default.fg
                false -> SatsTheme.colors.graphicalElements.chips.unselected.disabled.fg
            }
        },
        label = "content color",
    )

    val borderColor = animateColorAsState(
        targetValue = when (isSelected) {
            true -> Color.Transparent

            false -> when (isEnabled) {
                true -> SatsTheme.colors.graphicalElements.chips.unselected.default.outline
                false -> SatsTheme.colors.graphicalElements.chips.unselected.disabled.outline
            }
        },
        label = "border color",
    )

    SatsChipLayout(
        backgroundColor = backgroundColor.value,
        contentColor = contentColor.value,
        borderColor = borderColor.value,
        modifier = modifier,
    ) {
        Text(
            text = text,
            modifier = Modifier
                .clickable(
                    onClick = onClick,
                    onClickLabel = onClickLabel,
                    enabled = isEnabled,
                    role = Role.Switch,
                )
                .padding(horizontal = SatsTheme.spacing.m, vertical = SatsTheme.spacing.s),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )
    }
}

@Composable
fun SatsInputChip(
    text: String,
    clearAction: SatsInputChipClearAction?,
    modifier: Modifier = Modifier,
) {
    SatsChipLayout(
        backgroundColor = SatsTheme.colors.graphicalElements.chips.selected.default.bg,
        contentColor = SatsTheme.colors.graphicalElements.chips.selected.default.fg,
        borderColor = null,
        modifier = modifier.width(IntrinsicSize.Max),
    ) {
        Row(
            Modifier.padding(horizontal = SatsTheme.spacing.xs, vertical = SatsTheme.spacing.xxs),
            horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xs),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = text,
                modifier = Modifier.weight(1f),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )

            clearAction?.let {
                SatsInputChipClearButton(clearAction.onClick, clearAction.onClickLabel)
            }
        }
    }
}

class SatsInputChipClearAction(val onClick: () -> Unit, val onClickLabel: String?)

@Composable
fun SatsInputChipClearButton(
    onClick: () -> Unit,
    onClickLabel: String?,
    modifier: Modifier = Modifier,
) {
    SatsSurface(
        modifier = modifier.size(16.dp),
        color = SatsTheme.colors.graphicalElements.chips.selected.default.fg,
        shape = SatsTheme.shapes.circle,
    ) {
        Icon(
            imageVector = SatsIcons.Close,
            contentDescription = null,
            modifier = Modifier.clickable(onClickLabel = onClickLabel, role = Role.Button) { onClick() },
            tint = SatsTheme.colors.graphicalElements.chips.selected.default.bg,
        )
    }
}

@Composable
private fun SatsChipLayout(
    backgroundColor: Color,
    contentColor: Color,
    borderColor: Color?,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    SatsSurface(
        modifier = modifier,
        shape = SatsTheme.shapes.roundedCorners.extraSmall,
        color = backgroundColor,
        contentColor = contentColor,
        border = borderColor?.let { BorderStroke(1.dp, it) },
    ) {
        content()
    }
}

@PreviewLightDark
@Composable
private fun SatsFilterChipPreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors.backgrounds.primary.default.bg,
            useMaterial3 = true,
        ) {
            Column {
                Row(
                    Modifier.padding(SatsTheme.spacing.m),
                    horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
                ) {
                    SatsFilterChip(
                        text = "Unselected Enabled",
                        isSelected = false,
                        isEnabled = true,
                        onClick = { },
                        onClickLabel = null,
                    )

                    SatsFilterChip(
                        text = "Selected Enabled",
                        isSelected = true,
                        isEnabled = true,
                        onClick = { },
                        onClickLabel = null,
                    )
                }

                Row(
                    Modifier.padding(SatsTheme.spacing.m),
                    horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
                ) {
                    SatsFilterChip(
                        text = "Unselected Disabled",
                        isSelected = false,
                        isEnabled = false,
                        onClick = { },
                        onClickLabel = null,
                    )

                    SatsFilterChip(
                        text = "Selected Disabled",
                        isSelected = true,
                        isEnabled = false,
                        onClick = { },
                        onClickLabel = null,
                    )
                }
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsInputChipPreview() {
    SatsTheme {
        SatsSurface(
            Modifier.width(250.dp),
            color = SatsTheme.colors.backgrounds.primary.default.bg,
            useMaterial3 = true,
        ) {
            Column(
                Modifier.padding(SatsTheme.spacing.m),
                verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
            ) {
                SatsInputChip(
                    text = "Oslo",
                    clearAction = SatsInputChipClearAction(onClick = {}, onClickLabel = "Clear"),
                )

                SatsInputChip(
                    text = "(4) Akersgata, Bislett, Storo, Nydalen",
                    clearAction = SatsInputChipClearAction(onClick = {}, onClickLabel = "Clear"),
                )
            }
        }
    }
}
