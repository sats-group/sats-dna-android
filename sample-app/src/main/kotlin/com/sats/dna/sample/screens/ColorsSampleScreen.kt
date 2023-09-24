package com.sats.dna.sample.screens

import com.sats.dna.sample.colors.ColorsScreen

data object ColorsSampleScreen : SampleScreen(
    name = "Colors",
    route = "/colors",
    screen = { ColorsScreen(it::navigateUp) },
)
