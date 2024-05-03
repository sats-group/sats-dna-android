package com.sats.dna.sample.routes.components

import com.sats.dna.sample.routes.SampleScreenRoute
import kotlinx.serialization.Serializable

@Serializable
data object JoinYourFriendsSampleScreenRoute : SampleScreenRoute {
    override val name = "Join Your Friends"
}
