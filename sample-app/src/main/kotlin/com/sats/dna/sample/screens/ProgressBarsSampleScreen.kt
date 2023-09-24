package com.sats.dna.sample.screens

import com.sats.dna.sample.components.progressbar.ProgressBarsScreen

data object ProgressBarsSampleScreen : SampleScreen(
    name = "Progress Bars",
    route = "/components/progress-bars",
    screen = { ProgressBarsScreen(it::navigateUp) },
)
