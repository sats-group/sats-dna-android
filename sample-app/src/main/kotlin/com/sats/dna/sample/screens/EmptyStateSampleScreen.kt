package com.sats.dna.sample.screens

import com.sats.dna.sample.components.EmptyStateScreen

data object EmptyStateSampleScreen : SampleScreen(
    name = "Empty State",
    route = "/components/empty-state",
    screen = { EmptyStateScreen(it::navigateUp) },
)
