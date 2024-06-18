package com.sats.dna.components.upcomingworkouts

data class SatsUpcomingWorkout(
    val id: String,
    val day: String,
    val time: String,
    val duration: String,
    val name: String,
    val workoutTypeLabel: String?,
    val location: String?,
    val instructor: String?,
    val clipCardId: String?,
    val waitingListStatus: SatsWaitingListStatus?,
    val workoutType: SatsWorkoutType? = null,
)

sealed interface SatsWaitingListStatus {
    val text: String

    data class OnWaitingList(override val text: String) : SatsWaitingListStatus

    data class SpotSecured(
        override val text: String,
        val waitingListText: String? = null,
    ) : SatsWaitingListStatus
}

enum class SatsWorkoutType {
    Pt,
    Gx,
    Treatment,
    Gymfloor,
    OwnTraining,
}
