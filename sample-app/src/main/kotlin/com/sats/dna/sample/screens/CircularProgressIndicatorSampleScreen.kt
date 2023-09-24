package com.sats.dna.sample.screens

import com.sats.dna.sample.components.CircularProgressIndicatorScreen

data object CircularProgressIndicatorSampleScreen : SampleScreen(
    name = "Circular Progress Indicator",
    route = "/components/circular-progress-indicator",
    screen = { CircularProgressIndicatorScreen(it::navigateUp) },
)
