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
val SatsIcons.CommentFilled: ImageVector
    get() {
        if (_commentFilled != null) {
            return _commentFilled!!
        }

        _commentFilled = materialIcon(name = "CommentFilled") {
            path(
                fill = SolidColor(Color.Black),
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(18.87f, 15.84f)
                curveTo(20.18f, 14.56f, 21f, 12.96f, 21f, 11.2f)
                curveToRelative(0f, -4f, -4f, -7.2f, -9f, -7.2f)
                reflectiveCurveToRelative(-9f, 3.2f, -9f, 7.2f)
                reflectiveCurveToRelative(4f, 7.2f, 9f, 7.2f)
                curveToRelative(0.9f, 0f, 1.72f, -0.08f, 2.54f, -0.32f)
                lineTo(19.36f, 20f)
                lineToRelative(-0.49f, -4.16f)
                close()
            }
        }

        return _commentFilled!!
    }

@Suppress("ObjectPropertyName")
private var _commentFilled: ImageVector? = null

@Preview
@Composable
private fun SatsIconCommentFilledPreview() {
    Icon(SatsIcons.CommentFilled, contentDescription = null)
}
