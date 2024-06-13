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
val SatsIcons.Repeat: ImageVector
    get() {
        if (_repeat != null) {
            return _repeat!!
        }

        _repeat = materialIcon(name = "Repeat") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(10.84f, 2.23f)
                curveToRelative(0.3f, -0.3f, 0.79f, -0.3f, 1.09f, 0f)
                lineToRelative(3.69f, 3.69f)
                curveToRelative(0.3f, 0.3f, 0.3f, 0.78f, 0f, 1.09f)
                lineToRelative(-3.7f, 3.69f)
                curveToRelative(-0.3f, 0.3f, -0.78f, 0.3f, -1.08f, 0f)
                curveToRelative(-0.3f, -0.3f, -0.3f, -0.79f, 0f, -1.09f)
                lineToRelative(3.15f, -3.15f)
                lineToRelative(-3.15f, -3.15f)
                curveToRelative(-0.3f, -0.3f, -0.3f, -0.78f, 0f, -1.08f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(2.77f, 6.46f)
                curveToRelative(0.49f, -0.5f, 1.15f, -0.77f, 1.85f, -0.77f)
                horizontalLineToRelative(10.46f)
                curveToRelative(0.42f, 0f, 0.77f, 0.35f, 0.77f, 0.77f)
                curveToRelative(0f, 0.43f, -0.35f, 0.77f, -0.77f, 0.77f)
                horizontalLineTo(4.62f)
                curveToRelative(-0.29f, 0f, -0.56f, 0.11f, -0.77f, 0.32f)
                curveToRelative(-0.2f, 0.2f, -0.31f, 0.47f, -0.31f, 0.76f)
                verticalLineToRelative(7.38f)
                curveToRelative(0f, 0.29f, 0.11f, 0.56f, 0.31f, 0.76f)
                curveToRelative(0.2f, 0.2f, 0.48f, 0.32f, 0.77f, 0.32f)
                horizontalLineToRelative(0.61f)
                curveTo(5.66f, 16.77f, 6f, 17.1f, 6f, 17.54f)
                curveToRelative(0f, 0.42f, -0.34f, 0.77f, -0.77f, 0.77f)
                horizontalLineTo(4.62f)
                curveToRelative(-0.7f, 0f, -1.36f, -0.28f, -1.85f, -0.77f)
                curveTo(2.27f, 17.05f, 2f, 16.4f, 2f, 15.7f)
                verticalLineTo(8.31f)
                curveToRelative(0f, -0.7f, 0.28f, -1.36f, 0.77f, -1.85f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(13.16f, 13.3f)
                curveToRelative(0.3f, 0.3f, 0.3f, 0.79f, 0f, 1.09f)
                lineToRelative(-3.15f, 3.15f)
                lineToRelative(3.15f, 3.15f)
                curveToRelative(0.3f, 0.3f, 0.3f, 0.78f, 0f, 1.08f)
                curveToRelative(-0.3f, 0.3f, -0.79f, 0.3f, -1.09f, 0f)
                lineToRelative(-3.69f, -3.69f)
                curveToRelative(-0.3f, -0.3f, -0.3f, -0.79f, 0f, -1.09f)
                lineToRelative(3.7f, -3.69f)
                curveToRelative(0.3f, -0.3f, 0.78f, -0.3f, 1.08f, 0f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(18f, 6.46f)
                curveToRelative(0f, -0.42f, 0.34f, -0.77f, 0.77f, -0.77f)
                horizontalLineToRelative(0.61f)
                curveToRelative(0.7f, 0f, 1.36f, 0.28f, 1.85f, 0.77f)
                curveTo(21.73f, 6.95f, 22f, 7.6f, 22f, 8.3f)
                verticalLineToRelative(7.38f)
                curveToRelative(0f, 0.7f, -0.28f, 1.36f, -0.77f, 1.85f)
                curveToRelative(-0.49f, 0.5f, -1.15f, 0.77f, -1.85f, 0.77f)
                horizontalLineTo(8.92f)
                curveToRelative(-0.42f, 0f, -0.77f, -0.35f, -0.77f, -0.77f)
                curveToRelative(0f, -0.43f, 0.35f, -0.77f, 0.77f, -0.77f)
                horizontalLineToRelative(10.46f)
                curveToRelative(0.29f, 0f, 0.56f, -0.11f, 0.77f, -0.32f)
                curveToRelative(0.2f, -0.2f, 0.31f, -0.47f, 0.31f, -0.76f)
                verticalLineTo(8.31f)
                curveToRelative(0f, -0.29f, -0.11f, -0.56f, -0.31f, -0.76f)
                curveToRelative(-0.2f, -0.2f, -0.48f, -0.32f, -0.77f, -0.32f)
                horizontalLineToRelative(-0.61f)
                curveTo(18.34f, 7.23f, 18f, 6.9f, 18f, 6.46f)
                close()
            }
        }

        return _repeat!!
    }

@Suppress("ObjectPropertyName")
private var _repeat: ImageVector? = null

@Preview
@Composable
private fun SatsIconRepeatPreview() {
    Icon(SatsIcons.Repeat, contentDescription = null)
}
