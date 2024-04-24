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
val SatsIcons.Aqua: ImageVector
    get() {
        if (_aqua != null) {
            return _aqua!!
        }

        _aqua = materialIcon(name = "Aqua") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1f,
            ) {
                moveTo(3.01f, 18.26f)
                lineToRelative(6.93f, -7f)
                lineToRelative(-2.47f, -2.53f)
                curveTo(7.3f, 8.57f, 7.2f, 8.36f, 7.16f, 8.13f)
                curveTo(7.12f, 7.89f, 7.14f, 7.66f, 7.24f, 7.44f)
                lineTo(9.18f, 3.1f)
                curveToRelative(0.1f, -0.24f, 0.3f, -0.42f, 0.54f, -0.52f)
                curveToRelative(0.24f, -0.09f, 0.51f, -0.08f, 0.75f, 0.03f)
                curveToRelative(0.22f, 0.1f, 0.4f, 0.29f, 0.49f, 0.52f)
                curveToRelative(0.1f, 0.23f, 0.1f, 0.49f, 0.02f, 0.72f)
                lineTo(9.6f, 7.67f)
                lineToRelative(7.37f, 7.53f)
                moveTo(0.76f, 21.32f)
                curveToRelative(0.73f, 0f, 1.44f, -0.14f, 2.1f, -0.44f)
                curveToRelative(0.66f, -0.3f, 1.25f, -0.73f, 1.74f, -1.28f)
                curveToRelative(0.49f, 0.54f, 1.08f, 0.98f, 1.74f, 1.27f)
                curveToRelative(0.66f, 0.3f, 1.37f, 0.45f, 2.1f, 0.45f)
                curveToRelative(0.72f, 0f, 1.43f, -0.15f, 2.09f, -0.45f)
                curveToRelative(0.66f, -0.3f, 1.25f, -0.73f, 1.74f, -1.27f)
                curveToRelative(0.47f, 0.52f, 1.03f, 0.94f, 1.66f, 1.24f)
                curveToRelative(0.62f, 0.3f, 1.3f, 0.46f, 2f, 0.48f)
                curveToRelative(0.68f, 0.03f, 1.37f, -0.09f, 2.02f, -0.34f)
                curveToRelative(0.64f, -0.25f, 1.23f, -0.62f, 1.73f, -1.1f)
                curveToRelative(0.97f, 0.93f, 2.25f, 1.45f, 3.58f, 1.44f)
                moveTo(19.51f, 9.45f)
                curveToRelative(0f, 1.27f, -1f, 2.3f, -2.25f, 2.3f)
                curveToRelative(-1.24f, 0f, -2.25f, -1.03f, -2.25f, -2.3f)
                curveToRelative(0f, -1.27f, 1.01f, -2.3f, 2.25f, -2.3f)
                curveToRelative(1.25f, 0f, 2.25f, 1.03f, 2.25f, 2.3f)
                close()
            }
        }

        return _aqua!!
    }

@Suppress("ObjectPropertyName")
private var _aqua: ImageVector? = null

@Preview
@Composable
private fun SatsIconAquaPreview() {
    Icon(SatsIcons.Aqua, contentDescription = null)
}
