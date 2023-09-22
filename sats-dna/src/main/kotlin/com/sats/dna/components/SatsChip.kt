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
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

@Composable
fun SatsFilterChip(
    text: String,
    isSelected: Boolean,
    isEnabled: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    colors: SatsFilterChipColors = SatsChipDefaults.filterChipColors(),
) {
    val backgroundColor = colors.backgroundColor(
        isSelected = isSelected,
        isEnabled = isEnabled,
    )

    val contentColor = colors.contentColor(
        isSelected = isSelected,
        isEnabled = isEnabled,
    )

    val borderColor = colors.borderColor(
        isSelected = isSelected,
        isEnabled = isEnabled,
    )

    SatsChipLayout(
        backgroundColor = backgroundColor.value,
        contentColor = contentColor.value,
        borderColor = borderColor.value,
        modifier = modifier,
    ) {
        Text(
            text,
            Modifier
                .clickable(enabled = isEnabled, role = Role.Switch) { onClick() }
                .padding(horizontal = SatsTheme.spacing.m, vertical = SatsTheme.spacing.s),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )
    }
}

@Composable
fun SatsInputChip(
    text: String,
    action: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    colors: SatsInputChipColors = SatsChipDefaults.inputChipColors(),
) {
    val backgroundColor = colors.backgroundColor().value
    val contentColor = colors.contentColor().value

    SatsChipLayout(
        backgroundColor = backgroundColor,
        contentColor = contentColor,
        borderColor = null,
        modifier = modifier.width(IntrinsicSize.Max),
    ) {
        Row(
            Modifier.padding(horizontal = SatsTheme.spacing.xs, vertical = SatsTheme.spacing.xxs),
            horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xs),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(text, Modifier.weight(1f), maxLines = 1, overflow = TextOverflow.Ellipsis)

            action()
        }
    }
}

@Composable
fun SatsInputChipClearButton(
    onClick: () -> Unit,
    onClickLabel: String?,
    modifier: Modifier = Modifier,
    backgroundColor: Color = SatsTheme.colors.onPrimary.default,
    iconColor: Color = SatsTheme.colors.primary.default,
) {
    SatsSurface(
        modifier = modifier.size(16.dp),
        color = backgroundColor,
        shape = SatsTheme.shapes.circle,
    ) {
        Icon(
            painter = SatsTheme.icons.close,
            contentDescription = null,
            modifier = Modifier.clickable(onClickLabel = onClickLabel, role = Role.Button) { onClick() },
            tint = iconColor,
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
    Surface(
        modifier,
        shape = SatsTheme.shapes.roundedCorners.extraSmall,
        color = backgroundColor,
        contentColor = contentColor,
        border = borderColor?.let { BorderStroke(1.dp, it) },
    ) {
        content()
    }
}

interface SatsInputChipColors {
    @Composable
    fun backgroundColor(): State<Color>

    @Composable
    fun contentColor(): State<Color>
}

interface SatsFilterChipColors {
    @Composable
    fun backgroundColor(isSelected: Boolean, isEnabled: Boolean): State<Color>

    @Composable
    fun contentColor(isSelected: Boolean, isEnabled: Boolean): State<Color>

    @Composable
    fun borderColor(isSelected: Boolean, isEnabled: Boolean): State<Color>
}

object SatsChipDefaults {
    @Composable
    fun inputChipColors(
        backgroundColor: Color = SatsTheme.colors.primary.default,
        contentColor: Color = SatsTheme.colors.onPrimary.default,
    ): SatsInputChipColors = DefaultSatsInputChipColors(
        backgroundColor = backgroundColor,
        contentColor = contentColor,
    )

    @Composable
    fun filterChipColors(
        borderColor: Color = SatsTheme.colors.ui.graphicalElements3,
        contentColor: Color = SatsTheme.colors.primary.default,
        disabledBorderColor: Color = borderColor.copy(alpha = .5f),
        disabledContentColor: Color = SatsTheme.colors.onBackground.disabled,
        selectedBackgroundColor: Color = SatsTheme.colors.primary.default,
        selectedContentColor: Color = SatsTheme.colors.primary.disabled,
        disabledSelectedBackgroundColor: Color = SatsTheme.colors.onPrimary.disabled,
        disabledSelectedContentColor: Color = SatsTheme.colors.primary.disabled,
    ): SatsFilterChipColors = DefaultSatsFilterChipColors(
        borderColor = borderColor,
        contentColor = contentColor,
        disabledBorderColor = disabledBorderColor,
        disabledContentColor = disabledContentColor,
        selectedBackgroundColor = selectedBackgroundColor,
        selectedContentColor = selectedContentColor,
        disabledSelectedBackgroundColor = disabledSelectedBackgroundColor,
        disabledSelectedContentColor = disabledSelectedContentColor,
    )
}

@Immutable
private class DefaultSatsFilterChipColors(
    private val borderColor: Color,
    private val contentColor: Color,
    private val disabledBorderColor: Color,
    private val disabledContentColor: Color,
    private val selectedBackgroundColor: Color,
    private val selectedContentColor: Color,
    private val disabledSelectedBackgroundColor: Color,
    private val disabledSelectedContentColor: Color,
) : SatsFilterChipColors {
    @Composable
    override fun backgroundColor(isSelected: Boolean, isEnabled: Boolean): State<Color> {
        val targetColor = when {
            isEnabled && isSelected -> selectedBackgroundColor
            isEnabled && !isSelected -> Color.Transparent
            !isEnabled && isSelected -> disabledSelectedBackgroundColor
            else -> Color.Transparent
        }

        return animateColorAsState(targetColor, label = "background color")
    }

    @Composable
    override fun contentColor(isSelected: Boolean, isEnabled: Boolean): State<Color> {
        val targetColor = when {
            isEnabled && isSelected -> selectedContentColor
            isEnabled && !isSelected -> contentColor
            !isEnabled && isSelected -> disabledSelectedContentColor
            else -> disabledContentColor
        }

        return animateColorAsState(targetColor, label = "content color")
    }

    @Composable
    override fun borderColor(isSelected: Boolean, isEnabled: Boolean): State<Color> {
        val targetColor = when {
            isEnabled && isSelected -> Color.Transparent
            isEnabled && !isSelected -> borderColor
            !isEnabled && isSelected -> Color.Transparent
            else -> disabledBorderColor
        }

        return animateColorAsState(targetColor, label = "border color")
    }
}

@Immutable
private class DefaultSatsInputChipColors(
    private val backgroundColor: Color,
    private val contentColor: Color,
) : SatsInputChipColors {
    @Composable
    override fun backgroundColor(): State<Color> {
        return rememberUpdatedState(backgroundColor)
    }

    @Composable
    override fun contentColor(): State<Color> {
        return rememberUpdatedState(contentColor)
    }
}

@LightDarkPreview
@Composable
private fun SatsFilterChipPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.background.primary) {
            Column {
                Row(
                    Modifier.padding(SatsTheme.spacing.m),
                    horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
                ) {
                    SatsFilterChip(
                        text = "05-09",
                        isSelected = false,
                        isEnabled = true,
                        onClick = { },
                    )

                    SatsFilterChip(
                        text = "05-09",
                        isSelected = true,
                        isEnabled = true,
                        onClick = { },
                    )
                }

                Row(
                    Modifier.padding(SatsTheme.spacing.m),
                    horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
                ) {
                    SatsFilterChip(
                        text = "05-09",
                        isSelected = false,
                        isEnabled = false,
                        onClick = { },
                    )

                    SatsFilterChip(
                        text = "05-09",
                        isSelected = true,
                        isEnabled = false,
                        onClick = { },
                    )
                }
            }
        }
    }
}

@LightDarkPreview
@Composable
private fun SatsInputChipPreview() {
    SatsTheme {
        SatsSurface(Modifier.width(250.dp), color = SatsTheme.colors.background.primary) {
            Column(
                Modifier.padding(SatsTheme.spacing.m),
                verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
            ) {
                SatsInputChip(
                    text = "Oslo",
                    action = { SatsInputChipClearButton(onClick = {}, onClickLabel = "Clear") },
                )

                SatsInputChip(
                    text = "(4) Akersgata, Bislett, Storo, Nydalen",
                    action = { SatsInputChipClearButton(onClick = {}, onClickLabel = "Clear") },
                )
            }
        }
    }
}
