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
val SatsIcons.Cycling: ImageVector
    get() {
        if (_cycling != null) {
            return _cycling!!
        }

        _cycling = materialIcon(name = "Cycling") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1f,
            ) {
                moveTo(4.89f, 23.47f)
                curveTo(7.17f, 23.47f, 9f, 21.6f, 9f, 19.26f)
                reflectiveCurveToRelative(-1.84f, -4.21f, -4.12f, -4.21f)
                curveToRelative(-2.28f, 0f, -4.13f, 1.88f, -4.13f, 4.21f)
                reflectiveCurveToRelative(1.85f, 4.21f, 4.13f, 4.21f)
                close()
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1f,
            ) {
                moveTo(19.14f, 23.47f)
                curveToRelative(2.28f, 0f, 4.12f, -1.88f, 4.12f, -4.21f)
                reflectiveCurveToRelative(-1.84f, -4.21f, -4.12f, -4.21f)
                curveToRelative(-2.28f, 0f, -4.13f, 1.88f, -4.13f, 4.21f)
                reflectiveCurveToRelative(1.85f, 4.21f, 4.13f, 4.21f)
                close()
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1f,
            ) {
                moveTo(17.26f, 6.62f)
                curveToRelative(1.25f, 0f, 2.25f, -1.03f, 2.25f, -2.3f)
                curveToRelative(0f, -1.26f, -1f, -2.3f, -2.25f, -2.3f)
                curveToRelative(-1.24f, 0f, -2.25f, 1.04f, -2.25f, 2.3f)
                curveToRelative(0f, 1.27f, 1.01f, 2.3f, 2.25f, 2.3f)
                close()
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1f,
            ) {
                moveTo(20.13f, 9.98f)
                lineToRelative(-2.83f, -0.3f)
                lineToRelative(-2.63f, -2.26f)
                curveToRelative(-0.35f, -0.28f, -0.78f, -0.43f, -1.22f, -0.41f)
                curveToRelative(-0.45f, 0.01f, -0.87f, 0.19f, -1.2f, 0.5f)
                lineToRelative(-4.12f, 3.82f)
                curveToRelative(-0.36f, 0.35f, -0.58f, 0.82f, -0.6f, 1.33f)
                curveToRelative(-0.03f, 0.5f, 0.14f, 1f, 0.47f, 1.38f)
                curveToRelative(0.48f, 0.58f, 2.89f, 2.33f, 2.89f, 2.33f)
                verticalLineToRelative(5.19f)
                curveToRelative(0f, 0.3f, 0.12f, 0.6f, 0.33f, 0.81f)
                curveToRelative(0.21f, 0.22f, 0.5f, 0.34f, 0.8f, 0.34f)
                curveToRelative(0.3f, 0f, 0.58f, -0.12f, 0.79f, -0.34f)
                curveToRelative(0.21f, -0.22f, 0.33f, -0.5f, 0.33f, -0.81f)
                verticalLineTo(15.8f)
                curveToRelative(0f, -0.17f, -0.04f, -0.34f, -0.11f, -0.5f)
                curveToRelative(-0.08f, -0.16f, -0.19f, -0.3f, -0.32f, -0.4f)
                lineToRelative(-1.54f, -1.22f)
                lineToRelative(3.5f, -3.26f)
                lineToRelative(1.5f, 1.28f)
                curveToRelative(0.2f, 0.18f, 0.45f, 0.27f, 0.72f, 0.27f)
                horizontalLineToRelative(3.14f)
                curveToRelative(0.25f, 0f, 0.5f, -0.1f, 0.68f, -0.27f)
                curveToRelative(0.18f, -0.18f, 0.3f, -0.42f, 0.3f, -0.68f)
                curveToRelative(0.02f, -0.26f, -0.07f, -0.51f, -0.23f, -0.7f)
                curveToRelative(-0.17f, -0.2f, -0.4f, -0.33f, -0.65f, -0.35f)
                close()
            }
        }

        return _cycling!!
    }

@Suppress("ObjectPropertyName")
private var _cycling: ImageVector? = null

@Preview
@Composable
private fun SatsIconCyclingPreview() {
    Icon(SatsIcons.Cycling, contentDescription = null)
}
