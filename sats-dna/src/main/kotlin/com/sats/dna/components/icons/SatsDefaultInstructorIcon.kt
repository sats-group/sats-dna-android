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
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.SatsSurface
import com.sats.dna.theme.SatsTheme

/**
 * Displays a default image representing the type of an instructor.
 * Meant to be used when the instructor doesn't have a specific profile image.
 *
 * @param type The type of the instructor.
 * @param modifier The modifier to apply to the instructor icon.
 */
@Composable
fun SatsDefaultInstructorIcon(
    type: SatsDefaultInstructorIconType,
    modifier: Modifier = Modifier,
) {
    val placeholderText = when (type) {
        SatsDefaultInstructorIconType.Gx -> "IN"
        SatsDefaultInstructorIconType.Pt -> "PT"
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
enum class SatsDefaultInstructorIconType {
    Pt, Gx,
}

@PreviewLightDark
@Composable
private fun SatsDefaultInstructorIconGxPreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors2.backgrounds.primary.default.bg,
            useMaterial3 = true,
        ) {
            SatsDefaultInstructorIcon(
                SatsDefaultInstructorIconType.Gx,
                Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsDefaultInstructorIconPtPreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors2.backgrounds.primary.default.bg,
            useMaterial3 = true,
        ) {
            SatsDefaultInstructorIcon(
                SatsDefaultInstructorIconType.Pt,
                Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}
