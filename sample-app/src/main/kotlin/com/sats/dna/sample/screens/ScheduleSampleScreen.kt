package com.sats.dna.sample.screens

import com.sats.dna.sample.components.schedule.ScheduleScreen

data object ScheduleSampleScreen : SampleScreen(
    name = "Schedule",
    route = "/components/schedule",
    screen = { ScheduleScreen(it::navigateUp) },
)
