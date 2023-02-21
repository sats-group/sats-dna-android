package com.sats.dna.typography

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.sats.dna.R

data class SatsTypography(
    val default: SatsTextStyles,
    val medium: SatsTextStyles,
    val emphasis: SatsTextStyles,
    val satsFeeling: SatsTextStyles,
)

data class SatsTextStyles(
    val heading1: TextStyle,
    val heading2: TextStyle,
    val heading3: TextStyle,
    val large: TextStyle,
    val basic: TextStyle,
    val small: TextStyle,
    val button: TextStyle,
    val section: TextStyle,
)

internal val FontInter = FontFamily(
    Font(R.font.inter_regular, FontWeight.Normal),
    Font(R.font.inter_regular_italic, FontWeight.Normal, FontStyle.Italic),
    Font(R.font.inter_medium, FontWeight.Medium),
    Font(R.font.inter_medium_italic, FontWeight.Medium, FontStyle.Italic),
    Font(R.font.inter_semi_bold, FontWeight.SemiBold),
    Font(R.font.inter_semi_bold_italic, FontWeight.SemiBold, FontStyle.Italic),
    Font(R.font.inter_bold, FontWeight.Bold),
    Font(R.font.inter_bold_italic, FontWeight.Bold, FontStyle.Italic),
)

private val baseTextStyles = SatsTextStyles(
    heading1 = TextStyle(fontFamily = FontInter, fontSize = 28.sp),
    heading2 = TextStyle(fontFamily = FontInter, fontSize = 24.sp),
    heading3 = TextStyle(fontFamily = FontInter, fontSize = 20.sp),
    large = TextStyle(fontFamily = FontInter, fontSize = 16.sp),
    basic = TextStyle(fontFamily = FontInter, fontSize = 14.sp),
    small = TextStyle(fontFamily = FontInter, fontSize = 12.sp),
    button = TextStyle(fontFamily = FontInter, fontSize = 14.sp),
    section = TextStyle(fontFamily = FontInter, fontSize = 16.sp),
)

private val defaultTextStyles = baseTextStyles.copy(
    heading1 = baseTextStyles.heading1.copy(fontWeight = FontWeight.Normal),
    heading2 = baseTextStyles.heading2.copy(fontWeight = FontWeight.Normal),
    heading3 = baseTextStyles.heading3.copy(fontWeight = FontWeight.Normal),
    large = baseTextStyles.large.copy(fontWeight = FontWeight.Normal),
    basic = baseTextStyles.basic.copy(fontWeight = FontWeight.Normal),
    small = baseTextStyles.small.copy(fontWeight = FontWeight.Normal),
    button = baseTextStyles.button.copy(fontWeight = FontWeight.SemiBold),
    section = baseTextStyles.section.copy(fontWeight = FontWeight.SemiBold),
)

private val mediumTextStyles = baseTextStyles.copy(
    heading1 = baseTextStyles.heading1.copy(fontWeight = FontWeight.Medium),
    heading2 = baseTextStyles.heading2.copy(fontWeight = FontWeight.Medium),
    heading3 = baseTextStyles.heading3.copy(fontWeight = FontWeight.Medium),
    large = baseTextStyles.large.copy(fontWeight = FontWeight.Medium),
    basic = baseTextStyles.basic.copy(fontWeight = FontWeight.Medium),
    small = baseTextStyles.small.copy(fontWeight = FontWeight.Medium),
    button = baseTextStyles.button.copy(fontWeight = FontWeight.SemiBold),
    section = baseTextStyles.section.copy(fontWeight = FontWeight.SemiBold),
)

private val emphasisTextStyles = baseTextStyles.copy(
    heading1 = baseTextStyles.heading1.copy(fontWeight = FontWeight.SemiBold),
    heading2 = baseTextStyles.heading2.copy(fontWeight = FontWeight.SemiBold),
    heading3 = baseTextStyles.heading3.copy(fontWeight = FontWeight.SemiBold),
    large = baseTextStyles.large.copy(fontWeight = FontWeight.SemiBold),
    basic = baseTextStyles.basic.copy(fontWeight = FontWeight.SemiBold),
    small = baseTextStyles.small.copy(fontWeight = FontWeight.SemiBold),
    button = baseTextStyles.button.copy(fontWeight = FontWeight.SemiBold),
    section = baseTextStyles.section.copy(fontWeight = FontWeight.SemiBold),
)

private val satsFeelingTextStyles = baseTextStyles.copy(
    heading1 = baseTextStyles.heading1.copy(fontStyle = FontStyle.Italic, fontWeight = FontWeight.Bold),
    heading2 = baseTextStyles.heading2.copy(fontStyle = FontStyle.Italic, fontWeight = FontWeight.SemiBold),
    heading3 = baseTextStyles.heading3.copy(fontStyle = FontStyle.Italic, fontWeight = FontWeight.SemiBold),
    large = baseTextStyles.large.copy(fontStyle = FontStyle.Italic, fontWeight = FontWeight.SemiBold),
    basic = baseTextStyles.basic.copy(fontStyle = FontStyle.Italic, fontWeight = FontWeight.SemiBold),
    small = baseTextStyles.small.copy(fontStyle = FontStyle.Italic, fontWeight = FontWeight.SemiBold),
    button = baseTextStyles.button.copy(fontStyle = FontStyle.Italic, fontWeight = FontWeight.SemiBold),
    section = baseTextStyles.section.copy(fontStyle = FontStyle.Italic, fontWeight = FontWeight.SemiBold),
)

internal val SatsTypographyImpl = SatsTypography(
    default = defaultTextStyles,
    medium = mediumTextStyles,
    emphasis = emphasisTextStyles,
    satsFeeling = satsFeelingTextStyles,
)
