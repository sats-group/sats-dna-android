package com.sats.dna.sample.screens

import com.sats.dna.sample.components.UpcomingWorkoutListItemScreen

data object UpcomingWorkoutListItemSampleScreen : SampleScreen(
    name = "Upcoming Workout List Item",
    route = "/components/upcoming-workout-list-item",
    screen = { UpcomingWorkoutListItemScreen(it::navigateUp) },
)
