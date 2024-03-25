package com.sats.dna.icons

import androidx.compose.material.Icon
import androidx.compose.material.icons.materialIcon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import com.sats.dna.SatsIcons

@Suppress("UnusedReceiverParameter") // for convenient access
val SatsIcons.Images: ImageVector
    get() {
        if (_images != null) {
            return _images!!
        }

        _images = materialIcon(name = "Images") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(8.26f, 20.07f)
                horizontalLineTo(19.7f)
                curveToRelative(0.72f, 0f, 1.26f, -0.18f, 1.63f, -0.54f)
                curveToRelative(0.37f, -0.36f, 0.56f, -0.9f, 0.56f, -1.62f)
                verticalLineToRelative(-0.58f)
                lineTo(18f, 13.66f)
                curveToRelative(-0.18f, -0.16f, -0.36f, -0.28f, -0.56f, -0.35f)
                curveToRelative(-0.2f, -0.08f, -0.4f, -0.12f, -0.62f, -0.12f)
                curveToRelative(-0.2f, 0f, -0.4f, 0.04f, -0.6f, 0.1f)
                curveToRelative(-0.18f, 0.08f, -0.36f, 0.2f, -0.54f, 0.37f)
                lineToRelative(-3.43f, 3.01f)
                lineToRelative(-1.35f, -1.22f)
                curveToRelative(-0.16f, -0.15f, -0.33f, -0.26f, -0.5f, -0.33f)
                curveTo(10.22f, 15.04f, 10.05f, 15f, 9.87f, 15f)
                curveToRelative(-0.17f, 0f, -0.34f, 0.03f, -0.5f, 0.1f)
                curveToRelative(-0.16f, 0.08f, -0.32f, 0.18f, -0.49f, 0.33f)
                lineTo(6.06f, 17.9f)
                curveToRelative(0f, 0.73f, 0.18f, 1.27f, 0.55f, 1.63f)
                curveToRelative(0.38f, 0.35f, 0.93f, 0.53f, 1.65f, 0.53f)
                close()
                moveToRelative(3.4f, -6.24f)
                curveToRelative(0.5f, 0f, 0.92f, -0.18f, 1.27f, -0.53f)
                curveToRelative(0.35f, -0.36f, 0.53f, -0.79f, 0.53f, -1.28f)
                curveToRelative(0f, -0.5f, -0.18f, -0.91f, -0.53f, -1.26f)
                curveToRelative(-0.35f, -0.36f, -0.77f, -0.54f, -1.26f, -0.54f)
                curveToRelative(-0.5f, 0f, -0.92f, 0.18f, -1.27f, 0.54f)
                curveToRelative(-0.35f, 0.35f, -0.53f, 0.77f, -0.53f, 1.26f)
                curveToRelative(0f, 0.5f, 0.18f, 0.92f, 0.53f, 1.28f)
                curveToRelative(0.35f, 0.35f, 0.77f, 0.53f, 1.27f, 0.53f)
                close()
                moveToRelative(-7.53f, 2.85f)
                horizontalLineToRelative(2.04f)
                verticalLineToRelative(-1.24f)
                horizontalLineTo(4.15f)
                curveToRelative(-0.44f, 0f, -0.78f, -0.12f, -1.02f, -0.35f)
                curveToRelative(-0.23f, -0.23f, -0.35f, -0.58f, -0.35f, -1.04f)
                verticalLineTo(6.17f)
                curveToRelative(0f, -0.45f, 0.12f, -0.8f, 0.35f, -1.04f)
                curveTo(3.37f, 4.9f, 3.7f, 4.78f, 4.15f, 4.78f)
                horizontalLineTo(15.6f)
                curveToRelative(0.44f, 0f, 0.78f, 0.12f, 1.02f, 0.35f)
                curveToRelative(0.24f, 0.24f, 0.36f, 0.59f, 0.36f, 1.04f)
                verticalLineToRelative(1.7f)
                horizontalLineToRelative(1.24f)
                verticalLineTo(6.11f)
                curveToRelative(0f, -0.85f, -0.22f, -1.49f, -0.65f, -1.92f)
                curveToRelative(-0.44f, -0.42f, -1.09f, -0.64f, -1.94f, -0.64f)
                horizontalLineTo(4.13f)
                curveToRelative(-0.86f, 0f, -1.51f, 0.22f, -1.95f, 0.64f)
                curveToRelative(-0.43f, 0.43f, -0.64f, 1.07f, -0.64f, 1.92f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 0.86f, 0.21f, 1.5f, 0.64f, 1.93f)
                curveToRelative(0.44f, 0.43f, 1.09f, 0.64f, 1.95f, 0.64f)
                close()
                moveToRelative(4.11f, 3.82f)
                horizontalLineToRelative(11.64f)
                curveToRelative(0.86f, 0f, 1.5f, -0.21f, 1.93f, -0.64f)
                curveToRelative(0.44f, -0.43f, 0.65f, -1.07f, 0.65f, -1.92f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -0.86f, -0.21f, -1.5f, -0.65f, -1.92f)
                curveToRelative(-0.43f, -0.43f, -1.07f, -0.65f, -1.93f, -0.65f)
                horizontalLineTo(8.24f)
                curveToRelative(-0.86f, 0f, -1.52f, 0.22f, -1.95f, 0.65f)
                curveToRelative(-0.43f, 0.43f, -0.65f, 1.06f, -0.65f, 1.91f)
                verticalLineToRelative(8.01f)
                curveToRelative(0f, 0.86f, 0.22f, 1.5f, 0.65f, 1.92f)
                curveToRelative(0.43f, 0.43f, 1.09f, 0.64f, 1.95f, 0.64f)
                close()
                moveToRelative(0.02f, -1.23f)
                curveToRelative(-0.44f, 0f, -0.78f, -0.12f, -1.02f, -0.36f)
                curveToRelative(-0.23f, -0.23f, -0.35f, -0.58f, -0.35f, -1.04f)
                verticalLineTo(10f)
                curveToRelative(0f, -0.46f, 0.12f, -0.81f, 0.35f, -1.04f)
                curveTo(7.48f, 8.72f, 7.82f, 8.6f, 8.26f, 8.6f)
                horizontalLineToRelative(11.59f)
                curveToRelative(0.44f, 0f, 0.77f, 0.11f, 1.01f, 0.35f)
                curveToRelative(0.25f, 0.23f, 0.37f, 0.58f, 0.37f, 1.04f)
                verticalLineToRelative(7.87f)
                curveToRelative(0f, 0.46f, -0.12f, 0.8f, -0.37f, 1.04f)
                curveToRelative(-0.24f, 0.24f, -0.57f, 0.36f, -1.01f, 0.36f)
                horizontalLineTo(8.25f)
                close()
            }
        }

        return _images!!
    }

@Suppress("ObjectPropertyName")
private var _images: ImageVector? = null

@Preview
@Composable
private fun SatsIconImagesPreview() {
    Icon(SatsIcons.Images, contentDescription = null)
}
