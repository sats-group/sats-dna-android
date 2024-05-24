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
val SatsIcons.ThumbsDown: ImageVector
    get() {
        if (_thumbsDown != null) {
            return _thumbsDown!!
        }

        _thumbsDown = materialIcon(name = "ThumbsDown") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(16.68f, 3f)
                horizontalLineToRelative(4.07f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-4.07f)
                moveToRelative(0f, -9f)
                horizontalLineTo(6.57f)
                curveToRelative(-0.59f, 0f, -1.15f, 0.21f, -1.6f, 0.6f)
                curveToRelative(-0.43f, 0.37f, -0.73f, 0.9f, -0.82f, 1.48f)
                lineToRelative(-0.87f, 5.73f)
                curveToRelative(-0.06f, 0.35f, -0.03f, 0.7f, 0.06f, 1.05f)
                curveToRelative(0.1f, 0.34f, 0.27f, 0.65f, 0.5f, 0.92f)
                curveToRelative(0.23f, 0.27f, 0.51f, 0.48f, 0.83f, 0.63f)
                curveToRelative(0.32f, 0.15f, 0.67f, 0.23f, 1.02f, 0.23f)
                horizontalLineToRelative(6.1f)
                verticalLineToRelative(4.9f)
                curveToRelative(0f, 0.66f, 0.26f, 1.28f, 0.72f, 1.74f)
                curveToRelative(0.46f, 0.46f, 1.08f, 0.72f, 1.73f, 0.72f)
                lineToRelative(2.44f, -9f)
                moveToRelative(0f, -9f)
                verticalLineToRelative(9f)
            }
        }

        return _thumbsDown!!
    }

@Suppress("ObjectPropertyName")
private var _thumbsDown: ImageVector? = null

@Preview
@Composable
private fun SatsIconThumbsDownPreview() {
    Icon(SatsIcons.ThumbsDown, contentDescription = null)
}
