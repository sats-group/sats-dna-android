package com.sats.dna.components.button

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.SatsIcons
import com.sats.dna.components.SatsSurface
import com.sats.dna.icons.fistbump
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsLikeButton(
    isLiked: Boolean,
    onLikedChange: (isLiked: Boolean) -> Unit,
    onClickLabel: String?,
    modifier: Modifier = Modifier,
    isEnabled: Boolean = true,
) {
    SatsIconButton(
        onClick = { onLikedChange(!isLiked) },
        icon = SatsIcons.fistbump(isLiked),
        modifier = modifier,
        isEnabled = isEnabled,
        onClickLabel = onClickLabel,
        colors = SatsButtonColor.Action,
    )
}

@PreviewLightDark
@Composable
private fun SatsLikeButtonLikedPreview() {
    val (isLiked, setIsLiked) = remember { mutableStateOf(true) }

    SatsTheme {
        SatsSurface {
            SatsLikeButton(
                isLiked = isLiked,
                onLikedChange = setIsLiked,
                onClickLabel = null,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsLikeButtonNotLikedPreview() {
    val (isLiked, setIsLiked) = remember { mutableStateOf(false) }

    SatsTheme {
        SatsSurface {
            SatsLikeButton(
                isLiked = isLiked,
                onLikedChange = setIsLiked,
                onClickLabel = null,
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}
