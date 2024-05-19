package com.sats.dna.sample.routes.components

import com.sats.dna.sample.routes.SampleScreenRoute
import kotlinx.parcelize.IgnoredOnParcel
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable

@Serializable
@Parcelize
data object ChallengeBadgeSampleScreenRoute : SampleScreenRoute {
    @IgnoredOnParcel
    override val name = "Challenge Badge"
}
