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
val SatsIcons.Location: ImageVector
    get() {
        if (_location != null) {
            return _location!!
        }

        _location = materialIcon(name = "Location") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(12f, 2.75f)
                curveToRelative(-3.6f, 0f, -7.25f, 2.53f, -7.25f, 6.87f)
                curveToRelative(0f, 0.98f, 0.43f, 2.2f, 1.16f, 3.54f)
                curveToRelative(0.72f, 1.33f, 1.7f, 2.7f, 2.68f, 3.93f)
                curveToRelative(0.98f, 1.24f, 1.97f, 2.33f, 2.7f, 3.12f)
                curveToRelative(0.39f, 0.4f, 1.03f, 0.4f, 1.41f, 0f)
                curveToRelative(0.74f, -0.79f, 1.73f, -1.88f, 2.71f, -3.12f)
                curveToRelative(0.99f, -1.24f, 1.96f, -2.6f, 2.68f, -3.93f)
                curveToRelative(0.73f, -1.34f, 1.16f, -2.56f, 1.16f, -3.54f)
                curveToRelative(0f, -4.34f, -3.65f, -6.87f, -7.25f, -6.87f)
                close()
                moveTo(12f, 22f)
                lineToRelative(-0.52f, 0.54f)
                lineToRelative(-0.03f, -0.02f)
                lineToRelative(-0.07f, -0.07f)
                lineToRelative(-0.26f, -0.26f)
                lineToRelative(-0.92f, -0.95f)
                curveToRelative(-0.76f, -0.81f, -1.77f, -1.94f, -2.79f, -3.21f)
                curveToRelative(-1.01f, -1.28f, -2.04f, -2.72f, -2.82f, -4.15f)
                curveToRelative(-0.77f, -1.41f, -1.34f, -2.9f, -1.34f, -4.26f)
                curveToRelative(0f, -5.38f, 4.55f, -8.37f, 8.75f, -8.37f)
                reflectiveCurveToRelative(8.75f, 3f, 8.75f, 8.37f)
                curveToRelative(0f, 1.35f, -0.57f, 2.85f, -1.34f, 4.26f)
                curveToRelative(-0.78f, 1.43f, -1.8f, 2.87f, -2.82f, 4.15f)
                curveToRelative(-1.02f, 1.27f, -2.03f, 2.4f, -2.8f, 3.2f)
                curveToRelative(-0.37f, 0.41f, -0.7f, 0.73f, -0.91f, 0.96f)
                lineToRelative(-0.26f, 0.26f)
                lineToRelative(-0.07f, 0.07f)
                lineToRelative(-0.02f, 0.01f)
                lineTo(12f, 22f)
                close()
                moveToRelative(0f, 0f)
                lineToRelative(0.52f, 0.54f)
                curveToRelative(-0.29f, 0.28f, -0.75f, 0.28f, -1.04f, 0f)
                lineTo(12f, 22f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(12f, 7.51f)
                curveToRelative(-1.28f, 0f, -2.25f, 0.98f, -2.25f, 2.1f)
                curveToRelative(0f, 1.14f, 0.97f, 2.12f, 2.25f, 2.12f)
                reflectiveCurveToRelative(2.25f, -0.98f, 2.25f, -2.11f)
                reflectiveCurveToRelative(-0.97f, -2.1f, -2.25f, -2.1f)
                close()
                moveToRelative(-3.75f, 2.1f)
                curveToRelative(0f, -2.02f, 1.71f, -3.6f, 3.75f, -3.6f)
                reflectiveCurveToRelative(3.75f, 1.58f, 3.75f, 3.6f)
                curveToRelative(0f, 2.04f, -1.71f, 3.62f, -3.75f, 3.62f)
                reflectiveCurveToRelative(-3.75f, -1.58f, -3.75f, -3.61f)
                close()
            }
        }

        return _location!!
    }

@Suppress("ObjectPropertyName")
private var _location: ImageVector? = null

@Preview
@Composable
private fun SatsIconLocationPreview() {
    Icon(SatsIcons.Location, contentDescription = null)
}
