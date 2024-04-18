package com.sats.dna.colors

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.sats.dna.theme.SatsTheme

@Composable
fun satsContentColor2For(backgroundColor: Color): Color {
    val buttons = SatsTheme.colors.buttons
    val graphicalElements = SatsTheme.colors.graphicalElements
    val backgrounds = SatsTheme.colors.backgrounds
    val surfaces = SatsTheme.colors.surfaces
    val signalSurfaces = SatsTheme.colors.signalSurfaces

    return when (backgroundColor) {
        buttons.primary.default.bg -> buttons.primary.default.fg
        buttons.secondary.default.outline -> buttons.secondary.default.fg
        buttons.clean.default.bg -> buttons.clean.default.fg
        buttons.cleanSecondary.default.bg -> buttons.cleanSecondary.default.fg
        buttons.waitingListFilled.default.bg -> buttons.waitingListFilled.default.fg
        buttons.destructive.default.default.bg -> buttons.destructive.default.default.fg
        buttons.destructive.default.disabled.bg -> buttons.destructive.default.disabled.fg
        buttons.destructive.outlined.default.bg -> buttons.destructive.outlined.default.fg
        buttons.destructive.outlined.disabled.bg -> buttons.destructive.outlined.disabled.fg

        buttons.primary.disabled.bg -> buttons.primary.disabled.fg
        buttons.secondary.disabled.outline -> buttons.secondary.disabled.fg
        buttons.clean.disabled.bg -> buttons.clean.disabled.fg
        buttons.cleanSecondary.disabled.bg -> buttons.cleanSecondary.disabled.fg
        buttons.waitingListFilled.disabled.bg -> buttons.waitingListFilled.disabled.fg

        graphicalElements.chips.selected.default.bg -> graphicalElements.chips.selected.default.fg
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

        backgrounds.primary.default.bg -> backgrounds.primary.default.fg
        backgrounds.primary.selected.bg -> backgrounds.primary.default.fg

        backgrounds.secondary.default.bg -> backgrounds.secondary.default.fg
        backgrounds.secondary.selected.bg -> backgrounds.secondary.default.fg

        backgrounds.fixed.primary.default.bg -> backgrounds.fixed.primary.default.fg
        backgrounds.fixed.primary.selected.bg -> backgrounds.fixed.primary.default.fg
        backgrounds.fixed.secondary.default.bg -> backgrounds.fixed.secondary.default.fg
        backgrounds.fixed.secondary.selected.bg -> backgrounds.fixed.secondary.default.fg

        surfaces.primary.default.bg -> surfaces.primary.default.fg
        surfaces.primary.selected.bg -> surfaces.primary.default.fg

        surfaces.secondary.default.bg -> surfaces.secondary.default.fg
        surfaces.secondary.selected.bg -> surfaces.secondary.default.fg

        surfaces.fixed.primary.default.bg -> surfaces.fixed.primary.default.fg
        surfaces.fixed.primary.selected.bg -> surfaces.fixed.primary.default.fg
        surfaces.fixed.secondary.default.bg -> surfaces.fixed.secondary.default.fg
        surfaces.fixed.secondary.selected.bg -> surfaces.fixed.secondary.default.fg

        signalSurfaces.success.default.bg -> signalSurfaces.success.default.fg
        signalSurfaces.warning.default.bg -> signalSurfaces.warning.default.fg
        signalSurfaces.error.default.bg -> signalSurfaces.error.default.fg
        signalSurfaces.waitingList.default.bg -> signalSurfaces.waitingList.default.fg
        signalSurfaces.neutral.default.bg -> signalSurfaces.neutral.default.fg
        signalSurfaces.information.default.bg -> signalSurfaces.information.default.fg
        signalSurfaces.featured.default.bg -> signalSurfaces.featured.default.fg

        else -> Color.Unspecified
    }
}
