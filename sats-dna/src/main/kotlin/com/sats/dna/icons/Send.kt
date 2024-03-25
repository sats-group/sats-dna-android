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
val SatsIcons.Send: ImageVector
    get() {
        if (_send != null) {
            return _send!!
        }

        _send = materialIcon(name = "Send") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(21.48f, 2.42f)
                curveToRelative(0.21f, 0.18f, 0.3f, 0.46f, 0.26f, 0.73f)
                lineToRelative(-3.6f, 18f)
                curveToRelative(-0.06f, 0.25f, -0.23f, 0.46f, -0.47f, 0.55f)
                curveToRelative(-0.24f, 0.1f, -0.51f, 0.05f, -0.72f, -0.1f)
                lineToRelative(-5.98f, -4.48f)
                lineToRelative(-2.9f, 3.46f)
                curveToRelative(-0.2f, 0.24f, -0.53f, 0.33f, -0.83f, 0.22f)
                curveToRelative(-0.3f, -0.1f, -0.49f, -0.38f, -0.49f, -0.7f)
                verticalLineToRelative(-6.15f)
                lineToRelative(-4.2f, -3.15f)
                curveToRelative(-0.22f, -0.16f, -0.33f, -0.43f, -0.3f, -0.7f)
                curveToRelative(0.04f, -0.27f, 0.22f, -0.5f, 0.47f, -0.6f)
                lineToRelative(18f, -7.2f)
                curveToRelative(0.26f, -0.1f, 0.55f, -0.05f, 0.76f, 0.12f)
                close()
                moveTo(8.25f, 15.07f)
                verticalLineToRelative(2.97f)
                lineToRelative(1.52f, -1.82f)
                lineToRelative(-1.52f, -1.14f)
                close()
                moveToRelative(0.62f, -1.4f)
                lineToRelative(11f, -8.8f)
                lineTo(16.9f, 19.7f)
                lineToRelative(-8.03f, -6.03f)
                close()
                moveToRelative(7.7f, -8.1f)
                lineToRelative(-8.94f, 7.17f)
                lineToRelative(-3.11f, -2.34f)
                lineToRelative(12.06f, -4.82f)
                close()
            }
        }

        return _send!!
    }

@Suppress("ObjectPropertyName")
private var _send: ImageVector? = null

@Preview
@Composable
private fun SatsIconSendPreview() {
    Icon(SatsIcons.Send, contentDescription = null)
}
