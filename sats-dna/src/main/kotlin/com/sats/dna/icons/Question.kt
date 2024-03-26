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
val SatsIcons.Question: ImageVector
    get() {
        if (_question != null) {
            return _question!!
        }

        _question = materialIcon(name = "Question") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(12.96f, 13.6f)
                curveToRelative(0f, 0.44f, -0.35f, 0.8f, -0.8f, 0.8f)
                curveToRelative(-0.44f, 0f, -0.8f, -0.36f, -0.8f, -0.8f)
                curveToRelative(0.01f, -0.59f, 0.18f, -1.16f, 0.48f, -1.66f)
                reflectiveCurveToRelative(0.74f, -0.91f, 1.26f, -1.19f)
                curveToRelative(0.72f, -0.51f, 1.06f, -0.8f, 1.06f, -1.55f)
                curveToRelative(0f, -1.39f, -1.25f, -1.6f, -2f, -1.6f)
                curveToRelative(-0.54f, 0.06f, -1.07f, 0.22f, -1.55f, 0.49f)
                curveToRelative(-0.22f, 0.12f, -0.43f, 0.26f, -0.63f, 0.42f)
                curveToRelative(-0.36f, 0.3f, -0.9f, 0.33f, -1.23f, 0f)
                curveToRelative(-0.29f, -0.29f, -0.31f, -0.75f, -0.02f, -1.02f)
                curveTo(9.11f, 7.14f, 9.53f, 6.84f, 10f, 6.6f)
                curveToRelative(0.67f, -0.34f, 1.4f, -0.54f, 2.16f, -0.6f)
                curveToRelative(2.19f, 0f, 3.6f, 1.26f, 3.6f, 3.2f)
                curveToRelative(-0.01f, 0.59f, -0.18f, 1.16f, -0.48f, 1.66f)
                reflectiveCurveToRelative(-0.74f, 0.91f, -1.25f, 1.19f)
                curveToRelative(-0.72f, 0.51f, -1.07f, 0.8f, -1.07f, 1.55f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(12.16f, 17.99f)
                curveToRelative(0.67f, 0f, 1.2f, -0.54f, 1.2f, -1.2f)
                curveToRelative(0f, -0.66f, -0.53f, -1.2f, -1.2f, -1.2f)
                curveToRelative(-0.66f, 0f, -1.2f, 0.54f, -1.2f, 1.2f)
                curveToRelative(0f, 0.66f, 0.54f, 1.2f, 1.2f, 1.2f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(2.17f, 12f)
                curveToRelative(0f, 5.43f, 4.4f, 9.83f, 9.83f, 9.83f)
                reflectiveCurveToRelative(9.83f, -4.4f, 9.83f, -9.83f)
                reflectiveCurveToRelative(-4.4f, -9.83f, -9.83f, -9.83f)
                reflectiveCurveTo(2.17f, 6.57f, 2.17f, 12f)
                close()
                moveTo(12f, 0.67f)
                curveTo(5.74f, 0.67f, 0.67f, 5.74f, 0.67f, 12f)
                reflectiveCurveTo(5.74f, 23.33f, 12f, 23.33f)
                reflectiveCurveTo(23.33f, 18.26f, 23.33f, 12f)
                reflectiveCurveTo(18.26f, 0.67f, 12f, 0.67f)
                close()
            }
        }

        return _question!!
    }

@Suppress("ObjectPropertyName")
private var _question: ImageVector? = null

@Preview
@Composable
private fun SatsIconQuestionPreview() {
    Icon(SatsIcons.Question, contentDescription = null)
}
