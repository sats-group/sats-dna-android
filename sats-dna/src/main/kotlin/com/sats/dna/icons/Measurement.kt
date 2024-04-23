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
val SatsIcons.Measurement: ImageVector
    get() {
        if (_measurement != null) {
            return _measurement!!
        }

        _measurement = materialIcon(name = "Measurement") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(5.48f, 12.79f)
                curveToRelative(0.23f, -0.24f, 0.62f, -0.24f, 0.86f, 0f)
                lineToRelative(1.83f, 1.83f)
                curveToRelative(0.23f, 0.23f, 0.23f, 0.62f, 0f, 0.86f)
                curveToRelative(-0.24f, 0.23f, -0.63f, 0.23f, -0.87f, 0f)
                lineToRelative(-1.82f, -1.83f)
                curveToRelative(-0.24f, -0.24f, -0.24f, -0.62f, 0f, -0.86f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(7.91f, 10.35f)
                curveToRelative(0.24f, -0.24f, 0.63f, -0.24f, 0.87f, 0f)
                lineToRelative(1.82f, 1.83f)
                curveToRelative(0.24f, 0.24f, 0.24f, 0.62f, 0f, 0.86f)
                curveToRelative(-0.23f, 0.24f, -0.62f, 0.24f, -0.86f, 0f)
                lineToRelative(-1.83f, -1.83f)
                curveToRelative(-0.23f, -0.24f, -0.23f, -0.62f, 0f, -0.86f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(10.35f, 7.91f)
                curveToRelative(0.24f, -0.23f, 0.62f, -0.23f, 0.86f, 0f)
                lineToRelative(1.83f, 1.83f)
                curveToRelative(0.24f, 0.24f, 0.24f, 0.63f, 0f, 0.86f)
                curveToRelative(-0.24f, 0.24f, -0.62f, 0.24f, -0.86f, 0f)
                lineToRelative(-1.83f, -1.82f)
                curveToRelative(-0.24f, -0.24f, -0.24f, -0.63f, 0f, -0.87f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(12.79f, 5.48f)
                curveToRelative(0.24f, -0.24f, 0.62f, -0.24f, 0.86f, 0f)
                lineToRelative(1.83f, 1.82f)
                curveToRelative(0.23f, 0.24f, 0.23f, 0.63f, 0f, 0.87f)
                curveToRelative(-0.24f, 0.23f, -0.63f, 0.23f, -0.86f, 0f)
                lineToRelative(-1.83f, -1.83f)
                curveToRelative(-0.24f, -0.24f, -0.24f, -0.62f, 0f, -0.86f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(2.43f, 16.7f)
                curveToRelative(-0.24f, -0.24f, -0.24f, -0.63f, 0f, -0.87f)
                lineToRelative(13.4f, -13.4f)
                curveToRelative(0.24f, -0.24f, 0.63f, -0.24f, 0.87f, 0f)
                lineToRelative(4.87f, 4.87f)
                curveToRelative(0.24f, 0.24f, 0.24f, 0.63f, 0f, 0.87f)
                lineToRelative(-13.4f, 13.4f)
                curveToRelative(-0.24f, 0.24f, -0.63f, 0.24f, -0.87f, 0f)
                lineToRelative(-4.87f, -4.88f)
                close()
                moveToRelative(1.3f, -0.44f)
                lineToRelative(4f, 4.02f)
                lineTo(20.29f, 7.73f)
                lineToRelative(-4.02f, -4f)
                lineTo(3.72f, 16.25f)
                close()
            }
        }

        return _measurement!!
    }

@Suppress("ObjectPropertyName")
private var _measurement: ImageVector? = null

@Preview
@Composable
private fun SatsIconMeasurementPreview() {
    Icon(SatsIcons.Measurement, contentDescription = null)
}
