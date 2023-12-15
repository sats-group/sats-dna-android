package com.sats.dna.colors

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.sats.dna.theme.SatsTheme

@Composable
fun satsContentColorFor(backgroundColor: Color): Color {
    return when (backgroundColor) {
        SatsTheme.colors.primary.default -> SatsTheme.colors.onPrimary.default
        SatsTheme.colors.secondary.default -> SatsTheme.colors.onSecondary.default
        SatsTheme.colors.primary.disabled -> SatsTheme.colors.onPrimary.disabled
        SatsTheme.colors.cta.default -> SatsTheme.colors.onCta.default
        SatsTheme.colors.clean.default -> SatsTheme.colors.onClean.default
        SatsTheme.colors.cleanSecondary.default -> SatsTheme.colors.onCleanSecondary.default
        SatsTheme.colors.background.primary -> SatsTheme.colors.onBackground.primary
        SatsTheme.colors2.surfaces.primary.bg.default -> SatsTheme.colors.onSurface.primary
        SatsTheme.colors.background.secondary -> SatsTheme.colors.onBackground.primary
        SatsTheme.colors.surface.secondary -> SatsTheme.colors.onSurface.primary
        SatsTheme.colors.waitingList.background -> SatsTheme.colors.onBackground.primary
        SatsTheme.colors.waitingList.primary -> SatsTheme.colors.onWaitingList.primary
        SatsTheme.colors.waitingList.disabled -> SatsTheme.colors.onWaitingList.disabled
        SatsTheme.colors.signalBackground.success -> SatsTheme.colors.onBackground.primary
        SatsTheme.colors.signalBackground.warning -> SatsTheme.colors.onBackground.primary
        SatsTheme.colors.signalBackground.error -> SatsTheme.colors.onBackground.primary
        SatsTheme.colors.signalBackground.delete -> SatsTheme.colors.onBackground.primary
        SatsTheme.colors.signal.success -> SatsTheme.colors.onSignal
        SatsTheme.colors.signal.warning -> SatsTheme.colors.onSignal
        SatsTheme.colors.signal.error -> SatsTheme.colors.onSignal
        SatsTheme.colors.signal.delete -> SatsTheme.colors.onSignal
        SatsTheme.colors.rewards.blue -> SatsTheme.colors.onRewards.default
        SatsTheme.colors.rewards.silver -> SatsTheme.colors.onRewards.default
        SatsTheme.colors.rewards.gold -> SatsTheme.colors.onRewards.default
        SatsTheme.colors.rewards.platinum -> SatsTheme.colors.onRewards.default
        else -> Color.Unspecified
    }
}

@Composable
fun satsContentColor2For(backgroundColor: Color): Color {
    val buttons = SatsTheme.colors2.buttons
    val graphicalElements = SatsTheme.colors2.graphicalElements
    val backgrounds = SatsTheme.colors2.backgrounds
    val surfaces = SatsTheme.colors2.surfaces
    val signalSurfaces = SatsTheme.colors2.signalSurfaces

    return when (backgroundColor) {
        buttons.primary.default.bg -> buttons.primary.default.fg
        buttons.secondary.default.bg -> buttons.secondary.default.fg
        buttons.clean.default.bg -> buttons.clean.default.fg
        buttons.cleanSecondary.default.bg -> buttons.cleanSecondary.default.fg
        buttons.cta.default.bg -> buttons.cta.default.fg
        buttons.waitingListFilled.default.bg -> buttons.waitingListFilled.default.fg
        buttons.deleteFilled.default.bg -> buttons.deleteFilled.default.fg

        buttons.primary.hover.bg -> buttons.primary.hover.fg
        buttons.secondary.hover.bg -> buttons.secondary.hover.fg
        buttons.clean.hover.bg -> buttons.clean.hover.fg
        buttons.cleanSecondary.hover.bg -> buttons.cleanSecondary.hover.fg
        buttons.cta.hover.bg -> buttons.cta.hover.fg
        buttons.waitingListFilled.hover.bg -> buttons.waitingListFilled.hover.fg
        buttons.deleteFilled.hover.bg -> buttons.deleteFilled.hover.fg

        buttons.primary.disabled.bg -> buttons.primary.disabled.fg
        buttons.secondary.disabled.bg -> buttons.secondary.disabled.fg
        buttons.clean.disabled.bg -> buttons.clean.disabled.fg
        buttons.cleanSecondary.disabled.bg -> buttons.cleanSecondary.disabled.fg
        buttons.cta.disabled.bg -> buttons.cta.disabled.fg
        buttons.waitingListFilled.disabled.bg -> buttons.waitingListFilled.disabled.fg
        buttons.deleteFilled.disabled.bg -> buttons.deleteFilled.disabled.fg

        graphicalElements.chips.selected.default.bg -> graphicalElements.chips.selected.default.fg
        graphicalElements.chips.selected.hover.bg -> graphicalElements.chips.selected.hover.fg
        graphicalElements.chips.selected.disabled.bg -> graphicalElements.chips.selected.disabled.fg
        graphicalElements.chips.unselected.default.bg -> graphicalElements.chips.unselected.default.fg
        graphicalElements.chips.unselected.disabled.bg -> graphicalElements.chips.unselected.disabled.fg

        graphicalElements.tags.primary.bg -> graphicalElements.tags.primary.fg
        graphicalElements.tags.secondary.bg -> graphicalElements.tags.secondary.fg
        graphicalElements.tags.featured.bg -> graphicalElements.tags.featured.fg

        graphicalElements.rewards.blue.bg -> graphicalElements.rewards.blue.bg
        graphicalElements.rewards.silver.bg -> graphicalElements.rewards.silver.bg
        graphicalElements.rewards.gold.bg -> graphicalElements.rewards.gold.bg
        graphicalElements.rewards.platinum.bg -> graphicalElements.rewards.platinum.bg

        backgrounds.primary.bg.default -> backgrounds.primary.fg.default
        backgrounds.primary.bg.hover -> backgrounds.primary.fg.default
        backgrounds.primary.bg.selected -> backgrounds.primary.fg.default

        backgrounds.secondary.bg.default -> backgrounds.secondary.fg.default
        backgrounds.secondary.bg.hover -> backgrounds.secondary.fg.default
        backgrounds.secondary.bg.selected -> backgrounds.secondary.fg.default

        backgrounds.fixed.bg.default -> backgrounds.fixed.fg.default
        backgrounds.fixed.bg.hover -> backgrounds.fixed.fg.default
        backgrounds.fixed.bg.selected -> backgrounds.fixed.fg.default

        surfaces.primary.bg.default -> surfaces.primary.fg.default
        surfaces.primary.bg.hover -> surfaces.primary.fg.default
        surfaces.primary.bg.selected -> surfaces.primary.fg.default

        surfaces.secondary.bg.default -> surfaces.secondary.fg.default
        surfaces.secondary.bg.hover -> surfaces.secondary.fg.default
        surfaces.secondary.bg.selected -> surfaces.secondary.fg.default

        surfaces.fixed.bg.default -> surfaces.fixed.fg.default
        surfaces.fixed.bg.hover -> surfaces.fixed.fg.default
        surfaces.fixed.bg.selected -> surfaces.fixed.fg.default

        signalSurfaces.success.bg -> signalSurfaces.success.fg.default
        signalSurfaces.warning.bg -> signalSurfaces.warning.fg.default
        signalSurfaces.error.bg -> signalSurfaces.error.fg.default
        signalSurfaces.waitlist.bg -> signalSurfaces.waitlist.fg.default
        signalSurfaces.neutral.bg -> signalSurfaces.neutral.fg.default
        signalSurfaces.information.bg -> signalSurfaces.information.fg.default

        else -> Color.Unspecified
    }
}
