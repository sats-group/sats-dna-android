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
val SatsIcons.Shine: ImageVector
    get() {
        if (_shine != null) {
            return _shine!!
        }

        _shine = materialIcon(name = "Shine") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(18.25f, 22f)
                curveToRelative(-0.17f, 0f, -0.33f, -0.05f, -0.47f, -0.14f)
                curveToRelative(-0.13f, -0.1f, -0.24f, -0.23f, -0.3f, -0.38f)
                lineToRelative(-0.7f, -1.76f)
                lineTo(15f, 18.97f)
                curveToRelative(-0.15f, -0.06f, -0.28f, -0.17f, -0.37f, -0.31f)
                curveToRelative(-0.09f, -0.14f, -0.13f, -0.3f, -0.13f, -0.47f)
                curveToRelative(0f, -0.17f, 0.05f, -0.33f, 0.15f, -0.46f)
                curveToRelative(0.1f, -0.14f, 0.23f, -0.24f, 0.38f, -0.3f)
                lineToRelative(1.74f, -0.66f)
                lineToRelative(0.7f, -1.75f)
                curveToRelative(0.06f, -0.15f, 0.17f, -0.28f, 0.3f, -0.37f)
                curveToRelative(0.14f, -0.1f, 0.3f, -0.14f, 0.47f, -0.14f)
                curveToRelative(0.17f, 0f, 0.33f, 0.05f, 0.47f, 0.14f)
                curveToRelative(0.13f, 0.1f, 0.24f, 0.22f, 0.3f, 0.37f)
                lineToRelative(0.7f, 1.75f)
                lineToRelative(1.76f, 0.7f)
                curveToRelative(0.15f, 0.07f, 0.28f, 0.18f, 0.37f, 0.31f)
                curveToRelative(0.1f, 0.14f, 0.14f, 0.3f, 0.14f, 0.47f)
                curveToRelative(0f, 0.16f, -0.05f, 0.33f, -0.14f, 0.46f)
                curveToRelative(-0.1f, 0.14f, -0.22f, 0.25f, -0.37f, 0.31f)
                lineToRelative(-1.75f, 0.7f)
                lineToRelative(-0.7f, 1.75f)
                curveToRelative(-0.07f, 0.16f, -0.17f, 0.3f, -0.31f, 0.39f)
                curveToRelative(-0.14f, 0.09f, -0.3f, 0.14f, -0.47f, 0.14f)
                close()
                moveToRelative(-7.92f, -2.5f)
                curveToRelative(-0.36f, 0f, -0.7f, -0.1f, -1f, -0.32f)
                curveToRelative(-0.29f, -0.21f, -0.5f, -0.51f, -0.6f, -0.86f)
                lineToRelative(-1.35f, -4.2f)
                lineToRelative(-4.22f, -1.41f)
                curveToRelative(-0.34f, -0.12f, -0.64f, -0.34f, -0.85f, -0.63f)
                curveToRelative(-0.2f, -0.3f, -0.31f, -0.64f, -0.31f, -1f)
                reflectiveCurveToRelative(0.12f, -0.71f, 0.34f, -1f)
                curveToRelative(0.22f, -0.29f, 0.52f, -0.5f, 0.86f, -0.6f)
                lineTo(7.39f, 8.2f)
                lineTo(8.79f, 4f)
                curveTo(8.9f, 3.64f, 9.13f, 3.34f, 9.42f, 3.13f)
                curveToRelative(0.3f, -0.2f, 0.65f, -0.31f, 1.01f, -0.3f)
                curveToRelative(0.36f, 0f, 0.71f, 0.12f, 1f, 0.34f)
                curveToRelative(0.29f, 0.21f, 0.5f, 0.52f, 0.6f, 0.86f)
                lineToRelative(1.28f, 4.18f)
                lineToRelative(4.19f, 1.34f)
                curveToRelative(0.34f, 0.12f, 0.63f, 0.33f, 0.84f, 0.62f)
                curveToRelative(0.2f, 0.3f, 0.32f, 0.64f, 0.32f, 1f)
                curveToRelative(0f, 0.35f, -0.11f, 0.7f, -0.32f, 0.99f)
                curveToRelative(-0.2f, 0.29f, -0.5f, 0.5f, -0.84f, 0.62f)
                lineToRelative(-4.2f, 1.34f)
                lineToRelative(-1.34f, 4.2f)
                curveToRelative(-0.1f, 0.35f, -0.32f, 0.65f, -0.61f, 0.86f)
                curveToRelative(-0.3f, 0.21f, -0.65f, 0.32f, -1f, 0.32f)
                close()
                moveToRelative(0.1f, -14.98f)
                lineToRelative(-1.6f, 4.62f)
                curveToRelative(-0.04f, 0.12f, -0.1f, 0.24f, -0.2f, 0.33f)
                curveToRelative(-0.1f, 0.1f, -0.22f, 0.16f, -0.34f, 0.2f)
                lineToRelative(-4.6f, 1.4f)
                lineToRelative(4.61f, 1.6f)
                curveToRelative(0.13f, 0.04f, 0.24f, 0.11f, 0.33f, 0.2f)
                curveToRelative(0.1f, 0.1f, 0.16f, 0.21f, 0.2f, 0.34f)
                lineToRelative(1.48f, 4.6f)
                lineToRelative(1.52f, -4.6f)
                curveToRelative(0.04f, -0.13f, 0.11f, -0.24f, 0.2f, -0.34f)
                curveToRelative(0.1f, -0.1f, 0.22f, -0.16f, 0.34f, -0.2f)
                lineToRelative(4.61f, -1.48f)
                horizontalLineTo(17f)
                lineToRelative(-4.63f, -1.52f)
                curveToRelative(-0.12f, -0.04f, -0.24f, -0.12f, -0.34f, -0.21f)
                curveToRelative(-0.09f, -0.1f, -0.16f, -0.22f, -0.2f, -0.34f)
                lineToRelative(-1.4f, -4.6f)
                close()
                moveToRelative(8.65f, 3.31f)
                curveToRelative(-0.18f, 0f, -0.36f, -0.06f, -0.5f, -0.17f)
                curveToRelative(-0.15f, -0.12f, -0.26f, -0.28f, -0.3f, -0.46f)
                lineToRelative(-0.3f, -1.19f)
                lineToRelative(-1.2f, -0.32f)
                curveToRelative(-0.18f, -0.05f, -0.33f, -0.16f, -0.45f, -0.3f)
                curveToRelative(-0.1f, -0.15f, -0.17f, -0.33f, -0.16f, -0.52f)
                curveToRelative(0f, -0.19f, 0.07f, -0.36f, 0.18f, -0.5f)
                curveToRelative(0.12f, -0.15f, 0.28f, -0.25f, 0.46f, -0.3f)
                lineToRelative(1.17f, -0.27f)
                lineToRelative(0.3f, -1.17f)
                curveToRelative(0.04f, -0.18f, 0.15f, -0.34f, 0.3f, -0.45f)
                curveTo(18.71f, 2.06f, 18.9f, 2f, 19.07f, 2f)
                curveToRelative(0.19f, 0f, 0.37f, 0.06f, 0.52f, 0.18f)
                curveToRelative(0.14f, 0.11f, 0.25f, 0.27f, 0.3f, 0.45f)
                lineToRelative(0.29f, 1.18f)
                lineToRelative(1.18f, 0.3f)
                curveToRelative(0.18f, 0.04f, 0.34f, 0.15f, 0.45f, 0.3f)
                curveTo(21.94f, 4.54f, 22f, 4.72f, 22f, 4.9f)
                curveToRelative(0f, 0.2f, -0.06f, 0.37f, -0.18f, 0.52f)
                curveToRelative(-0.11f, 0.15f, -0.27f, 0.25f, -0.45f, 0.3f)
                lineToRelative(-1.18f, 0.3f)
                lineToRelative(-0.3f, 1.17f)
                curveToRelative(-0.04f, 0.18f, -0.15f, 0.34f, -0.3f, 0.46f)
                curveToRelative(-0.14f, 0.11f, -0.32f, 0.17f, -0.5f, 0.17f)
                close()
            }
        }

        return _shine!!
    }

@Suppress("ObjectPropertyName")
private var _shine: ImageVector? = null

@Preview
@Composable
private fun SatsIconShinePreview() {
    Icon(SatsIcons.Shine, contentDescription = null)
}
