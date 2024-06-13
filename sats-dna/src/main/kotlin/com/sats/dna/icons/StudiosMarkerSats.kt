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
val SatsIcons.StudiosMarkerSats: ImageVector
    get() {
        if (_studiosMarkerSats != null) {
            return _studiosMarkerSats!!
        }

        _studiosMarkerSats = materialIcon(name = "StudiosMarkerSats") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(6.97f, 15.12f)
                lineToRelative(1.97f, -1.53f)
                curveToRelative(0.53f, 0.67f, 1.28f, 1.08f, 2.11f, 1.08f)
                curveToRelative(1.05f, 0f, 1.45f, -0.59f, 1.45f, -1.13f)
                curveToRelative(0f, -0.4f, -0.22f, -0.67f, -0.7f, -1.12f)
                lineToRelative(-0.7f, -0.67f)
                curveToRelative(-0.75f, -0.67f, -1.32f, -1.4f, -1.32f, -2.43f)
                curveToRelative(0f, -2.1f, 1.75f, -3.72f, 4.12f, -3.72f)
                curveToRelative(1.76f, 0f, 2.9f, 0.8f, 3.38f, 1.57f)
                lineTo(15.31f, 8.7f)
                curveToRelative(-0.53f, -0.59f, -1.1f, -0.81f, -1.67f, -0.81f)
                curveToRelative(-0.83f, 0f, -1.19f, 0.5f, -1.19f, 1.03f)
                curveToRelative(0f, 0.4f, 0.22f, 0.72f, 0.66f, 1.12f)
                lineToRelative(0.7f, 0.68f)
                curveToRelative(0.7f, 0.62f, 1.37f, 1.3f, 1.37f, 2.42f)
                curveToRelative(0f, 2.2f, -1.58f, 3.86f, -4.3f, 3.86f)
                curveToRelative(-1.85f, 0f, -3.17f, -0.8f, -3.91f, -1.88f)
                close()
            }
        }

        return _studiosMarkerSats!!
    }

@Suppress("ObjectPropertyName")
private var _studiosMarkerSats: ImageVector? = null

@Preview
@Composable
private fun SatsIconStudiosMarkerSatsPreview() {
    Icon(SatsIcons.StudiosMarkerSats, contentDescription = null)
}
