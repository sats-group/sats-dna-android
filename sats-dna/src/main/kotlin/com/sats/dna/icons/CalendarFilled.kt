package com.sats.dna.icons

import androidx.compose.material.Icon
import androidx.compose.material.icons.materialIcon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import com.sats.dna.SatsIcons

@Suppress("UnusedReceiverParameter") // for convenient access
val SatsIcons.CalendarFilled: ImageVector
    get() {
        if (_calendarFilled != null) {
            return _calendarFilled!!
        }

        _calendarFilled = materialIcon(name = "CalendarFilled") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(6.17f, 22f)
                curveTo(3.87f, 22f, 2f, 20.13f, 2f, 17.83f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 2.3f, -1.87f, 4.17f, -4.17f, 4.17f)
                horizontalLineTo(6.17f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(22f, 8.67f)
                verticalLineTo(7.83f)
                curveToRelative(0f, -2.3f, -1.87f, -4.16f, -4.17f, -4.16f)
                horizontalLineTo(17f)
                verticalLineTo(2.83f)
                curveTo(17f, 2.37f, 16.63f, 2f, 16.17f, 2f)
                curveToRelative(-0.46f, 0f, -0.84f, 0.37f, -0.84f, 0.83f)
                verticalLineToRelative(0.84f)
                horizontalLineTo(8.67f)
                verticalLineTo(2.83f)
                curveTo(8.67f, 2.37f, 8.29f, 2f, 7.83f, 2f)
                curveTo(7.37f, 2f, 7f, 2.37f, 7f, 2.83f)
                verticalLineToRelative(0.84f)
                horizontalLineTo(6.17f)
                curveTo(3.87f, 3.67f, 2f, 5.54f, 2f, 7.83f)
                verticalLineToRelative(0.84f)
                horizontalLineToRelative(20f)
                close()
            }
        }

        return _calendarFilled!!
    }

@Suppress("ObjectPropertyName")
private var _calendarFilled: ImageVector? = null

@Preview
@Composable
private fun SatsIconCalendarFilledPreview() {
    Icon(SatsIcons.CalendarFilled, contentDescription = null)
}
