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
val SatsIcons.RewardsElixiaFilled: ImageVector
    get() {
        if (_rewardsElixiaFilled != null) {
            return _rewardsElixiaFilled!!
        }

        _rewardsElixiaFilled = materialIcon(name = "RewardsElixiaFilled") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(12f, 23.34f)
                curveToRelative(6.26f, 0f, 11.33f, -5.08f, 11.33f, -11.34f)
                reflectiveCurveTo(18.26f, 0.67f, 12f, 0.67f)
                reflectiveCurveTo(0.66f, 5.74f, 0.66f, 12f)
                reflectiveCurveTo(5.74f, 23.34f, 12f, 23.34f)
                close()
                moveTo(17.64f, 5.7f)
                lineToRelative(-0.8f, 2.82f)
                horizontalLineToRelative(-5.1f)
                lineToRelative(-0.55f, 1.88f)
                horizontalLineToRelative(3.79f)
                lineToRelative(-0.8f, 2.82f)
                horizontalLineToRelative(-3.8f)
                lineToRelative(-0.63f, 2.14f)
                horizontalLineToRelative(5.33f)
                lineToRelative(-0.8f, 2.82f)
                horizontalLineTo(5.73f)
                lineTo(9.33f, 5.7f)
                horizontalLineToRelative(8.31f)
                close()
            }
        }

        return _rewardsElixiaFilled!!
    }

@Suppress("ObjectPropertyName")
private var _rewardsElixiaFilled: ImageVector? = null

@Preview
@Composable
private fun SatsIconRewardsElixiaFilledPreview() {
    Icon(SatsIcons.RewardsElixiaFilled, contentDescription = null)
}
