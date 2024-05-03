package com.sats.dna.sample.routes.components

import com.sats.dna.sample.routes.SampleScreenRoute
import kotlinx.serialization.Serializable

@Serializable
data object ProteinBarSampleScreenRoute : SampleScreenRoute {
    override val name = "Protein Bar"
}
