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
val SatsIcons.StarStickerCheck: ImageVector
    get() {
        if (_starStickerCheck != null) {
            return _starStickerCheck!!
        }

        _starStickerCheck = materialIcon(name = "StarStickerCheck") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(22.99f, 13.94f)
                curveTo(23.59f, 13.36f, 24f, 12.71f, 24f, 12f)
                reflectiveCurveToRelative(-0.42f, -1.36f, -1.01f, -1.94f)
                curveToRelative(-0.2f, -0.2f, -0.43f, -0.4f, -0.66f, -0.6f)
                lineToRelative(-0.48f, -0.43f)
                curveTo(21.56f, 8.76f, 21.3f, 8.5f, 21.18f, 8.2f)
                curveToRelative(-0.13f, -0.31f, -0.14f, -0.7f, -0.13f, -1.1f)
                lineToRelative(0.03f, -0.69f)
                curveToRelative(0.02f, -0.28f, 0.04f, -0.56f, 0.04f, -0.84f)
                curveToRelative(0f, -0.83f, -0.15f, -1.57f, -0.63f, -2.06f)
                curveToRelative(-0.5f, -0.48f, -1.23f, -0.64f, -2.06f, -0.63f)
                curveToRelative(-0.27f, 0f, -0.56f, 0.02f, -0.84f, 0.04f)
                lineTo(16.9f, 2.95f)
                curveToRelative(-0.4f, 0.01f, -0.79f, 0f, -1.1f, -0.13f)
                curveToRelative(-0.3f, -0.12f, -0.56f, -0.38f, -0.83f, -0.67f)
                lineToRelative(-0.43f, -0.48f)
                lineToRelative(-0.6f, -0.66f)
                curveTo(13.36f, 0.41f, 12.71f, 0f, 12f, 0f)
                reflectiveCurveToRelative(-1.36f, 0.42f, -1.94f, 1.01f)
                curveToRelative(-0.2f, 0.2f, -0.4f, 0.44f, -0.6f, 0.66f)
                lineTo(9.03f, 2.15f)
                curveTo(8.76f, 2.44f, 8.5f, 2.7f, 8.2f, 2.82f)
                curveTo(7.89f, 2.95f, 7.5f, 2.96f, 7.1f, 2.95f)
                lineTo(6.4f, 2.92f)
                curveTo(6.14f, 2.9f, 5.85f, 2.88f, 5.58f, 2.88f)
                curveTo(4.74f, 2.88f, 4f, 3.03f, 3.51f, 3.51f)
                curveToRelative(-0.48f, 0.5f, -0.64f, 1.23f, -0.63f, 2.06f)
                curveToRelative(0f, 0.28f, 0.02f, 0.56f, 0.04f, 0.84f)
                lineTo(2.95f, 7.1f)
                curveToRelative(0.01f, 0.4f, 0f, 0.79f, -0.13f, 1.1f)
                curveTo(2.7f, 8.5f, 2.44f, 8.76f, 2.15f, 9.03f)
                lineTo(1.66f, 9.47f)
                lineToRelative(-0.65f, 0.59f)
                curveTo(0.41f, 10.64f, 0f, 11.29f, 0f, 12f)
                reflectiveCurveToRelative(0.42f, 1.36f, 1.01f, 1.94f)
                curveToRelative(0.2f, 0.2f, 0.43f, 0.4f, 0.65f, 0.6f)
                lineToRelative(0.49f, 0.43f)
                curveToRelative(0.29f, 0.27f, 0.55f, 0.53f, 0.67f, 0.83f)
                curveToRelative(0.13f, 0.31f, 0.14f, 0.7f, 0.13f, 1.1f)
                lineTo(2.92f, 17.6f)
                curveToRelative(-0.02f, 0.28f, -0.04f, 0.56f, -0.04f, 0.84f)
                curveToRelative(0f, 0.83f, 0.15f, 1.57f, 0.63f, 2.06f)
                curveToRelative(0.49f, 0.48f, 1.23f, 0.64f, 2.06f, 0.63f)
                curveToRelative(0.27f, 0f, 0.56f, -0.02f, 0.84f, -0.04f)
                lineToRelative(0.69f, -0.03f)
                curveToRelative(0.4f, -0.01f, 0.79f, 0f, 1.1f, 0.13f)
                curveToRelative(0.3f, 0.12f, 0.56f, 0.38f, 0.83f, 0.67f)
                lineToRelative(0.43f, 0.48f)
                lineToRelative(0.6f, 0.66f)
                curveTo(10.64f, 23.59f, 11.29f, 24f, 12f, 24f)
                reflectiveCurveToRelative(1.36f, -0.42f, 1.94f, -1.01f)
                curveToRelative(0.2f, -0.2f, 0.4f, -0.44f, 0.6f, -0.66f)
                lineToRelative(0.43f, -0.48f)
                curveToRelative(0.27f, -0.29f, 0.53f, -0.55f, 0.83f, -0.67f)
                curveToRelative(0.31f, -0.13f, 0.7f, -0.14f, 1.1f, -0.13f)
                lineToRelative(0.7f, 0.03f)
                curveToRelative(0.27f, 0.02f, 0.56f, 0.04f, 0.83f, 0.04f)
                curveToRelative(0.83f, 0f, 1.57f, -0.15f, 2.06f, -0.63f)
                curveToRelative(0.48f, -0.5f, 0.64f, -1.23f, 0.63f, -2.06f)
                curveToRelative(0f, -0.28f, -0.02f, -0.56f, -0.04f, -0.84f)
                lineToRelative(-0.03f, -0.69f)
                curveToRelative(-0.01f, -0.4f, 0f, -0.79f, 0.13f, -1.1f)
                curveToRelative(0.12f, -0.3f, 0.38f, -0.56f, 0.67f, -0.83f)
                lineToRelative(0.48f, -0.43f)
                lineToRelative(0.66f, -0.6f)
                close()
                moveTo(9.52f, 16.6f)
                curveToRelative(0.32f, 0.42f, 0.65f, 0.58f, 1.05f, 0.58f)
                curveToRelative(0.41f, 0f, 0.76f, -0.18f, 1f, -0.58f)
                lineToRelative(4.77f, -7.53f)
                curveToRelative(0.16f, -0.24f, 0.3f, -0.52f, 0.3f, -0.79f)
                curveToRelative(0f, -0.57f, -0.47f, -0.92f, -1f, -0.92f)
                curveToRelative(-0.33f, 0f, -0.64f, 0.19f, -0.85f, 0.56f)
                lineToRelative(-4.26f, 6.89f)
                lineToRelative(-1.92f, -2.56f)
                curveToRelative(-0.3f, -0.4f, -0.58f, -0.51f, -0.91f, -0.51f)
                curveToRelative(-0.55f, 0f, -0.96f, 0.44f, -0.96f, 0.99f)
                curveToRelative(0f, 0.26f, 0.1f, 0.53f, 0.28f, 0.76f)
                lineToRelative(2.5f, 3.1f)
                close()
            }
        }

        return _starStickerCheck!!
    }

@Suppress("ObjectPropertyName")
private var _starStickerCheck: ImageVector? = null

@Preview
@Composable
private fun SatsIconStarStickerCheckPreview() {
    Icon(SatsIcons.StarStickerCheck, contentDescription = null)
}
