package com.sats.dna.sample

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import com.sats.dna.sample.internal.sampleAppComposable
import com.sats.dna.sample.routes.HomeRoute
import com.sats.dna.sample.routes.components.ArticleCardSampleScreenRoute
import com.sats.dna.sample.routes.components.BadgeSampleScreenRoute
import com.sats.dna.sample.routes.components.BannerSampleScreenRoute
import com.sats.dna.sample.routes.components.BrandLogoSampleScreenRoute
import com.sats.dna.sample.routes.components.ButtonsSampleScreenRoute
import com.sats.dna.sample.routes.components.CardSampleScreenRoute
import com.sats.dna.sample.routes.components.ChallengeBackgroundSampleScreenRoute
import com.sats.dna.sample.routes.components.ChallengeBadgeSampleScreenRoute
import com.sats.dna.sample.routes.components.ChallengeCardSampleScreenRoute
import com.sats.dna.sample.routes.components.CheckboxSampleScreenRoute
import com.sats.dna.sample.routes.components.ChipsSampleScreenRoute
import com.sats.dna.sample.routes.components.CompletedWorkoutListItemSampleScreenRoute
import com.sats.dna.sample.routes.components.DividersSampleScreenRoute
import com.sats.dna.sample.routes.components.EmptyStateSampleScreenRoute
import com.sats.dna.sample.routes.components.FancyTopAppBarSampleScreenRoute
import com.sats.dna.sample.routes.components.FormInputFieldsSampleScreenRoute
import com.sats.dna.sample.routes.components.FriendsBookingStatusSampleScreenRoute
import com.sats.dna.sample.routes.components.GeneralListItemSampleScreenRoute
import com.sats.dna.sample.routes.components.JoinYourFriendsSampleScreenRoute
import com.sats.dna.sample.routes.components.PlaceholdersSampleScreenRoute
import com.sats.dna.sample.routes.components.ProgressBarsSampleScreenRoute
import com.sats.dna.sample.routes.components.ProteinBarSampleScreenRoute
import com.sats.dna.sample.routes.components.RadioButtonsSampleScreenRoute
import com.sats.dna.sample.routes.components.ScaleBarSampleScreenRoute
import com.sats.dna.sample.routes.components.ScheduleSampleScreenRoute
import com.sats.dna.sample.routes.components.SearchBarSampleScreenRoute
import com.sats.dna.sample.routes.components.SessionDetailsInfoLabelSampleScreenRoute
import com.sats.dna.sample.routes.components.SurfaceSampleScreenRoute
import com.sats.dna.sample.routes.components.SwitchSampleScreenRoute
import com.sats.dna.sample.routes.components.TabRowSampleScreenRoute
import com.sats.dna.sample.routes.components.TagsSampleScreenRoute
import com.sats.dna.sample.routes.components.TextFieldSampleScreenRoute
import com.sats.dna.sample.routes.components.TitledSectionSampleScreenRoute
import com.sats.dna.sample.routes.components.TopAppBarSampleScreenRoute
import com.sats.dna.sample.routes.components.TrafficLightsSampleScreenRoute
import com.sats.dna.sample.routes.components.UpcomingWorkoutListItemSampleScreenRoute
import com.sats.dna.sample.routes.components.WorkoutStatisticsSampleScreenRoute
import com.sats.dna.sample.routes.components.YourMostBookedSampleScreenRoute
import com.sats.dna.sample.routes.icons.IconsSampleScreenRoute
import com.sats.dna.sample.routes.styles.ColorsSampleScreenRoute
import com.sats.dna.sample.routes.styles.TypographySampleScreenRoute
import com.sats.dna.sample.screens.HomeScreen
import com.sats.dna.sample.screens.components.ArticleCardSampleScreen
import com.sats.dna.sample.screens.components.BadgeSampleScreen
import com.sats.dna.sample.screens.components.BannerSampleScreen
import com.sats.dna.sample.screens.components.BrandLogoSampleScreen
import com.sats.dna.sample.screens.components.ButtonsSampleScreen
import com.sats.dna.sample.screens.components.CardSampleScreen
import com.sats.dna.sample.screens.components.ChallengeBackgroundSampleScreen
import com.sats.dna.sample.screens.components.ChallengeBadgeSampleScreen
import com.sats.dna.sample.screens.components.ChallengeCardSampleScreen
import com.sats.dna.sample.screens.components.CheckboxSampleScreen
import com.sats.dna.sample.screens.components.ChipsSampleScreen
import com.sats.dna.sample.screens.components.CompletedWorkoutListItemSampleScreen
import com.sats.dna.sample.screens.components.DividersSampleScreen
import com.sats.dna.sample.screens.components.EmptyStateSampleScreen
import com.sats.dna.sample.screens.components.FancyTopAppBarSampleScreen
import com.sats.dna.sample.screens.components.FormInputFieldsSampleScreen
import com.sats.dna.sample.screens.components.FriendsBookingStatusSampleScreen
import com.sats.dna.sample.screens.components.GeneralListItemSampleScreen
import com.sats.dna.sample.screens.components.JoinYourFriendsSampleScreen
import com.sats.dna.sample.screens.components.PlaceholdersSampleScreen
import com.sats.dna.sample.screens.components.ProgressBarsSampleScreen
import com.sats.dna.sample.screens.components.ProteinBarSampleScreen
import com.sats.dna.sample.screens.components.RadioButtonsSampleScreen
import com.sats.dna.sample.screens.components.ScaleBarSampleScreen
import com.sats.dna.sample.screens.components.ScheduleSampleScreen
import com.sats.dna.sample.screens.components.SearchBarSampleScreen
import com.sats.dna.sample.screens.components.SessionDetailsInfoLabelSampleScreen
import com.sats.dna.sample.screens.components.SurfaceSampleScreen
import com.sats.dna.sample.screens.components.SwitchSampleScreen
import com.sats.dna.sample.screens.components.TabRowSampleScreen
import com.sats.dna.sample.screens.components.TagsSampleScreen
import com.sats.dna.sample.screens.components.TextFieldSampleScreen
import com.sats.dna.sample.screens.components.TitledSectionSampleScreen
import com.sats.dna.sample.screens.components.TopAppBarSampleScreen
import com.sats.dna.sample.screens.components.TrafficLightsSampleScreen
import com.sats.dna.sample.screens.components.UpcomingWorkoutListItemSampleScreen
import com.sats.dna.sample.screens.components.WorkoutStatisticsSampleScreen
import com.sats.dna.sample.screens.components.YourMostBookedSampleScreen
import com.sats.dna.sample.screens.icons.IconsSampleScreen
import com.sats.dna.sample.screens.styles.ColorsSampleScreen
import com.sats.dna.sample.screens.styles.TypographySampleScreen

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
