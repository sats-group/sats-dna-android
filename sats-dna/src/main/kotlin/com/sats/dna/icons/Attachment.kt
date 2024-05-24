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
val SatsIcons.Attachment: ImageVector
    get() {
        if (_attachment != null) {
            return _attachment!!
        }

        _attachment = materialIcon(name = "Attachment") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(10.47f, 3.28f)
                curveToRelative(-1.78f, 0f, -3.2f, 1.41f, -3.2f, 3.19f)
                verticalLineToRelative(9.36f)
                curveToRelative(0f, 2.71f, 2.19f, 4.9f, 4.9f, 4.9f)
                curveToRelative(2.71f, 0f, 4.9f, -2.19f, 4.9f, -4.9f)
                verticalLineTo(5.19f)
                curveToRelative(0f, -0.35f, 0.28f, -0.64f, 0.63f, -0.64f)
                reflectiveCurveToRelative(0.64f, 0.29f, 0.64f, 0.64f)
                verticalLineToRelative(10.64f)
                curveToRelative(0f, 3.42f, -2.75f, 6.17f, -6.17f, 6.17f)
                reflectiveCurveTo(6f, 19.25f, 6f, 15.83f)
                verticalLineTo(6.47f)
                curveTo(6f, 3.99f, 7.99f, 2f, 10.47f, 2f)
                curveToRelative(2.48f, 0f, 4.47f, 1.99f, 4.47f, 4.47f)
                verticalLineToRelative(8.5f)
                curveToRelative(0f, 1.55f, -1.23f, 2.77f, -2.77f, 2.77f)
                reflectiveCurveTo(9.4f, 16.52f, 9.4f, 14.98f)
                verticalLineTo(7.74f)
                curveToRelative(0f, -0.35f, 0.29f, -0.63f, 0.64f, -0.63f)
                curveToRelative(0.36f, 0f, 0.64f, 0.28f, 0.64f, 0.63f)
                verticalLineToRelative(7.24f)
                curveToRelative(0f, 0.84f, 0.65f, 1.49f, 1.49f, 1.49f)
                reflectiveCurveToRelative(1.49f, -0.65f, 1.49f, -1.5f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0f, -1.78f, -1.42f, -3.2f, -3.2f, -3.2f)
                close()
            }
        }

        return _attachment!!
    }

@Suppress("ObjectPropertyName")
private var _attachment: ImageVector? = null

@Preview
@Composable
private fun SatsIconAttachmentPreview() {
    Icon(SatsIcons.Attachment, contentDescription = null)
}
