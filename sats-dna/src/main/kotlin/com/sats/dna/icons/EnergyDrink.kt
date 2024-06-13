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
val SatsIcons.EnergyDrink: ImageVector
    get() {
        if (_energyDrink != null) {
            return _energyDrink!!
        }

        _energyDrink = materialIcon(name = "EnergyDrink") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(13.68f, 8.08f)
                curveToRelative(0.28f, 0.22f, 0.34f, 0.62f, 0.13f, 0.9f)
                lineToRelative(-1.79f, 2.38f)
                horizontalLineToRelative(2.13f)
                curveToRelative(0.24f, 0f, 0.46f, 0.14f, 0.57f, 0.35f)
                curveToRelative(0.1f, 0.22f, 0.08f, 0.48f, -0.06f, 0.67f)
                lineToRelative(-2.55f, 3.4f)
                curveToRelative(-0.22f, 0.29f, -0.62f, 0.35f, -0.9f, 0.13f)
                curveToRelative(-0.28f, -0.2f, -0.34f, -0.6f, -0.12f, -0.89f)
                lineToRelative(1.78f, -2.38f)
                horizontalLineToRelative(-2.13f)
                curveToRelative(-0.24f, 0f, -0.46f, -0.14f, -0.57f, -0.35f)
                curveToRelative(-0.1f, -0.22f, -0.08f, -0.48f, 0.06f, -0.67f)
                lineToRelative(2.56f, -3.4f)
                curveToRelative(0.2f, -0.29f, 0.6f, -0.35f, 0.9f, -0.14f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(8.52f, 2.1f)
                curveToRelative(0.3f, 0.17f, 0.4f, 0.56f, 0.22f, 0.87f)
                lineToRelative(-2.46f, 4.1f)
                verticalLineToRelative(11.74f)
                curveToRelative(0f, 0.5f, 0.2f, 1f, 0.56f, 1.35f)
                curveToRelative(0.36f, 0.36f, 0.84f, 0.56f, 1.35f, 0.56f)
                horizontalLineToRelative(8.51f)
                curveToRelative(0.51f, 0f, 1f, -0.2f, 1.36f, -0.56f)
                curveToRelative(0.36f, -0.36f, 0.56f, -0.84f, 0.56f, -1.35f)
                verticalLineTo(7.07f)
                lineToRelative(-2.47f, -4.1f)
                curveToRelative(-0.18f, -0.3f, -0.08f, -0.7f, 0.22f, -0.88f)
                curveToRelative(0.3f, -0.18f, 0.7f, -0.08f, 0.88f, 0.22f)
                lineToRelative(2.55f, 4.26f)
                curveToRelative(0.06f, 0.1f, 0.1f, 0.2f, 0.1f, 0.32f)
                verticalLineToRelative(11.92f)
                curveToRelative(0f, 0.84f, -0.34f, 1.66f, -0.94f, 2.26f)
                curveToRelative(-0.6f, 0.6f, -1.41f, 0.93f, -2.26f, 0.93f)
                horizontalLineTo(8.2f)
                curveToRelative(-0.85f, 0f, -1.67f, -0.34f, -2.27f, -0.93f)
                curveTo(5.33f, 20.47f, 5f, 19.65f, 5f, 18.8f)
                verticalLineTo(6.89f)
                curveToRelative(0f, -0.11f, 0.03f, -0.23f, 0.1f, -0.32f)
                lineTo(7.63f, 2.3f)
                curveToRelative(0.19f, -0.3f, 0.58f, -0.4f, 0.88f, -0.22f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(5.85f, 2.64f)
                curveTo(5.85f, 2.29f, 6.14f, 2f, 6.5f, 2f)
                horizontalLineTo(18.4f)
                curveToRelative(0.36f, 0f, 0.64f, 0.29f, 0.64f, 0.64f)
                curveToRelative(0f, 0.35f, -0.28f, 0.64f, -0.64f, 0.64f)
                horizontalLineTo(6.5f)
                curveToRelative(-0.35f, 0f, -0.64f, -0.29f, -0.64f, -0.64f)
                close()
            }
        }

        return _energyDrink!!
    }

@Suppress("ObjectPropertyName")
private var _energyDrink: ImageVector? = null

@Preview
@Composable
private fun SatsIconEnergyDrinkPreview() {
    Icon(SatsIcons.EnergyDrink, contentDescription = null)
}
