package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.components.chip.SatsChip
import com.sats.dna.icons.SatsIcons
import com.sats.dna.theme.SatsTheme

data object IconsSampleScreen : SampleScreen(
    name = "Icons",
    route = "/icons",
    screen = { IconsScreen(it::navigateUp) },
)

@Composable
private fun IconsScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen("Icons", navigateUp, modifier) { innerPadding ->
        val icons = SatsIcons.allIcons
            .distinctBy { it.name }
            .sortedBy { it.name }

        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(
                start = innerPadding.calculateStartPadding(LocalLayoutDirection.current) + SatsTheme.spacing.m,
                top = innerPadding.calculateTopPadding() + SatsTheme.spacing.m,
                end = innerPadding.calculateEndPadding(LocalLayoutDirection.current) + SatsTheme.spacing.m,
                bottom = innerPadding.calculateBottomPadding() + SatsTheme.spacing.m,
            ),
            verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
        ) {
            items(icons, key = { "icon-${it.name}" }) { icon ->
                Row(
                    horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Icon(icon.imageVector, contentDescription = null, Modifier.size(24.dp))
                    Text(icon.name)

                    Spacer(Modifier.weight(1f))

                    if (icon.isDeprecated) {
                        SatsChip("DEPRECATED")
                    }
                }
            }
        }
    }
}

private data class NamedIcon(
    val name: String,
    val imageVector: ImageVector,
    val isDeprecated: Boolean = false,
)

private val SatsIcons.allIcons: List<NamedIcon>
    @Composable get() = listOf(
        NamedIcon("activity", activity),
        NamedIcon("activityFilled", activityFilled),
        NamedIcon("activityOutline", activityOutline),
        NamedIcon("add", add),
        NamedIcon("addNewSearch", addNewSearch),
        NamedIcon("addPerson", addPerson),
        NamedIcon("addToCalendar", addToCalendar),
        NamedIcon("aerobics", aerobics),
        NamedIcon("appIconE", appIconE),
        NamedIcon("appIconS", appIconS),
        NamedIcon("aqua", aqua),
        NamedIcon("archived", archived),
        NamedIcon("archivedFilled", archivedFilled),
        NamedIcon("arrowDown", arrowDown),
        NamedIcon("arrowLeft", arrowLeft),
        NamedIcon("arrowRight", arrowRight),
        NamedIcon("arrowUp", arrowUp),
        NamedIcon("audioClass", audioClass),
        NamedIcon("award", award),
        NamedIcon("back", back),
        NamedIcon("barChart", barChart),
        NamedIcon("barbell", barbell),
        NamedIcon("bellCherry", bellCherry),
        NamedIcon("body", body),
        NamedIcon("book", book),
        NamedIcon("booked", booked),
        NamedIcon("calendar", calendar),
        NamedIcon("cardio", cardio),
        NamedIcon("cast", cast),
        NamedIcon("chat", chat),
        NamedIcon("check", check),
        NamedIcon("cherry", cherry),
        NamedIcon("classFilled", classFilled),
        NamedIcon("classStroke", classStroke),
        NamedIcon("clockFilled", clockFilled),
        NamedIcon("close", close),
        NamedIcon("closeCircle", closeCircle),
        NamedIcon("closed", closed),
        NamedIcon("clubs", clubs),
        NamedIcon("clubsFilled", clubsFilled),
        NamedIcon("clubsOutline", clubsOutline),
        NamedIcon("comment", comment),
        NamedIcon("commentFilled", commentFilled),
        NamedIcon("confirm", confirm),
        NamedIcon("copy", copy),
        NamedIcon("creditcard", creditcard),
        NamedIcon("crossComment", crossComment),
        NamedIcon("crossPerson", crossPerson),
        NamedIcon("cycling", cycling),
        NamedIcon("dance", dance),
        NamedIcon("delete", delete),
        NamedIcon("distance", distance),
        NamedIcon("download", download),
        NamedIcon("edit", edit),
        NamedIcon("elixia", elixia),
        NamedIcon("energyDrink", energyDrink),
        NamedIcon("error", error),
        NamedIcon("facebook", facebook),
        NamedIcon("facebookPadding", facebookPadding),
        NamedIcon("filter", filter),
        NamedIcon("fire", fire),
        NamedIcon("fistbump", fistbump),
        NamedIcon("fistbumpFilled", fistbumpFilled),
        NamedIcon("flag", flag),
        NamedIcon("flexibility", flexibility),
        NamedIcon("folderEmpty", folderEmpty),
        NamedIcon("forward", forward),
        NamedIcon("friends", friends),
        NamedIcon("fullscreen", fullscreen),
        NamedIcon("geoposition", geoposition),
        NamedIcon("getStarted", getStarted),
        NamedIcon("gift", gift),
        NamedIcon("gx", gx),
        NamedIcon("gym", gym),
        NamedIcon("hamburgerMenu", hamburgerMenu),
        NamedIcon("headset", headset),
        NamedIcon("hidden", hidden),
        NamedIcon("highfive", highfive),
        NamedIcon("home", home),
        NamedIcon("images", images),
        NamedIcon("inbox", inbox),
        NamedIcon("indifference", indifference),
        NamedIcon("info", info),
        NamedIcon("instagram", instagram),
        NamedIcon("instructor", instructor),
        NamedIcon("invoice", invoice),
        NamedIcon("join", join),
        NamedIcon("kidsTeens", kidsTeens),
        NamedIcon("kroner", kroner),
        NamedIcon("level", level),
        NamedIcon("linkExternal", linkExternal),
        NamedIcon("linkedin", linkedin),
        NamedIcon("loading", loading),
        NamedIcon("location", location),
        NamedIcon("lock", lock),
        NamedIcon("lockPerson", lockPerson),
        NamedIcon("logout", logout),
        NamedIcon("mail", mail),
        NamedIcon("martialArts", martialArts),
        NamedIcon("measurement", measurement),
        NamedIcon("mediataion", mediataion),
        NamedIcon("megaphone", megaphone),
        NamedIcon("menu", menu),
        NamedIcon("minus", minus),
        NamedIcon("more", more),
        NamedIcon("moreHorizontal", moreHorizontal),
        NamedIcon("moreVertical", moreVertical),
        NamedIcon("myPtPackages", myPtPackages),
        NamedIcon("negRemove", negRemove),
        NamedIcon("notifications", notifications),
        NamedIcon("nutrition", nutrition),
        NamedIcon("openFolder", openFolder),
        NamedIcon("order", order),
        NamedIcon("outdoors", outdoors),
        NamedIcon("pause", pause),
        NamedIcon("percentage", percentage),
        NamedIcon("person", person),
        NamedIcon("phone", phone),
        NamedIcon("play", play),
        NamedIcon("prformance", prformance),
        NamedIcon("privacy", privacy),
        NamedIcon("privacyPolicy", privacyPolicy),
        NamedIcon("profile", profile),
        NamedIcon("profileCard", profileCard),
        NamedIcon("profilefilled", profilefilled),
        NamedIcon("programClass", programClass),
        NamedIcon("pt", pt),
        NamedIcon("ptLabel", ptLabel),
        NamedIcon("qr", qr),
        NamedIcon("qrFilled", qrFilled),
        NamedIcon("question", question),
        NamedIcon("quinyx", quinyx),
        NamedIcon("recipe", recipe),
        NamedIcon("recruitFriends", recruitFriends),
        NamedIcon("refresh", refresh),
        NamedIcon("remove", remove),
        NamedIcon("removeFromCalendar", removeFromCalendar),
        NamedIcon("rewards", rewards),
        NamedIcon("rewardsElixia", rewardsElixia),
        NamedIcon("rewardsElixiaFilled", rewardsElixiaFilled),
        NamedIcon("rewardsFilled", rewardsFilled),
        NamedIcon("running", running),
        NamedIcon("sad", sad),
        NamedIcon("sats", sats),
        NamedIcon("satsonline", satsonline),
        NamedIcon("save", save),
        NamedIcon("scale", scale),
        NamedIcon("search", search),
        NamedIcon("searchOutlined", searchOutlined),
        NamedIcon("searchPerson", searchPerson),
        NamedIcon("send", send),
        NamedIcon("settings", settings),
        NamedIcon("share", share),
        NamedIcon("showing", showing),
        NamedIcon("skip", skip),
        NamedIcon("smallgroup", smallgroup),
        NamedIcon("smartphone", smartphone),
        NamedIcon("smiley", smiley),
        NamedIcon("sortTool", sortTool),
        NamedIcon("sound", sound),
        NamedIcon("spotify", spotify),
        NamedIcon("square", square),
        NamedIcon("star", star),
        NamedIcon("starBorder", starBorder),
        NamedIcon("starSticker", starSticker),
        NamedIcon("starStickerCheck", starStickerCheck),
        NamedIcon("statistics", statistics),
        NamedIcon("strength", strength),
        NamedIcon("strikes", strikes),
        NamedIcon("studiosMarkerBg", studiosMarkerBg),
        NamedIcon("studiosMarkerElixia", studiosMarkerElixia),
        NamedIcon("studiosMarkerSats", studiosMarkerSats),
        NamedIcon("sync", sync),
        NamedIcon("themes", themes),
        NamedIcon("thumbsUp", thumbsUp),
        NamedIcon("ticket", ticket),
        NamedIcon("time", time),
        NamedIcon("timeFilled", timeFilled),
        NamedIcon("treatments", treatments),
        NamedIcon("trophy", trophy),
        NamedIcon("up", up),
        NamedIcon("video", video),
        NamedIcon("videoFilled", videoFilled),
        NamedIcon("vouchers", vouchers),
        NamedIcon("warningSign", warningSign),
        NamedIcon("workoutGymFloor", workoutGymFloor),
        NamedIcon("workoutOther", workoutOther),
        NamedIcon("workoutPlan", workoutPlan),
        NamedIcon("workplace", workplace),
        NamedIcon("yoga", yoga),
        NamedIcon("youtube", youtube),
        NamedIcon("zendesk", zendesk),
    )

@PreviewLightDark
@Composable
private fun IconsScreenPreview() {
    SatsTheme {
        IconsScreen(navigateUp = {})
    }
}
