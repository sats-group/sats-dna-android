package com.sats.dna.components.button

import androidx.compose.animation.animateColorAsState
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.sats.dna.theme.SatsTheme

enum class SatsButtonColor { Primary, Cta, Secondary, Clean, WaitingList }

@Composable
internal fun SatsButtonColor.asMaterialButtonColors(isEnabled: Boolean): ButtonColors {
    val background = if (isEnabled) backgroundColor else (disabledBackgroundColor)
    val content = if (isEnabled) contentColor else (disabledContentColor)

    return ButtonDefaults.buttonColors(
        backgroundColor = animateColorAsState(background, label = "Animated background").value,
        contentColor = animateColorAsState(content, label = "Animated content").value,
        disabledBackgroundColor = animateColorAsState(background, label = "Animated disabled background").value,
        disabledContentColor = animateColorAsState(content, label = "Animated disabled content").value,
    )
}

private val SatsButtonColor.backgroundColor: Color
    @Composable get() = when (this) {
        SatsButtonColor.Primary -> SatsTheme.colors.primary.default
        SatsButtonColor.Cta -> SatsTheme.colors.cta.default
        SatsButtonColor.Secondary -> SatsTheme.colors.secondary.default
        SatsButtonColor.Clean -> SatsTheme.colors.clean.default
        SatsButtonColor.WaitingList -> SatsTheme.colors.waitingList.primary
    }

private val SatsButtonColor.contentColor: Color
    @Composable get() = when (this) {
        SatsButtonColor.Primary -> SatsTheme.colors.onPrimary.default
        SatsButtonColor.Cta -> SatsTheme.colors.onCta.default
        SatsButtonColor.Secondary -> SatsTheme.colors.onSecondary.default
        SatsButtonColor.Clean -> SatsTheme.colors.onClean.default
        SatsButtonColor.WaitingList -> SatsTheme.colors.onWaitingList.primary
    }

private val SatsButtonColor.disabledBackgroundColor: Color
    @Composable get() = when (this) {
        SatsButtonColor.Primary -> SatsTheme.colors.primary.disabled
        SatsButtonColor.Cta -> SatsTheme.colors.cta.disabled
        SatsButtonColor.Secondary -> SatsTheme.colors.secondary.disabled
        SatsButtonColor.Clean -> SatsTheme.colors.clean.disabled
        SatsButtonColor.WaitingList -> SatsTheme.colors.waitingList.disabled
    }

private val SatsButtonColor.disabledContentColor: Color
    @Composable get() = when (this) {
        SatsButtonColor.Primary -> SatsTheme.colors.onPrimary.disabled
        SatsButtonColor.Cta -> SatsTheme.colors.onCta.disabled
        SatsButtonColor.Secondary -> SatsTheme.colors.onSecondary.disabled
        SatsButtonColor.Clean -> SatsTheme.colors.onClean.disabled
        SatsButtonColor.WaitingList -> SatsTheme.colors.onWaitingList.disabled
    }
