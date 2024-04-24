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
val SatsIcons.Dance: ImageVector
    get() {
        if (_dance != null) {
            return _dance!!
        }

        _dance = materialIcon(name = "Dance") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1f,
            ) {
                moveTo(15.43f, 13.28f)
                curveToRelative(-0.28f, -0.32f, -0.18f, -0.43f, -0.18f, -2.52f)
                verticalLineToRelative(-1.5f)
                lineToRelative(5.59f, -0.36f)
                horizontalLineToRelative(0f)
                curveToRelative(0.13f, 0f, 0.26f, -0.03f, 0.37f, -0.08f)
                curveToRelative(0.12f, -0.05f, 0.22f, -0.13f, 0.3f, -0.23f)
                curveToRelative(0.1f, -0.1f, 0.16f, -0.2f, 0.2f, -0.33f)
                curveToRelative(0.03f, -0.12f, 0.05f, -0.25f, 0.04f, -0.38f)
                curveToRelative(-0.04f, -0.24f, -0.15f, -0.45f, -0.33f, -0.6f)
                curveToRelative(-0.17f, -0.16f, -0.4f, -0.24f, -0.62f, -0.23f)
                horizontalLineTo(10.03f)
                lineToRelative(-5.84f, -1.8f)
                lineTo(3.9f, 5.18f)
                curveToRelative(-0.21f, 0f, -0.42f, 0.08f, -0.58f, 0.22f)
                curveToRelative(-0.17f, 0.15f, -0.27f, 0.34f, -0.3f, 0.56f)
                curveToRelative(-0.04f, 0.22f, 0f, 0.44f, 0.11f, 0.63f)
                reflectiveCurveTo(3.41f, 6.93f, 3.62f, 7f)
                lineToRelative(6.07f, 2.28f)
                lineToRelative(0.52f, 2.58f)
                moveToRelative(0.08f, 0.77f)
                lineToRelative(0.02f, 9.44f)
                curveToRelative(-0.01f, 0.3f, 0.1f, 0.58f, 0.28f, 0.8f)
                curveToRelative(0.2f, 0.22f, 0.46f, 0.35f, 0.74f, 0.38f)
                curveToRelative(0.15f, 0f, 0.3f, -0.02f, 0.43f, -0.07f)
                curveToRelative(0.14f, -0.05f, 0.27f, -0.13f, 0.37f, -0.24f)
                curveToRelative(0.1f, -0.1f, 0.2f, -0.22f, 0.25f, -0.36f)
                curveToRelative(0.06f, -0.14f, 0.09f, -0.3f, 0.09f, -0.44f)
                lineToRelative(0.26f, -7.72f)
                moveToRelative(3.04f, -0.76f)
                lineToRelative(5.2f, 5.87f)
                curveToRelative(0.19f, 0.21f, 0.3f, 0.5f, 0.3f, 0.78f)
                curveToRelative(0f, 0.3f, -0.1f, 0.57f, -0.3f, 0.78f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.18f, -0.37f, 0.24f)
                curveToRelative(-0.13f, 0.05f, -0.28f, 0.07f, -0.43f, 0.07f)
                curveToRelative(-0.15f, 0f, -0.3f, -0.05f, -0.43f, -0.11f)
                curveToRelative(-0.13f, -0.07f, -0.26f, -0.16f, -0.36f, -0.27f)
                lineToRelative(-6.2f, -6.4f)
                moveTo(9.83f, 2.96f)
                curveTo(9.84f, 4.2f, 10.81f, 5.2f, 12f, 5.2f)
                curveToRelative(1.2f, 0f, 2.17f, -0.99f, 2.17f, -2.22f)
                curveToRelative(0f, -1.23f, -0.97f, -2.22f, -2.17f, -2.22f)
                reflectiveCurveToRelative(-2.16f, 1f, -2.16f, 2.22f)
                close()
            }
        }

        return _dance!!
    }

@Suppress("ObjectPropertyName")
private var _dance: ImageVector? = null

@Preview
@Composable
private fun SatsIconDancePreview() {
    Icon(SatsIcons.Dance, contentDescription = null)
}
