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
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.components.SatsSurface
import com.sats.dna.theme.SatsTheme

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

            Backgrounds()

            Surfaces()

            SignalSurfaces()
        }
    }
}

@Composable
private fun Buttons() {
    Section("Buttons", SectionLevel.Level1) {
        Section("Primary Button", SectionLevel.Level2) {
            val base = SatsTheme.colors2.buttons.primary

            ColorSample(
                backgroundColor = base.default.bg named "Default",
                contentColor = base.default.fg named "Default",
            )

            ColorSample(
                backgroundColor = base.hover.bg named "Hover",
                contentColor = base.default.fg named "Default",
            )

            ColorSample(
                backgroundColor = base.disabled.bg named "Disabled",
                contentColor = base.disabled.fg named "Disabled",
            )
        }

        Section("Secondary Button", SectionLevel.Level2) {
            val base = SatsTheme.colors2.buttons.secondary

            ColorSample(
                backgroundColor = base.default.bg named "Default",
                contentColor = base.default.fg named "Default",
            )

            ColorSample(
                backgroundColor = base.hover.bg named "Hover",
                contentColor = base.default.fg named "Default",
            )

            ColorSample(
                backgroundColor = base.disabled.bg named "Disabled",
                contentColor = base.disabled.fg named "Disabled",
            )
        }

        Section("Clean Buttons", SectionLevel.Level2) {
            val base = SatsTheme.colors2.buttons.clean

            ColorSample(
                backgroundColor = base.default.bg named "Default",
                contentColor = base.default.fg named "Default",
            )

            ColorSample(
                backgroundColor = base.hover.bg named "Hover",
                contentColor = base.default.fg named "Default",
            )

            ColorSample(
                backgroundColor = base.disabled.bg named "Disabled",
                contentColor = base.disabled.fg named "Disabled",
            )
        }

        Section("Clean Secondary Button", SectionLevel.Level2) {
            val base = SatsTheme.colors2.buttons.cleanSecondary

            ColorSample(
                backgroundColor = base.default.bg named "Default",
                contentColor = base.default.fg named "Default",
            )

            ColorSample(
                backgroundColor = base.hover.bg named "Hover",
                contentColor = base.default.fg named "Default",
            )

            ColorSample(
                backgroundColor = base.disabled.bg named "Disabled",
                contentColor = base.disabled.fg named "Disabled",
            )
        }

        Section("CTA Button", SectionLevel.Level2) {
            val base = SatsTheme.colors2.buttons.cta

            ColorSample(
                backgroundColor = base.default.bg named "Default",
                contentColor = base.default.fg named "Default",
            )

            ColorSample(
                backgroundColor = base.hover.bg named "Hover",
                contentColor = base.default.fg named "Default",
            )

            ColorSample(
                backgroundColor = base.disabled.bg named "Disabled",
                contentColor = base.disabled.fg named "Disabled",
            )
        }

        Section("Action", SectionLevel.Level2) {
            val base = SatsTheme.colors2.buttons.action

            ColorSample(
                backgroundColor = Color.Transparent named "Transparent",
                contentColor = base.default named "Default",
            )

            ColorSample(
                backgroundColor = Color.Transparent named "Transparent",
                contentColor = base.default named "Default",
            )

            ColorSample(
                backgroundColor = Color.Transparent named "Transparent",
                contentColor = base.disabled named "Disabled",
            )
        }

        Section("Waiting List Button (filled)", SectionLevel.Level2) {
            val base = SatsTheme.colors2.buttons.waitingListFilled

            ColorSample(
                backgroundColor = base.default.bg named "Default",
                contentColor = base.default.fg named "Default",
            )

            ColorSample(
                backgroundColor = base.hover.bg named "Hover",
                contentColor = base.default.fg named "Default",
            )

            ColorSample(
                backgroundColor = base.disabled.bg named "Disabled",
                contentColor = base.disabled.fg named "Disabled",
            )
        }

        Section("Waiting List Button (outlined)", SectionLevel.Level2) {
            val base = SatsTheme.colors2.buttons.waitingListOutlined

            ColorSample(
                backgroundColor = Color.Transparent named "Transparent",
                contentColor = base.default named "Default",
                borderColor = base.default,
            )

            ColorSample(
                backgroundColor = Color.Transparent named "Transparent",
                contentColor = base.default named "Default",
                borderColor = base.default,
            )

            ColorSample(
                backgroundColor = Color.Transparent named "Transparent",
                contentColor = base.default named "Default",
                borderColor = base.default,
            )
        }

        Section("Delete Button (filled)", SectionLevel.Level2) {
            val base = SatsTheme.colors2.buttons.deleteFilled

            ColorSample(
                backgroundColor = base.default.bg named "Default",
                contentColor = base.default.fg named "Default",
            )

            ColorSample(
                backgroundColor = base.hover.bg named "Hover",
                contentColor = base.default.fg named "Default",
            )

            ColorSample(
                backgroundColor = base.disabled.bg named "Disabled",
                contentColor = base.disabled.fg named "Disabled",
            )
        }

        Section("Delete Button (outlined)", SectionLevel.Level2) {
            val base = SatsTheme.colors2.buttons.deleteOutlined

            ColorSample(
                backgroundColor = Color.Transparent named "Transparent",
                contentColor = base.default named "Default",
                borderColor = base.default,
            )

            ColorSample(
                backgroundColor = Color.Transparent named "Transparent",
                contentColor = base.default named "Default",
                borderColor = base.default,
            )

            ColorSample(
                backgroundColor = Color.Transparent named "Transparent",
                contentColor = base.default named "Default",
                borderColor = base.default,
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
        Section("Border", SectionLevel.Level2) {
            val base = SatsTheme.colors2.graphicalElements.border

            ColorSample(
                backgroundColor = base.default named "Default",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.focused named "Focused",
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
                backgroundColor = base.bg named "Background",
                contentColor = base.indicator named "Indicator",
            )
        }

        Section("Graphs", SectionLevel.Level2) {
            val base = SatsTheme.colors2.graphicalElements.graphs

            ColorSample(
                backgroundColor = base.bar.primary.bg named "Bar Background Primary",
                contentColor = base.bar.primary.default named "Bar Primary",
            )

            ColorSample(
                backgroundColor = base.bar.secondary.bg named "Bar Background Secondary",
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
                contentColor = base.indicator named "Indicator",
            )

            ColorSample(
                backgroundColor = base.selected.disabled named "Selected Disabled",
                contentColor = base.indicator named "Indicator",
            )
        }

        Section("Chips", SectionLevel.Level2) {
            val base = SatsTheme.colors2.graphicalElements.chips

            ColorSample(
                backgroundColor = base.unselected.default.bg named "Unselected Default",
                contentColor = base.unselected.default.fg named "Unselected Default",
            )

            ColorSample(
                backgroundColor = base.unselected.disabled.bg named "Unselected Disabled",
                contentColor = base.unselected.disabled.fg named "Unselected Disabled",
            )

            ColorSample(
                backgroundColor = base.selected.default.bg named "Selected Default",
                contentColor = base.selected.default.fg named "Selected Default",
            )

            ColorSample(
                backgroundColor = base.selected.hover.bg named "Selected Hover",
                contentColor = base.selected.default.fg named "Selected Default",
            )

            ColorSample(
                backgroundColor = base.selected.disabled.bg named "Selected Disabled",
                contentColor = base.selected.disabled.fg named "Selected Disabled",
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
                backgroundColor = base.primary.bg named "Primary",
                contentColor = base.primary.fg named "Primary",
            )

            ColorSample(
                backgroundColor = base.secondary.bg named "Secondary",
                contentColor = base.secondary.fg named "Secondary",
            )

            ColorSample(
                backgroundColor = base.featured.bg named "Featured",
                contentColor = base.featured.fg named "Featured",
            )
        }

        Section("Rewards", SectionLevel.Level2) {
            val base = SatsTheme.colors2.graphicalElements.rewards

            ColorSample(
                backgroundColor = base.blue.bg named "Blue",
                contentColor = base.blue.fg named "Rewards",
            )

            ColorSample(
                backgroundColor = base.silver.bg named "Silver",
                contentColor = base.silver.fg named "Rewards",
            )

            ColorSample(
                backgroundColor = base.gold.bg named "Gold",
                contentColor = base.gold.fg named "Rewards",
            )

            ColorSample(
                backgroundColor = base.platinum.bg named "Platinum",
                contentColor = base.platinum.fg named "Rewards",
            )
        }

        Section("Workouts", SectionLevel.Level2) {
            val base = SatsTheme.colors2.graphicalElements.workouts

            ColorSample(
                backgroundColor = base.pt.bg named "PT",
                contentColor = base.pt.fg named "PT",
            )

            ColorSample(
                backgroundColor = base.gx.bg named "GX",
                contentColor = base.gx.fg named "GX",
            )

            ColorSample(
                backgroundColor = base.treatments.bg named "Treatments",
                contentColor = base.treatments.fg named "Treatments",
            )

            ColorSample(
                backgroundColor = base.gymfloor.bg named "Gymfloor",
                contentColor = base.gymfloor.fg named "Gymfloor",
            )

            ColorSample(
                backgroundColor = base.ownTrainingOther.bg named "Own Training/Other",
                contentColor = base.ownTrainingOther.fg named "Own Training/Other",
            )
        }
    }
}

@Composable
private fun Backgrounds() {
    Section("Backgrounds", SectionLevel.Level1) {
        val base = SatsTheme.colors2.backgrounds

        ColorSample(
            backgroundColor = base.primary.bg.default named "Primary Default",
            contentColor = base.primary.fg.default named "Primary Default",
        )

        ColorSample(
            backgroundColor = base.primary.bg.default named "Primary Default",
            contentColor = base.primary.fg.alternate named "Primary Alternate",
        )

        ColorSample(
            backgroundColor = base.primary.bg.default named "Primary Default",
            contentColor = base.primary.fg.disabled named "Primary Disabled",
        )

        ColorSample(
            backgroundColor = base.primary.bg.hover named "Primary Hover",
            contentColor = base.primary.fg.default named "Primary Default",
        )

        ColorSample(
            backgroundColor = base.primary.bg.selected named "Primary Selected",
            contentColor = base.primary.fg.default named "Primary Default",
        )

        ColorSample(
            backgroundColor = base.secondary.bg.default named "Secondary Default",
            contentColor = base.secondary.fg.default named "Secondary Default",
        )

        ColorSample(
            backgroundColor = base.secondary.bg.default named "Secondary Default",
            contentColor = base.secondary.fg.alternate named "Secondary Alternate",
        )

        ColorSample(
            backgroundColor = base.secondary.bg.default named "Secondary Default",
            contentColor = base.secondary.fg.disabled named "Secondary Disabled",
        )

        ColorSample(
            backgroundColor = base.secondary.bg.hover named "Secondary Hover",
            contentColor = base.secondary.fg.default named "Secondary Default",
        )

        ColorSample(
            backgroundColor = base.secondary.bg.selected named "Secondary Selected",
            contentColor = base.secondary.fg.default named "Secondary Default",
        )

        ColorSample(
            backgroundColor = base.fixed.bg.default named "Fixed Default",
            contentColor = base.fixed.fg.default named "Fixed Default",
        )

        ColorSample(
            backgroundColor = base.fixed.bg.default named "Fixed Default",
            contentColor = base.fixed.fg.alternate named "Fixed Alternate",
        )

        ColorSample(
            backgroundColor = base.fixed.bg.default named "Fixed Default",
            contentColor = base.fixed.fg.disabled named "Fixed Disabled",
        )

        ColorSample(
            backgroundColor = base.fixed.bg.hover named "Fixed Hover",
            contentColor = base.fixed.fg.default named "Fixed Default",
        )

        ColorSample(
            backgroundColor = base.fixed.bg.selected named "Fixed Selected",
            contentColor = base.fixed.fg.default named "Fixed Default",
        )
    }
}

@Composable
private fun Surfaces() {
    Section("Surfaces", SectionLevel.Level1) {
        val base = SatsTheme.colors2.surfaces

        ColorSample(
            backgroundColor = base.primary.bg.default named "Primary Default",
            contentColor = base.primary.fg.default named "Primary Default",
        )

        ColorSample(
            backgroundColor = base.primary.bg.default named "Primary Default",
            contentColor = base.primary.fg.alternate named "Primary Alternate",
        )

        ColorSample(
            backgroundColor = base.primary.bg.default named "Primary Default",
            contentColor = base.primary.fg.disabled named "Primary Disabled",
        )

        ColorSample(
            backgroundColor = base.primary.bg.default named "Primary Default",
            contentColor = base.primary.fg.disabled named "Primary Disabled",
        )

        ColorSample(
            backgroundColor = base.primary.bg.default named "Primary Default",
            contentColor = base.primary.fg.success named "Success",
        )

        ColorSample(
            backgroundColor = base.primary.bg.default named "Primary Default",
            contentColor = base.primary.fg.warning named "Warning",
        )

        ColorSample(
            backgroundColor = base.primary.bg.default named "Primary Default",
            contentColor = base.primary.fg.error named "Error",
        )

        ColorSample(
            backgroundColor = base.primary.bg.default named "Primary Default",
            contentColor = base.primary.fg.waitlist named "Waitlist",
        )

        ColorSample(
            backgroundColor = base.primary.bg.default named "Primary Default",
            contentColor = base.primary.fg.neutral named "Neutral",
        )

        ColorSample(
            backgroundColor = base.primary.bg.default named "Primary Default",
            contentColor = base.primary.fg.information named "Information",
        )

        ColorSample(
            backgroundColor = base.primary.bg.default named "Primary Default",
            contentColor = base.primary.fg.featured named "Featured",
        )

        ColorSample(
            backgroundColor = base.primary.bg.hover named "Primary Hover",
            contentColor = base.primary.fg.default named "Primary Default",
        )

        ColorSample(
            backgroundColor = base.primary.bg.selected named "Primary Selected",
            contentColor = base.primary.fg.default named "Primary Default",
        )

        ColorSample(
            backgroundColor = base.secondary.bg.default named "Secondary Default",
            contentColor = base.secondary.fg.default named "Secondary Default",
        )

        ColorSample(
            backgroundColor = base.secondary.bg.default named "Secondary Default",
            contentColor = base.secondary.fg.alternate named "Secondary Alternate",
        )

        ColorSample(
            backgroundColor = base.secondary.bg.default named "Secondary Default",
            contentColor = base.secondary.fg.disabled named "Secondary Disabled",
        )

        ColorSample(
            backgroundColor = base.secondary.bg.default named "Secondary Default",
            contentColor = base.secondary.fg.disabled named "Secondary Disabled",
        )

        ColorSample(
            backgroundColor = base.secondary.bg.default named "Secondary Default",
            contentColor = base.secondary.fg.success named "Success",
        )

        ColorSample(
            backgroundColor = base.secondary.bg.default named "Secondary Default",
            contentColor = base.secondary.fg.warning named "Warning",
        )

        ColorSample(
            backgroundColor = base.secondary.bg.default named "Secondary Default",
            contentColor = base.secondary.fg.error named "Error",
        )

        ColorSample(
            backgroundColor = base.secondary.bg.default named "Secondary Default",
            contentColor = base.secondary.fg.waitlist named "Waitlist",
        )

        ColorSample(
            backgroundColor = base.secondary.bg.default named "Secondary Default",
            contentColor = base.secondary.fg.neutral named "Neutral",
        )

        ColorSample(
            backgroundColor = base.secondary.bg.default named "Secondary Default",
            contentColor = base.secondary.fg.information named "Information",
        )

        ColorSample(
            backgroundColor = base.secondary.bg.default named "Secondary Default",
            contentColor = base.secondary.fg.featured named "Featured",
        )

        ColorSample(
            backgroundColor = base.secondary.bg.hover named "Secondary Hover",
            contentColor = base.secondary.fg.default named "Secondary Default",
        )

        ColorSample(
            backgroundColor = base.secondary.bg.selected named "Secondary Selected",
            contentColor = base.secondary.fg.default named "Secondary Default",
        )

        ColorSample(
            backgroundColor = base.fixed.bg.default named "Fixed Default",
            contentColor = base.fixed.fg.default named "Fixed Default",
        )

        ColorSample(
            backgroundColor = base.fixed.bg.default named "Fixed Default",
            contentColor = base.fixed.fg.alternate named "Fixed Alternate",
        )

        ColorSample(
            backgroundColor = base.fixed.bg.default named "Fixed Default",
            contentColor = base.fixed.fg.disabled named "Fixed Disabled",
        )

        ColorSample(
            backgroundColor = base.fixed.bg.default named "Fixed Default",
            contentColor = base.fixed.fg.featured named "Fixed Featured",
        )

        ColorSample(
            backgroundColor = base.fixed.bg.hover named "Fixed Hover",
            contentColor = base.fixed.fg.default named "Fixed Default",
        )

        ColorSample(
            backgroundColor = base.fixed.bg.selected named "Fixed Selected",
            contentColor = base.fixed.fg.default named "Fixed Default",
        )
    }
}

@Composable
private fun SignalSurfaces() {
    Section("Signal Surface", SectionLevel.Level1) {
        val base = SatsTheme.colors2.signalSurfaces

        ColorSample(
            backgroundColor = base.success.bg named "Success",
            contentColor = base.success.fg.default named "Success Default",
        )

        ColorSample(
            backgroundColor = base.warning.bg named "Warning",
            contentColor = base.warning.fg.default named "Warning Default",
        )

        ColorSample(
            backgroundColor = base.warning.bg named "Warning",
            contentColor = base.warning.fg.alternate named "Warning Alternate",
        )

        ColorSample(
            backgroundColor = base.error.bg named "Error",
            contentColor = base.error.fg.default named "Error Default",
        )

        ColorSample(
            backgroundColor = base.error.bg named "Error",
            contentColor = base.error.fg.alternate named "Error Alternate",
        )

        ColorSample(
            backgroundColor = base.waitlist.bg named "Waitlist",
            contentColor = base.waitlist.fg.default named "Waitlist Default",
        )

        ColorSample(
            backgroundColor = base.waitlist.bg named "Waitlist",
            contentColor = base.waitlist.fg.alternate named "Waitlist Alternate",
        )

        ColorSample(
            backgroundColor = base.neutral.bg named "Neutral",
            contentColor = base.neutral.fg.default named "Neutral Default",
        )

        ColorSample(
            backgroundColor = base.neutral.bg named "Neutral",
            contentColor = base.neutral.fg.alternate named "Neutral Alternate",
        )

        ColorSample(
            backgroundColor = base.information.bg named "Information",
            contentColor = base.information.fg.default named "Information Default",
        )

        ColorSample(
            backgroundColor = base.information.bg named "Information",
            contentColor = base.information.fg.alternate named "Information Alternate",
        )
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
            color = SatsTheme.colors2.surfaces.primary.fg.alternate,
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

@PreviewLightDark
@Composable
private fun ColorSamplePreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            ColorSample(
                backgroundColor = Color.Green named "Green",
                contentColor = Color.Red named "Red",
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

private infix fun Color.named(name: String) = NamedColor(name, this)

@PreviewLightDark
@Composable
private fun Colors2ScreenPreview() {
    SatsTheme {
        Colors2Screen(navigateUp = {})
    }
}
