package com.sats.dna.sample.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sats.dna.components.SatsSurface
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

data object Colors2SampleScreen : SampleScreen(
    name = "Colors2",
    route = "/colors2",
    screen = { Colors2Screen(it::navigateUp) },
)

@Composable
private fun Colors2Screen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen("Colors2", navigateUp, modifier) { innerPadding ->
        Column(
            Modifier
                .verticalScroll(rememberScrollState())
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m),
            verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.l),
        ) {
            Buttons()

            GraphicalElements()

            BackgroundsAndSurfaces()
        }
    }
}

@Composable
private fun Buttons() {
    Section("Buttons", SectionLevel.Level1) {
        Section("Primary Button", SectionLevel.Level2) {
            val base = SatsTheme.colors2.buttonColors.primary

            ColorSample(
                backgroundColor = base.background.default named "Default",
                contentColor = base.content.default named "Default",
            )

            ColorSample(
                backgroundColor = base.background.hover named "Hover",
                contentColor = base.content.default named "Default",
            )

            ColorSample(
                backgroundColor = base.background.disabled named "Disabled",
                contentColor = base.content.disabled named "Disabled",
            )
        }

        Section("Secondary Button", SectionLevel.Level2) {
            val base = SatsTheme.colors2.buttonColors.secondary

            ColorSample(
                backgroundColor = base.background.default named "Default",
                contentColor = base.content.default named "Default",
            )

            ColorSample(
                backgroundColor = base.background.hover named "Hover",
                contentColor = base.content.default named "Default",
            )

            ColorSample(
                backgroundColor = base.background.disabled named "Disabled",
                contentColor = base.content.disabled named "Disabled",
            )
        }

        Section("Clean Buttons", SectionLevel.Level2) {
            val base = SatsTheme.colors2.buttonColors.clean

            ColorSample(
                backgroundColor = base.background.default named "Default",
                contentColor = base.content.default named "Default",
            )

            ColorSample(
                backgroundColor = base.background.hover named "Hover",
                contentColor = base.content.default named "Default",
            )

            ColorSample(
                backgroundColor = base.background.disabled named "Disabled",
                contentColor = base.content.disabled named "Disabled",
            )
        }

        Section("Clean Secondary Button", SectionLevel.Level2) {
            val base = SatsTheme.colors2.buttonColors.cleanSecondary

            ColorSample(
                backgroundColor = base.background.default named "Default",
                contentColor = base.content.default named "Default",
            )

            ColorSample(
                backgroundColor = base.background.hover named "Hover",
                contentColor = base.content.default named "Default",
            )

            ColorSample(
                backgroundColor = base.background.disabled named "Disabled",
                contentColor = base.content.disabled named "Disabled",
            )
        }

        Section("CTA Button", SectionLevel.Level2) {
            val base = SatsTheme.colors2.buttonColors.cta

            ColorSample(
                backgroundColor = base.background.default named "Default",
                contentColor = base.content.default named "Default",
            )

            ColorSample(
                backgroundColor = base.background.hover named "Hover",
                contentColor = base.content.default named "Default",
            )

            ColorSample(
                backgroundColor = base.background.disabled named "Disabled",
                contentColor = base.content.disabled named "Disabled",
            )
        }

        Section("Action", SectionLevel.Level2) {
            val base = SatsTheme.colors2.buttonColors.action

            ColorSample(
                backgroundColor = base.background.default named "Default",
                contentColor = base.content.default named "Default",
            )

            ColorSample(
                backgroundColor = base.background.hover named "Hover",
                contentColor = base.content.default named "Default",
            )

            ColorSample(
                backgroundColor = base.background.disabled named "Disabled",
                contentColor = base.content.disabled named "Disabled",
            )
        }

        Section("Waiting List Button", SectionLevel.Level2) {
            val base = SatsTheme.colors2.buttonColors.waitingList

            ColorSample(
                backgroundColor = base.background.default named "Default",
                contentColor = base.content.default.default named "Default",
            )

            ColorSample(
                backgroundColor = base.background.hover named "Hover",
                contentColor = base.content.default.default named "Default",
            )

            ColorSample(
                backgroundColor = base.background.disabled named "Disabled",
                contentColor = base.content.default.disabled named "Disabled",
            )

            ColorSample(
                backgroundColor = Color.Transparent named "Transparent",
                contentColor = base.content.alternate.default named "Alternate Default",
                borderColor = base.content.alternate.default,
            )

            ColorSample(
                backgroundColor = Color.Transparent named "Transparent",
                contentColor = base.content.alternate.hover named "Alternate Hover",
                borderColor = base.content.alternate.hover,
            )

            ColorSample(
                backgroundColor = Color.Transparent named "Transparent",
                contentColor = base.content.alternate.disabled named "Alternate Disabled",
                borderColor = base.content.alternate.disabled,
            )
        }

        Section("Delete Button", SectionLevel.Level2) {
            val base = SatsTheme.colors2.buttonColors.delete

            ColorSample(
                backgroundColor = base.background.default named "Default",
                contentColor = base.content.default.default named "Default",
            )

            ColorSample(
                backgroundColor = base.background.hover named "Hover",
                contentColor = base.content.default.default named "Default",
            )

            ColorSample(
                backgroundColor = base.background.disabled named "Disabled",
                contentColor = base.content.default.disabled named "Disabled",
            )

            ColorSample(
                backgroundColor = Color.Transparent named "Transparent",
                contentColor = base.content.alternate.default named "Alternate Default",
                borderColor = base.content.alternate.default,
            )

            ColorSample(
                backgroundColor = Color.Transparent named "Transparent",
                contentColor = base.content.alternate.hover named "Alternate Hover",
                borderColor = base.content.alternate.hover,
            )

            ColorSample(
                backgroundColor = Color.Transparent named "Transparent",
                contentColor = base.content.alternate.disabled named "Alternate Disabled",
                borderColor = base.content.alternate.disabled,
            )
        }
    }
}

@Composable
private fun GraphicalElements() {
    Section("Graphical Elements", SectionLevel.Level1) {
        Section("Divider", SectionLevel.Level2) {
            val base = SatsTheme.colors2.graphicalElements.divider

            ColorSample(
                backgroundColor = base.default named "Default",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.alternate named "Alternate",
                contentColor = null,
            )
        }

        Section("Skeleton", SectionLevel.Level2) {
            ColorSample(
                backgroundColor = SatsTheme.colors2.graphicalElements.skeleton named "Skeleton",
                contentColor = null,
            )
        }

        Section("Nav Bar", SectionLevel.Level2) {
            val base = SatsTheme.colors2.graphicalElements.navBar

            ColorSample(
                backgroundColor = base.notSelected named "Not Selected",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.selected named "Selected",
                contentColor = null,
            )
        }

        Section("Progress Bar", SectionLevel.Level2) {
            val base = SatsTheme.colors2.graphicalElements.progressBar

            ColorSample(
                backgroundColor = base.background named "Background",
                contentColor = base.indicator named "Indicator",
            )
        }

        Section("Graphs", SectionLevel.Level2) {
            val base = SatsTheme.colors2.graphicalElements.graphs

            ColorSample(
                backgroundColor = base.bar.primary.background named "Bar Background Primary",
                contentColor = base.bar.primary.default named "Bar Primary",
            )

            ColorSample(
                backgroundColor = base.bar.secondary.background named "Bar Background Secondary",
                contentColor = base.bar.secondary.default named "Bar Secondary",
            )

            ColorSample(
                backgroundColor = base.trend.upwards named "Trend Upwards",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.trend.neutral named "Trend Neutral",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.trend.downwards named "Trend Downwards",
                contentColor = null,
            )
        }

        Section("Selector", SectionLevel.Level2) {
            val base = SatsTheme.colors2.graphicalElements.selector

            ColorSample(
                backgroundColor = base.unselected.default named "Unselected Default",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.unselected.disabled named "Unselected Disabled",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.selected.default named "Selected Default",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.selected.disabled named "Selected Disabled",
                contentColor = null,
            )
        }

        Section("Chips", SectionLevel.Level2) {
            val base = SatsTheme.colors2.graphicalElements.chips

            ColorSample(
                backgroundColor = base.unselected.background.default named "Unselected Default",
                contentColor = base.unselected.content.default named "Unselected Default",
            )

            ColorSample(
                backgroundColor = base.unselected.background.disabled named "Unselected Disabled",
                contentColor = base.unselected.content.disabled named "Unselected Disabled",
            )

            ColorSample(
                backgroundColor = base.selected.background.default named "Selected Default",
                contentColor = base.selected.content.default named "Selected Default",
            )

            ColorSample(
                backgroundColor = base.selected.background.hover named "Selected Hover",
                contentColor = base.selected.content.default named "Selected Default",
            )

            ColorSample(
                backgroundColor = base.selected.background.disabled named "Selected Disabled",
                contentColor = base.selected.content.disabled named "Selected Disabled",
            )
        }

        Section("Toggle", SectionLevel.Level2) {
            val base = SatsTheme.colors2.graphicalElements.toggle

            ColorSample(
                backgroundColor = base.unselected.default named "Unselected Default",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.unselected.disabled named "Unselected Disabled",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.interactiveElement named "Interactive Element",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.selected.default named "Selected Default",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.selected.disabled named "Selected Disabled",
                contentColor = null,
            )
        }

        Section("Icons", SectionLevel.Level2) {
            val base = SatsTheme.colors2.graphicalElements.icons

            ColorSample(
                backgroundColor = base.primary named "Primary",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.secondary named "Secondary",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.fixed named "Fixed",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.positive named "Positive",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.attention named "Attention",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.negative named "Negative",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.waitingList named "Waiting List",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.delete named "Delete",
                contentColor = null,
            )
        }

        Section("Indicators", SectionLevel.Level2) {
            val base = SatsTheme.colors2.graphicalElements.indicators

            ColorSample(
                backgroundColor = base.positive.default named "Positive Default",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.positive.alternate named "Positive Alternate",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.attention.default named "Attention Default",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.attention.alternate named "Attention Alternate",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.negative.default named "Negative Default",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.negative.alternate named "Negative Alternate",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.neutral.default named "Neutral Default",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.neutral.alternate named "Neutral Alternate",
                contentColor = null,
            )
        }

        Section("Signal", SectionLevel.Level2) {
            val base = SatsTheme.colors2.graphicalElements.signal

            ColorSample(
                backgroundColor = base.success named "Success",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.warning named "Warning",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.error named "Error",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.neutral named "Neutral",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.waitingList named "Waiting List",
                contentColor = null,
            )
        }

        Section("Tags", SectionLevel.Level2) {
            val base = SatsTheme.colors2.graphicalElements.tags

            ColorSample(
                backgroundColor = base.primary.background named "Primary",
                contentColor = base.primary.content named "Primary",
            )

            ColorSample(
                backgroundColor = base.secondary.background named "Secondary",
                contentColor = base.secondary.content named "Secondary",
            )

            ColorSample(
                backgroundColor = base.featured.background named "Featured",
                contentColor = base.featured.content named "Featured",
            )
        }

        Section("Rewards", SectionLevel.Level2) {
            val base = SatsTheme.colors2.graphicalElements.rewards

            ColorSample(
                backgroundColor = base.background.blue named "Blue",
                contentColor = base.content named "Rewards",
            )

            ColorSample(
                backgroundColor = base.background.silver named "Silver",
                contentColor = base.content named "Rewards",
            )

            ColorSample(
                backgroundColor = base.background.gold named "Gold",
                contentColor = base.content named "Rewards",
            )

            ColorSample(
                backgroundColor = base.background.platinum named "Platinum",
                contentColor = base.content named "Rewards",
            )
        }

        Section("Workouts", SectionLevel.Level2) {
            val base = SatsTheme.colors2.graphicalElements.workouts

            ColorSample(
                backgroundColor = base.pt named "PT",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.gx named "GX",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.treatments named "Treatments",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.gymfloor named "Gymfloor",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.ownTrainingOther named "Own Training/Other",
                contentColor = null,
            )
        }
    }
}

@Composable
private fun BackgroundsAndSurfaces() {
    Section("Background & Surfaces", SectionLevel.Level1) {
        Section("Background", SectionLevel.Level2) {
            val base = SatsTheme.colors2.backgrounds.background

            ColorSample(
                backgroundColor = base.primary.background.default named "Primary Default",
                contentColor = base.primary.content.default named "Primary Default",
            )

            ColorSample(
                backgroundColor = base.primary.background.default named "Primary Default",
                contentColor = base.primary.content.alternate named "Primary Alternate",
            )

            ColorSample(
                backgroundColor = base.primary.background.default named "Primary Default",
                contentColor = base.primary.content.disabled named "Primary Disabled",
            )

            ColorSample(
                backgroundColor = base.primary.background.hover named "Primary Hover",
                contentColor = base.primary.content.default named "Primary Default",
            )

            ColorSample(
                backgroundColor = base.primary.background.selected named "Primary Selected",
                contentColor = base.primary.content.default named "Primary Default",
            )

            ColorSample(
                backgroundColor = base.secondary.background.default named "Secondary Default",
                contentColor = base.secondary.content.default named "Secondary Default",
            )

            ColorSample(
                backgroundColor = base.secondary.background.default named "Secondary Default",
                contentColor = base.secondary.content.alternate named "Secondary Alternate",
            )

            ColorSample(
                backgroundColor = base.secondary.background.default named "Secondary Default",
                contentColor = base.secondary.content.disabled named "Secondary Disabled",
            )

            ColorSample(
                backgroundColor = base.secondary.background.hover named "Secondary Hover",
                contentColor = base.secondary.content.default named "Secondary Default",
            )

            ColorSample(
                backgroundColor = base.secondary.background.selected named "Secondary Selected",
                contentColor = base.secondary.content.default named "Secondary Default",
            )

            ColorSample(
                backgroundColor = base.fixed.background.default named "Fixed Default",
                contentColor = base.fixed.content.default named "Fixed Default",
            )

            ColorSample(
                backgroundColor = base.fixed.background.default named "Fixed Default",
                contentColor = base.fixed.content.alternate named "Fixed Alternate",
            )

            ColorSample(
                backgroundColor = base.fixed.background.default named "Fixed Default",
                contentColor = base.fixed.content.disabled named "Fixed Disabled",
            )

            ColorSample(
                backgroundColor = base.fixed.background.hover named "Fixed Hover",
                contentColor = base.fixed.content.default named "Fixed Default",
            )

            ColorSample(
                backgroundColor = base.fixed.background.selected named "Fixed Selected",
                contentColor = base.fixed.content.default named "Fixed Default",
            )
        }

        Section("Surface", SectionLevel.Level2) {
            val base = SatsTheme.colors2.backgrounds.surface

            ColorSample(
                backgroundColor = base.primary.background.default named "Primary Default",
                contentColor = base.primary.content.default named "Primary Default",
            )

            ColorSample(
                backgroundColor = base.primary.background.default named "Primary Default",
                contentColor = base.primary.content.alternate named "Primary Alternate",
            )

            ColorSample(
                backgroundColor = base.primary.background.default named "Primary Default",
                contentColor = base.primary.content.disabled named "Primary Disabled",
            )

            ColorSample(
                backgroundColor = base.primary.background.default named "Primary Default",
                contentColor = base.primary.content.disabled named "Primary Disabled",
            )

            ColorSample(
                backgroundColor = base.primary.background.default named "Primary Default",
                contentColor = base.primary.content.success named "Success",
            )

            ColorSample(
                backgroundColor = base.primary.background.default named "Primary Default",
                contentColor = base.primary.content.warning named "Warning",
            )

            ColorSample(
                backgroundColor = base.primary.background.default named "Primary Default",
                contentColor = base.primary.content.error named "Error",
            )

            ColorSample(
                backgroundColor = base.primary.background.default named "Primary Default",
                contentColor = base.primary.content.waitlist named "Waitlist",
            )

            ColorSample(
                backgroundColor = base.primary.background.default named "Primary Default",
                contentColor = base.primary.content.neutral named "Neutral",
            )

            ColorSample(
                backgroundColor = base.primary.background.default named "Primary Default",
                contentColor = base.primary.content.information named "Information",
            )

            ColorSample(
                backgroundColor = base.primary.background.hover named "Primary Hover",
                contentColor = base.primary.content.default named "Primary Default",
            )

            ColorSample(
                backgroundColor = base.primary.background.selected named "Primary Selected",
                contentColor = base.primary.content.default named "Primary Default",
            )

            ColorSample(
                backgroundColor = base.secondary.background.default named "Secondary Default",
                contentColor = base.secondary.content.default named "Secondary Default",
            )

            ColorSample(
                backgroundColor = base.secondary.background.default named "Secondary Default",
                contentColor = base.secondary.content.alternate named "Secondary Alternate",
            )

            ColorSample(
                backgroundColor = base.secondary.background.default named "Secondary Default",
                contentColor = base.secondary.content.disabled named "Secondary Disabled",
            )

            ColorSample(
                backgroundColor = base.secondary.background.default named "Secondary Default",
                contentColor = base.secondary.content.disabled named "Secondary Disabled",
            )

            ColorSample(
                backgroundColor = base.secondary.background.default named "Secondary Default",
                contentColor = base.secondary.content.success named "Success",
            )

            ColorSample(
                backgroundColor = base.secondary.background.default named "Secondary Default",
                contentColor = base.secondary.content.warning named "Warning",
            )

            ColorSample(
                backgroundColor = base.secondary.background.default named "Secondary Default",
                contentColor = base.secondary.content.error named "Error",
            )

            ColorSample(
                backgroundColor = base.secondary.background.default named "Secondary Default",
                contentColor = base.secondary.content.waitlist named "Waitlist",
            )

            ColorSample(
                backgroundColor = base.secondary.background.default named "Secondary Default",
                contentColor = base.secondary.content.neutral named "Neutral",
            )

            ColorSample(
                backgroundColor = base.secondary.background.default named "Secondary Default",
                contentColor = base.secondary.content.information named "Information",
            )

            ColorSample(
                backgroundColor = base.secondary.background.hover named "Secondary Hover",
                contentColor = base.secondary.content.default named "Secondary Default",
            )

            ColorSample(
                backgroundColor = base.secondary.background.selected named "Secondary Selected",
                contentColor = base.secondary.content.default named "Secondary Default",
            )

            ColorSample(
                backgroundColor = base.fixed.background.default named "Fixed Default",
                contentColor = base.fixed.content.default named "Fixed Default",
            )

            ColorSample(
                backgroundColor = base.fixed.background.default named "Fixed Default",
                contentColor = base.fixed.content.alternate named "Fixed Alternate",
            )

            ColorSample(
                backgroundColor = base.fixed.background.default named "Fixed Default",
                contentColor = base.fixed.content.disabled named "Fixed Disabled",
            )

            ColorSample(
                backgroundColor = base.fixed.background.default named "Fixed Default",
                contentColor = base.fixed.content.disabled named "Fixed Disabled",
            )

            ColorSample(
                backgroundColor = base.fixed.background.hover named "Fixed Hover",
                contentColor = base.fixed.content.default named "Fixed Default",
            )

            ColorSample(
                backgroundColor = base.fixed.background.selected named "Fixed Selected",
                contentColor = base.fixed.content.default named "Fixed Default",
            )
        }

        Section("Signal Surface", SectionLevel.Level2) {
            val base = SatsTheme.colors2.backgrounds.signalSurface

            ColorSample(
                backgroundColor = base.success.background named "Success",
                contentColor = base.success.content.default named "Success Default",
            )

            ColorSample(
                backgroundColor = base.warning.background named "Warning",
                contentColor = base.warning.content.default named "Warning Default",
            )

            ColorSample(
                backgroundColor = base.warning.background named "Warning",
                contentColor = base.warning.content.alternate named "Warning Alternate",
            )

            ColorSample(
                backgroundColor = base.error.background named "Error",
                contentColor = base.error.content.default named "Error Default",
            )

            ColorSample(
                backgroundColor = base.error.background named "Error",
                contentColor = base.error.content.alternate named "Error Alternate",
            )

            ColorSample(
                backgroundColor = base.waitlist.background named "Waitlist",
                contentColor = base.waitlist.content.default named "Waitlist Default",
            )

            ColorSample(
                backgroundColor = base.waitlist.background named "Waitlist",
                contentColor = base.waitlist.content.alternate named "Waitlist Alternate",
            )

            ColorSample(
                backgroundColor = base.neutral.background named "Neutral",
                contentColor = base.neutral.content.default named "Neutral Default",
            )

            ColorSample(
                backgroundColor = base.neutral.background named "Neutral",
                contentColor = base.neutral.content.alternate named "Neutral Alternate",
            )

            ColorSample(
                backgroundColor = base.information.background named "Information",
                contentColor = base.information.content.default named "Information Default",
            )

            ColorSample(
                backgroundColor = base.information.background named "Information",
                contentColor = base.information.content.alternate named "Information Alternate",
            )
        }
    }
}

@Composable
private fun Section(
    title: String,
    level: SectionLevel,
    modifier: Modifier = Modifier,
    content: @Composable ColumnScope.() -> Unit,
) {
    val headingStyle = when (level) {
        SectionLevel.Level1 -> SatsTheme.typography.emphasis.headline1
        SectionLevel.Level2 -> SatsTheme.typography.medium.headline2
    }

    Column(modifier, verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m)) {
        Text(title, style = headingStyle)

        val contentSpacing = when (level) {
            SectionLevel.Level1 -> SatsTheme.spacing.l
            SectionLevel.Level2 -> SatsTheme.spacing.m
        }

        Column(verticalArrangement = Arrangement.spacedBy(contentSpacing)) {
            content()
        }
    }
}

enum class SectionLevel { Level1, Level2 }

@Composable
private fun ColorSample(
    backgroundColor: NamedColor,
    contentColor: NamedColor?,
    modifier: Modifier = Modifier,
    borderColor: Color = Color.Unspecified,
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Box(
            Modifier
                .size(56.dp)
                .clip(SatsTheme.shapes.roundedCorners.small)
                .border(2.dp, borderColor, SatsTheme.shapes.roundedCorners.small)
                .background(backgroundColor.color),
        ) {
            if (contentColor != null) {
                Box(
                    Modifier
                        .align(Alignment.Center)
                        .size(24.dp)
                        .clip(SatsTheme.shapes.circle)
                        .background(contentColor.color),
                )
            }
        }

        Column {
            ColorNameAndHex(backgroundColor)

            if (contentColor != null) {
                ColorNameAndHex(contentColor)
            }
        }
    }
}

@Composable
private fun ColorNameAndHex(backgroundColor: NamedColor, modifier: Modifier = Modifier) {
    Row(modifier, horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s)) {
        Text(backgroundColor.name, style = SatsTheme.typography.medium.basic)

        Text(
            backgroundColor.toHexString(),
            color = SatsTheme.colors2.backgrounds.surface.primary.content.alternate,
        )
    }
}

class NamedColor(val name: String, val color: Color) {
    fun toHexString(): String {
        val red = Integer.toHexString((color.red * 255).toInt()).let { if (it.count() < 2) "0$it" else it }
        val green = Integer.toHexString((color.green * 255).toInt()).let { if (it.count() < 2) "0$it" else it }
        val blue = Integer.toHexString((color.blue * 255).toInt()).let { if (it.count() < 2) "0$it" else it }
        val alpha = Integer.toHexString((color.alpha * 255).toInt()).let { if (it.count() < 2) "0$it" else it }

        return "#$alpha$red$green$blue".uppercase()
    }
}

@LightDarkPreview
@Composable
private fun ColorSamplePreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.background.primary, useMaterial3 = true) {
            ColorSample(
                backgroundColor = Color.Green named "Green",
                contentColor = Color.Red named "Red",
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

private infix fun Color.named(name: String) = NamedColor(name, this)

@LightDarkPreview
@Composable
private fun Colors2ScreenPreview() {
    SatsTheme {
        Colors2Screen(navigateUp = {})
    }
}
