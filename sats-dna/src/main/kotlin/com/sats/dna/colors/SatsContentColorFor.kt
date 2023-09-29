package com.sats.dna.colors

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.sats.dna.theme.SatsTheme

@Composable
fun satsContentColorFor(backgroundColor: Color): Color {
    return when (backgroundColor) {
        SatsTheme.colors.primary.default -> SatsTheme.colors.onPrimary.default
        SatsTheme.colors.secondary.default -> SatsTheme.colors.onSecondary.default
        SatsTheme.colors.cta.default -> SatsTheme.colors.onCta.default
        SatsTheme.colors.clean.default -> SatsTheme.colors.onClean.default
        SatsTheme.colors.cleanSecondary.default -> SatsTheme.colors.onCleanSecondary.default
        SatsTheme.colors.background.primary -> SatsTheme.colors.onBackground.primary
        SatsTheme.colors.surface.primary -> SatsTheme.colors.onSurface.primary
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
        SatsTheme.colors.rewards.blue -> SatsTheme.colors.onRewards.primary
        SatsTheme.colors.rewards.silver -> SatsTheme.colors.onRewards.primary
        SatsTheme.colors.rewards.gold -> SatsTheme.colors.onRewards.primary
        SatsTheme.colors.rewards.platinum -> SatsTheme.colors.onRewards.primary
        else -> Color.Unspecified
    }
}
