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
val SatsIcons.Award: ImageVector
    get() {
        if (_award != null) {
            return _award!!
        }

        _award = materialIcon(name = "Award") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(10.6f, 16.52f)
                lineTo(7.63f, 22f)
                lineToRelative(-1.76f, -3.98f)
                lineToRelative(-4.42f, 0.9f)
                lineToRelative(3.32f, -6.1f)
                moveToRelative(14.92f, 0f)
                lineToRelative(3.32f, 6.1f)
                lineToRelative(-4.42f, -0.9f)
                lineTo(16.82f, 22f)
                lineToRelative(-3f, -5.48f)
                moveToRelative(4.87f, -8.96f)
                curveToRelative(0f, 3.42f, -2.9f, 6.19f, -6.47f, 6.19f)
                reflectiveCurveToRelative(-6.47f, -2.77f, -6.47f, -6.19f)
                curveToRelative(0f, -3.41f, 2.9f, -6.18f, 6.47f, -6.18f)
                reflectiveCurveToRelative(6.47f, 2.77f, 6.47f, 6.18f)
                close()
            }
        }

        return _award!!
    }

@Suppress("ObjectPropertyName")
private var _award: ImageVector? = null

@Preview
@Composable
private fun SatsIconAwardPreview() {
    Icon(SatsIcons.Award, contentDescription = null)
}
