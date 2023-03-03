package com.sats.dna.icons

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sats.dna.R
import com.sats.dna.theme.SatsTheme

object SatsIcons {
    val chevronRight @Composable get() = painterResource(R.drawable.ic_chevron_right)
    val comment @Composable get() = painterResource(R.drawable.ic_comment)
    val fistBump @Composable get() = painterResource(R.drawable.ic_fist_bump)
    val workoutGx @Composable get() = painterResource(R.drawable.ic_workout_gx)
    val workoutGymFloor @Composable get() = painterResource(R.drawable.ic_workout_gym_floor)
    val workoutPt @Composable get() = painterResource(R.drawable.ic_workout_pt)
}

@Preview
@Composable
private fun Preview() {
    SatsTheme {
        Surface {
            val allIcons = allIcons
            LazyVerticalGrid(GridCells.Adaptive(48.dp)) {
                items(allIcons) { icon ->
                    Box(Modifier.size(48.dp), contentAlignment = Center) {
                        Icon(icon, contentDescription = null, Modifier.size(24.dp))
                    }
                }
            }
        }
    }
}

private val allIcons: List<Painter>
    @Composable get() = listOf(
        SatsIcons.chevronRight,
        SatsIcons.comment,
        SatsIcons.fistBump,
        SatsIcons.workoutGx,
        SatsIcons.workoutGymFloor,
        SatsIcons.workoutPt,
    )
