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
val SatsIcons.Play: ImageVector
    get() {
        if (_play != null) {
            return _play!!
        }

        _play = materialIcon(name = "Play") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(5.19f, 22.44f)
                curveToRelative(0.22f, 0f, 0.44f, -0.04f, 0.65f, -0.13f)
                curveToRelative(0.2f, -0.08f, 0.42f, -0.19f, 0.66f, -0.33f)
                lineToRelative(14.42f, -8.37f)
                curveToRelative(0.48f, -0.27f, 0.81f, -0.51f, 1f, -0.73f)
                curveToRelative(0.18f, -0.22f, 0.28f, -0.49f, 0.28f, -0.8f)
                curveToRelative(0f, -0.3f, -0.1f, -0.56f, -0.29f, -0.78f)
                curveToRelative(-0.18f, -0.22f, -0.51f, -0.47f, -1f, -0.75f)
                lineTo(6.5f, 2.19f)
                curveTo(6.26f, 2.05f, 6.04f, 1.94f, 5.84f, 1.86f)
                curveTo(5.63f, 1.78f, 5.4f, 1.73f, 5.19f, 1.73f)
                curveToRelative(-0.43f, 0f, -0.78f, 0.15f, -1.03f, 0.46f)
                curveToRelative(-0.24f, 0.3f, -0.36f, 0.7f, -0.36f, 1.2f)
                verticalLineToRelative(17.39f)
                curveToRelative(0f, 0.5f, 0.12f, 0.9f, 0.36f, 1.2f)
                curveToRelative(0.25f, 0.3f, 0.6f, 0.46f, 1.03f, 0.46f)
                close()
            }
        }

        return _play!!
    }

@Suppress("ObjectPropertyName")
private var _play: ImageVector? = null

@Preview
@Composable
private fun SatsIconPlayPreview() {
    Icon(SatsIcons.Play, contentDescription = null)
}
