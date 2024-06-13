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
                moveTo(21.72f, 2.18f)
                curveToRelative(0.22f, 0.18f, 0.32f, 0.46f, 0.27f, 0.74f)
                lineToRelative(-3.7f, 18.46f)
                curveToRelative(-0.05f, 0.26f, -0.23f, 0.48f, -0.48f, 0.57f)
                curveToRelative(-0.24f, 0.1f, -0.52f, 0.05f, -0.73f, -0.1f)
                lineToRelative(-6.13f, -4.6f)
                lineToRelative(-2.98f, 3.55f)
                curveToRelative(-0.2f, 0.25f, -0.54f, 0.34f, -0.85f, 0.23f)
                curveToRelative(-0.3f, -0.11f, -0.5f, -0.4f, -0.5f, -0.72f)
                verticalLineTo(14f)
                lineTo(2.3f, 10.77f)
                curveTo(2.09f, 10.6f, 1.97f, 10.33f, 2f, 10.05f)
                curveToRelative(0.03f, -0.27f, 0.22f, -0.5f, 0.47f, -0.61f)
                lineToRelative(18.47f, -7.38f)
                curveTo(21.2f, 1.95f, 21.5f, 2f, 21.72f, 2.18f)
                close()
                moveTo(8.15f, 15.15f)
                verticalLineToRelative(3.04f)
                lineToRelative(1.57f, -1.86f)
                lineToRelative(-1.57f, -1.18f)
                close()
                moveToRelative(0.64f, -1.44f)
                lineToRelative(11.27f, -9.02f)
                lineToRelative(-3.04f, 15.2f)
                lineTo(8.8f, 13.7f)
                close()
                moveToRelative(7.9f, -8.3f)
                lineToRelative(-9.17f, 7.34f)
                lineToRelative(-3.2f, -2.39f)
                lineTo(16.7f, 5.41f)
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
