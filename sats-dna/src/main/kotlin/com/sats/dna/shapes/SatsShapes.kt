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
    object RoundedCorners {
        val extraSmall = RoundedCornerShape(4.dp)
        val small = RoundedCornerShape(8.dp)
        val medium = RoundedCornerShape(12.dp)
        val large = RoundedCornerShape(24.dp)
        val circle = CircleShape
    }
}

@Preview
@Composable
private fun Preview() {
    val allShapes = mapOf(
        "SatsShapes.RoundedCorners.extraSmall" to SatsShapes.RoundedCorners.extraSmall,
        "SatsShapes.RoundedCorners.small" to SatsShapes.RoundedCorners.small,
        "SatsShapes.RoundedCorners.medium" to SatsShapes.RoundedCorners.medium,
        "SatsShapes.RoundedCorners.large" to SatsShapes.RoundedCorners.large,
        "SatsShapes.RoundedCorners.circle" to SatsShapes.RoundedCorners.circle,
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
