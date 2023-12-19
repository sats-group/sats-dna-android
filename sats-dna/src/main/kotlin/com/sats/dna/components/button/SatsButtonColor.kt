package com.sats.dna.components.button

import androidx.compose.animation.animateColorAsState
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.sats.dna.theme.SatsTheme

enum class SatsButtonColor { Primary, Cta, Secondary, Clean, WaitingList, WaitingListSecondary, Transparent }

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

internal val SatsButtonColor.borderColor: Color?
    @Composable get() = when (this) {
        SatsButtonColor.WaitingListSecondary -> SatsTheme.colors2.buttons.waitingListOutlined.default
        SatsButtonColor.Secondary -> SatsTheme.colors2.buttons.secondary.default.bg
        else -> null
    }

internal val SatsButtonColor.disabledBorderColor: Color?
    @Composable get() = when (this) {
        SatsButtonColor.WaitingListSecondary -> SatsTheme.colors2.buttons.waitingListOutlined.disabled
        SatsButtonColor.Secondary -> SatsTheme.colors2.buttons.secondary.disabled.bg
        else -> null
    }

internal val SatsButtonColor.backgroundColor: Color
    @Composable get() = when (this) {
        SatsButtonColor.Primary -> SatsTheme.colors2.buttons.primary.default.bg
        SatsButtonColor.Cta -> SatsTheme.colors2.buttons.cta.default.bg
        SatsButtonColor.Secondary -> Color.Transparent
        SatsButtonColor.Clean -> SatsTheme.colors2.buttons.clean.default.bg
        SatsButtonColor.WaitingList -> SatsTheme.colors2.buttons.waitingListFilled.default.bg
        SatsButtonColor.WaitingListSecondary -> Color.Transparent
        SatsButtonColor.Transparent -> Color.Transparent
    }

internal val SatsButtonColor.contentColor: Color
    @Composable get() = when (this) {
        SatsButtonColor.Primary -> SatsTheme.colors2.buttons.primary.default.fg
        SatsButtonColor.Cta -> SatsTheme.colors2.buttons.cta.default.fg
        SatsButtonColor.Secondary -> SatsTheme.colors2.buttons.secondary.default.fg
        SatsButtonColor.Clean -> SatsTheme.colors2.buttons.clean.default.fg
        SatsButtonColor.WaitingList -> SatsTheme.colors2.buttons.waitingListFilled.default.fg
        SatsButtonColor.WaitingListSecondary -> SatsTheme.colors2.buttons.waitingListOutlined.default
        SatsButtonColor.Transparent -> SatsTheme.colors2.buttons.action.default
    }

internal val SatsButtonColor.disabledBackgroundColor: Color
    @Composable get() = when (this) {
        SatsButtonColor.Primary -> SatsTheme.colors2.buttons.primary.disabled.bg
        SatsButtonColor.Cta -> SatsTheme.colors2.buttons.cta.disabled.bg
        SatsButtonColor.Secondary -> Color.Transparent
        SatsButtonColor.Clean -> SatsTheme.colors2.buttons.clean.disabled.bg
        SatsButtonColor.WaitingList -> SatsTheme.colors2.buttons.waitingListFilled.disabled.bg
        SatsButtonColor.WaitingListSecondary -> Color.Transparent
        SatsButtonColor.Transparent -> Color.Transparent
    }

internal val SatsButtonColor.disabledContentColor: Color
    @Composable get() = when (this) {
        SatsButtonColor.Primary -> SatsTheme.colors2.buttons.primary.disabled.fg
        SatsButtonColor.Cta -> SatsTheme.colors2.buttons.cta.disabled.fg
        SatsButtonColor.Secondary -> SatsTheme.colors2.buttons.secondary.disabled.fg
        SatsButtonColor.Clean -> SatsTheme.colors2.buttons.clean.disabled.fg
        SatsButtonColor.WaitingList -> SatsTheme.colors2.buttons.waitingListFilled.disabled.fg
        SatsButtonColor.WaitingListSecondary -> SatsTheme.colors2.buttons.waitingListOutlined.disabled
        SatsButtonColor.Transparent -> SatsTheme.colors2.buttons.action.disabled
    }
