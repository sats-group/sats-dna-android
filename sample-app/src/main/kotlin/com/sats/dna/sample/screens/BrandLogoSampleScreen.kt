package com.sats.dna.sample.screens

import com.sats.dna.sample.components.BrandLogoScreen

data object BrandLogoSampleScreen : SampleScreen(
    name = "Brand Logo",
    route = "/components/brand-logo",
    screen = { BrandLogoScreen(it::navigateUp) },
)
