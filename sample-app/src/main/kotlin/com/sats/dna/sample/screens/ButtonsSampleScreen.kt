package com.sats.dna.sample.screens

import com.sats.dna.sample.components.ButtonsScreen

data object ButtonsSampleScreen : SampleScreen(
    name = "Buttons",
    route = "/components/buttons",
    screen = { ButtonsScreen(it::navigateUp) },
)
