package com.sats.dna.sample.screens

import com.sats.dna.sample.typography.TypographyScreen

data object TypographySampleScreen : SampleScreen(
    name = "Typography",
    route = "/typography",
    screen = { TypographyScreen(it::navigateUp) },
)
