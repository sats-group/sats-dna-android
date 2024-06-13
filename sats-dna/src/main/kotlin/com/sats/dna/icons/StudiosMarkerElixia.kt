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
val SatsIcons.StudiosMarkerElixia: ImageVector
    get() {
        if (_studiosMarkerElixia != null) {
            return _studiosMarkerElixia!!
        }

        _studiosMarkerElixia = materialIcon(name = "StudiosMarkerElixia") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(16.49f, 8.08f)
                lineToRelative(0.66f, -2.31f)
                horizontalLineToRelative(-6.82f)
                lineTo(7.4f, 16f)
                horizontalLineToRelative(7f)
                lineToRelative(0.66f, -2.3f)
                horizontalLineToRelative(-4.37f)
                lineToRelative(0.52f, -1.76f)
                horizontalLineToRelative(3.1f)
                lineToRelative(0.66f, -2.31f)
                horizontalLineToRelative(-3.1f)
                lineToRelative(0.45f, -1.55f)
                horizontalLineToRelative(4.18f)
                close()
            }
        }

        return _studiosMarkerElixia!!
    }

@Suppress("ObjectPropertyName")
private var _studiosMarkerElixia: ImageVector? = null

@Preview
@Composable
private fun SatsIconStudiosMarkerElixiaPreview() {
    Icon(SatsIcons.StudiosMarkerElixia, contentDescription = null)
}
