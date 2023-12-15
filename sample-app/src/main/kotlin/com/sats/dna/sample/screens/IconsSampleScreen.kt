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
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.dp
import com.sats.dna.components.chip.SatsChip
import com.sats.dna.icons.SatsIcons
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

data object IconsSampleScreen : SampleScreen(
    name = "Icons",
    route = "/icons",
    screen = { IconsScreen(it::navigateUp) },
)

@Composable
private fun IconsScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen("Icons", navigateUp, modifier) { innerPadding ->
        val icons = SatsTheme.icons.allIcons
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
                    Icon(icon.painter, contentDescription = null, Modifier.size(24.dp))
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
    val painter: Painter,
    val isDeprecated: Boolean = false,
)

private val SatsIcons.allIcons: List<NamedIcon>
    @Composable get() = listOf(
        NamedIcon("add", add),
        NamedIcon("addPerson", addPerson),
        NamedIcon("addToCalendar", addToCalendar),
        NamedIcon("arrowDown", arrowDown),
        NamedIcon("arrowRight", arrowRight),
        NamedIcon("arrowUp", arrowUp),
        NamedIcon("back", back),
        NamedIcon("barbell", barbell),
        NamedIcon("bellCherry", bellCherry),
        NamedIcon("booked", booked),
        NamedIcon("calendar", calendar),
        NamedIcon("card", card),
        NamedIcon("cardio", cardio),
        NamedIcon("check", check),
        NamedIcon("checkSeal", checkSeal),
        NamedIcon("cherry", cherry),
        NamedIcon("clockFilled", clockFilled),
        NamedIcon("close", close),
        NamedIcon("comment", comment),
        NamedIcon("confirm", confirm),
        NamedIcon("delete", delete),
        NamedIcon("edit", edit),
        NamedIcon("filter", filter),
        NamedIcon("fistBump", fistBump),
        NamedIcon("fistBumpFilled", fistBumpFilled),
        NamedIcon("flame", flame),
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
        NamedIcon("minus", minus),
        NamedIcon("moreVertical", moreVertical),
        NamedIcon("myPtPackages", myPtPackages),
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
        NamedIcon("notifications", notifications),
        NamedIcon("personalTrainer", personalTrainer),
        NamedIcon("privacy", privacy),
        NamedIcon("privacyPolicy", privacyPolicy),
        NamedIcon("profile", profile),
        NamedIcon("qr", qr),
        NamedIcon("questionMark", questionMark),
        NamedIcon("refresh", refresh),
        NamedIcon("remove", remove),
        NamedIcon("rewardsElixia", rewardsElixia),
        NamedIcon("rewardsSats", rewardsSats),
        NamedIcon("search", search),
        NamedIcon("send", send),
        NamedIcon("settings", settings),
        NamedIcon("share", share),
        NamedIcon("showing", showing),
        NamedIcon("star", star),
        NamedIcon("starBorder", starBorder),
        NamedIcon("time", time),
        NamedIcon("treatments", treatments),
        NamedIcon("trophy", trophy),
        NamedIcon("vouchers", vouchers),
        NamedIcon("workoutGx", workoutGx),
        NamedIcon("workoutGymFloor", workoutGymFloor),
        NamedIcon("workoutOther", workoutOther),
        NamedIcon("workoutPlan", workoutPlan),
        NamedIcon("workoutPt", workoutPt),
    )

@LightDarkPreview
@Composable
private fun Preview() {
    SatsTheme {
        IconsScreen(navigateUp = {})
    }
}
