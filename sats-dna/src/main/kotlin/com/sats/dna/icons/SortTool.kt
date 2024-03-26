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
val SatsIcons.SortTool: ImageVector
    get() {
        if (_sortTool != null) {
            return _sortTool!!
        }

        _sortTool = materialIcon(name = "SortTool") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(5.45f, 9f)
                horizontalLineToRelative(13.1f)
                moveTo(3f, 3f)
                horizontalLineToRelative(18f)
                moveTo(7.9f, 15f)
                horizontalLineToRelative(8.2f)
                moveToRelative(-5.74f, 6f)
                horizontalLineToRelative(3.28f)
            }
        }

        return _sortTool!!
    }

@Suppress("ObjectPropertyName")
private var _sortTool: ImageVector? = null

@Preview
@Composable
private fun SatsIconSortToolPreview() {
    Icon(SatsIcons.SortTool, contentDescription = null)
}
