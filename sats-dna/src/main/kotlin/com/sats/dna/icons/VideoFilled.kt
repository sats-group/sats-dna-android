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
val SatsIcons.VideoFilled: ImageVector
    get() {
        if (_videoFilled != null) {
            return _videoFilled!!
        }

        _videoFilled = materialIcon(name = "VideoFilled") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(21f, 9.87f)
                curveToRelative(0f, -0.75f, -0.78f, -1.23f, -1.45f, -0.9f)
                lineTo(16.5f, 10.5f)
                verticalLineTo(8.25f)
                curveToRelative(0f, -0.6f, -0.24f, -1.17f, -0.66f, -1.6f)
                curveToRelative(-0.42f, -0.41f, -1f, -0.65f, -1.59f, -0.65f)
                horizontalLineToRelative(-9f)
                curveToRelative(-0.6f, 0f, -1.17f, 0.24f, -1.6f, 0.66f)
                curveTo(3.25f, 7.08f, 3f, 7.66f, 3f, 8.25f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 0.6f, 0.24f, 1.17f, 0.66f, 1.6f)
                curveToRelative(0.42f, 0.41f, 1f, 0.65f, 1.59f, 0.65f)
                horizontalLineToRelative(9f)
                curveToRelative(0.6f, 0f, 1.17f, -0.24f, 1.6f, -0.66f)
                curveToRelative(0.41f, -0.42f, 0.65f, -1f, 0.65f, -1.59f)
                verticalLineTo(15f)
                lineToRelative(3.05f, 1.53f)
                curveToRelative(0.67f, 0.33f, 1.45f, -0.15f, 1.45f, -0.9f)
                verticalLineTo(9.87f)
                close()
            }
        }

        return _videoFilled!!
    }

@Suppress("ObjectPropertyName")
private var _videoFilled: ImageVector? = null

@Preview
@Composable
private fun SatsIconVideoFilledPreview() {
    Icon(SatsIcons.VideoFilled, contentDescription = null)
}
