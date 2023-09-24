package com.sats.dna.sample.screens

import com.sats.dna.sample.components.appbar.SatsTopAppBarScreen

data object TopBarSampleScreen : SampleScreen(
    name = "Top App Bar",
    route = "/components/top-app-bar",
    screen = { SatsTopAppBarScreen(it::navigateUp) },
)
