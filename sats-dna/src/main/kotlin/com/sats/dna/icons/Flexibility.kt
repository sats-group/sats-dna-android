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
val SatsIcons.Flexibility: ImageVector
    get() {
        if (_flexibility != null) {
            return _flexibility!!
        }

        _flexibility = materialIcon(name = "Flexibility") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1f,
            ) {
                moveTo(9.28f, 17.27f)
                lineToRelative(0.9f, 3.38f)
                curveToRelative(0.04f, 0.14f, 0.1f, 0.28f, 0.2f, 0.4f)
                curveToRelative(0.08f, 0.13f, 0.2f, 0.23f, 0.32f, 0.3f)
                curveToRelative(0.13f, 0.08f, 0.27f, 0.13f, 0.42f, 0.15f)
                curveToRelative(0.15f, 0.02f, 0.3f, 0.01f, 0.45f, -0.03f)
                curveToRelative(0.14f, -0.04f, 0.27f, -0.1f, 0.4f, -0.2f)
                curveToRelative(0.1f, -0.1f, 0.2f, -0.21f, 0.28f, -0.34f)
                curveToRelative(0.07f, -0.14f, 0.12f, -0.28f, 0.13f, -0.44f)
                curveToRelative(0.02f, -0.15f, 0f, -0.3f, -0.04f, -0.45f)
                lineToRelative(-1.41f, -5.32f)
                lineToRelative(3.5f, -1.8f)
                lineToRelative(2.54f, 5.33f)
                curveToRelative(0.05f, 0.12f, 0.12f, 0.23f, 0.2f, 0.32f)
                curveToRelative(0.1f, 0.1f, 0.2f, 0.17f, 0.32f, 0.22f)
                curveToRelative(0.12f, 0.05f, 0.24f, 0.07f, 0.37f, 0.07f)
                reflectiveCurveToRelative(0.25f, -0.03f, 0.37f, -0.08f)
                curveToRelative(0.12f, -0.06f, 0.22f, -0.13f, 0.3f, -0.23f)
                curveToRelative(0.1f, -0.1f, 0.16f, -0.2f, 0.2f, -0.33f)
                curveToRelative(0.04f, -0.12f, 0.06f, -0.25f, 0.05f, -0.38f)
                curveToRelative(0f, -0.13f, -0.04f, -0.26f, -0.1f, -0.38f)
                lineToRelative(-2.26f, -5.63f)
                lineToRelative(-0.08f, -0.14f)
                lineToRelative(-2.63f, -4.22f)
                curveToRelative(-0.06f, -0.1f, -0.13f, -0.18f, -0.21f, -0.25f)
                lineTo(7.94f, 2.58f)
                curveTo(7.84f, 2.5f, 7.74f, 2.43f, 7.62f, 2.4f)
                curveTo(7.5f, 2.35f, 7.38f, 2.33f, 7.25f, 2.34f)
                curveTo(7.13f, 2.35f, 7.01f, 2.38f, 6.9f, 2.44f)
                curveTo(6.79f, 2.5f, 6.69f, 2.58f, 6.6f, 2.67f)
                curveTo(6.54f, 2.77f, 6.48f, 2.87f, 6.44f, 3f)
                curveTo(6.39f, 3.12f, 6.38f, 3.25f, 6.39f, 3.37f)
                curveToRelative(0f, 0.13f, 0.04f, 0.25f, 0.1f, 0.36f)
                curveToRelative(0.05f, 0.11f, 0.13f, 0.21f, 0.23f, 0.3f)
                lineToRelative(4.87f, 4.53f)
                lineToRelative(-3.98f, 2.02f)
                curveTo(7.28f, 10.75f, 7f, 11f, 6.76f, 11.28f)
                curveToRelative(-0.24f, 0.3f, -0.4f, 0.63f, -0.5f, 1f)
                lineToRelative(-2.08f, 7.76f)
                curveToRelative(-0.02f, 0.1f, -0.04f, 0.2f, -0.04f, 0.3f)
                curveToRelative(0f, 0.28f, 0.1f, 0.55f, 0.28f, 0.76f)
                curveToRelative(0.17f, 0.21f, 0.42f, 0.35f, 0.7f, 0.38f)
                curveToRelative(0.26f, 0.04f, 0.54f, -0.02f, 0.76f, -0.18f)
                curveToRelative(0.23f, -0.15f, 0.4f, -0.39f, 0.46f, -0.65f)
                lineToRelative(1.74f, -6.47f)
                moveToRelative(12.56f, -6.86f)
                curveToRelative(0f, 1.27f, -1f, 2.3f, -2.25f, 2.3f)
                curveToRelative(-1.24f, 0f, -2.25f, -1.03f, -2.25f, -2.3f)
                curveToRelative(0f, -1.27f, 1f, -2.3f, 2.25f, -2.3f)
                curveToRelative(1.24f, 0f, 2.25f, 1.03f, 2.25f, 2.3f)
                close()
            }
        }

        return _flexibility!!
    }

@Suppress("ObjectPropertyName")
private var _flexibility: ImageVector? = null

@Preview
@Composable
private fun SatsIconFlexibilityPreview() {
    Icon(SatsIcons.Flexibility, contentDescription = null)
}
