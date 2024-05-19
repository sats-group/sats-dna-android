package com.sats.dna.sample.routes.styles

import com.sats.dna.sample.routes.SampleScreenRoute
import kotlinx.parcelize.IgnoredOnParcel
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable

@Serializable
@Parcelize
data object TypographySampleScreenRoute : SampleScreenRoute {
    @IgnoredOnParcel
    override val name = "Typography"
}
