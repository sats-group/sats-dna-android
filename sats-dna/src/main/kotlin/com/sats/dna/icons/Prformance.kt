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
val SatsIcons.Prformance: ImageVector
    get() {
        if (_prformance != null) {
            return _prformance!!
        }

        _prformance = materialIcon(name = "Prformance") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(12f, 10.91f)
                curveToRelative(1.16f, 0f, 2.1f, -0.97f, 2.1f, -2.18f)
                curveToRelative(0f, -1.2f, -0.94f, -2.17f, -2.1f, -2.17f)
                curveToRelative(-1.16f, 0f, -2.1f, 0.97f, -2.1f, 2.17f)
                reflectiveCurveToRelative(0.94f, 2.18f, 2.1f, 2.18f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(23.25f, 3.65f)
                horizontalLineToRelative(-1.4f)
                verticalLineTo(1.48f)
                curveToRelative(0f, -0.2f, -0.08f, -0.38f, -0.21f, -0.52f)
                curveToRelative(-0.13f, -0.13f, -0.31f, -0.21f, -0.5f, -0.21f)
                reflectiveCurveToRelative(-0.36f, 0.08f, -0.5f, 0.21f)
                curveToRelative(-0.13f, 0.14f, -0.2f, 0.32f, -0.2f, 0.52f)
                verticalLineToRelative(2.17f)
                horizontalLineTo(3.56f)
                verticalLineTo(1.48f)
                curveToRelative(0f, -0.2f, -0.07f, -0.38f, -0.2f, -0.52f)
                curveToRelative(-0.14f, -0.13f, -0.31f, -0.21f, -0.5f, -0.21f)
                reflectiveCurveToRelative(-0.37f, 0.08f, -0.5f, 0.21f)
                curveToRelative(-0.13f, 0.14f, -0.2f, 0.32f, -0.2f, 0.52f)
                verticalLineToRelative(2.17f)
                horizontalLineTo(0.75f)
                verticalLineTo(5.1f)
                horizontalLineToRelative(1.4f)
                verticalLineToRelative(2.18f)
                curveToRelative(0f, 0.2f, 0.08f, 0.38f, 0.21f, 0.52f)
                curveTo(2.5f, 7.93f, 2.67f, 8f, 2.86f, 8f)
                reflectiveCurveToRelative(0.36f, -0.07f, 0.5f, -0.2f)
                curveToRelative(0.13f, -0.14f, 0.2f, -0.33f, 0.2f, -0.52f)
                verticalLineTo(5.1f)
                horizontalLineToRelative(16.88f)
                verticalLineToRelative(2.18f)
                curveToRelative(0f, 0.2f, 0.07f, 0.38f, 0.2f, 0.52f)
                curveToRelative(0.14f, 0.13f, 0.31f, 0.2f, 0.5f, 0.2f)
                reflectiveCurveToRelative(0.37f, -0.07f, 0.5f, -0.2f)
                curveToRelative(0.13f, -0.14f, 0.2f, -0.33f, 0.2f, -0.52f)
                verticalLineTo(5.1f)
                horizontalLineToRelative(1.41f)
                verticalLineTo(3.65f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(15.02f, 13.28f)
                lineToRelative(3.83f, -6.72f)
                horizontalLineToRelative(-2.12f)
                lineToRelative(-3.22f, 5.08f)
                horizontalLineToRelative(-3.02f)
                lineTo(7.27f, 6.56f)
                horizontalLineTo(5.15f)
                lineToRelative(3.83f, 6.72f)
                curveToRelative(0.06f, 0.1f, 0.13f, 0.18f, 0.2f, 0.25f)
                verticalLineToRelative(3.26f)
                lineToRelative(-1.91f, 0.3f)
                curveToRelative(-0.25f, 0.04f, -0.48f, 0.17f, -0.64f, 0.37f)
                curveToRelative(-0.16f, 0.2f, -0.25f, 0.45f, -0.25f, 0.7f)
                verticalLineToRelative(5.09f)
                horizontalLineToRelative(1.75f)
                lineToRelative(0.35f, -4.15f)
                lineTo(12f, 18.55f)
                lineToRelative(3.52f, 0.55f)
                lineToRelative(0.35f, 4.15f)
                horizontalLineToRelative(1.76f)
                verticalLineToRelative(-5.08f)
                curveToRelative(0f, -0.26f, -0.1f, -0.51f, -0.26f, -0.7f)
                curveToRelative(-0.16f, -0.2f, -0.39f, -0.34f, -0.64f, -0.38f)
                lineToRelative(-1.92f, -0.3f)
                verticalLineToRelative(-3.26f)
                curveToRelative(0.08f, -0.07f, 0.15f, -0.16f, 0.2f, -0.25f)
                close()
            }
        }

        return _prformance!!
    }

@Suppress("ObjectPropertyName")
private var _prformance: ImageVector? = null

@Preview
@Composable
private fun SatsIconPrformancePreview() {
    Icon(SatsIcons.Prformance, contentDescription = null)
}
