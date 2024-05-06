package com.sats.dna.colors

import com.sats.dna.colors.SatsColorPrimitives.Black10
import com.sats.dna.colors.SatsColorPrimitives.Black40
import com.sats.dna.colors.SatsColorPrimitives.Black5
import com.sats.dna.colors.SatsColorPrimitives.Black50
import com.sats.dna.colors.SatsColorPrimitives.Black60
import com.sats.dna.colors.SatsColorPrimitives.Black80
import com.sats.dna.colors.SatsColorPrimitives.BlackO20
import com.sats.dna.colors.SatsColorPrimitives.BrightBlue10
import com.sats.dna.colors.SatsColorPrimitives.BrightBlue100
import com.sats.dna.colors.SatsColorPrimitives.BrightBlue110
import com.sats.dna.colors.SatsColorPrimitives.BrightBlue160
import com.sats.dna.colors.SatsColorPrimitives.BrightBlue20
import com.sats.dna.colors.SatsColorPrimitives.Cardinal10
import com.sats.dna.colors.SatsColorPrimitives.Cardinal100
import com.sats.dna.colors.SatsColorPrimitives.Cardinal120
import com.sats.dna.colors.SatsColorPrimitives.Cardinal30
import com.sats.dna.colors.SatsColorPrimitives.CaribbeanCurrent100
import com.sats.dna.colors.SatsColorPrimitives.Celadon100
import com.sats.dna.colors.SatsColorPrimitives.ChiliRed100
import com.sats.dna.colors.SatsColorPrimitives.ChiliRed170
import com.sats.dna.colors.SatsColorPrimitives.EgyptianPurple10
import com.sats.dna.colors.SatsColorPrimitives.EgyptianPurple100
import com.sats.dna.colors.SatsColorPrimitives.EgyptianPurple160
import com.sats.dna.colors.SatsColorPrimitives.EgyptianPurple80
import com.sats.dna.colors.SatsColorPrimitives.Gold10
import com.sats.dna.colors.SatsColorPrimitives.Gold100
import com.sats.dna.colors.SatsColorPrimitives.Gold130
import com.sats.dna.colors.SatsColorPrimitives.Gold140
import com.sats.dna.colors.SatsColorPrimitives.Gold170
import com.sats.dna.colors.SatsColorPrimitives.Gold30
import com.sats.dna.colors.SatsColorPrimitives.Gold80
import com.sats.dna.colors.SatsColorPrimitives.SalmonPink100
import com.sats.dna.colors.SatsColorPrimitives.SatsBlue10
import com.sats.dna.colors.SatsColorPrimitives.SatsBlue100
import com.sats.dna.colors.SatsColorPrimitives.SatsBlue20
import com.sats.dna.colors.SatsColorPrimitives.SatsBlue40
import com.sats.dna.colors.SatsColorPrimitives.SatsBlue5
import com.sats.dna.colors.SatsColorPrimitives.SatsBlue70
import com.sats.dna.colors.SatsColorPrimitives.SatsBlueGrey80
import com.sats.dna.colors.SatsColorPrimitives.SatsCoral10
import com.sats.dna.colors.SatsColorPrimitives.SatsCoral100
import com.sats.dna.colors.SatsColorPrimitives.SatsCoral120
import com.sats.dna.colors.SatsColorPrimitives.SatsCoral40
import com.sats.dna.colors.SatsColorPrimitives.SatsCoral5
import com.sats.dna.colors.SatsColorPrimitives.SatsLightGrey15
import com.sats.dna.colors.SatsColorPrimitives.SpringGreen10
import com.sats.dna.colors.SatsColorPrimitives.SpringGreen100
import com.sats.dna.colors.SatsColorPrimitives.SpringGreen120
import com.sats.dna.colors.SatsColorPrimitives.SpringGreen170
import com.sats.dna.colors.SatsColorPrimitives.SpringGreen30
import com.sats.dna.colors.SatsColorPrimitives.SpringGreen80
import com.sats.dna.colors.SatsColorPrimitives.Tangerine100
import com.sats.dna.colors.SatsColorPrimitives.TropicalIndigo100
import com.sats.dna.colors.SatsColorPrimitives.UranianBlue100
import com.sats.dna.colors.SatsColorPrimitives.White0
import com.sats.dna.colors.SatsColorPrimitives.White100

internal val SatsLightColors = SatsColors(
    buttons = SatsColors.Buttons(
        primary = SatsColors.Buttons.Primary(
            default = White100 on SatsBlue100,
            disabled = Black60 on Black10,
        ),
        secondary = SatsColors.Buttons.Secondary(
            default = OutlinedColorSet(
                bg = White0,
                outline = SatsBlue100,
                fg = SatsBlue100,
            ),
            disabled = OutlinedColorSet(
                bg = White0,
                outline = Black10,
                fg = Black60,
            ),
        ),
        action = SatsColors.Buttons.Action(
            default = SatsCoral120 on White0,
            disabled = Black50 on White0,
        ),
        cta = SatsColors.Buttons.Cta(
            default = White100 on SatsCoral120,
            disabled = Black60 on Black10,
        ),
        waitingListFilled = SatsColors.Buttons.WaitingListFilled(
            default = White100 on EgyptianPurple80,
            disabled = Black60 on Black10,
        ),
        waitingListOutlined = SatsColors.Buttons.WaitingListOutlined(
            default = OutlinedColorSet(
                bg = White0,
                outline = EgyptianPurple80,
                fg = EgyptianPurple80,
            ),
            disabled = OutlinedColorSet(
                bg = White0,
                outline = Black60,
                fg = Black60,
            ),
        ),
        destructive = SatsColors.Buttons.Destructive(
            default = SatsColors.Buttons.Destructive.Default(
                default = White100 on ChiliRed100,
                disabled = Black60 on Black10,
            ),
            outlined = SatsColors.Buttons.Destructive.Outlined(
                default = OutlinedColorSet(
                    bg = White0,
                    outline = ChiliRed100,
                    fg = ChiliRed100,
                ),
                disabled = OutlinedColorSet(
                    bg = White0,
                    outline = Black60,
                    fg = Black60,
                ),
            ),
        ),
    ),
    graphicalElements = SatsColors.GraphicalElements(
        divider = SatsColors.GraphicalElements.Divider(
            default = SatsLightGrey15,
            alternate = BlackO20,
        ),
        border = SatsColors.GraphicalElements.Border(
            default = SatsLightGrey15,
            focused = SatsBlue40,
        ),
        signalBorder = SatsColors.GraphicalElements.SignalBorder(
            success = SpringGreen120,
            warning = Gold140,
            error = Cardinal120,
            waitingList = EgyptianPurple80,
            neutral = Black60,
            information = SatsBlue70,
            featured = SatsCoral120,
        ),
        skeleton = SatsLightGrey15,
        navBar = SatsColors.GraphicalElements.NavBar(
            selected = SatsBlue100,
            notSelected = SatsBlue100,
        ),
        progressBar = SatsColors.GraphicalElements.ProgressBar(
            default = SatsCoral100 on SatsLightGrey15,
            alternate = SatsBlue100 on SatsLightGrey15,
        ),
        graphs = SatsColors.GraphicalElements.Graphs(
            bar = SatsColors.GraphicalElements.Graphs.Bar(
                primary = SatsColors.GraphicalElements.Graphs.Bar.Primary(
                    default = SatsCoral100,
                    bg = SatsLightGrey15,
                ),
                secondary = SatsColors.GraphicalElements.Graphs.Bar.Secondary(
                    default = SatsBlue40,
                    bg = SatsBlue5,
                ),
            ),
            trend = SatsColors.GraphicalElements.Graphs.Trend(
                upwards = SpringGreen80,
                neutral = SatsCoral40,
                downwards = Cardinal100,
            ),
        ),
        selector = SatsColors.GraphicalElements.Selector(
            primary = SatsColors.GraphicalElements.Selector.Primary(
                unselected = SatsColors.GraphicalElements.Selector.Primary.Unselected(
                    default = OutlinedColorSet(outline = Black80, bg = White0, fg = SatsBlue100),
                    disabled = OutlinedColorSet(outline = SatsLightGrey15, bg = White0, fg = Black40),
                ),
                selected = SatsColors.GraphicalElements.Selector.Primary.Selected(
                    default = White100 on SatsCoral100,
                    disabled = SatsCoral10 on SatsCoral40,
                ),
                unselectedSurface = SatsColors.GraphicalElements.Selector.Primary.UnselectedSurface(
                    default = White0,
                    disabled = White0,
                ),
                selectedSurface = SatsColors.GraphicalElements.Selector.Primary.SelectedSurface(
                    default = SatsCoral10,
                    disabled = SatsCoral5,
                ),
            ),
            secondary = SatsColors.GraphicalElements.Selector.Secondary(
                unselected = SatsColors.GraphicalElements.Selector.Secondary.Unselected(
                    default = OutlinedColorSet(outline = SatsBlue70, bg = White0, fg = SatsBlue100),
                    disabled = OutlinedColorSet(outline = SatsLightGrey15, bg = White0, fg = Black40),
                ),
                selected = SatsColors.GraphicalElements.Selector.Secondary.Selected(
                    default = White100 on SatsBlue100,
                    disabled = SatsBlue70 on SatsLightGrey15,
                ),
                unselectedSurface = SatsColors.GraphicalElements.Selector.Secondary.UnselectedSurface(
                    default = White0,
                    disabled = White0,
                ),
                selectedSurface = SatsColors.GraphicalElements.Selector.Secondary.SelectedSurface(
                    default = SatsBlue10,
                    disabled = SatsBlue5,
                ),
            ),
        ),
        chips = SatsColors.GraphicalElements.Chips(
            unselected = SatsColors.GraphicalElements.Chips.Unselected(
                default = OutlinedColorSet(outline = SatsBlue40, bg = White0, fg = SatsBlue100),
                disabled = OutlinedColorSet(outline = SatsLightGrey15, bg = White0, fg = Black40),
            ),
            selected = SatsColors.GraphicalElements.Chips.Selected(
                default = White100 on SatsBlue100,
                disabled = SatsBlue70 on SatsLightGrey15,
            ),
        ),
        toggle = SatsColors.GraphicalElements.Toggle(
            unselected = SatsColors.GraphicalElements.Toggle.Unselected(
                default = SatsBlue40,
                disabled = SatsLightGrey15,
            ),
            handle = White100,
            selected = SatsColors.GraphicalElements.Toggle.Selected(
                default = SatsCoral100,
                disabled = SatsCoral40,
            ),
        ),
        icons = SatsColors.GraphicalElements.Icons(
            primary = SatsBlue100,
            secondary = SatsBlueGrey80,
            positive = SpringGreen100,
            attention = Gold100,
            negative = Cardinal100,
            waitingList = EgyptianPurple100,
            delete = ChiliRed100,
        ),
        indicators = SatsColors.GraphicalElements.Indicators(
            positive = SatsColors.GraphicalElements.Indicators.Positive(
                default = SpringGreen100,
                alternate = SpringGreen30,
            ),
            attention = SatsColors.GraphicalElements.Indicators.Attention(
                default = Gold100,
                alternate = Gold30,
            ),
            negative = SatsColors.GraphicalElements.Indicators.Negative(
                default = Cardinal100,
                alternate = Cardinal30,
            ),
            neutral = SatsColors.GraphicalElements.Indicators.Neutral(
                default = SatsBlue70,
                alternate = SatsBlue20,
            ),
        ),
        signal = SatsColors.GraphicalElements.Signal(
            success = SpringGreen100,
            warning = Gold100,
            error = Cardinal100,
            neutral = SatsBlue70,
            waitingList = EgyptianPurple100,
        ),
        tags = SatsColors.GraphicalElements.Tags(
            primary = White100 on SatsBlue100,
            secondary = SatsBlue100 on SatsBlue5,
            featured = White100 on SatsCoral120,
        ),
        indicatorTag = SatsColors.GraphicalElements.IndicatorTag(
            positive = SatsColors.GraphicalElements.IndicatorTag.Positive(
                default = White100 on SpringGreen100,
                alternate = SpringGreen120 on SpringGreen10,
            ),
            attention = SatsColors.GraphicalElements.IndicatorTag.Attention(
                default = Gold170 on Gold80,
                alternate = Gold140 on Gold10,
            ),
            negative = SatsColors.GraphicalElements.IndicatorTag.Negative(
                default = White100 on Cardinal100,
                alternate = Cardinal120 on Cardinal10,
            ),
            featured = SatsColors.GraphicalElements.IndicatorTag.Featured(
                default = White100 on SatsCoral120,
                alternate = SatsCoral120 on SatsCoral10,
            ),
            neutral = SatsColors.GraphicalElements.IndicatorTag.Neutral(
                default = White100 on Black60,
                alternate = Black60 on SatsBlue5,
            ),
            information = SatsColors.GraphicalElements.IndicatorTag.Information(
                default = White100 on BrightBlue100,
                alternate = SatsBlue70 on BrightBlue10,
            ),
        ),
        badge = SatsColors.GraphicalElements.Badge(
            primary = White100 on SatsCoral120,
            secondary = White100 on SatsBlue100,
            tertiary = SatsBlue100 on SatsBlue5,
        ),
        rewards = SatsColors.GraphicalElements.Rewards(
            blue = White100 on SatsBlue100,
            silver = White100 on Black50,
            gold = White100 on Gold130,
            platinum = White100 on SatsBlueGrey80,
        ),
        workouts = SatsColors.GraphicalElements.Workouts(
            pt = BrightBlue160 on UranianBlue100,
            gx = ChiliRed170 on SalmonPink100,
            treatments = SpringGreen10 on CaribbeanCurrent100,
            gymfloor = Gold170 on Tangerine100,
            other = SpringGreen170 on Celadon100,
            bootcamp = EgyptianPurple160 on TropicalIndigo100,
        ),
    ),
    backgrounds = SatsColors.Backgrounds(
        primary = SatsColors.Backgrounds.Primary(
            default = BackgroundColorSet(
                bg = SatsBlue5,
                fg = SatsBlue100,
                fgAlternate = SatsBlue70,
                fgDisabled = Black60,
            ),
            selected = BackgroundColorSet(
                bg = SatsBlue5,
                fg = SatsBlue100,
                fgAlternate = SatsBlue70,
                fgDisabled = Black60,
            ),
        ),
        secondary = SatsColors.Backgrounds.Secondary(
            default = BackgroundColorSet(
                bg = White100,
                fg = SatsBlue100,
                fgAlternate = SatsBlue70,
                fgDisabled = Black60,
            ),
            selected = BackgroundColorSet(
                bg = White100,
                fg = SatsBlue100,
                fgAlternate = SatsBlue70,
                fgDisabled = Black60,
            ),
        ),
    ),
    surfaces = SatsColors.Surfaces(
        primary = SatsColors.Surfaces.Primary(
            default = SurfaceColorSet(
                bg = White100,
                fg = SatsBlue100,
                fgAlternate = SatsBlue70,
                fgDisabled = Black60,
                fgSuccess = SpringGreen120,
                fgWarning = Gold140,
                fgError = Cardinal120,
                fgWaitingList = EgyptianPurple100,
                fgNeutral = Black60,
                fgInformation = BrightBlue110,
                fgFeatured = SatsCoral120,
            ),
            selected = SurfaceColorSet(
                bg = BrightBlue20,
                fg = SatsBlue100,
                fgAlternate = SatsBlue70,
                fgDisabled = Black60,
                fgSuccess = SpringGreen120,
                fgWarning = Gold140,
                fgError = Cardinal120,
                fgWaitingList = EgyptianPurple100,
                fgNeutral = Black60,
                fgInformation = BrightBlue110,
                fgFeatured = SatsCoral120,
            ),
            disabled = SurfaceColorSet(
                bg = SatsBlue10,
                fg = SatsBlue100,
                fgAlternate = SatsBlue70,
                fgDisabled = Black60,
                fgSuccess = SpringGreen120,
                fgWarning = Gold140,
                fgError = Cardinal120,
                fgWaitingList = EgyptianPurple100,
                fgNeutral = Black60,
                fgInformation = BrightBlue110,
                fgFeatured = SatsCoral120,
            ),
        ),
        secondary = SatsColors.Surfaces.Secondary(
            default = SurfaceColorSet(
                bg = Black5,
                fg = SatsBlue100,
                fgAlternate = SatsBlue70,
                fgDisabled = Black60,
                fgSuccess = SpringGreen120,
                fgWarning = Gold140,
                fgError = Cardinal120,
                fgWaitingList = EgyptianPurple100,
                fgNeutral = Black60,
                fgInformation = BrightBlue110,
                fgFeatured = SatsCoral120,
            ),
            selected = SurfaceColorSet(
                bg = Black5,
                fg = SatsBlue100,
                fgAlternate = SatsBlue70,
                fgDisabled = Black60,
                fgSuccess = SpringGreen120,
                fgWarning = Gold140,
                fgError = Cardinal120,
                fgWaitingList = EgyptianPurple100,
                fgNeutral = Black60,
                fgInformation = BrightBlue110,
                fgFeatured = SatsCoral120,
            ),
        ),
    ),
    signalSurfaces = SatsColors.SignalSurfaces(
        success = SatsColors.SignalSurfaces.Success(
            default = SatsBlue100 on SpringGreen10,
            alternate = SpringGreen120 on SpringGreen10,
        ),
        warning = SatsColors.SignalSurfaces.Warning(
            default = SatsBlue100 on Gold10,
            alternate = Gold140 on Gold10,
        ),
        error = SatsColors.SignalSurfaces.Error(
            default = SatsBlue100 on Cardinal10,
            alternate = Cardinal120 on Cardinal10,
        ),
        waitingList = SatsColors.SignalSurfaces.WaitingList(
            default = SatsBlue100 on EgyptianPurple10,
            alternate = EgyptianPurple100 on EgyptianPurple10,
        ),
        neutral = SatsColors.SignalSurfaces.Neutral(
            default = SatsBlue100 on Black5,
            alternate = Black60 on Black5,
        ),
        information = SatsColors.SignalSurfaces.Information(
            default = SatsBlue100 on BrightBlue10,
            alternate = BrightBlue110 on BrightBlue10,
        ),
        featured = SatsColors.SignalSurfaces.Featured(
            default = SatsBlue100 on SatsCoral5,
            alternate = SatsCoral100 on SatsCoral5,
        ),
    ),

    isLightMode = true,
)
