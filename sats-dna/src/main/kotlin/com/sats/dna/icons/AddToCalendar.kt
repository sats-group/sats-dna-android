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
val SatsIcons.AddToCalendar: ImageVector
    get() {
        if (_addToCalendar != null) {
            return _addToCalendar!!
        }

        _addToCalendar = materialIcon(name = "AddToCalendar") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(4.29f, 3f)
                horizontalLineTo(15.6f)
                curveToRelative(1.82f, 0f, 3.3f, 1.48f, 3.3f, 3.3f)
                verticalLineToRelative(4.75f)
                curveToRelative(0f, 0.39f, -0.32f, 0.7f, -0.71f, 0.7f)
                curveToRelative(-0.4f, 0f, -0.71f, -0.31f, -0.71f, -0.7f)
                verticalLineTo(6.3f)
                curveToRelative(0f, -1.04f, -0.84f, -1.88f, -1.88f, -1.88f)
                horizontalLineTo(4.3f)
                curveToRelative(-1.04f, 0f, -1.88f, 0.84f, -1.88f, 1.88f)
                verticalLineToRelative(9.74f)
                curveToRelative(0f, 1.03f, 0.84f, 1.88f, 1.88f, 1.88f)
                lineToRelative(6.49f, 0.02f)
                curveToRelative(0.38f, 0f, 0.7f, 0.3f, 0.7f, 0.69f)
                curveToRelative(-0.01f, 0.38f, -0.32f, 0.7f, -0.7f, 0.7f)
                horizontalLineTo(4.29f)
                curveToRelative(-1.82f, 0f, -3.29f, -1.48f, -3.29f, -3.3f)
                verticalLineTo(6.3f)
                curveTo(1f, 4.48f, 2.47f, 3f, 4.29f, 3f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(17.48f, 8.93f)
                horizontalLineTo(2.41f)
                verticalLineTo(7.52f)
                horizontalLineToRelative(15.07f)
                verticalLineToRelative(1.4f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(4.62f, 1f)
                curveTo(5f, 1f, 5.32f, 1.32f, 5.32f, 1.7f)
                verticalLineToRelative(1.37f)
                curveToRelative(0f, 0.39f, -0.32f, 0.7f, -0.7f, 0.7f)
                curveToRelative(-0.4f, 0f, -0.71f, -0.31f, -0.71f, -0.7f)
                verticalLineTo(1.7f)
                curveTo(3.91f, 1.3f, 4.23f, 1f, 4.61f, 1f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(15.24f, 1f)
                curveToRelative(0.39f, 0f, 0.7f, 0.32f, 0.7f, 0.7f)
                verticalLineToRelative(1.37f)
                curveToRelative(0f, 0.39f, -0.31f, 0.7f, -0.7f, 0.7f)
                curveToRelative(-0.4f, 0f, -0.7f, -0.31f, -0.7f, -0.7f)
                verticalLineTo(1.7f)
                curveToRelative(0f, -0.4f, 0.3f, -0.71f, 0.7f, -0.71f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(18.93f, 19.41f)
                horizontalLineToRelative(2.54f)
                curveToRelative(0.43f, 0f, 0.77f, -0.34f, 0.77f, -0.76f)
                curveToRelative(0f, -0.43f, -0.34f, -0.77f, -0.77f, -0.77f)
                horizontalLineToRelative(-2.54f)
                verticalLineToRelative(-2.65f)
                curveToRelative(0f, -0.43f, -0.35f, -0.77f, -0.78f, -0.77f)
                curveToRelative(-0.43f, 0f, -0.78f, 0.34f, -0.78f, 0.77f)
                verticalLineToRelative(2.65f)
                horizontalLineToRelative(-2.53f)
                curveToRelative(-0.43f, 0f, -0.77f, 0.34f, -0.77f, 0.77f)
                curveToRelative(0f, 0.42f, 0.34f, 0.76f, 0.77f, 0.76f)
                horizontalLineToRelative(2.53f)
                verticalLineToRelative(2.81f)
                curveToRelative(0f, 0.43f, 0.35f, 0.78f, 0.78f, 0.78f)
                curveToRelative(0.43f, 0f, 0.78f, -0.35f, 0.78f, -0.78f)
                verticalLineToRelative(-2.8f)
                close()
            }
        }

        return _addToCalendar!!
    }

@Suppress("ObjectPropertyName")
private var _addToCalendar: ImageVector? = null

@Preview
@Composable
private fun SatsIconAddToCalendarPreview() {
    Icon(SatsIcons.AddToCalendar, contentDescription = null)
}
