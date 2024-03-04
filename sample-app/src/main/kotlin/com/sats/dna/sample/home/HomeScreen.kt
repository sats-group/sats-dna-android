package com.sats.dna.sample.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.sats.dna.components.SatsHorizontalDivider
import com.sats.dna.components.appbar.SatsTopAppBar
import com.sats.dna.components.screen.SatsScreen
import com.sats.dna.sample.screens.BannerSampleScreen
import com.sats.dna.sample.screens.BottomNavigationSampleScreen
import com.sats.dna.sample.screens.BrandLogoSampleScreen
import com.sats.dna.sample.screens.ButtonsSampleScreen
import com.sats.dna.sample.screens.CampaignModuleSampleScreen
import com.sats.dna.sample.screens.CardSampleScreen
import com.sats.dna.sample.screens.ChallengeBackgroundSampleScreen
import com.sats.dna.sample.screens.ChallengeBadgeSampleScreen
import com.sats.dna.sample.screens.CheckboxSampleScreen
import com.sats.dna.sample.screens.ChipsSampleScreen
import com.sats.dna.sample.screens.Colors2SampleScreen
import com.sats.dna.sample.screens.ColorsSampleScreen
import com.sats.dna.sample.screens.CompletedWorkoutListItemSampleScreen
import com.sats.dna.sample.screens.DividersSampleScreen
import com.sats.dna.sample.screens.EmptyStateSampleScreen
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
import com.sats.dna.sample.screens.TopAppBarSampleScreen
import com.sats.dna.sample.screens.TrafficLightsSampleScreen
import com.sats.dna.sample.screens.TypographySampleScreen
import com.sats.dna.sample.screens.UpcomingWorkoutListItemSampleScreen
import com.sats.dna.sample.screens.YourMostBookedSampleScreen
import com.sats.dna.theme.SatsTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun HomeScreen(navController: NavController) {
    SatsScreen(
        topBar = { SatsTopAppBar("SATS DNA Sample App") },
        bottomBar = { Box(Modifier.navigationBarsPadding()) },
    ) { innerPadding ->
        Column(
            Modifier
                .verticalScroll(rememberScrollState())
                .padding(innerPadding),
        ) {
            ColorsSampleScreen.HomeListItem(navController)
            Colors2SampleScreen.HomeListItem(navController)
            IconsSampleScreen.HomeListItem(navController)
            TypographySampleScreen.HomeListItem(navController)

            SatsHorizontalDivider(Modifier.padding(vertical = SatsTheme.spacing.s))

            BannerSampleScreen.HomeListItem(navController)
            BottomNavigationSampleScreen.HomeListItem(navController)
            BrandLogoSampleScreen.HomeListItem(navController)
            ButtonsSampleScreen.HomeListItem(navController)
            CampaignModuleSampleScreen.HomeListItem(navController)
            CardSampleScreen.HomeListItem(navController)
            ChallengeBackgroundSampleScreen.HomeListItem(navController)
            ChallengeBadgeSampleScreen.HomeListItem(navController)
            CheckboxSampleScreen.HomeListItem(navController)
            ChipsSampleScreen.HomeListItem(navController)
            CompletedWorkoutListItemSampleScreen.HomeListItem(navController)
            DividersSampleScreen.HomeListItem(navController)
            EmptyStateSampleScreen.HomeListItem(navController)
            FormInputFieldsSampleScreen.HomeListItem(navController)
            FriendsBookingStatusSampleScreen.HomeListItem(navController)
            GeneralListItemSampleScreen.HomeListItem(navController)
            JoinYourFriendsSampleScreen.HomeListItem(navController)
            PlaceholdersSampleScreen.HomeListItem(navController)
            ProgressBarsSampleScreen.HomeListItem(navController)
            ProteinBarSampleScreen.HomeListItem(navController)
            RadioButtonsSampleScreen.HomeListItem(navController)
            ScaleBarSampleScreen.HomeListItem(navController)
            ScheduleSampleScreen.HomeListItem(navController)
            SearchBarSampleScreen.HomeListItem(navController)
            SessionDetailsInfoLabelSampleScreen.HomeListItem(navController)
            SurfaceSampleScreen.HomeListItem(navController)
            SwitchSampleScreen.HomeListItem(navController)
            TagsSampleScreen.HomeListItem(navController)
            TextFieldSampleScreen.HomeListItem(navController)
            TopAppBarSampleScreen.HomeListItem(navController)
            TrafficLightsSampleScreen.HomeListItem(navController)
            UpcomingWorkoutListItemSampleScreen.HomeListItem(navController)
            YourMostBookedSampleScreen.HomeListItem(navController)
        }
    }
}
