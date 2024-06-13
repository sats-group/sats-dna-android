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
                moveTo(21.83f, 12f)
                curveToRelative(0f, 5.43f, -4.4f, 9.84f, -9.83f, 9.84f)
                reflectiveCurveTo(2.16f, 17.44f, 2.16f, 12f)
                curveToRelative(0f, -5.43f, 4.4f, -9.83f, 9.84f, -9.83f)
                curveToRelative(5.43f, 0f, 9.83f, 4.4f, 9.83f, 9.83f)
                close()
                moveToRelative(1.5f, 0f)
                curveToRelative(0f, 6.26f, -5.07f, 11.34f, -11.33f, 11.34f)
                reflectiveCurveTo(0.66f, 18.26f, 0.66f, 12f)
                reflectiveCurveTo(5.74f, 0.67f, 12f, 0.67f)
                reflectiveCurveTo(23.33f, 5.74f, 23.33f, 12f)
                close()
                moveToRelative(-5.69f, -6.3f)
                lineToRelative(-0.8f, 2.83f)
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

        return _rewardsElixia!!
    }

@Suppress("ObjectPropertyName")
private var _rewardsElixia: ImageVector? = null

@Preview
@Composable
private fun SatsIconRewardsElixiaPreview() {
    Icon(SatsIcons.RewardsElixia, contentDescription = null)
}
