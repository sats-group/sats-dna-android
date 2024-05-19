package com.sats.dna.sample.routes.components

import com.sats.dna.sample.routes.SampleScreenRoute
import kotlinx.parcelize.IgnoredOnParcel
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable

@Serializable
@Parcelize
data object TabRowSampleScreenRoute : SampleScreenRoute {
    @IgnoredOnParcel
    override val name = "Tab Row"
}
