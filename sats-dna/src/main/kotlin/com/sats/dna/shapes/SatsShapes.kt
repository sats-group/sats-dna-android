package com.sats.dna.shapes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.dp
import com.sats.dna.theme.SatsTheme

object SatsShapes {
    /** Rectangular shape */
    val rectangle = RectangleShape

    val roundedCorners = RoundedCorners

    val cornerRadius = CornerRadius

    /** Circular shape */
    val circle = CircleShape

    object RoundedCorners {
        /** Rounded corners with 4 dp radius. */
        val extraSmall = RoundedCornerShape(CornerRadius.extraSmall)

        /** Rounded corners with 8 dp radius. */
        val small = RoundedCornerShape(CornerRadius.small)

        /** Rounded corners with 12 dp radius. */
        val medium = RoundedCornerShape(CornerRadius.medium)

        /** Rounded corners with 24 dp radius. */
        val large = RoundedCornerShape(CornerRadius.large)
    }

    object CornerRadius {
        /** Rounded corners with 4 dp radius. */
        val extraSmall = 4.dp

        /** Rounded corners with 8 dp radius. */
        val small = 8.dp

        /** Rounded corners with 12 dp radius. */
        val medium = 12.dp

        /** Rounded corners with 24 dp radius. */
        val large = 24.dp
    }
}

@Preview
@Composable
private fun Preview(@PreviewParameter(SatsShapePreviewProvider::class) shape: Shape) {
    SatsTheme {
        Surface {
            Box(
                Modifier
                    .size(256.dp)
                    .padding(SatsTheme.spacing.m)
                    .clip(shape)
                    .background(SatsTheme.colors.primary.default),
            )
        }
    }
}

private class SatsShapePreviewProvider : PreviewParameterProvider<Shape> {
    override val values = sequenceOf(
        SatsShapes.rectangle,
        SatsShapes.roundedCorners.extraSmall,
        SatsShapes.roundedCorners.small,
        SatsShapes.roundedCorners.medium,
        SatsShapes.roundedCorners.large,
        SatsShapes.circle,
    )
}
