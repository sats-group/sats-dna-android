package com.sats.dna.sample

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import com.sats.dna.sample.home.HomeScreen
import com.sats.dna.sample.internal.sampleAppComposable
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
    sampleAppComposable<HomeRoute> {
        HomeScreen(navController)
    }

    sampleAppComposable<ColorsSampleScreenRoute> {
        ColorsSampleScreen(navigateUp = navController::navigateUp)
    }

    sampleAppComposable<IconsSampleScreenRoute> {
        IconsSampleScreen(navigateUp = navController::navigateUp)
    }

    sampleAppComposable<TypographySampleScreenRoute> {
        TypographySampleScreen(navigateUp = navController::navigateUp)
    }

    sampleAppComposable<BadgeSampleScreenRoute> {
        BadgeSampleScreen(navigateUp = navController::navigateUp)
    }

    sampleAppComposable<BannerSampleScreenRoute> {
        BannerSampleScreen(navigateUp = navController::navigateUp)
    }

    sampleAppComposable<BrandLogoSampleScreenRoute> {
        BrandLogoSampleScreen(navigateUp = navController::navigateUp)
    }

    sampleAppComposable<ButtonsSampleScreenRoute> {
        ButtonsSampleScreen(navigateUp = navController::navigateUp)
    }

    sampleAppComposable<ArticleCardSampleScreenRoute> {
        ArticleCardSampleScreen(navigateUp = navController::navigateUp)
    }

    sampleAppComposable<CardSampleScreenRoute> {
        CardSampleScreen(navigateUp = navController::navigateUp)
    }

    sampleAppComposable<ChallengeBackgroundSampleScreenRoute> {
        ChallengeBackgroundSampleScreen(navigateUp = navController::navigateUp)
    }

    sampleAppComposable<ChallengeBadgeSampleScreenRoute> {
        ChallengeBadgeSampleScreen(navigateUp = navController::navigateUp)
    }

    sampleAppComposable<ChallengeCardSampleScreenRoute> {
        ChallengeCardSampleScreen(navigateUp = navController::navigateUp)
    }

    sampleAppComposable<CheckboxSampleScreenRoute> {
        CheckboxSampleScreen(navigateUp = navController::navigateUp)
    }

    sampleAppComposable<ChipsSampleScreenRoute> {
        ChipsSampleScreen(navigateUp = navController::navigateUp)
    }

    sampleAppComposable<CompletedWorkoutListItemSampleScreenRoute> {
        CompletedWorkoutListItemSampleScreen(navigateUp = navController::navigateUp)
    }

    sampleAppComposable<DividersSampleScreenRoute> {
        DividersSampleScreen(navigateUp = navController::navigateUp)
    }

    sampleAppComposable<EmptyStateSampleScreenRoute> {
        EmptyStateSampleScreen(navigateUp = navController::navigateUp)
    }

    sampleAppComposable<FancyTopAppBarSampleScreenRoute> {
        FancyTopAppBarSampleScreen(navigateUp = navController::navigateUp)
    }

    sampleAppComposable<FormInputFieldsSampleScreenRoute> {
        FormInputFieldsSampleScreen(navigateUp = navController::navigateUp)
    }

    sampleAppComposable<FriendsBookingStatusSampleScreenRoute> {
        FriendsBookingStatusSampleScreen(navigateUp = navController::navigateUp)
    }

    sampleAppComposable<GeneralListItemSampleScreenRoute> {
        GeneralListItemSampleScreen(navigateUp = navController::navigateUp)
    }

    sampleAppComposable<JoinYourFriendsSampleScreenRoute> {
        JoinYourFriendsSampleScreen(navigateUp = navController::navigateUp)
    }

    sampleAppComposable<PlaceholdersSampleScreenRoute> {
        PlaceholdersSampleScreen(navigateUp = navController::navigateUp)
    }

    sampleAppComposable<ProgressBarsSampleScreenRoute> {
        ProgressBarsSampleScreen(navigateUp = navController::navigateUp)
    }

    sampleAppComposable<ProteinBarSampleScreenRoute> {
        ProteinBarSampleScreen(navigateUp = navController::navigateUp)
    }

    sampleAppComposable<RadioButtonsSampleScreenRoute> {
        RadioButtonsSampleScreen(navigateUp = navController::navigateUp)
    }

    sampleAppComposable<ScaleBarSampleScreenRoute> {
        ScaleBarSampleScreen(navigateUp = navController::navigateUp)
    }

    sampleAppComposable<ScheduleSampleScreenRoute> {
        ScheduleSampleScreen(navigateUp = navController::navigateUp)
    }

    sampleAppComposable<SearchBarSampleScreenRoute> {
        SearchBarSampleScreen(navigateUp = navController::navigateUp)
    }

    sampleAppComposable<SessionDetailsInfoLabelSampleScreenRoute> {
        SessionDetailsInfoLabelSampleScreen(navigateUp = navController::navigateUp)
    }

    sampleAppComposable<SurfaceSampleScreenRoute> {
        SurfaceSampleScreen(navigateUp = navController::navigateUp)
    }

    sampleAppComposable<SwitchSampleScreenRoute> {
        SwitchSampleScreen(navigateUp = navController::navigateUp)
    }

    sampleAppComposable<TabRowSampleScreenRoute> {
        TabRowSampleScreen(navigateUp = navController::navigateUp)
    }

    sampleAppComposable<TagsSampleScreenRoute> {
        TagsSampleScreen(navigateUp = navController::navigateUp)
    }

    sampleAppComposable<TextFieldSampleScreenRoute> {
        TextFieldSampleScreen(navigateUp = navController::navigateUp)
    }

    sampleAppComposable<TitledSectionSampleScreenRoute> {
        TitledSectionSampleScreen(navigateUp = navController::navigateUp)
    }

    sampleAppComposable<TopAppBarSampleScreenRoute> {
        TopAppBarSampleScreen(navigateUp = navController::navigateUp)
    }

    sampleAppComposable<TrafficLightsSampleScreenRoute> {
        TrafficLightsSampleScreen(navigateUp = navController::navigateUp)
    }

    sampleAppComposable<UpcomingWorkoutListItemSampleScreenRoute> {
        UpcomingWorkoutListItemSampleScreen(navigateUp = navController::navigateUp)
    }

    sampleAppComposable<WorkoutStatisticsSampleScreenRoute> {
        WorkoutStatisticsSampleScreen(navigateUp = navController::navigateUp)
    }

    sampleAppComposable<YourMostBookedSampleScreenRoute> {
        YourMostBookedSampleScreen(navigateUp = navController::navigateUp)
    }
}
