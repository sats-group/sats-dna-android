package com.sats.dna.sample.screens

import com.sats.dna.sample.components.SatsTextFieldScreen

data object TextFieldSampleScreen : SampleScreen(
    name = "Text Field",
    route = "/components/text-field",
    screen = { SatsTextFieldScreen(it::navigateUp) },
)
