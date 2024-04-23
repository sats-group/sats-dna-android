package com.sats.dna.components.button.internal

import androidx.compose.animation.AnimatedContent
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.sats.dna.components.button.SatsButtonSize

@Composable
internal fun SatsIconButtonContent(
    size: SatsButtonSize,
    isLoading: Boolean,
    icon: ImageVector,
    modifier: Modifier = Modifier,
) {
    val iconContent = remember(isLoading) {
        if (isLoading) {
            SatsIconButtonContent.Loading
        } else {
            SatsIconButtonContent.Icon(icon)
        }
    }

    AnimatedContent(
        targetState = iconContent,
        label = "Content",
        modifier = modifier
            .iconButtonPadding(size)
            .minSatsButtonSize(size)
            .wrapContentWidth(),
    ) { actualContent ->
        val contentSize = iconButtonContentSize(size)

        when (actualContent) {
            is SatsIconButtonContent.Icon -> {
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    modifier = Modifier.size(contentSize),
                    tint = LocalContentColor.current,
                )
            }

            is SatsIconButtonContent.Loading -> {
                CircularProgressIndicator(
                    modifier = Modifier.size(contentSize),
                    color = LocalContentColor.current,
                    strokeWidth = 1.5.dp,
                )
            }
        }
    }
}

private sealed interface SatsIconButtonContent {
    data class Icon(val painter: ImageVector) : SatsIconButtonContent
    data object Loading : SatsIconButtonContent
}
