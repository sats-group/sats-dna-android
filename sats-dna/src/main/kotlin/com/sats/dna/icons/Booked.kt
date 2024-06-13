package com.sats.dna.icons

import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import com.sats.dna.SatsIcons

@Suppress("UnusedReceiverParameter") // for convenient access
val SatsIcons.Booked: ImageVector
    get() {
        if (_booked != null) {
            return _booked!!
        }

        _booked = materialIcon(name = "Booked") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(6.44f, 3.69f)
                curveTo(8.1f, 2.59f, 10.02f, 2f, 12f, 2f)
                curveToRelative(2.65f, 0f, 5.19f, 1.06f, 7.06f, 2.94f)
                curveTo(20.94f, 6.8f, 22f, 9.35f, 22f, 12f)
                curveToRelative(0f, 1.98f, -0.59f, 3.91f, -1.69f, 5.56f)
                curveToRelative(-1.1f, 1.64f, -2.66f, 2.92f, -4.48f, 3.68f)
                curveTo(14f, 22f, 11.99f, 22.19f, 10.05f, 21.8f)
                curveToRelative(-1.94f, -0.39f, -3.72f, -1.34f, -5.12f, -2.74f)
                curveToRelative(-1.4f, -1.4f, -2.35f, -3.18f, -2.74f, -5.12f)
                curveTo(1.81f, 12.01f, 2f, 10f, 2.76f, 8.17f)
                curveTo(3.52f, 6.35f, 4.8f, 4.78f, 6.44f, 3.7f)
                close()
                moveToRelative(10.99f, 4.33f)
                curveToRelative(0.3f, 0.3f, 0.3f, 0.79f, 0f, 1.09f)
                lineToRelative(-7.06f, 7.1f)
                lineToRelative(-3.8f, -3.82f)
                curveToRelative(-0.3f, -0.3f, -0.3f, -0.8f, 0f, -1.1f)
                curveToRelative(0.3f, -0.3f, 0.79f, -0.3f, 1.09f, 0f)
                lineToRelative(2.71f, 2.74f)
                lineToRelative(5.97f, -6.01f)
                curveToRelative(0.3f, -0.3f, 0.79f, -0.3f, 1.09f, 0f)
                close()
            }
        }

        return _booked!!
    }

@Suppress("ObjectPropertyName")
private var _booked: ImageVector? = null

@Preview
@Composable
private fun SatsIconBookedPreview() {
    Icon(SatsIcons.Booked, contentDescription = null)
}
