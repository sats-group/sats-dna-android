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
        val icons = SatsTheme.icons.toIconDataList()

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
private fun SatsIcons.toIconDataList() = listOf(
    IconData("add", add),
    IconData("addOutlined", addOutlined),
    IconData("addPerson", addPerson),
    IconData("addToCalendar", addToCalendar),
    IconData("back", back),
    IconData("barbell", barbell),
    IconData("calendar", calendar),
    IconData("check", check),
    IconData("checkRound", checkRound),
    IconData("checkSeal", checkSeal),
    IconData("checkThin", checkThin),
    IconData("chevronDown", chevronDown),
    IconData("chevronRight", chevronRight),
    IconData("chevronUp", chevronUp),
    IconData("clock", clock),
    IconData("clockFilled", clockFilled),
    IconData("close", close),
    IconData("comment", comment),
    IconData("contactLocation", contactLocation),
    IconData("customerService", customerService),
    IconData("filter", filter),
    IconData("findFriends", findFriends),
    IconData("fistBump", fistBump),
    IconData("flame", flame),
    IconData("followersAndFollowees", followersAndFollowees),
    IconData("graph", graph),
    IconData("gxClass", gxClass),
    IconData("hidden", hidden),
    IconData("imagePlaceholder", imagePlaceholder),
    IconData("images", images),
    IconData("info", info),
    IconData("join", join),
    IconData("linkExternal", linkExternal),
    IconData("location", location),
    IconData("lock", lock),
    IconData("logOut", logOut),
    IconData("minus", minus),
    IconData("moreHorizontal", moreHorizontal),
    IconData("moreVertical", moreVertical),
    IconData("myPage", myPage),
    IconData("navActivityFilled", navActivityFilled),
    IconData("navActivityOutlined", navActivityOutlined),
    IconData("navBookFilled", navBookFilled),
    IconData("navBookOutlined", navBookOutlined),
    IconData("navClubsFilled", navClubsFilled),
    IconData("navClubsOutlined", navClubsOutlined),
    IconData("navHomeElixiaFilled", navHomeElixiaFilled),
    IconData("navHomeElixiaOutlined", navHomeElixiaOutlined),
    IconData("navHomeSatsFilled", navHomeSatsFilled),
    IconData("navHomeSatsOutlined", navHomeSatsOutlined),
    IconData("navQrFilled", navQrFilled),
    IconData("navQrOutlined", navQrOutlined),
    IconData("negRemove", negRemove),
    IconData("phone", phone),
    IconData("privacyPolicy", privacyPolicy),
    IconData("profileOutlined", profileOutlined),
    IconData("ptPackages", ptPackages),
    IconData("pushNotifications", pushNotifications),
    IconData("qrCode", qrCode),
    IconData("rewardsElixia", rewardsElixia),
    IconData("rewardsSats", rewardsSats),
    IconData("search", search),
    IconData("send", send),
    IconData("settings", settings),
    IconData("showing", showing),
    IconData("starFilled", starFilled),
    IconData("starOutlined", starOutlined),
    IconData("termsAndConditions", termsAndConditions),
    IconData("tick", tick),
    IconData("time", time),
    IconData("treatment", treatment),
    IconData("trophy", trophy),
    IconData("users", users),
    IconData("vouchersAndGiftCards", vouchersAndGiftCards),
    IconData("workoutCardio", workoutCardio),
    IconData("workoutGx", workoutGx),
    IconData("workoutGymFloor", workoutGymFloor),
    IconData("workoutOther", workoutOther),
    IconData("workoutPt", workoutPt),
)

@Composable
private fun IconCell(icon: IconData, showBorder: Boolean, showLargeIcons: Boolean) {
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

private data class IconData(val name: String, val painter: Painter)

private val iconCellSize = 56.dp
