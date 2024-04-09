package com.sats.dna.sample.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.navigation.NavController
import com.sats.dna.components.SatsDividerColor
import com.sats.dna.components.SatsHorizontalDivider
import com.sats.dna.components.appbar.SatsTopAppBar
import com.sats.dna.components.screen.SatsScreen
import com.sats.dna.sample.screens.ArticleCardSampleScreen
import com.sats.dna.sample.screens.BadgeSampleScreen
import com.sats.dna.sample.screens.BannerSampleScreen
import com.sats.dna.sample.screens.BrandLogoSampleScreen
import com.sats.dna.sample.screens.ButtonsSampleScreen
import com.sats.dna.sample.screens.CardSampleScreen
import com.sats.dna.sample.screens.ChallengeBackgroundSampleScreen
import com.sats.dna.sample.screens.ChallengeBadgeSampleScreen
import com.sats.dna.sample.screens.ChallengeCardSampleScreen
import com.sats.dna.sample.screens.CheckboxSampleScreen
import com.sats.dna.sample.screens.ChipsSampleScreen
import com.sats.dna.sample.screens.ColorsSampleScreen
import com.sats.dna.sample.screens.CompletedWorkoutListItemSampleScreen
import com.sats.dna.sample.screens.DividersSampleScreen
import com.sats.dna.sample.screens.EmptyStateSampleScreen
import com.sats.dna.sample.screens.FancyTopAppBarSampleScreen
import com.sats.dna.sample.screens.FormInputFieldsSampleScreen
import com.sats.dna.sample.screens.FriendsBookingStatusSampleScreen
import com.sats.dna.sample.screens.GeneralListItemSampleScreen
import com.sats.dna.sample.screens.IconsSampleScreen
import com.sats.dna.sample.screens.JoinYourFriendsSampleScreen
import com.sats.dna.sample.screens.PlaceholdersSampleScreen
import com.sats.dna.sample.screens.ProgressBarsSampleScreen
import com.sats.dna.sample.screens.ProteinBarSampleScreen
import com.sats.dna.sample.screens.RadioButtonsSampleScreen
import com.sats.dna.sample.screens.SampleScreen
import com.sats.dna.sample.screens.ScaleBarSampleScreen
import com.sats.dna.sample.screens.ScheduleSampleScreen
import com.sats.dna.sample.screens.SearchBarSampleScreen
import com.sats.dna.sample.screens.SessionDetailsInfoLabelSampleScreen
import com.sats.dna.sample.screens.SurfaceSampleScreen
import com.sats.dna.sample.screens.SwitchSampleScreen
import com.sats.dna.sample.screens.TagsSampleScreen
import com.sats.dna.sample.screens.TextFieldSampleScreen
import com.sats.dna.sample.screens.TitledSectionSampleScreen
import com.sats.dna.sample.screens.TopAppBarSampleScreen
import com.sats.dna.sample.screens.TrafficLightsSampleScreen
import com.sats.dna.sample.screens.TypographySampleScreen
import com.sats.dna.sample.screens.UpcomingWorkoutListItemSampleScreen
import com.sats.dna.sample.screens.WorkoutStatisticsSampleScreen
import com.sats.dna.sample.screens.YourMostBookedSampleScreen
import com.sats.dna.theme.SatsTheme

@Composable
internal fun HomeScreen(navController: NavController, modifier: Modifier = Modifier) {
    val topAppBarScrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()

    SatsScreen(
        modifier = modifier.nestedScroll(topAppBarScrollBehavior.nestedScrollConnection),
        topBar = { SatsTopAppBar("SATS DNA Sample App", scrollBehavior = topAppBarScrollBehavior) },
        bottomBar = { Box(Modifier.navigationBarsPadding()) },
    ) { innerPadding ->
        Column(
            Modifier
                .verticalScroll(rememberScrollState())
                .padding(innerPadding)
                .padding(vertical = SatsTheme.spacing.m),
            verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.l),
        ) {
            groups.forEach { (sectionTitle, sampleScreens) ->
                HomeScreenSection(sectionTitle) {
                    sampleScreens.forEach { sampleScreen ->
                        HomeScreenListItem(
                            label = sampleScreen.name,
                            onClick = { navController.navigate(sampleScreen.route) },
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun HomeScreenSection(
    label: String,
    modifier: Modifier = Modifier,
    content: @Composable ColumnScope.() -> Unit,
) {
    Column(modifier, verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s)) {
        Row(
            modifier = Modifier.padding(horizontal = SatsTheme.spacing.m),
            horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            SatsHorizontalDivider(Modifier.width(SatsTheme.spacing.l), color = SatsDividerColor.Alternate)

            Text(label, style = SatsTheme.typography.satsHeadlineEmphasis.headline3)

            SatsHorizontalDivider(Modifier.weight(1f), color = SatsDividerColor.Alternate)
        }

        Column {
            content()
        }
    }
}

@Composable
private fun HomeScreenListItem(
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Text(
        text = label,
        modifier = modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(SatsTheme.spacing.m),
        style = SatsTheme.typography.normal.large,
    )
}

private val groups: Map<String, List<SampleScreen>> = mapOf(
    "Styles" to listOf(
        ColorsSampleScreen,
        TypographySampleScreen,
    ),
    "Icons" to listOf(
        IconsSampleScreen,
    ),
    "Components" to listOf(
        ArticleCardSampleScreen,
        BadgeSampleScreen,
        BannerSampleScreen,
        BrandLogoSampleScreen,
        ButtonsSampleScreen,
        CardSampleScreen,
        ChallengeBackgroundSampleScreen,
        ChallengeBadgeSampleScreen,
        ChallengeCardSampleScreen,
        CheckboxSampleScreen,
        ChipsSampleScreen,
        CompletedWorkoutListItemSampleScreen,
        DividersSampleScreen,
        EmptyStateSampleScreen,
        FancyTopAppBarSampleScreen,
        FormInputFieldsSampleScreen,
        FriendsBookingStatusSampleScreen,
        GeneralListItemSampleScreen,
        JoinYourFriendsSampleScreen,
        PlaceholdersSampleScreen,
        ProgressBarsSampleScreen,
        ProteinBarSampleScreen,
        RadioButtonsSampleScreen,
        ScaleBarSampleScreen,
        ScheduleSampleScreen,
        SearchBarSampleScreen,
        SessionDetailsInfoLabelSampleScreen,
        SurfaceSampleScreen,
        SwitchSampleScreen,
        TagsSampleScreen,
        TextFieldSampleScreen,
        TitledSectionSampleScreen,
        TopAppBarSampleScreen,
        TrafficLightsSampleScreen,
        UpcomingWorkoutListItemSampleScreen,
        WorkoutStatisticsSampleScreen,
        YourMostBookedSampleScreen,
    ),
)
