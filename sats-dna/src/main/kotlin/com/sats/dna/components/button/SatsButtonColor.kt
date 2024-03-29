package com.sats.dna.components.button

import androidx.compose.animation.animateColorAsState
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.sats.dna.theme.SatsTheme

enum class SatsButtonColor {
    Primary,
    Secondary,
    Clean,
    CleanSecondary,
    WaitingList,
    WaitingListSecondary,
    Action,
}

@Composable
internal fun SatsButtonColor.animatedContainerColor(enabled: Boolean): Color {
    return animateColorAsState(
        if (enabled) backgroundColor else disabledBackgroundColor,
        label = "Container color",
    ).value
}

@Composable
internal fun SatsButtonColor.animatedBorderColor(enabled: Boolean): Color? {
    val borderColor = borderColor ?: return null
    val disabledBorderColor = disabledBorderColor ?: return null

    return animateColorAsState(
        if (enabled) borderColor else disabledBorderColor,
        label = "Content color",
    ).value
}

@Composable
internal fun SatsButtonColor.animatedContentColor(enabled: Boolean): Color {
    return animateColorAsState(
        if (enabled) contentColor else disabledContentColor,
        label = "Content color",
    ).value
}

private val SatsButtonColor.borderColor: Color?
    @Composable get() = when (this) {
        SatsButtonColor.WaitingListSecondary -> SatsTheme.colors.buttons.waitingListOutlined.default.outline
        SatsButtonColor.Secondary -> SatsTheme.colors.buttons.secondary.default.outline
        else -> null
    }

private val SatsButtonColor.disabledBorderColor: Color?
    @Composable get() = when (this) {
        SatsButtonColor.WaitingListSecondary -> SatsTheme.colors.buttons.waitingListOutlined.disabled.outline
        SatsButtonColor.Secondary -> SatsTheme.colors.buttons.secondary.disabled.outline
        else -> null
    }

private val SatsButtonColor.backgroundColor: Color
    @Composable get() = when (this) {
        SatsButtonColor.Primary -> SatsTheme.colors.buttons.primary.default.bg
        SatsButtonColor.Secondary -> SatsTheme.colors.buttons.secondary.default.bg
        SatsButtonColor.Clean -> SatsTheme.colors.buttons.clean.default.bg
        SatsButtonColor.CleanSecondary -> SatsTheme.colors.buttons.cleanSecondary.default.bg
        SatsButtonColor.WaitingList -> SatsTheme.colors.buttons.waitingListFilled.default.bg
        SatsButtonColor.WaitingListSecondary -> SatsTheme.colors.buttons.waitingListOutlined.default.bg
        SatsButtonColor.Action -> SatsTheme.colors.buttons.action.default.bg
    }

internal val SatsButtonColor.contentColor: Color
    @Composable get() = when (this) {
        SatsButtonColor.Primary -> SatsTheme.colors.buttons.primary.default.fg
        SatsButtonColor.Secondary -> SatsTheme.colors.buttons.secondary.default.fg
        SatsButtonColor.Clean -> SatsTheme.colors.buttons.clean.default.fg
        SatsButtonColor.CleanSecondary -> SatsTheme.colors.buttons.cleanSecondary.default.fg
        SatsButtonColor.WaitingList -> SatsTheme.colors.buttons.waitingListFilled.default.fg
        SatsButtonColor.WaitingListSecondary -> SatsTheme.colors.buttons.waitingListOutlined.default.fg
        SatsButtonColor.Action -> SatsTheme.colors.buttons.action.default.fg
    }

private val SatsButtonColor.disabledBackgroundColor: Color
    @Composable get() = when (this) {
        SatsButtonColor.Primary -> SatsTheme.colors.buttons.primary.disabled.bg
        SatsButtonColor.Secondary -> SatsTheme.colors.buttons.secondary.disabled.bg
        SatsButtonColor.Clean -> SatsTheme.colors.buttons.clean.disabled.bg
        SatsButtonColor.CleanSecondary -> SatsTheme.colors.buttons.cleanSecondary.disabled.bg
        SatsButtonColor.WaitingList -> SatsTheme.colors.buttons.waitingListFilled.disabled.bg
        SatsButtonColor.WaitingListSecondary -> SatsTheme.colors.buttons.waitingListOutlined.disabled.bg
        SatsButtonColor.Action -> SatsTheme.colors.buttons.action.disabled.bg
    }

private val SatsButtonColor.disabledContentColor: Color
    @Composable get() = when (this) {
        SatsButtonColor.Primary -> SatsTheme.colors.buttons.primary.disabled.fg
        SatsButtonColor.Secondary -> SatsTheme.colors.buttons.secondary.disabled.fg
        SatsButtonColor.Clean -> SatsTheme.colors.buttons.clean.disabled.fg
        SatsButtonColor.CleanSecondary -> SatsTheme.colors.buttons.cleanSecondary.disabled.fg
        SatsButtonColor.WaitingList -> SatsTheme.colors.buttons.waitingListFilled.disabled.fg
        SatsButtonColor.WaitingListSecondary -> SatsTheme.colors.buttons.waitingListOutlined.disabled.fg
        SatsButtonColor.Action -> SatsTheme.colors.buttons.action.disabled.fg
    }
