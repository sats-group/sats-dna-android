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
            HomeScreenSection("Styles") {
                HomeScreenListItem(
                    label = ColorsSampleScreen.name,
                    onClick = { navController.navigate(ColorsSampleScreen.route) },
                )

                HomeScreenListItem(
                    label = TypographySampleScreen.name,
                    onClick = { navController.navigate(TypographySampleScreen.route) },
                )
            }

            HomeScreenSection("Icons") {
                HomeScreenListItem(
                    label = IconsSampleScreen.name,
                    onClick = { navController.navigate(IconsSampleScreen.route) },
                )
            }

            HomeScreenSection("Components") {
                HomeScreenListItem(
                    label = ArticleCardSampleScreen.name,
                    onClick = { navController.navigate(ArticleCardSampleScreen.route) },
                )

                HomeScreenListItem(
                    label = BadgeSampleScreen.name,
                    onClick = { navController.navigate(BadgeSampleScreen.route) },
                )

                HomeScreenListItem(
                    label = BannerSampleScreen.name,
                    onClick = { navController.navigate(BannerSampleScreen.route) },
                )

                HomeScreenListItem(
                    label = BrandLogoSampleScreen.name,
                    onClick = { navController.navigate(BrandLogoSampleScreen.route) },
                )

                HomeScreenListItem(
                    label = ButtonsSampleScreen.name,
                    onClick = { navController.navigate(ButtonsSampleScreen.route) },
                )

                HomeScreenListItem(
                    label = CardSampleScreen.name,
                    onClick = { navController.navigate(CardSampleScreen.route) },
                )

                HomeScreenListItem(
                    label = ChallengeBackgroundSampleScreen.name,
                    onClick = { navController.navigate(ChallengeBackgroundSampleScreen.route) },
                )

                HomeScreenListItem(
                    label = ChallengeBadgeSampleScreen.name,
                    onClick = { navController.navigate(ChallengeBadgeSampleScreen.route) },
                )

                HomeScreenListItem(
                    label = ChallengeCardSampleScreen.name,
                    onClick = { navController.navigate(ChallengeCardSampleScreen.route) },
                )

                HomeScreenListItem(
                    label = CheckboxSampleScreen.name,
                    onClick = { navController.navigate(CheckboxSampleScreen.route) },
                )

                HomeScreenListItem(
                    label = ChipsSampleScreen.name,
                    onClick = { navController.navigate(ChipsSampleScreen.route) },
                )

                HomeScreenListItem(
                    label = CompletedWorkoutListItemSampleScreen.name,
                    onClick = { navController.navigate(CompletedWorkoutListItemSampleScreen.route) },
                )

                HomeScreenListItem(
                    label = DividersSampleScreen.name,
                    onClick = { navController.navigate(DividersSampleScreen.route) },
                )

                HomeScreenListItem(
                    label = EmptyStateSampleScreen.name,
                    onClick = { navController.navigate(EmptyStateSampleScreen.route) },
                )

                HomeScreenListItem(
                    label = FancyTopAppBarSampleScreen.name,
                    onClick = { navController.navigate(FancyTopAppBarSampleScreen.route) },
                )

                HomeScreenListItem(
                    label = FormInputFieldsSampleScreen.name,
                    onClick = { navController.navigate(FormInputFieldsSampleScreen.route) },
                )

                HomeScreenListItem(
                    label = FriendsBookingStatusSampleScreen.name,
                    onClick = { navController.navigate(FriendsBookingStatusSampleScreen.route) },
                )

                HomeScreenListItem(
                    label = GeneralListItemSampleScreen.name,
                    onClick = { navController.navigate(GeneralListItemSampleScreen.route) },
                )

                HomeScreenListItem(
                    label = JoinYourFriendsSampleScreen.name,
                    onClick = { navController.navigate(JoinYourFriendsSampleScreen.route) },
                )

                HomeScreenListItem(
                    label = PlaceholdersSampleScreen.name,
                    onClick = { navController.navigate(PlaceholdersSampleScreen.route) },
                )

                HomeScreenListItem(
                    label = ProgressBarsSampleScreen.name,
                    onClick = { navController.navigate(ProgressBarsSampleScreen.route) },
                )

                HomeScreenListItem(
                    label = ProteinBarSampleScreen.name,
                    onClick = { navController.navigate(ProteinBarSampleScreen.route) },
                )

                HomeScreenListItem(
                    label = RadioButtonsSampleScreen.name,
                    onClick = { navController.navigate(RadioButtonsSampleScreen.route) },
                )

                HomeScreenListItem(
                    label = ScaleBarSampleScreen.name,
                    onClick = { navController.navigate(ScaleBarSampleScreen.route) },
                )

                HomeScreenListItem(
                    label = ScheduleSampleScreen.name,
                    onClick = { navController.navigate(ScheduleSampleScreen.route) },
                )

                HomeScreenListItem(
                    label = SearchBarSampleScreen.name,
                    onClick = { navController.navigate(SearchBarSampleScreen.route) },
                )

                HomeScreenListItem(
                    label = SessionDetailsInfoLabelSampleScreen.name,
                    onClick = { navController.navigate(SessionDetailsInfoLabelSampleScreen.route) },
                )

                HomeScreenListItem(
                    label = SurfaceSampleScreen.name,
                    onClick = { navController.navigate(SurfaceSampleScreen.route) },
                )

                HomeScreenListItem(
                    label = SwitchSampleScreen.name,
                    onClick = { navController.navigate(SwitchSampleScreen.route) },
                )

                HomeScreenListItem(
                    label = TagsSampleScreen.name,
                    onClick = { navController.navigate(TagsSampleScreen.route) },
                )

                HomeScreenListItem(
                    label = TextFieldSampleScreen.name,
                    onClick = { navController.navigate(TextFieldSampleScreen.route) },
                )

                HomeScreenListItem(
                    label = TitledSectionSampleScreen.name,
                    onClick = { navController.navigate(TitledSectionSampleScreen.route) },
                )

                HomeScreenListItem(
                    label = TopAppBarSampleScreen.name,
                    onClick = { navController.navigate(TopAppBarSampleScreen.route) },
                )

                HomeScreenListItem(
                    label = TrafficLightsSampleScreen.name,
                    onClick = { navController.navigate(TrafficLightsSampleScreen.route) },
                )

                HomeScreenListItem(
                    label = UpcomingWorkoutListItemSampleScreen.name,
                    onClick = { navController.navigate(UpcomingWorkoutListItemSampleScreen.route) },
                )

                HomeScreenListItem(
                    label = WorkoutStatisticsSampleScreen.name,
                    onClick = { navController.navigate(WorkoutStatisticsSampleScreen.route) },
                )

                HomeScreenListItem(
                    label = YourMostBookedSampleScreen.name,
                    onClick = { navController.navigate(YourMostBookedSampleScreen.route) },
                )
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
