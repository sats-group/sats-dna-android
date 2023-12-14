package com.sats.dna.components.icons

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import com.sats.dna.components.SatsSurface
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

/**
 * Displays a default image representing the type of an instructor.
 * Meant to be used when the instructor doesn't have a specific profile image.
 *
 * @param instructorType The type of the instructor.
 * @param modifier The modifier to apply to the instructor icon.
 */
@Composable
fun DefaultInstructorIcon(
    instructorType: InstructorType,
    modifier: Modifier = Modifier,
) {
    val placeholderText = when (instructorType) {
        InstructorType.Gx -> "IN"
        InstructorType.Pt -> "PT"
    }

    Box(
        modifier = modifier
            .size(SatsTheme.spacing.l)
            .clip(CircleShape)
            .background(SatsTheme.colors.primary.default),
    ) {
        Text(
            text = placeholderText,
            style = SatsTheme.typography.satsHeadlineEmphasis.small,
            color = SatsTheme.colors.onPrimary.default,
            modifier = Modifier.align(Alignment.Center),
        )
    }
}

/**
 * Enum class representing the type of an instructor.
 * Either "Pt" for Personal Trainer or "Gx" for Group Exercise Instructor.
 */
enum class InstructorType {
    Pt, Gx,
}

@LightDarkPreview
@Composable
private fun GxPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            DefaultInstructorIcon(InstructorType.Gx, Modifier.padding(SatsTheme.spacing.m))
        }
    }
}

@LightDarkPreview
@Composable
private fun PtPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            DefaultInstructorIcon(InstructorType.Pt, Modifier.padding(SatsTheme.spacing.m))
        }
    }
}
