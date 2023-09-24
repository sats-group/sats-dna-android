package com.sats.dna.sample.screens

import com.sats.dna.sample.components.navigation.BottomNavigationScreen

data object BottomNavigationSampleScreen : SampleScreen(
    name = "Bottom Navigation",
    route = "/components/bottom-navigation",
    screen = { BottomNavigationScreen(it::navigateUp) },
)
