package com.sats.dna.sample.icons

import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import com.google.accompanist.insets.ui.Scaffold
import com.google.accompanist.insets.ui.TopAppBar
import com.sats.dna.icons.SatsIcons
import com.sats.dna.theme.SatsTheme

@Composable
internal fun IconsScreen(navigateUp: () -> Unit) {
    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = SatsTheme.colors.surface.primary,
                contentPadding = WindowInsets.statusBars.asPaddingValues(),
                navigationIcon = {
                    IconButton(onClick = navigateUp) {
                        Icon(SatsTheme.icons.back, contentDescription = null)
                    }
                },
                title = { Text("Icons") },
            )
        },
        contentPadding = PaddingValues(SatsTheme.spacing.m),
    ) { innerPadding ->
        val icons = SatsTheme.icons.allIcons
            .distinctBy { it.name }
            .sortedBy { it.name }

        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = innerPadding,
            verticalArrangement = spacedBy(SatsTheme.spacing.m),
        ) {
            items(icons, key = { "icon-${it.name}" }) { icon ->
                Row(
                    horizontalArrangement = spacedBy(SatsTheme.spacing.m),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Icon(icon.painter, contentDescription = null, Modifier.size(24.dp))
                    Text(icon.name)
                }
            }
        }
    }
}

private data class NamedIcon(
    val name: String,
    val painter: Painter,
)

private val SatsIcons.allIcons: List<NamedIcon>
    @Composable get() = listOf(
        NamedIcon("add", add),
        NamedIcon("addPerson", addPerson),
        NamedIcon("addToCalendar", addToCalendar),
        NamedIcon("back", back),
        NamedIcon("barbell", barbell),
        NamedIcon("calendar", calendar),
        NamedIcon("check", check),
        NamedIcon("checkRound", checkRound),
        NamedIcon("checkSeal", checkSeal),
        NamedIcon("checkThin", checkThin),
        NamedIcon("chevronDown", chevronDown),
        NamedIcon("chevronRight", chevronRight),
        NamedIcon("chevronUp", chevronUp),
        NamedIcon("clockFilled", clockFilled),
        NamedIcon("close", close),
        NamedIcon("comment", comment),
        NamedIcon("customerService", customerService),
        NamedIcon("filter", filter),
        NamedIcon("findFriends", findFriends),
        NamedIcon("fistBump", fistBump),
        NamedIcon("fistBumpFilled", fistBumpFilled),
        NamedIcon("flame", flame),
        NamedIcon("followersAndFollowees", followersAndFollowees),
        NamedIcon("friends", friends),
        NamedIcon("gxClass", gxClass),
        NamedIcon("hidden", hidden),
        NamedIcon("imagePlaceholder", imagePlaceholder),
        NamedIcon("images", images),
        NamedIcon("info", info),
        NamedIcon("join", join),
        NamedIcon("linkExternal", linkExternal),
        NamedIcon("location", location),
        NamedIcon("lock", lock),
        NamedIcon("logOut", logOut),
        NamedIcon("minus", minus),
        NamedIcon("moreVertical", moreVertical),
        NamedIcon("myPage", myPage),
        NamedIcon("navActivityFilled", navActivityFilled),
        NamedIcon("navActivityOutlined", navActivityOutlined),
        NamedIcon("navBookFilled", navBookFilled),
        NamedIcon("navBookOutlined", navBookOutlined),
        NamedIcon("navClubsFilled", navClubsFilled),
        NamedIcon("navClubsOutlined", navClubsOutlined),
        NamedIcon("navHomeElixiaFilled", navHomeElixiaFilled),
        NamedIcon("navHomeElixiaOutlined", navHomeElixiaOutlined),
        NamedIcon("navHomeSatsFilled", navHomeSatsFilled),
        NamedIcon("navHomeSatsOutlined", navHomeSatsOutlined),
        NamedIcon("navQrFilled", navQrFilled),
        NamedIcon("navQrOutlined", navQrOutlined),
        NamedIcon("negRemove", negRemove),
        NamedIcon("privacyPolicy", privacyPolicy),
        NamedIcon("profileOutlined", profileOutlined),
        NamedIcon("ptPackages", ptPackages),
        NamedIcon("qrCode", qrCode),
        NamedIcon("recruitFriends", recruitFriends),
        NamedIcon("rewardsElixia", rewardsElixia),
        NamedIcon("rewardsSats", rewardsSats),
        NamedIcon("search", search),
        NamedIcon("send", send),
        NamedIcon("settings", settings),
        NamedIcon("share", share),
        NamedIcon("showing", showing),
        NamedIcon("starFilled", starFilled),
        NamedIcon("starOutlined", starOutlined),
        NamedIcon("termsAndConditions", termsAndConditions),
        NamedIcon("tick", tick),
        NamedIcon("time", time),
        NamedIcon("treatment", treatment),
        NamedIcon("trophy", trophy),
        NamedIcon("vouchersAndGiftCards", vouchersAndGiftCards),
        NamedIcon("workoutCardio", workoutCardio),
        NamedIcon("workoutGx", workoutGx),
        NamedIcon("workoutGymFloor", workoutGymFloor),
        NamedIcon("workoutOther", workoutOther),
        NamedIcon("workoutPt", workoutPt),
    )
