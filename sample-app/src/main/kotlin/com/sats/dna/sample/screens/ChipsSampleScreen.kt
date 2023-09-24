package com.sats.dna.sample.screens

import com.sats.dna.sample.components.ChipsScreen

data object ChipsSampleScreen : SampleScreen(
    name = "Chips",
    route = "/components/chips",
    screen = { ChipsScreen(it::navigateUp) },
)
