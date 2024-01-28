package com.sats.dna.sample.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sats.dna.components.sessiondetails.FriendsBookingState
import com.sats.dna.components.sessiondetails.FriendsBookingStatus
import com.sats.dna.components.sessiondetails.FriendsBookingStatusListItem
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

data object FriendsBookingStatusSampleScreen : SampleScreen(
    name = "Friends Booking Status List Item",
    route = "/components/friends-booking-status",
    screen = { FriendsBookingStatusScreen(it::navigateUp) },
)

@Composable
private fun FriendsBookingStatusScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen(
        title = "Friends Booking Status",
        navigateUp = navigateUp,
        modifier = modifier,
    ) { innerPadding ->
        Column(
            Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .wrapContentSize()
                .background(SatsTheme.colors2.surfaces.primary.bg.default),
        ) {
            friendsBookingStates.forEach { bookingState ->
                FriendsBookingStatusListItem(
                    image = {
                        Icon(
                            painter = SatsTheme.icons.imagePlaceholder,
                            contentDescription = null,
                            modifier = Modifier.size(24.dp),
                        )
                    },
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

@LightDarkPreview
@Composable
private fun Preview() {
    SatsTheme {
        FriendsBookingStatusScreen(navigateUp = {})
    }
}
