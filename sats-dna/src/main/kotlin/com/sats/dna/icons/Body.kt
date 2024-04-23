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
val SatsIcons.Body: ImageVector
    get() {
        if (_body != null) {
            return _body!!
        }

        _body = materialIcon(name = "Body") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(12f, 7f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveTo(10.62f, 2f, 12f, 2f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveTo(13.38f, 7f, 12f, 7f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(13.67f, 22f)
                horizontalLineToRelative(-3.34f)
                curveToRelative(-0.46f, 0f, -0.83f, -0.37f, -0.83f, -0.83f)
                verticalLineToRelative(-5f)
                horizontalLineTo(8f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.46f, -0.37f, 0.83f, -0.83f, 0.83f)
                close()
            }
        }

        return _body!!
    }

@Suppress("ObjectPropertyName")
private var _body: ImageVector? = null

@Preview
@Composable
private fun SatsIconBodyPreview() {
    Icon(SatsIcons.Body, contentDescription = null)
}
