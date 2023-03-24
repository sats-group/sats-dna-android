package com.sats.dna.shapes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sats.dna.theme.SatsTheme

object SatsShapes {
    val roundedCorners = RoundedCorners

    object RoundedCorners {
        /** Rounded corners with 4 dp radius. */
        val extraSmall = RoundedCornerShape(4.dp)

        /** Rounded corners with 8 dp radius. */
        val small = RoundedCornerShape(8.dp)

        /** Rounded corners with 12 dp radius. */
        val medium = RoundedCornerShape(12.dp)

        /** Rounded corners with 24 dp radius. */
        val large = RoundedCornerShape(24.dp)

        /** Circular shape */
        val circle = CircleShape
    }
}

@Preview
@Composable
private fun Preview() {
    val allShapes = mapOf(
        "SatsShapes.roundedCorners.extraSmall" to SatsShapes.roundedCorners.extraSmall,
        "SatsShapes.roundedCorners.small" to SatsShapes.roundedCorners.small,
        "SatsShapes.roundedCorners.medium" to SatsShapes.roundedCorners.medium,
        "SatsShapes.roundedCorners.large" to SatsShapes.roundedCorners.large,
        "SatsShapes.roundedCorners.circle" to SatsShapes.roundedCorners.circle,
    )
    SatsTheme {
        Surface {
            Column(
                Modifier
                    .verticalScroll(rememberScrollState())
                    .padding(SatsTheme.spacing.m),
                verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
            ) {
                allShapes.forEach { (name, shape) ->
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .aspectRatio(16f / 9)
                            .clip(shape)
                            .background(SatsTheme.colors.onSurface.primary),
                        contentAlignment = Alignment.Center,
                    ) {
                        Text(name, color = SatsTheme.colors.surface.primary)
                    }
                }
            }
        }
    }
}
