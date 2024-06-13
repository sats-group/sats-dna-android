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
val SatsIcons.CalendarCheck: ImageVector
    get() {
        if (_calendarCheck != null) {
            return _calendarCheck!!
        }

        _calendarCheck = materialIcon(name = "CalendarCheck") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(3f, 9.19f)
                curveToRelative(0f, -0.31f, 0.25f, -0.56f, 0.56f, -0.56f)
                horizontalLineToRelative(16.88f)
                curveToRelative(0.3f, 0f, 0.56f, 0.25f, 0.56f, 0.56f)
                curveToRelative(0f, 0.3f, -0.25f, 0.56f, -0.56f, 0.56f)
                horizontalLineTo(3.56f)
                curveTo(3.26f, 9.75f, 3f, 9.5f, 3f, 9.19f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(3f, 7.5f)
                curveToRelative(0f, -1.24f, 1f, -2.25f, 2.25f, -2.25f)
                horizontalLineToRelative(13.5f)
                curveToRelative(1.24f, 0f, 2.25f, 1f, 2.25f, 2.25f)
                verticalLineToRelative(5.06f)
                curveToRelative(0f, 0.31f, -0.25f, 0.56f, -0.56f, 0.56f)
                curveToRelative(-0.31f, 0f, -0.57f, -0.25f, -0.57f, -0.56f)
                verticalLineTo(7.5f)
                curveToRelative(0f, -0.62f, -0.5f, -1.13f, -1.12f, -1.13f)
                horizontalLineTo(5.25f)
                curveToRelative(-0.62f, 0f, -1.13f, 0.5f, -1.13f, 1.13f)
                verticalLineToRelative(11.25f)
                curveToRelative(0f, 0.62f, 0.5f, 1.13f, 1.13f, 1.13f)
                horizontalLineToRelative(5.06f)
                curveToRelative(0.31f, 0f, 0.56f, 0.25f, 0.56f, 0.56f)
                curveToRelative(0f, 0.3f, -0.25f, 0.56f, -0.56f, 0.56f)
                horizontalLineTo(5.25f)
                curveTo(4.01f, 21f, 3f, 20f, 3f, 18.75f)
                verticalLineTo(7.5f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(8.06f, 3f)
                curveToRelative(0.31f, 0f, 0.56f, 0.25f, 0.56f, 0.56f)
                verticalLineToRelative(2.25f)
                curveToRelative(0f, 0.31f, -0.25f, 0.57f, -0.56f, 0.57f)
                curveToRelative(-0.3f, 0f, -0.56f, -0.26f, -0.56f, -0.57f)
                verticalLineTo(3.56f)
                curveTo(7.5f, 3.26f, 7.75f, 3f, 8.06f, 3f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(15.94f, 3f)
                curveToRelative(0.3f, 0f, 0.56f, 0.25f, 0.56f, 0.56f)
                verticalLineToRelative(2.25f)
                curveToRelative(0f, 0.31f, -0.25f, 0.57f, -0.56f, 0.57f)
                curveToRelative(-0.31f, 0f, -0.56f, -0.26f, -0.56f, -0.57f)
                verticalLineTo(3.56f)
                curveToRelative(0f, -0.3f, 0.25f, -0.56f, 0.56f, -0.56f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(20.84f, 15.54f)
                curveToRelative(0.21f, 0.22f, 0.21f, 0.58f, 0f, 0.8f)
                lineToRelative(-4.5f, 4.5f)
                curveToRelative(-0.22f, 0.21f, -0.58f, 0.21f, -0.8f, 0f)
                lineToRelative(-2.25f, -2.25f)
                curveToRelative(-0.22f, -0.22f, -0.22f, -0.58f, 0f, -0.8f)
                curveToRelative(0.22f, -0.22f, 0.58f, -0.22f, 0.8f, 0f)
                lineToRelative(1.85f, 1.85f)
                lineToRelative(4.1f, -4.1f)
                curveToRelative(0.22f, -0.22f, 0.58f, -0.22f, 0.8f, 0f)
                close()
            }
        }

        return _calendarCheck!!
    }

@Suppress("ObjectPropertyName")
private var _calendarCheck: ImageVector? = null

@Preview
@Composable
private fun SatsIconCalendarCheckPreview() {
    Icon(SatsIcons.CalendarCheck, contentDescription = null)
}
