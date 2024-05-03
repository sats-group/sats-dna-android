package com.sats.dna.sample

import androidx.compose.runtime.CompositionLocalProvider
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.sats.dna.sample.home.HomeScreen
import com.sats.dna.sample.internal.LocalAnimatedContentScope
import com.sats.dna.sample.routes.ArticleCardSampleScreenRoute
import com.sats.dna.sample.routes.BadgeSampleScreenRoute
import com.sats.dna.sample.routes.BannerSampleScreenRoute
import com.sats.dna.sample.routes.BrandLogoSampleScreenRoute
import com.sats.dna.sample.routes.ButtonsSampleScreenRoute
import com.sats.dna.sample.routes.CardSampleScreenRoute
import com.sats.dna.sample.routes.ChallengeBackgroundSampleScreenRoute
import com.sats.dna.sample.routes.ChallengeBadgeSampleScreenRoute
import com.sats.dna.sample.routes.ChallengeCardSampleScreenRoute
import com.sats.dna.sample.routes.CheckboxSampleScreenRoute
import com.sats.dna.sample.routes.ChipsSampleScreenRoute
import com.sats.dna.sample.routes.ColorsSampleScreenRoute
import com.sats.dna.sample.routes.CompletedWorkoutListItemSampleScreenRoute
import com.sats.dna.sample.routes.DividersSampleScreenRoute
import com.sats.dna.sample.routes.EmptyStateSampleScreenRoute
import com.sats.dna.sample.routes.FancyTopAppBarSampleScreenRoute
import com.sats.dna.sample.routes.FormInputFieldsSampleScreenRoute
import com.sats.dna.sample.routes.FriendsBookingStatusSampleScreenRoute
import com.sats.dna.sample.routes.GeneralListItemSampleScreenRoute
import com.sats.dna.sample.routes.HomeRoute
import com.sats.dna.sample.routes.IconsSampleScreenRoute
import com.sats.dna.sample.routes.JoinYourFriendsSampleScreenRoute
import com.sats.dna.sample.routes.PlaceholdersSampleScreenRoute
import com.sats.dna.sample.routes.ProgressBarsSampleScreenRoute
import com.sats.dna.sample.routes.ProteinBarSampleScreenRoute
import com.sats.dna.sample.routes.RadioButtonsSampleScreenRoute
import com.sats.dna.sample.routes.ScaleBarSampleScreenRoute
import com.sats.dna.sample.routes.ScheduleSampleScreenRoute
import com.sats.dna.sample.routes.SearchBarSampleScreenRoute
import com.sats.dna.sample.routes.SessionDetailsInfoLabelSampleScreenRoute
import com.sats.dna.sample.routes.SurfaceSampleScreenRoute
import com.sats.dna.sample.routes.SwitchSampleScreenRoute
import com.sats.dna.sample.routes.TabRowSampleScreenRoute
import com.sats.dna.sample.routes.TagsSampleScreenRoute
import com.sats.dna.sample.routes.TextFieldSampleScreenRoute
import com.sats.dna.sample.routes.TitledSectionSampleScreenRoute
import com.sats.dna.sample.routes.TopAppBarSampleScreenRoute
import com.sats.dna.sample.routes.TrafficLightsSampleScreenRoute
import com.sats.dna.sample.routes.TypographySampleScreenRoute
import com.sats.dna.sample.routes.UpcomingWorkoutListItemSampleScreenRoute
import com.sats.dna.sample.routes.WorkoutStatisticsSampleScreenRoute
import com.sats.dna.sample.routes.YourMostBookedSampleScreenRoute
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
import com.sats.dna.sample.screens.TabRowSampleScreen
import com.sats.dna.sample.screens.TagsSampleScreen
import com.sats.dna.sample.screens.TextFieldSampleScreen
import com.sats.dna.sample.screens.TitledSectionSampleScreen
import com.sats.dna.sample.screens.TopAppBarSampleScreen
import com.sats.dna.sample.screens.TrafficLightsSampleScreen
import com.sats.dna.sample.screens.TypographySampleScreen
import com.sats.dna.sample.screens.UpcomingWorkoutListItemSampleScreen
import com.sats.dna.sample.screens.WorkoutStatisticsSampleScreen
import com.sats.dna.sample.screens.YourMostBookedSampleScreen

internal fun NavGraphBuilder.mainGraph(navController: NavController) {
    homeScreen(navController)

    composable<ColorsSampleScreenRoute> {
        ColorsSampleScreen.Content(navController)
    }

    composable<IconsSampleScreenRoute> {
        IconsSampleScreen.Content(navController)
    }

    composable<TypographySampleScreenRoute> {
        TypographySampleScreen.Content(navController)
    }

    composable<BadgeSampleScreenRoute> {
        BadgeSampleScreen.Content(navController)
    }

    composable<BannerSampleScreenRoute> {
        BannerSampleScreen.Content(navController)
    }

    composable<BrandLogoSampleScreenRoute> {
        BrandLogoSampleScreen.Content(navController)
    }

    composable<ButtonsSampleScreenRoute> {
        ButtonsSampleScreen.Content(navController)
    }

    composable<ArticleCardSampleScreenRoute> {
        ArticleCardSampleScreen.Content(navController)
    }

    composable<CardSampleScreenRoute> {
        CardSampleScreen.Content(navController)
    }

    composable<ChallengeBackgroundSampleScreenRoute> {
        ChallengeBackgroundSampleScreen.Content(navController)
    }

    composable<ChallengeBadgeSampleScreenRoute> {
        ChallengeBadgeSampleScreen.Content(navController)
    }

    composable<ChallengeCardSampleScreenRoute> {
        ChallengeCardSampleScreen.Content(navController)
    }

    composable<CheckboxSampleScreenRoute> {
        CheckboxSampleScreen.Content(navController)
    }

    composable<ChipsSampleScreenRoute> {
        ChipsSampleScreen.Content(navController)
    }

    composable<CompletedWorkoutListItemSampleScreenRoute> {
        CompletedWorkoutListItemSampleScreen.Content(navController)
    }

    composable<DividersSampleScreenRoute> {
        DividersSampleScreen.Content(navController)
    }

    composable<EmptyStateSampleScreenRoute> {
        EmptyStateSampleScreen.Content(navController)
    }

    composable<FancyTopAppBarSampleScreenRoute> {
        FancyTopAppBarSampleScreen.Content(navController)
    }

    composable<FormInputFieldsSampleScreenRoute> {
        FormInputFieldsSampleScreen.Content(navController)
    }

    composable<FriendsBookingStatusSampleScreenRoute> {
        FriendsBookingStatusSampleScreen.Content(navController)
    }

    composable<GeneralListItemSampleScreenRoute> {
        GeneralListItemSampleScreen.Content(navController)
    }

    composable<JoinYourFriendsSampleScreenRoute> {
        JoinYourFriendsSampleScreen.Content(navController)
    }

    composable<PlaceholdersSampleScreenRoute> {
        PlaceholdersSampleScreen.Content(navController)
    }

    composable<ProgressBarsSampleScreenRoute> {
        ProgressBarsSampleScreen.Content(navController)
    }

    composable<ProteinBarSampleScreenRoute> {
        ProteinBarSampleScreen.Content(navController)
    }

    composable<RadioButtonsSampleScreenRoute> {
        RadioButtonsSampleScreen.Content(navController)
    }

    composable<ScaleBarSampleScreenRoute> {
        ScaleBarSampleScreen.Content(navController)
    }

    composable<ScheduleSampleScreenRoute> {
        ScheduleSampleScreen.Content(navController)
    }

    composable<SearchBarSampleScreenRoute> {
        SearchBarSampleScreen.Content(navController)
    }

    composable<SessionDetailsInfoLabelSampleScreenRoute> {
        SessionDetailsInfoLabelSampleScreen.Content(navController)
    }

    composable<SurfaceSampleScreenRoute> {
        SurfaceSampleScreen.Content(navController)
    }

    composable<SwitchSampleScreenRoute> {
        SwitchSampleScreen.Content(navController)
    }

    composable<TabRowSampleScreenRoute> {
        TabRowSampleScreen.Content(navController)
    }

    composable<TagsSampleScreenRoute> {
        TagsSampleScreen.Content(navController)
    }

    composable<TextFieldSampleScreenRoute> {
        TextFieldSampleScreen.Content(navController)
    }

    composable<TitledSectionSampleScreenRoute> {
        TitledSectionSampleScreen.Content(navController)
    }

    composable<TopAppBarSampleScreenRoute> {
        TopAppBarSampleScreen.Content(navController)
    }

    composable<TrafficLightsSampleScreenRoute> {
        TrafficLightsSampleScreen.Content(navController)
    }

    composable<UpcomingWorkoutListItemSampleScreenRoute> {
        UpcomingWorkoutListItemSampleScreen.Content(navController)
    }

    composable<WorkoutStatisticsSampleScreenRoute> {
        WorkoutStatisticsSampleScreen.Content(navController)
    }

    composable<YourMostBookedSampleScreenRoute> {
        YourMostBookedSampleScreen.Content(navController)
    }
}

private fun NavGraphBuilder.homeScreen(navController: NavController) {
    composable<HomeRoute> {
        CompositionLocalProvider(LocalAnimatedContentScope provides this) {
            HomeScreen(navController)
        }
    }
}
