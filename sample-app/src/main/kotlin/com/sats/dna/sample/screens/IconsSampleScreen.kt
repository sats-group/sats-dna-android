package com.sats.dna.sample.screens

import com.sats.dna.sample.icons.IconsScreen

data object IconsSampleScreen : SampleScreen(
    name = "Icons",
    route = "/icons",
    screen = { IconsScreen(it::navigateUp) },
)
