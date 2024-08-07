package com.sats.dna.typography

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.sats.fonts.headline.SatsHeadlineFont

object SatsTypography {
    val normal: NormalTextStyles = NormalTextStylesApp
    val medium: MediumTextStyles = MediumTextStylesApp
    val emphasis: EmphasisTextStyles = EmphasisTextStylesApp
    val satsHeadlineNormal: SatsHeadlineNormalTextStyles = SatsHeadlineNormalTextStylesApp
    val satsHeadlineEmphasis: SatsHeadlineEmphasisTextStyles = SatsHeadlineEmphasisTextStylesApp
}

interface NormalTextStyles {
    val headline1: TextStyle
    val headline2: TextStyle
    val headline3: TextStyle
    val large: TextStyle
    val basic: TextStyle
    val small: TextStyle
    val buttonLarge: TextStyle
    val buttonBasic: TextStyle
    val buttonSmall: TextStyle
    val section: TextStyle
}

interface MediumTextStyles {
    val headline1: TextStyle
    val headline2: TextStyle
    val headline3: TextStyle
    val large: TextStyle
    val basic: TextStyle
    val small: TextStyle
}

interface EmphasisTextStyles {
    val headline1: TextStyle
    val headline2: TextStyle
    val headline3: TextStyle
    val large: TextStyle
    val basic: TextStyle
    val small: TextStyle
}

interface SatsHeadlineNormalTextStyles {
    val headline1: TextStyle
    val headline2: TextStyle
    val headline3: TextStyle
    val large: TextStyle
    val basic: TextStyle
    val small: TextStyle
}

interface SatsHeadlineEmphasisTextStyles {
    val headline1: TextStyle
    val headline2: TextStyle
    val headline3: TextStyle
    val large: TextStyle
    val basic: TextStyle
    val small: TextStyle
}

private object NormalTextStylesApp : NormalTextStyles {
    private val base = TextStyle(
        fontFamily = InterFont,
        fontWeight = FontWeight.Normal,
        fontStyle = FontStyle.Normal,
    )

    override val headline1 = base.copy(fontSize = Sizes.headline1, lineHeight = 1.2.em)
    override val headline2 = base.copy(fontSize = Sizes.headline2, lineHeight = 1.2.em)
    override val headline3 = base.copy(fontSize = Sizes.headline3, lineHeight = 1.2.em)
    override val large = base.copy(fontSize = Sizes.large, lineHeight = 1.3.em)
    override val basic = base.copy(fontSize = Sizes.basic, lineHeight = 1.3.em)
    override val small = base.copy(fontSize = Sizes.small, lineHeight = 1.3.em)
    override val buttonLarge = base.copy(fontSize = Sizes.buttonLarge, fontWeight = FontWeight.SemiBold)
    override val buttonBasic = base.copy(fontSize = Sizes.buttonBasic, fontWeight = FontWeight.SemiBold)
    override val buttonSmall = base.copy(fontSize = Sizes.buttonSmall, fontWeight = FontWeight.SemiBold)
    override val section = base.copy(fontSize = Sizes.section, fontWeight = FontWeight.SemiBold)
}

private object MediumTextStylesApp : MediumTextStyles {
    private val base = TextStyle(
        fontFamily = InterFont,
        fontWeight = FontWeight.Medium,
        fontStyle = FontStyle.Normal,
    )

    override val headline1 = base.copy(fontSize = Sizes.headline1, lineHeight = 1.2.em)
    override val headline2 = base.copy(fontSize = Sizes.headline2, lineHeight = 1.2.em)
    override val headline3 = base.copy(fontSize = Sizes.headline3, lineHeight = 1.2.em)
    override val large = base.copy(fontSize = Sizes.large, lineHeight = 1.3.em)
    override val basic = base.copy(fontSize = Sizes.basic, lineHeight = 1.3.em)
    override val small = base.copy(fontSize = Sizes.small, lineHeight = 1.3.em)
}

private object EmphasisTextStylesApp : EmphasisTextStyles {
    private val base = TextStyle(
        fontFamily = InterFont,
        fontWeight = FontWeight.SemiBold,
        fontStyle = FontStyle.Normal,
    )

    override val headline1 = base.copy(fontSize = Sizes.headline1, lineHeight = 1.2.em)
    override val headline2 = base.copy(fontSize = Sizes.headline2, lineHeight = 1.2.em)
    override val headline3 = base.copy(fontSize = Sizes.headline3, lineHeight = 1.2.em)
    override val large = base.copy(fontSize = Sizes.large, lineHeight = 1.3.em)
    override val basic = base.copy(fontSize = Sizes.basic, lineHeight = 1.3.em)
    override val small = base.copy(fontSize = Sizes.small, lineHeight = 1.3.em)
}

private object SatsHeadlineNormalTextStylesApp : SatsHeadlineNormalTextStyles {
    private val base = TextStyle(
        fontFamily = SatsHeadlineFont,
        fontWeight = FontWeight.Normal,
        fontStyle = FontStyle.Italic,
    )

    override val headline1 = base.copy(fontSize = Sizes.headline1, lineHeight = 1.1.em)
    override val headline2 = base.copy(fontSize = Sizes.headline2)
    override val headline3 = base.copy(fontSize = Sizes.headline3)
    override val large = base.copy(fontSize = Sizes.large)
    override val basic = base.copy(fontSize = Sizes.basic)
    override val small = base.copy(fontSize = Sizes.small)
}

private object SatsHeadlineEmphasisTextStylesApp : SatsHeadlineEmphasisTextStyles {
    private val base = TextStyle(
        fontFamily = SatsHeadlineFont,
        fontWeight = FontWeight.Bold,
        fontStyle = FontStyle.Italic,
    )

    override val headline1 = base.copy(fontSize = Sizes.headline1, lineHeight = 1.1.em)
    override val headline2 = base.copy(fontSize = Sizes.headline2)
    override val headline3 = base.copy(fontSize = Sizes.headline3)
    override val large = base.copy(fontSize = Sizes.large)
    override val basic = base.copy(fontSize = Sizes.basic)
    override val small = base.copy(fontSize = Sizes.small)
}

private object Sizes {
    val headline1 = 28.sp
    val headline2 = 24.sp
    val headline3 = 20.sp
    val large = 16.sp
    val basic = 14.sp
    val small = 12.sp
    val buttonLarge = 14.sp
    val buttonBasic = 14.sp
    val buttonSmall = 12.sp
    val section = 16.sp
}
