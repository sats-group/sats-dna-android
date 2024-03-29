package com.sats.dna.sample

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.sats.dna.sample.home.HomeScreen
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
import com.sats.dna.sample.screens.Colors2SampleScreen
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

internal const val MainRoute = "sats-dna"

internal fun NavGraphBuilder.mainGraph(navController: NavController) {
    navigation(startDestination = "/", MainRoute) {
        homeScreen(navController)

        ColorsSampleScreen.navScreen(navController)
        Colors2SampleScreen.navScreen(navController)
        IconsSampleScreen.navScreen(navController)
        TypographySampleScreen.navScreen(navController)

        BadgeSampleScreen.navScreen(navController)
        BannerSampleScreen.navScreen(navController)
        BrandLogoSampleScreen.navScreen(navController)
        ButtonsSampleScreen.navScreen(navController)
        ArticleCardSampleScreen.navScreen(navController)
        CardSampleScreen.navScreen(navController)
        ChallengeBackgroundSampleScreen.navScreen(navController)
        ChallengeBadgeSampleScreen.navScreen(navController)
        ChallengeCardSampleScreen.navScreen(navController)
        CheckboxSampleScreen.navScreen(navController)
        ChipsSampleScreen.navScreen(navController)
        CompletedWorkoutListItemSampleScreen.navScreen(navController)
        DividersSampleScreen.navScreen(navController)
        EmptyStateSampleScreen.navScreen(navController)
        FancyTopAppBarSampleScreen.navScreen(navController)
        FormInputFieldsSampleScreen.navScreen(navController)
        FriendsBookingStatusSampleScreen.navScreen(navController)
        GeneralListItemSampleScreen.navScreen(navController)
        JoinYourFriendsSampleScreen.navScreen(navController)
        PlaceholdersSampleScreen.navScreen(navController)
        ProgressBarsSampleScreen.navScreen(navController)
        ProteinBarSampleScreen.navScreen(navController)
        RadioButtonsSampleScreen.navScreen(navController)
        ScaleBarSampleScreen.navScreen(navController)
        ScheduleSampleScreen.navScreen(navController)
        SearchBarSampleScreen.navScreen(navController)
        SessionDetailsInfoLabelSampleScreen.navScreen(navController)
        SurfaceSampleScreen.navScreen(navController)
        SwitchSampleScreen.navScreen(navController)
        TagsSampleScreen.navScreen(navController)
        TextFieldSampleScreen.navScreen(navController)
        TitledSectionSampleScreen.navScreen(navController)
        TopAppBarSampleScreen.navScreen(navController)
        TrafficLightsSampleScreen.navScreen(navController)
        UpcomingWorkoutListItemSampleScreen.navScreen(navController)
        WorkoutStatisticsSampleScreen.navScreen(navController)
        YourMostBookedSampleScreen.navScreen(navController)
    }
}

private fun NavGraphBuilder.homeScreen(navController: NavController) {
    composable("/") {
        HomeScreen(navController)
    }
}
