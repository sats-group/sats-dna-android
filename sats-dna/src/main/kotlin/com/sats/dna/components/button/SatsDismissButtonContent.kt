package com.sats.dna.components.button

internal sealed interface SatsDismissButtonContent {
    data object Close : SatsDismissButtonContent
    data object Dismiss : SatsDismissButtonContent
}
