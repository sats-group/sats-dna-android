package com.sats.dna.components.upcomingworkouts

data class UpcomingWorkout(
    val id: String,
    val day: String,
    val time: String,
    val duration: String,
    val name: String,
    val workoutTypeLabel: String?,
    val location: String?,
    val instructor: String?,
    val waitingListStatus: WaitingListStatus?,
    val workoutType: WorkoutType? = null,
)

sealed interface WaitingListStatus {
    val text: String

    data class OnWaitingList(override val text: String) : WaitingListStatus
    data class SpotSecured(
        override val text: String,
        val waitingListText: String? = null,
    ) : WaitingListStatus
}

enum class WorkoutType {
    Pt,
    Gx,
    Treatment,
    Gymfloor,
    OwnTraining,
}
