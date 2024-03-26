package com.sats.dna.icons

import androidx.compose.material.Icon
import androidx.compose.material.icons.materialIcon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import com.sats.dna.SatsIcons

@Suppress("UnusedReceiverParameter") // for convenient access
val SatsIcons.Close: ImageVector
    get() {
        if (_close != null) {
            return _close!!
        }

        _close = materialIcon(name = "Close") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(5.47f, 5.47f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0f)
                lineTo(12f, 10.94f)
                lineToRelative(5.47f, -5.47f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0f)
                curveToRelative(0.3f, 0.3f, 0.3f, 0.77f, 0f, 1.06f)
                lineTo(13.06f, 12f)
                lineToRelative(5.47f, 5.47f)
                curveToRelative(0.3f, 0.3f, 0.3f, 0.77f, 0f, 1.06f)
                curveToRelative(-0.3f, 0.3f, -0.77f, 0.3f, -1.06f, 0f)
                lineTo(12f, 13.06f)
                lineToRelative(-5.47f, 5.47f)
                curveToRelative(-0.3f, 0.3f, -0.77f, 0.3f, -1.06f, 0f)
                curveToRelative(-0.3f, -0.3f, -0.3f, -0.77f, 0f, -1.06f)
                lineTo(10.94f, 12f)
                lineTo(5.47f, 6.53f)
                curveToRelative(-0.3f, -0.3f, -0.3f, -0.77f, 0f, -1.06f)
                close()
            }
        }

        return _close!!
    }

@Suppress("ObjectPropertyName")
private var _close: ImageVector? = null

@Preview
@Composable
private fun SatsIconClosePreview() {
    Icon(SatsIcons.Close, contentDescription = null)
}
