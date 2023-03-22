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
    val back @Composable get() = painterResource(R.drawable.ic_back)
    val chevronRight @Composable get() = painterResource(R.drawable.ic_chevron_right)
    val comment @Composable get() = painterResource(R.drawable.ic_comment)
    val fistBump @Composable get() = painterResource(R.drawable.ic_fist_bump)
    val linkExternal @Composable get() = painterResource(R.drawable.ic_link_external)
    val navActivityFilled @Composable get() = painterResource(R.drawable.ic_nav_activity_filled)
    val navActivityOutlined @Composable get() = painterResource(R.drawable.ic_nav_activity_outlined)
    val navBookFilled @Composable get() = painterResource(R.drawable.ic_nav_book_filled)
    val navBookOutlined @Composable get() = painterResource(R.drawable.ic_nav_book_outlined)
    val navClubsFilled @Composable get() = painterResource(R.drawable.ic_nav_clubs_filled)
    val navClubsOutlined @Composable get() = painterResource(R.drawable.ic_nav_clubs_outlined)
    val navHomeElixiaFilled @Composable get() = painterResource(R.drawable.ic_nav_home_elixia_filled)
    val navHomeElixiaOutlined @Composable get() = painterResource(R.drawable.ic_nav_home_elixia_outlined)
    val navHomeSatsFilled @Composable get() = painterResource(R.drawable.ic_nav_home_sats_filled)
    val navHomeSatsOutlined @Composable get() = painterResource(R.drawable.ic_nav_home_sats_outlined)
    val navProfileFilled @Composable get() = painterResource(R.drawable.ic_nav_profile_filled)
    val navProfileOutlined @Composable get() = painterResource(R.drawable.ic_nav_profile_outlined)
    val navQrFilled @Composable get() = painterResource(R.drawable.ic_nav_qr_filled)
    val navQrOutlined @Composable get() = painterResource(R.drawable.ic_nav_qr_outlined)
    val users @Composable get() = painterResource(R.drawable.ic_users)
    val workoutGx @Composable get() = painterResource(R.drawable.ic_workout_gx)
    val workoutGymFloor @Composable get() = painterResource(R.drawable.ic_workout_gym_floor)
    val workoutOther @Composable get() = painterResource(R.drawable.ic_workout_other)
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
        SatsIcons.back,
        SatsIcons.chevronRight,
        SatsIcons.comment,
        SatsIcons.fistBump,
        SatsIcons.linkExternal,
        SatsIcons.navActivityFilled,
        SatsIcons.navActivityOutlined,
        SatsIcons.navBookFilled,
        SatsIcons.navBookOutlined,
        SatsIcons.navClubsFilled,
        SatsIcons.navClubsOutlined,
        SatsIcons.navHomeElixiaFilled,
        SatsIcons.navHomeElixiaOutlined,
        SatsIcons.navHomeSatsFilled,
        SatsIcons.navHomeSatsOutlined,
        SatsIcons.navProfileFilled,
        SatsIcons.navProfileOutlined,
        SatsIcons.navQrFilled,
        SatsIcons.navQrOutlined,
        SatsIcons.users,
        SatsIcons.workoutGx,
        SatsIcons.workoutGymFloor,
        SatsIcons.workoutOther,
        SatsIcons.workoutPt,
    )
