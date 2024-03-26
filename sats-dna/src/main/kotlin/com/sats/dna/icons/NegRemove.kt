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
val SatsIcons.NegRemove: ImageVector
    get() {
        if (_negRemove != null) {
            return _negRemove!!
        }

        _negRemove = materialIcon(name = "NegRemove") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(12f, 1f)
                curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                reflectiveCurveTo(18.07f, 1f, 12f, 1f)
                close()
                moveToRelative(3.45f, 13.41f)
                curveToRelative(0.29f, 0.3f, 0.29f, 0.75f, 0f, 1.04f)
                curveToRelative(-0.14f, 0.14f, -0.33f, 0.22f, -0.52f, 0.22f)
                curveToRelative(-0.18f, 0f, -0.37f, -0.08f, -0.52f, -0.22f)
                lineTo(12f, 13.04f)
                lineToRelative(-2.41f, 2.41f)
                curveToRelative(-0.15f, 0.14f, -0.34f, 0.22f, -0.52f, 0.22f)
                curveToRelative(-0.2f, 0f, -0.38f, -0.08f, -0.52f, -0.22f)
                curveToRelative(-0.29f, -0.29f, -0.29f, -0.75f, 0f, -1.04f)
                lineTo(10.96f, 12f)
                lineTo(8.55f, 9.59f)
                curveToRelative(-0.29f, -0.3f, -0.29f, -0.76f, 0f, -1.04f)
                curveToRelative(0.28f, -0.29f, 0.75f, -0.29f, 1.04f, 0f)
                lineTo(12f, 10.96f)
                lineToRelative(2.41f, -2.41f)
                curveToRelative(0.3f, -0.29f, 0.75f, -0.29f, 1.04f, 0f)
                curveToRelative(0.29f, 0.28f, 0.29f, 0.75f, 0f, 1.04f)
                lineTo(13.04f, 12f)
                lineToRelative(2.41f, 2.41f)
                close()
            }
        }

        return _negRemove!!
    }

@Suppress("ObjectPropertyName")
private var _negRemove: ImageVector? = null

@Preview
@Composable
private fun SatsIconNegRemovePreview() {
    Icon(SatsIcons.NegRemove, contentDescription = null)
}
