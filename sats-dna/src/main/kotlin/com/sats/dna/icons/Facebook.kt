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
val SatsIcons.Facebook: ImageVector
    get() {
        if (_facebook != null) {
            return _facebook!!
        }

        _facebook = materialIcon(name = "Facebook") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(9.98f, 21f)
                lineToRelative(-0.02f, -8.18f)
                horizontalLineTo(7.12f)
                verticalLineTo(9.55f)
                horizontalLineToRelative(2.84f)
                verticalLineTo(7.5f)
                curveToRelative(0f, -3.04f, 1.63f, -4.5f, 3.98f, -4.5f)
                curveToRelative(1.12f, 0f, 2.09f, 0.1f, 2.37f, 0.14f)
                verticalLineToRelative(3.17f)
                horizontalLineToRelative(-1.63f)
                curveToRelative(-1.27f, 0f, -1.52f, 0.7f, -1.52f, 1.73f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(3.71f)
                lineToRelative(-1.41f, 3.28f)
                horizontalLineToRelative(-2.3f)
                verticalLineTo(21f)
                horizontalLineTo(9.98f)
                close()
            }
        }

        return _facebook!!
    }

@Suppress("ObjectPropertyName")
private var _facebook: ImageVector? = null

@Preview
@Composable
private fun SatsIconFacebookPreview() {
    Icon(SatsIcons.Facebook, contentDescription = null)
}
