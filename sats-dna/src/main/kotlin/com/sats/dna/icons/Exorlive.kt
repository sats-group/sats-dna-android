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
val SatsIcons.Exorlive: ImageVector
    get() {
        if (_exorlive != null) {
            return _exorlive!!
        }

        _exorlive = materialIcon(name = "Exorlive") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.2f,
            ) {
                moveTo(20.43f, 8.56f)
                lineToRelative(0.07f, -0.02f)
                lineToRelative(-0.98f, 0.96f)
                curveToRelative(-1.74f, 1.75f, -3.74f, 3.88f, -5.63f, 5.94f)
                lineToRelative(-2.25f, 2.47f)
                lineToRelative(-1.03f, 0.28f)
                curveToRelative(1.97f, -5.2f, 2f, -9.33f, 1.34f, -12.38f)
                curveToRelative(-0.26f, -1.22f, -0.63f, -2.25f, -1.02f, -3.11f)
                curveToRelative(0.4f, 0.41f, 0.78f, 0.84f, 1.12f, 1.24f)
                curveToRelative(0.5f, 0.6f, 0.9f, 1.15f, 1.18f, 1.54f)
                lineToRelative(0.32f, 0.47f)
                lineToRelative(0.07f, 0.11f)
                lineToRelative(0.01f, 0.02f)
                lineToRelative(0.03f, 0.04f)
                verticalLineToRelative(0.02f)
                curveToRelative(0.9f, 1.38f, 2.03f, 2.14f, 3.25f, 2.47f)
                curveToRelative(1.2f, 0.32f, 2.44f, 0.21f, 3.52f, -0.05f)
                close()
                moveToRelative(0.44f, 7.85f)
                curveToRelative(-0.27f, 0.17f, -0.59f, 0.34f, -0.95f, 0.52f)
                lineToRelative(0.06f, -0.1f)
                lineToRelative(1.29f, -0.97f)
                horizontalLineToRelative(-1.8f)
                curveToRelative(-0.12f, 0f, -0.25f, 0.04f, -0.37f, 0.12f)
                curveToRelative(-0.1f, 0.08f, -0.25f, 0.16f, -0.46f, 0.26f)
                curveToRelative(0.18f, -0.24f, 0.3f, -0.53f, 0.25f, -0.84f)
                curveToRelative(1.22f, 0.06f, 2.02f, 0.19f, 2.5f, 0.34f)
                lineToRelative(0.24f, 0.1f)
                curveToRelative(-0.13f, 0.15f, -0.37f, 0.34f, -0.76f, 0.57f)
                close()
                moveToRelative(-1.03f, 0.53f)
                verticalLineToRelative(-0.01f)
                lineToRelative(-0.01f, 0.01f)
                close()
                moveToRelative(1.86f, -1.2f)
                close()
                moveTo(18.9f, 5.2f)
                curveToRelative(0f, 0.57f, -0.52f, 1.12f, -1.28f, 1.12f)
                curveToRelative(-0.75f, 0f, -1.27f, -0.55f, -1.27f, -1.12f)
                curveToRelative(0f, -0.57f, 0.52f, -1.12f, 1.27f, -1.12f)
                reflectiveCurveTo(18.9f, 4.63f, 18.9f, 5.2f)
                close()
            }
        }

        return _exorlive!!
    }

@Suppress("ObjectPropertyName")
private var _exorlive: ImageVector? = null

@Preview
@Composable
private fun SatsIconExorlivePreview() {
    Icon(SatsIcons.Exorlive, contentDescription = null)
}
