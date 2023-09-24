package com.sats.dna.sample.screens

import com.sats.dna.sample.components.PlaceholderScreen

data object PlaceholdersSampleScreen : SampleScreen(
    name = "Placeholders",
    route = "/components/placeholders",
    screen = { PlaceholderScreen(it::navigateUp) },
)
