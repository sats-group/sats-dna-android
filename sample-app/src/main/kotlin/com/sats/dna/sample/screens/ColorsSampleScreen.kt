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
import com.sats.dna.colors.ColorSet
import com.sats.dna.components.SatsSurface
import com.sats.dna.theme.SatsTheme

data object ColorsSampleScreen : SampleScreen(
    name = "Colors",
    route = "/colors",
    screen = { ColorsScreen(it::navigateUp) },
)

@Composable
private fun ColorsScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen("Colors", navigateUp, modifier) { innerPadding ->
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
            val base = SatsTheme.colors.buttons.primary

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
            val base = SatsTheme.colors.buttons.secondary

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
            val base = SatsTheme.colors.buttons.clean

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
            val base = SatsTheme.colors.buttons.cleanSecondary

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
            val base = SatsTheme.colors.buttons.action

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
            val base = SatsTheme.colors.buttons.waitingListFilled

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
            val base = SatsTheme.colors.buttons.waitingListOutlined

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
            val base = SatsTheme.colors.buttons.destructive.default

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
            val base = SatsTheme.colors.buttons.destructive.outlined

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
            val base = SatsTheme.colors.graphicalElements.divider

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
            val base = SatsTheme.colors.graphicalElements.border

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
                backgroundColor = SatsTheme.colors.graphicalElements.skeleton named "skeleton",
                contentColor = null,
            )
        }

        Section("Nav Bar", SectionLevel.Level2, base = "graphicalElements.navBar") {
            val base = SatsTheme.colors.graphicalElements.navBar

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
            val base = SatsTheme.colors.graphicalElements.progressBar

            ColorSample(
                backgroundColor = base.default.bg named "base.default.bg",
                contentColor = base.default.fg named "base.default.fg",
            )

            ColorSample(
                backgroundColor = base.alternate.bg named "base.alternate.bg",
                contentColor = base.alternate.fg named "base.alternate.fg",
            )
        }

        Section("Fixed Progress Bar", SectionLevel.Level2, base = "graphicalElements.fixedProgressBar") {
            val base = SatsTheme.colors.graphicalElements.fixedProgressBar

            ColorSample(
                backgroundColor = base.default.bg named "base.default.bg",
                contentColor = base.default.fg named "base.default.fg",
            )

            ColorSample(
                backgroundColor = base.default.bg named "base.default.bg",
                contentColor = base.alternate.fg named "base.alternate.fg",
            )
        }

        Section("Graphs", SectionLevel.Level2, base = "graphicalElements.graphs") {
            val base = SatsTheme.colors.graphicalElements.graphs

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
            val base = SatsTheme.colors.graphicalElements.selector

            ColorSample(
                base.primary.unselected.default,
                "base.primary.unselected.default",
            )

            ColorSample(
                base.primary.unselected.disabled,
                "base.primary.unselected.disabled",
            )

            ColorSample(
                base.primary.selected.default,
                "base.primary.selected.default",
            )

            ColorSample(
                base.primary.selected.disabled,
                "base.primary.selected.disabled",
            )

            ColorSample(
                base.primary.unselectedSurface.default named "base.primary.unselectedSurface.default",
                contentColor = null,
            )

            ColorSample(
                base.primary.unselectedSurface.disabled named "base.primary.unselectedSurface.disabled",
                contentColor = null,
            )

            ColorSample(
                base.primary.selectedSurface.default named "base.primary.selectedSurface.default",
                contentColor = null,
            )

            ColorSample(
                base.primary.selectedSurface.disabled named "base.primary.selectedSurface.disabled",
                contentColor = null,
            )

            ColorSample(
                base.secondary.unselected.default,
                "base.secondary.unselected.default",
            )

            ColorSample(
                base.secondary.unselected.disabled,
                "base.secondary.unselected.disabled",
            )
            ColorSample(
                base.secondary.selected.default,
                "base.secondary.selected.default",
            )

            ColorSample(
                base.secondary.selected.disabled,
                "base.secondary.selected.disabled",
            )

            ColorSample(
                base.secondary.unselectedSurface.default named "base.secondary.unselectedSurface.default",
                contentColor = null,
            )

            ColorSample(
                base.secondary.unselectedSurface.disabled named "base.secondary.unselectedSurface.disabled",
                contentColor = null,
            )

            ColorSample(
                base.secondary.selectedSurface.default named "base.secondary.selectedSurface.default",
                contentColor = null,
            )

            ColorSample(
                base.secondary.selectedSurface.disabled named "base.secondary.selectedSurface.disabled",
                contentColor = null,
            )
        }

        Section("Fixed Selector", SectionLevel.Level2, base = "graphicalElements.selectorFixed") {
            val base = SatsTheme.colors.graphicalElements.selectorFixed

            ColorSample(
                base.unselected.default,
                "base.unselected.default",
            )

            ColorSample(
                base.unselected.disabled,
                "base.unselected.disabled",
            )

            ColorSample(
                base.selected.default,
                "base.selected.default",
            )

            ColorSample(
                base.selected.disabled,
                "base.selected.disabled",
            )

            ColorSample(
                backgroundColor = base.selectedBackground.default named "base.selectedBackground.default",
                contentColor = null,
            )

            ColorSample(
                backgroundColor = base.selectedBackground.disabled named "base.selectedBackground.disabled",
                contentColor = null,
            )
        }

        Section("Chips", SectionLevel.Level2, base = "graphicalElements.chips") {
            val base = SatsTheme.colors.graphicalElements.chips

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
            val base = SatsTheme.colors.graphicalElements.toggle

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
            val base = SatsTheme.colors.graphicalElements.icons

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
            val base = SatsTheme.colors.graphicalElements.indicators

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
            val base = SatsTheme.colors.graphicalElements.signal

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
            val base = SatsTheme.colors.graphicalElements.tags

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

        Section("Indicator Tag", SectionLevel.Level2, base = "graphicalElements.indicatorTag") {
            val base = SatsTheme.colors.graphicalElements.indicatorTag

            ColorSample(base.positive.default, "base.positive.default")

            ColorSample(base.positive.alternate, "base.positive.alternate")

            ColorSample(base.attention.default, "base.attention.default")

            ColorSample(base.attention.alternate, "base.attention.alternate")

            ColorSample(base.negative.default, "base.negative.default")

            ColorSample(base.negative.alternate, "base.negative.alternate")

            ColorSample(base.featured.default, "base.featured.default")

            ColorSample(base.featured.alternate, "base.featured.alternate")

            ColorSample(base.neutral.default, "base.neutral.default")

            ColorSample(base.neutral.alternate, "base.neutral.alternate")

            ColorSample(base.information.default, "base.information.default")

            ColorSample(base.information.alternate, "base.information.alternate")
        }

        Section("Badge", SectionLevel.Level2, base = "graphicalElements.badge") {
            val base = SatsTheme.colors.graphicalElements.badge

            ColorSample(
                backgroundColor = base.primary.bg named "base.primary.bg",
                contentColor = base.primary.fg named "base.primary.fg",
            )

            ColorSample(
                backgroundColor = base.secondary.bg named "base.secondary.bg",
                contentColor = base.secondary.fg named "base.secondary.fg",
            )

            ColorSample(
                backgroundColor = base.tertiary.bg named "base.tertiary.bg",
                contentColor = base.tertiary.fg named "base.tertiary.fg",
            )
        }

        Section("Fixed Badge", SectionLevel.Level2, base = "graphicalElements.fixedBadge") {
            val base = SatsTheme.colors.graphicalElements.fixedBadge

            ColorSample(
                backgroundColor = base.primary.bg named "base.primary.bg",
                contentColor = base.primary.fg named "base.primary.fg",
            )

            ColorSample(
                backgroundColor = base.secondary.bg named "base.secondary.bg",
                contentColor = base.secondary.fg named "base.secondary.fg",
            )

            ColorSample(
                backgroundColor = base.tertiary.bg named "base.tertiary.bg",
                contentColor = base.tertiary.fg named "base.tertiary.fg",
            )
        }

        Section("Rewards", SectionLevel.Level2, base = "graphicalElements.rewards") {
            val base = SatsTheme.colors.graphicalElements.rewards

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
            val base = SatsTheme.colors.graphicalElements.workouts

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
        val base = SatsTheme.colors.backgrounds

        ColorSample(
            backgroundColor = base.primary.default.bg named "base.primary.default.bg",
            contentColor = base.primary.default.fg named "base.primary.default.fg",
        )

        ColorSample(
            backgroundColor = base.primary.default.bg named "base.primary.default.bg",
            contentColor = base.primary.default.fgAlternate named "base.primary.default.fgAlternate",
        )

        ColorSample(
            backgroundColor = base.primary.default.bg named "base.primary.default.bg",
            contentColor = base.primary.default.fgDisabled named "base.primary.default.fgDisabled",
        )

        ColorSample(
            backgroundColor = base.primary.selected.bg named "base.primary.selected.bg",
            contentColor = base.primary.default.fg named "base.primary.default.fg",
        )

        ColorSample(
            backgroundColor = base.secondary.default.bg named "base.secondary.default.bg",
            contentColor = base.secondary.default.fg named "base.secondary.default.fg",
        )

        ColorSample(
            backgroundColor = base.secondary.default.bg named "base.secondary.default.bg",
            contentColor = base.secondary.default.fgAlternate named "base.secondary.default.fgAlternate",
        )

        ColorSample(
            backgroundColor = base.secondary.default.bg named "base.secondary.default.bg",
            contentColor = base.secondary.default.fgDisabled named "base.secondary.default.fgDisabled",
        )

        ColorSample(
            backgroundColor = base.secondary.selected.bg named "base.secondary.selected.bg",
            contentColor = base.secondary.default.fg named "base.secondary.default.fg",
        )
    }
}

@Composable
private fun FixedBackgrounds() {
    Section("Fixed Backgrounds", SectionLevel.Level1, base = "backgrounds.fixed") {
        val base = SatsTheme.colors.backgrounds.fixed

        ColorSample(
            backgroundColor = base.primary.default.bg named "base.primary.default.bg",
            contentColor = base.primary.default.fg named "base.primary.default.fg",
        )

        ColorSample(
            backgroundColor = base.primary.default.bg named "base.primary.default.bg",
            contentColor = base.primary.default.fgAlternate named "base.primary.default.fgAlternate",
        )

        ColorSample(
            backgroundColor = base.secondary.default.bg named "base.secondary.default.bg",
            contentColor = base.secondary.default.fg named "base.secondary.default.fg",
        )

        ColorSample(
            backgroundColor = base.secondary.default.bg named "base.secondary.default.bg",
            contentColor = base.secondary.default.fgAlternate named "base.secondary.default.fgAlternate",
        )
    }
}

@Composable
private fun Surfaces() {
    Section("Surfaces", SectionLevel.Level1, base = "surfaces") {
        val base = SatsTheme.colors.surfaces

        ColorSample(
            backgroundColor = base.primary.default.bg named "base.primary.default.bg",
            contentColor = base.primary.default.fg named "base.primary.default.fg",
        )

        ColorSample(
            backgroundColor = base.primary.default.bg named "base.primary.default.bg",
            contentColor = base.primary.default.fgAlternate named "base.primary.default.fgAlternate",
        )

        ColorSample(
            backgroundColor = base.primary.default.bg named "base.primary.default.bg",
            contentColor = base.primary.default.fgDisabled named "base.primary.default.fgDisabled",
        )

        ColorSample(
            backgroundColor = base.primary.default.bg named "base.primary.default.bg",
            contentColor = base.primary.default.fgDisabled named "base.primary.default.fgDisabled",
        )

        ColorSample(
            backgroundColor = base.primary.default.bg named "base.primary.default.bg",
            contentColor = base.primary.default.fgSuccess named "base.primary.default.fgSuccess",
        )

        ColorSample(
            backgroundColor = base.primary.default.bg named "base.primary.default.bg",
            contentColor = base.primary.default.fgWarning named "base.primary.default.fgWarning",
        )

        ColorSample(
            backgroundColor = base.primary.default.bg named "base.primary.default.bg",
            contentColor = base.primary.default.fgError named "base.primary.default.fgError",
        )

        ColorSample(
            backgroundColor = base.primary.default.bg named "base.primary.default.bg",
            contentColor = base.primary.default.fgWaitingList named "base.primary.default.fgWaitingList",
        )

        ColorSample(
            backgroundColor = base.primary.default.bg named "base.primary.default.bg",
            contentColor = base.primary.default.fgNeutral named "base.primary.default.fgNeutral",
        )

        ColorSample(
            backgroundColor = base.primary.default.bg named "base.primary.default.bg",
            contentColor = base.primary.default.fgInformation named "base.primary.default.fgInformation",
        )

        ColorSample(
            backgroundColor = base.primary.default.bg named "base.primary.default.bg",
            contentColor = base.primary.default.fgFeatured named "base.primary.default.fgFeatured",
        )

        ColorSample(
            backgroundColor = base.primary.selected.bg named "base.primary.selected.bg",
            contentColor = base.primary.default.fg named "base.primary.default.fg",
        )

        ColorSample(
            backgroundColor = base.secondary.default.bg named "base.secondary.default.bg",
            contentColor = base.secondary.default.fg named "base.secondary.default.fg",
        )

        ColorSample(
            backgroundColor = base.secondary.default.bg named "base.secondary.default.bg",
            contentColor = base.secondary.default.fgAlternate named "base.secondary.default.fgAlternate",
        )

        ColorSample(
            backgroundColor = base.secondary.default.bg named "base.secondary.default.bg",
            contentColor = base.secondary.default.fgDisabled named "base.secondary.default.fgDisabled",
        )

        ColorSample(
            backgroundColor = base.secondary.default.bg named "base.secondary.default.bg",
            contentColor = base.secondary.default.fgDisabled named "base.secondary.default.fgDisabled",
        )

        ColorSample(
            backgroundColor = base.secondary.default.bg named "base.secondary.default.bg",
            contentColor = base.secondary.default.fgSuccess named "base.secondary.default.fgSuccess",
        )

        ColorSample(
            backgroundColor = base.secondary.default.bg named "base.secondary.default.bg",
            contentColor = base.secondary.default.fgWarning named "base.secondary.default.fgWarning",
        )

        ColorSample(
            backgroundColor = base.secondary.default.bg named "base.secondary.default.bg",
            contentColor = base.secondary.default.fgError named "base.secondary.default.fgError",
        )

        ColorSample(
            backgroundColor = base.secondary.default.bg named "base.secondary.default.bg",
            contentColor = base.secondary.default.fgWaitingList named "base.secondary.default.fgWaitingList",
        )

        ColorSample(
            backgroundColor = base.secondary.default.bg named "base.secondary.default.bg",
            contentColor = base.secondary.default.fgNeutral named "base.secondary.default.fgNeutral",
        )

        ColorSample(
            backgroundColor = base.secondary.default.bg named "base.secondary.default.bg",
            contentColor = base.secondary.default.fgInformation named "base.secondary.default.fgInformation",
        )

        ColorSample(
            backgroundColor = base.secondary.default.bg named "base.secondary.default.bg",
            contentColor = base.secondary.default.fgFeatured named "base.secondary.default.fgFeatured",
        )

        ColorSample(
            backgroundColor = base.secondary.selected.bg named "base.secondary.selected.bg",
            contentColor = base.secondary.default.fg named "base.secondary.default.fg",
        )
    }
}

@Composable
private fun FixedSurfaces() {
    Section("Fixed Surfaces", SectionLevel.Level1, base = "surfaces.fixed") {
        val base = SatsTheme.colors.surfaces.fixed

        ColorSample(
            backgroundColor = base.primary.default.bg named "base.primary.default.bg",
            contentColor = base.primary.default.fg named "base.primary.default.fg",
        )

        ColorSample(
            backgroundColor = base.primary.default.bg named "base.primary.default.bg",
            contentColor = base.primary.default.fgAlternate named "base.primary.default.fgAlternate",
        )

        ColorSample(
            backgroundColor = base.secondary.default.bg named "base.secondary.default.bg",
            contentColor = base.secondary.default.fg named "base.secondary.default.fg",
        )

        ColorSample(
            backgroundColor = base.secondary.default.bg named "base.secondary.default.bg",
            contentColor = base.secondary.default.fgAlternate named "base.secondary.default.fgAlternate",
        )
    }
}

@Composable
private fun SignalSurfaces() {
    Section("Signal Surface", SectionLevel.Level1, base = "signalSurfaces") {
        val base = SatsTheme.colors.signalSurfaces

        ColorSample(
            backgroundColor = base.success.default.bg named "base.success.default.bg",
            contentColor = base.success.default.fg named "base.success.default.fg",
        )

        ColorSample(
            backgroundColor = base.warning.default.bg named "base.warning.default.bg",
            contentColor = base.warning.default.fg named "base.warning.default.fg",
        )

        ColorSample(
            backgroundColor = base.warning.default.bg named "base.warning.default.bg",
            contentColor = base.warning.alternate.fg named "base.warning.alternate.fg",
        )

        ColorSample(
            backgroundColor = base.error.default.bg named "base.error.default.bg",
            contentColor = base.error.default.fg named "base.error.default.fg",
        )

        ColorSample(
            backgroundColor = base.error.default.bg named "base.error.default.bg",
            contentColor = base.error.alternate.fg named "base.error.alternate.fg",
        )

        ColorSample(
            backgroundColor = base.waitingList.default.bg named "base.waitingList.default.bg",
            contentColor = base.waitingList.default.fg named "base.waitingList.default.fg",
        )

        ColorSample(
            backgroundColor = base.waitingList.default.bg named "base.waitingList.default.bg",
            contentColor = base.waitingList.alternate.fg named "base.waitingList.alternate.fg",
        )

        ColorSample(
            backgroundColor = base.neutral.default.bg named "base.neutral.default.bg",
            contentColor = base.neutral.default.fg named "base.neutral.default.fg",
        )

        ColorSample(
            backgroundColor = base.neutral.default.bg named "base.neutral.default.bg",
            contentColor = base.neutral.alternate.fg named "base.neutral.alternate.fg",
        )

        ColorSample(
            backgroundColor = base.information.default.bg named "base.information.default.bg",
            contentColor = base.information.default.fg named "base.information.default.fg",
        )

        ColorSample(
            backgroundColor = base.information.default.bg named "base.information.default.bg",
            contentColor = base.information.alternate.fg named "base.information.alternate.fg",
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
    colorSet: ColorSet,
    baseName: String,
    modifier: Modifier = Modifier,
) {
    ColorSample(
        backgroundColor = colorSet.bg named "$baseName.bg",
        contentColor = colorSet.fg named "$baseName.fg",
        modifier = modifier,
    )
}

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
            color = SatsTheme.colors.surfaces.primary.default.fgAlternate,
        )
    }
}

private class NamedColor(val name: String, val color: Color) {
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
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg, useMaterial3 = true) {
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
private fun ColorsScreenPreview() {
    SatsTheme {
        ColorsScreen(navigateUp = {})
    }
}
