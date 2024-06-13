package com.sats.dna.icons

import androidx.compose.material.Icon
import androidx.compose.material.icons.materialIcon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import com.sats.dna.SatsIcons

@Suppress("UnusedReceiverParameter") // for convenient access
val SatsIcons.StatisticsFilled: ImageVector
    get() {
        if (_statisticsFilled != null) {
            return _statisticsFilled!!
        }

        _statisticsFilled = materialIcon(name = "StatisticsFilled") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(12.64f, 5f)
                horizontalLineToRelative(-1.28f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(12.73f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1.28f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(6f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(5.27f, 14f)
                horizontalLineTo(4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3.73f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1.27f)
                curveToRelative(0.56f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(15f)
                curveToRelative(0f, -0.55f, -0.44f, -1f, -1f, -1f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(20f, 9.9f)
                horizontalLineToRelative(-1.27f)
                curveToRelative(-0.55f, 0f, -1f, 0.46f, -1f, 1f)
                verticalLineToRelative(7.83f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineTo(20f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(10.9f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(12.64f, 5f)
                horizontalLineToRelative(-1.28f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(12.73f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1.28f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(6f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(5.27f, 14f)
                horizontalLineTo(4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3.73f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1.27f)
                curveToRelative(0.56f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(15f)
                curveToRelative(0f, -0.55f, -0.44f, -1f, -1f, -1f)
                close()
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(20f, 9.9f)
                horizontalLineToRelative(-1.27f)
                curveToRelative(-0.55f, 0f, -1f, 0.46f, -1f, 1f)
                verticalLineToRelative(7.83f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineTo(20f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(10.9f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
        }

        return _statisticsFilled!!
    }

@Suppress("ObjectPropertyName")
private var _statisticsFilled: ImageVector? = null

@Preview
@Composable
private fun SatsIconStatisticsFilledPreview() {
    Icon(SatsIcons.StatisticsFilled, contentDescription = null)
}
