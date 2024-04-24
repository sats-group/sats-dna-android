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
val SatsIcons.Sats: ImageVector
    get() {
        if (_sats != null) {
            return _sats!!
        }

        _sats = materialIcon(name = "Sats") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(14.31f, 11.14f)
                lineToRelative(-1f, -0.88f)
                curveToRelative(-0.6f, -0.52f, -0.94f, -0.94f, -0.94f, -1.53f)
                curveToRelative(0f, -0.74f, 0.53f, -1.4f, 1.64f, -1.4f)
                curveToRelative(0.75f, 0f, 1.45f, 0.27f, 2.09f, 0.9f)
                lineToRelative(2.76f, -2.13f)
                curveToRelative(-0.74f, -1f, -2.24f, -1.96f, -4.45f, -1.96f)
                curveToRelative(-3.26f, 0f, -5.63f, 2.2f, -5.63f, 5.11f)
                curveToRelative(0f, 1.47f, 0.77f, 2.48f, 1.78f, 3.37f)
                lineToRelative(1f, 0.88f)
                curveToRelative(0.69f, 0.63f, 0.98f, 1.02f, 0.98f, 1.56f)
                curveToRelative(0f, 0.82f, -0.56f, 1.6f, -1.98f, 1.6f)
                curveToRelative(-1.05f, 0f, -1.98f, -0.43f, -2.68f, -1.25f)
                lineToRelative(-2.74f, 2.13f)
                curveToRelative(1.03f, 1.3f, 2.78f, 2.32f, 5.17f, 2.32f)
                curveToRelative(3.69f, 0f, 5.82f, -2.3f, 5.82f, -5.36f)
                curveToRelative(0.02f, -1.54f, -0.86f, -2.51f, -1.82f, -3.36f)
                close()
            }
        }

        return _sats!!
    }

@Suppress("ObjectPropertyName")
private var _sats: ImageVector? = null

@Preview
@Composable
private fun SatsIconSatsPreview() {
    Icon(SatsIcons.Sats, contentDescription = null)
}
