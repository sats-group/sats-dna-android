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
val SatsIcons.ProfileCard: ImageVector
    get() {
        if (_profileCard != null) {
            return _profileCard!!
        }

        _profileCard = materialIcon(name = "ProfileCard") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(7.91f, 11.42f)
                curveToRelative(1.24f, 0f, 2.24f, -1f, 2.24f, -2.24f)
                curveToRelative(0f, -1.23f, -1f, -2.23f, -2.24f, -2.23f)
                curveToRelative(-1.23f, 0f, -2.24f, 1f, -2.24f, 2.23f)
                curveToRelative(0f, 1.24f, 1f, 2.24f, 2.24f, 2.24f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(7.91f, 12.42f)
                curveToRelative(1.06f, 0f, 2.07f, 0.42f, 2.82f, 1.16f)
                curveToRelative(0.62f, 0.63f, 1.02f, 1.45f, 1.13f, 2.32f)
                curveToRelative(0.03f, 0.27f, -0.2f, 0.5f, -0.47f, 0.5f)
                horizontalLineTo(4.44f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.47f, -0.5f)
                curveToRelative(0.1f, -0.87f, 0.5f, -1.69f, 1.13f, -2.32f)
                curveToRelative(0.75f, -0.74f, 1.76f, -1.16f, 2.81f, -1.16f)
                close()
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.2f,
            ) {
                moveTo(15.3f, 10.52f)
                horizontalLineToRelative(4.44f)
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.2f,
            ) {
                moveTo(15.3f, 14.4f)
                horizontalLineToRelative(4.44f)
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(2.38f, 3.7f)
                curveToRelative(-0.4f, 0f, -0.77f, 0.15f, -1.05f, 0.43f)
                reflectiveCurveTo(0.9f, 4.78f, 0.9f, 5.18f)
                verticalLineToRelative(13.64f)
                curveToRelative(0f, 0.4f, 0.15f, 0.77f, 0.43f, 1.05f)
                reflectiveCurveToRelative(0.65f, 0.44f, 1.05f, 0.44f)
                horizontalLineToRelative(19.24f)
                curveToRelative(0.4f, 0f, 0.77f, -0.16f, 1.05f, -0.44f)
                reflectiveCurveToRelative(0.43f, -0.65f, 0.43f, -1.05f)
                verticalLineTo(5.18f)
                curveToRelative(0f, -0.4f, -0.15f, -0.77f, -0.43f, -1.05f)
                reflectiveCurveTo(22.02f, 3.7f, 21.62f, 3.7f)
                horizontalLineTo(2.38f)
                close()
            }
        }

        return _profileCard!!
    }

@Suppress("ObjectPropertyName")
private var _profileCard: ImageVector? = null

@Preview
@Composable
private fun SatsIconProfileCardPreview() {
    Icon(SatsIcons.ProfileCard, contentDescription = null)
}
