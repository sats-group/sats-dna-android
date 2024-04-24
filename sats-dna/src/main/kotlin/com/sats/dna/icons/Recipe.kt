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
val SatsIcons.Recipe: ImageVector
    get() {
        if (_recipe != null) {
            return _recipe!!
        }

        _recipe = materialIcon(name = "Recipe") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(16.58f, 1f)
                horizontalLineTo(1.92f)
                curveTo(1.4f, 1f, 1f, 1.41f, 1f, 1.92f)
                verticalLineToRelative(20.16f)
                curveTo(1f, 22.58f, 1.41f, 23f, 1.92f, 23f)
                horizontalLineToRelative(14.66f)
                curveToRelative(1.52f, 0f, 2.75f, -1.23f, 2.75f, -2.75f)
                verticalLineTo(3.75f)
                curveTo(19.33f, 2.23f, 18.1f, 1f, 16.58f, 1f)
                close()
                moveToRelative(-2.75f, 9.17f)
                curveToRelative(0f, 1.51f, -1.23f, 2.75f, -2.75f, 2.75f)
                verticalLineToRelative(4.58f)
                curveToRelative(0f, 0.5f, -0.4f, 0.92f, -0.91f, 0.92f)
                reflectiveCurveTo(9.25f, 18f, 9.25f, 17.5f)
                verticalLineToRelative(-4.58f)
                curveToRelative(-1.52f, 0f, -2.75f, -1.24f, -2.75f, -2.75f)
                verticalLineTo(7.42f)
                curveTo(6.5f, 6.9f, 6.91f, 6.5f, 7.42f, 6.5f)
                curveToRelative(0.5f, 0f, 0.91f, 0.41f, 0.91f, 0.92f)
                verticalLineToRelative(2.75f)
                curveToRelative(0f, 0.5f, 0.41f, 0.91f, 0.92f, 0.91f)
                verticalLineTo(7.42f)
                curveToRelative(0f, -0.51f, 0.41f, -0.92f, 0.92f, -0.92f)
                curveToRelative(0.5f, 0f, 0.91f, 0.41f, 0.91f, 0.92f)
                verticalLineToRelative(3.66f)
                curveToRelative(0.5f, 0f, 0.92f, -0.4f, 0.92f, -0.91f)
                verticalLineTo(7.42f)
                curveToRelative(0f, -0.51f, 0.41f, -0.92f, 0.92f, -0.92f)
                curveToRelative(0.5f, 0f, 0.91f, 0.41f, 0.91f, 0.92f)
                verticalLineToRelative(2.75f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(22.08f, 9.25f)
                verticalLineTo(5.58f)
                curveToRelative(0f, -0.5f, -0.4f, -0.91f, -0.91f, -0.91f)
                reflectiveCurveToRelative(-0.92f, 0.4f, -0.92f, 0.91f)
                verticalLineToRelative(3.67f)
                curveToRelative(0f, 0.5f, 0.41f, 0.92f, 0.92f, 0.92f)
                curveToRelative(0.5f, 0f, 0.91f, -0.41f, 0.91f, -0.92f)
                close()
            }
        }

        return _recipe!!
    }

@Suppress("ObjectPropertyName")
private var _recipe: ImageVector? = null

@Preview
@Composable
private fun SatsIconRecipePreview() {
    Icon(SatsIcons.Recipe, contentDescription = null)
}
