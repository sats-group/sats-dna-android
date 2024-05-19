package com.sats.dna.sample.routes.components

import com.sats.dna.sample.routes.SampleScreenRoute
import kotlinx.parcelize.IgnoredOnParcel
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable

@Serializable
@Parcelize
data object BrandLogoSampleScreenRoute : SampleScreenRoute {
    @IgnoredOnParcel
    override val name = "Brand Logo"
}
