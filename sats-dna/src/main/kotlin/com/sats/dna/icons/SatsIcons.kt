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
    val add @Composable get() = painterResource(R.drawable.ic_add)
    val addPerson @Composable get() = painterResource(R.drawable.ic_add_person)
    val back @Composable get() = painterResource(R.drawable.ic_back)
    val barbell @Composable get() = painterResource(R.drawable.ic_barbell)
    val calendar @Composable get() = painterResource(R.drawable.ic_calendar)
    val check @Composable get() = painterResource(R.drawable.ic_check)
    val checkRound @Composable get() = painterResource(R.drawable.ic_check_round)
    val checkSeal @Composable get() = painterResource(R.drawable.ic_check_seal)
    val chevronDown @Composable get() = painterResource(R.drawable.ic_chevron_down)
    val chevronRight @Composable get() = painterResource(R.drawable.ic_chevron_right)
    val chevronUp @Composable get() = painterResource(R.drawable.ic_chevron_up)
    val clock @Composable get() = painterResource(R.drawable.ic_clock)
    val close @Composable get() = painterResource(R.drawable.ic_close)
    val comment @Composable get() = painterResource(R.drawable.ic_comment)
    val contactLocation @Composable get() = painterResource(R.drawable.ic_contact_location)
    val customerService @Composable get() = painterResource(R.drawable.ic_customer_service)
    val filter @Composable get() = painterResource(R.drawable.ic_filter)
    val findFriends @Composable get() = painterResource(R.drawable.ic_find_friends)
    val fistBump @Composable get() = painterResource(R.drawable.ic_fist_bump)
    val flame @Composable get() = painterResource(R.drawable.ic_flame)
    val followersAndFollowees @Composable get() = painterResource(R.drawable.ic_followers_and_followees)
    val graph @Composable get() = painterResource(R.drawable.ic_graph)
    val gxClass @Composable get() = painterResource(R.drawable.ic_class)
    val gymClass @Composable get() = painterResource(R.drawable.ic_gym_class)
    val hidden @Composable get() = painterResource(R.drawable.ic_hidden)
    val imagePlaceholder @Composable get() = painterResource(R.drawable.ic_image_placeholder)
    val images @Composable get() = painterResource(R.drawable.ic_images)
    val info @Composable get() = painterResource(R.drawable.ic_info)
    val join @Composable get() = painterResource(R.drawable.ic_join)
    val linkExternal @Composable get() = painterResource(R.drawable.ic_link_external)
    val location @Composable get() = painterResource(R.drawable.ic_location)
    val lock @Composable get() = painterResource(R.drawable.ic_lock)
    val logOut @Composable get() = painterResource(R.drawable.ic_log_out)
    val moreHorizontal @Composable get() = painterResource(R.drawable.ic_more_horizontal)
    val moreVertical @Composable get() = painterResource(R.drawable.ic_more_vertical)
    val myPage @Composable get() = painterResource(R.drawable.ic_my_page)
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
    val phone @Composable get() = painterResource(R.drawable.ic_phone)
    val privacyPolicy @Composable get() = painterResource(R.drawable.ic_privacy_policy)
    val profileOutlined @Composable get() = painterResource(R.drawable.ic_profile_outlined)
    val ptPackages @Composable get() = painterResource(R.drawable.ic_pt_packages)
    val pushNotifications @Composable get() = painterResource(R.drawable.ic_push_notifications)
    val qrCode @Composable get() = painterResource(R.drawable.ic_qr_code)
    val recruitFriends @Composable get() = painterResource(R.drawable.ic_recruit_friends)
    val rewardsElixia @Composable get() = painterResource(R.drawable.ic_rewards_elixia)
    val rewardsSats @Composable get() = painterResource(R.drawable.ic_rewards_sats)
    val search @Composable get() = painterResource(R.drawable.ic_search)
    val send @Composable get() = painterResource(R.drawable.ic_send)
    val settings @Composable get() = painterResource(R.drawable.ic_settings)
    val showing @Composable get() = painterResource(R.drawable.ic_showing)
    val starFilled @Composable get() = painterResource(R.drawable.ic_star_filled)
    val starOutlined @Composable get() = painterResource(R.drawable.ic_star_outlined)
    val termsAndConditions @Composable get() = painterResource(R.drawable.ic_terms_and_conditions)
    val tick @Composable get() = painterResource(R.drawable.ic_tick)
    val time @Composable get() = painterResource(R.drawable.ic_time)
    val treatment @Composable get() = painterResource(R.drawable.ic_treatment)
    val trophy @Composable get() = painterResource(R.drawable.ic_trophy)
    val users @Composable get() = painterResource(R.drawable.ic_users)
    val vouchersAndGiftCards @Composable get() = painterResource(R.drawable.ic_vouchers_and_gift_cards)
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
        SatsIcons.graph,
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
        SatsIcons.starFilled,
        SatsIcons.starOutlined,
        SatsIcons.trophy,
        SatsIcons.users,
        SatsIcons.workoutGx,
        SatsIcons.workoutGymFloor,
        SatsIcons.workoutOther,
        SatsIcons.workoutPt,
    )
