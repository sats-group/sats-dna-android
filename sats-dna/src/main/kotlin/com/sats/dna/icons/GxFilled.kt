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
val SatsIcons.GxFilled: ImageVector
    get() {
        if (_gxFilled != null) {
            return _gxFilled!!
        }

        _gxFilled = materialIcon(name = "GxFilled") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(11.22f, 6.35f)
                curveToRelative(1.2f, 0f, 2.17f, -0.98f, 2.17f, -2.18f)
                curveToRelative(0f, -1.2f, -0.97f, -2.17f, -2.17f, -2.17f)
                reflectiveCurveTo(9.04f, 2.97f, 9.04f, 4.17f)
                reflectiveCurveToRelative(0.98f, 2.18f, 2.18f, 2.18f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(17.3f, 19.3f)
                curveToRelative(-0.02f, -0.1f, -0.08f, -0.18f, -0.16f, -0.25f)
                curveToRelative(-0.07f, -0.06f, -0.17f, -0.1f, -0.27f, -0.1f)
                horizontalLineToRelative(-4.35f)
                curveToRelative(-0.1f, 0f, -0.2f, 0.04f, -0.27f, 0.1f)
                curveToRelative(-0.08f, 0.07f, -0.13f, 0.16f, -0.15f, 0.25f)
                lineToRelative(-0.44f, 2.18f)
                verticalLineToRelative(0.19f)
                curveToRelative(0.02f, 0.06f, 0.05f, 0.12f, 0.09f, 0.17f)
                curveToRelative(0.04f, 0.05f, 0.1f, 0.09f, 0.15f, 0.12f)
                curveToRelative(0.06f, 0.03f, 0.12f, 0.04f, 0.19f, 0.04f)
                horizontalLineToRelative(5.21f)
                curveToRelative(0.07f, 0f, 0.13f, -0.01f, 0.2f, -0.04f)
                curveToRelative(0.05f, -0.03f, 0.1f, -0.07f, 0.14f, -0.12f)
                curveToRelative(0.04f, -0.05f, 0.07f, -0.1f, 0.09f, -0.17f)
                verticalLineToRelative(-0.2f)
                lineTo(17.3f, 19.3f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(11.22f, 15.91f)
                curveToRelative(-0.68f, 0f, -1.34f, -0.23f, -1.88f, -0.65f)
                lineTo(9.1f, 17.02f)
                lineToRelative(-2.02f, 2.82f)
                curveTo(7f, 19.96f, 6.92f, 20.1f, 6.9f, 20.24f)
                curveToRelative(-0.03f, 0.13f, -0.04f, 0.28f, -0.02f, 0.42f)
                curveToRelative(0.03f, 0.14f, 0.08f, 0.28f, 0.15f, 0.4f)
                curveToRelative(0.08f, 0.12f, 0.18f, 0.23f, 0.3f, 0.31f)
                curveToRelative(0.11f, 0.09f, 0.24f, 0.15f, 0.39f, 0.18f)
                curveToRelative(0.14f, 0.03f, 0.28f, 0.04f, 0.42f, 0.01f)
                curveToRelative(0.15f, -0.02f, 0.28f, -0.08f, 0.4f, -0.16f)
                curveToRelative(0.12f, -0.07f, 0.23f, -0.17f, 0.31f, -0.3f)
                lineToRelative(2.17f, -3.04f)
                curveToRelative(0.1f, -0.14f, 0.17f, -0.3f, 0.2f, -0.47f)
                lineToRelative(0.24f, -1.7f)
                curveToRelative(-0.08f, 0.02f, -0.15f, 0.02f, -0.23f, 0.02f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(18.42f, 8.41f)
                curveToRelative(-0.15f, -0.18f, -0.36f, -0.3f, -0.58f, -0.32f)
                curveToRelative(-0.23f, -0.02f, -0.46f, 0.04f, -0.64f, 0.19f)
                lineTo(15.5f, 9.63f)
                lineToRelative(-3.02f, -2f)
                curveToRelative(-0.3f, -0.22f, -0.67f, -0.36f, -1.04f, -0.4f)
                curveToRelative(-0.38f, -0.04f, -0.77f, 0.02f, -1.11f, 0.18f)
                lineTo(6.53f, 9.03f)
                curveTo(6.37f, 9.09f, 6.23f, 9.2f, 6.14f, 9.35f)
                curveTo(6.05f, 9.49f, 6f, 9.65f, 6f, 9.83f)
                verticalLineToRelative(3.04f)
                curveToRelative(0f, 0.23f, 0.1f, 0.45f, 0.25f, 0.61f)
                curveToRelative(0.17f, 0.17f, 0.39f, 0.26f, 0.62f, 0.26f)
                curveToRelative(0.23f, 0f, 0.45f, -0.1f, 0.61f, -0.26f)
                curveToRelative(0.17f, -0.16f, 0.26f, -0.38f, 0.26f, -0.61f)
                verticalLineTo(10.4f)
                lineToRelative(1.3f, -0.56f)
                verticalLineToRelative(3.03f)
                curveToRelative(0.03f, 0.57f, 0.26f, 1.1f, 0.67f, 1.51f)
                curveToRelative(0.4f, 0.4f, 0.94f, 0.64f, 1.5f, 0.66f)
                horizontalLineToRelative(2.3f)
                lineToRelative(0.32f, 2.53f)
                curveToRelative(0.04f, 0.26f, 0.17f, 0.5f, 0.36f, 0.68f)
                curveToRelative(0.2f, 0.17f, 0.46f, 0.27f, 0.72f, 0.27f)
                horizontalLineToRelative(0.14f)
                curveToRelative(0.29f, -0.04f, 0.55f, -0.2f, 0.72f, -0.42f)
                curveToRelative(0.18f, -0.23f, 0.26f, -0.51f, 0.22f, -0.8f)
                lineToRelative(-0.43f, -3.48f)
                curveToRelative(-0.04f, -0.26f, -0.16f, -0.5f, -0.36f, -0.68f)
                curveToRelative(-0.2f, -0.17f, -0.46f, -0.27f, -0.72f, -0.27f)
                horizontalLineToRelative(-1.09f)
                verticalLineTo(10.3f)
                lineToRelative(1.7f, 1.11f)
                curveToRelative(0.15f, 0.1f, 0.33f, 0.15f, 0.52f, 0.14f)
                curveToRelative(0.18f, 0f, 0.36f, -0.07f, 0.5f, -0.19f)
                lineToRelative(2.17f, -1.73f)
                curveToRelative(0.18f, -0.15f, 0.3f, -0.36f, 0.32f, -0.59f)
                curveToRelative(0.03f, -0.23f, -0.04f, -0.46f, -0.18f, -0.64f)
                close()
            }
        }

        return _gxFilled!!
    }

@Suppress("ObjectPropertyName")
private var _gxFilled: ImageVector? = null

@Preview
@Composable
private fun SatsIconGxFilledPreview() {
    Icon(SatsIcons.GxFilled, contentDescription = null)
}
