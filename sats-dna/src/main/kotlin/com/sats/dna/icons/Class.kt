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
val SatsIcons.Class: ImageVector
    get() {
        if (_class != null) {
            return _class!!
        }

        _class = materialIcon(name = "Class") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(17.46f, 7.82f)
                curveToRelative(1.37f, 0f, 2.49f, -1.08f, 2.49f, -2.41f)
                reflectiveCurveTo(18.83f, 3f, 17.45f, 3f)
                curveToRelative(-1.37f, 0f, -2.48f, 1.08f, -2.48f, 2.41f)
                reflectiveCurveToRelative(1.11f, 2.41f, 2.49f, 2.41f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(8.1f, 15.5f)
                curveToRelative(-0.36f, -0.31f, -0.93f, -0.36f, -1.24f, 0f)
                lineToRelative(-3.3f, 3.83f)
                curveToRelative(-0.31f, 0.35f, -0.26f, 0.88f, 0.1f, 1.17f)
                curveToRelative(0.34f, 0.28f, 0.84f, 0.23f, 1.13f, -0.1f)
                lineToRelative(3.42f, -3.96f)
                curveToRelative(0.24f, -0.28f, 0.17f, -0.7f, -0.11f, -0.94f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(20.73f, 12.37f)
                curveToRelative(-0.14f, -0.41f, -0.59f, -0.64f, -1f, -0.5f)
                lineToRelative(-1.9f, 0.6f)
                lineToRelative(-2.58f, -4.04f)
                curveToRelative(-0.08f, -0.12f, -0.17f, -0.24f, -0.28f, -0.34f)
                curveToRelative(-0.22f, -0.17f, -0.47f, -0.3f, -0.74f, -0.36f)
                lineTo(9.4f, 6.25f)
                curveToRelative(-0.17f, -0.05f, -0.35f, -0.05f, -0.52f, 0f)
                curveTo(8.7f, 6.33f, 8.56f, 6.44f, 8.46f, 6.58f)
                lineTo(6.82f, 8.95f)
                curveToRelative(-0.26f, 0.38f, -0.16f, 0.9f, 0.23f, 1.16f)
                curveToRelative(0.37f, 0.24f, 0.87f, 0.14f, 1.12f, -0.23f)
                lineTo(9.5f, 7.96f)
                lineToRelative(2.6f, 0.8f)
                lineToRelative(-3.03f, 3.26f)
                curveToRelative(-0.15f, 0.16f, -0.26f, 0.34f, -0.33f, 0.54f)
                curveToRelative(-0.08f, 0.2f, -0.1f, 0.41f, -0.1f, 0.62f)
                curveToRelative(0.01f, 0.21f, 0.07f, 0.42f, 0.16f, 0.61f)
                curveToRelative(0.1f, 0.2f, 0.23f, 0.36f, 0.4f, 0.5f)
                curveToRelative(0.3f, 0.26f, 3.65f, 2.48f, 3.65f, 2.48f)
                lineToRelative(-2.02f, 1.94f)
                curveToRelative(-0.33f, 0.33f, -0.33f, 0.86f, 0f, 1.18f)
                curveToRelative(0.32f, 0.3f, 0.82f, 0.3f, 1.14f, 0f)
                lineToRelative(2.75f, -2.67f)
                curveToRelative(0.09f, -0.08f, 0.15f, -0.18f, 0.2f, -0.3f)
                curveToRelative(0.04f, -0.1f, 0.05f, -0.22f, 0.04f, -0.34f)
                curveToRelative(0f, -0.11f, -0.05f, -0.23f, -0.1f, -0.33f)
                curveToRelative(-0.07f, -0.1f, -0.15f, -0.19f, -0.25f, -0.26f)
                lineToRelative(-2.88f, -2.02f)
                lineToRelative(3.03f, -3.26f)
                lineToRelative(1.99f, 3.15f)
                curveToRelative(0.07f, 0.12f, 0.18f, 0.22f, 0.3f, 0.28f)
                curveToRelative(0.13f, 0.07f, 0.27f, 0.1f, 0.4f, 0.1f)
                curveToRelative(0.1f, 0f, 0.19f, 0f, 0.27f, -0.04f)
                lineToRelative(2.5f, -0.8f)
                curveToRelative(0.43f, -0.14f, 0.66f, -0.6f, 0.51f, -1.03f)
                close()
            }
        }

        return _class!!
    }

@Suppress("ObjectPropertyName")
private var _class: ImageVector? = null

@Preview
@Composable
private fun SatsIconClassPreview() {
    Icon(SatsIcons.Class, contentDescription = null)
}
