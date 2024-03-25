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
val SatsIcons.Ticket: ImageVector
    get() {
        if (_ticket != null) {
            return _ticket!!
        }

        _ticket = materialIcon(name = "Ticket") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(2.25f, 5f)
                curveToRelative(0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(18f)
                curveToRelative(0.41f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(4.1f)
                curveToRelative(0f, 0.4f, -0.34f, 0.74f, -0.75f, 0.74f)
                curveToRelative(-0.98f, 0f, -1.7f, 0.73f, -1.7f, 1.7f)
                curveToRelative(0f, 0.98f, 0.72f, 1.71f, 1.7f, 1.71f)
                curveToRelative(0.41f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(4.1f)
                curveToRelative(0f, 0.4f, -0.34f, 0.74f, -0.75f, 0.74f)
                horizontalLineTo(3f)
                curveToRelative(-0.41f, 0f, -0.75f, -0.33f, -0.75f, -0.75f)
                verticalLineTo(14f)
                curveToRelative(0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                curveToRelative(0.98f, 0f, 1.7f, -0.73f, 1.7f, -1.7f)
                curveToRelative(0f, -0.98f, -0.72f, -1.7f, -1.7f, -1.7f)
                curveToRelative(-0.41f, 0f, -0.75f, -0.34f, -0.75f, -0.76f)
                verticalLineTo(5f)
                close()
                moveToRelative(1.5f, 0.75f)
                verticalLineToRelative(2.67f)
                curveTo(5.18f, 8.75f, 6.2f, 10f, 6.2f, 11.55f)
                curveToRelative(0f, 1.54f, -1.02f, 2.79f, -2.45f, 3.12f)
                verticalLineToRelative(2.67f)
                horizontalLineToRelative(16.5f)
                verticalLineToRelative(-2.67f)
                curveToRelative(-1.43f, -0.33f, -2.45f, -1.58f, -2.45f, -3.12f)
                curveToRelative(0f, -1.55f, 1.02f, -2.8f, 2.45f, -3.13f)
                verticalLineTo(5.75f)
                horizontalLineTo(3.75f)
                close()
                moveToRelative(4.23f, 3.34f)
                curveToRelative(0f, -0.41f, 0.33f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(6.54f)
                curveToRelative(0.42f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineTo(14f)
                curveToRelative(0f, 0.41f, -0.33f, 0.75f, -0.75f, 0.75f)
                horizontalLineTo(8.73f)
                curveToRelative(-0.42f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                verticalLineTo(9.1f)
                close()
                moveToRelative(1.5f, 0.75f)
                verticalLineToRelative(3.41f)
                horizontalLineToRelative(5.04f)
                verticalLineToRelative(-3.4f)
                horizontalLineTo(9.48f)
                close()
            }
        }

        return _ticket!!
    }

@Suppress("ObjectPropertyName")
private var _ticket: ImageVector? = null

@Preview
@Composable
private fun SatsIconTicketPreview() {
    Icon(SatsIcons.Ticket, contentDescription = null)
}
