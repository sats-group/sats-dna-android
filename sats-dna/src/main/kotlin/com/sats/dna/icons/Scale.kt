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
val SatsIcons.Scale: ImageVector
    get() {
        if (_scale != null) {
            return _scale!!
        }

        _scale = materialIcon(name = "Scale") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(4.56f, 3.4f)
                curveTo(3.92f, 3.4f, 3.4f, 3.92f, 3.4f, 4.56f)
                verticalLineToRelative(14.88f)
                curveToRelative(0f, 0.64f, 0.52f, 1.16f, 1.16f, 1.16f)
                horizontalLineToRelative(14.88f)
                curveToRelative(0.64f, 0f, 1.16f, -0.52f, 1.16f, -1.16f)
                verticalLineTo(4.56f)
                curveToRelative(0f, -0.64f, -0.52f, -1.16f, -1.16f, -1.16f)
                horizontalLineTo(4.56f)
                close()
                moveTo(2f, 4.56f)
                curveTo(2f, 3.15f, 3.15f, 2f, 4.56f, 2f)
                horizontalLineToRelative(14.88f)
                curveTo(20.85f, 2f, 22f, 3.15f, 22f, 4.56f)
                verticalLineToRelative(14.88f)
                curveToRelative(0f, 1.41f, -1.15f, 2.56f, -2.56f, 2.56f)
                horizontalLineTo(4.56f)
                curveTo(3.15f, 22f, 2f, 20.85f, 2f, 19.44f)
                verticalLineTo(4.56f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(13.1f, 7.6f)
                curveToRelative(0.37f, 0.1f, 0.6f, 0.47f, 0.5f, 0.85f)
                lineToRelative(-0.92f, 3.72f)
                curveToRelative(-0.1f, 0.37f, -0.47f, 0.6f, -0.85f, 0.5f)
                curveToRelative(-0.37f, -0.09f, -0.6f, -0.47f, -0.5f, -0.84f)
                lineToRelative(0.92f, -3.72f)
                curveToRelative(0.1f, -0.37f, 0.48f, -0.6f, 0.85f, -0.5f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(12f, 4.88f)
                curveToRelative(-0.94f, 0f, -1.86f, 0.18f, -2.73f, 0.53f)
                curveTo(8.4f, 5.77f, 7.62f, 6.3f, 6.96f, 6.96f)
                curveTo(6.29f, 7.62f, 5.76f, 8.4f, 5.4f, 9.27f)
                curveToRelative(-0.35f, 0.87f, -0.53f, 1.8f, -0.53f, 2.73f)
                curveToRelative(0f, 0.34f, 0.28f, 0.6f, 0.6f, 0.6f)
                horizontalLineToRelative(13.03f)
                curveToRelative(0.33f, 0f, 0.6f, -0.26f, 0.6f, -0.6f)
                curveToRelative(0.01f, -0.93f, -0.17f, -1.86f, -0.52f, -2.73f)
                curveToRelative(-0.36f, -0.86f, -0.88f, -1.65f, -1.55f, -2.31f)
                curveToRelative(-0.66f, -0.67f, -1.45f, -1.2f, -2.31f, -1.55f)
                curveToRelative(-0.87f, -0.35f, -1.8f, -0.53f, -2.73f, -0.53f)
                close()
                moveToRelative(0f, 1.21f)
                curveToRelative(-0.78f, 0f, -1.55f, 0.15f, -2.27f, 0.44f)
                curveToRelative(-0.72f, 0.3f, -1.37f, 0.73f, -1.92f, 1.28f)
                curveToRelative(-0.55f, 0.55f, -0.98f, 1.2f, -1.28f, 1.92f)
                curveToRelative(-0.22f, 0.53f, -0.36f, 1.1f, -0.41f, 1.67f)
                horizontalLineToRelative(11.76f)
                curveToRelative(-0.06f, -0.58f, -0.2f, -1.14f, -0.41f, -1.67f)
                curveToRelative(-0.3f, -0.72f, -0.73f, -1.37f, -1.28f, -1.92f)
                curveToRelative(-0.55f, -0.55f, -1.2f, -0.98f, -1.92f, -1.28f)
                curveTo(13.55f, 6.23f, 12.78f, 6.1f, 12f, 6.1f)
                close()
            }
        }

        return _scale!!
    }

@Suppress("ObjectPropertyName")
private var _scale: ImageVector? = null

@Preview
@Composable
private fun SatsIconScalePreview() {
    Icon(SatsIcons.Scale, contentDescription = null)
}
