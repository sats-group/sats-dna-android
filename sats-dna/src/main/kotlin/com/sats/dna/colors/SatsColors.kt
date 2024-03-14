package com.sats.dna.colors

import androidx.compose.ui.graphics.Color

data class SatsColors(
    val primary: Primary,
    val onPrimary: OnPrimary,
    val secondary: Secondary,
    val onSecondary: OnSecondary,
    val cta: Cta,
    val action: Action,
    val clean: Clean,
    val signal: Signal,
    val signalText: SignalText,
    val ui: Ui,
    val challenges: Challenges,
    val background: Background,
    val onBackground: OnBackground,
    val surface: Surface,
    val onSurface: OnSurface,
    val waitingList: WaitingList,
    val signalBackground: SignalBackground,
    val onSignal: Color,

    val isLightMode: Boolean,
) {
    data class Primary(
        val default: Color,
        val disabled: Color,
    )

    data class OnPrimary(
        val default: Color,
        val disabled: Color,
    )

    data class Secondary(
        val default: Color,
        val disabled: Color,
    )

    data class OnSecondary(
        val default: Color,
        val disabled: Color,
    )

    data class Cta(
        val default: Color,
        val disabled: Color,
        val nonText: Color,
    )

    data class OnCta(
        val default: Color,
        val disabled: Color,
        val nonText: Color,
    )

    data class Action(
        val default: Color,
        val disabled: Color,
    )

    data class Clean(
        val default: Color,
        val disabled: Color,
    )

    data class OnClean(
        val default: Color,
        val disabled: Color,
    )

    data class CleanSecondary(
        val default: Color,
        val disabled: Color,
    )

    data class OnCleanSecondary(
        val default: Color,
        val disabled: Color,
    )

    data class SignalBackground(
        val success: Color,
        val warning: Color,
        val error: Color,
        val delete: Color,
    )

    data class Signal(
        val success: Color,
        val warning: Color,
        val error: Color,
        val delete: Color,
    )

    data class SignalText(
        val success: Color,
        val warning: Color,
        val error: Color,
        val delete: Color,
    )

    data class Ui(
        val tabs: Color,
        val shimmer: Color,
        val border: Color,
        val graphicalElements1: Color,
        val graphicalElements2: Color,
        val graphicalElements3: Color,
        val graphicalElements4: Color,
        val graphicalElements5: Color,
        val graphicalElements6: Color,
        val graphicalElements7: Color,
    )

    data class Challenges(
        val inProgress: Color,
        val failed: Color,
        val success: Color,
        val notDone: Color,
    )

    data class Background(
        val primary: Color,
        val secondary: Color,
    )

    data class OnBackground(
        val primary: Color,
        val secondary: Color,
        val disabled: Color,
        val controls: Controls,
    ) {
        data class Controls(
            val enabledOn: Color,
            val enabledOff: Color,
            val disabledOn: Color,
            val disabledOff: Color,
        )
    }

    data class Surface(
        val primary: Color,
        val secondary: Color,
    )

    data class OnSurface(
        val primary: Color,
        val secondary: Color,
        val disabled: Color,
        val controls: Controls,
    ) {
        data class Controls(
            val enabledOn: Color,
            val enabledOff: Color,
            val disabledOn: Color,
            val disabledOff: Color,
        )
    }

    data class WaitingList(
        val background: Color,
        val primary: Color,
        val text: Color,
        val disabled: Color,
    )

    data class OnWaitingList(
        val primary: Color,
        val disabled: Color,
    )

    data class Rewards(
        val blue: Color,
        val silver: Color,
        val gold: Color,
        val platinum: Color,
    )

    data class OnRewards(
        val default: Color,
    )

    data class Workout(
        val pt: Color,
        val gx: Color,
        val gymFloor: Color,
        val other: Color,
    )
}
