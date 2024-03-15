package com.sats.dna.colors

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.sats.dna.theme.SatsTheme

@Composable
fun satsContentColor2For(backgroundColor: Color): Color {
    val buttons = SatsTheme.colors2.buttons
    val graphicalElements = SatsTheme.colors2.graphicalElements
    val backgrounds = SatsTheme.colors2.backgrounds
    val surfaces = SatsTheme.colors2.surfaces
    val signalSurfaces = SatsTheme.colors2.signalSurfaces

    return when (backgroundColor) {
        buttons.primary.default.bg -> buttons.primary.default.fg
        buttons.secondary.default.outline -> buttons.secondary.default.fg
        buttons.clean.default.bg -> buttons.clean.default.fg
        buttons.cleanSecondary.default.bg -> buttons.cleanSecondary.default.fg
        buttons.waitingListFilled.default.bg -> buttons.waitingListFilled.default.fg
        buttons.destructive.default.default.bg -> buttons.destructive.default.default.fg
        buttons.destructive.default.disabled.bg -> buttons.destructive.default.disabled.fg
        buttons.destructive.alternate.default.bg -> buttons.destructive.alternate.default.fg
        buttons.destructive.alternate.disabled.bg -> buttons.destructive.alternate.disabled.fg

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

        backgrounds.primary.bg.default -> backgrounds.primary.fg.default
        backgrounds.primary.bg.selected -> backgrounds.primary.fg.default

        backgrounds.secondary.bg.default -> backgrounds.secondary.fg.default
        backgrounds.secondary.bg.selected -> backgrounds.secondary.fg.default

        backgrounds.fixed.primary.bg.default -> backgrounds.fixed.primary.fg.default
        backgrounds.fixed.primary.bg.selected -> backgrounds.fixed.primary.fg.default
        backgrounds.fixed.secondary.bg.default -> backgrounds.fixed.secondary.fg.default
        backgrounds.fixed.secondary.bg.selected -> backgrounds.fixed.secondary.fg.default

        surfaces.primary.bg.default -> surfaces.primary.fg.default
        surfaces.primary.bg.selected -> surfaces.primary.fg.default

        surfaces.secondary.bg.default -> surfaces.secondary.fg.default
        surfaces.secondary.bg.selected -> surfaces.secondary.fg.default

        surfaces.fixed.primary.bg.default -> surfaces.fixed.primary.fg.default
        surfaces.fixed.primary.bg.selected -> surfaces.fixed.primary.fg.default
        surfaces.fixed.secondary.bg.default -> surfaces.fixed.secondary.fg.default
        surfaces.fixed.secondary.bg.selected -> surfaces.fixed.secondary.fg.default

        signalSurfaces.success.bg -> signalSurfaces.success.fg.default
        signalSurfaces.warning.bg -> signalSurfaces.warning.fg.default
        signalSurfaces.error.bg -> signalSurfaces.error.fg.default
        signalSurfaces.waitingList.bg -> signalSurfaces.waitingList.fg.default
        signalSurfaces.neutral.bg -> signalSurfaces.neutral.fg.default
        signalSurfaces.information.bg -> signalSurfaces.information.fg.default
        signalSurfaces.featured.bg -> signalSurfaces.featured.fg.default

        else -> Color.Unspecified
    }
}
