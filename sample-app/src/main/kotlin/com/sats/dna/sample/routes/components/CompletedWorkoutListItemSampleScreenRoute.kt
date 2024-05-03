package com.sats.dna.sample.routes.components

import com.sats.dna.sample.routes.SampleScreenRoute
import kotlinx.serialization.Serializable

@Serializable
data object CompletedWorkoutListItemSampleScreenRoute : SampleScreenRoute {
    override val name = "Completed Workout List Item"
}
