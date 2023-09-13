package com.sats.dna.sample.icons

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.FilterChip
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.LocalContentColor
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.google.accompanist.insets.ui.Scaffold
import com.google.accompanist.insets.ui.TopAppBar
import com.sats.dna.icons.SatsIcons
import com.sats.dna.theme.SatsTheme

@Composable
internal fun IconsScreen(navigateUp: () -> Unit) {
    val controlPanelState = remember { ControlPanelState() }

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
        bottomBar = { ControlPanel(controlPanelState) },
        contentPadding = PaddingValues(SatsTheme.spacing.m),
    ) { innerPadding ->
        val icons = SatsTheme.icons.allIcons

        LazyVerticalGrid(
            modifier = Modifier.fillMaxSize(),
            columns = GridCells.Adaptive(iconCellSize),
            contentPadding = innerPadding,
        ) {
            items(icons) { icon ->
                IconCell(
                    icon = icon,
                    showBorder = controlPanelState.showIconBorders,
                    showLargeIcons = controlPanelState.showLargeIcons,
                )
            }
        }
    }
}

@Stable
private class ControlPanelState {
    var showIconBorders: Boolean by mutableStateOf(false)
        private set

    var showLargeIcons: Boolean by mutableStateOf(false)
        private set

    fun toggleIconBorders() {
        showIconBorders = !showIconBorders
    }

    fun toggleLargeIcons() {
        showLargeIcons = !showLargeIcons
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
private fun ControlPanel(state: ControlPanelState) {
    Surface(Modifier.fillMaxWidth(), elevation = 2.dp) {
        Row(
            Modifier
                .navigationBarsPadding()
                .padding(SatsTheme.spacing.m),
            Arrangement.spacedBy(SatsTheme.spacing.m),
            Alignment.CenterVertically,
        ) {
            FilterChip(state.showIconBorders, state::toggleIconBorders) {
                Text("Show borders")
            }

            FilterChip(state.showLargeIcons, state::toggleLargeIcons) {
                Text("Show large icons")
            }
        }
    }
}

@Composable
private fun IconCell(icon: NamedIcon, showBorder: Boolean, showLargeIcons: Boolean) {
    val borderColor = if (showBorder) LocalContentColor.current else Color.Transparent
    val size = if (showLargeIcons) 48.dp else 24.dp

    Box(
        Modifier.size(iconCellSize),
        contentAlignment = Alignment.Center,
    ) {
        Icon(
            icon.painter,
            contentDescription = null,
            Modifier
                .size(size)
                .border(Dp.Hairline, borderColor),
        )
    }
}

private val iconCellSize = 56.dp

private data class NamedIcon(
    val name: String,
    val painter: Painter,
)

private val SatsIcons.allIcons: List<NamedIcon>
    @Composable get() = listOf(
        NamedIcon("add", add),
        NamedIcon("addOutlined", addOutlined),
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
        NamedIcon("clock", clock),
        NamedIcon("clockFilled", clockFilled),
        NamedIcon("close", close),
        NamedIcon("comment", comment),
        NamedIcon("contactLocation", contactLocation),
        NamedIcon("customerService", customerService),
        NamedIcon("filter", filter),
        NamedIcon("findFriends", findFriends),
        NamedIcon("fistBump", fistBump),
        NamedIcon("fistBumpFilled", fistBumpFilled),
        NamedIcon("flame", flame),
        NamedIcon("followersAndFollowees", followersAndFollowees),
        NamedIcon("friends", friends),
        NamedIcon("graph", graph),
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
        NamedIcon("moreHorizontal", moreHorizontal),
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
        NamedIcon("phone", phone),
        NamedIcon("privacyPolicy", privacyPolicy),
        NamedIcon("profileOutlined", profileOutlined),
        NamedIcon("ptPackages", ptPackages),
        NamedIcon("pushNotifications", pushNotifications),
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
        NamedIcon("users", users),
        NamedIcon("vouchersAndGiftCards", vouchersAndGiftCards),
        NamedIcon("workoutCardio", workoutCardio),
        NamedIcon("workoutGx", workoutGx),
        NamedIcon("workoutGymFloor", workoutGymFloor),
        NamedIcon("workoutOther", workoutOther),
        NamedIcon("workoutPt", workoutPt),
    )
