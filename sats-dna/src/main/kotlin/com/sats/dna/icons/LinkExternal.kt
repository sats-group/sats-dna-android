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
val SatsIcons.LinkExternal: ImageVector
    get() {
        if (_linkExternal != null) {
            return _linkExternal!!
        }

        _linkExternal = materialIcon(name = "LinkExternal") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(12f, 12f)
                lineToRelative(9f, -9f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(-6.55f)
                moveTo(21f, 3f)
                verticalLineToRelative(6.55f)
                moveTo(9.55f, 6.27f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineTo(19f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(10.73f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-4.55f)
            }
        }

        return _linkExternal!!
    }

@Suppress("ObjectPropertyName")
private var _linkExternal: ImageVector? = null

@Preview
@Composable
private fun SatsIconLinkExternalPreview() {
    Icon(SatsIcons.LinkExternal, contentDescription = null)
}
