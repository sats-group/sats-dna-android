package com.sats.dna.icons

import androidx.compose.material.Icon
import androidx.compose.material.icons.materialIcon
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
                moveTo(5.89f, 2.85f)
                curveTo(7.69f, 1.65f, 9.82f, 1f, 12f, 1f)
                curveToRelative(2.91f, 0f, 5.7f, 1.17f, 7.77f, 3.23f)
                curveTo(21.83f, 6.3f, 22.99f, 9.1f, 23f, 12f)
                curveToRelative(0f, 2.18f, -0.65f, 4.3f, -1.85f, 6.11f)
                curveToRelative(-1.21f, 1.81f, -2.93f, 3.22f, -4.94f, 4.05f)
                curveToRelative(-2.01f, 0.84f, -4.22f, 1.05f, -6.36f, 0.63f)
                curveToRelative(-2.13f, -0.43f, -4.09f, -1.47f, -5.63f, -3.01f)
                curveToRelative(-1.54f, -1.54f, -2.58f, -3.5f, -3f, -5.63f)
                curveTo(0.78f, 12f, 1f, 9.8f, 1.83f, 7.79f)
                curveToRelative(0.83f, -2.01f, 2.24f, -3.73f, 4.05f, -4.94f)
                close()
                moveToRelative(12.08f, 4.77f)
                curveToRelative(0.33f, 0.33f, 0.33f, 0.87f, 0f, 1.2f)
                lineToRelative(-7.76f, 7.81f)
                lineToRelative(-4.18f, -4.2f)
                curveToRelative(-0.33f, -0.34f, -0.33f, -0.88f, 0f, -1.2f)
                curveToRelative(0.33f, -0.34f, 0.86f, -0.34f, 1.2f, 0f)
                lineToRelative(2.98f, 3f)
                lineToRelative(6.57f, -6.61f)
                curveToRelative(0.33f, -0.34f, 0.86f, -0.34f, 1.2f, 0f)
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
