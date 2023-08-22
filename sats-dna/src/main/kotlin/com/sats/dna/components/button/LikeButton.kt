package com.sats.dna.components.button

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconToggleButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sats.dna.components.SatsSurface
import com.sats.dna.theme.SatsTheme

@Composable
fun LikeButton(isLiked: Boolean, onLikedChange: (isLiked: Boolean) -> Unit, modifier: Modifier = Modifier) {
    IconToggleButton(modifier = modifier, checked = isLiked, onCheckedChange = onLikedChange) {
        if (isLiked) {
            Icon(SatsTheme.icons.fistBumpFilled, tint = SatsTheme.colors.action.default, contentDescription = null)
        } else {
            Icon(SatsTheme.icons.fistBump, tint = SatsTheme.colors.action.default, contentDescription = null)
        }
    }
}

@Preview
@Composable
private fun LikedPreview() {
    var isLiked by remember { mutableStateOf(true) }

    SatsTheme {
        SatsSurface {
            LikeButton(isLiked = isLiked, onLikedChange = { isLiked = it }, Modifier.padding(16.dp))
        }
    }
}

@Preview
@Composable
private fun NotLikedPreview() {
    var isLiked by remember { mutableStateOf(false) }

    SatsTheme {
        SatsSurface {
            LikeButton(isLiked = isLiked, onLikedChange = { isLiked = it }, Modifier.padding(16.dp))
        }
    }
}
