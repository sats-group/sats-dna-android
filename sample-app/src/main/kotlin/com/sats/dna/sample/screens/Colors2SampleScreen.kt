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

            FixedBackgrounds()

            Surfaces()

            FixedSurfaces()

            SignalSurfaces()
        }
    }
}

@Composable
private fun Buttons() {
    Section("Buttons", SectionLevel.Level1) {
        Section("Primary Button", SectionLevel.Level2, base = "buttons.primary") {
            val base = SatsTheme.colors2.buttons.primary

            ColorSample(
                backgroundColor = base.default.bg named "base.default.bg",
                contentColor = base.default.fg named "base.default.fg",
            )

            ColorSample(
                backgroundColor = base.disabled.bg named "base.disabled.bg",
                contentColor = base.disabled.fg named "base.disabled.fg",
            )
        }

        Section("Secondary Button", SectionLevel.Level2, base = "buttons.secondary") {
            val base = SatsTheme.colors2.buttons.secondary

            ColorSample(
                backgroundColor = base.default.bg named "base.default.bg",
                borderColor = base.default.outline,
                contentColor = base.default.fg named "base.default.fg",
            )

            ColorSample(
                backgroundColor = base.disabled.bg named "base.disabled.bg",
                borderColor = base.disabled.outline,
                contentColor = base.disabled.fg named "base.disabled.fg",
            )
        }

        Section("Clean Buttons", SectionLevel.Level2, base = "buttons.clean") {
            val base = SatsTheme.colors2.buttons.clean

            ColorSample(
                backgroundColor = base.default.bg named "base.default.bg",
                contentColor = base.default.fg named "base.default.fg",
            )

            ColorSample(
                backgroundColor = base.disabled.bg named "base.disabled.bg",
                contentColor = base.disabled.fg named "base.disabled.fg",
            )
        }

        Section("Clean Secondary Button", SectionLevel.Level2, base = "buttons.cleanSecondary") {
            val base = SatsTheme.colors2.buttons.cleanSecondary

            ColorSample(
                backgroundColor = base.default.bg named "base.default.bg",
                contentColor = base.default.fg named "base.default.fg",
            )

            ColorSample(
                backgroundColor = base.disabled.bg named "base.disabled.bg",
                contentColor = base.disabled.fg named "base.disabled.fg",
            )
        }

        Section("Action", SectionLevel.Level2, base = "buttons.action") {
            val base = SatsTheme.colors2.buttons.action

            ColorSample(
                backgroundColor = base.default.bg named "base.default.bg",
                contentColor = base.default.fg named "base.default.fg",
            )

            ColorSample(
                backgroundColor = base.disabled.bg named "base.disabled.bg",
                contentColor = base.disabled.fg named "base.disabled.fg",
            )
        }

        Section("Waiting List Primary Button", SectionLevel.Level2, base = "buttons.waitingListFilled") {
            val base = SatsTheme.colors2.buttons.waitingListFilled

            ColorSample(
                backgroundColor = base.default.bg named "base.default.bg",
                contentColor = base.default.fg named "base.default.fg",
            )

            ColorSample(
                backgroundColor = base.disabled.bg named "base.disabled.bg",
                contentColor = base.disabled.fg named "base.disabled.fg",
            )
        }

        Section("Waiting List Secondary Button", SectionLevel.Level2, base = "buttons.waitingListSecondary") {
            val base = SatsTheme.colors2.buttons.waitingListSecondary

            ColorSample(
                backgroundColor = base.default.bg named "base.default.bg",
                borderColor = base.default.outline,
                contentColor = base.default.fg named "base.default.fg",
            )

            ColorSample(
                backgroundColor = base.disabled.bg named "base.disabled.bg",
                borderColor = base.disabled.outline,
                contentColor = base.disabled.fg named "base.disabled.fg",
            )
        }

        Section("Destructive Button Details", SectionLevel.Level2, base = "buttons.destructive.default") {
            val base = SatsTheme.colors2.buttons.destructive.default

            ColorSample(
                backgroundColor = base.default.bg named "base.default.bg",
                contentColor = base.default.fg named "base.default.fg",
            )

            ColorSample(
                backgroundColor = base.disabled.bg named "base.disabled.bg",
                contentColor = base.disabled.fg named "base.disabled.fg",
            )
        }

        Section("Destructive Button Alternate", SectionLevel.Level2, base = "buttons.destructive.alternate") {
            val base = SatsTheme.colors2.buttons.destructive.alternate

            ColorSample(
                backgroundColor = base.default.bg named "base.default.bg",
                borderColor = base.default.outline,
                contentColor = base.default.fg named "base.default.fg",
            )

            ColorSample(
                backgroundColor = base.disabled.bg named "base.disabled.bg",
                borderColor = base.disabled.outline,
                contentColor = base.disabled.fg named "base.disabled.fg",
            )
        }
    }
}

@Composable
private fun GraphicalElements() {
    Section("Graphical Elements", SectionLevel.Level1) {
        Section("Divider", SectionLevel.Level2, base = "graphicalElements.divider") {
            val base = SatsTheme.colors2.graphicalElements.divider

            ColorSample(
                backgroundColor = base.default named "base.default",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.alternate named "base.alternate",
                contentColor = null,
            )
        }

        Section("Border", SectionLevel.Level2, base = "graphicalElements.border") {
            val base = SatsTheme.colors2.graphicalElements.border

            ColorSample(
                backgroundColor = base.default named "base.default",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.focused named "base.focused",
                contentColor = null,
            )
        }

        Section("Skeleton", SectionLevel.Level2) {
            ColorSample(
                backgroundColor = SatsTheme.colors2.graphicalElements.skeleton named "skeleton",
                contentColor = null,
            )
        }

        Section("Nav Bar", SectionLevel.Level2, base = "graphicalElements.navBar") {
            val base = SatsTheme.colors2.graphicalElements.navBar

            ColorSample(
                backgroundColor = base.notSelected named "base.notSelected",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.selected named "base.selected",
                contentColor = null,
            )
        }

        Section("Progress Bar", SectionLevel.Level2, base = "graphicalElements.progressBar") {
            val base = SatsTheme.colors2.graphicalElements.progressBar

            ColorSample(
                backgroundColor = base.bg named "base.bg",
                contentColor = base.indicator named "base.indicator",
            )
        }

        Section("Graphs", SectionLevel.Level2, base = "graphicalElements.graphs") {
            val base = SatsTheme.colors2.graphicalElements.graphs

            ColorSample(
                backgroundColor = base.bar.primary.bg named "base.bar.primary.bg",
                contentColor = base.bar.primary.default named "base.bar.primary.default",
            )

            ColorSample(
                backgroundColor = base.bar.secondary.bg named "base.bar.secondary.bg",
                contentColor = base.bar.secondary.default named "base.bar.secondary.default",
            )

            ColorSample(
                backgroundColor = base.trend.upwards named "base.trend.upwards",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.trend.neutral named "base.trend.neutral",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.trend.downwards named "base.trend.downwards",
                contentColor = null,
            )
        }

        Section("Selector", SectionLevel.Level2, base = "graphicalElements.selector") {
            val base = SatsTheme.colors2.graphicalElements.selector

            ColorSample(
                backgroundColor = base.unselected.default named "base.unselected.default",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.unselected.disabled named "base.unselected.disabled",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.selected.default named "base.selected.default",
                contentColor = base.indicator named "base.indicator",
            )

            ColorSample(
                backgroundColor = base.selected.disabled named "base.selected.disabled",
                contentColor = base.indicator named "base.indicator",
            )
        }

        Section("Chips", SectionLevel.Level2, base = "graphicalElements.chips") {
            val base = SatsTheme.colors2.graphicalElements.chips

            ColorSample(
                backgroundColor = base.unselected.default.bg named "base.unselected.default.bg",
                contentColor = base.unselected.default.fg named "base.unselected.default.fg",
            )

            ColorSample(
                backgroundColor = base.unselected.disabled.bg named "base.unselected.disabled.bg",
                contentColor = base.unselected.disabled.fg named "base.unselected.disabled.fg",
            )

            ColorSample(
                backgroundColor = base.selected.default.bg named "base.selected.default.bg",
                contentColor = base.selected.default.fg named "base.selected.default.fg",
            )

            ColorSample(
                backgroundColor = base.selected.disabled.bg named "base.selected.disabled.bg",
                contentColor = base.selected.disabled.fg named "base.selected.disabled.fg",
            )
        }

        Section("Toggle", SectionLevel.Level2, base = "graphicalElements.toggle") {
            val base = SatsTheme.colors2.graphicalElements.toggle

            ColorSample(
                backgroundColor = base.unselected.default named "base.unselected.default",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.unselected.disabled named "base.unselected.disabled",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.handle named "base.handle",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.selected.default named "base.selected.default",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.selected.disabled named "base.selected.disabled",
                contentColor = null,
            )
        }

        Section("Icons", SectionLevel.Level2, base = "graphicalElements.icons") {
            val base = SatsTheme.colors2.graphicalElements.icons

            ColorSample(
                backgroundColor = base.primary named "base.primary",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.secondary named "base.secondary",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.fixed named "base.fixed",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.positive named "base.positive",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.attention named "base.attention",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.negative named "base.negative",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.waitingList named "base.waitingList",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.delete named "base.delete",
                contentColor = null,
            )
        }

        Section("Indicators", SectionLevel.Level2, base = "graphicalElements.indicators") {
            val base = SatsTheme.colors2.graphicalElements.indicators

            ColorSample(
                backgroundColor = base.positive.default named "base.positive.default",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.positive.alternate named "base.positive.alternate",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.attention.default named "base.attention.default",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.attention.alternate named "base.attention.alternate",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.negative.default named "base.negative.default",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.negative.alternate named "base.negative.alternate",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.neutral.default named "base.neutral.default",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.neutral.alternate named "base.neutral.alternate",
                contentColor = null,
            )
        }

        Section("Signal", SectionLevel.Level2, base = "graphicalElements.signal") {
            val base = SatsTheme.colors2.graphicalElements.signal

            ColorSample(
                backgroundColor = base.success named "base.success",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.warning named "base.warning",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.error named "base.error",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.neutral named "base.neutral",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.waitingList named "base.waitingList",
                contentColor = null,
            )
        }

        Section("Tags", SectionLevel.Level2, base = "graphicalElements.tags") {
            val base = SatsTheme.colors2.graphicalElements.tags

            ColorSample(
                backgroundColor = base.primary.bg named "base.primary.bg",
                contentColor = base.primary.fg named "base.primary.fg",
            )

            ColorSample(
                backgroundColor = base.secondary.bg named "base.secondary.bg",
                contentColor = base.secondary.fg named "base.secondary.fg",
            )

            ColorSample(
                backgroundColor = base.featured.bg named "base.featured.bg",
                contentColor = base.featured.fg named "base.featured.fg",
            )
        }

        Section("Rewards", SectionLevel.Level2, base = "graphicalElements.rewards") {
            val base = SatsTheme.colors2.graphicalElements.rewards

            ColorSample(
                backgroundColor = base.blue.bg named "base.blue.bg",
                contentColor = base.blue.fg named "base.blue.fg",
            )

            ColorSample(
                backgroundColor = base.silver.bg named "base.silver.bg",
                contentColor = base.silver.fg named "base.silver.fg",
            )

            ColorSample(
                backgroundColor = base.gold.bg named "base.gold.bg",
                contentColor = base.gold.fg named "base.gold.fg",
            )

            ColorSample(
                backgroundColor = base.platinum.bg named "base.platinum.bg",
                contentColor = base.platinum.fg named "base.platinum.fg",
            )
        }

        Section("Workouts", SectionLevel.Level2, base = "graphicalElements.workouts") {
            val base = SatsTheme.colors2.graphicalElements.workouts

            ColorSample(
                backgroundColor = base.pt.bg named "base.pt.bg",
                contentColor = base.pt.fg named "base.pt.fg",
            )

            ColorSample(
                backgroundColor = base.gx.bg named "base.gx.bg",
                contentColor = base.gx.fg named "base.gx.fg",
            )

            ColorSample(
                backgroundColor = base.treatments.bg named "base.treatments.bg",
                contentColor = base.treatments.fg named "base.treatments.fg",
            )

            ColorSample(
                backgroundColor = base.gymfloor.bg named "base.gymfloor.bg",
                contentColor = base.gymfloor.fg named "base.gymfloor.fg",
            )

            ColorSample(
                backgroundColor = base.other.bg named "base.other.bg",
                contentColor = base.other.fg named "base.other.fg",
            )
        }
    }
}

@Composable
private fun Backgrounds() {
    Section("Backgrounds", SectionLevel.Level1, base = "backgrounds") {
        val base = SatsTheme.colors2.backgrounds

        ColorSample(
            backgroundColor = base.primary.bg.default named "base.primary.bg.default",
            contentColor = base.primary.fg.default named "base.primary.fg.default",
        )

        ColorSample(
            backgroundColor = base.primary.bg.default named "base.primary.bg.default",
            contentColor = base.primary.fg.alternate named "base.primary.fg.alternate",
        )

        ColorSample(
            backgroundColor = base.primary.bg.default named "base.primary.bg.default",
            contentColor = base.primary.fg.disabled named "base.primary.fg.disabled",
        )

        ColorSample(
            backgroundColor = base.primary.bg.selected named "base.primary.bg.selected",
            contentColor = base.primary.fg.default named "base.primary.fg.default",
        )

        ColorSample(
            backgroundColor = base.secondary.bg.default named "base.secondary.bg.default",
            contentColor = base.secondary.fg.default named "base.secondary.fg.default",
        )

        ColorSample(
            backgroundColor = base.secondary.bg.default named "base.secondary.bg.default",
            contentColor = base.secondary.fg.alternate named "base.secondary.fg.alternate",
        )

        ColorSample(
            backgroundColor = base.secondary.bg.default named "base.secondary.bg.default",
            contentColor = base.secondary.fg.disabled named "base.secondary.fg.disabled",
        )

        ColorSample(
            backgroundColor = base.secondary.bg.selected named "base.secondary.bg.selected",
            contentColor = base.secondary.fg.default named "base.secondary.fg.default",
        )
    }
}

@Composable
private fun FixedBackgrounds() {
    Section("Fixed Backgrounds", SectionLevel.Level1, base = "backgrounds.fixed") {
        val base = SatsTheme.colors2.backgrounds.fixed

        ColorSample(
            backgroundColor = base.primary.bg.default named "base.primary.bg.default",
            contentColor = base.primary.fg.default named "base.primary.fg.default",
        )

        ColorSample(
            backgroundColor = base.primary.bg.default named "base.primary.bg.default",
            contentColor = base.primary.fg.alternate named "base.primary.fg.alternate",
        )

        ColorSample(
            backgroundColor = base.secondary.bg.default named "base.secondary.bg.default",
            contentColor = base.secondary.fg.default named "base.secondary.fg.default",
        )

        ColorSample(
            backgroundColor = base.secondary.bg.default named "base.secondary.bg.default",
            contentColor = base.secondary.fg.alternate named "base.secondary.fg.alternate",
        )
    }
}

@Composable
private fun Surfaces() {
    Section("Surfaces", SectionLevel.Level1, base = "surfaces") {
        val base = SatsTheme.colors2.surfaces

        ColorSample(
            backgroundColor = base.primary.bg.default named "base.primary.bg.default",
            contentColor = base.primary.fg.default named "base.primary.fg.default",
        )

        ColorSample(
            backgroundColor = base.primary.bg.default named "base.primary.bg.default",
            contentColor = base.primary.fg.alternate named "base.primary.fg.alternate",
        )

        ColorSample(
            backgroundColor = base.primary.bg.default named "base.primary.bg.default",
            contentColor = base.primary.fg.disabled named "base.primary.fg.disabled",
        )

        ColorSample(
            backgroundColor = base.primary.bg.default named "base.primary.bg.default",
            contentColor = base.primary.fg.disabled named "base.primary.fg.disabled",
        )

        ColorSample(
            backgroundColor = base.primary.bg.default named "base.primary.bg.default",
            contentColor = base.primary.fg.success named "base.primary.fg.success",
        )

        ColorSample(
            backgroundColor = base.primary.bg.default named "base.primary.bg.default",
            contentColor = base.primary.fg.warning named "base.primary.fg.warning",
        )

        ColorSample(
            backgroundColor = base.primary.bg.default named "base.primary.bg.default",
            contentColor = base.primary.fg.error named "base.primary.fg.error",
        )

        ColorSample(
            backgroundColor = base.primary.bg.default named "base.primary.bg.default",
            contentColor = base.primary.fg.waitlist named "base.primary.fg.waitlist",
        )

        ColorSample(
            backgroundColor = base.primary.bg.default named "base.primary.bg.default",
            contentColor = base.primary.fg.neutral named "base.primary.fg.neutral",
        )

        ColorSample(
            backgroundColor = base.primary.bg.default named "base.primary.bg.default",
            contentColor = base.primary.fg.information named "base.primary.fg.information",
        )

        ColorSample(
            backgroundColor = base.primary.bg.default named "base.primary.bg.default",
            contentColor = base.primary.fg.featured named "base.primary.fg.featured",
        )

        ColorSample(
            backgroundColor = base.primary.bg.selected named "base.primary.bg.selected",
            contentColor = base.primary.fg.default named "base.primary.fg.default",
        )

        ColorSample(
            backgroundColor = base.secondary.bg.default named "base.secondary.bg.default",
            contentColor = base.secondary.fg.default named "base.secondary.fg.default",
        )

        ColorSample(
            backgroundColor = base.secondary.bg.default named "base.secondary.bg.default",
            contentColor = base.secondary.fg.alternate named "base.secondary.fg.alternate",
        )

        ColorSample(
            backgroundColor = base.secondary.bg.default named "base.secondary.bg.default",
            contentColor = base.secondary.fg.disabled named "base.secondary.fg.disabled",
        )

        ColorSample(
            backgroundColor = base.secondary.bg.default named "base.secondary.bg.default",
            contentColor = base.secondary.fg.disabled named "base.secondary.fg.disabled",
        )

        ColorSample(
            backgroundColor = base.secondary.bg.default named "base.secondary.bg.default",
            contentColor = base.secondary.fg.success named "base.secondary.fg.success",
        )

        ColorSample(
            backgroundColor = base.secondary.bg.default named "base.secondary.bg.default",
            contentColor = base.secondary.fg.warning named "base.secondary.fg.warning",
        )

        ColorSample(
            backgroundColor = base.secondary.bg.default named "base.secondary.bg.default",
            contentColor = base.secondary.fg.error named "base.secondary.fg.error",
        )

        ColorSample(
            backgroundColor = base.secondary.bg.default named "base.secondary.bg.default",
            contentColor = base.secondary.fg.waitlist named "base.secondary.fg.waitlist",
        )

        ColorSample(
            backgroundColor = base.secondary.bg.default named "base.secondary.bg.default",
            contentColor = base.secondary.fg.neutral named "base.secondary.fg.neutral",
        )

        ColorSample(
            backgroundColor = base.secondary.bg.default named "base.secondary.bg.default",
            contentColor = base.secondary.fg.information named "base.secondary.fg.information",
        )

        ColorSample(
            backgroundColor = base.secondary.bg.default named "base.secondary.bg.default",
            contentColor = base.secondary.fg.featured named "base.secondary.fg.featured",
        )

        ColorSample(
            backgroundColor = base.secondary.bg.selected named "base.secondary.bg.selected",
            contentColor = base.secondary.fg.default named "base.secondary.fg.default",
        )
    }
}

@Composable
private fun FixedSurfaces() {
    Section("Fixed Surfaces", SectionLevel.Level1, base = "surfaces.fixed") {
        val base = SatsTheme.colors2.surfaces.fixed

        ColorSample(
            backgroundColor = base.primary.bg.default named "base.primary.bg.default",
            contentColor = base.primary.fg.default named "base.primary.fg.default",
        )

        ColorSample(
            backgroundColor = base.primary.bg.default named "base.primary.bg.default",
            contentColor = base.primary.fg.alternate named "base.primary.fg.alternate",
        )

        ColorSample(
            backgroundColor = base.secondary.bg.default named "base.secondary.bg.default",
            contentColor = base.secondary.fg.default named "base.secondary.fg.default",
        )

        ColorSample(
            backgroundColor = base.secondary.bg.default named "base.secondary.bg.default",
            contentColor = base.secondary.fg.alternate named "base.secondary.fg.alternate",
        )
    }
}

@Composable
private fun SignalSurfaces() {
    Section("Signal Surface", SectionLevel.Level1, base = "signalSurfaces") {
        val base = SatsTheme.colors2.signalSurfaces

        ColorSample(
            backgroundColor = base.success.bg named "base.success.bg",
            contentColor = base.success.fg.default named "base.success.fg.default",
        )

        ColorSample(
            backgroundColor = base.warning.bg named "base.warning.bg",
            contentColor = base.warning.fg.default named "base.warning.fg.default",
        )

        ColorSample(
            backgroundColor = base.warning.bg named "base.warning.bg",
            contentColor = base.warning.fg.alternate named "base.warning.fg.alternate",
        )

        ColorSample(
            backgroundColor = base.error.bg named "base.error.bg",
            contentColor = base.error.fg.default named "base.error.fg.default",
        )

        ColorSample(
            backgroundColor = base.error.bg named "base.error.bg",
            contentColor = base.error.fg.alternate named "base.error.fg.alternate",
        )

        ColorSample(
            backgroundColor = base.waitingList.bg named "base.waitingList.bg",
            contentColor = base.waitingList.fg.default named "base.waitingList.fg.default",
        )

        ColorSample(
            backgroundColor = base.waitingList.bg named "base.waitingList.bg",
            contentColor = base.waitingList.fg.alternate named "base.waitingList.fg.alternate",
        )

        ColorSample(
            backgroundColor = base.neutral.bg named "base.neutral.bg",
            contentColor = base.neutral.fg.default named "base.neutral.fg.default",
        )

        ColorSample(
            backgroundColor = base.neutral.bg named "base.neutral.bg",
            contentColor = base.neutral.fg.alternate named "base.neutral.fg.alternate",
        )

        ColorSample(
            backgroundColor = base.information.bg named "base.information.bg",
            contentColor = base.information.fg.default named "base.information.fg.default",
        )

        ColorSample(
            backgroundColor = base.information.bg named "base.information.bg",
            contentColor = base.information.fg.alternate named "base.information.fg.alternate",
        )
    }
}

@Composable
private fun Section(
    title: String,
    level: SectionLevel,
    modifier: Modifier = Modifier,
    base: String? = null,
    content: @Composable ColumnScope.() -> Unit,
) {
    val headingStyle = when (level) {
        SectionLevel.Level1 -> SatsTheme.typography.emphasis.headline1
        SectionLevel.Level2 -> SatsTheme.typography.medium.headline2
    }

    Column(modifier, verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m)) {
        Text(title, style = headingStyle)

        if (base != null) {
            Text("base = $base", style = SatsTheme.typography.emphasis.basic)
        }

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
                backgroundColor = Color.Green named "Color.Green",
                contentColor = Color.Red named "Color.Red",
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
