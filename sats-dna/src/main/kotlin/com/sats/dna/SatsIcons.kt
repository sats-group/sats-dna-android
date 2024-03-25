package com.sats.dna

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import com.sats.dna.icons.Activity
import com.sats.dna.icons.ActivityFilled
import com.sats.dna.icons.ActivityOutline
import com.sats.dna.icons.Add
import com.sats.dna.icons.AddNewSearch
import com.sats.dna.icons.AddPerson
import com.sats.dna.icons.AddToCalendar
import com.sats.dna.icons.Aerobics
import com.sats.dna.icons.AppIconE
import com.sats.dna.icons.AppIconS
import com.sats.dna.icons.Aqua
import com.sats.dna.icons.Archived
import com.sats.dna.icons.ArchivedFilled
import com.sats.dna.icons.ArrowDown
import com.sats.dna.icons.ArrowLeft
import com.sats.dna.icons.ArrowRight
import com.sats.dna.icons.ArrowUp
import com.sats.dna.icons.AudioClass
import com.sats.dna.icons.Award
import com.sats.dna.icons.Back
import com.sats.dna.icons.BarChart
import com.sats.dna.icons.Barbell
import com.sats.dna.icons.BellCherry
import com.sats.dna.icons.Body
import com.sats.dna.icons.Book
import com.sats.dna.icons.Booked
import com.sats.dna.icons.Calendar
import com.sats.dna.icons.Cardio
import com.sats.dna.icons.Cast
import com.sats.dna.icons.Chat
import com.sats.dna.icons.Check
import com.sats.dna.icons.Cherry
import com.sats.dna.icons.Class
import com.sats.dna.icons.ClassStroke
import com.sats.dna.icons.ClockFilled
import com.sats.dna.icons.Close
import com.sats.dna.icons.CloseCircle
import com.sats.dna.icons.Closed
import com.sats.dna.icons.Clubs
import com.sats.dna.icons.ClubsFilled
import com.sats.dna.icons.ClubsOutline
import com.sats.dna.icons.Comment
import com.sats.dna.icons.CommentFilled
import com.sats.dna.icons.Confirm
import com.sats.dna.icons.Copy
import com.sats.dna.icons.Creditcard
import com.sats.dna.icons.CrossComment
import com.sats.dna.icons.CrossPerson
import com.sats.dna.icons.Cycling
import com.sats.dna.icons.Dance
import com.sats.dna.icons.Delete
import com.sats.dna.icons.Distance
import com.sats.dna.icons.Download
import com.sats.dna.icons.Edit
import com.sats.dna.icons.Elixia
import com.sats.dna.icons.EnergyDrink
import com.sats.dna.icons.Error
import com.sats.dna.icons.Facebook
import com.sats.dna.icons.FacebookPadding
import com.sats.dna.icons.Filter
import com.sats.dna.icons.Fire
import com.sats.dna.icons.Fistbump
import com.sats.dna.icons.FistbumpFilled
import com.sats.dna.icons.Flag
import com.sats.dna.icons.Flexibility
import com.sats.dna.icons.FolderEmpty
import com.sats.dna.icons.Forward
import com.sats.dna.icons.Friends
import com.sats.dna.icons.Fullscreen
import com.sats.dna.icons.Geoposition
import com.sats.dna.icons.GetStarted
import com.sats.dna.icons.Gift
import com.sats.dna.icons.Gx
import com.sats.dna.icons.Gym
import com.sats.dna.icons.HamburgerMenu
import com.sats.dna.icons.Headset
import com.sats.dna.icons.Hidden
import com.sats.dna.icons.Highfive
import com.sats.dna.icons.Home
import com.sats.dna.icons.Images
import com.sats.dna.icons.Inbox
import com.sats.dna.icons.Indifference
import com.sats.dna.icons.Info
import com.sats.dna.icons.Instagram
import com.sats.dna.icons.Instructor
import com.sats.dna.icons.Invoice
import com.sats.dna.icons.Join
import com.sats.dna.icons.KidsTeens
import com.sats.dna.icons.Kroner
import com.sats.dna.icons.Level
import com.sats.dna.icons.LinkExternal
import com.sats.dna.icons.Linkedin
import com.sats.dna.icons.Loading
import com.sats.dna.icons.Location
import com.sats.dna.icons.Lock
import com.sats.dna.icons.LockPerson
import com.sats.dna.icons.Logout
import com.sats.dna.icons.Mail
import com.sats.dna.icons.MartialArts
import com.sats.dna.icons.Measurement
import com.sats.dna.icons.Mediataion
import com.sats.dna.icons.Megaphone
import com.sats.dna.icons.Menu
import com.sats.dna.icons.Minus
import com.sats.dna.icons.More
import com.sats.dna.icons.MoreHorizontal
import com.sats.dna.icons.MoreVertical
import com.sats.dna.icons.MyPtPackages
import com.sats.dna.icons.NegRemove
import com.sats.dna.icons.Notifications
import com.sats.dna.icons.Nutrition
import com.sats.dna.icons.OpenFolder
import com.sats.dna.icons.Order
import com.sats.dna.icons.Outdoors
import com.sats.dna.icons.Pause
import com.sats.dna.icons.Percentage
import com.sats.dna.icons.Person
import com.sats.dna.icons.Phone
import com.sats.dna.icons.Play
import com.sats.dna.icons.Prformance
import com.sats.dna.icons.Privacy
import com.sats.dna.icons.PrivacyPolicy
import com.sats.dna.icons.Profile
import com.sats.dna.icons.ProfileCard
import com.sats.dna.icons.Profilefilled
import com.sats.dna.icons.ProgramClass
import com.sats.dna.icons.Pt
import com.sats.dna.icons.PtLabel
import com.sats.dna.icons.Qr
import com.sats.dna.icons.QrFilled
import com.sats.dna.icons.Question
import com.sats.dna.icons.Quinyx
import com.sats.dna.icons.Recipe
import com.sats.dna.icons.RecruitFriends
import com.sats.dna.icons.Refresh
import com.sats.dna.icons.Remove
import com.sats.dna.icons.RemoveFromCalendar
import com.sats.dna.icons.Rewards
import com.sats.dna.icons.RewardsElixia
import com.sats.dna.icons.RewardsElixiaFilled
import com.sats.dna.icons.RewardsFilled
import com.sats.dna.icons.Running
import com.sats.dna.icons.Sad
import com.sats.dna.icons.Sats
import com.sats.dna.icons.Satsonline
import com.sats.dna.icons.Save
import com.sats.dna.icons.Scale
import com.sats.dna.icons.Search
import com.sats.dna.icons.SearchOutlined
import com.sats.dna.icons.SearchPerson
import com.sats.dna.icons.Send
import com.sats.dna.icons.Settings
import com.sats.dna.icons.Share
import com.sats.dna.icons.Showing
import com.sats.dna.icons.Skip
import com.sats.dna.icons.Smallgroup
import com.sats.dna.icons.Smartphone
import com.sats.dna.icons.Smiley
import com.sats.dna.icons.SortTool
import com.sats.dna.icons.Sound
import com.sats.dna.icons.Spotify
import com.sats.dna.icons.Square
import com.sats.dna.icons.Star
import com.sats.dna.icons.StarBorder
import com.sats.dna.icons.StarSticker
import com.sats.dna.icons.StarStickerCheck
import com.sats.dna.icons.Statistics
import com.sats.dna.icons.Strength
import com.sats.dna.icons.Strikes
import com.sats.dna.icons.StudiosMarkerBg
import com.sats.dna.icons.StudiosMarkerElixia
import com.sats.dna.icons.StudiosMarkerSats
import com.sats.dna.icons.Sync
import com.sats.dna.icons.Themes
import com.sats.dna.icons.ThumbsUp
import com.sats.dna.icons.Ticket
import com.sats.dna.icons.Time
import com.sats.dna.icons.TimeFilled
import com.sats.dna.icons.Treatments
import com.sats.dna.icons.Trophy
import com.sats.dna.icons.Up
import com.sats.dna.icons.Video
import com.sats.dna.icons.VideoFilled
import com.sats.dna.icons.Vouchers
import com.sats.dna.icons.WarningSign
import com.sats.dna.icons.WorkoutGymFloor
import com.sats.dna.icons.WorkoutOther
import com.sats.dna.icons.WorkoutPlan
import com.sats.dna.icons.Workplace
import com.sats.dna.icons.Yoga
import com.sats.dna.icons.Youtube
import com.sats.dna.icons.Zendesk

@Suppress("LargeClass") // Accessing functions of this object is deprecated in favor of extensions
object SatsIcons {
    @Deprecated(
        "Reference SatsIcons.Activity directly",
        ReplaceWith("SatsIcons.Activity", "com.sats.dna.SatsIcons"),
    )
    val activity: ImageVector
        @Composable get() = Activity

    @Deprecated(
        "Reference SatsIcons.ActivityFilled directly",
        ReplaceWith("SatsIcons.ActivityFilled", "com.sats.dna.SatsIcons"),
    )
    val activityFilled: ImageVector
        @Composable get() = ActivityFilled

    @Deprecated(
        "Reference SatsIcons.ActivityOutline directly",
        ReplaceWith("SatsIcons.ActivityOutline", "com.sats.dna.SatsIcons"),
    )
    val activityOutline: ImageVector
        @Composable get() = ActivityOutline

    @Deprecated(
        "Reference SatsIcons.Add directly",
        ReplaceWith("SatsIcons.Add", "com.sats.dna.SatsIcons"),
    )
    val add: ImageVector
        @Composable get() = Add

    @Deprecated(
        "Reference SatsIcons.AddNewSearch directly",
        ReplaceWith("SatsIcons.AddNewSearch", "com.sats.dna.SatsIcons"),
    )
    val addNewSearch: ImageVector
        @Composable get() = AddNewSearch

    @Deprecated(
        "Reference SatsIcons.AddPerson directly",
        ReplaceWith("SatsIcons.AddPerson", "com.sats.dna.SatsIcons"),
    )
    val addPerson: ImageVector
        @Composable get() = AddPerson

    @Deprecated(
        "Reference SatsIcons.AddToCalendar directly",
        ReplaceWith("SatsIcons.AddToCalendar", "com.sats.dna.SatsIcons"),
    )
    val addToCalendar: ImageVector
        @Composable get() = AddToCalendar

    @Deprecated(
        "Reference SatsIcons.Aerobics directly",
        ReplaceWith("SatsIcons.Aerobics", "com.sats.dna.SatsIcons"),
    )
    val aerobics: ImageVector
        @Composable get() = Aerobics

    @Deprecated(
        "Reference SatsIcons.AppIconE directly",
        ReplaceWith("SatsIcons.AppIconE", "com.sats.dna.SatsIcons"),
    )
    val appIconE: ImageVector
        @Composable get() = AppIconE

    @Deprecated(
        "Reference SatsIcons.AppIconS directly",
        ReplaceWith("SatsIcons.AppIconS", "com.sats.dna.SatsIcons"),
    )
    val appIconS: ImageVector
        @Composable get() = AppIconS

    @Deprecated(
        "Reference SatsIcons.Aqua directly",
        ReplaceWith("SatsIcons.Aqua", "com.sats.dna.SatsIcons"),
    )
    val aqua: ImageVector
        @Composable get() = Aqua

    @Deprecated(
        "Reference SatsIcons.Archived directly",
        ReplaceWith("SatsIcons.Archived", "com.sats.dna.SatsIcons"),
    )
    val archived: ImageVector
        @Composable get() = Archived

    @Deprecated(
        "Reference SatsIcons.ArchivedFilled directly",
        ReplaceWith("SatsIcons.ArchivedFilled", "com.sats.dna.SatsIcons"),
    )
    val archivedFilled: ImageVector
        @Composable get() = ArchivedFilled

    @Deprecated(
        "Reference SatsIcons.ArrowDown directly",
        ReplaceWith("SatsIcons.ArrowDown", "com.sats.dna.SatsIcons"),
    )
    val arrowDown: ImageVector
        @Composable get() = ArrowDown

    @Deprecated(
        "Reference SatsIcons.ArrowLeft directly",
        ReplaceWith("SatsIcons.ArrowLeft", "com.sats.dna.SatsIcons"),
    )
    val arrowLeft: ImageVector
        @Composable get() = ArrowLeft

    @Deprecated(
        "Reference SatsIcons.ArrowRight directly",
        ReplaceWith("SatsIcons.ArrowRight", "com.sats.dna.SatsIcons"),
    )
    val arrowRight: ImageVector
        @Composable get() = ArrowRight

    @Deprecated(
        "Reference SatsIcons.ArrowUp directly",
        ReplaceWith("SatsIcons.ArrowUp", "com.sats.dna.SatsIcons"),
    )
    val arrowUp: ImageVector
        @Composable get() = ArrowUp

    @Deprecated(
        "Reference SatsIcons.AudioClass directly",
        ReplaceWith("SatsIcons.AudioClass", "com.sats.dna.SatsIcons"),
    )
    val audioClass: ImageVector
        @Composable get() = AudioClass

    @Deprecated(
        "Reference SatsIcons.Award directly",
        ReplaceWith("SatsIcons.Award", "com.sats.dna.SatsIcons"),
    )
    val award: ImageVector
        @Composable get() = Award

    @Deprecated(
        "Reference SatsIcons.Back directly",
        ReplaceWith("SatsIcons.Back", "com.sats.dna.SatsIcons"),
    )
    val back: ImageVector
        @Composable get() = Back

    @Deprecated(
        "Reference SatsIcons.BarChart directly",
        ReplaceWith("SatsIcons.BarChart", "com.sats.dna.SatsIcons"),
    )
    val barChart: ImageVector
        @Composable get() = BarChart

    @Deprecated(
        "Reference SatsIcons.Barbell directly",
        ReplaceWith("SatsIcons.Barbell", "com.sats.dna.SatsIcons"),
    )
    val barbell: ImageVector
        @Composable get() = Barbell

    @Deprecated(
        "Reference SatsIcons.BellCherry directly",
        ReplaceWith("SatsIcons.BellCherry", "com.sats.dna.SatsIcons"),
    )
    val bellCherry: ImageVector
        @Composable get() = BellCherry

    @Deprecated(
        "Reference SatsIcons.Body directly",
        ReplaceWith("SatsIcons.Body", "com.sats.dna.SatsIcons"),
    )
    val body: ImageVector
        @Composable get() = Body

    @Deprecated(
        "Reference SatsIcons.Book directly",
        ReplaceWith("SatsIcons.Book", "com.sats.dna.SatsIcons"),
    )
    val book: ImageVector
        @Composable get() = Book

    @Deprecated(
        "Reference SatsIcons.Booked directly",
        ReplaceWith("SatsIcons.Booked", "com.sats.dna.SatsIcons"),
    )
    val booked: ImageVector
        @Composable get() = Booked

    @Deprecated(
        "Reference SatsIcons.Calendar directly",
        ReplaceWith("SatsIcons.Calendar", "com.sats.dna.SatsIcons"),
    )
    val calendar: ImageVector
        @Composable get() = Calendar

    @Deprecated(
        "Reference SatsIcons.Cardio directly",
        ReplaceWith("SatsIcons.Cardio", "com.sats.dna.SatsIcons"),
    )
    val cardio: ImageVector
        @Composable get() = Cardio

    @Deprecated(
        "Reference SatsIcons.Cast directly",
        ReplaceWith("SatsIcons.Cast", "com.sats.dna.SatsIcons"),
    )
    val cast: ImageVector
        @Composable get() = Cast

    @Deprecated(
        "Reference SatsIcons.Chat directly",
        ReplaceWith("SatsIcons.Chat", "com.sats.dna.SatsIcons"),
    )
    val chat: ImageVector
        @Composable get() = Chat

    @Deprecated(
        "Reference SatsIcons.Check directly",
        ReplaceWith("SatsIcons.Check", "com.sats.dna.SatsIcons"),
    )
    val check: ImageVector
        @Composable get() = Check

    @Deprecated(
        "Reference SatsIcons.Cherry directly",
        ReplaceWith("SatsIcons.Cherry", "com.sats.dna.SatsIcons"),
    )
    val cherry: ImageVector
        @Composable get() = Cherry

    @Deprecated(
        "Reference SatsIcons.Class directly",
        ReplaceWith("SatsIcons.Class", "com.sats.dna.SatsIcons"),
    )
    val classFilled: ImageVector
        @Composable get() = Class

    @Deprecated(
        "Reference SatsIcons.ClassStroke directly",
        ReplaceWith("SatsIcons.ClassStroke", "com.sats.dna.SatsIcons"),
    )
    val classStroke: ImageVector
        @Composable get() = ClassStroke

    @Deprecated(
        "Reference SatsIcons.ClockFilled directly",
        ReplaceWith("SatsIcons.ClockFilled", "com.sats.dna.SatsIcons"),
    )
    val clockFilled: ImageVector
        @Composable get() = ClockFilled

    @Deprecated(
        "Reference SatsIcons.Close directly",
        ReplaceWith("SatsIcons.Close", "com.sats.dna.SatsIcons"),
    )
    val close: ImageVector
        @Composable get() = Close

    @Deprecated(
        "Reference SatsIcons.CloseCircle directly",
        ReplaceWith("SatsIcons.CloseCircle", "com.sats.dna.SatsIcons"),
    )
    val closeCircle: ImageVector
        @Composable get() = CloseCircle

    @Deprecated(
        "Reference SatsIcons.Closed directly",
        ReplaceWith("SatsIcons.Closed", "com.sats.dna.SatsIcons"),
    )
    val closed: ImageVector
        @Composable get() = Closed

    @Deprecated(
        "Reference SatsIcons.Clubs directly",
        ReplaceWith("SatsIcons.Clubs", "com.sats.dna.SatsIcons"),
    )
    val clubs: ImageVector
        @Composable get() = Clubs

    @Deprecated(
        "Reference SatsIcons.ClubsFilled directly",
        ReplaceWith("SatsIcons.ClubsFilled", "com.sats.dna.SatsIcons"),
    )
    val clubsFilled: ImageVector
        @Composable get() = ClubsFilled

    @Deprecated(
        "Reference SatsIcons.ClubsOutline directly",
        ReplaceWith("SatsIcons.ClubsOutline", "com.sats.dna.SatsIcons"),
    )
    val clubsOutline: ImageVector
        @Composable get() = ClubsOutline

    @Deprecated(
        "Reference SatsIcons.Comment directly",
        ReplaceWith("SatsIcons.Comment", "com.sats.dna.SatsIcons"),
    )
    val comment: ImageVector
        @Composable get() = Comment

    @Deprecated(
        "Reference SatsIcons.CommentFilled directly",
        ReplaceWith("SatsIcons.CommentFilled", "com.sats.dna.SatsIcons"),
    )
    val commentFilled: ImageVector
        @Composable get() = CommentFilled

    @Deprecated(
        "Reference SatsIcons.Confirm directly",
        ReplaceWith("SatsIcons.Confirm", "com.sats.dna.SatsIcons"),
    )
    val confirm: ImageVector
        @Composable get() = Confirm

    @Deprecated(
        "Reference SatsIcons.Copy directly",
        ReplaceWith("SatsIcons.Copy", "com.sats.dna.SatsIcons"),
    )
    val copy: ImageVector
        @Composable get() = Copy

    @Deprecated(
        "Reference SatsIcons.Creditcard directly",
        ReplaceWith("SatsIcons.Creditcard", "com.sats.dna.SatsIcons"),
    )
    val creditcard: ImageVector
        @Composable get() = Creditcard

    @Deprecated(
        "Reference SatsIcons.CrossComment directly",
        ReplaceWith("SatsIcons.CrossComment", "com.sats.dna.SatsIcons"),
    )
    val crossComment: ImageVector
        @Composable get() = CrossComment

    @Deprecated(
        "Reference SatsIcons.CrossPerson directly",
        ReplaceWith("SatsIcons.CrossPerson", "com.sats.dna.SatsIcons"),
    )
    val crossPerson: ImageVector
        @Composable get() = CrossPerson

    @Deprecated(
        "Reference SatsIcons.Cycling directly",
        ReplaceWith("SatsIcons.Cycling", "com.sats.dna.SatsIcons"),
    )
    val cycling: ImageVector
        @Composable get() = Cycling

    @Deprecated(
        "Reference SatsIcons.Dance directly",
        ReplaceWith("SatsIcons.Dance", "com.sats.dna.SatsIcons"),
    )
    val dance: ImageVector
        @Composable get() = Dance

    @Deprecated(
        "Reference SatsIcons.Delete directly",
        ReplaceWith("SatsIcons.Delete", "com.sats.dna.SatsIcons"),
    )
    val delete: ImageVector
        @Composable get() = Delete

    @Deprecated(
        "Reference SatsIcons.Distance directly",
        ReplaceWith("SatsIcons.Distance", "com.sats.dna.SatsIcons"),
    )
    val distance: ImageVector
        @Composable get() = Distance

    @Deprecated(
        "Reference SatsIcons.Download directly",
        ReplaceWith("SatsIcons.Download", "com.sats.dna.SatsIcons"),
    )
    val download: ImageVector
        @Composable get() = Download

    @Deprecated(
        "Reference SatsIcons.Edit directly",
        ReplaceWith("SatsIcons.Edit", "com.sats.dna.SatsIcons"),
    )
    val edit: ImageVector
        @Composable get() = Edit

    @Deprecated(
        "Reference SatsIcons.Elixia directly",
        ReplaceWith("SatsIcons.Elixia", "com.sats.dna.SatsIcons"),
    )
    val elixia: ImageVector
        @Composable get() = Elixia

    @Deprecated(
        "Reference SatsIcons.EnergyDrink directly",
        ReplaceWith("SatsIcons.EnergyDrink", "com.sats.dna.SatsIcons"),
    )
    val energyDrink: ImageVector
        @Composable get() = EnergyDrink

    @Deprecated(
        "Reference SatsIcons.Error directly",
        ReplaceWith("SatsIcons.Error", "com.sats.dna.SatsIcons"),
    )
    val error: ImageVector
        @Composable get() = Error

    @Deprecated(
        "Reference SatsIcons.Facebook directly",
        ReplaceWith("SatsIcons.Facebook", "com.sats.dna.SatsIcons"),
    )
    val facebook: ImageVector
        @Composable get() = Facebook

    @Deprecated(
        "Reference SatsIcons.FacebookPadding directly",
        ReplaceWith("SatsIcons.FacebookPadding", "com.sats.dna.SatsIcons"),
    )
    val facebookPadding: ImageVector
        @Composable get() = FacebookPadding

    @Deprecated(
        "Reference SatsIcons.Filter directly",
        ReplaceWith("SatsIcons.Filter", "com.sats.dna.SatsIcons"),
    )
    val filter: ImageVector
        @Composable get() = Filter

    @Deprecated(
        "Reference SatsIcons.Fire directly",
        ReplaceWith("SatsIcons.Fire", "com.sats.dna.SatsIcons"),
    )
    val fire: ImageVector
        @Composable get() = Fire

    @Deprecated(
        "Reference SatsIcons.Fistbump directly",
        ReplaceWith("SatsIcons.Fistbump", "com.sats.dna.SatsIcons"),
    )
    val fistbump: ImageVector
        @Composable get() = Fistbump

    @Deprecated(
        "Reference SatsIcons.FistbumpFilled directly",
        ReplaceWith("SatsIcons.FistbumpFilled", "com.sats.dna.SatsIcons"),
    )
    val fistbumpFilled: ImageVector
        @Composable get() = FistbumpFilled

    @Deprecated(
        "Reference SatsIcons.Flag directly",
        ReplaceWith("SatsIcons.Flag", "com.sats.dna.SatsIcons"),
    )
    val flag: ImageVector
        @Composable get() = Flag

    @Deprecated(
        "Reference SatsIcons.Flexibility directly",
        ReplaceWith("SatsIcons.Flexibility", "com.sats.dna.SatsIcons"),
    )
    val flexibility: ImageVector
        @Composable get() = Flexibility

    @Deprecated(
        "Reference SatsIcons.FolderEmpty directly",
        ReplaceWith("SatsIcons.FolderEmpty", "com.sats.dna.SatsIcons"),
    )
    val folderEmpty: ImageVector
        @Composable get() = FolderEmpty

    @Deprecated(
        "Reference SatsIcons.Forward directly",
        ReplaceWith("SatsIcons.Forward", "com.sats.dna.SatsIcons"),
    )
    val forward: ImageVector
        @Composable get() = Forward

    @Deprecated(
        "Reference SatsIcons.Friends directly",
        ReplaceWith("SatsIcons.Friends", "com.sats.dna.SatsIcons"),
    )
    val friends: ImageVector
        @Composable get() = Friends

    @Deprecated(
        "Reference SatsIcons.Fullscreen directly",
        ReplaceWith("SatsIcons.Fullscreen", "com.sats.dna.SatsIcons"),
    )
    val fullscreen: ImageVector
        @Composable get() = Fullscreen

    @Deprecated(
        "Reference SatsIcons.Geoposition directly",
        ReplaceWith("SatsIcons.Geoposition", "com.sats.dna.SatsIcons"),
    )
    val geoposition: ImageVector
        @Composable get() = Geoposition

    @Deprecated(
        "Reference SatsIcons.GetStarted directly",
        ReplaceWith("SatsIcons.GetStarted", "com.sats.dna.SatsIcons"),
    )
    val getStarted: ImageVector
        @Composable get() = GetStarted

    @Deprecated(
        "Reference SatsIcons.Gift directly",
        ReplaceWith("SatsIcons.Gift", "com.sats.dna.SatsIcons"),
    )
    val gift: ImageVector
        @Composable get() = Gift

    @Deprecated(
        "Reference SatsIcons.Gx directly",
        ReplaceWith("SatsIcons.Gx", "com.sats.dna.SatsIcons"),
    )
    val gx: ImageVector
        @Composable get() = Gx

    @Deprecated(
        "Reference SatsIcons.Gym directly",
        ReplaceWith("SatsIcons.Gym", "com.sats.dna.SatsIcons"),
    )
    val gym: ImageVector
        @Composable get() = Gym

    @Deprecated(
        "Reference SatsIcons.HamburgerMenu directly",
        ReplaceWith("SatsIcons.HamburgerMenu", "com.sats.dna.SatsIcons"),
    )
    val hamburgerMenu: ImageVector
        @Composable get() = HamburgerMenu

    @Deprecated(
        "Reference SatsIcons.Headset directly",
        ReplaceWith("SatsIcons.Headset", "com.sats.dna.SatsIcons"),
    )
    val headset: ImageVector
        @Composable get() = Headset

    @Deprecated(
        "Reference SatsIcons.Hidden directly",
        ReplaceWith("SatsIcons.Hidden", "com.sats.dna.SatsIcons"),
    )
    val hidden: ImageVector
        @Composable get() = Hidden

    @Deprecated(
        "Reference SatsIcons.Highfive directly",
        ReplaceWith("SatsIcons.Highfive", "com.sats.dna.SatsIcons"),
    )
    val highfive: ImageVector
        @Composable get() = Highfive

    @Deprecated(
        "Reference SatsIcons.Home directly",
        ReplaceWith("SatsIcons.Home", "com.sats.dna.SatsIcons"),
    )
    val home: ImageVector
        @Composable get() = Home

    @Deprecated(
        "Reference SatsIcons.Images directly",
        ReplaceWith("SatsIcons.Images", "com.sats.dna.SatsIcons"),
    )
    val images: ImageVector
        @Composable get() = Images

    @Deprecated(
        "Reference SatsIcons.Inbox directly",
        ReplaceWith("SatsIcons.Inbox", "com.sats.dna.SatsIcons"),
    )
    val inbox: ImageVector
        @Composable get() = Inbox

    @Deprecated(
        "Reference SatsIcons.Indifference directly",
        ReplaceWith("SatsIcons.Indifference", "com.sats.dna.SatsIcons"),
    )
    val indifference: ImageVector
        @Composable get() = Indifference

    @Deprecated(
        "Reference SatsIcons.Info directly",
        ReplaceWith("SatsIcons.Info", "com.sats.dna.SatsIcons"),
    )
    val info: ImageVector
        @Composable get() = Info

    @Deprecated(
        "Reference SatsIcons.Instagram directly",
        ReplaceWith("SatsIcons.Instagram", "com.sats.dna.SatsIcons"),
    )
    val instagram: ImageVector
        @Composable get() = Instagram

    @Deprecated(
        "Reference SatsIcons.Instructor directly",
        ReplaceWith("SatsIcons.Instructor", "com.sats.dna.SatsIcons"),
    )
    val instructor: ImageVector
        @Composable get() = Instructor

    @Deprecated(
        "Reference SatsIcons.Invoice directly",
        ReplaceWith("SatsIcons.Invoice", "com.sats.dna.SatsIcons"),
    )
    val invoice: ImageVector
        @Composable get() = Invoice

    @Deprecated(
        "Reference SatsIcons.Join directly",
        ReplaceWith("SatsIcons.Join", "com.sats.dna.SatsIcons"),
    )
    val join: ImageVector
        @Composable get() = Join

    @Deprecated(
        "Reference SatsIcons.KidsTeens directly",
        ReplaceWith("SatsIcons.KidsTeens", "com.sats.dna.SatsIcons"),
    )
    val kidsTeens: ImageVector
        @Composable get() = KidsTeens

    @Deprecated(
        "Reference SatsIcons.Kroner directly",
        ReplaceWith("SatsIcons.Kroner", "com.sats.dna.SatsIcons"),
    )
    val kroner: ImageVector
        @Composable get() = Kroner

    @Deprecated(
        "Reference SatsIcons.Level directly",
        ReplaceWith("SatsIcons.Level", "com.sats.dna.SatsIcons"),
    )
    val level: ImageVector
        @Composable get() = Level

    @Deprecated(
        "Reference SatsIcons.LinkExternal directly",
        ReplaceWith("SatsIcons.LinkExternal", "com.sats.dna.SatsIcons"),
    )
    val linkExternal: ImageVector
        @Composable get() = LinkExternal

    @Deprecated(
        "Reference SatsIcons.Linkedin directly",
        ReplaceWith("SatsIcons.Linkedin", "com.sats.dna.SatsIcons"),
    )
    val linkedin: ImageVector
        @Composable get() = Linkedin

    @Deprecated(
        "Reference SatsIcons.Loading directly",
        ReplaceWith("SatsIcons.Loading", "com.sats.dna.SatsIcons"),
    )
    val loading: ImageVector
        @Composable get() = Loading

    @Deprecated(
        "Reference SatsIcons.Location directly",
        ReplaceWith("SatsIcons.Location", "com.sats.dna.SatsIcons"),
    )
    val location: ImageVector
        @Composable get() = Location

    @Deprecated(
        "Reference SatsIcons.Lock directly",
        ReplaceWith("SatsIcons.Lock", "com.sats.dna.SatsIcons"),
    )
    val lock: ImageVector
        @Composable get() = Lock

    @Deprecated(
        "Reference SatsIcons.LockPerson directly",
        ReplaceWith("SatsIcons.LockPerson", "com.sats.dna.SatsIcons"),
    )
    val lockPerson: ImageVector
        @Composable get() = LockPerson

    @Deprecated(
        "Reference SatsIcons.Logout directly",
        ReplaceWith("SatsIcons.Logout", "com.sats.dna.SatsIcons"),
    )
    val logout: ImageVector
        @Composable get() = Logout

    @Deprecated(
        "Reference SatsIcons.Mail directly",
        ReplaceWith("SatsIcons.Mail", "com.sats.dna.SatsIcons"),
    )
    val mail: ImageVector
        @Composable get() = Mail

    @Deprecated(
        "Reference SatsIcons.MartialArts directly",
        ReplaceWith("SatsIcons.MartialArts", "com.sats.dna.SatsIcons"),
    )
    val martialArts: ImageVector
        @Composable get() = MartialArts

    @Deprecated(
        "Reference SatsIcons.Measurement directly",
        ReplaceWith("SatsIcons.Measurement", "com.sats.dna.SatsIcons"),
    )
    val measurement: ImageVector
        @Composable get() = Measurement

    @Deprecated(
        "Reference SatsIcons.Mediataion directly",
        ReplaceWith("SatsIcons.Mediataion", "com.sats.dna.SatsIcons"),
    )
    val mediataion: ImageVector
        @Composable get() = Mediataion

    @Deprecated(
        "Reference SatsIcons.Megaphone directly",
        ReplaceWith("SatsIcons.Megaphone", "com.sats.dna.SatsIcons"),
    )
    val megaphone: ImageVector
        @Composable get() = Megaphone

    @Deprecated(
        "Reference SatsIcons.Menu directly",
        ReplaceWith("SatsIcons.Menu", "com.sats.dna.SatsIcons"),
    )
    val menu: ImageVector
        @Composable get() = Menu

    @Deprecated(
        "Reference SatsIcons.Minus directly",
        ReplaceWith("SatsIcons.Minus", "com.sats.dna.SatsIcons"),
    )
    val minus: ImageVector
        @Composable get() = Minus

    @Deprecated(
        "Reference SatsIcons.More directly",
        ReplaceWith("SatsIcons.More", "com.sats.dna.SatsIcons"),
    )
    val more: ImageVector
        @Composable get() = More

    @Deprecated(
        "Reference SatsIcons.MoreHorizontal directly",
        ReplaceWith("SatsIcons.MoreHorizontal", "com.sats.dna.SatsIcons"),
    )
    val moreHorizontal: ImageVector
        @Composable get() = MoreHorizontal

    @Deprecated(
        "Reference SatsIcons.MoreVertical directly",
        ReplaceWith("SatsIcons.MoreVertical", "com.sats.dna.SatsIcons"),
    )
    val moreVertical: ImageVector
        @Composable get() = MoreVertical

    @Deprecated(
        "Reference SatsIcons.MyPtPackages directly",
        ReplaceWith("SatsIcons.MyPtPackages", "com.sats.dna.SatsIcons"),
    )
    val myPtPackages: ImageVector
        @Composable get() = MyPtPackages

    @Deprecated(
        "Reference SatsIcons.NegRemove directly",
        ReplaceWith("SatsIcons.NegRemove", "com.sats.dna.SatsIcons"),
    )
    val negRemove: ImageVector
        @Composable get() = NegRemove

    @Deprecated(
        "Reference SatsIcons.Notifications directly",
        ReplaceWith("SatsIcons.Notifications", "com.sats.dna.SatsIcons"),
    )
    val notifications: ImageVector
        @Composable get() = Notifications

    @Deprecated(
        "Reference SatsIcons.Nutrition directly",
        ReplaceWith("SatsIcons.Nutrition", "com.sats.dna.SatsIcons"),
    )
    val nutrition: ImageVector
        @Composable get() = Nutrition

    @Deprecated(
        "Reference SatsIcons.OpenFolder directly",
        ReplaceWith("SatsIcons.OpenFolder", "com.sats.dna.SatsIcons"),
    )
    val openFolder: ImageVector
        @Composable get() = OpenFolder

    @Deprecated(
        "Reference SatsIcons.Order directly",
        ReplaceWith("SatsIcons.Order", "com.sats.dna.SatsIcons"),
    )
    val order: ImageVector
        @Composable get() = Order

    @Deprecated(
        "Reference SatsIcons.Outdoors directly",
        ReplaceWith("SatsIcons.Outdoors", "com.sats.dna.SatsIcons"),
    )
    val outdoors: ImageVector
        @Composable get() = Outdoors

    @Deprecated(
        "Reference SatsIcons.Pause directly",
        ReplaceWith("SatsIcons.Pause", "com.sats.dna.SatsIcons"),
    )
    val pause: ImageVector
        @Composable get() = Pause

    @Deprecated(
        "Reference SatsIcons.Percentage directly",
        ReplaceWith("SatsIcons.Percentage", "com.sats.dna.SatsIcons"),
    )
    val percentage: ImageVector
        @Composable get() = Percentage

    @Deprecated(
        "Reference SatsIcons.Person directly",
        ReplaceWith("SatsIcons.Person", "com.sats.dna.SatsIcons"),
    )
    val person: ImageVector
        @Composable get() = Person

    @Deprecated(
        "Reference SatsIcons.Phone directly",
        ReplaceWith("SatsIcons.Phone", "com.sats.dna.SatsIcons"),
    )
    val phone: ImageVector
        @Composable get() = Phone

    @Deprecated(
        "Reference SatsIcons.Play directly",
        ReplaceWith("SatsIcons.Play", "com.sats.dna.SatsIcons"),
    )
    val play: ImageVector
        @Composable get() = Play

    @Deprecated(
        "Reference SatsIcons.Prformance directly",
        ReplaceWith("SatsIcons.Prformance", "com.sats.dna.SatsIcons"),
    )
    val prformance: ImageVector
        @Composable get() = Prformance

    @Deprecated(
        "Reference SatsIcons.Privacy directly",
        ReplaceWith("SatsIcons.Privacy", "com.sats.dna.SatsIcons"),
    )
    val privacy: ImageVector
        @Composable get() = Privacy

    @Deprecated(
        "Reference SatsIcons.PrivacyPolicy directly",
        ReplaceWith("SatsIcons.PrivacyPolicy", "com.sats.dna.SatsIcons"),
    )
    val privacyPolicy: ImageVector
        @Composable get() = PrivacyPolicy

    @Deprecated(
        "Reference SatsIcons.Profile directly",
        ReplaceWith("SatsIcons.Profile", "com.sats.dna.SatsIcons"),
    )
    val profile: ImageVector
        @Composable get() = Profile

    @Deprecated(
        "Reference SatsIcons.ProfileCard directly",
        ReplaceWith("SatsIcons.ProfileCard", "com.sats.dna.SatsIcons"),
    )
    val profileCard: ImageVector
        @Composable get() = ProfileCard

    @Deprecated(
        "Reference SatsIcons.Profilefilled directly",
        ReplaceWith("SatsIcons.Profilefilled", "com.sats.dna.SatsIcons"),
    )
    val profilefilled: ImageVector
        @Composable get() = Profilefilled

    @Deprecated(
        "Reference SatsIcons.ProgramClass directly",
        ReplaceWith("SatsIcons.ProgramClass", "com.sats.dna.SatsIcons"),
    )
    val programClass: ImageVector
        @Composable get() = ProgramClass

    @Deprecated(
        "Reference SatsIcons.Pt directly",
        ReplaceWith("SatsIcons.Pt", "com.sats.dna.SatsIcons"),
    )
    val pt: ImageVector
        @Composable get() = Pt

    @Deprecated(
        "Reference SatsIcons.PtLabel directly",
        ReplaceWith("SatsIcons.PtLabel", "com.sats.dna.SatsIcons"),
    )
    val ptLabel: ImageVector
        @Composable get() = PtLabel

    @Deprecated(
        "Reference SatsIcons.Qr directly",
        ReplaceWith("SatsIcons.Qr", "com.sats.dna.SatsIcons"),
    )
    val qr: ImageVector
        @Composable get() = Qr

    @Deprecated(
        "Reference SatsIcons.QrFilled directly",
        ReplaceWith("SatsIcons.QrFilled", "com.sats.dna.SatsIcons"),
    )
    val qrFilled: ImageVector
        @Composable get() = QrFilled

    @Deprecated(
        "Reference SatsIcons.Question directly",
        ReplaceWith("SatsIcons.Question", "com.sats.dna.SatsIcons"),
    )
    val question: ImageVector
        @Composable get() = Question

    @Deprecated(
        "Reference SatsIcons.Quinyx directly",
        ReplaceWith("SatsIcons.Quinyx", "com.sats.dna.SatsIcons"),
    )
    val quinyx: ImageVector
        @Composable get() = Quinyx

    @Deprecated(
        "Reference SatsIcons.Recipe directly",
        ReplaceWith("SatsIcons.Recipe", "com.sats.dna.SatsIcons"),
    )
    val recipe: ImageVector
        @Composable get() = Recipe

    @Deprecated(
        "Reference SatsIcons.RecruitFriends directly",
        ReplaceWith("SatsIcons.RecruitFriends", "com.sats.dna.SatsIcons"),
    )
    val recruitFriends: ImageVector
        @Composable get() = RecruitFriends

    @Deprecated(
        "Reference SatsIcons.Refresh directly",
        ReplaceWith("SatsIcons.Refresh", "com.sats.dna.SatsIcons"),
    )
    val refresh: ImageVector
        @Composable get() = Refresh

    @Deprecated(
        "Reference SatsIcons.Remove directly",
        ReplaceWith("SatsIcons.Remove", "com.sats.dna.SatsIcons"),
    )
    val remove: ImageVector
        @Composable get() = Remove

    @Deprecated(
        "Reference SatsIcons.RemoveFromCalendar directly",
        ReplaceWith("SatsIcons.RemoveFromCalendar", "com.sats.dna.SatsIcons"),
    )
    val removeFromCalendar: ImageVector
        @Composable get() = RemoveFromCalendar

    @Deprecated(
        "Reference SatsIcons.Rewards directly",
        ReplaceWith("SatsIcons.Rewards", "com.sats.dna.SatsIcons"),
    )
    val rewards: ImageVector
        @Composable get() = Rewards

    @Deprecated(
        "Reference SatsIcons.RewardsElixia directly",
        ReplaceWith("SatsIcons.RewardsElixia", "com.sats.dna.SatsIcons"),
    )
    val rewardsElixia: ImageVector
        @Composable get() = RewardsElixia

    @Deprecated(
        "Reference SatsIcons.RewardsElixiaFilled directly",
        ReplaceWith("SatsIcons.RewardsElixiaFilled", "com.sats.dna.SatsIcons"),
    )
    val rewardsElixiaFilled: ImageVector
        @Composable get() = RewardsElixiaFilled

    @Deprecated(
        "Reference SatsIcons.RewardsFilled directly",
        ReplaceWith("SatsIcons.RewardsFilled", "com.sats.dna.SatsIcons"),
    )
    val rewardsFilled: ImageVector
        @Composable get() = RewardsFilled

    @Deprecated(
        "Reference SatsIcons.Running directly",
        ReplaceWith("SatsIcons.Running", "com.sats.dna.SatsIcons"),
    )
    val running: ImageVector
        @Composable get() = Running

    @Deprecated(
        "Reference SatsIcons.Sad directly",
        ReplaceWith("SatsIcons.Sad", "com.sats.dna.SatsIcons"),
    )
    val sad: ImageVector
        @Composable get() = Sad

    @Deprecated(
        "Reference SatsIcons.Sats directly",
        ReplaceWith("SatsIcons.Sats", "com.sats.dna.SatsIcons"),
    )
    val sats: ImageVector
        @Composable get() = Sats

    @Deprecated(
        "Reference SatsIcons.Satsonline directly",
        ReplaceWith("SatsIcons.Satsonline", "com.sats.dna.SatsIcons"),
    )
    val satsonline: ImageVector
        @Composable get() = Satsonline

    @Deprecated(
        "Reference SatsIcons.Save directly",
        ReplaceWith("SatsIcons.Save", "com.sats.dna.SatsIcons"),
    )
    val save: ImageVector
        @Composable get() = Save

    @Deprecated(
        "Reference SatsIcons.Scale directly",
        ReplaceWith("SatsIcons.Scale", "com.sats.dna.SatsIcons"),
    )
    val scale: ImageVector
        @Composable get() = Scale

    @Deprecated(
        "Reference SatsIcons.Search directly",
        ReplaceWith("SatsIcons.Search", "com.sats.dna.SatsIcons"),
    )
    val search: ImageVector
        @Composable get() = Search

    @Deprecated(
        "Reference SatsIcons.SearchOutlined directly",
        ReplaceWith("SatsIcons.SearchOutlined", "com.sats.dna.SatsIcons"),
    )
    val searchOutlined: ImageVector
        @Composable get() = SearchOutlined

    @Deprecated(
        "Reference SatsIcons.SearchPerson directly",
        ReplaceWith("SatsIcons.SearchPerson", "com.sats.dna.SatsIcons"),
    )
    val searchPerson: ImageVector
        @Composable get() = SearchPerson

    @Deprecated(
        "Reference SatsIcons.Send directly",
        ReplaceWith("SatsIcons.Send", "com.sats.dna.SatsIcons"),
    )
    val send: ImageVector
        @Composable get() = Send

    @Deprecated(
        "Reference SatsIcons.Settings directly",
        ReplaceWith("SatsIcons.Settings", "com.sats.dna.SatsIcons"),
    )
    val settings: ImageVector
        @Composable get() = Settings

    @Deprecated(
        "Reference SatsIcons.Share directly",
        ReplaceWith("SatsIcons.Share", "com.sats.dna.SatsIcons"),
    )
    val share: ImageVector
        @Composable get() = Share

    @Deprecated(
        "Reference SatsIcons.Showing directly",
        ReplaceWith("SatsIcons.Showing", "com.sats.dna.SatsIcons"),
    )
    val showing: ImageVector
        @Composable get() = Showing

    @Deprecated(
        "Reference SatsIcons.Skip directly",
        ReplaceWith("SatsIcons.Skip", "com.sats.dna.SatsIcons"),
    )
    val skip: ImageVector
        @Composable get() = Skip

    @Deprecated(
        "Reference SatsIcons.Smallgroup directly",
        ReplaceWith("SatsIcons.Smallgroup", "com.sats.dna.SatsIcons"),
    )
    val smallgroup: ImageVector
        @Composable get() = Smallgroup

    @Deprecated(
        "Reference SatsIcons.Smartphone directly",
        ReplaceWith("SatsIcons.Smartphone", "com.sats.dna.SatsIcons"),
    )
    val smartphone: ImageVector
        @Composable get() = Smartphone

    @Deprecated(
        "Reference SatsIcons.Smiley directly",
        ReplaceWith("SatsIcons.Smiley", "com.sats.dna.SatsIcons"),
    )
    val smiley: ImageVector
        @Composable get() = Smiley

    @Deprecated(
        "Reference SatsIcons.SortTool directly",
        ReplaceWith("SatsIcons.SortTool", "com.sats.dna.SatsIcons"),
    )
    val sortTool: ImageVector
        @Composable get() = SortTool

    @Deprecated(
        "Reference SatsIcons.Sound directly",
        ReplaceWith("SatsIcons.Sound", "com.sats.dna.SatsIcons"),
    )
    val sound: ImageVector
        @Composable get() = Sound

    @Deprecated(
        "Reference SatsIcons.Spotify directly",
        ReplaceWith("SatsIcons.Spotify", "com.sats.dna.SatsIcons"),
    )
    val spotify: ImageVector
        @Composable get() = Spotify

    @Deprecated(
        "Reference SatsIcons.Square directly",
        ReplaceWith("SatsIcons.Square", "com.sats.dna.SatsIcons"),
    )
    val square: ImageVector
        @Composable get() = Square

    @Deprecated(
        "Reference SatsIcons.Star directly",
        ReplaceWith("SatsIcons.Star", "com.sats.dna.SatsIcons"),
    )
    val star: ImageVector
        @Composable get() = Star

    @Deprecated(
        "Reference SatsIcons.StarBorder directly",
        ReplaceWith("SatsIcons.StarBorder", "com.sats.dna.SatsIcons"),
    )
    val starBorder: ImageVector
        @Composable get() = StarBorder

    @Deprecated(
        "Reference SatsIcons.StarSticker directly",
        ReplaceWith("SatsIcons.StarSticker", "com.sats.dna.SatsIcons"),
    )
    val starSticker: ImageVector
        @Composable get() = StarSticker

    @Deprecated(
        "Reference SatsIcons.StarStickerCheck directly",
        ReplaceWith("SatsIcons.StarStickerCheck", "com.sats.dna.SatsIcons"),
    )
    val starStickerCheck: ImageVector
        @Composable get() = StarStickerCheck

    @Deprecated(
        "Reference SatsIcons.Statistics directly",
        ReplaceWith("SatsIcons.Statistics", "com.sats.dna.SatsIcons"),
    )
    val statistics: ImageVector
        @Composable get() = Statistics

    @Deprecated(
        "Reference SatsIcons.Strength directly",
        ReplaceWith("SatsIcons.Strength", "com.sats.dna.SatsIcons"),
    )
    val strength: ImageVector
        @Composable get() = Strength

    @Deprecated(
        "Reference SatsIcons.Strikes directly",
        ReplaceWith("SatsIcons.Strikes", "com.sats.dna.SatsIcons"),
    )
    val strikes: ImageVector
        @Composable get() = Strikes

    @Deprecated(
        "Reference SatsIcons.StudiosMarkerBg directly",
        ReplaceWith("SatsIcons.StudiosMarkerBg", "com.sats.dna.SatsIcons"),
    )
    val studiosMarkerBg: ImageVector
        @Composable get() = StudiosMarkerBg

    @Deprecated(
        "Reference SatsIcons.StudiosMarkerElixia directly",
        ReplaceWith("SatsIcons.StudiosMarkerElixia", "com.sats.dna.SatsIcons"),
    )
    val studiosMarkerElixia: ImageVector
        @Composable get() = StudiosMarkerElixia

    @Deprecated(
        "Reference SatsIcons.StudiosMarkerSats directly",
        ReplaceWith("SatsIcons.StudiosMarkerSats", "com.sats.dna.SatsIcons"),
    )
    val studiosMarkerSats: ImageVector
        @Composable get() = StudiosMarkerSats

    @Deprecated(
        "Reference SatsIcons.Sync directly",
        ReplaceWith("SatsIcons.Sync", "com.sats.dna.SatsIcons"),
    )
    val sync: ImageVector
        @Composable get() = Sync

    @Deprecated(
        "Reference SatsIcons.Themes directly",
        ReplaceWith("SatsIcons.Themes", "com.sats.dna.SatsIcons"),
    )
    val themes: ImageVector
        @Composable get() = Themes

    @Deprecated(
        "Reference SatsIcons.ThumbsUp directly",
        ReplaceWith("SatsIcons.ThumbsUp", "com.sats.dna.SatsIcons"),
    )
    val thumbsUp: ImageVector
        @Composable get() = ThumbsUp

    @Deprecated(
        "Reference SatsIcons.Ticket directly",
        ReplaceWith("SatsIcons.Ticket", "com.sats.dna.SatsIcons"),
    )
    val ticket: ImageVector
        @Composable get() = Ticket

    @Deprecated(
        "Reference SatsIcons.Time directly",
        ReplaceWith("SatsIcons.Time", "com.sats.dna.SatsIcons"),
    )
    val time: ImageVector
        @Composable get() = Time

    @Deprecated(
        "Reference SatsIcons.TimeFilled directly",
        ReplaceWith("SatsIcons.TimeFilled", "com.sats.dna.SatsIcons"),
    )
    val timeFilled: ImageVector
        @Composable get() = TimeFilled

    @Deprecated(
        "Reference SatsIcons.Treatments directly",
        ReplaceWith("SatsIcons.Treatments", "com.sats.dna.SatsIcons"),
    )
    val treatments: ImageVector
        @Composable get() = Treatments

    @Deprecated(
        "Reference SatsIcons.Trophy directly",
        ReplaceWith("SatsIcons.Trophy", "com.sats.dna.SatsIcons"),
    )
    val trophy: ImageVector
        @Composable get() = Trophy

    @Deprecated(
        "Reference SatsIcons.Up directly",
        ReplaceWith("SatsIcons.Up", "com.sats.dna.SatsIcons"),
    )
    val up: ImageVector
        @Composable get() = Up

    @Deprecated(
        "Reference SatsIcons.Video directly",
        ReplaceWith("SatsIcons.Video", "com.sats.dna.SatsIcons"),
    )
    val video: ImageVector
        @Composable get() = Video

    @Deprecated(
        "Reference SatsIcons.VideoFilled directly",
        ReplaceWith("SatsIcons.VideoFilled", "com.sats.dna.SatsIcons"),
    )
    val videoFilled: ImageVector
        @Composable get() = VideoFilled

    @Deprecated(
        "Reference SatsIcons.Vouchers directly",
        ReplaceWith("SatsIcons.Vouchers", "com.sats.dna.SatsIcons"),
    )
    val vouchers: ImageVector
        @Composable get() = Vouchers

    @Deprecated(
        "Reference SatsIcons.WarningSign directly",
        ReplaceWith("SatsIcons.WarningSign", "com.sats.dna.SatsIcons"),
    )
    val warningSign: ImageVector
        @Composable get() = WarningSign

    @Deprecated(
        "Reference SatsIcons.WorkoutGymFloor directly",
        ReplaceWith("SatsIcons.WorkoutGymFloor", "com.sats.dna.SatsIcons"),
    )
    val workoutGymFloor: ImageVector
        @Composable get() = WorkoutGymFloor

    @Deprecated(
        "Reference SatsIcons.WorkoutOther directly",
        ReplaceWith("SatsIcons.WorkoutOther", "com.sats.dna.SatsIcons"),
    )
    val workoutOther: ImageVector
        @Composable get() = WorkoutOther

    @Deprecated(
        "Reference SatsIcons.WorkoutPlan directly",
        ReplaceWith("SatsIcons.WorkoutPlan", "com.sats.dna.SatsIcons"),
    )
    val workoutPlan: ImageVector
        @Composable get() = WorkoutPlan

    @Deprecated(
        "Reference SatsIcons.Workplace directly",
        ReplaceWith("SatsIcons.Workplace", "com.sats.dna.SatsIcons"),
    )
    val workplace: ImageVector
        @Composable get() = Workplace

    @Deprecated(
        "Reference SatsIcons.Yoga directly",
        ReplaceWith("SatsIcons.Yoga", "com.sats.dna.SatsIcons"),
    )
    val yoga: ImageVector
        @Composable get() = Yoga

    @Deprecated(
        "Reference SatsIcons.Youtube directly",
        ReplaceWith("SatsIcons.Youtube", "com.sats.dna.SatsIcons"),
    )
    val youtube: ImageVector
        @Composable get() = Youtube

    @Deprecated(
        "Reference SatsIcons.Zendesk directly",
        ReplaceWith("SatsIcons.Zendesk", "com.sats.dna.SatsIcons"),
    )
    val zendesk: ImageVector
        @Composable get() = Zendesk
}
