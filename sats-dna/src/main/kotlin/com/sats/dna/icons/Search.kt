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
val SatsIcons.Search: ImageVector
    get() {
        if (_search != null) {
            return _search!!
        }

        _search = materialIcon(name = "Search") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(20.47f, 21.53f)
                lineTo(21f, 22.06f)
                lineTo(22.06f, 21f)
                lineToRelative(-0.53f, -0.53f)
                lineToRelative(-1.06f, 1.06f)
                close()
                moveToRelative(-4.65f, -6.77f)
                curveToRelative(-0.3f, -0.3f, -0.77f, -0.3f, -1.06f, 0f)
                curveToRelative(-0.3f, 0.3f, -0.3f, 0.77f, 0f, 1.06f)
                lineToRelative(1.06f, -1.06f)
                close()
                moveToRelative(5.71f, 5.71f)
                lineToRelative(-5.7f, -5.71f)
                lineToRelative(-1.07f, 1.06f)
                lineToRelative(5.71f, 5.71f)
                lineToRelative(1.06f, -1.06f)
                close()
                moveTo(16.65f, 10.2f)
                curveToRelative(0f, 3.56f, -2.89f, 6.45f, -6.45f, 6.45f)
                verticalLineToRelative(1.5f)
                curveToRelative(4.4f, 0f, 7.95f, -3.56f, 7.95f, -7.95f)
                horizontalLineToRelative(-1.5f)
                close()
                moveToRelative(-6.45f, 6.45f)
                curveToRelative(-3.56f, 0f, -6.45f, -2.89f, -6.45f, -6.45f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(0f, 4.4f, 3.56f, 7.95f, 7.95f, 7.95f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(3.75f, 10.2f)
                curveToRelative(0f, -3.56f, 2.89f, -6.45f, 6.45f, -6.45f)
                verticalLineToRelative(-1.5f)
                curveToRelative(-4.4f, 0f, -7.95f, 3.56f, -7.95f, 7.95f)
                horizontalLineToRelative(1.5f)
                close()
                moveToRelative(6.45f, -6.45f)
                curveToRelative(3.56f, 0f, 6.45f, 2.89f, 6.45f, 6.45f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0f, -4.4f, -3.56f, -7.95f, -7.95f, -7.95f)
                verticalLineToRelative(1.5f)
                close()
            }
        }

        return _search!!
    }

@Suppress("ObjectPropertyName")
private var _search: ImageVector? = null

@Preview
@Composable
private fun SatsIconSearchPreview() {
    Icon(SatsIcons.Search, contentDescription = null)
}
