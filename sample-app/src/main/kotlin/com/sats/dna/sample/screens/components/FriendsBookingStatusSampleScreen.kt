package com.sats.dna.sample.screens.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.components.SatsProfileAvatarImage
import com.sats.dna.components.sessiondetails.FriendsBookingState
import com.sats.dna.components.sessiondetails.FriendsBookingStatus
import com.sats.dna.components.sessiondetails.SatsFriendsBookingStatusListItem
import com.sats.dna.sample.screens.SampleScreen
import com.sats.dna.theme.SatsTheme

@Composable
fun FriendsBookingStatusSampleScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    SampleScreen(
        title = "Friends Booking Status",
        navigateUp = navigateUp,
        modifier = modifier,
    ) { innerPadding ->
        Column(
            Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .wrapContentSize()
                .background(SatsTheme.colors.surfaces.primary.default.bg),
        ) {
            friendsBookingStates.forEach { bookingState ->
                SatsFriendsBookingStatusListItem(
                    image = { SatsProfileAvatarImage(imageUrl = null, Modifier.size(24.dp)) },
                    name = "Your best friend",
                    bookingState = bookingState,
                    onClick = { },
                )
            }
        }
    }
}

private val friendsBookingStates = listOf(
    FriendsBookingState(
        status = FriendsBookingStatus.Booked,
        statusText = "Is going!",
    ),
    FriendsBookingState(
        status = FriendsBookingStatus.Pending,
        statusText = "Pending",
    ),
    FriendsBookingState(
        status = FriendsBookingStatus.Declined,
        statusText = "Declined",
    ),
    FriendsBookingState(
        status = FriendsBookingStatus.Owner,
        statusText = "Owner",
    ),
    FriendsBookingState(
        status = FriendsBookingStatus.Invited,
        statusText = "Invited",
    ),
    FriendsBookingState(
        status = FriendsBookingStatus.Removed,
        statusText = "Removed",
    ),
    FriendsBookingState(
        status = FriendsBookingStatus.WaitingList,
        statusText = "On the waiting list",
    ),
)

@PreviewLightDark
@Composable
private fun FriendsBookingStatusSampleScreenPreview() {
    SatsTheme {
        FriendsBookingStatusSampleScreen(navigateUp = {})
    }
}
