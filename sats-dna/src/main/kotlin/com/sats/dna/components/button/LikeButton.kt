package com.sats.dna.components.button

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.IconToggleButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.SatsSurface
import com.sats.dna.icons.fistBump
import com.sats.dna.internal.MaterialIcon
import com.sats.dna.theme.SatsTheme

@Composable
fun LikeButton(
    isLiked: Boolean,
    onLikedChange: (isLiked: Boolean) -> Unit,
    modifier: Modifier = Modifier,
    isEnabled: Boolean = true,
) {
    IconToggleButton(isLiked, onLikedChange, modifier, isEnabled) {
        MaterialIcon(
            SatsTheme.icons.fistBump(isLiked),
            tint = SatsTheme.colors2.buttons.action.default,
            contentDescription = null,
        )
    }
}

@PreviewLightDark
@Composable
private fun LikedPreview() {
    val (isLiked, setIsLiked) = remember { mutableStateOf(true) }

    SatsTheme {
        SatsSurface {
            LikeButton(isLiked, setIsLiked, Modifier.padding(SatsTheme.spacing.m))
        }
    }
}

@PreviewLightDark
@Composable
private fun NotLikedPreview() {
    val (isLiked, setIsLiked) = remember { mutableStateOf(false) }

    SatsTheme {
        SatsSurface {
            LikeButton(isLiked, setIsLiked, Modifier.padding(SatsTheme.spacing.m))
        }
    }
}
