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
val SatsIcons.RewardsElixia: ImageVector
    get() {
        if (_rewardsElixia != null) {
            return _rewardsElixia!!
        }

        _rewardsElixia = materialIcon(name = "RewardsElixia") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(21.84f, 12f)
                curveToRelative(0f, 5.43f, -4.4f, 9.83f, -9.84f, 9.83f)
                curveToRelative(-5.43f, 0f, -9.83f, -4.4f, -9.83f, -9.83f)
                reflectiveCurveTo(6.57f, 2.16f, 12f, 2.16f)
                reflectiveCurveToRelative(9.84f, 4.4f, 9.84f, 9.84f)
                close()
                moveToRelative(1.5f, 0f)
                curveToRelative(0f, 6.26f, -5.08f, 11.33f, -11.34f, 11.33f)
                reflectiveCurveTo(0.67f, 18.26f, 0.67f, 12f)
                reflectiveCurveTo(5.74f, 0.66f, 12f, 0.66f)
                reflectiveCurveTo(23.34f, 5.74f, 23.34f, 12f)
                close()
                moveToRelative(-5.7f, -6.3f)
                lineToRelative(-0.8f, 2.82f)
                horizontalLineToRelative(-5.1f)
                lineToRelative(-0.55f, 1.9f)
                horizontalLineToRelative(3.79f)
                lineToRelative(-0.8f, 2.81f)
                horizontalLineToRelative(-3.8f)
                lineToRelative(-0.62f, 2.14f)
                horizontalLineToRelative(5.32f)
                lineToRelative(-0.8f, 2.82f)
                horizontalLineTo(5.73f)
                lineTo(9.33f, 5.7f)
                horizontalLineToRelative(8.31f)
                close()
            }
        }

        return _rewardsElixia!!
    }

@Suppress("ObjectPropertyName")
private var _rewardsElixia: ImageVector? = null

@Preview
@Composable
private fun SatsIconRewardsElixiaPreview() {
    Icon(SatsIcons.RewardsElixia, contentDescription = null)
}
