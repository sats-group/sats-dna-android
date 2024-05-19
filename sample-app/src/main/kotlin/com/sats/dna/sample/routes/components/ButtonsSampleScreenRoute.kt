package com.sats.dna.sample.routes.components

import com.sats.dna.sample.routes.SampleScreenRoute
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable

@Serializable
@Parcelize
data object ButtonsSampleScreenRoute : SampleScreenRoute {
    override val name: String = "Buttons"
}
