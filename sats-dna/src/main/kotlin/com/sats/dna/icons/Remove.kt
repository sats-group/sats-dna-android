package com.sats.dna.icons

import androidx.compose.material.Icon
import androidx.compose.material.icons.materialIcon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import com.sats.dna.SatsIcons

@Suppress("UnusedReceiverParameter") // for convenient access
val SatsIcons.Remove: ImageVector
    get() {
        if (_remove != null) {
            return _remove!!
        }

        _remove = materialIcon(name = "Remove") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(12f, 2.75f)
                curveToRelative(-5.1f, 0f, -9.25f, 4.14f, -9.25f, 9.25f)
                curveToRelative(0f, 5.1f, 4.14f, 9.25f, 9.25f, 9.25f)
                curveToRelative(5.1f, 0f, 9.25f, -4.14f, 9.25f, -9.25f)
                curveToRelative(0f, -5.1f, -4.14f, -9.25f, -9.25f, -9.25f)
                close()
                moveTo(1.25f, 12f)
                curveTo(1.25f, 6.06f, 6.06f, 1.25f, 12f, 1.25f)
                reflectiveCurveTo(22.75f, 6.06f, 22.75f, 12f)
                reflectiveCurveTo(17.94f, 22.75f, 12f, 22.75f)
                reflectiveCurveTo(1.25f, 17.94f, 1.25f, 12f)
                close()
                moveToRelative(6.58f, -4.17f)
                curveToRelative(0.3f, -0.29f, 0.77f, -0.29f, 1.06f, 0f)
                lineToRelative(3.11f, 3.1f)
                lineToRelative(3.1f, -3.1f)
                curveToRelative(0.3f, -0.29f, 0.77f, -0.29f, 1.07f, 0f)
                curveToRelative(0.29f, 0.3f, 0.29f, 0.77f, 0f, 1.06f)
                lineTo(13.07f, 12f)
                lineToRelative(3.1f, 3.1f)
                curveToRelative(0.29f, 0.3f, 0.29f, 0.77f, 0f, 1.07f)
                curveToRelative(-0.3f, 0.29f, -0.77f, 0.29f, -1.06f, 0f)
                lineTo(12f, 13.07f)
                lineToRelative(-3.1f, 3.1f)
                curveToRelative(-0.3f, 0.29f, -0.77f, 0.29f, -1.07f, 0f)
                curveToRelative(-0.29f, -0.3f, -0.29f, -0.77f, 0f, -1.06f)
                lineToRelative(3.1f, -3.11f)
                lineToRelative(-3.1f, -3.1f)
                curveToRelative(-0.29f, -0.3f, -0.29f, -0.77f, 0f, -1.07f)
                close()
            }
        }

        return _remove!!
    }

@Suppress("ObjectPropertyName")
private var _remove: ImageVector? = null

@Preview
@Composable
private fun SatsIconRemovePreview() {
    Icon(SatsIcons.Remove, contentDescription = null)
}
