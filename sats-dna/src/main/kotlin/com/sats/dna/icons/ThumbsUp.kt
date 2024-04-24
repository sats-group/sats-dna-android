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
val SatsIcons.ThumbsUp: ImageVector
    get() {
        if (_thumbsUp != null) {
            return _thumbsUp!!
        }

        _thumbsUp = materialIcon(name = "ThumbsUp") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(7.32f, 21f)
                horizontalLineTo(3.25f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(4.07f)
                moveToRelative(0f, 9f)
                horizontalLineToRelative(10.11f)
                curveToRelative(0.59f, 0f, 1.15f, -0.21f, 1.6f, -0.6f)
                curveToRelative(0.43f, -0.37f, 0.73f, -0.9f, 0.81f, -1.48f)
                lineToRelative(0.88f, -5.73f)
                curveToRelative(0.06f, -0.35f, 0.03f, -0.7f, -0.06f, -1.05f)
                curveToRelative(-0.1f, -0.34f, -0.27f, -0.65f, -0.5f, -0.92f)
                curveToRelative(-0.23f, -0.27f, -0.51f, -0.48f, -0.83f, -0.63f)
                curveToRelative(-0.32f, -0.15f, -0.67f, -0.23f, -1.02f, -0.23f)
                horizontalLineToRelative(-6.1f)
                verticalLineToRelative(-4.9f)
                curveToRelative(0f, -0.66f, -0.26f, -1.28f, -0.72f, -1.74f)
                curveTo(11.03f, 3.26f, 10.4f, 3f, 9.76f, 3f)
                lineToRelative(-2.44f, 9f)
                moveToRelative(0f, 9f)
                verticalLineToRelative(-9f)
            }
        }

        return _thumbsUp!!
    }

@Suppress("ObjectPropertyName")
private var _thumbsUp: ImageVector? = null

@Preview
@Composable
private fun SatsIconThumbsUpPreview() {
    Icon(SatsIcons.ThumbsUp, contentDescription = null)
}
