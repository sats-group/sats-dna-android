package com.sats.dna.colors

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ListItem
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
private fun LightColorsPreview() {
    ColorsPreview(SatsLightColors)
}

@Preview
@Composable
private fun DarkColorsPreview() {
    ColorsPreview(SatsDarkColors)
}

@Composable
private fun ColorsPreview(colors: SatsColors) {
    Surface(Modifier.fillMaxWidth(), color = colors.background.primary, contentColor = colors.onBackground.primary) {
        Column {
            LazyColumn {
                items(colors.toListItems()) { listItem ->
                    when (listItem) {
                        is ListItem.Header -> Header(listItem.title)
                        is ListItem.ColorItem -> ColorListItem(listItem)
                    }
                }
            }
        }
    }
}

@Composable
private fun Header(text: String) {
    Row(Modifier.padding(16.dp), horizontalArrangement = spacedBy(16.dp)) {
        val baseLineModifier = Modifier
            .height(1.dp)
            .align(Alignment.CenterVertically)
            .background(SatsLightColors.onBackground.primary)

        Box(baseLineModifier.width(32.dp))

        Text(text)

        Box(baseLineModifier.weight(1f))
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
private fun ColorListItem(color: ListItem.ColorItem) {
    ListItem(
        icon = {
            Box(
                modifier = Modifier
                    .clip(CircleShape)
                    .background(color.color)
                    .border(2.dp, SatsLightColors.onBackground.primary, CircleShape)
                    .size(40.dp),
            )
        },
        text = { Text(color.name) },
        secondaryText = { Text(color.hexCode) },
    )
}

private sealed class ListItem {
    data class Header(val title: String) : ListItem()

    data class ColorItem(
        val name: String,
        val color: Brush,
        val hexCode: String,
    ) : ListItem() {
        constructor(
            name: String,
            color: Color,
            hexCode: String,
        ) : this(
            name = name,
            color = SolidColor(color),
            hexCode = hexCode,
        )
    }
}

private fun Color.toRgbaHex(): String {
    val red = Integer.toHexString((red * 255).toInt()).let { if (it.count() < 2) "0$it" else it }
    val green = Integer.toHexString((green * 255).toInt()).let { if (it.count() < 2) "0$it" else it }
    val blue = Integer.toHexString((blue * 255).toInt()).let { if (it.count() < 2) "0$it" else it }
    val alpha = Integer.toHexString((alpha * 255).toInt()).let { if (it.count() < 2) "0$it" else it }

    return "#$alpha$red$green$blue".uppercase()
}

private fun SatsColors.toListItems(): List<ListItem> {
    return listOf(
        // Primary
        ListItem.Header(title = "Primary"),
        ListItem.ColorItem(
            name = "primary.default",
            color = primary.default,
            hexCode = primary.default.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "primary.disabled",
            color = primary.disabled,
            hexCode = primary.disabled.toRgbaHex(),
        ),

        // On Primary
        ListItem.Header(title = "On Primary"),
        ListItem.ColorItem(
            name = "onPrimary.default",
            color = onPrimary.default,
            hexCode = onPrimary.default.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "onPrimary.disabled",
            color = onPrimary.disabled,
            hexCode = onPrimary.disabled.toRgbaHex(),
        ),

        // Secondary
        ListItem.Header(title = "Secondary"),
        ListItem.ColorItem(
            name = "secondary.default",
            color = secondary.default,
            hexCode = secondary.default.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "secondary.disabled",
            color = secondary.disabled,
            hexCode = secondary.disabled.toRgbaHex(),
        ),

        // On Secondary
        ListItem.Header(title = "On Secondary"),
        ListItem.ColorItem(
            name = "onSecondary.default",
            color = onSecondary.default,
            hexCode = onSecondary.default.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "onSecondary.disabled",
            color = onSecondary.disabled,
            hexCode = onSecondary.disabled.toRgbaHex(),
        ),

        // Clean
        ListItem.Header("Clean"),
        ListItem.ColorItem(
            name = "clean.default",
            color = clean.default,
            hexCode = clean.default.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "clean.disabled",
            color = clean.disabled,
            hexCode = clean.disabled.toRgbaHex(),
        ),

        // On Clean
        ListItem.Header("On Clean"),
        ListItem.ColorItem(
            name = "onClean.default",
            color = onClean.default,
            hexCode = onClean.default.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "onClean.disabled",
            color = onClean.disabled,
            hexCode = onClean.disabled.toRgbaHex(),
        ),

        // Clean Secondary
        ListItem.Header("Clean Secondary"),
        ListItem.ColorItem(
            name = "cleanSecondary.default",
            color = cleanSecondary.default,
            hexCode = cleanSecondary.default.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "cleanSecondary.disabled",
            color = cleanSecondary.disabled,
            hexCode = cleanSecondary.disabled.toRgbaHex(),
        ),

        // On Clean Secondary
        ListItem.Header("On Clean Secondary"),
        ListItem.ColorItem(
            name = "onCleanSecondary.default",
            color = onCleanSecondary.default,
            hexCode = onCleanSecondary.default.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "onCleanSecondary.disabled",
            color = onCleanSecondary.disabled,
            hexCode = onCleanSecondary.disabled.toRgbaHex(),
        ),

        // CTA
        ListItem.Header(title = "CTA"),
        ListItem.ColorItem(
            name = "cta.default",
            color = cta.default,
            hexCode = cta.default.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "cta.disabled",
            color = cta.disabled,
            hexCode = cta.disabled.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "cta.nonText",
            color = cta.nonText,
            hexCode = cta.nonText.toRgbaHex(),
        ),

        // On CTA
        ListItem.Header(title = "On CTA"),
        ListItem.ColorItem(
            name = "onCta.default",
            color = onCta.default,
            hexCode = onCta.default.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "onCta.disabled",
            color = onCta.disabled,
            hexCode = onCta.disabled.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "onCta.nonText",
            color = onCta.nonText,
            hexCode = onCta.nonText.toRgbaHex(),
        ),

        // Action
        ListItem.Header(title = "Action"),
        ListItem.ColorItem(
            name = "action.default",
            color = action.default,
            hexCode = action.default.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "action.disabled",
            color = action.disabled,
            hexCode = action.disabled.toRgbaHex(),
        ),

        // Selection
        ListItem.Header(title = "Selection"),
        ListItem.ColorItem(
            name = "selection",
            color = selection,
            hexCode = selection.toRgbaHex(),
        ),

        // Navigation
        ListItem.Header(title = "Navigation"),
        ListItem.ColorItem(
            name = "navigation.primary",
            color = navigation,
            hexCode = navigation.toRgbaHex(),
        ),

        // Waitlist
        ListItem.Header(title = "Waitlist"),
        ListItem.ColorItem(
            name = "waitlist",
            color = waitlist,
            hexCode = waitlist.toRgbaHex(),
        ),

        // On Waitlist
        ListItem.Header(title = "On Waitlist"),
        ListItem.ColorItem(
            name = "onWaitlist",
            color = onWaitlist,
            hexCode = onWaitlist.toRgbaHex(),
        ),

        // Signal
        ListItem.Header(title = "Signal"),
        ListItem.ColorItem(
            name = "signal.success",
            color = signal.success,
            hexCode = signal.success.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "signal.warning",
            color = signal.warning,
            hexCode = signal.warning.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "signal.error",
            color = signal.error,
            hexCode = signal.error.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "signal.delete",
            color = signal.delete,
            hexCode = signal.delete.toRgbaHex(),
        ),

        // On Signal
        ListItem.Header(title = "On Signal"),
        ListItem.ColorItem(
            name = "onSignal",
            color = onSignal,
            hexCode = onSignal.toRgbaHex(),
        ),

        ListItem.Header(title = "Signal Text"),
        ListItem.ColorItem(
            name = "signalText.success",
            color = signalText.success,
            hexCode = signalText.success.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "signalText.warning",
            color = signalText.warning,
            hexCode = signalText.warning.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "signalText.error",
            color = signalText.error,
            hexCode = signalText.error.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "signalText.delete",
            color = signalText.delete,
            hexCode = signalText.delete.toRgbaHex(),
        ),

        // UI
        ListItem.Header(title = "UI"),
        ListItem.ColorItem(
            name = "ui.tabs",
            color = ui.tabs,
            hexCode = ui.tabs.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "ui.shimmer",
            color = ui.shimmer,
            hexCode = ui.shimmer.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "ui.border",
            color = ui.border,
            hexCode = ui.border.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "ui.graphicalElements1",
            color = ui.graphicalElements1,
            hexCode = ui.graphicalElements1.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "ui.graphicalElements2",
            color = ui.graphicalElements2,
            hexCode = ui.graphicalElements2.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "ui.graphicalElements3",
            color = ui.graphicalElements3,
            hexCode = ui.graphicalElements3.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "ui.graphicalElements4",
            color = ui.graphicalElements4,
            hexCode = ui.graphicalElements4.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "ui.graphicalElements5",
            color = ui.graphicalElements5,
            hexCode = ui.graphicalElements5.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "ui.graphicalElements6",
            color = ui.graphicalElements6,
            hexCode = ui.graphicalElements6.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "ui.graphicalElements7",
            color = ui.graphicalElements7,
            hexCode = ui.graphicalElements7.toRgbaHex(),
        ),

        // Challenges
        ListItem.Header(title = "Challenges"),
        ListItem.ColorItem(
            name = "challenges.inProgress",
            color = challenges.inProgress,
            hexCode = challenges.inProgress.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "challenges.failed",
            color = challenges.failed,
            hexCode = challenges.failed.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "challenges.success",
            color = challenges.success,
            hexCode = challenges.success.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "challenges.notDone",
            color = challenges.notDone,
            hexCode = challenges.notDone.toRgbaHex(),
        ),

        // Background
        ListItem.Header(title = "Background"),
        ListItem.ColorItem(
            name = "background.primary",
            color = background.primary,
            hexCode = background.primary.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "background.secondary",
            color = background.secondary,
            hexCode = background.secondary.toRgbaHex(),
        ),

        // On Background
        ListItem.Header(title = "On Background"),
        ListItem.ColorItem(
            name = "onBackground.controls.enabledOn",
            color = onBackground.controls.enabledOn,
            hexCode = onBackground.controls.enabledOn.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "onBackground.controls.enabledOff",
            color = onBackground.controls.enabledOff,
            hexCode = onBackground.controls.enabledOff.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "onBackground.controls.disabledOn",
            color = onBackground.controls.disabledOn,
            hexCode = onBackground.controls.disabledOn.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "onBackground.controls.disabledOff",
            color = onBackground.controls.disabledOff,
            hexCode = onBackground.controls.disabledOff.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "onBackground.primary",
            color = onBackground.primary,
            hexCode = onBackground.primary.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "onBackground.secondary",
            color = onBackground.secondary,
            hexCode = onBackground.secondary.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "onBackground.disabled",
            color = onBackground.disabled,
            hexCode = onBackground.disabled.toRgbaHex(),
        ),

        // Surface
        ListItem.Header(title = "Surface"),
        ListItem.ColorItem(
            name = "surface.primary",
            color = surface.primary,
            hexCode = surface.primary.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "surface.secondary",
            color = surface.secondary,
            hexCode = surface.secondary.toRgbaHex(),
        ),

        // On Surface
        ListItem.Header(title = "On Surface"),
        ListItem.ColorItem(
            name = "onSurface.controls.enabledOn",
            color = onSurface.controls.enabledOn,
            hexCode = onSurface.controls.enabledOn.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "onSurface.controls.enabledOff",
            color = onSurface.controls.enabledOff,
            hexCode = onSurface.controls.enabledOff.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "onSurface.controls.disabledOn",
            color = onSurface.controls.disabledOn,
            hexCode = onSurface.controls.disabledOn.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "onSurface.controls.disabledOff",
            color = onSurface.controls.disabledOff,
            hexCode = onSurface.controls.disabledOff.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "onSurface.primary",
            color = onSurface.primary,
            hexCode = onSurface.primary.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "onSurface.secondary",
            color = onSurface.secondary,
            hexCode = onSurface.secondary.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "onSurface.disabled",
            color = onSurface.disabled,
            hexCode = onSurface.disabled.toRgbaHex(),
        ),

        // Rewards
        ListItem.Header(title = "Rewards"),
        ListItem.ColorItem(
            name = "rewards.selection.blue",
            color = rewards.selection.blue,
            hexCode = rewards.selection.blue.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "rewards.selection.silver",
            color = rewards.selection.silver,
            hexCode = rewards.selection.silver.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "rewards.selection.gold",
            color = rewards.selection.gold,
            hexCode = rewards.selection.gold.toRgbaHex(),
        ),
        ListItem.ColorItem(
            name = "rewards.selection.platinum",
            color = rewards.selection.platinum,
            hexCode = rewards.selection.platinum.toRgbaHex(),
        ),
    )
}
