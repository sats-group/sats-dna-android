package com.sats.dna.icons

import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.Icon
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
                moveTo(3.3f, 3.3f)
                curveToRelative(0.38f, -0.4f, 1.02f, -0.4f, 1.4f, 0f)
                lineToRelative(7.3f, 7.29f)
                lineToRelative(7.3f, -7.3f)
                curveToRelative(0.38f, -0.39f, 1.02f, -0.39f, 1.4f, 0f)
                curveToRelative(0.4f, 0.4f, 0.4f, 1.03f, 0f, 1.42f)
                lineTo(13.42f, 12f)
                lineToRelative(7.3f, 7.3f)
                curveToRelative(0.39f, 0.38f, 0.39f, 1.02f, 0f, 1.4f)
                curveToRelative(-0.4f, 0.4f, -1.03f, 0.4f, -1.42f, 0f)
                lineTo(12f, 13.42f)
                lineToRelative(-7.3f, 7.3f)
                curveToRelative(-0.38f, 0.39f, -1.02f, 0.39f, -1.4f, 0f)
                curveToRelative(-0.4f, -0.4f, -0.4f, -1.03f, 0f, -1.42f)
                lineTo(10.58f, 12f)
                lineToRelative(-7.3f, -7.3f)
                curveTo(2.9f, 4.33f, 2.9f, 3.69f, 3.3f, 3.3f)
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
