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
import com.sats.dna.components.PlaceholderText
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
    workoutTypeLabel: (@Composable () -> Unit)?,
    gxNameLabel: (@Composable () -> Unit)?,
    modifier: Modifier = Modifier,
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
        val contentColor = if (onClick == null) {
            SatsTheme.colors.onBackground.primary
        } else {
            SatsTheme.colors.action.default
        }

        CompositionLocalProvider(LocalContentColor provides contentColor) {
            Icon(icon, contentDescription = null, Modifier.size(20.dp))
            Text(text)
        }
    }
}

@Composable
fun SessionDetailsInfoSectionPlaceholder(
    modifier: Modifier = Modifier,
    showDurationLabel: Boolean = true,
    showDateLabel: Boolean = true,
    showLocationLabel: Boolean = true,
    showWorkoutTypeLabel: Boolean = true,
    showGxNameLabel: Boolean = true,
) {
    SessionDetailsInfoSection(
        modifier = modifier,
        durationLabel = {
            if (showDurationLabel) {
                SessionDetailsInfoLabelPlaceholder("60 min")
            }
        },
        dateLabel = {
            if (showDateLabel) {
                SessionDetailsInfoLabelPlaceholder("Sat, Dec 2 2:30 PM")
            }
        },
        locationLabel = {
            if (showLocationLabel) {
                SessionDetailsInfoLabelPlaceholder("SATS Bergen LHG")
            }
        },
        workoutTypeLabel = {
            if (showWorkoutTypeLabel) {
                SessionDetailsInfoLabelPlaceholder("Strength Training")
            }
        },
        gxNameLabel = {
            if (showGxNameLabel) {
                SessionDetailsInfoLabelPlaceholder("Pure Strength")
            }
        },
    )
}

@Composable
fun SessionDetailsInfoLabelPlaceholder(text: String, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.padding(horizontal = SatsTheme.spacing.m, vertical = SatsTheme.spacing.xs),
        horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        PlaceholderBox(Modifier.size(20.dp), SatsTheme.shapes.circle)
        PlaceholderText(text)
    }
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
            SessionDetailsInfoSectionPlaceholder()
        }
    }
}

@LightDarkPreview
@Composable
private fun SessionDetailsInfoLabelPlaceholderPreview() {
    SatsTheme {
        SatsSurface {
            SessionDetailsInfoSection(
                durationLabel = { SessionDetailsInfoLabelPlaceholder("60 min") },
                dateLabel = { SessionDetailsInfoLabelPlaceholder("Sat, Dec 2 2:30 PM") },
                locationLabel = { SessionDetailsInfoLabelPlaceholder("SATS Bergen LHG") },
                workoutTypeLabel = { SessionDetailsInfoLabelPlaceholder("Strength Training") },
                gxNameLabel = { SessionDetailsInfoLabelPlaceholder("Pure Strength") },
            )
        }
    }
}
