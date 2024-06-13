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
val SatsIcons.Save: ImageVector
    get() {
        if (_save != null) {
            return _save!!
        }

        _save = materialIcon(name = "Save") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(4.8f, 3.45f)
                curveToRelative(-0.36f, 0f, -0.7f, 0.14f, -0.95f, 0.4f)
                curveToRelative(-0.26f, 0.25f, -0.4f, 0.6f, -0.4f, 0.95f)
                verticalLineToRelative(14.4f)
                curveToRelative(0f, 0.36f, 0.14f, 0.7f, 0.4f, 0.95f)
                curveToRelative(0.25f, 0.26f, 0.6f, 0.4f, 0.95f, 0.4f)
                horizontalLineToRelative(14.4f)
                curveToRelative(0.36f, 0f, 0.7f, -0.14f, 0.96f, -0.4f)
                curveToRelative(0.25f, -0.25f, 0.4f, -0.6f, 0.4f, -0.95f)
                verticalLineTo(7.99f)
                lineTo(16f, 3.45f)
                horizontalLineTo(4.81f)
                close()
                moveTo(3.21f, 3.21f)
                curveToRelative(0.42f, -0.42f, 1f, -0.66f, 1.6f, -0.66f)
                horizontalLineToRelative(11.4f)
                curveToRelative(0.11f, 0f, 0.22f, 0.05f, 0.3f, 0.13f)
                lineToRelative(4.8f, 4.8f)
                curveToRelative(0.1f, 0.09f, 0.14f, 0.2f, 0.14f, 0.32f)
                verticalLineToRelative(11.4f)
                curveToRelative(0f, 0.6f, -0.24f, 1.17f, -0.66f, 1.6f)
                curveToRelative(-0.42f, 0.41f, -1f, 0.65f, -1.59f, 0.65f)
                horizontalLineTo(4.8f)
                curveToRelative(-0.6f, 0f, -1.17f, -0.24f, -1.59f, -0.66f)
                curveToRelative(-0.42f, -0.42f, -0.66f, -1f, -0.66f, -1.59f)
                verticalLineTo(4.8f)
                curveToRelative(0f, -0.6f, 0.24f, -1.17f, 0.66f, -1.6f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(3.1f, 3.1f)
                curveToRelative(0.45f, -0.45f, 1.06f, -0.7f, 1.7f, -0.7f)
                horizontalLineToRelative(11.4f)
                curveToRelative(0.16f, 0f, 0.31f, 0.06f, 0.42f, 0.18f)
                lineToRelative(-0.1f, 0.1f)
                lineToRelative(0.1f, -0.1f)
                lineToRelative(4.8f, 4.8f)
                curveToRelative(0.12f, 0.1f, 0.18f, 0.26f, 0.18f, 0.42f)
                verticalLineToRelative(11.4f)
                curveToRelative(0f, 0.64f, -0.25f, 1.25f, -0.7f, 1.7f)
                curveToRelative(-0.45f, 0.45f, -1.06f, 0.7f, -1.7f, 0.7f)
                horizontalLineTo(4.8f)
                curveToRelative(-0.64f, 0f, -1.25f, -0.25f, -1.7f, -0.7f)
                curveToRelative(-0.45f, -0.45f, -0.7f, -1.06f, -0.7f, -1.7f)
                verticalLineTo(4.8f)
                curveToRelative(0f, -0.64f, 0.25f, -1.25f, 0.7f, -1.7f)
                close()
                moveToRelative(1.7f, -0.4f)
                curveToRelative(-0.56f, 0f, -1.1f, 0.22f, -1.48f, 0.61f)
                curveTo(2.92f, 3.71f, 2.7f, 4.24f, 2.7f, 4.8f)
                verticalLineToRelative(14.4f)
                curveToRelative(0f, 0.56f, 0.22f, 1.1f, 0.62f, 1.48f)
                curveToRelative(0.39f, 0.4f, 0.92f, 0.62f, 1.48f, 0.62f)
                horizontalLineToRelative(14.4f)
                curveToRelative(0.56f, 0f, 1.1f, -0.22f, 1.49f, -0.62f)
                curveToRelative(0.39f, -0.39f, 0.61f, -0.92f, 0.61f, -1.48f)
                verticalLineTo(7.8f)
                curveToRelative(0f, -0.08f, -0.03f, -0.16f, -0.09f, -0.21f)
                lineToRelative(-4.8f, -4.8f)
                curveTo(16.36f, 2.73f, 16.28f, 2.7f, 16.2f, 2.7f)
                horizontalLineTo(4.8f)
                close()
                moveToRelative(0f, 0.9f)
                curveToRelative(-0.32f, 0f, -0.62f, 0.13f, -0.85f, 0.35f)
                curveTo(3.73f, 4.18f, 3.6f, 4.48f, 3.6f, 4.8f)
                verticalLineToRelative(14.4f)
                curveToRelative(0f, 0.32f, 0.13f, 0.62f, 0.35f, 0.85f)
                curveToRelative(0.23f, 0.22f, 0.53f, 0.35f, 0.85f, 0.35f)
                horizontalLineToRelative(14.4f)
                curveToRelative(0.32f, 0f, 0.62f, -0.13f, 0.85f, -0.35f)
                curveToRelative(0.22f, -0.23f, 0.35f, -0.53f, 0.35f, -0.85f)
                verticalLineTo(8.05f)
                lineTo(15.95f, 3.6f)
                horizontalLineTo(4.8f)
                close()
                moveTo(3.74f, 3.74f)
                curveTo(4.02f, 3.46f, 4.4f, 3.3f, 4.8f, 3.3f)
                horizontalLineToRelative(11.21f)
                curveToRelative(0.04f, 0f, 0.08f, 0.02f, 0.11f, 0.04f)
                lineToRelative(4.54f, 4.54f)
                curveToRelative(0.02f, 0.03f, 0.04f, 0.07f, 0.04f, 0.1f)
                verticalLineTo(19.2f)
                curveToRelative(0f, 0.4f, -0.16f, 0.78f, -0.44f, 1.06f)
                reflectiveCurveTo(19.6f, 20.7f, 19.2f, 20.7f)
                horizontalLineTo(4.8f)
                curveToRelative(-0.4f, 0f, -0.78f, -0.16f, -1.06f, -0.44f)
                reflectiveCurveTo(3.3f, 19.6f, 3.3f, 19.2f)
                verticalLineTo(4.8f)
                curveToRelative(0f, -0.4f, 0.16f, -0.78f, 0.44f, -1.06f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(6.6f, 4.95f)
                curveToRelative(0.25f, 0f, 0.45f, 0.2f, 0.45f, 0.45f)
                verticalLineToRelative(3.15f)
                horizontalLineToRelative(6.3f)
                verticalLineTo(5.4f)
                curveToRelative(0f, -0.25f, 0.2f, -0.45f, 0.45f, -0.45f)
                reflectiveCurveToRelative(0.45f, 0.2f, 0.45f, 0.45f)
                verticalLineTo(9f)
                curveToRelative(0f, 0.25f, -0.2f, 0.45f, -0.45f, 0.45f)
                horizontalLineTo(6.6f)
                curveToRelative(-0.25f, 0f, -0.45f, -0.2f, -0.45f, -0.45f)
                verticalLineTo(5.4f)
                curveToRelative(0f, -0.25f, 0.2f, -0.45f, 0.45f, -0.45f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(6f, 5.4f)
                curveToRelative(0f, -0.33f, 0.27f, -0.6f, 0.6f, -0.6f)
                curveToRelative(0.33f, 0f, 0.6f, 0.27f, 0.6f, 0.6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.33f, 0.27f, -0.6f, 0.6f, -0.6f)
                curveToRelative(0.33f, 0f, 0.6f, 0.27f, 0.6f, 0.6f)
                verticalLineTo(9f)
                curveToRelative(0f, 0.33f, -0.27f, 0.6f, -0.6f, 0.6f)
                horizontalLineTo(6.6f)
                curveTo(6.27f, 9.6f, 6f, 9.33f, 6f, 9f)
                verticalLineTo(5.4f)
                close()
                moveToRelative(0.6f, -0.3f)
                curveToRelative(-0.17f, 0f, -0.3f, 0.13f, -0.3f, 0.3f)
                verticalLineTo(9f)
                curveToRelative(0f, 0.17f, 0.13f, 0.3f, 0.3f, 0.3f)
                horizontalLineToRelative(7.2f)
                curveToRelative(0.17f, 0f, 0.3f, -0.13f, 0.3f, -0.3f)
                verticalLineTo(5.4f)
                curveToRelative(0f, -0.17f, -0.13f, -0.3f, -0.3f, -0.3f)
                curveToRelative(-0.17f, 0f, -0.3f, 0.13f, -0.3f, 0.3f)
                verticalLineToRelative(3.15f)
                curveToRelative(0f, 0.08f, -0.07f, 0.15f, -0.15f, 0.15f)
                horizontalLineToRelative(-6.3f)
                curveTo(6.97f, 8.7f, 6.9f, 8.63f, 6.9f, 8.55f)
                verticalLineTo(5.4f)
                curveToRelative(0f, -0.17f, -0.13f, -0.3f, -0.3f, -0.3f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(6.15f, 13.8f)
                curveToRelative(0f, -0.25f, 0.2f, -0.45f, 0.45f, -0.45f)
                horizontalLineToRelative(10.8f)
                curveToRelative(0.25f, 0f, 0.45f, 0.2f, 0.45f, 0.45f)
                verticalLineToRelative(4.8f)
                curveToRelative(0f, 0.25f, -0.2f, 0.45f, -0.45f, 0.45f)
                reflectiveCurveToRelative(-0.45f, -0.2f, -0.45f, -0.45f)
                verticalLineToRelative(-4.35f)
                horizontalLineToRelative(-9.9f)
                verticalLineToRelative(4.35f)
                curveToRelative(0f, 0.25f, -0.2f, 0.45f, -0.45f, 0.45f)
                reflectiveCurveToRelative(-0.45f, -0.2f, -0.45f, -0.45f)
                verticalLineToRelative(-4.8f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(6f, 13.8f)
                curveToRelative(0f, -0.33f, 0.27f, -0.6f, 0.6f, -0.6f)
                horizontalLineToRelative(10.8f)
                curveToRelative(0.33f, 0f, 0.6f, 0.27f, 0.6f, 0.6f)
                verticalLineToRelative(4.8f)
                curveToRelative(0f, 0.33f, -0.27f, 0.6f, -0.6f, 0.6f)
                curveToRelative(-0.33f, 0f, -0.6f, -0.27f, -0.6f, -0.6f)
                verticalLineToRelative(-4.2f)
                horizontalLineTo(7.2f)
                verticalLineToRelative(4.2f)
                curveToRelative(0f, 0.33f, -0.27f, 0.6f, -0.6f, 0.6f)
                curveToRelative(-0.33f, 0f, -0.6f, -0.27f, -0.6f, -0.6f)
                verticalLineToRelative(-4.8f)
                close()
                moveToRelative(0.6f, -0.3f)
                curveToRelative(-0.17f, 0f, -0.3f, 0.13f, -0.3f, 0.3f)
                verticalLineToRelative(4.8f)
                curveToRelative(0f, 0.17f, 0.13f, 0.3f, 0.3f, 0.3f)
                curveToRelative(0.17f, 0f, 0.3f, -0.13f, 0.3f, -0.3f)
                verticalLineToRelative(-4.35f)
                curveToRelative(0f, -0.08f, 0.07f, -0.15f, 0.15f, -0.15f)
                horizontalLineToRelative(9.9f)
                curveToRelative(0.08f, 0f, 0.15f, 0.07f, 0.15f, 0.15f)
                verticalLineToRelative(4.35f)
                curveToRelative(0f, 0.17f, 0.13f, 0.3f, 0.3f, 0.3f)
                curveToRelative(0.17f, 0f, 0.3f, -0.13f, 0.3f, -0.3f)
                verticalLineToRelative(-4.8f)
                curveToRelative(0f, -0.17f, -0.13f, -0.3f, -0.3f, -0.3f)
                horizontalLineTo(6.6f)
                close()
            }
        }

        return _save!!
    }

@Suppress("ObjectPropertyName")
private var _save: ImageVector? = null

@Preview
@Composable
private fun SatsIconSavePreview() {
    Icon(SatsIcons.Save, contentDescription = null)
}
