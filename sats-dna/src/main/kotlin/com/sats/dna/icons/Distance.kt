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
val SatsIcons.Distance: ImageVector
    get() {
        if (_distance != null) {
            return _distance!!
        }

        _distance = materialIcon(name = "Distance") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(6.27f, 13.61f)
                curveToRelative(0.33f, 0f, 0.6f, 0.27f, 0.6f, 0.6f)
                curveToRelative(0f, 1.12f, 0.45f, 2.2f, 1.26f, 2.99f)
                curveToRelative(0.8f, 0.8f, 1.9f, 1.24f, 3.05f, 1.24f)
                curveToRelative(0.33f, 0f, 0.6f, 0.27f, 0.6f, 0.6f)
                curveToRelative(0f, 0.33f, -0.27f, 0.6f, -0.6f, 0.6f)
                curveToRelative(-1.46f, 0f, -2.86f, -0.57f, -3.89f, -1.58f)
                curveToRelative(-1.03f, -1.02f, -1.62f, -2.4f, -1.62f, -3.85f)
                curveToRelative(0f, -0.33f, 0.27f, -0.6f, 0.6f, -0.6f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(6.27f, 4.35f)
                curveToRelative(-0.7f, 0f, -1.39f, 0.28f, -1.9f, 0.77f)
                curveToRelative(-0.5f, 0.5f, -0.77f, 1.16f, -0.77f, 1.85f)
                curveToRelative(0f, 0.28f, 0.14f, 0.7f, 0.43f, 1.2f)
                reflectiveCurveTo(4.7f, 9.2f, 5.1f, 9.68f)
                curveToRelative(0.4f, 0.47f, 0.8f, 0.9f, 1.09f, 1.2f)
                lineToRelative(0.08f, 0.09f)
                lineToRelative(0.09f, -0.09f)
                curveToRelative(0.3f, -0.3f, 0.7f, -0.73f, 1.09f, -1.2f)
                curveToRelative(0.4f, -0.48f, 0.78f, -1f, 1.06f, -1.5f)
                curveToRelative(0.3f, -0.5f, 0.44f, -0.92f, 0.44f, -1.2f)
                curveToRelative(0f, -0.7f, -0.28f, -1.36f, -0.78f, -1.85f)
                curveToRelative(-0.5f, -0.5f, -1.19f, -0.77f, -1.9f, -0.77f)
                close()
                moveToRelative(0f, 7.45f)
                lineToRelative(-0.4f, 0.44f)
                horizontalLineTo(5.85f)
                verticalLineToRelative(-0.01f)
                lineTo(5.81f, 12.2f)
                lineToRelative(-0.1f, -0.1f)
                lineToRelative(-0.39f, -0.39f)
                curveToRelative(-0.31f, -0.32f, -0.73f, -0.77f, -1.16f, -1.28f)
                curveTo(3.75f, 9.93f, 3.32f, 9.35f, 3f, 8.77f)
                curveTo(2.67f, 8.21f, 2.4f, 7.57f, 2.4f, 6.97f)
                curveToRelative(0f, -1.02f, 0.41f, -1.99f, 1.14f, -2.7f)
                curveToRelative(0.72f, -0.72f, 1.7f, -1.12f, 2.73f, -1.12f)
                reflectiveCurveToRelative(2.01f, 0.4f, 2.74f, 1.12f)
                curveToRelative(0.73f, 0.71f, 1.14f, 1.68f, 1.14f, 2.7f)
                curveToRelative(0f, 0.6f, -0.27f, 1.24f, -0.6f, 1.8f)
                curveToRelative(-0.33f, 0.58f, -0.76f, 1.16f, -1.18f, 1.66f)
                curveToRelative(-0.42f, 0.51f, -0.84f, 0.96f, -1.16f, 1.28f)
                lineTo(6.83f, 12.1f)
                lineToRelative(-0.1f, 0.1f)
                lineToRelative(-0.04f, 0.04f)
                lineToRelative(-0.42f, -0.43f)
                close()
                moveToRelative(0f, 0f)
                lineToRelative(0.41f, 0.44f)
                curveToRelative(-0.23f, 0.21f, -0.59f, 0.21f, -0.82f, 0f)
                lineToRelative(0.41f, -0.44f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(16.1f, 8.52f)
                curveToRelative(-1.12f, 0f, -2.18f, 0.44f, -2.95f, 1.2f)
                curveToRelative(-0.78f, 0.77f, -1.22f, 1.8f, -1.22f, 2.88f)
                curveToRelative(0f, 0.48f, 0.23f, 1.15f, 0.68f, 1.96f)
                curveToRelative(0.43f, 0.8f, 1.02f, 1.63f, 1.62f, 2.4f)
                curveToRelative(0.6f, 0.78f, 1.2f, 1.47f, 1.65f, 1.97f)
                lineToRelative(0.21f, 0.23f)
                lineToRelative(0.21f, -0.23f)
                curveToRelative(0.45f, -0.5f, 1.05f, -1.2f, 1.65f, -1.96f)
                curveToRelative(0.6f, -0.78f, 1.2f, -1.61f, 1.62f, -2.4f)
                curveToRelative(0.45f, -0.82f, 0.68f, -1.5f, 0.68f, -1.97f)
                curveToRelative(0f, -1.07f, -0.44f, -2.11f, -1.21f, -2.88f)
                curveToRelative(-0.78f, -0.76f, -1.84f, -1.2f, -2.95f, -1.2f)
                close()
                moveToRelative(0f, 11.73f)
                lineToRelative(-0.54f, 0.53f)
                lineToRelative(-0.02f, -0.02f)
                lineToRelative(-0.04f, -0.04f)
                lineToRelative(-0.16f, -0.17f)
                lineToRelative(-0.57f, -0.62f)
                curveToRelative(-0.47f, -0.51f, -1.1f, -1.23f, -1.73f, -2.04f)
                curveToRelative(-0.62f, -0.8f, -1.26f, -1.72f, -1.75f, -2.6f)
                curveToRelative(-0.47f, -0.87f, -0.86f, -1.82f, -0.86f, -2.69f)
                curveToRelative(0f, -1.48f, 0.6f, -2.9f, 1.66f, -3.95f)
                curveToRelative(1.07f, -1.04f, 2.5f, -1.63f, 4f, -1.63f)
                reflectiveCurveToRelative(2.94f, 0.59f, 4f, 1.63f)
                curveToRelative(1.06f, 1.05f, 1.66f, 2.47f, 1.66f, 3.95f)
                curveToRelative(0f, 0.87f, -0.38f, 1.82f, -0.86f, 2.68f)
                curveToRelative(-0.49f, 0.9f, -1.13f, 1.8f, -1.75f, 2.6f)
                curveToRelative(-0.63f, 0.82f, -1.26f, 1.54f, -1.73f, 2.05f)
                lineToRelative(-0.56f, 0.62f)
                lineToRelative(-0.17f, 0.17f)
                lineToRelative(-0.04f, 0.04f)
                lineToRelative(-0.01f, 0.01f)
                lineToRelative(-0.54f, -0.52f)
                close()
                moveToRelative(0f, 0f)
                lineToRelative(0.53f, 0.53f)
                curveTo(16.48f, 20.92f, 16.29f, 21f, 16.09f, 21f)
                reflectiveCurveToRelative(-0.4f, -0.08f, -0.53f, -0.22f)
                lineToRelative(0.53f, -0.53f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(6.27f, 7.77f)
                curveToRelative(0.45f, 0f, 0.82f, -0.36f, 0.82f, -0.8f)
                curveToRelative(0f, -0.45f, -0.37f, -0.8f, -0.82f, -0.8f)
                curveToRelative(-0.45f, 0f, -0.82f, 0.35f, -0.82f, 0.8f)
                curveToRelative(0f, 0.44f, 0.37f, 0.8f, 0.82f, 0.8f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(16.1f, 11.6f)
                curveToRelative(-0.6f, 0f, -1.05f, 0.46f, -1.05f, 1f)
                curveToRelative(0f, 0.55f, 0.46f, 1.01f, 1.04f, 1.01f)
                curveToRelative(0.58f, 0f, 1.04f, -0.46f, 1.04f, -1f)
                curveToRelative(0f, -0.55f, -0.46f, -1.02f, -1.04f, -1.02f)
                close()
                moveToRelative(-2.25f, 1f)
                curveToRelative(0f, -1.23f, 1.02f, -2.2f, 2.24f, -2.2f)
                curveToRelative(1.23f, 0f, 2.24f, 0.97f, 2.24f, 2.2f)
                curveToRelative(0f, 1.23f, -1.01f, 2.21f, -2.24f, 2.21f)
                curveToRelative(-1.22f, 0f, -2.24f, -0.98f, -2.24f, -2.2f)
                close()
            }
        }

        return _distance!!
    }

@Suppress("ObjectPropertyName")
private var _distance: ImageVector? = null

@Preview
@Composable
private fun SatsIconDistancePreview() {
    Icon(SatsIcons.Distance, contentDescription = null)
}
