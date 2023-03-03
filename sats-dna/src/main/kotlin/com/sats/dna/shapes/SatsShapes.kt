package com.sats.dna.shapes

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.dp

object SatsShapes {
    val roundedCorners = object {
        val extraSmall = RoundedCornerShape(4.dp)
        val small = RoundedCornerShape(8.dp)
        val medium = RoundedCornerShape(12.dp)
        val large = RoundedCornerShape(24.dp)
        val circle = CircleShape
    }
}
