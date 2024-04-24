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
val SatsIcons.Share: ImageVector
    get() {
        if (_share != null) {
            return _share!!
        }

        _share = materialIcon(name = "Share") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(19f, 1.75f)
                curveToRelative(-1.24f, 0f, -2.25f, 1f, -2.25f, 2.25f)
                curveToRelative(0f, 1.24f, 1f, 2.25f, 2.25f, 2.25f)
                curveToRelative(1.24f, 0f, 2.25f, -1f, 2.25f, -2.25f)
                curveToRelative(0f, -1.24f, -1f, -2.25f, -2.25f, -2.25f)
                close()
                moveTo(15.25f, 4f)
                curveToRelative(0f, -2.07f, 1.68f, -3.75f, 3.75f, -3.75f)
                curveToRelative(2.07f, 0f, 3.75f, 1.68f, 3.75f, 3.75f)
                curveToRelative(0f, 2.07f, -1.68f, 3.75f, -3.75f, 3.75f)
                curveToRelative(-1.12f, 0f, -2.12f, -0.49f, -2.81f, -1.27f)
                lineToRelative(-7.63f, 4.34f)
                curveToRelative(0.12f, 0.37f, 0.19f, 0.77f, 0.19f, 1.18f)
                curveToRelative(0f, 0.41f, -0.07f, 0.81f, -0.19f, 1.18f)
                lineToRelative(7.63f, 4.34f)
                curveToRelative(0.69f, -0.78f, 1.7f, -1.27f, 2.81f, -1.27f)
                curveToRelative(2.07f, 0f, 3.75f, 1.68f, 3.75f, 3.75f)
                curveToRelative(0f, 2.07f, -1.68f, 3.75f, -3.75f, 3.75f)
                curveToRelative(-2.07f, 0f, -3.75f, -1.68f, -3.75f, -3.75f)
                curveToRelative(0f, -0.41f, 0.07f, -0.81f, 0.19f, -1.18f)
                lineToRelative(-7.63f, -4.34f)
                curveToRelative(-0.69f, 0.78f, -1.7f, 1.27f, -2.81f, 1.27f)
                curveToRelative(-2.07f, 0f, -3.75f, -1.68f, -3.75f, -3.75f)
                curveToRelative(0f, -2.07f, 1.68f, -3.75f, 3.75f, -3.75f)
                curveToRelative(1.12f, 0f, 2.12f, 0.49f, 2.81f, 1.27f)
                lineToRelative(7.63f, -4.34f)
                curveTo(15.32f, 4.81f, 15.25f, 4.41f, 15.25f, 4f)
                close()
                moveTo(5f, 9.75f)
                curveToRelative(-1.24f, 0f, -2.25f, 1f, -2.25f, 2.25f)
                curveToRelative(0f, 1.24f, 1f, 2.25f, 2.25f, 2.25f)
                curveToRelative(1.24f, 0f, 2.25f, -1f, 2.25f, -2.25f)
                curveToRelative(0f, -1.24f, -1f, -2.25f, -2.25f, -2.25f)
                close()
                moveToRelative(14f, 8f)
                curveToRelative(-1.24f, 0f, -2.25f, 1f, -2.25f, 2.25f)
                curveToRelative(0f, 1.24f, 1f, 2.25f, 2.25f, 2.25f)
                curveToRelative(1.24f, 0f, 2.25f, -1f, 2.25f, -2.25f)
                curveToRelative(0f, -1.24f, -1f, -2.25f, -2.25f, -2.25f)
                close()
            }
        }

        return _share!!
    }

@Suppress("ObjectPropertyName")
private var _share: ImageVector? = null

@Preview
@Composable
private fun SatsIconSharePreview() {
    Icon(SatsIcons.Share, contentDescription = null)
}
