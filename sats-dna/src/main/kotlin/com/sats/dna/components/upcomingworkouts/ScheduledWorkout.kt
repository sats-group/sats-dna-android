package com.sats.dna.components.upcomingworkouts

data class ScheduledWorkout(
    val id: String,
    val day: String,
    val time: String,
    val duration: String,
    val name: String,
    val location: String,
    val instructor: String,
    val waitingListStatus: WaitingListStatus?,
)

sealed interface WaitingListStatus {
    val text: String

    data class OnWaitingList(override val text: String) : WaitingListStatus
    data class SpotSecured(override val text: String) : WaitingListStatus
}
