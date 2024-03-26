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
val SatsIcons.Calendar: ImageVector
    get() {
        if (_calendar != null) {
            return _calendar!!
        }

        _calendar = materialIcon(name = "Calendar") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(21.2f, 8.95f)
                horizontalLineTo(2.44f)
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(2.74f, 6.62f)
                curveToRelative(0f, -1.52f, 1.23f, -2.75f, 2.75f, -2.75f)
                horizontalLineToRelative(13.02f)
                curveToRelative(1.52f, 0f, 2.75f, 1.23f, 2.75f, 2.75f)
                verticalLineToRelative(11.26f)
                curveToRelative(0f, 1.52f, -1.23f, 2.75f, -2.75f, 2.75f)
                horizontalLineToRelative(-13.02f)
                curveToRelative(-1.52f, 0f, -2.75f, -1.23f, -2.75f, -2.75f)
                close()
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.3f,
            ) {
                moveTo(16.74f, 2.62f)
                verticalLineToRelative(2.45f)
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.3f,
            ) {
                moveTo(7.23f, 2.62f)
                verticalLineToRelative(2.45f)
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
