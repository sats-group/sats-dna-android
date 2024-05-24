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
val SatsIcons.TiktokPadding: ImageVector
    get() {
        if (_tiktokPadding != null) {
            return _tiktokPadding!!
        }

        _tiktokPadding = materialIcon(name = "TiktokPadding") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(16.28f, 8.4f)
                curveToRelative(-0.67f, -0.42f, -1.16f, -1.1f, -1.31f, -1.88f)
                curveToRelative(-0.04f, -0.17f, -0.05f, -0.34f, -0.05f, -0.52f)
                horizontalLineToRelative(-2.15f)
                verticalLineToRelative(8.27f)
                curveToRelative(-0.04f, 0.92f, -0.84f, 1.67f, -1.81f, 1.67f)
                curveToRelative(-0.3f, 0f, -0.59f, -0.08f, -0.84f, -0.2f)
                curveToRelative(-0.58f, -0.3f, -0.97f, -0.87f, -0.97f, -1.54f)
                curveToRelative(0f, -0.95f, 0.81f, -1.73f, 1.8f, -1.73f)
                curveToRelative(0.2f, 0f, 0.37f, 0.03f, 0.54f, 0.08f)
                verticalLineToRelative(-2.1f)
                curveToRelative(-0.17f, -0.03f, -0.35f, -0.04f, -0.53f, -0.04f)
                curveTo(8.78f, 10.4f, 7f, 12.1f, 7f, 14.2f)
                curveToRelative(0f, 1.28f, 0.67f, 2.41f, 1.69f, 3.1f)
                curveToRelative(0.64f, 0.44f, 1.43f, 0.69f, 2.27f, 0.69f)
                curveToRelative(2.18f, 0f, 3.96f, -1.7f, 3.96f, -3.8f)
                verticalLineToRelative(-4.19f)
                curveToRelative(0.84f, 0.58f, 1.87f, 0.92f, 2.99f, 0.92f)
                verticalLineTo(8.87f)
                curveToRelative(-0.6f, 0f, -1.16f, -0.17f, -1.63f, -0.46f)
                close()
            }
        }

        return _tiktokPadding!!
    }

@Suppress("ObjectPropertyName")
private var _tiktokPadding: ImageVector? = null

@Preview
@Composable
private fun SatsIconTiktokPaddingPreview() {
    Icon(SatsIcons.TiktokPadding, contentDescription = null)
}
