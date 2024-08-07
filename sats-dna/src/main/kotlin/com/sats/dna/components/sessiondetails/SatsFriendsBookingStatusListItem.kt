package com.sats.dna.components.sessiondetails

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.dp
import com.sats.dna.components.SatsPlaceholderBox
import com.sats.dna.components.SatsPlaceholderText
import com.sats.dna.components.SatsSurface
import com.sats.dna.theme.SatsTheme

/**
 * List Item for invited Friends booking statuses in a session detail page.
 *
 * @param [image] The profile picture of the friend.
 * @param [name] The name of the friend.
 * @param [bookingState] A [FriendsBookingState] that describing the booking status of the friend,
 * and the text to be displayed for said status. The status will effect the color of the statusText.
 * @param [onClick] Callback for when the list item is clicked.
 * @param [modifier] Modifier to be applied to this composable.
 * @param [contextMenu] Optional context menu to be added at the end of the list item.
 * **/
@Composable
fun SatsFriendsBookingStatusListItem(
    image: @Composable () -> Unit,
    name: String,
    bookingState: FriendsBookingState,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    contextMenu: @Composable (() -> Unit)? = null,
) {
    Row(
        modifier = modifier
            .clickable { onClick() }
            .padding(horizontal = SatsTheme.spacing.m, vertical = SatsTheme.spacing.s)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xs),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        image()

        val colors = SatsTheme.colors.surfaces.primary.default

        Text(
            text = name,
            modifier = Modifier.weight(1f),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            color = colors.fg,
        )

        val textColor = when (bookingState.status) {
            FriendsBookingStatus.Owner -> colors.fgInformation
            FriendsBookingStatus.Invited, FriendsBookingStatus.Booked -> colors.fgSuccess
            FriendsBookingStatus.Pending -> colors.fgWarning
            FriendsBookingStatus.Declined, FriendsBookingStatus.Removed -> colors.fgError
            FriendsBookingStatus.WaitingList -> colors.fgWaitingList
        }

        Text(bookingState.statusText, color = textColor)

        contextMenu?.invoke()
    }
}

data class FriendsBookingState(
    val status: FriendsBookingStatus,
    val statusText: String,
)

enum class FriendsBookingStatus {
    Booked,
    Pending,
    WaitingList,
    Declined,
    Owner,
    Invited,
    Removed,
}

@Composable
fun SatsFriendsBookingStatusListPlaceholder(
    modifier: Modifier = Modifier,
    count: Int = 1,
) {
    Column(modifier) {
        repeat(count) {
            Row(
                modifier = Modifier.padding(SatsTheme.spacing.m),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                SatsPlaceholderBox(
                    shape = SatsTheme.shapes.circle,
                    modifier = Modifier.size(24.dp),
                )

                SatsPlaceholderText(
                    modifier = Modifier.padding(start = SatsTheme.spacing.m),
                    text = "Guro Olsen Ørbech",
                )

                Spacer(Modifier.weight(1f))

                SatsPlaceholderText("Pending")
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsFriendsBookingStatusListItemPreview(
    @PreviewParameter(FriendsBookingStatusPreviewProvider::class) bookingState: FriendsBookingState,
) {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            Column {
                SatsFriendsBookingStatusListItem(
                    image = {
                        Box(
                            modifier = Modifier
                                .size(24.dp)
                                .clip(SatsTheme.shapes.circle)
                                .background(SatsTheme.colors.graphicalElements.skeleton),
                        )
                    },
                    name = "Francisco Javier Peters Oregon Longname",
                    bookingState = bookingState,
                    onClick = {},
                    contextMenu = null,
                )
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsFriendsBookingStatusListPlaceholderPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            SatsFriendsBookingStatusListPlaceholder(count = 3)
        }
    }
}

private class FriendsBookingStatusPreviewProvider : PreviewParameterProvider<FriendsBookingState> {
    override val values: Sequence<FriendsBookingState>
        get() = sequenceOf(
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
}
