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
val SatsIcons.Time: ImageVector
    get() {
        if (_time != null) {
            return _time!!
        }

        _time = materialIcon(name = "Time") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(1.42f, 12f)
                curveToRelative(0f, -5.84f, 4.74f, -10.58f, 10.58f, -10.58f)
                horizontalLineToRelative(0.01f)
                curveToRelative(5.84f, 0f, 10.58f, 4.74f, 10.58f, 10.58f)
                verticalLineToRelative(0.01f)
                curveToRelative(0f, 5.84f, -4.74f, 10.58f, -10.58f, 10.58f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-5.84f, 0f, -10.58f, -4.74f, -10.58f, -10.58f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(11.96f, 6.97f)
                curveToRelative(0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(0f)
                curveToRelative(0.41f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(6.01f)
                curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.41f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(8.2f, 12.42f)
                curveToRelative(-0.41f, 0f, -0.75f, 0.33f, -0.75f, 0.74f)
                curveToRelative(0f, 0.42f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(4.52f)
                curveToRelative(0.41f, 0f, 0.75f, -0.33f, 0.75f, -0.75f)
                curveToRelative(0f, -0.4f, -0.34f, -0.74f, -0.75f, -0.74f)
                horizontalLineTo(8.2f)
                close()
            }
        }

        return _time!!
    }

@Suppress("ObjectPropertyName")
private var _time: ImageVector? = null

@Preview
@Composable
private fun SatsIconTimePreview() {
    Icon(SatsIcons.Time, contentDescription = null)
}
