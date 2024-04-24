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
val SatsIcons.PrivacyPolicy: ImageVector
    get() {
        if (_privacyPolicy != null) {
            return _privacyPolicy!!
        }

        _privacyPolicy = materialIcon(name = "PrivacyPolicy") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(13.8f, 7.71f)
                lineToRelative(-1.96f, 1.96f)
                curveToRelative(-0.67f, 0.67f, -1.59f, 1.05f, -2.55f, 1.05f)
                curveToRelative(-0.95f, 0f, -1.87f, -0.38f, -2.54f, -1.05f)
                lineTo(6.59f, 9.5f)
                lineToRelative(4.44f, -4.44f)
                curveToRelative(1.2f, -1.2f, 2.82f, -1.87f, 4.51f, -1.87f)
                curveToRelative(1.7f, 0f, 3.31f, 0.67f, 4.5f, 1.87f)
                verticalLineToRelative(0f)
                curveToRelative(1.01f, 1f, 1.65f, 2.31f, 1.83f, 3.72f)
                curveToRelative(0.17f, 1.41f, -0.13f, 2.84f, -0.86f, 4.06f)
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(14.94f, 10.66f)
                lineToRelative(3.26f, 3.25f)
                curveToRelative(0.5f, 0.51f, 0.8f, 1.2f, 0.8f, 1.91f)
                curveToRelative(0f, 0.72f, -0.3f, 1.41f, -0.8f, 1.92f)
                lineToRelative(-1.47f, 1.47f)
                curveToRelative(-0.5f, 0.5f, -1.1f, 0.9f, -1.76f, 1.17f)
                curveToRelative(-0.66f, 0.28f, -1.36f, 0.42f, -2.07f, 0.42f)
                curveToRelative(-0.7f, 0f, -1.41f, -0.14f, -2.07f, -0.42f)
                curveToRelative(-0.66f, -0.27f, -1.25f, -0.67f, -1.75f, -1.17f)
                lineTo(3.95f, 14.1f)
                curveToRelative(-1.2f, -1.2f, -1.87f, -2.82f, -1.87f, -4.51f)
                curveToRelative(0f, -1.7f, 0.67f, -3.31f, 1.87f, -4.51f)
                verticalLineToRelative(0f)
                curveTo(5.13f, 3.89f, 6.72f, 3.22f, 8.39f, 3.2f)
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(17.76f, 18.18f)
                lineToRelative(-3.5f, -3.51f)
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(15.17f, 20.3f)
                lineToRelative(-3.28f, -3.27f)
            }
        }

        return _privacyPolicy!!
    }

@Suppress("ObjectPropertyName")
private var _privacyPolicy: ImageVector? = null

@Preview
@Composable
private fun SatsIconPrivacyPolicyPreview() {
    Icon(SatsIcons.PrivacyPolicy, contentDescription = null)
}
