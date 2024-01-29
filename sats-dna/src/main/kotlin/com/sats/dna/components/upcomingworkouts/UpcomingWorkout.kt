package com.sats.dna.components.upcomingworkouts

import androidx.compose.ui.graphics.Color

data class UpcomingWorkout(
    val id: String,
    val day: String,
    val time: String,
    val duration: String,
    val name: String,
    val workoutType: String?,
    val location: String?,
    val instructor: String?,
    val waitingListStatus: WaitingListStatus?,
    val workoutTypeColor: Color? = null,
)

sealed interface WaitingListStatus {
    val text: String

    data class OnWaitingList(override val text: String) : WaitingListStatus
    data class SpotSecured(
        override val text: String,
        val waitingListText: String? = null,
    ) : WaitingListStatus
}
