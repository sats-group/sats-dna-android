package com.sats.dna.sample.routes.icons

import com.sats.dna.sample.routes.SampleScreenRoute
import kotlinx.parcelize.IgnoredOnParcel
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable

@Serializable
@Parcelize
data object IconsSampleScreenRoute : SampleScreenRoute {
    @IgnoredOnParcel
    override val name = "Icons"
}
