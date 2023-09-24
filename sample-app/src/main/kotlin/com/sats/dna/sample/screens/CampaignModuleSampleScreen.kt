package com.sats.dna.sample.screens

import com.sats.dna.sample.components.CampaignModulesScreen

data object CampaignModuleSampleScreen : SampleScreen(
    name = "Campaign Module",
    route = "/components/campaign-modules",
    screen = { CampaignModulesScreen(it::navigateUp) },
)
