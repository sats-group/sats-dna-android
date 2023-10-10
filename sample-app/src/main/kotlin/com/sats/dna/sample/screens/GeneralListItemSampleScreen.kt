package com.sats.dna.sample.screens

import com.sats.dna.sample.components.GeneralListItemScreen

data object GeneralListItemSampleScreen : SampleScreen(
    name = "General List Item",
    route = "/components/general-list-item",
    screen = { GeneralListItemScreen(it::navigateUp) },
)
