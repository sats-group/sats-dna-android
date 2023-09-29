package com.sats.dna.sample.screens

import com.sats.dna.sample.components.TrafficLightsScreen

data object TrafficLightsSampleScreen : SampleScreen(
    name = "Traffic Lights",
    route = "/components/traffic-lights",
    screen = { TrafficLightsScreen(it::navigateUp) },
)
