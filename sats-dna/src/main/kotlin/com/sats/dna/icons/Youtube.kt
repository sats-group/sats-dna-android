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
val SatsIcons.Youtube: ImageVector
    get() {
        if (_youtube != null) {
            return _youtube!!
        }

        _youtube = materialIcon(name = "Youtube") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(17.08f, 7.7f)
                curveToRelative(0.59f, 0.16f, 1.05f, 0.62f, 1.2f, 1.2f)
                curveToRelative(0.29f, 1.07f, 0.29f, 3.28f, 0.29f, 3.28f)
                reflectiveCurveToRelative(0f, 2.22f, -0.29f, 3.28f)
                curveToRelative(-0.15f, 0.59f, -0.61f, 1.05f, -1.2f, 1.2f)
                curveToRelative(-1.06f, 0.3f, -5.3f, 0.3f, -5.3f, 0.3f)
                reflectiveCurveToRelative(-4.25f, 0f, -5.31f, -0.3f)
                curveToRelative(-0.59f, -0.15f, -1.05f, -0.61f, -1.2f, -1.2f)
                curveToRelative(-0.29f, -1.06f, -0.29f, -3.28f, -0.29f, -3.28f)
                reflectiveCurveToRelative(0f, -2.21f, 0.28f, -3.28f)
                curveToRelative(0.16f, -0.58f, 0.62f, -1.04f, 1.2f, -1.2f)
                curveToRelative(1.07f, -0.28f, 5.31f, -0.28f, 5.31f, -0.28f)
                reflectiveCurveToRelative(4.25f, 0f, 5.31f, 0.28f)
                close()
                moveToRelative(-3.13f, 4.48f)
                lineToRelative(-3.53f, 2.05f)
                verticalLineToRelative(-4.09f)
                lineToRelative(3.53f, 2.04f)
                close()
            }
        }

        return _youtube!!
    }

@Suppress("ObjectPropertyName")
private var _youtube: ImageVector? = null

@Preview
@Composable
private fun SatsIconYoutubePreview() {
    Icon(SatsIcons.Youtube, contentDescription = null)
}
