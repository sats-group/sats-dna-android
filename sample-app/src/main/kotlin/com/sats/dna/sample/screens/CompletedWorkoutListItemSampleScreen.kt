package com.sats.dna.sample.screens

import com.sats.dna.sample.components.CompletedWorkoutListItemScreen

data object CompletedWorkoutListItemSampleScreen : SampleScreen(
    name = "Completed Workout List Item",
    route = "/components/completed-workout-list-item",
    screen = { CompletedWorkoutListItemScreen(it::navigateUp) },
)
