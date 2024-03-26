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
val SatsIcons.Showing: ImageVector
    get() {
        if (_showing != null) {
            return _showing!!
        }

        _showing = materialIcon(name = "Showing") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(3f, 12f)
                reflectiveCurveToRelative(3.6f, -6.1f, 9f, -6.1f)
                reflectiveCurveToRelative(9f, 6.1f, 9f, 6.1f)
                reflectiveCurveToRelative(-3.6f, 6.1f, -9f, 6.1f)
                reflectiveCurveTo(3f, 12f, 3f, 12f)
                close()
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(12f, 14.62f)
                curveToRelative(1.5f, 0f, 2.7f, -1.17f, 2.7f, -2.62f)
                curveToRelative(0f, -1.45f, -1.2f, -2.62f, -2.7f, -2.62f)
                curveToRelative(-1.5f, 0f, -2.7f, 1.17f, -2.7f, 2.62f)
                curveToRelative(0f, 1.45f, 1.2f, 2.62f, 2.7f, 2.62f)
                close()
            }
        }

        return _showing!!
    }

@Suppress("ObjectPropertyName")
private var _showing: ImageVector? = null

@Preview
@Composable
private fun SatsIconShowingPreview() {
    Icon(SatsIcons.Showing, contentDescription = null)
}
