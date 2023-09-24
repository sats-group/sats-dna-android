package com.sats.dna.sample.screens

import com.sats.dna.sample.components.CheckboxScreen

data object CheckboxSampleScreen : SampleScreen(
    name = "Checkbox",
    route = "/components/checkbox",
    screen = { CheckboxScreen(it::navigateUp) },
)
