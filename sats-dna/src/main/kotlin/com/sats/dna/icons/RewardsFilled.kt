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
val SatsIcons.RewardsFilled: ImageVector
    get() {
        if (_rewardsFilled != null) {
            return _rewardsFilled!!
        }

        _rewardsFilled = materialIcon(name = "RewardsFilled") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(12f, 0.67f)
                curveTo(5.74f, 0.67f, 0.67f, 5.74f, 0.67f, 12f)
                reflectiveCurveTo(5.74f, 23.33f, 12f, 23.33f)
                reflectiveCurveTo(23.33f, 18.26f, 23.33f, 12f)
                reflectiveCurveTo(18.26f, 0.67f, 12f, 0.67f)
                close()
                moveTo(8.32f, 14.5f)
                lineToRelative(-2.17f, 1.67f)
                curveToRelative(0.82f, 1.17f, 2.26f, 2.06f, 4.29f, 2.06f)
                curveToRelative(2.98f, 0f, 4.71f, -1.82f, 4.71f, -4.23f)
                curveToRelative(0f, -1.22f, -0.72f, -1.96f, -1.49f, -2.65f)
                lineToRelative(-0.77f, -0.74f)
                curveToRelative(-0.48f, -0.44f, -0.72f, -0.78f, -0.72f, -1.22f)
                curveToRelative(0f, -0.6f, 0.38f, -1.13f, 1.3f, -1.13f)
                curveToRelative(0.62f, 0f, 1.25f, 0.24f, 1.83f, 0.88f)
                lineToRelative(2.16f, -1.67f)
                curveToRelative(-0.52f, -0.83f, -1.78f, -1.72f, -3.7f, -1.72f)
                curveToRelative(-2.6f, 0f, -4.53f, 1.77f, -4.53f, 4.08f)
                curveToRelative(0f, 1.13f, 0.63f, 1.91f, 1.45f, 2.65f)
                lineToRelative(0.77f, 0.74f)
                curveToRelative(0.53f, 0.49f, 0.77f, 0.78f, 0.77f, 1.23f)
                curveToRelative(0f, 0.59f, -0.44f, 1.22f, -1.6f, 1.22f)
                curveToRelative(-0.9f, 0f, -1.73f, -0.44f, -2.3f, -1.17f)
                close()
            }
        }

        return _rewardsFilled!!
    }

@Suppress("ObjectPropertyName")
private var _rewardsFilled: ImageVector? = null

@Preview
@Composable
private fun SatsIconRewardsFilledPreview() {
    Icon(SatsIcons.RewardsFilled, contentDescription = null)
}
