package com.sats.dna.sample.screens

import com.sats.dna.sample.components.RadioButtonsScreen

data object RadioButtonsSampleScreen : SampleScreen(
    name = "Radio Buttons",
    route = "/components/radio-buttons",
    screen = { RadioButtonsScreen(it::navigateUp) },
)
