package com.sats.dna.sample.routes.styles

import com.sats.dna.sample.routes.SampleScreenRoute
import kotlinx.serialization.Serializable

@Serializable
data object ColorPrimitivesSampleScreenRoute : SampleScreenRoute {
    override val name = "Color Primitives"
}
