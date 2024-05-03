package com.sats.dna.sample.routes.components

import com.sats.dna.sample.routes.SampleScreenRoute
import kotlinx.serialization.Serializable

@Serializable
data object ArticleCardSampleScreenRoute : SampleScreenRoute {
    override val name = "Article Card"
}
