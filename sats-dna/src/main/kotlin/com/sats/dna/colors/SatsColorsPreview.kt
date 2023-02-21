package com.sats.dna.colors

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
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
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sats.dna.theme.SatsTheme

@Preview("Light Mode", uiMode = UI_MODE_NIGHT_NO)
@Preview("Dark Mode", uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun Preview() {
    SatsTheme {
        Surface(
            Modifier.fillMaxWidth(),
            color = SatsTheme.colors.background.primary,
            contentColor = SatsTheme.colors.onBackground.primary,
        ) {
            Column {
                val colors = SatsTheme.colors

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
}

@Composable
private fun Header(text: String) {
    Row(Modifier.padding(16.dp), spacedBy(16.dp)) {
        val baseLineModifier = Modifier
            .height(1.dp)
            .align(CenterVertically)
            .background(SatsLightColors.onBackground.primary)

        Box(baseLineModifier.width(32.dp))

        Text(text)

        Box(baseLineModifier.weight(1f))
    }
}

@Composable
private fun ColorListItem(colorItem: ListItem.ColorItem) {
    Row(Modifier.padding(16.dp), spacedBy(24.dp), CenterVertically) {
        Box(
            modifier = Modifier
                .clip(CircleShape)
                .background(colorItem.color)
                .border(2.dp, SatsLightColors.onBackground.primary, CircleShape)
                .size(40.dp),
        )

        Column(verticalArrangement = spacedBy(4.dp)) {
            Text(colorItem.name, style = SatsTheme.typography.medium.basic)

            Text(
                colorItem.hexCode,
                style = SatsTheme.typography.default.small,
                color = SatsTheme.colors.onBackground.secondary,
            )
        }
    }
}

private sealed class ListItem {
    data class Header(val title: String) : ListItem()

    data class ColorItem(val name: String, val color: Color, val hexCode: String) : ListItem()
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
        ListItem.Header("Primary"),
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

        ListItem.Header("On Primary"),
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

        ListItem.Header("Secondary"),
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

        ListItem.Header("On Secondary"),
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

        ListItem.Header("CTA"),
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

        ListItem.Header("On CTA"),
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

        ListItem.Header("Action"),
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

        ListItem.Header("Selection"),
        ListItem.ColorItem(
            name = "selection",
            color = selection,
            hexCode = selection.toRgbaHex(),
        ),

        ListItem.Header("Navigation"),
        ListItem.ColorItem(
            name = "navigation.primary",
            color = navigation,
            hexCode = navigation.toRgbaHex(),
        ),

        ListItem.Header("Waitlist"),
        ListItem.ColorItem(
            name = "waitlist",
            color = waitlist,
            hexCode = waitlist.toRgbaHex(),
        ),

        ListItem.Header("On Waitlist"),
        ListItem.ColorItem(
            name = "onWaitlist",
            color = onWaitlist,
            hexCode = onWaitlist.toRgbaHex(),
        ),

        ListItem.Header("Signal"),
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

        ListItem.Header("On Signal"),
        ListItem.ColorItem(
            name = "onSignal",
            color = onSignal,
            hexCode = onSignal.toRgbaHex(),
        ),

        ListItem.Header("Signal Text"),
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

        ListItem.Header("UI"),
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

        ListItem.Header("Challenges"),
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

        ListItem.Header("Background"),
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

        ListItem.Header("On Background"),
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

        ListItem.Header("Surface"),
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

        ListItem.Header("On Surface"),
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

        ListItem.Header("Rewards"),
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
