package com.sats.dna.sample.screens

import com.sats.dna.sample.components.card.SatsCardScreen

data object CardSampleScreen : SampleScreen(
    name = "Card",
    route = "/components/card",
    screen = { SatsCardScreen(it::navigateUp) },
)
