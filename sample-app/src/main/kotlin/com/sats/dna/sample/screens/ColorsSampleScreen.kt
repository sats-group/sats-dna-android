package com.sats.dna.sample.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ListItem
import androidx.compose.material3.ListItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.colors.SatsColors
import com.sats.dna.theme.SatsTheme

data object ColorsSampleScreen : SampleScreen(
    name = "Colors",
    route = "/colors",
    screen = { ColorsScreen(it::navigateUp) },
)

@Composable
private fun ColorsScreen(navigateUp: () -> Unit) {
    ComponentScreen("Colors", navigateUp) { innerPadding ->
        val listItems = SatsTheme.colors.toListItems()

        LazyColumn(contentPadding = innerPadding) {
            items(listItems) { listItem ->
                when (listItem) {
                    is HeaderItem -> {
                        ListHeader(
                            modifier = Modifier.padding(16.dp),
                            title = listItem.title,
                        )
                    }

                    is ColorItem -> {
                        ListItem(
                            leadingContent = {
                                Box(
                                    modifier = Modifier
                                        .clip(CircleShape)
                                        .background(listItem.color)
                                        .border(2.dp, SatsTheme.colors.onBackground.primary, CircleShape)
                                        .size(40.dp),
                                )
                            },
                            headlineContent = { Text(listItem.name) },
                            supportingContent = { Text(listItem.color.toRgbaHex()) },
                            colors = ListItemDefaults.colors(containerColor = SatsTheme.colors.background.primary),
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun ListHeader(modifier: Modifier = Modifier, title: String) {
    Row(modifier = modifier) {
        val baseLineModifier = Modifier
            .height(1.dp)
            .align(Alignment.CenterVertically)
            .background(SatsTheme.colors.onBackground.primary)

        Box(modifier = baseLineModifier then Modifier.width(32.dp))

        Text(title, modifier = Modifier.padding(horizontal = 16.dp))

        Box(modifier = baseLineModifier then Modifier.weight(1f))
    }
}

private fun Color.toRgbaHex(): String {
    val red = Integer.toHexString((red * 255).toInt()).let { if (it.count() < 2) "0$it" else it }
    val green = Integer.toHexString((green * 255).toInt()).let { if (it.count() < 2) "0$it" else it }
    val blue = Integer.toHexString((blue * 255).toInt()).let { if (it.count() < 2) "0$it" else it }
    val alpha = Integer.toHexString((alpha * 255).toInt()).let { if (it.count() < 2) "0$it" else it }

    return "#$alpha$red$green$blue".uppercase()
}

private sealed interface ListItem
data class HeaderItem(val title: String) : ListItem
data class ColorItem(val name: String, val color: Color) : ListItem

private fun SatsColors.toListItems(): List<ListItem> {
    return listOf(
        HeaderItem("Primary"),
        ColorItem("primary.default", primary.default),
        ColorItem("primary.disabled", primary.disabled),

        HeaderItem("On Primary"),
        ColorItem("onPrimary.default", onPrimary.default),
        ColorItem("onPrimary.disabled", onPrimary.disabled),

        HeaderItem("Secondary"),
        ColorItem("secondary.default", secondary.default),
        ColorItem("secondary.disabled", secondary.disabled),

        HeaderItem("On Secondary"),
        ColorItem("onSecondary.default", onSecondary.default),
        ColorItem("onSecondary.disabled", onSecondary.disabled),

        HeaderItem("Clean"),

        ColorItem("clean.default", clean.default),
        ColorItem("clean.disabled", clean.disabled),

        HeaderItem("CTA"),
        ColorItem("cta.default", cta.default),
        ColorItem("cta.disabled", cta.disabled),
        ColorItem("cta.nonText", cta.nonText),

        HeaderItem("Action"),
        ColorItem("action.default", action.default),
        ColorItem("action.disabled", action.disabled),

        HeaderItem("Signal"),
        ColorItem("signal.success", signal.success),
        ColorItem("signal.warning", signal.warning),
        ColorItem("signal.error", signal.error),
        ColorItem("signal.delete", signal.delete),

        HeaderItem("On Signal"),
        ColorItem("onSignal", onSignal),

        HeaderItem("Signal Background"),
        ColorItem("signalBackground.success", signalBackground.success),
        ColorItem("signalBackground.warning", signalBackground.warning),
        ColorItem("signalBackground.error", signalBackground.error),
        ColorItem("signalBackground.delete", signalBackground.delete),

        HeaderItem("Signal Text"),
        ColorItem("signalText.success", signalText.success),
        ColorItem("signalText.warning", signalText.warning),
        ColorItem("signalText.error", signalText.error),
        ColorItem("signalText.delete", signalText.delete),

        HeaderItem("UI"),
        ColorItem("ui.tabs", ui.tabs),
        ColorItem("ui.shimmer", ui.shimmer),
        ColorItem("ui.border", ui.border),
        ColorItem("ui.graphicalElements1", ui.graphicalElements1),
        ColorItem("ui.graphicalElements2", ui.graphicalElements2),
        ColorItem("ui.graphicalElements3", ui.graphicalElements3),
        ColorItem("ui.graphicalElements4", ui.graphicalElements4),
        ColorItem("ui.graphicalElements5", ui.graphicalElements5),
        ColorItem("ui.graphicalElements6", ui.graphicalElements6),
        ColorItem("ui.graphicalElements7", ui.graphicalElements7),

        HeaderItem("Challenges"),
        ColorItem("challenges.inProgress", challenges.inProgress),
        ColorItem("challenges.failed", challenges.failed),
        ColorItem("challenges.success", challenges.success),
        ColorItem("challenges.notDone", challenges.notDone),

        HeaderItem("Background"),
        ColorItem("background.primary", background.primary),
        ColorItem("background.secondary", background.secondary),

        HeaderItem("On Background"),
        ColorItem("onBackground.controls.enabledOn", onBackground.controls.enabledOn),
        ColorItem("onBackground.controls.enabledOff", onBackground.controls.enabledOff),
        ColorItem("onBackground.controls.disabledOn", onBackground.controls.disabledOn),
        ColorItem("onBackground.controls.disabledOff", onBackground.controls.disabledOff),
        ColorItem("onBackground.primary", onBackground.primary),
        ColorItem("onBackground.secondary", onBackground.secondary),
        ColorItem("onBackground.disabled", onBackground.disabled),

        HeaderItem("Surface"),
        ColorItem("surface.primary", surface.primary),
        ColorItem("surface.secondary", surface.secondary),

        HeaderItem("On Surface"),
        ColorItem("onSurface.controls.enabledOn", onSurface.controls.enabledOn),
        ColorItem("onSurface.controls.enabledOff", onSurface.controls.enabledOff),
        ColorItem("onSurface.controls.disabledOn", onSurface.controls.disabledOn),
        ColorItem("onSurface.controls.disabledOff", onSurface.controls.disabledOff),
        ColorItem("onSurface.primary", onSurface.primary),
        ColorItem("onSurface.secondary", onSurface.secondary),
        ColorItem("onSurface.disabled", onSurface.disabled),

        HeaderItem("Waiting List"),
        ColorItem("waitingList.background", waitingList.background),
        ColorItem("waitingList.primary", waitingList.primary),
        ColorItem("waitingList.text", waitingList.text),
        ColorItem("waitingList.disabled", waitingList.disabled),
    )
}

@PreviewLightDark
@Composable
private fun ColorsScreenPreview() {
    SatsTheme {
        ColorsScreen(navigateUp = {})
    }
}
