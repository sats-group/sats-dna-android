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
val SatsIcons.RemoveFromCalendar: ImageVector
    get() {
        if (_removeFromCalendar != null) {
            return _removeFromCalendar!!
        }

        _removeFromCalendar = materialIcon(name = "RemoveFromCalendar") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(4.5f, 3.14f)
                horizontalLineToRelative(12.03f)
                curveToRelative(1.94f, 0f, 3.5f, 1.56f, 3.5f, 3.5f)
                lineToRelative(0.01f, 5.05f)
                curveToRelative(0f, 0.42f, -0.34f, 0.76f, -0.76f, 0.76f)
                curveToRelative(-0.41f, 0f, -0.75f, -0.34f, -0.75f, -0.76f)
                verticalLineTo(6.64f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(4.5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(10.35f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                lineToRelative(6.9f, 0.03f)
                curveToRelative(0.4f, 0f, 0.74f, 0.33f, 0.74f, 0.73f)
                curveToRelative(0f, 0.41f, -0.33f, 0.74f, -0.74f, 0.74f)
                horizontalLineTo(4.5f)
                curveTo(2.57f, 20.5f, 1f, 18.93f, 1f, 17f)
                verticalLineTo(6.64f)
                curveToRelative(0f, -1.94f, 1.57f, -3.5f, 3.5f, -3.5f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(18.53f, 9.43f)
                horizontalLineTo(2.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(16.03f)
                verticalLineToRelative(1.5f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(4.85f, 1f)
                curveTo(5.26f, 1f, 5.6f, 1.34f, 5.6f, 1.75f)
                verticalLineTo(3.2f)
                curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                curveToRelative(-0.42f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                verticalLineTo(1.75f)
                curveTo(4.1f, 1.34f, 4.43f, 1f, 4.85f, 1f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(16.15f, 1f)
                curveToRelative(0.41f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineTo(3.2f)
                curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                curveToRelative(-0.42f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                verticalLineTo(1.75f)
                curveTo(15.4f, 1.34f, 15.73f, 1f, 16.15f, 1f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(20.22f, 19.25f)
                lineToRelative(1.92f, -1.92f)
                curveToRelative(0.31f, -0.31f, 0.31f, -0.83f, 0f, -1.15f)
                curveToRelative(-0.32f, -0.32f, -0.84f, -0.32f, -1.16f, 0f)
                lineToRelative(-1.91f, 1.91f)
                lineToRelative(-2f, -1.99f)
                curveToRelative(-0.32f, -0.32f, -0.84f, -0.32f, -1.16f, 0f)
                curveToRelative(-0.32f, 0.33f, -0.32f, 0.85f, 0f, 1.17f)
                lineToRelative(1.99f, 2f)
                lineToRelative(-1.91f, 1.9f)
                curveToRelative(-0.32f, 0.32f, -0.32f, 0.84f, 0f, 1.15f)
                curveToRelative(0.32f, 0.32f, 0.84f, 0.32f, 1.16f, 0f)
                lineToRelative(1.9f, -1.9f)
                lineToRelative(2.12f, 2.11f)
                curveToRelative(0.32f, 0.32f, 0.84f, 0.32f, 1.16f, 0f)
                curveToRelative(0.33f, -0.32f, 0.33f, -0.85f, 0f, -1.17f)
                lineToRelative(-2.1f, -2.11f)
                close()
            }
        }

        return _removeFromCalendar!!
    }

@Suppress("ObjectPropertyName")
private var _removeFromCalendar: ImageVector? = null

@Preview
@Composable
private fun SatsIconRemoveFromCalendarPreview() {
    Icon(SatsIcons.RemoveFromCalendar, contentDescription = null)
}
