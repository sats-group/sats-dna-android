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
val SatsIcons.Refresh: ImageVector
    get() {
        if (_refresh != null) {
            return _refresh!!
        }

        _refresh = materialIcon(name = "Refresh") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(14.4f, 5.86f)
                curveTo(12.8f, 5.4f, 11.05f, 5.51f, 9.51f, 6.2f)
                curveTo(7.98f, 6.9f, 6.74f, 8.13f, 6.04f, 9.66f)
                curveToRelative(-0.7f, 1.54f, -0.83f, 3.27f, -0.36f, 4.9f)
                curveToRelative(0.47f, 1.61f, 1.52f, 3f, 2.93f, 3.92f)
                curveToRelative(1.42f, 0.92f, 3.12f, 1.29f, 4.8f, 1.05f)
                curveToRelative(1.66f, -0.24f, 3.2f, -1.07f, 4.3f, -2.35f)
                curveToRelative(1.1f, -1.27f, 1.71f, -2.9f, 1.71f, -4.6f)
                curveToRelative(0f, -0.35f, 0.3f, -0.64f, 0.65f, -0.64f)
                curveToRelative(0.36f, 0f, 0.65f, 0.3f, 0.65f, 0.65f)
                curveToRelative(0f, 2f, -0.73f, 3.93f, -2.04f, 5.44f)
                curveToRelative(-1.3f, 1.5f, -3.12f, 2.5f, -5.1f, 2.78f)
                curveToRelative(-1.97f, 0.28f, -3.99f, -0.16f, -5.67f, -1.24f)
                curveTo(6.23f, 18.49f, 5f, 16.83f, 4.44f, 14.9f)
                curveTo(3.88f, 13f, 4.04f, 10.94f, 4.86f, 9.12f)
                curveToRelative(0.84f, -1.81f, 2.3f, -3.27f, 4.12f, -4.1f)
                curveToRelative(1.82f, -0.82f, 3.87f, -0.96f, 5.8f, -0.4f)
                curveToRelative(1.9f, 0.57f, 3.55f, 1.81f, 4.63f, 3.5f)
                curveToRelative(0.2f, 0.3f, 0.1f, 0.7f, -0.2f, 0.89f)
                curveToRelative(-0.3f, 0.2f, -0.7f, 0.1f, -0.89f, -0.2f)
                curveToRelative(-0.9f, -1.42f, -2.3f, -2.47f, -3.92f, -2.95f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(8.93f, 4.93f)
                curveToRelative(1.85f, -0.84f, 3.93f, -0.98f, 5.87f, -0.4f)
                curveToRelative(1.94f, 0.57f, 3.61f, 1.82f, 4.7f, 3.53f)
                curveToRelative(0.22f, 0.35f, 0.12f, 0.82f, -0.23f, 1.04f)
                curveToRelative(-0.35f, 0.23f, -0.82f, 0.12f, -1.04f, -0.23f)
                curveToRelative(-0.9f, -1.4f, -2.26f, -2.43f, -3.86f, -2.9f)
                curveToRelative(-1.59f, -0.47f, -3.3f, -0.36f, -4.81f, 0.33f)
                curveTo(8.04f, 7f, 6.83f, 8.2f, 6.14f, 9.7f)
                curveToRelative(-0.7f, 1.52f, -0.82f, 3.23f, -0.36f, 4.82f)
                curveToRelative(0.47f, 1.6f, 1.5f, 2.97f, 2.9f, 3.87f)
                curveToRelative(1.39f, 0.9f, 3.06f, 1.27f, 4.7f, 1.03f)
                curveToRelative(1.65f, -0.23f, 3.16f, -1.05f, 4.25f, -2.3f)
                curveToRelative(1.09f, -1.26f, 1.68f, -2.87f, 1.69f, -4.53f)
                curveToRelative(0f, -0.42f, 0.33f, -0.75f, 0.75f, -0.75f)
                reflectiveCurveToRelative(0.75f, 0.33f, 0.75f, 0.75f)
                curveToRelative(0f, 2.02f, -0.73f, 3.98f, -2.05f, 5.5f)
                curveToRelative(-1.33f, 1.54f, -3.16f, 2.54f, -5.17f, 2.82f)
                curveToRelative(-2f, 0.3f, -4.04f, -0.15f, -5.74f, -1.25f)
                curveToRelative(-1.7f, -1.1f, -2.96f, -2.77f, -3.52f, -4.71f)
                curveTo(3.77f, 13f, 3.92f, 10.92f, 4.77f, 9.08f)
                curveTo(5.6f, 7.24f, 7.09f, 5.77f, 8.93f, 4.93f)
                close()
                moveToRelative(5.81f, -0.2f)
                curveToRelative(-1.9f, -0.56f, -3.92f, -0.42f, -5.72f, 0.4f)
                curveToRelative(-1.8f, 0.81f, -3.23f, 2.25f, -4.06f, 4.04f)
                curveToRelative(-0.82f, 1.8f, -0.97f, 3.82f, -0.42f, 5.72f)
                curveToRelative(0.56f, 1.89f, 1.77f, 3.52f, 3.43f, 4.59f)
                curveToRelative(1.66f, 1.07f, 3.65f, 1.5f, 5.6f, 1.22f)
                curveToRelative(1.95f, -0.28f, 3.74f, -1.25f, 5.03f, -2.74f)
                curveToRelative(1.3f, -1.5f, 2f, -3.4f, 2f, -5.37f)
                curveToRelative(0f, -0.3f, -0.23f, -0.54f, -0.53f, -0.54f)
                curveToRelative(-0.3f, 0f, -0.54f, 0.24f, -0.54f, 0.54f)
                curveToRelative(0f, 1.71f, -0.62f, 3.37f, -1.74f, 4.66f)
                curveToRelative(-1.12f, 1.3f, -2.67f, 2.14f, -4.37f, 2.39f)
                curveToRelative(-1.7f, 0.24f, -3.42f, -0.14f, -4.86f, -1.07f)
                curveToRelative(-1.44f, -0.93f, -2.5f, -2.34f, -2.98f, -3.99f)
                curveToRelative(-0.48f, -1.64f, -0.35f, -3.4f, 0.36f, -4.96f)
                curveToRelative(0.72f, -1.56f, 1.97f, -2.8f, 3.53f, -3.51f)
                curveToRelative(1.56f, -0.71f, 3.32f, -0.83f, 4.96f, -0.35f)
                curveToRelative(1.65f, 0.49f, 3.06f, 1.55f, 3.98f, 3f)
                curveToRelative(0.16f, 0.25f, 0.5f, 0.32f, 0.75f, 0.16f)
                reflectiveCurveToRelative(0.32f, -0.5f, 0.16f, -0.74f)
                curveToRelative(-1.06f, -1.67f, -2.69f, -2.89f, -4.58f, -3.45f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(18.9f, 3.1f)
                curveToRelative(0.35f, 0f, 0.64f, 0.3f, 0.64f, 0.65f)
                verticalLineToRelative(4.72f)
                curveToRelative(0f, 0.35f, -0.3f, 0.64f, -0.65f, 0.64f)
                horizontalLineToRelative(-4.71f)
                curveToRelative(-0.36f, 0f, -0.65f, -0.29f, -0.65f, -0.64f)
                curveToRelative(0f, -0.36f, 0.3f, -0.65f, 0.65f, -0.65f)
                horizontalLineToRelative(4.07f)
                verticalLineTo(3.75f)
                curveToRelative(0f, -0.35f, 0.29f, -0.64f, 0.64f, -0.64f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(18.14f, 3.75f)
                curveToRelative(0f, -0.41f, 0.33f, -0.75f, 0.75f, -0.75f)
                reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(4.72f)
                curveToRelative(0f, 0.41f, -0.33f, 0.75f, -0.75f, 0.75f)
                horizontalLineToRelative(-4.71f)
                curveToRelative(-0.42f, 0f, -0.76f, -0.34f, -0.76f, -0.75f)
                curveToRelative(0f, -0.42f, 0.34f, -0.76f, 0.76f, -0.76f)
                horizontalLineToRelative(3.96f)
                verticalLineTo(3.75f)
                close()
                moveToRelative(0.75f, -0.53f)
                curveToRelative(-0.3f, 0f, -0.54f, 0.24f, -0.54f, 0.53f)
                verticalLineToRelative(4.07f)
                curveToRelative(0f, 0.06f, -0.05f, 0.1f, -0.1f, 0.1f)
                horizontalLineToRelative(-4.07f)
                curveToRelative(-0.3f, 0f, -0.54f, 0.25f, -0.54f, 0.55f)
                curveToRelative(0f, 0.3f, 0.24f, 0.54f, 0.54f, 0.54f)
                horizontalLineToRelative(4.71f)
                curveToRelative(0.3f, 0f, 0.54f, -0.25f, 0.54f, -0.54f)
                verticalLineTo(3.75f)
                curveToRelative(0f, -0.3f, -0.24f, -0.53f, -0.54f, -0.53f)
                close()
            }
        }

        return _refresh!!
    }

@Suppress("ObjectPropertyName")
private var _refresh: ImageVector? = null

@Preview
@Composable
private fun SatsIconRefreshPreview() {
    Icon(SatsIcons.Refresh, contentDescription = null)
}
