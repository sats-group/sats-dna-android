package com.sats.dna.colors

import com.sats.dna.colors.SatsColorPrimitives.Black100
import com.sats.dna.colors.SatsColorPrimitives.Black20
import com.sats.dna.colors.SatsColorPrimitives.Black40
import com.sats.dna.colors.SatsColorPrimitives.Black50
import com.sats.dna.colors.SatsColorPrimitives.Black60
import com.sats.dna.colors.SatsColorPrimitives.Black70
import com.sats.dna.colors.SatsColorPrimitives.Black80
import com.sats.dna.colors.SatsColorPrimitives.Black85
import com.sats.dna.colors.SatsColorPrimitives.Black90
import com.sats.dna.colors.SatsColorPrimitives.Black95
import com.sats.dna.colors.SatsColorPrimitives.BrightBlue10
import com.sats.dna.colors.SatsColorPrimitives.BrightBlue100
import com.sats.dna.colors.SatsColorPrimitives.BrightBlue160
import com.sats.dna.colors.SatsColorPrimitives.BrightBlue170
import com.sats.dna.colors.SatsColorPrimitives.BrightBlue20
import com.sats.dna.colors.SatsColorPrimitives.BrightBlue60
import com.sats.dna.colors.SatsColorPrimitives.Cardinal100
import com.sats.dna.colors.SatsColorPrimitives.Cardinal170
import com.sats.dna.colors.SatsColorPrimitives.Cardinal30
import com.sats.dna.colors.SatsColorPrimitives.Cardinal60
import com.sats.dna.colors.SatsColorPrimitives.CaribbeanCurrent70
import com.sats.dna.colors.SatsColorPrimitives.Celadon70
import com.sats.dna.colors.SatsColorPrimitives.ChiliRed170
import com.sats.dna.colors.SatsColorPrimitives.ChiliRed80
import com.sats.dna.colors.SatsColorPrimitives.EgyptianPurple160
import com.sats.dna.colors.SatsColorPrimitives.EgyptianPurple40
import com.sats.dna.colors.SatsColorPrimitives.EgyptianPurple60
import com.sats.dna.colors.SatsColorPrimitives.EgyptianPurple80
import com.sats.dna.colors.SatsColorPrimitives.Gold100
import com.sats.dna.colors.SatsColorPrimitives.Gold110
import com.sats.dna.colors.SatsColorPrimitives.Gold170
import com.sats.dna.colors.SatsColorPrimitives.Gold30
import com.sats.dna.colors.SatsColorPrimitives.Gold60
import com.sats.dna.colors.SatsColorPrimitives.Gold80
import com.sats.dna.colors.SatsColorPrimitives.SalmonPink70
import com.sats.dna.colors.SatsColorPrimitives.SatsBlue10
import com.sats.dna.colors.SatsColorPrimitives.SatsBlue100
import com.sats.dna.colors.SatsColorPrimitives.SatsBlue105
import com.sats.dna.colors.SatsColorPrimitives.SatsBlue20
import com.sats.dna.colors.SatsColorPrimitives.SatsBlue40
import com.sats.dna.colors.SatsColorPrimitives.SatsBlue90
import com.sats.dna.colors.SatsColorPrimitives.SatsBlueGrey80
import com.sats.dna.colors.SatsColorPrimitives.SatsCoral100
import com.sats.dna.colors.SatsColorPrimitives.SatsCoral120
import com.sats.dna.colors.SatsColorPrimitives.SatsCoral130
import com.sats.dna.colors.SatsColorPrimitives.SatsCoral170
import com.sats.dna.colors.SatsColorPrimitives.SatsCoral190
import com.sats.dna.colors.SatsColorPrimitives.SatsCoral40
import com.sats.dna.colors.SatsColorPrimitives.SatsCoral60
import com.sats.dna.colors.SatsColorPrimitives.SatsCoral90
import com.sats.dna.colors.SatsColorPrimitives.SpringGreen10
import com.sats.dna.colors.SatsColorPrimitives.SpringGreen100
import com.sats.dna.colors.SatsColorPrimitives.SpringGreen170
import com.sats.dna.colors.SatsColorPrimitives.SpringGreen30
import com.sats.dna.colors.SatsColorPrimitives.SpringGreen60
import com.sats.dna.colors.SatsColorPrimitives.SpringGreen80
import com.sats.dna.colors.SatsColorPrimitives.Tangerine70
import com.sats.dna.colors.SatsColorPrimitives.TropicalIndigo70
import com.sats.dna.colors.SatsColorPrimitives.UranianBlue70
import com.sats.dna.colors.SatsColorPrimitives.White0
import com.sats.dna.colors.SatsColorPrimitives.White10
import com.sats.dna.colors.SatsColorPrimitives.White100
import com.sats.dna.colors.SatsColorPrimitives.White15
import com.sats.dna.colors.SatsColorPrimitives.White20
import com.sats.dna.colors.SatsColorPrimitives.White40
import com.sats.dna.colors.SatsColorPrimitives.White5
import com.sats.dna.colors.SatsColorPrimitives.White50
import com.sats.dna.colors.SatsColorPrimitives.White60
import com.sats.dna.colors.SatsColorPrimitives.White65
import com.sats.dna.colors.SatsColorPrimitives.White70
import com.sats.dna.colors.SatsColorPrimitives.White85

internal val SatsDarkColors = SatsColors(
    buttons = SatsColors.Buttons(
        primary = SatsColors.Buttons.Primary(
            default = SatsBlue100 on White100,
            disabled = SatsBlue100 on White10,
        ),
        secondary = SatsColors.Buttons.Secondary(
            default = OutlinedColorSet(
                bg = White0,
                outline = White100,
                fg = White100,
            ),
            disabled = OutlinedColorSet(
                bg = White0,
                outline = Black80,
                fg = Black50,
            ),
        ),
        clean = SatsColors.Buttons.Clean(
            default = SatsBlue100 on White100,
            disabled = White50 on White10,
        ),
        cleanSecondary = SatsColors.Buttons.CleanSecondary(
            default = OutlinedColorSet(
                bg = White15,
                outline = White100,
                fg = White100,
            ),
            disabled = OutlinedColorSet(
                bg = White5,
                outline = White40,
                fg = White70,
            ),
        ),
        action = SatsColors.Buttons.Action(
            default = SatsCoral100 on White0,
            disabled = Black50 on White0,
        ),
        cta = SatsColors.Buttons.Cta(
            default = White100 on SatsCoral100,
            disabled = White70 on Black80,
        ),
        waitingListFilled = SatsColors.Buttons.WaitingListFilled(
            default = White100 on EgyptianPurple80,
            disabled = Black50 on Black80,
        ),
        waitingListOutlined = SatsColors.Buttons.WaitingListOutlined(
            default = OutlinedColorSet(
                bg = White0,
                outline = EgyptianPurple80,
                fg = EgyptianPurple80,
            ),
            disabled = OutlinedColorSet(
                bg = White0,
                outline = Black50,
                fg = Black50,
            ),
        ),
        destructive = SatsColors.Buttons.Destructive(
            default = SatsColors.Buttons.Destructive.Default(
                default = White100 on ChiliRed80,
                disabled = Black50 on Black80,
            ),
            outlined = SatsColors.Buttons.Destructive.Outlined(
                default = OutlinedColorSet(
                    bg = White0,
                    outline = ChiliRed80,
                    fg = ChiliRed80,
                ),
                disabled = OutlinedColorSet(
                    bg = White0,
                    outline = Black50,
                    fg = Black50,
                ),
            ),
        ),
    ),
    graphicalElements = SatsColors.GraphicalElements(
        divider = SatsColors.GraphicalElements.Divider(
            default = Black80,
            alternate = White40,
        ),
        border = SatsColors.GraphicalElements.Border(
            default = Black70,
            focused = White40,
        ),
        signalBorder = SatsColors.GraphicalElements.SignalBorder(
            success = SpringGreen30,
            warning = Gold30,
            error = Cardinal30,
            waitingList = EgyptianPurple60,
            neutral = Black20,
            information = BrightBlue20,
            featured = SatsCoral40,
        ),
        skeleton = Black80,
        navBar = SatsColors.GraphicalElements.NavBar(
            selected = White100,
            notSelected = White100,
        ),
        progressBar = SatsColors.GraphicalElements.ProgressBar(
            default = SatsCoral90 on Black70,
            alternate = SatsBlue10 on Black70,
        ),
        fixedProgressBar = SatsColors.GraphicalElements.FixedProgressBar(
            default = SatsCoral90 on White40,
            alternate = SatsBlue10 on White40,
        ),
        graphs = SatsColors.GraphicalElements.Graphs(
            bar = SatsColors.GraphicalElements.Graphs.Bar(
                primary = SatsColors.GraphicalElements.Graphs.Bar.Primary(
                    default = SatsCoral90,
                    bg = Black80,
                ),
                secondary = SatsColors.GraphicalElements.Graphs.Bar.Secondary(
                    default = SatsBlue40,
                    bg = Black70,
                ),
            ),
            trend = SatsColors.GraphicalElements.Graphs.Trend(
                upwards = SpringGreen80,
                neutral = SatsCoral130,
                downwards = Cardinal100,
            ),
        ),
        selector = SatsColors.GraphicalElements.Selector(
            primary = SatsColors.GraphicalElements.Selector.Primary(
                unselected = SatsColors.GraphicalElements.Selector.Primary.Unselected(
                    default = OutlinedColorSet(outline = White100, bg = White0, fg = White100),
                    disabled = OutlinedColorSet(outline = White10, bg = White0, fg = White20),
                ),
                selected = SatsColors.GraphicalElements.Selector.Primary.Selected(
                    default = SatsBlue100 on SatsCoral90,
                    disabled = White60 on SatsCoral130,
                ),
                unselectedSurface = SatsColors.GraphicalElements.Selector.Primary.UnselectedSurface(
                    default = White0,
                    disabled = White0,
                ),
                selectedSurface = SatsColors.GraphicalElements.Selector.Primary.SelectedSurface(
                    default = SatsCoral170,
                    disabled = SatsCoral190,
                ),
            ),
            secondary = SatsColors.GraphicalElements.Selector.Secondary(
                unselected = SatsColors.GraphicalElements.Selector.Secondary.Unselected(
                    default = OutlinedColorSet(outline = White100, bg = White0, fg = White100),
                    disabled = OutlinedColorSet(outline = White10, bg = White0, fg = White20),
                ),
                selected = SatsColors.GraphicalElements.Selector.Secondary.Selected(
                    default = SatsBlue100 on White100,
                    disabled = White60 on White20,
                ),
                unselectedSurface = SatsColors.GraphicalElements.Selector.Secondary.UnselectedSurface(
                    default = White0,
                    disabled = White0,
                ),
                selectedSurface = SatsColors.GraphicalElements.Selector.Secondary.SelectedSurface(
                    default = BrightBlue160,
                    disabled = BrightBlue170,
                ),
            ),
        ),
        selectorFixed = SatsColors.GraphicalElements.SelectorFixed(
            unselected = SatsColors.GraphicalElements.SelectorFixed.Unselected(
                default = OutlinedColorSet(outline = White100, bg = White0, fg = White100),
                disabled = OutlinedColorSet(outline = White50, bg = White0, fg = White50),
            ),
            selected = SatsColors.GraphicalElements.SelectorFixed.Selected(
                default = SatsBlue100 on SatsCoral90,
                disabled = SatsCoral170 on SatsCoral130,
            ),
            selectedBackground = SatsColors.GraphicalElements.SelectorFixed.SelectedBackground(
                default = SatsCoral170,
                disabled = SatsCoral190,
            ),
        ),
        chips = SatsColors.GraphicalElements.Chips(
            unselected = SatsColors.GraphicalElements.Chips.Unselected(
                default = OutlinedColorSet(outline = White85, bg = White0, fg = White100),
                disabled = OutlinedColorSet(outline = White10, bg = White0, fg = White20),
            ),
            selected = SatsColors.GraphicalElements.Chips.Selected(
                default = SatsBlue100 on White100,
                disabled = White60 on Black80,
            ),
        ),
        toggle = SatsColors.GraphicalElements.Toggle(
            unselected = SatsColors.GraphicalElements.Toggle.Unselected(
                default = Black70,
                disabled = Black80,
            ),
            selected = SatsColors.GraphicalElements.Toggle.Selected(
                default = SatsCoral90,
                disabled = SatsCoral130,
            ),
            handle = White100,
        ),
        icons = SatsColors.GraphicalElements.Icons(
            primary = White100,
            secondary = Black20,
            fixed = White100,
            positive = SpringGreen80,
            attention = Gold100,
            negative = Cardinal100,
            waitingList = EgyptianPurple80,
            delete = ChiliRed80,
        ),
        indicators = SatsColors.GraphicalElements.Indicators(
            positive = SatsColors.GraphicalElements.Indicators.Positive(
                default = SpringGreen80,
                alternate = SpringGreen170,
            ),
            attention = SatsColors.GraphicalElements.Indicators.Attention(
                default = Gold100,
                alternate = Gold170,
            ),
            negative = SatsColors.GraphicalElements.Indicators.Negative(
                default = Cardinal100,
                alternate = Cardinal170,
            ),
            neutral = SatsColors.GraphicalElements.Indicators.Neutral(
                default = SatsBlue40,
                alternate = Black80,
            ),
        ),
        signal = SatsColors.GraphicalElements.Signal(
            success = SpringGreen80,
            warning = Gold100,
            error = Cardinal100,
            neutral = SatsBlue40,
            waitingList = EgyptianPurple80,
        ),
        tags = SatsColors.GraphicalElements.Tags(
            primary = SatsBlue100 on SatsBlue10,
            secondary = White100 on Black80,
            featured = SatsCoral170 on SatsCoral90,
        ),
        indicatorTag = SatsColors.GraphicalElements.IndicatorTag(
            positive = SatsColors.GraphicalElements.IndicatorTag.Positive(
                default = White100 on SpringGreen100,
                alternate = SpringGreen30 on SpringGreen170,
            ),
            attention = SatsColors.GraphicalElements.IndicatorTag.Attention(
                default = Gold170 on Gold80,
                alternate = Gold30 on Gold170,
            ),
            negative = SatsColors.GraphicalElements.IndicatorTag.Negative(
                default = White100 on Cardinal100,
                alternate = Cardinal30 on Cardinal170,
            ),
            featured = SatsColors.GraphicalElements.IndicatorTag.Featured(
                default = SatsCoral170 on SatsCoral90,
                alternate = SatsCoral40 on SatsCoral170,
            ),
            neutral = SatsColors.GraphicalElements.IndicatorTag.Neutral(
                default = White100 on Black60,
                alternate = Black20 on Black90,
            ),
            information = SatsColors.GraphicalElements.IndicatorTag.Information(
                default = White100 on BrightBlue100,
                alternate = BrightBlue20 on BrightBlue160,
            ),
        ),
        badge = SatsColors.GraphicalElements.Badge(
            primary = SatsBlue100 on SatsCoral90,
            secondary = SatsBlue100 on SatsBlue10,
            tertiary = White100 on Black80,
        ),
        fixedBadge = SatsColors.GraphicalElements.FixedBadge(
            primary = White100 on SatsCoral120,
            secondary = SatsBlue100 on BrightBlue10,
            tertiary = White100 on SatsBlueGrey80,
        ),
        rewards = SatsColors.GraphicalElements.Rewards(
            blue = SatsBlue100 on BrightBlue100,
            silver = SatsBlue100 on SatsBlue20,
            gold = SatsBlue100 on Gold110,
            platinum = SatsBlue100 on SatsBlue40,
        ),
        workouts = SatsColors.GraphicalElements.Workouts(
            pt = BrightBlue160 on UranianBlue70,
            gx = ChiliRed170 on SalmonPink70,
            treatments = SpringGreen10 on CaribbeanCurrent70,
            gymfloor = Gold170 on Tangerine70,
            other = SpringGreen170 on Celadon70,
            bootcamp = EgyptianPurple160 on TropicalIndigo70,
        ),
    ),
    backgrounds = SatsColors.Backgrounds(
        primary = SatsColors.Backgrounds.Primary(
            default = BackgroundColorSet(
                bg = Black100,
                fg = White100,
                fgAlternate = Black20,
                fgDisabled = Black50,
            ),
            selected = BackgroundColorSet(
                bg = Black100,
                fg = White100,
                fgAlternate = Black20,
                fgDisabled = Black50,
            ),
        ),
        secondary = SatsColors.Backgrounds.Secondary(
            default = BackgroundColorSet(
                bg = Black90,
                fg = White100,
                fgAlternate = Black20,
                fgDisabled = Black50,
            ),
            selected = BackgroundColorSet(
                bg = Black90,
                fg = White100,
                fgAlternate = Black20,
                fgDisabled = Black50,
            ),
        ),
        fixed = SatsColors.Backgrounds.Fixed(
            primary = SatsColors.Backgrounds.Fixed.Primary(
                default = BackgroundColorSet(
                    bg = SatsBlue105,
                    fg = White100,
                    fgAlternate = White60,
                    fgDisabled = White40,
                ),
                selected = BackgroundColorSet(
                    bg = SatsBlue90,
                    fg = White100,
                    fgAlternate = White60,
                    fgDisabled = White40,
                ),
            ),
            secondary = SatsColors.Backgrounds.Fixed.Secondary(
                default = BackgroundColorSet(
                    bg = SatsBlue100,
                    fg = White100,
                    fgAlternate = White60,
                    fgDisabled = White40,
                ),
                selected = BackgroundColorSet(
                    bg = SatsBlueGrey80,
                    fg = White100,
                    fgAlternate = White60,
                    fgDisabled = White40,
                ),
            ),
        ),
    ),
    surfaces = SatsColors.Surfaces(
        primary = SatsColors.Surfaces.Primary(
            default = SurfaceColorSet(
                bg = Black85,
                fg = White100,
                fgAlternate = Black20,
                fgDisabled = Black50,
                fgSuccess = SpringGreen80,
                fgWarning = Gold80,
                fgError = Cardinal60,
                fgWaitingList = EgyptianPurple60,
                fgNeutral = Black40,
                fgInformation = BrightBlue60,
                fgFeatured = SatsCoral90,
            ),
            selected = SurfaceColorSet(
                bg = BrightBlue160,
                fg = White100,
                fgAlternate = Black20,
                fgDisabled = Black50,
                fgSuccess = SpringGreen80,
                fgWarning = Gold80,
                fgError = Cardinal60,
                fgWaitingList = EgyptianPurple60,
                fgNeutral = Black40,
                fgInformation = BrightBlue60,
                fgFeatured = SatsCoral90,
            ),
            disabled = SurfaceColorSet(
                bg = Black95,
                fg = White100,
                fgAlternate = Black20,
                fgDisabled = Black50,
                fgSuccess = SpringGreen80,
                fgWarning = Gold80,
                fgError = Cardinal60,
                fgWaitingList = EgyptianPurple60,
                fgNeutral = Black40,
                fgInformation = BrightBlue60,
                fgFeatured = SatsCoral90,
            ),
        ),
        secondary = SatsColors.Surfaces.Secondary(
            default = SurfaceColorSet(
                bg = Black90,
                fg = White100,
                fgAlternate = Black20,
                fgDisabled = Black50,
                fgSuccess = SpringGreen80,
                fgWarning = Gold80,
                fgError = Cardinal60,
                fgWaitingList = EgyptianPurple60,
                fgNeutral = Black40,
                fgInformation = BrightBlue60,
                fgFeatured = SatsCoral90,
            ),
            selected = SurfaceColorSet(
                bg = Black90,
                fg = White100,
                fgAlternate = Black20,
                fgDisabled = Black50,
                fgSuccess = SpringGreen80,
                fgWarning = Gold80,
                fgError = Cardinal60,
                fgWaitingList = EgyptianPurple60,
                fgNeutral = Black40,
                fgInformation = BrightBlue60,
                fgFeatured = SatsCoral90,
            ),
        ),
        fixed = SatsColors.Surfaces.Fixed(
            primary = SatsColors.Surfaces.Fixed.Primary(
                default = SurfaceColorSet(
                    bg = SatsBlue100,
                    fg = White100,
                    fgAlternate = White65,
                    fgDisabled = White40,
                    fgSuccess = SpringGreen60,
                    fgWarning = Gold60,
                    fgError = Cardinal60,
                    fgWaitingList = EgyptianPurple40,
                    fgNeutral = White60,
                    fgInformation = BrightBlue60,
                    fgFeatured = SatsCoral60,
                ),
                selected = SurfaceColorSet(
                    bg = SatsBlueGrey80,
                    fg = White100,
                    fgAlternate = White65,
                    fgDisabled = White40,
                    fgSuccess = SpringGreen60,
                    fgWarning = Gold60,
                    fgError = Cardinal60,
                    fgWaitingList = EgyptianPurple40,
                    fgNeutral = White60,
                    fgInformation = BrightBlue60,
                    fgFeatured = SatsCoral60,
                ),
            ),
            secondary = SatsColors.Surfaces.Fixed.Secondary(
                default = SurfaceColorSet(
                    bg = SatsBlueGrey80,
                    fg = White100,
                    fgAlternate = White65,
                    fgDisabled = White40,
                    fgSuccess = SpringGreen60,
                    fgWarning = Gold60,
                    fgError = Cardinal60,
                    fgWaitingList = EgyptianPurple40,
                    fgNeutral = White60,
                    fgInformation = BrightBlue60,
                    fgFeatured = SatsCoral60,
                ),
                selected = SurfaceColorSet(
                    bg = SatsBlueGrey80,
                    fg = White100,
                    fgAlternate = White65,
                    fgDisabled = White40,
                    fgSuccess = SpringGreen60,
                    fgWarning = Gold60,
                    fgError = Cardinal60,
                    fgWaitingList = EgyptianPurple40,
                    fgNeutral = White60,
                    fgInformation = BrightBlue60,
                    fgFeatured = SatsCoral60,
                ),
            ),
        ),
    ),
    signalSurfaces = SatsColors.SignalSurfaces(
        success = SatsColors.SignalSurfaces.Success(
            default = White100 on SpringGreen170,
            alternate = SpringGreen80 on SpringGreen170,
        ),
        warning = SatsColors.SignalSurfaces.Warning(
            default = White100 on Gold170,
            alternate = Gold80 on Gold170,
        ),
        error = SatsColors.SignalSurfaces.Error(
            default = White100 on Cardinal170,
            alternate = Cardinal60 on Cardinal170,
        ),
        waitingList = SatsColors.SignalSurfaces.WaitingList(
            default = White100 on EgyptianPurple160,
            alternate = EgyptianPurple60 on EgyptianPurple160,
        ),
        neutral = SatsColors.SignalSurfaces.Neutral(
            default = White100 on Black90,
            alternate = Black40 on Black90,
        ),
        information = SatsColors.SignalSurfaces.Information(
            default = White100 on BrightBlue160,
            alternate = BrightBlue60 on BrightBlue160,
        ),
        featured = SatsColors.SignalSurfaces.Featured(
            default = White100 on SatsCoral190,
            alternate = SatsCoral90 on SatsCoral190,
        ),
    ),

    isLightMode = false,
)
