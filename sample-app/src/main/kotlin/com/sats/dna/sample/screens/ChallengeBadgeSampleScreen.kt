package com.sats.dna.sample.screens

import com.sats.dna.sample.components.ChallengeBadgeScreen

data object ChallengeBadgeSampleScreen : SampleScreen(
    name = "Challenge Badges",
    route = "/components/challenge-badges",
    screen = { ChallengeBadgeScreen(it::navigateUp) },
)
