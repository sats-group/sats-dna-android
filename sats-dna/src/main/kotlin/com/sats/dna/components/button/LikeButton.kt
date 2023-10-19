package com.sats.dna.components.button

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.IconToggleButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sats.dna.components.LocalUseMaterial3
import com.sats.dna.components.SatsSurface
import com.sats.dna.internal.MaterialIcon
import com.sats.dna.theme.SatsTheme

@Composable
fun LikeButton(
    isLiked: Boolean,
    onLikedChange: (isLiked: Boolean) -> Unit,
    modifier: Modifier = Modifier,
    useMaterial3: Boolean = LocalUseMaterial3.current,
) {
    IconToggleButton(modifier = modifier, checked = isLiked, onCheckedChange = onLikedChange) {
        if (isLiked) {
            MaterialIcon(
                painter = SatsTheme.icons.fistBumpFilled,
                tint = SatsTheme.colors.action.default,
                contentDescription = null,
                useMaterial3 = useMaterial3,
            )
        } else {
            MaterialIcon(
                painter = SatsTheme.icons.fistBump,
                tint = SatsTheme.colors.action.default,
                contentDescription = null,
                useMaterial3 = useMaterial3,
            )
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
