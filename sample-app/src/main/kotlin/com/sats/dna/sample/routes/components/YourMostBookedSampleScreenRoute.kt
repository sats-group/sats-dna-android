package com.sats.dna.sample.routes.components

import com.sats.dna.sample.routes.SampleScreenRoute
import kotlinx.serialization.Serializable

@Serializable
data object YourMostBookedSampleScreenRoute : SampleScreenRoute {
    override val name = "Your Most Booked"
}
