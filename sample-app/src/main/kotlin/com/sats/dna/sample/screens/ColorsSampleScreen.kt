package com.sats.dna.sample.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.SatsIcons
import com.sats.dna.colors.BackgroundColorSet
import com.sats.dna.colors.ColorSet
import com.sats.dna.colors.OutlinedColorSet
import com.sats.dna.colors.SurfaceColorSet
import com.sats.dna.components.SatsSurface
import com.sats.dna.components.button.SatsButtonColor
import com.sats.dna.components.button.SatsButtonSize
import com.sats.dna.components.button.SatsIconButton
import com.sats.dna.icons.ArrowDown
import com.sats.dna.icons.ArrowUp
import com.sats.dna.theme.SatsTheme

data object ColorsSampleScreen : SampleScreen(
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
            Section("Buttons") {
                ButtonsPrimarySamples()
                ButtonsSecondarySamples()
                ButtonsCleanSamples()
                ButtonsCleanSecondarySamples()
                ButtonsActionSamples()
                ButtonsFixedActionSamples()
                ButtonsCtaSamples()
                ButtonsWaitingListFilledSamples()
                ButtonsWaitingListOutlinedSamples()
                ButtonsDestructiveSamples()
            }

            Section("Graphical Elements") {
                GraphicalElementsDividerSamples()
                GraphicalElementsBorderSamples()
                GraphicalElementsSignalBorderSamples()
                GraphicalElementsSkeletonSamples()
                GraphicalElementsNavBarSamples()
                GraphicalElementsProgressBarSamples()
                GraphicalElementsFixedProgressBarSamples()
                GraphicalElementsGraphsSamples()
                GraphicalElementsSelectorSamples()
                GraphicalElementsSelectorFixedSamples()
                GraphicalElementsChipsSamples()
                GraphicalElementsToggleSamples()
                GraphicalElementsIconsSamples()
                GraphicalElementsIndicatorsSamples()
                GraphicalElementsSignalSamples()
                GraphicalElementsTagsSamples()
                GraphicalElementsIndicatorTagSamples()
                GraphicalElementsBadgeSamples()
                GraphicalElementsFixedBadgeSamples()
                GraphicalElementsRewardsSamples()
                GraphicalElementsWorkoutsSamples()
            }

            Section("Backgrounds") {
                BackgroundPrimarySamples()
                BackgroundSecondarySamples()
                BackgroundFixedSamples()
            }

            Section("Surfaces") {
                SurfacePrimarySamples()
                SurfaceSecondarySamples()
                SurfaceFixedSamples()
            }

            Section("Signal Surfaces") {
                SignalSurfaceSuccessSamples()
                SignalSurfaceWarningSamples()
                SignalSurfaceErrorSamples()
                SignalSurfaceWaitingListSamples()
                SignalSurfaceNeutralSamples()
                SignalSurfaceInformationSamples()
                SignalSurfaceFeaturedSamples()
            }
        }
    }
}

@Composable
private fun ButtonsPrimarySamples(modifier: Modifier = Modifier) {
    Subsection("Primary", modifier) {
        val primary = SatsTheme.colors.buttons.primary

        ColorSample(primary.default, "default")
        ColorSample(primary.disabled, "disabled")
    }
}

@Composable
private fun ButtonsSecondarySamples(modifier: Modifier = Modifier) {
    Subsection("Secondary", modifier) {
        val secondary = SatsTheme.colors.buttons.secondary

        ColorSample(secondary.default, "default")
        ColorSample(secondary.disabled, "disabled")
    }
}

@Composable
private fun ButtonsCleanSamples(modifier: Modifier = Modifier) {
    Subsection("Clean", modifier, isFixed = true) {
        val clean = SatsTheme.colors.buttons.clean

        ColorSample(clean.default, "default")
        ColorSample(clean.disabled, "disabled")
    }
}

@Composable
private fun ButtonsCleanSecondarySamples(modifier: Modifier = Modifier) {
    Subsection("Clean Secondary", modifier, isFixed = true) {
        val cleanSecondary = SatsTheme.colors.buttons.cleanSecondary

        ColorSample(cleanSecondary.default, "default")
        ColorSample(cleanSecondary.disabled, "disabled")
    }
}

@Composable
private fun ButtonsActionSamples(modifier: Modifier = Modifier) {
    Subsection("Action", modifier) {
        val action = SatsTheme.colors.buttons.action

        ColorSample(action.default, "default")
        ColorSample(action.disabled, "disabled")
    }
}

@Composable
private fun ButtonsFixedActionSamples(modifier: Modifier = Modifier) {
    Subsection("Action", modifier) {
        val action = SatsTheme.colors.buttons.fixedAction

        ColorSample(action.default, "default")
        ColorSample(action.disabled, "disabled")
    }
}

@Composable
private fun ButtonsCtaSamples(modifier: Modifier = Modifier) {
    Subsection("CTA", modifier) {
        val cta = SatsTheme.colors.buttons.cta

        ColorSample(cta.default, "default")
        ColorSample(cta.disabled, "disabled")
    }
}

@Composable
private fun ButtonsWaitingListFilledSamples(modifier: Modifier = Modifier) {
    Subsection("Waiting List Filled", modifier) {
        val waitingListFilled = SatsTheme.colors.buttons.waitingListFilled

        ColorSample(waitingListFilled.default, "default")
        ColorSample(waitingListFilled.disabled, "disabled")
    }
}

@Composable
private fun ButtonsWaitingListOutlinedSamples(modifier: Modifier = Modifier) {
    Subsection("Waiting List Outlined", modifier) {
        val waitingListOutlined = SatsTheme.colors.buttons.waitingListOutlined

        ColorSample(waitingListOutlined.default, "default")
        ColorSample(waitingListOutlined.disabled, "disabled")
    }
}

@Composable
private fun ButtonsDestructiveSamples(modifier: Modifier = Modifier) {
    Subsection("Destructive", modifier) {
        val destructive = SatsTheme.colors.buttons.destructive

        ColorSample(destructive.default.default, "default.default")
        ColorSample(destructive.default.disabled, "default.disabled")
        ColorSample(destructive.outlined.default, "outlined.default")
        ColorSample(destructive.outlined.disabled, "outlined.disabled")
    }
}

@Composable
private fun GraphicalElementsDividerSamples(modifier: Modifier = Modifier) {
    Subsection("Divider", modifier) {
        val divider = SatsTheme.colors.graphicalElements.divider

        ColorSample(divider.default, "default")
        ColorSample(divider.alternate, "alternate")
    }
}

@Composable
private fun GraphicalElementsBorderSamples(modifier: Modifier = Modifier) {
    Subsection("Border", modifier) {
        val border = SatsTheme.colors.graphicalElements.border

        ColorSample(border.default, "default")
        ColorSample(border.focused, "focused")
    }
}

@Composable
private fun GraphicalElementsSignalBorderSamples(modifier: Modifier = Modifier) {
    Subsection("Signal Border", modifier) {
        val signalBorder = SatsTheme.colors.graphicalElements.signalBorder

        ColorSample(signalBorder.success, "success")
        ColorSample(signalBorder.warning, "warning")
        ColorSample(signalBorder.error, "error")
        ColorSample(signalBorder.waitingList, "waitingList")
        ColorSample(signalBorder.neutral, "neutral")
        ColorSample(signalBorder.information, "information")
        ColorSample(signalBorder.featured, "featured")
    }
}

@Composable
private fun GraphicalElementsSkeletonSamples(modifier: Modifier = Modifier) {
    Subsection("Skeleton", modifier) {
        val skeleton = SatsTheme.colors.graphicalElements.skeleton

        ColorSample(skeleton, "skeleton")
    }
}

@Composable
private fun GraphicalElementsNavBarSamples(modifier: Modifier = Modifier) {
    Subsection("Nav Bar", modifier) {
        val navBar = SatsTheme.colors.graphicalElements.navBar

        ColorSample(navBar.selected, "selected")
        ColorSample(navBar.notSelected, "notSelected")
    }
}

@Composable
private fun GraphicalElementsProgressBarSamples(modifier: Modifier = Modifier) {
    Subsection("Progress Bar", modifier) {
        val progressBar = SatsTheme.colors.graphicalElements.progressBar

        ColorSample(progressBar.default, "default")
        ColorSample(progressBar.alternate, "alternate")
    }
}

@Composable
private fun GraphicalElementsFixedProgressBarSamples(modifier: Modifier = Modifier) {
    Subsection("Fixed Progress Bar", modifier, isFixed = true) {
        val fixedProgressBar = SatsTheme.colors.graphicalElements.fixedProgressBar

        ColorSample(fixedProgressBar.default, "default")
        ColorSample(fixedProgressBar.alternate, "alternate")
    }
}

@Composable
private fun GraphicalElementsGraphsSamples(modifier: Modifier = Modifier) {
    Subsection("Graphs", modifier) {
        val graphs = SatsTheme.colors.graphicalElements.graphs

        ColorSample(graphs.bar.primary.default, "bar.primary.default")
        ColorSample(graphs.bar.primary.bg, "bar.primary.bg")
        ColorSample(graphs.bar.secondary.default, "bar.secondary.default")
        ColorSample(graphs.bar.secondary.bg, "bar.secondary.bg")
        ColorSample(graphs.trend.upwards, "trend.upwards")
        ColorSample(graphs.trend.neutral, "trend.neutral")
        ColorSample(graphs.trend.downwards, "trend.downwards")
    }
}

@Composable
private fun GraphicalElementsSelectorSamples(modifier: Modifier = Modifier) {
    Subsection("Selector", modifier) {
        val selector = SatsTheme.colors.graphicalElements.selector

        ColorSample(selector.primary.selected.default, "primary.selected.default")
        ColorSample(selector.primary.selected.disabled, "primary.selected.disabled")
        ColorSample(selector.primary.unselected.default, "primary.unselected.default")
        ColorSample(selector.primary.unselected.disabled, "primary.unselected.disabled")
        ColorSample(selector.primary.selectedSurface.default, "primary.selectedSurface.default")
        ColorSample(selector.primary.selectedSurface.disabled, "primary.selectedSurface.disabled")
        ColorSample(selector.primary.unselectedSurface.default, "primary.unselectedSurface.default")
        ColorSample(selector.primary.unselectedSurface.disabled, "primary.unselectedSurface.disabled")

        ColorSample(selector.secondary.selected.default, "secondary.selected.default")
        ColorSample(selector.secondary.selected.disabled, "secondary.selected.disabled")
        ColorSample(selector.secondary.unselected.default, "secondary.unselected.default")
        ColorSample(selector.secondary.unselected.disabled, "secondary.unselected.disabled")
        ColorSample(selector.secondary.selectedSurface.default, "secondary.selectedSurface.default")
        ColorSample(selector.secondary.selectedSurface.disabled, "secondary.selectedSurface.disabled")
        ColorSample(selector.secondary.unselectedSurface.default, "secondary.unselectedSurface.default")
        ColorSample(selector.secondary.unselectedSurface.disabled, "secondary.unselectedSurface.disabled")
    }
}

@Composable
private fun GraphicalElementsSelectorFixedSamples(modifier: Modifier = Modifier) {
    Subsection("Fixed Selector", modifier, isFixed = true) {
        val selectorFixed = SatsTheme.colors.graphicalElements.selectorFixed

        ColorSample(selectorFixed.selected.default, "selected.default")
        ColorSample(selectorFixed.selected.disabled, "selected.disabled")
        ColorSample(selectorFixed.unselected.default, "unselected.default")
        ColorSample(selectorFixed.unselected.disabled, "unselected.disabled")
        ColorSample(selectorFixed.selectedBackground.default, "selectedBackground.default")
        ColorSample(selectorFixed.selectedBackground.disabled, "selectedBackground.disabled")
    }
}

@Composable
private fun GraphicalElementsChipsSamples(modifier: Modifier = Modifier) {
    Subsection("Chips", modifier) {
        val chips = SatsTheme.colors.graphicalElements.chips

        ColorSample(chips.unselected.default, "unselected.default")
        ColorSample(chips.unselected.disabled, "unselected.disabled")
        ColorSample(chips.selected.default, "selected.default")
        ColorSample(chips.selected.disabled, "selected.disabled")
    }
}

@Composable
private fun GraphicalElementsToggleSamples(modifier: Modifier = Modifier) {
    Subsection("Toggle", modifier) {
        val toggle = SatsTheme.colors.graphicalElements.toggle

        ColorSample(toggle.unselected.default, "unselected.default")
        ColorSample(toggle.unselected.disabled, "unselected.disabled")
        ColorSample(toggle.selected.default, "selected.default")
        ColorSample(toggle.selected.disabled, "selected.disabled")
    }
}

@Composable
private fun GraphicalElementsIconsSamples(modifier: Modifier = Modifier) {
    Subsection("Icons", modifier) {
        val icons = SatsTheme.colors.graphicalElements.icons

        ColorSample(icons.primary, "primary")
        ColorSample(icons.secondary, "secondary")
        ColorSample(icons.fixed, "fixed")
        ColorSample(icons.positive, "positive")
        ColorSample(icons.attention, "attention")
        ColorSample(icons.negative, "negative")
        ColorSample(icons.waitingList, "waitingList")
        ColorSample(icons.delete, "delete")
    }
}

@Composable
private fun GraphicalElementsIndicatorsSamples(modifier: Modifier = Modifier) {
    Subsection("Indicators", modifier) {
        val indicators = SatsTheme.colors.graphicalElements.indicators

        ColorSample(indicators.positive.default, "positive.default")
        ColorSample(indicators.positive.alternate, "positive.alternate")
        ColorSample(indicators.attention.default, "attention.default")
        ColorSample(indicators.attention.alternate, "attention.alternate")
        ColorSample(indicators.negative.default, "negative.default")
        ColorSample(indicators.negative.alternate, "negative.alternate")
        ColorSample(indicators.neutral.default, "neutral.default")
        ColorSample(indicators.neutral.alternate, "neutral.alternate")
    }
}

@Composable
private fun GraphicalElementsSignalSamples(modifier: Modifier = Modifier) {
    Subsection("Signal", modifier) {
        val signal = SatsTheme.colors.graphicalElements.signal

        ColorSample(signal.success, "success")
        ColorSample(signal.warning, "warning")
        ColorSample(signal.error, "error")
        ColorSample(signal.neutral, "neutral")
        ColorSample(signal.waitingList, "waitingList")
    }
}

@Composable
private fun GraphicalElementsTagsSamples(modifier: Modifier = Modifier) {
    Subsection("Tags", modifier) {
        val tags = SatsTheme.colors.graphicalElements.tags

        ColorSample(tags.primary, "primary")
        ColorSample(tags.secondary, "secondary")
        ColorSample(tags.featured, "featured")
    }
}

@Composable
private fun GraphicalElementsIndicatorTagSamples(modifier: Modifier = Modifier) {
    val indicatorTag = SatsTheme.colors.graphicalElements.indicatorTag

    Subsection("Indicator Tag", modifier) {
        ColorSample(indicatorTag.positive.default, "positive.default")
        ColorSample(indicatorTag.positive.alternate, "positive.alternate")
        ColorSample(indicatorTag.attention.default, "attention.default")
        ColorSample(indicatorTag.attention.alternate, "attention.alternate")
        ColorSample(indicatorTag.negative.default, "negative.default")
        ColorSample(indicatorTag.negative.alternate, "negative.alternate")
        ColorSample(indicatorTag.featured.default, "featured.default")
        ColorSample(indicatorTag.featured.alternate, "featured.alternate")
        ColorSample(indicatorTag.neutral.default, "neutral.default")
        ColorSample(indicatorTag.neutral.alternate, "neutral.alternate")
        ColorSample(indicatorTag.information.default, "information.default")
        ColorSample(indicatorTag.information.alternate, "information.alternate")
    }
}

@Composable
private fun GraphicalElementsBadgeSamples(modifier: Modifier = Modifier) {
    val badge = SatsTheme.colors.graphicalElements.badge

    Subsection("Badge", modifier) {
        ColorSample(badge.primary, "primary")
        ColorSample(badge.secondary, "secondary")
        ColorSample(badge.tertiary, "tertiary")
    }
}

@Composable
private fun GraphicalElementsFixedBadgeSamples(modifier: Modifier = Modifier) {
    val fixedBadge = SatsTheme.colors.graphicalElements.fixedBadge

    Subsection("Fixed Badge", modifier) {
        ColorSample(fixedBadge.primary, "primary")
        ColorSample(fixedBadge.secondary, "secondary")
        ColorSample(fixedBadge.tertiary, "tertiary")
    }
}

@Composable
private fun GraphicalElementsRewardsSamples(modifier: Modifier = Modifier) {
    val rewards = SatsTheme.colors.graphicalElements.rewards

    Subsection("Rewards", modifier) {
        ColorSample(rewards.blue, "blue")
        ColorSample(rewards.silver, "silver")
        ColorSample(rewards.gold, "gold")
        ColorSample(rewards.platinum, "platinum")
    }
}

@Composable
private fun GraphicalElementsWorkoutsSamples(modifier: Modifier = Modifier) {
    val workouts = SatsTheme.colors.graphicalElements.workouts

    Subsection("Workouts", modifier) {
        ColorSample(workouts.pt, "pt")
        ColorSample(workouts.gx, "gx")
        ColorSample(workouts.treatments, "treatments")
        ColorSample(workouts.gymfloor, "gymfloor")
        ColorSample(workouts.other, "other")
        ColorSample(workouts.bootcamp, "bootcamp")
    }
}

@Composable
private fun BackgroundPrimarySamples(modifier: Modifier = Modifier) {
    Subsection("Primary", modifier) {
        val primary = SatsTheme.colors.backgrounds.primary

        BackgroundColorSamples(primary.default, "default")
        BackgroundColorSamples(primary.selected, "selected")
    }
}

@Composable
private fun BackgroundSecondarySamples(modifier: Modifier = Modifier) {
    Subsection("Secondary", modifier) {
        val secondary = SatsTheme.colors.backgrounds.secondary

        BackgroundColorSamples(secondary.default, "default")
        BackgroundColorSamples(secondary.selected, "selected")
    }
}

@Composable
private fun BackgroundFixedSamples(modifier: Modifier = Modifier) {
    Subsection("Fixed", modifier) {
        val fixed = SatsTheme.colors.backgrounds.fixed

        BackgroundColorSamples(fixed.primary.default, "default")
        BackgroundColorSamples(fixed.primary.selected, "selected")
        BackgroundColorSamples(fixed.secondary.default, "default")
        BackgroundColorSamples(fixed.secondary.selected, "selected")
    }
}

@Composable
private fun SurfacePrimarySamples(modifier: Modifier = Modifier) {
    Subsection("Primary", modifier) {
        val primary = SatsTheme.colors.surfaces.primary

        SurfaceColorSamples(primary.default, "default")
        SurfaceColorSamples(primary.selected, "selected")
        SurfaceColorSamples(primary.disabled, "disabled")
    }
}

@Composable
private fun SurfaceSecondarySamples(modifier: Modifier = Modifier) {
    Subsection("Secondary", modifier) {
        val secondary = SatsTheme.colors.surfaces.secondary

        SurfaceColorSamples(secondary.default, "default")
        SurfaceColorSamples(secondary.selected, "selected")
    }
}

@Composable
private fun SurfaceFixedSamples(modifier: Modifier = Modifier) {
    Subsection("Fixed", modifier) {
        val fixed = SatsTheme.colors.surfaces.fixed

        SurfaceColorSamples(fixed.primary.default, "primary.default")
        SurfaceColorSamples(fixed.primary.selected, "primary.selected")
        SurfaceColorSamples(fixed.primary.default, "secondary.default")
        SurfaceColorSamples(fixed.primary.selected, "secondary.selected")
    }
}

@Composable
private fun SignalSurfaceSuccessSamples(modifier: Modifier = Modifier) {
    Subsection("Success", modifier) {
        val success = SatsTheme.colors.signalSurfaces.success

        ColorSample(success.default, "default")
        ColorSample(success.alternate, "alternate")
    }
}

@Composable
private fun SignalSurfaceWarningSamples(modifier: Modifier = Modifier) {
    Subsection("Warning", modifier) {
        val warning = SatsTheme.colors.signalSurfaces.warning

        ColorSample(warning.default, "default")
        ColorSample(warning.alternate, "alternate")
    }
}

@Composable
private fun SignalSurfaceErrorSamples(modifier: Modifier = Modifier) {
    Subsection("Error", modifier) {
        val error = SatsTheme.colors.signalSurfaces.error

        ColorSample(error.default, "default")
        ColorSample(error.alternate, "alternate")
    }
}

@Composable
private fun SignalSurfaceWaitingListSamples(modifier: Modifier = Modifier) {
    Subsection("WaitingList", modifier) {
        val waitingList = SatsTheme.colors.signalSurfaces.waitingList

        ColorSample(waitingList.default, "default")
        ColorSample(waitingList.alternate, "alternate")
    }
}

@Composable
private fun SignalSurfaceNeutralSamples(modifier: Modifier = Modifier) {
    Subsection("Neutral", modifier) {
        val neutral = SatsTheme.colors.signalSurfaces.neutral

        ColorSample(neutral.default, "default")
        ColorSample(neutral.alternate, "alternate")
    }
}

@Composable
private fun SignalSurfaceInformationSamples(modifier: Modifier = Modifier) {
    Subsection("Information", modifier) {
        val information = SatsTheme.colors.signalSurfaces.information

        ColorSample(information.default, "default")
        ColorSample(information.alternate, "alternate")
    }
}

@Composable
private fun SignalSurfaceFeaturedSamples(modifier: Modifier = Modifier) {
    Subsection("Featured", modifier) {
        val featured = SatsTheme.colors.signalSurfaces.featured

        ColorSample(featured.default, "default")
        ColorSample(featured.alternate, "alternate")
    }
}

@Composable
private fun Section(title: String, modifier: Modifier = Modifier, content: @Composable () -> Unit) {
    Column(modifier, verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s)) {
        var isExpanded by rememberSaveable { mutableStateOf(false) }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(title, style = SatsTheme.typography.satsHeadlineEmphasis.headline3)

            SatsIconButton(
                onClick = { isExpanded = !isExpanded },
                icon = if (isExpanded) SatsIcons.ArrowUp else SatsIcons.ArrowDown,
                onClickLabel = if (isExpanded) "Collapse" else "Expand",
                colors = SatsButtonColor.Action,
                size = SatsButtonSize.Small,
            )
        }

        AnimatedVisibility(visible = isExpanded) {
            Column(verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.l)) {
                content()
            }
        }
    }
}

@Composable
private fun Subsection(
    title: String,
    modifier: Modifier = Modifier,
    isFixed: Boolean = false,
    content: @Composable () -> Unit,
) {
    Column(
        modifier.padding(start = SatsTheme.spacing.m),
        verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s),
    ) {
        var isExpanded by rememberSaveable { mutableStateOf(false) }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(title, style = SatsTheme.typography.satsHeadlineNormal.large)

            SatsIconButton(
                onClick = { isExpanded = !isExpanded },
                icon = if (isExpanded) SatsIcons.ArrowUp else SatsIcons.ArrowDown,
                onClickLabel = if (isExpanded) "Collapse" else "Expand",
                colors = SatsButtonColor.Action,
                size = SatsButtonSize.Small,
            )
        }

        val colorSet = if (isFixed) {
            SatsTheme.colors.backgrounds.fixed.primary.default
        } else {
            SatsTheme.colors.backgrounds.primary.default
        }

        AnimatedVisibility(visible = isExpanded) {
            Column(
                modifier = Modifier
                    .clip(SatsTheme.shapes.roundedCorners.small)
                    .background(colorSet.bg),
                verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xs),
            ) {
                CompositionLocalProvider(LocalContentColor provides colorSet.fg) {
                    content()
                }
            }
        }
    }
}

@Composable
private fun ColorSample(color: Color, name: String, modifier: Modifier = Modifier) {
    ColorSampleLayout(
        sample = {
            Box(
                Modifier
                    .padding(SatsTheme.spacing.m)
                    .size(24.dp)
                    .clip(SatsTheme.shapes.circle)
                    .background(color),
            )
        },
        name = name,
        modifier = modifier,
    )
}

@Composable
private fun ColorSample(colorSet: ColorSet, name: String, modifier: Modifier = Modifier) {
    ColorSampleLayout(
        sample = {
            Box(
                Modifier
                    .clip(SatsTheme.shapes.roundedCorners.small)
                    .background(colorSet.bg)
                    .padding(SatsTheme.spacing.m),
            ) {
                Box(
                    Modifier
                        .size(24.dp)
                        .clip(SatsTheme.shapes.circle)
                        .background(colorSet.fg),
                )
            }
        },
        name = name,
        modifier = modifier,
    )
}

@Composable
private fun ColorSample(outlinedColorSet: OutlinedColorSet, name: String, modifier: Modifier = Modifier) {
    ColorSampleLayout(
        sample = {
            Box(
                modifier
                    .clip(SatsTheme.shapes.roundedCorners.small)
                    .border(1.dp, outlinedColorSet.outline, SatsTheme.shapes.roundedCorners.small)
                    .background(outlinedColorSet.bg)
                    .padding(SatsTheme.spacing.m),
            ) {
                Box(
                    Modifier
                        .size(24.dp)
                        .clip(SatsTheme.shapes.circle)
                        .background(outlinedColorSet.fg),
                )
            }
        },
        name = name,
        modifier = modifier,
    )
}

@Composable
private fun ColorSampleLayout(sample: @Composable () -> Unit, name: String, modifier: Modifier = Modifier) {
    Row(
        modifier
            .height(IntrinsicSize.Min)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        sample()

        Text(name, style = SatsTheme.typography.emphasis.small)
    }
}

@Composable
private fun BackgroundColorSamples(colorSet: BackgroundColorSet, name: String) {
    ColorSample(ColorSet(colorSet.bg, colorSet.fg), name)
    ColorSample(ColorSet(colorSet.bg, colorSet.fgAlternate), "$name (alternate)")
    ColorSample(ColorSet(colorSet.bg, colorSet.fgDisabled), "$name (disabled)")
}

@Composable
private fun SurfaceColorSamples(colorSet: SurfaceColorSet, name: String) {
    ColorSample(ColorSet(colorSet.bg, colorSet.fg), name)
    ColorSample(ColorSet(colorSet.bg, colorSet.fgAlternate), "$name (alternate)")
    ColorSample(ColorSet(colorSet.bg, colorSet.fgDisabled), "$name (disabled)")
    ColorSample(ColorSet(colorSet.bg, colorSet.fgSuccess), "$name (success)")
    ColorSample(ColorSet(colorSet.bg, colorSet.fgWarning), "$name (warning)")
    ColorSample(ColorSet(colorSet.bg, colorSet.fgError), "$name (error)")
    ColorSample(ColorSet(colorSet.bg, colorSet.fgWaitingList), "$name (waiting list)")
    ColorSample(ColorSet(colorSet.bg, colorSet.fgNeutral), "$name (neutral)")
    ColorSample(ColorSet(colorSet.bg, colorSet.fgInformation), "$name (information)")
    ColorSample(ColorSet(colorSet.bg, colorSet.fgFeatured), "$name (featured)")
}

@PreviewLightDark
@Composable
private fun ColorsScreenPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            ColorsScreen(navigateUp = {})
        }
    }
}
