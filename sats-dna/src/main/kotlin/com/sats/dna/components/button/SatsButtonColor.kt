package com.sats.dna.components.button

import androidx.compose.animation.animateColorAsState
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
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

@Composable
internal fun SatsButtonColor.asMaterialButtonColors(isEnabled: Boolean): ButtonColors {
    val background = if (isEnabled) backgroundColor else disabledBackgroundColor
    val content = if (isEnabled) contentColor else disabledContentColor

    return ButtonDefaults.buttonColors(
        containerColor = animateColorAsState(background, label = "Animated background").value,
        contentColor = animateColorAsState(content, label = "Animated content").value,
        disabledContainerColor = animateColorAsState(background, label = "Animated disabled background").value,
        disabledContentColor = animateColorAsState(content, label = "Animated disabled content").value,
    )
}

private val SatsButtonColor.borderColor: Color?
    @Composable get() = when (this) {
        SatsButtonColor.WaitingListSecondary -> SatsTheme.colors2.buttons.waitingListSecondary.default.outline
        SatsButtonColor.Secondary -> SatsTheme.colors2.buttons.secondary.default.outline
        else -> null
    }

private val SatsButtonColor.disabledBorderColor: Color?
    @Composable get() = when (this) {
        SatsButtonColor.WaitingListSecondary -> SatsTheme.colors2.buttons.waitingListSecondary.disabled.outline
        SatsButtonColor.Secondary -> SatsTheme.colors2.buttons.secondary.disabled.outline
        else -> null
    }

private val SatsButtonColor.backgroundColor: Color
    @Composable get() = when (this) {
        SatsButtonColor.Primary -> SatsTheme.colors2.buttons.primary.default.bg
        SatsButtonColor.Secondary -> SatsTheme.colors2.buttons.secondary.default.bg
        SatsButtonColor.Clean -> SatsTheme.colors2.buttons.clean.default.bg
        SatsButtonColor.CleanSecondary -> SatsTheme.colors2.buttons.cleanSecondary.default.bg
        SatsButtonColor.WaitingList -> SatsTheme.colors2.buttons.waitingListFilled.default.bg
        SatsButtonColor.WaitingListSecondary -> SatsTheme.colors2.buttons.waitingListSecondary.default.bg
        SatsButtonColor.Action -> SatsTheme.colors2.buttons.action.default.bg
    }

internal val SatsButtonColor.contentColor: Color
    @Composable get() = when (this) {
        SatsButtonColor.Primary -> SatsTheme.colors2.buttons.primary.default.fg
        SatsButtonColor.Secondary -> SatsTheme.colors2.buttons.secondary.default.fg
        SatsButtonColor.Clean -> SatsTheme.colors2.buttons.clean.default.fg
        SatsButtonColor.CleanSecondary -> SatsTheme.colors2.buttons.cleanSecondary.default.fg
        SatsButtonColor.WaitingList -> SatsTheme.colors2.buttons.waitingListFilled.default.fg
        SatsButtonColor.WaitingListSecondary -> SatsTheme.colors2.buttons.waitingListSecondary.default.fg
        SatsButtonColor.Action -> SatsTheme.colors2.buttons.action.default.fg
    }

private val SatsButtonColor.disabledBackgroundColor: Color
    @Composable get() = when (this) {
        SatsButtonColor.Primary -> SatsTheme.colors2.buttons.primary.disabled.bg
        SatsButtonColor.Secondary -> SatsTheme.colors2.buttons.secondary.disabled.bg
        SatsButtonColor.Clean -> SatsTheme.colors2.buttons.clean.disabled.bg
        SatsButtonColor.CleanSecondary -> SatsTheme.colors2.buttons.cleanSecondary.disabled.bg
        SatsButtonColor.WaitingList -> SatsTheme.colors2.buttons.waitingListFilled.disabled.bg
        SatsButtonColor.WaitingListSecondary -> SatsTheme.colors2.buttons.waitingListSecondary.disabled.bg
        SatsButtonColor.Action -> SatsTheme.colors2.buttons.action.disabled.bg
    }

private val SatsButtonColor.disabledContentColor: Color
    @Composable get() = when (this) {
        SatsButtonColor.Primary -> SatsTheme.colors2.buttons.primary.disabled.fg
        SatsButtonColor.Secondary -> SatsTheme.colors2.buttons.secondary.disabled.fg
        SatsButtonColor.Clean -> SatsTheme.colors2.buttons.clean.disabled.fg
        SatsButtonColor.CleanSecondary -> SatsTheme.colors2.buttons.cleanSecondary.disabled.fg
        SatsButtonColor.WaitingList -> SatsTheme.colors2.buttons.waitingListFilled.disabled.fg
        SatsButtonColor.WaitingListSecondary -> SatsTheme.colors2.buttons.waitingListSecondary.disabled.fg
        SatsButtonColor.Action -> SatsTheme.colors2.buttons.action.disabled.fg
    }
