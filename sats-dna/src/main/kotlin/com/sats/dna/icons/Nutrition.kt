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
val SatsIcons.Nutrition: ImageVector
    get() {
        if (_nutrition != null) {
            return _nutrition!!
        }

        _nutrition = materialIcon(name = "Nutrition") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(11.9f, 13.14f)
                curveToRelative(0.99f, -0.93f, 2.48f, -1.4f, 4.02f, -1f)
                lineToRelative(0.46f, 0.12f)
                lineToRelative(0.45f, -0.12f)
                curveToRelative(1.54f, -0.4f, 3.03f, 0.07f, 4.01f, 1f)
                curveToRelative(0.99f, 0.94f, 1.47f, 2.36f, 0.94f, 3.82f)
                lineToRelative(-1.25f, 3.4f)
                lineToRelative(-0.01f, 0.03f)
                curveToRelative(-0.26f, 0.61f, -0.74f, 1.1f, -1.34f, 1.38f)
                curveToRelative(-0.6f, 0.27f, -1.28f, 0.3f, -1.91f, 0.1f)
                lineToRelative(-0.9f, -0.27f)
                lineToRelative(-0.89f, 0.27f)
                curveToRelative(-0.63f, 0.2f, -1.3f, 0.16f, -1.9f, -0.1f)
                curveToRelative(-0.61f, -0.28f, -1.09f, -0.77f, -1.35f, -1.38f)
                lineToRelative(-0.01f, -0.03f)
                lineToRelative(-1.25f, -3.4f)
                curveToRelative(-0.53f, -1.46f, -0.05f, -2.89f, 0.93f, -3.82f)
                close()
                moveToRelative(0.24f, 3.39f)
                lineToRelative(1.25f, 3.39f)
                curveToRelative(0.13f, 0.31f, 0.38f, 0.56f, 0.7f, 0.7f)
                curveToRelative(0.31f, 0.15f, 0.68f, 0.17f, 1f, 0.06f)
                horizontalLineToRelative(0.02f)
                lineToRelative(1.08f, -0.33f)
                curveToRelative(0.12f, -0.04f, 0.25f, -0.04f, 0.36f, 0f)
                lineToRelative(1.1f, 0.33f)
                curveToRelative(0.33f, 0.11f, 0.7f, 0.1f, 1.01f, -0.05f)
                curveToRelative(0.31f, -0.14f, 0.56f, -0.4f, 0.7f, -0.71f)
                lineToRelative(1.25f, -3.39f)
                curveToRelative(0.34f, -0.93f, 0.05f, -1.84f, -0.63f, -2.48f)
                curveToRelative(-0.67f, -0.65f, -1.72f, -0.99f, -2.84f, -0.7f)
                lineToRelative(-0.6f, 0.16f)
                curveToRelative(-0.11f, 0.03f, -0.22f, 0.03f, -0.32f, 0f)
                lineToRelative(-0.61f, -0.16f)
                curveToRelative(-1.12f, -0.29f, -2.17f, 0.05f, -2.84f, 0.7f)
                curveToRelative(-0.68f, 0.63f, -0.97f, 1.55f, -0.63f, 2.48f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(20.75f, 7f)
                curveToRelative(0f, 1f, -0.4f, 1.95f, -1.1f, 2.65f)
                curveToRelative(-0.7f, 0.7f, -1.66f, 1.1f, -2.65f, 1.1f)
                curveToRelative(0f, -1f, 0.4f, -1.95f, 1.1f, -2.65f)
                curveToRelative(0.7f, -0.7f, 1.65f, -1.1f, 2.65f, -1.1f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(2f, 2.62f)
                curveTo(2f, 2.28f, 2.28f, 2f, 2.62f, 2f)
                horizontalLineToRelative(16.25f)
                curveToRelative(0.35f, 0f, 0.63f, 0.28f, 0.63f, 0.62f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 0.35f, -0.28f, 0.63f, -0.63f, 0.63f)
                curveToRelative(-0.34f, 0f, -0.62f, -0.28f, -0.62f, -0.63f)
                verticalLineTo(3.25f)
                horizontalLineToRelative(-15f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(6.87f)
                curveToRelative(0.35f, 0f, 0.63f, 0.27f, 0.63f, 0.62f)
                curveToRelative(0f, 0.34f, -0.28f, 0.62f, -0.63f, 0.62f)
                horizontalLineToRelative(-7.5f)
                curveTo(2.28f, 22f, 2f, 21.71f, 2f, 21.37f)
                verticalLineTo(2.62f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(5.75f, 7.62f)
                curveTo(5.75f, 7.28f, 6.03f, 7f, 6.37f, 7f)
                horizontalLineToRelative(5f)
                curveTo(11.72f, 7f, 12f, 7.28f, 12f, 7.62f)
                curveToRelative(0f, 0.35f, -0.28f, 0.63f, -0.63f, 0.63f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.34f, 0f, -0.62f, -0.28f, -0.62f, -0.63f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(5.75f, 15.12f)
                curveToRelative(0f, -0.35f, 0.28f, -0.63f, 0.62f, -0.63f)
                horizontalLineToRelative(1.25f)
                curveToRelative(0.35f, 0f, 0.63f, 0.28f, 0.63f, 0.63f)
                curveToRelative(0f, 0.34f, -0.28f, 0.62f, -0.63f, 0.62f)
                horizontalLineTo(6.37f)
                curveToRelative(-0.34f, 0f, -0.62f, -0.28f, -0.62f, -0.62f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(13.25f, 7.62f)
                curveToRelative(0f, -0.34f, 0.28f, -0.62f, 0.62f, -0.62f)
                horizontalLineToRelative(1.25f)
                curveToRelative(0.35f, 0f, 0.63f, 0.28f, 0.63f, 0.62f)
                curveToRelative(0f, 0.35f, -0.28f, 0.63f, -0.63f, 0.63f)
                horizontalLineToRelative(-1.25f)
                curveToRelative(-0.34f, 0f, -0.62f, -0.28f, -0.62f, -0.63f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(5.75f, 11.37f)
                curveToRelative(0f, -0.35f, 0.28f, -0.63f, 0.62f, -0.63f)
                horizontalLineToRelative(3.75f)
                curveToRelative(0.35f, 0f, 0.63f, 0.28f, 0.63f, 0.63f)
                curveToRelative(0f, 0.34f, -0.28f, 0.62f, -0.63f, 0.62f)
                horizontalLineTo(6.37f)
                curveToRelative(-0.34f, 0f, -0.62f, -0.28f, -0.62f, -0.62f)
                close()
            }
        }

        return _nutrition!!
    }

@Suppress("ObjectPropertyName")
private var _nutrition: ImageVector? = null

@Preview
@Composable
private fun SatsIconNutritionPreview() {
    Icon(SatsIcons.Nutrition, contentDescription = null)
}
