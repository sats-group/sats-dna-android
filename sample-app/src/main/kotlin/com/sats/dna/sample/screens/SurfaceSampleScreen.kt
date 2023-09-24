package com.sats.dna.sample.screens

import com.sats.dna.sample.components.SurfaceScreen

data object SurfaceSampleScreen : SampleScreen(
    name = "Surface",
    route = "/components/surface",
    screen = { SurfaceScreen(it::navigateUp) },
)
