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
val SatsIcons.EditProfileFilled: ImageVector
    get() {
        if (_editProfileFilled != null) {
            return _editProfileFilled!!
        }

        _editProfileFilled = materialIcon(name = "EditProfileFilled") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(9.5f, 12f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                close()
                moveToRelative(11.88f, 3.35f)
                lineToRelative(-5.6f, 5.6f)
                curveTo(15.12f, 21.61f, 14.2f, 22f, 13.24f, 22f)
                horizontalLineToRelative(-0.8f)
                curveToRelative(-0.22f, 0f, -0.4f, -0.19f, -0.4f, -0.42f)
                verticalLineToRelative(-0.8f)
                curveToRelative(0f, -0.95f, 0.37f, -1.87f, 1.05f, -2.55f)
                lineToRelative(5.67f, -5.67f)
                curveToRelative(0.8f, -0.8f, 2.11f, -0.74f, 2.84f, 0.15f)
                curveToRelative(0.64f, 0.77f, 0.5f, 1.93f, -0.2f, 2.64f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(3.25f, 21.98f)
                horizontalLineTo(3.17f)
                curveToRelative(-0.7f, -0.04f, -1.21f, -0.64f, -1.17f, -1.33f)
                curveToRelative(0.26f, -3.92f, 3.55f, -6.99f, 7.49f, -6.99f)
                curveToRelative(0.85f, 0f, 1.7f, 0.15f, 2.5f, 0.43f)
                curveToRelative(0.64f, 0.23f, 0.98f, 0.94f, 0.75f, 1.6f)
                curveToRelative(-0.32f, 0.74f, -1.66f, 1.83f, -2f, 2.79f)
                curveToRelative(-0.22f, 0.58f, -0.33f, 1.21f, -0.33f, 2.19f)
                curveTo(10.33f, 21.5f, 9.95f, 22f, 8.93f, 22f)
                lineToRelative(-5.68f, -0.02f)
                close()
            }
        }

        return _editProfileFilled!!
    }

@Suppress("ObjectPropertyName")
private var _editProfileFilled: ImageVector? = null

@Preview
@Composable
private fun SatsIconEditProfileFilledPreview() {
    Icon(SatsIcons.EditProfileFilled, contentDescription = null)
}
