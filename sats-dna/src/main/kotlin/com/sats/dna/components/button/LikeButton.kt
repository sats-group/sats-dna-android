package com.sats.dna.components.button

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.IconToggleButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.sats.dna.components.SatsSurface
import com.sats.dna.icons.fistBump
import com.sats.dna.internal.MaterialIcon
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

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
            tint = SatsTheme.colors.action.default,
            contentDescription = null,
        )
    }
}

@LightDarkPreview
@Composable
private fun LikedPreview() {
    val (isLiked, setIsLiked) = remember { mutableStateOf(true) }

    SatsTheme {
        SatsSurface {
            LikeButton(isLiked, setIsLiked, Modifier.padding(SatsTheme.spacing.m))
        }
    }
}

@LightDarkPreview
@Composable
private fun NotLikedPreview() {
    val (isLiked, setIsLiked) = remember { mutableStateOf(false) }

    SatsTheme {
        SatsSurface {
            LikeButton(isLiked, setIsLiked, Modifier.padding(SatsTheme.spacing.m))
        }
    }
}
