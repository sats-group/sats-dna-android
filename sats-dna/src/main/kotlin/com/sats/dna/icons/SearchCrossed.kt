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
val SatsIcons.SearchCrossed: ImageVector
    get() {
        if (_searchCrossed != null) {
            return _searchCrossed!!
        }

        _searchCrossed = materialIcon(name = "SearchCrossed") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(3.32f, 12f)
                curveTo(2.94f, 10.8f, 2.9f, 9.5f, 3.2f, 8.28f)
                curveToRelative(0.3f, -1.23f, 0.93f, -2.36f, 1.83f, -3.25f)
                curveToRelative(0.9f, -0.9f, 2.02f, -1.53f, 3.25f, -1.83f)
                curveTo(9.5f, 2.9f, 10.79f, 2.94f, 12f, 3.32f)
                moveToRelative(4.53f, 4.53f)
                curveToRelative(0.38f, 1.2f, 0.42f, 2.5f, 0.12f, 3.72f)
                curveToRelative(-0.3f, 1.23f, -0.93f, 2.36f, -1.83f, 3.25f)
                curveToRelative(-0.9f, 0.9f, -2.02f, 1.53f, -3.25f, 1.83f)
                curveToRelative(-1.23f, 0.3f, -2.51f, 0.26f, -3.72f, -0.12f)
                moveTo(21f, 21f)
                lineToRelative(-5.54f, -5.54f)
                moveTo(3f, 16.85f)
                lineTo(16.85f, 3f)
            }
        }

        return _searchCrossed!!
    }

@Suppress("ObjectPropertyName")
private var _searchCrossed: ImageVector? = null

@Preview
@Composable
private fun SatsIconSearchCrossedPreview() {
    Icon(SatsIcons.SearchCrossed, contentDescription = null)
}
