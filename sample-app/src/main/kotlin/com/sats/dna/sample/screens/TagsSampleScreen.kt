package com.sats.dna.sample.screens

import com.sats.dna.sample.components.TagsScreen

data object TagsSampleScreen : SampleScreen(
    name = "Tags",
    route = "/components/tags",
    screen = { TagsScreen(it::navigateUp) },
)
