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
val SatsIcons.AddNewSearch: ImageVector
    get() {
        if (_addNewSearch != null) {
            return _addNewSearch!!
        }

        _addNewSearch = materialIcon(name = "AddNewSearch") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(11.71f, 7.29f)
                verticalLineToRelative(5.14f)
                moveTo(9.14f, 9.86f)
                horizontalLineToRelative(5.15f)
                moveTo(4f, 4.7f)
                verticalLineTo(19.3f)
                curveToRelative(0f, 0.76f, 0.82f, 1.24f, 1.49f, 0.87f)
                lineToRelative(5.74f, -3.19f)
                curveToRelative(0.3f, -0.16f, 0.67f, -0.16f, 0.97f, 0f)
                lineToRelative(5.74f, 3.2f)
                curveToRelative(0.67f, 0.36f, 1.49f, -0.12f, 1.49f, -0.88f)
                verticalLineTo(4.71f)
                curveToRelative(0f, -0.45f, -0.18f, -0.89f, -0.5f, -1.2f)
                curveTo(18.6f, 3.17f, 18.17f, 3f, 17.7f, 3f)
                horizontalLineToRelative(-12f)
                curveToRelative(-0.45f, 0f, -0.89f, 0.18f, -1.2f, 0.5f)
                curveTo(4.17f, 3.82f, 4f, 4.26f, 4f, 4.71f)
                close()
            }
        }

        return _addNewSearch!!
    }

@Suppress("ObjectPropertyName")
private var _addNewSearch: ImageVector? = null

@Preview
@Composable
private fun SatsIconAddNewSearchPreview() {
    Icon(SatsIcons.AddNewSearch, contentDescription = null)
}
