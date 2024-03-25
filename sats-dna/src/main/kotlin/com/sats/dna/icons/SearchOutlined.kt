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
val SatsIcons.SearchOutlined: ImageVector
    get() {
        if (_searchOutlined != null) {
            return _searchOutlined!!
        }

        _searchOutlined = materialIcon(name = "SearchOutlined") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(22.5f, 22.5f)
                lineToRelative(-3.24f, -3.24f)
                moveToRelative(-7.58f, -11.4f)
                verticalLineToRelative(7.64f)
                moveToRelative(3.82f, -3.82f)
                horizontalLineTo(7.86f)
                moveToRelative(14f, 0f)
                curveToRelative(0f, 5.62f, -4.56f, 10.18f, -10.18f, 10.18f)
                reflectiveCurveTo(1.5f, 17.3f, 1.5f, 11.68f)
                reflectiveCurveTo(6.06f, 1.5f, 11.68f, 1.5f)
                reflectiveCurveToRelative(10.18f, 4.56f, 10.18f, 10.18f)
                close()
            }
        }

        return _searchOutlined!!
    }

@Suppress("ObjectPropertyName")
private var _searchOutlined: ImageVector? = null

@Preview
@Composable
private fun SatsIconSearchOutlinedPreview() {
    Icon(SatsIcons.SearchOutlined, contentDescription = null)
}
