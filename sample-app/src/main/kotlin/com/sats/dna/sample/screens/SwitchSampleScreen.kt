package com.sats.dna.sample.screens

import com.sats.dna.sample.components.SwitchScreen

data object SwitchSampleScreen : SampleScreen(
    name = "Switch",
    route = "/components/switch",
    screen = { SwitchScreen(it::navigateUp) },
)
