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
val SatsIcons.Privacy: ImageVector
    get() {
        if (_privacy != null) {
            return _privacy!!
        }

        _privacy = materialIcon(name = "Privacy") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(11.31f, 6.42f)
                verticalLineToRelative(-0.6f)
                curveToRelative(0f, -0.48f, -0.17f, -0.93f, -0.46f, -1.27f)
                curveToRelative(-0.3f, -0.34f, -0.65f, -0.49f, -1.08f, -0.49f)
                curveToRelative(-0.37f, 0f, -0.61f, 0.13f, -0.97f, 0.49f)
                curveToRelative(-0.3f, 0.34f, -0.46f, 0.8f, -0.46f, 1.27f)
                verticalLineTo(15f)
                reflectiveCurveToRelative(-1.9f, -3.51f, -2.2f, -3.89f)
                curveToRelative(-0.32f, -0.38f, -0.76f, -0.41f, -1.07f, -0.38f)
                curveToRelative(-0.24f, 0.06f, -0.47f, 0.2f, -0.65f, 0.4f)
                curveToRelative(-0.23f, 0.25f, -0.4f, 0.52f, -0.4f, 0.88f)
                curveToRelative(-0.01f, 0.37f, 0.05f, 0.77f, 0.23f, 1.12f)
                lineToRelative(2.96f, 6.55f)
                curveToRelative(0.61f, 0.79f, 1.37f, 1.42f, 2.2f, 1.85f)
                curveToRelative(0.85f, 0.44f, 1.77f, 0.66f, 2.7f, 0.66f)
                horizontalLineToRelative(1.38f)
                curveToRelative(0.85f, 0f, 1.7f, -0.19f, 2.49f, -0.56f)
                curveToRelative(0.78f, -0.37f, 1.5f, -0.9f, 2.1f, -1.6f)
                curveToRelative(0.6f, -0.68f, 1.09f, -1.49f, 1.41f, -2.38f)
                curveToRelative(0.33f, -0.9f, 0.5f, -1.85f, 0.5f, -2.82f)
                verticalLineTo(6.96f)
                curveToRelative(0f, -0.32f, -0.09f, -0.64f, -0.26f, -0.89f)
                curveToRelative(-0.17f, -0.21f, -0.5f, -0.6f, -1.12f, -0.6f)
                curveToRelative(-0.55f, 0f, -0.84f, 0.27f, -1.05f, 0.56f)
                curveToRelative(-0.23f, 0.3f, -0.25f, 0.6f, -0.25f, 0.93f)
                verticalLineToRelative(1.2f)
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(14.3f, 5.4f)
                verticalLineTo(4.8f)
                curveToRelative(0f, -0.47f, 0.16f, -0.93f, 0.45f, -1.27f)
                curveToRelative(0.28f, -0.33f, 0.66f, -0.52f, 1.06f, -0.52f)
                reflectiveCurveToRelative(0.77f, 0.19f, 1.06f, 0.52f)
                curveToRelative(0.28f, 0.34f, 0.43f, 0.8f, 0.43f, 1.27f)
                verticalLineToRelative(6.68f)
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(11.3f, 11.4f)
                verticalLineTo(3.6f)
                curveToRelative(0f, -0.47f, 0.17f, -0.93f, 0.45f, -1.27f)
                curveTo(12.03f, 2f, 12.4f, 1.81f, 12.8f, 1.81f)
                reflectiveCurveTo(13.59f, 2f, 13.87f, 2.33f)
                curveToRelative(0.28f, 0.34f, 0.44f, 0.8f, 0.44f, 1.28f)
                verticalLineToRelative(7.79f)
            }
        }

        return _privacy!!
    }

@Suppress("ObjectPropertyName")
private var _privacy: ImageVector? = null

@Preview
@Composable
private fun SatsIconPrivacyPreview() {
    Icon(SatsIcons.Privacy, contentDescription = null)
}
