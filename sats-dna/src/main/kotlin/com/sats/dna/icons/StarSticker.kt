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
val SatsIcons.StarSticker: ImageVector
    get() {
        if (_starSticker != null) {
            return _starSticker!!
        }

        _starSticker = materialIcon(name = "StarSticker") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(24f, 12f)
                curveToRelative(0f, 0.71f, -0.42f, 1.36f, -1.01f, 1.94f)
                curveToRelative(-0.36f, 0.35f, -0.77f, 0.69f, -1.14f, 1.03f)
                curveToRelative(-0.29f, 0.27f, -0.55f, 0.53f, -0.67f, 0.83f)
                curveToRelative(-0.13f, 0.31f, -0.14f, 0.7f, -0.13f, 1.1f)
                curveToRelative(0.01f, 0.5f, 0.07f, 1.03f, 0.07f, 1.53f)
                curveToRelative(0f, 0.83f, -0.15f, 1.57f, -0.63f, 2.06f)
                curveToRelative(-0.5f, 0.48f, -1.23f, 0.64f, -2.06f, 0.63f)
                curveToRelative(-0.5f, 0f, -1.03f, -0.06f, -1.53f, -0.07f)
                curveToRelative(-0.4f, -0.01f, -0.79f, 0f, -1.1f, 0.13f)
                curveToRelative(-0.3f, 0.12f, -0.56f, 0.38f, -0.83f, 0.67f)
                curveToRelative(-0.34f, 0.37f, -0.68f, 0.78f, -1.03f, 1.14f)
                curveTo(13.36f, 23.59f, 12.71f, 24f, 12f, 24f)
                reflectiveCurveToRelative(-1.36f, -0.42f, -1.94f, -1.01f)
                curveToRelative(-0.35f, -0.36f, -0.69f, -0.77f, -1.03f, -1.14f)
                curveToRelative(-0.27f, -0.29f, -0.53f, -0.55f, -0.83f, -0.67f)
                curveToRelative(-0.31f, -0.13f, -0.7f, -0.14f, -1.1f, -0.13f)
                curveToRelative(-0.5f, 0.01f, -1.03f, 0.06f, -1.53f, 0.07f)
                curveToRelative(-0.83f, 0f, -1.57f, -0.15f, -2.06f, -0.63f)
                curveToRelative(-0.48f, -0.5f, -0.64f, -1.23f, -0.63f, -2.06f)
                curveToRelative(0f, -0.5f, 0.06f, -1.03f, 0.07f, -1.53f)
                curveToRelative(0.01f, -0.4f, 0f, -0.79f, -0.13f, -1.1f)
                curveToRelative(-0.12f, -0.3f, -0.38f, -0.56f, -0.67f, -0.83f)
                curveToRelative(-0.37f, -0.34f, -0.78f, -0.68f, -1.14f, -1.03f)
                curveTo(0.41f, 13.36f, 0f, 12.71f, 0f, 12f)
                reflectiveCurveToRelative(0.42f, -1.36f, 1.01f, -1.94f)
                curveTo(1.37f, 9.7f, 1.78f, 9.37f, 2.15f, 9.03f)
                curveTo(2.44f, 8.76f, 2.7f, 8.5f, 2.82f, 8.2f)
                curveTo(2.95f, 7.9f, 2.96f, 7.5f, 2.95f, 7.1f)
                curveTo(2.94f, 6.6f, 2.88f, 6.07f, 2.88f, 5.57f)
                curveToRelative(0f, -0.83f, 0.15f, -1.57f, 0.63f, -2.06f)
                curveTo(4f, 3.03f, 4.74f, 2.87f, 5.57f, 2.88f)
                curveToRelative(0.5f, 0f, 1.03f, 0.06f, 1.53f, 0.07f)
                curveToRelative(0.4f, 0.01f, 0.79f, 0f, 1.1f, -0.13f)
                curveToRelative(0.3f, -0.12f, 0.56f, -0.38f, 0.83f, -0.67f)
                curveTo(9.37f, 1.78f, 9.71f, 1.37f, 10.06f, 1f)
                curveTo(10.64f, 0.41f, 11.29f, 0f, 12f, 0f)
                reflectiveCurveToRelative(1.36f, 0.42f, 1.94f, 1.01f)
                curveToRelative(0.35f, 0.36f, 0.69f, 0.77f, 1.03f, 1.14f)
                curveToRelative(0.27f, 0.29f, 0.53f, 0.55f, 0.83f, 0.67f)
                curveToRelative(0.31f, 0.13f, 0.7f, 0.14f, 1.1f, 0.13f)
                curveToRelative(0.5f, -0.01f, 1.03f, -0.06f, 1.53f, -0.07f)
                curveToRelative(0.83f, 0f, 1.57f, 0.15f, 2.06f, 0.63f)
                curveToRelative(0.48f, 0.5f, 0.64f, 1.23f, 0.63f, 2.06f)
                curveToRelative(0f, 0.5f, -0.06f, 1.03f, -0.07f, 1.53f)
                curveToRelative(-0.01f, 0.4f, 0f, 0.79f, 0.13f, 1.1f)
                curveToRelative(0.12f, 0.3f, 0.38f, 0.56f, 0.67f, 0.83f)
                curveToRelative(0.37f, 0.34f, 0.78f, 0.68f, 1.14f, 1.03f)
                curveTo(23.59f, 10.64f, 24f, 11.29f, 24f, 12f)
                close()
            }
        }

        return _starSticker!!
    }

@Suppress("ObjectPropertyName")
private var _starSticker: ImageVector? = null

@Preview
@Composable
private fun SatsIconStarStickerPreview() {
    Icon(SatsIcons.StarSticker, contentDescription = null)
}
