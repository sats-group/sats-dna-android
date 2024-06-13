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
val SatsIcons.Confirm: ImageVector
    get() {
        if (_confirm != null) {
            return _confirm!!
        }

        _confirm = materialIcon(name = "Confirm") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(17.3f, 8.69f)
                curveToRelative(0.3f, 0.3f, 0.3f, 0.77f, 0f, 1.06f)
                lineToRelative(-6.9f, 6.9f)
                lineToRelative(-3.7f, -3.72f)
                curveToRelative(-0.3f, -0.3f, -0.3f, -0.77f, 0f, -1.06f)
                curveToRelative(0.29f, -0.3f, 0.76f, -0.3f, 1.06f, 0f)
                lineToRelative(2.65f, 2.65f)
                lineToRelative(5.83f, -5.83f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(3.32f, 12f)
                curveToRelative(0f, 4.8f, 3.89f, 8.68f, 8.68f, 8.68f)
                curveToRelative(4.8f, 0f, 8.68f, -3.89f, 8.68f, -8.68f)
                curveToRelative(0f, -4.8f, -3.89f, -8.68f, -8.68f, -8.68f)
                curveToRelative(-4.8f, 0f, -8.68f, 3.89f, -8.68f, 8.68f)
                close()
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                close()
            }
        }

        return _confirm!!
    }

@Suppress("ObjectPropertyName")
private var _confirm: ImageVector? = null

@Preview
@Composable
private fun SatsIconConfirmPreview() {
    Icon(SatsIcons.Confirm, contentDescription = null)
}
