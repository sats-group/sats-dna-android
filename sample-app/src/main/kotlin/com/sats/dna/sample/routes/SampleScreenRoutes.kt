package com.sats.dna.sample.routes

import kotlinx.serialization.Serializable

@Serializable
sealed class SampleScreenRoute(val name: String)

@Serializable
data object ArticleCardSampleScreenRoute : SampleScreenRoute("Article Card")

@Serializable
data object BadgeSampleScreenRoute : SampleScreenRoute("Badge")

@Serializable
data object BannerSampleScreenRoute : SampleScreenRoute("Banner")

@Serializable
data object BrandLogoSampleScreenRoute : SampleScreenRoute("Brand Logo")

@Serializable
data object ButtonsSampleScreenRoute : SampleScreenRoute("Buttons")

@Serializable
data object CardSampleScreenRoute : SampleScreenRoute("Card")

@Serializable
data object ChallengeBackgroundSampleScreenRoute : SampleScreenRoute("Challenge Background")

@Serializable
data object ChallengeBadgeSampleScreenRoute : SampleScreenRoute("Challenge Badge")

@Serializable
data object ChallengeCardSampleScreenRoute : SampleScreenRoute("Challenge Card")

@Serializable
data object CheckboxSampleScreenRoute : SampleScreenRoute("Checkbox")

@Serializable
data object ChipsSampleScreenRoute : SampleScreenRoute("Chips")

@Serializable
data object ColorsSampleScreenRoute : SampleScreenRoute("Colors")

@Serializable
data object CompletedWorkoutListItemSampleScreenRoute : SampleScreenRoute("Completed Workout List Item")

@Serializable
data object ComponentScreenRoute : SampleScreenRoute("Com")

@Serializable
data object DividersSampleScreenRoute : SampleScreenRoute("Dividers")

@Serializable
data object EmptyStateSampleScreenRoute : SampleScreenRoute("Empty State")

@Serializable
data object FancyTopAppBarSampleScreenRoute : SampleScreenRoute("Fancy Top App Bar")

@Serializable
data object FormInputFieldsSampleScreenRoute : SampleScreenRoute("Form Input Fields")

@Serializable
data object FriendsBookingStatusSampleScreenRoute : SampleScreenRoute("Friends Booking Status")

@Serializable
data object GeneralListItemSampleScreenRoute : SampleScreenRoute("General List Item")

@Serializable
data object IconsSampleScreenRoute : SampleScreenRoute("Icons")

@Serializable
data object JoinYourFriendsSampleScreenRoute : SampleScreenRoute("Join Your Friends")

@Serializable
data object PlaceholdersSampleScreenRoute : SampleScreenRoute("Placeholders")

@Serializable
data object ProgressBarsSampleScreenRoute : SampleScreenRoute("Progress Bars")

@Serializable
data object ProteinBarSampleScreenRoute : SampleScreenRoute("Protein Bar")

@Serializable
data object RadioButtonsSampleScreenRoute : SampleScreenRoute("Radio Buttons")

@Serializable
data object ScaleBarSampleScreenRoute : SampleScreenRoute("Scale Bar")

@Serializable
data object ScheduleSampleScreenRoute : SampleScreenRoute("Schedule")

@Serializable
data object SearchBarSampleScreenRoute : SampleScreenRoute("Search Bar")

@Serializable
data object SessionDetailsInfoLabelSampleScreenRoute : SampleScreenRoute("Session Details Info Label")

@Serializable
data object SurfaceSampleScreenRoute : SampleScreenRoute("Surface")

@Serializable
data object SwitchSampleScreenRoute : SampleScreenRoute("Switch")

@Serializable
data object TabRowSampleScreenRoute : SampleScreenRoute("Tab Row")

@Serializable
data object TagsSampleScreenRoute : SampleScreenRoute("Tags")

@Serializable
data object TextFieldSampleScreenRoute : SampleScreenRoute("Text Field")

@Serializable
data object TitledSectionSampleScreenRoute : SampleScreenRoute("Titled Section")

@Serializable
data object TopAppBarSampleScreenRoute : SampleScreenRoute("Top App Bar")

@Serializable
data object TrafficLightsSampleScreenRoute : SampleScreenRoute("Traffic Lights")

@Serializable
data object TypographySampleScreenRoute : SampleScreenRoute("Typography")

@Serializable
data object UpcomingWorkoutListItemSampleScreenRoute : SampleScreenRoute("Upcoming Workout List Item")

@Serializable
data object WorkoutStatisticsSampleScreenRoute : SampleScreenRoute("Workout Statistics")

@Serializable
data object YourMostBookedSampleScreenRoute : SampleScreenRoute("Your Most Booked")
