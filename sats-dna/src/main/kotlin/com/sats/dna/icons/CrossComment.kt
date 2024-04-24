package com.sats.dna.icons

import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import com.sats.dna.SatsIcons

@Suppress("UnusedReceiverParameter") // for convenient access
val SatsIcons.CrossComment: ImageVector
    get() {
        if (_crossComment != null) {
            return _crossComment!!
        }

        _crossComment = materialIcon(name = "CrossComment") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(10.23f, 5.78f)
                curveToRelative(0f, -0.36f, 0.29f, -0.66f, 0.65f, -0.66f)
                horizontalLineToRelative(8.72f)
                curveToRelative(1.33f, 0f, 2.4f, 1.08f, 2.4f, 2.4f)
                verticalLineToRelative(6.98f)
                curveToRelative(0f, 1.32f, -1.07f, 2.4f, -2.4f, 2.4f)
                horizontalLineToRelative(-9.36f)
                lineTo(5.2f, 21.1f)
                curveToRelative(-0.2f, 0.17f, -0.46f, 0.2f, -0.7f, 0.1f)
                curveToRelative(-0.22f, -0.11f, -0.37f, -0.34f, -0.37f, -0.6f)
                verticalLineToRelative(-8.72f)
                curveToRelative(0f, -0.36f, 0.3f, -0.65f, 0.66f, -0.65f)
                curveToRelative(0.36f, 0f, 0.65f, 0.3f, 0.65f, 0.65f)
                verticalLineToRelative(7.33f)
                lineToRelative(4.16f, -3.47f)
                curveToRelative(0.12f, -0.1f, 0.26f, -0.15f, 0.42f, -0.15f)
                horizontalLineToRelative(9.6f)
                curveToRelative(0.6f, 0f, 1.08f, -0.49f, 1.08f, -1.1f)
                verticalLineTo(7.53f)
                curveToRelative(0f, -0.6f, -0.49f, -1.09f, -1.09f, -1.09f)
                horizontalLineToRelative(-8.72f)
                curveToRelative(-0.36f, 0f, -0.65f, -0.3f, -0.65f, -0.65f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(2.46f, 3.46f)
                curveToRelative(0.26f, -0.25f, 0.67f, -0.25f, 0.93f, 0f)
                lineToRelative(3.7f, 3.7f)
                curveToRelative(0.25f, 0.26f, 0.25f, 0.67f, 0f, 0.93f)
                curveToRelative(-0.26f, 0.25f, -0.67f, 0.25f, -0.93f, 0f)
                lineToRelative(-3.7f, -3.7f)
                curveToRelative(-0.25f, -0.26f, -0.25f, -0.67f, 0f, -0.93f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(2.46f, 8.09f)
                curveToRelative(-0.25f, -0.26f, -0.25f, -0.67f, 0f, -0.93f)
                lineToRelative(3.7f, -3.7f)
                curveToRelative(0.26f, -0.25f, 0.67f, -0.25f, 0.93f, 0f)
                curveToRelative(0.25f, 0.26f, 0.25f, 0.67f, 0f, 0.93f)
                lineToRelative(-3.7f, 3.7f)
                curveToRelative(-0.26f, 0.25f, -0.67f, 0.25f, -0.93f, 0f)
                close()
            }
        }

        return _crossComment!!
    }

@Suppress("ObjectPropertyName")
private var _crossComment: ImageVector? = null

@Preview
@Composable
private fun SatsIconCrossCommentPreview() {
    Icon(SatsIcons.CrossComment, contentDescription = null)
}
