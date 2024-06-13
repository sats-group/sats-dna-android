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
val SatsIcons.EditProfile: ImageVector
    get() {
        if (_editProfile != null) {
            return _editProfile!!
        }

        _editProfile = materialIcon(name = "EditProfile") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(9.5f, 12f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                close()
                moveToRelative(0f, -8.33f)
                curveToRelative(1.84f, 0f, 3.33f, 1.5f, 3.33f, 3.33f)
                curveToRelative(0f, 1.84f, -1.5f, 3.33f, -3.33f, 3.33f)
                curveToRelative(-1.84f, 0f, -3.33f, -1.5f, -3.33f, -3.33f)
                curveToRelative(0f, -1.84f, 1.5f, -3.33f, 3.33f, -3.33f)
                close()
                moveToRelative(1.46f, 11.85f)
                curveToRelative(-0.47f, -0.12f, -0.97f, -0.19f, -1.46f, -0.19f)
                curveToRelative(-3.22f, 0f, -5.83f, 2.62f, -5.83f, 5.84f)
                curveToRelative(0f, 0.46f, -0.38f, 0.83f, -0.84f, 0.83f)
                curveTo(2.37f, 22f, 2f, 21.63f, 2f, 21.17f)
                curveToRelative(0f, -4.14f, 3.37f, -7.5f, 7.5f, -7.5f)
                curveToRelative(0.64f, 0f, 1.27f, 0.08f, 1.88f, 0.23f)
                curveToRelative(0.44f, 0.12f, 0.7f, 0.57f, 0.6f, 1.02f)
                curveToRelative(-0.12f, 0.44f, -0.57f, 0.71f, -1.02f, 0.6f)
                close()
                moveToRelative(10.3f, -3.62f)
                curveToRelative(-0.94f, -0.95f, -2.58f, -0.95f, -3.53f, 0f)
                lineToRelative(-5.59f, 5.59f)
                curveToRelative(-0.63f, 0.63f, -0.97f, 1.47f, -0.97f, 2.36f)
                verticalLineToRelative(1.32f)
                curveToRelative(0f, 0.46f, 0.37f, 0.83f, 0.83f, 0.83f)
                horizontalLineToRelative(1.32f)
                curveToRelative(0.9f, 0f, 1.73f, -0.35f, 2.36f, -0.98f)
                lineToRelative(5.59f, -5.58f)
                curveToRelative(0.47f, -0.48f, 0.73f, -1.1f, 0.73f, -1.77f)
                curveToRelative(0f, -0.67f, -0.26f, -1.3f, -0.73f, -1.77f)
                close()
                moveToRelative(-1.17f, 2.36f)
                lineToRelative(-5.6f, 5.59f)
                curveToRelative(-0.3f, 0.31f, -0.72f, 0.48f, -1.17f, 0.48f)
                horizontalLineToRelative(-0.49f)
                verticalLineToRelative(-0.48f)
                curveToRelative(0f, -0.45f, 0.18f, -0.87f, 0.49f, -1.18f)
                lineToRelative(5.6f, -5.6f)
                curveToRelative(0.3f, -0.3f, 0.85f, -0.3f, 1.17f, 0f)
                curveToRelative(0.16f, 0.16f, 0.24f, 0.37f, 0.24f, 0.6f)
                curveToRelative(0f, 0.22f, -0.08f, 0.43f, -0.24f, 0.59f)
                close()
            }
        }

        return _editProfile!!
    }

@Suppress("ObjectPropertyName")
private var _editProfile: ImageVector? = null

@Preview
@Composable
private fun SatsIconEditProfilePreview() {
    Icon(SatsIcons.EditProfile, contentDescription = null)
}
