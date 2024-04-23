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
val SatsIcons.Phone: ImageVector
    get() {
        if (_phone != null) {
            return _phone!!
        }

        _phone = materialIcon(name = "Phone") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(5.04f, 2.47f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0f)
                lineToRelative(4.29f, 4.29f)
                curveToRelative(0.14f, 0.14f, 0.22f, 0.33f, 0.22f, 0.53f)
                reflectiveCurveToRelative(-0.08f, 0.39f, -0.22f, 0.53f)
                lineTo(8.35f, 9.86f)
                lineToRelative(5.8f, 5.8f)
                lineToRelative(2.03f, -2.05f)
                curveToRelative(0.3f, -0.29f, 0.77f, -0.29f, 1.06f, 0f)
                lineToRelative(4.29f, 4.29f)
                curveToRelative(0.3f, 0.3f, 0.3f, 0.77f, 0f, 1.06f)
                lineToRelative(-2.57f, 2.57f)
                curveToRelative(-0.14f, 0.14f, -0.33f, 0.22f, -0.53f, 0.22f)
                curveToRelative(-8.94f, 0f, -16.18f, -7.24f, -16.18f, -16.18f)
                curveToRelative(0f, -0.2f, 0.08f, -0.39f, 0.22f, -0.53f)
                lineToRelative(2.57f, -2.57f)
                close()
                moveToRelative(0.53f, 1.6f)
                lineToRelative(-1.82f, 1.8f)
                curveToRelative(0.16f, 7.87f, 6.5f, 14.22f, 14.37f, 14.38f)
                lineToRelative(1.82f, -1.82f)
                lineToRelative(-3.23f, -3.23f)
                lineToRelative(-2.04f, 2.04f)
                curveToRelative(-0.29f, 0.3f, -0.76f, 0.3f, -1.06f, 0f)
                lineTo(6.76f, 10.4f)
                curveToRelative(-0.15f, -0.14f, -0.22f, -0.33f, -0.22f, -0.53f)
                reflectiveCurveToRelative(0.07f, -0.4f, 0.22f, -0.53f)
                lineTo(8.8f, 7.29f)
                lineTo(5.57f, 4.06f)
                close()
            }
        }

        return _phone!!
    }

@Suppress("ObjectPropertyName")
private var _phone: ImageVector? = null

@Preview
@Composable
private fun SatsIconPhonePreview() {
    Icon(SatsIcons.Phone, contentDescription = null)
}
