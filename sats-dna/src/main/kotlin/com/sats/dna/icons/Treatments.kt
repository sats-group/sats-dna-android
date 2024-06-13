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
val SatsIcons.Treatments: ImageVector
    get() {
        if (_treatments != null) {
            return _treatments!!
        }

        _treatments = materialIcon(name = "Treatments") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1f,
            ) {
                moveTo(2.95f, 23.22f)
                horizontalLineToRelative(4.08f)
                moveToRelative(1.1f, -14.45f)
                lineTo(7.13f, 11.7f)
                lineToRelative(2.57f, 1.15f)
                curveToRelative(1.43f, 0.57f, 0.93f, 2.14f, -0.63f, 1.51f)
                curveToRelative(-1.57f, -0.63f, -4.13f, -1.6f, -4.22f, -1.7f)
                curveToRelative(-0.1f, -0.1f, 1.5f, -5.66f, 1.8f, -5.95f)
                curveToRelative(0.3f, -0.3f, 7.32f, -0.59f, 7.52f, -0.56f)
                curveToRelative(0.2f, 0.02f, 3.4f, 3.79f, 3.4f, 4.13f)
                curveToRelative(0f, 0.34f, -2.72f, 2.04f, -4.08f, 3.06f)
                curveToRelative(-1.36f, 1.02f, -2.04f, -0.68f, -1.02f, -1.36f)
                reflectiveCurveToRelative(2.64f, -1.64f, 2.72f, -1.7f)
                curveToRelative(0.08f, -0.06f, -1.8f, -1.82f, -1.8f, -1.82f)
                moveToRelative(-2.64f, -1f)
                lineToRelative(1.32f, -0.07f)
                moveToRelative(9.24f, 10.21f)
                horizontalLineToRelative(-9.86f)
                curveToRelative(-0.34f, 0f, 0.68f, -3.92f, 0.68f, -3.92f)
                reflectiveCurveToRelative(-0.68f, -1.02f, 0.34f, -1.7f)
                moveToRelative(8.84f, 11.4f)
                horizontalLineToRelative(-3.74f)
                moveToRelative(0f, 0f)
                curveToRelative(0.9f, 0f, 1.02f, -1.7f, 0f, -1.7f)
                horizontalLineToRelative(-6.12f)
                moveToRelative(6.12f, 1.7f)
                curveToRelative(-2.92f, 0f, -6.8f, 0.02f, -7.48f, 0f)
                curveToRelative(-0.68f, 0f, -1.36f, -0.34f, -1.36f, -1.02f)
                curveToRelative(0f, -0.68f, -0.03f, -1.21f, -0.03f, -1.9f)
                lineToRelative(0.03f, -2.18f)
                curveToRelative(0f, -0.34f, 0.84f, -3.14f, 0.97f, -3.43f)
                curveToRelative(0.13f, -0.3f, 0.57f, 0f, 0.86f, -0.86f)
                curveToRelative(0.16f, -0.48f, -0.47f, -0.99f, -0.47f, -0.99f)
                curveToRelative(0.05f, -0.23f, 0.68f, -2.04f, 1.02f, -3.06f)
                curveToRelative(0.34f, -1.02f, 2.04f, -0.68f, 1.7f, 0.68f)
                lineToRelative(-0.34f, 1.36f)
                moveToRelative(-5.4f, 7.67f)
                curveToRelative(0f, 1.17f, -0.94f, 2.11f, -2.11f, 2.11f)
                reflectiveCurveToRelative(-2.11f, -0.94f, -2.11f, -2.11f)
                reflectiveCurveToRelative(0.94f, -2.11f, 2.1f, -2.11f)
                curveToRelative(1.18f, 0f, 2.12f, 0.94f, 2.12f, 2.11f)
                close()
                moveToRelative(5.27f, -16.98f)
                curveToRelative(0f, 1.17f, -0.95f, 2.12f, -2.11f, 2.12f)
                curveToRelative(-1.17f, 0f, -2.12f, -0.95f, -2.12f, -2.12f)
                curveToRelative(0f, -1.16f, 0.95f, -2.1f, 2.12f, -2.1f)
                curveToRelative(1.16f, 0f, 2.11f, 0.94f, 2.11f, 2.1f)
                close()
            }
        }

        return _treatments!!
    }

@Suppress("ObjectPropertyName")
private var _treatments: ImageVector? = null

@Preview
@Composable
private fun SatsIconTreatmentsPreview() {
    Icon(SatsIcons.Treatments, contentDescription = null)
}
