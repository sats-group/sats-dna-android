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
val SatsIcons.FacebookPadding: ImageVector
    get() {
        if (_facebookPadding != null) {
            return _facebookPadding!!
        }

        _facebookPadding = materialIcon(name = "FacebookPadding") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(14.9f, 12.96f)
                lineToRelative(0.33f, -2.16f)
                horizontalLineToRelative(-2.09f)
                verticalLineTo(9.4f)
                curveToRelative(0f, -0.6f, 0.3f, -1.17f, 1.23f, -1.17f)
                horizontalLineToRelative(0.96f)
                verticalLineTo(6.4f)
                curveToRelative(-0.56f, -0.09f, -1.13f, -0.13f, -1.7f, -0.14f)
                curveToRelative(-1.72f, 0f, -2.84f, 1.03f, -2.84f, 2.9f)
                verticalLineToRelative(1.65f)
                horizontalLineTo(8.88f)
                verticalLineToRelative(2.16f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(5.22f)
                horizontalLineToRelative(2.36f)
                verticalLineToRelative(-5.22f)
                horizontalLineToRelative(1.76f)
                close()
            }
        }

        return _facebookPadding!!
    }

@Suppress("ObjectPropertyName")
private var _facebookPadding: ImageVector? = null

@Preview
@Composable
private fun SatsIconFacebookPaddingPreview() {
    Icon(SatsIcons.FacebookPadding, contentDescription = null)
}
