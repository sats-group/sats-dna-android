package com.sats.dna.icons

import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import com.sats.dna.SatsIcons

@Suppress("UnusedReceiverParameter") // for convenient access
val SatsIcons.Calendar: ImageVector
    get() {
        if (_calendar != null) {
            return _calendar!!
        }

        _calendar = materialIcon(name = "Calendar") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(17.83f, 3.67f)
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
                verticalLineToRelative(10f)
                curveTo(2f, 20.13f, 3.87f, 22f, 6.17f, 22f)
                horizontalLineToRelative(11.66f)
                curveToRelative(2.3f, 0f, 4.17f, -1.87f, 4.17f, -4.17f)
                verticalLineToRelative(-10f)
                curveToRelative(0f, -2.3f, -1.87f, -4.16f, -4.17f, -4.16f)
                close()
                moveTo(6.17f, 5.33f)
                horizontalLineToRelative(11.66f)
                curveToRelative(1.38f, 0f, 2.5f, 1.13f, 2.5f, 2.5f)
                verticalLineToRelative(0.84f)
                horizontalLineTo(3.67f)
                verticalLineTo(7.83f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveToRelative(11.66f, 15f)
                horizontalLineTo(6.17f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(16.66f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }

        return _calendar!!
    }

@Suppress("ObjectPropertyName")
private var _calendar: ImageVector? = null

@Preview
@Composable
private fun SatsIconCalendarPreview() {
    Icon(SatsIcons.Calendar, contentDescription = null)
}
