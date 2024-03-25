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
val SatsIcons.StudiosMarkerBg: ImageVector
    get() {
        if (_studiosMarkerBg != null) {
            return _studiosMarkerBg!!
        }

        _studiosMarkerBg = materialIcon(name = "StudiosMarkerBg") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(12.27f, 0.33f)
                curveTo(6.59f, 0.33f, 2f, 4.93f, 2f, 10.6f)
                curveToRelative(0f, 7.7f, 10.27f, 19.07f, 10.27f, 19.07f)
                reflectiveCurveTo(22.53f, 18.3f, 22.53f, 10.6f)
                curveToRelative(0f, -5.68f, -4.59f, -10.27f, -10.26f, -10.27f)
                close()
            }
        }

        return _studiosMarkerBg!!
    }

@Suppress("ObjectPropertyName")
private var _studiosMarkerBg: ImageVector? = null

@Preview
@Composable
private fun SatsIconStudiosMarkerBgPreview() {
    Icon(SatsIcons.StudiosMarkerBg, contentDescription = null)
}
