package com.sats.dna.sample.screens

import com.sats.dna.sample.components.LabelsScreen

data object LabelsSampleScreen : SampleScreen(
    name = "Labels",
    route = "/components/labels",
    screen = { LabelsScreen(it::navigateUp) },
)
