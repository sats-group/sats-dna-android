package com.sats.dna.components.sessiondetails

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.SatsIcons
import com.sats.dna.components.SatsPlaceholderBox
import com.sats.dna.components.SatsPlaceholderText
import com.sats.dna.components.SatsSurface
import com.sats.dna.icons.Calendar
import com.sats.dna.icons.Gx
import com.sats.dna.icons.Location
import com.sats.dna.icons.Pt
import com.sats.dna.icons.Time
import com.sats.dna.internal.MaterialIcon
import com.sats.dna.theme.SatsTheme

/**
 * Layout composable for info labels in a session detail screen.
 * Use the [SatsSessionDetailsInfoLabel] to populate the slots in this component.
 *
 * @param [durationLabel] Top left label that should describe the duration of the session.
 * @param [dateLabel] Top right label that should describe the date of the session.
 * @param [locationLabel] Bottom label that should describe the location of the session.
 *
 * **/
@Composable
fun SatsSessionDetailsInfoSection(
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
fun SatsSessionDetailsInfoLabel(
    icon: ImageVector,
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
            modifier.padding(horizontal = SatsTheme.spacing.m, vertical = SatsTheme.spacing.xs)
        },
        horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        val contentColor = if (onClick == null) {
            SatsTheme.colors.backgrounds.primary.default.fg
        } else {
            SatsTheme.colors.buttons.action.default.fg
        }

        CompositionLocalProvider(LocalContentColor provides contentColor) {
            MaterialIcon(icon, contentDescription = null, Modifier.size(20.dp))
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
    SatsSessionDetailsInfoSection(
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
        SatsPlaceholderBox(Modifier.size(20.dp), SatsTheme.shapes.circle)
        SatsPlaceholderText(text)
    }
}

@PreviewLightDark
@Composable
private fun SatsSessionDetailsInfoSectionPreview() {
    SatsTheme {
        SatsSurface {
            SatsSessionDetailsInfoSection(
                durationLabel = {
                    SatsSessionDetailsInfoLabel(
                        icon = SatsIcons.Time,
                        text = "60 min",
                    )
                },
                dateLabel = {
                    SatsSessionDetailsInfoLabel(
                        icon = SatsIcons.Calendar,
                        text = "Sat, Dec 2 2:30 PM",
                    )
                },
                locationLabel = {
                    SatsSessionDetailsInfoLabel(
                        icon = SatsIcons.Location,
                        text = "SATS Bergen LHG",
                        onClick = {},
                    )
                },
                workoutTypeLabel = {
                    SatsSessionDetailsInfoLabel(
                        icon = SatsIcons.Gx,
                        text = "Strength Training",
                    )
                },
                gxNameLabel = {
                    SatsSessionDetailsInfoLabel(
                        icon = SatsIcons.Pt,
                        text = "Pure Strength",
                    )
                },
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun SessionDetailsInfoSectionPlaceholderPreview() {
    SatsTheme {
        SatsSurface {
            SessionDetailsInfoSectionPlaceholder()
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsSessionDetailsInfoSectionPlaceholderPreview() {
    SatsTheme {
        SatsSurface {
            SatsSessionDetailsInfoSection(
                durationLabel = { SessionDetailsInfoLabelPlaceholder("60 min") },
                dateLabel = { SessionDetailsInfoLabelPlaceholder("Sat, Dec 2 2:30 PM") },
                locationLabel = { SessionDetailsInfoLabelPlaceholder("SATS Bergen LHG") },
                workoutTypeLabel = { SessionDetailsInfoLabelPlaceholder("Strength Training") },
                gxNameLabel = { SessionDetailsInfoLabelPlaceholder("Pure Strength") },
            )
        }
    }
}
