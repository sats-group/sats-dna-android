package com.sats.dna.components.button

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.IconToggleButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sats.dna.components.SatsSurface
import com.sats.dna.internal.MaterialIcon
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

@Composable
fun LikeButton(
    isLiked: Boolean,
    onLikedChange: (isLiked: Boolean) -> Unit,
    modifier: Modifier = Modifier,
) {
    IconToggleButton(modifier = modifier, checked = isLiked, onCheckedChange = onLikedChange) {
        if (isLiked) {
            MaterialIcon(
                painter = SatsTheme.icons.fistBumpFilled,
                tint = SatsTheme.colors.action.default,
                contentDescription = null,
            )
        } else {
            MaterialIcon(
                painter = SatsTheme.icons.fistBump,
                tint = SatsTheme.colors.action.default,
                contentDescription = null,
            )
        }
    }
}

@LightDarkPreview
@Composable
private fun LikedPreview() {
    var isLiked by remember { mutableStateOf(true) }

    SatsTheme {
        SatsSurface {
            LikeButton(isLiked = isLiked, onLikedChange = { isLiked = it }, Modifier.padding(16.dp))
        }
    }
}

@LightDarkPreview
@Composable
private fun NotLikedPreview() {
    var isLiked by remember { mutableStateOf(false) }

    SatsTheme {
        SatsSurface {
            LikeButton(isLiked = isLiked, onLikedChange = { isLiked = it }, Modifier.padding(16.dp))
        }
    }
}
