package com.sats.dna.icons

import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import com.sats.dna.SatsIcons

@Suppress("UnusedReceiverParameter") // for convenient access
val SatsIcons.Rewards: ImageVector
    get() {
        if (_rewards != null) {
            return _rewards!!
        }

        _rewards = materialIcon(name = "Rewards") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(6.34f, 16.26f)
                lineToRelative(2.17f, -1.67f)
                curveToRelative(0.58f, 0.74f, 1.4f, 1.18f, 2.31f, 1.18f)
                curveToRelative(1.16f, 0f, 1.59f, -0.64f, 1.59f, -1.23f)
                curveToRelative(0f, -0.44f, -0.24f, -0.74f, -0.77f, -1.23f)
                lineToRelative(-0.77f, -0.73f)
                curveToRelative(-0.82f, -0.74f, -1.45f, -1.53f, -1.45f, -2.66f)
                curveToRelative(0f, -2.3f, 1.93f, -4.07f, 4.53f, -4.07f)
                curveToRelative(1.93f, 0f, 3.18f, 0.88f, 3.7f, 1.71f)
                lineTo(15.5f, 9.24f)
                curveToRelative(-0.58f, -0.64f, -1.2f, -0.89f, -1.83f, -0.89f)
                curveToRelative(-0.91f, 0f, -1.3f, 0.54f, -1.3f, 1.13f)
                curveToRelative(0f, 0.44f, 0.24f, 0.79f, 0.72f, 1.23f)
                lineToRelative(0.77f, 0.74f)
                curveToRelative(0.77f, 0.68f, 1.5f, 1.42f, 1.5f, 2.65f)
                curveToRelative(0f, 2.4f, -1.74f, 4.22f, -4.72f, 4.22f)
                curveToRelative(-2.03f, 0f, -3.47f, -0.88f, -4.29f, -2.06f)
                close()
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(1.42f, 12.08f)
                curveToRelative(0f, -5.84f, 4.74f, -10.58f, 10.58f, -10.58f)
                horizontalLineToRelative(0.01f)
                curveToRelative(5.84f, 0f, 10.58f, 4.74f, 10.58f, 10.58f)
                verticalLineToRelative(0.01f)
                curveToRelative(0f, 5.84f, -4.74f, 10.58f, -10.58f, 10.58f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-5.84f, 0f, -10.58f, -4.74f, -10.58f, -10.58f)
                close()
            }
        }

        return _rewards!!
    }

@Suppress("ObjectPropertyName")
private var _rewards: ImageVector? = null

@Preview
@Composable
private fun SatsIconRewardsPreview() {
    Icon(SatsIcons.Rewards, contentDescription = null)
}
