package com.sats.dna.components.sessiondetails

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.LocalContentColor
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import com.sats.dna.components.PlaceholderBox
import com.sats.dna.components.SatsSurface
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

/**
 * Layout composable for info labels in a session detail screen.
 * Use the [SessionDetailsInfoLabel] to populate the slots in this component.
 *
 * @param [durationLabel] Top left label that should describe the duration of the session.
 * @param [dateLabel] Top right label that should describe the date of the session.
 * @param [locationLabel] Bottom label that should describe the location of the session.
 *
 * **/
@Composable
fun SessionDetailsInfoSection(
    durationLabel: @Composable () -> Unit,
    dateLabel: @Composable () -> Unit,
    locationLabel: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    workoutTypeLabel: (@Composable () -> Unit)?,
    gxNameLabel: (@Composable () -> Unit)?,
) {
    Column(
        modifier
            .fillMaxWidth()
            .padding(top = SatsTheme.spacing.m, bottom = SatsTheme.spacing.m - SatsTheme.spacing.xs),
        Arrangement.spacedBy(SatsTheme.spacing.m),
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            durationLabel()
            dateLabel()
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            locationLabel()
            workoutTypeLabel?.invoke()
        }

        gxNameLabel?.invoke()
    }
}

/**
 * Label composable for info about a session.
 *
 * @param [icon] Icon to be displayed before the label text.
 * @param [text] The label text.
 * @param [onClick] Optional callback for when the label is pressed. If not null the label content color will be blue.
 *
 * **/
@Composable
fun SessionDetailsInfoLabel(
    icon: Painter,
    text: String,
    modifier: Modifier = Modifier,
    onClick: (() -> Unit)? = null,
) {
    Row(
        modifier = if (onClick != null) {
            modifier
                .padding(horizontal = SatsTheme.spacing.m - SatsTheme.spacing.xs)
                .clip(SatsTheme.shapes.roundedCorners.small)
                .clickable { onClick() }
                .padding(SatsTheme.spacing.xs)
        } else {
            modifier
                .padding(horizontal = SatsTheme.spacing.m)
        },
        horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        CompositionLocalProvider(
            LocalContentColor provides if (onClick != null) {
                SatsTheme.colors.action.default
            } else {
                LocalContentColor.current
            },
        ) {
            Icon(icon, contentDescription = null, Modifier.size(20.dp))
            Text(text)
        }
    }
}

@Composable
fun SessionDetailsSectionPlaceholder(
    modifier: Modifier = Modifier,
    showDurationLabel: Boolean = true,
    showDateLabel: Boolean = true,
    showLocationLabel: Boolean = true,
    showWorkoutTypeLabel: Boolean = false,
) {
    SessionDetailsInfoSection(
        modifier = modifier,
        durationLabel = {
            if (showDurationLabel) {
                PlaceholderBox {
                    SessionDetailsInfoLabel(
                        icon = SatsTheme.icons.time,
                        text = "60 minutes",
                    )
                }
            }
        },
        dateLabel = {
            if (showDateLabel) {
                PlaceholderBox {
                    SessionDetailsInfoLabel(
                        icon = SatsTheme.icons.calendar,
                        text = "7.des., 10:30",
                    )
                }
            }
        },
        locationLabel = {
            if (showLocationLabel) {
                PlaceholderBox {
                    SessionDetailsInfoLabel(
                        icon = SatsTheme.icons.location,
                        text = "SATS Sagene",
                    )
                }
            }
        },
        workoutTypeLabel = {
            if (showWorkoutTypeLabel) {
                PlaceholderBox {
                    SessionDetailsInfoLabel(
                        icon = SatsTheme.icons.workoutGymFloor,
                        text = "Strength Training",
                    )
                }
            }
        },
        gxNameLabel = {
            if (showWorkoutTypeLabel) {
                PlaceholderBox {
                    SessionDetailsInfoLabel(
                        icon = SatsTheme.icons.workoutGymFloor,
                        text = "Pure Strength",
                    )
                }
            }
        },
    )
}

@LightDarkPreview
@Composable
private fun SessionDetailsInfoSectionPreview() {
    SatsTheme {
        SatsSurface {
            SessionDetailsInfoSection(
                durationLabel = {
                    SessionDetailsInfoLabel(
                        icon = SatsTheme.icons.time,
                        text = "60 min",
                    )
                },
                dateLabel = {
                    SessionDetailsInfoLabel(
                        icon = SatsTheme.icons.calendar,
                        text = "Sat, Dec 2 2:30 PM",
                    )
                },
                locationLabel = {
                    SessionDetailsInfoLabel(
                        icon = SatsTheme.icons.location,
                        text = "SATS Bergen LHG",
                        onClick = {},
                    )
                },
                workoutTypeLabel = {
                    SessionDetailsInfoLabel(
                        icon = SatsTheme.icons.workoutGx,
                        text = "Strength Training",
                    )
                },
                gxNameLabel = {
                    SessionDetailsInfoLabel(
                        icon = SatsTheme.icons.workoutPt,
                        text = "Pure Strength",
                    )
                },
            )
        }
    }
}

@LightDarkPreview
@Composable
private fun SessionDetailsInfoSectionPlaceholderPreview() {
    SatsTheme {
        SatsSurface {
            SessionDetailsSectionPlaceholder(
                Modifier.padding(horizontal = SatsTheme.spacing.m),
            )
        }
    }
}
