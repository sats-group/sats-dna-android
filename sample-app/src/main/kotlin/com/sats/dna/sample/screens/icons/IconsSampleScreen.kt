package com.sats.dna.sample.screens.icons

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.SatsIcons
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
import com.sats.dna.icons.WorkoutPlan
import com.sats.dna.icons.Workplace
import com.sats.dna.icons.Yoga
import com.sats.dna.icons.Youtube
import com.sats.dna.icons.Zendesk
import com.sats.dna.sample.screens.SampleScreen
import com.sats.dna.theme.SatsTheme

@Composable
fun IconsSampleScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    SampleScreen("Icons", navigateUp, modifier) { innerPadding ->
        val icons = allIcons
            .distinctBy { it.name }
            .sortedBy { it.name }

        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(
                start = innerPadding.calculateStartPadding(LocalLayoutDirection.current) + SatsTheme.spacing.m,
                top = innerPadding.calculateTopPadding() + SatsTheme.spacing.m,
                end = innerPadding.calculateEndPadding(LocalLayoutDirection.current) + SatsTheme.spacing.m,
                bottom = innerPadding.calculateBottomPadding() + SatsTheme.spacing.m,
            ),
            verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
        ) {
            items(icons, key = { "icon-${it.name}" }) { icon ->
                Row(
                    horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Icon(icon, contentDescription = null, Modifier.size(24.dp))
                    Text(icon.name)
                }
            }
        }
    }
}

private val allIcons: List<ImageVector>
    @Composable get() = listOf(
        SatsIcons.Activity,
        SatsIcons.ActivityFilled,
        SatsIcons.ActivityOutline,
        SatsIcons.Add,
        SatsIcons.AddNewSearch,
        SatsIcons.AddPerson,
        SatsIcons.AddToCalendar,
        SatsIcons.Aerobics,
        SatsIcons.AppIconE,
        SatsIcons.AppIconS,
        SatsIcons.Aqua,
        SatsIcons.Archived,
        SatsIcons.ArchivedFilled,
        SatsIcons.ArrowDown,
        SatsIcons.ArrowLeft,
        SatsIcons.ArrowRight,
        SatsIcons.ArrowUp,
        SatsIcons.AudioClass,
        SatsIcons.Award,
        SatsIcons.Back,
        SatsIcons.BarChart,
        SatsIcons.Barbell,
        SatsIcons.BellCherry,
        SatsIcons.Body,
        SatsIcons.Book,
        SatsIcons.Booked,
        SatsIcons.Calendar,
        SatsIcons.Cardio,
        SatsIcons.Cast,
        SatsIcons.Chat,
        SatsIcons.Check,
        SatsIcons.Cherry,
        SatsIcons.Class,
        SatsIcons.ClassStroke,
        SatsIcons.ClockFilled,
        SatsIcons.Close,
        SatsIcons.CloseCircle,
        SatsIcons.Closed,
        SatsIcons.Clubs,
        SatsIcons.ClubsFilled,
        SatsIcons.ClubsOutline,
        SatsIcons.Comment,
        SatsIcons.CommentFilled,
        SatsIcons.Confirm,
        SatsIcons.Copy,
        SatsIcons.Creditcard,
        SatsIcons.CrossComment,
        SatsIcons.CrossPerson,
        SatsIcons.Cycling,
        SatsIcons.Dance,
        SatsIcons.Delete,
        SatsIcons.Distance,
        SatsIcons.Download,
        SatsIcons.Edit,
        SatsIcons.Elixia,
        SatsIcons.EnergyDrink,
        SatsIcons.Error,
        SatsIcons.Facebook,
        SatsIcons.FacebookPadding,
        SatsIcons.Filter,
        SatsIcons.Fire,
        SatsIcons.Fistbump,
        SatsIcons.FistbumpFilled,
        SatsIcons.Flag,
        SatsIcons.Flexibility,
        SatsIcons.FolderEmpty,
        SatsIcons.Forward,
        SatsIcons.Friends,
        SatsIcons.Fullscreen,
        SatsIcons.Geoposition,
        SatsIcons.GetStarted,
        SatsIcons.Gift,
        SatsIcons.Gx,
        SatsIcons.Gym,
        SatsIcons.HamburgerMenu,
        SatsIcons.Headset,
        SatsIcons.Hidden,
        SatsIcons.Highfive,
        SatsIcons.Home,
        SatsIcons.Images,
        SatsIcons.Inbox,
        SatsIcons.Indifference,
        SatsIcons.Info,
        SatsIcons.Instagram,
        SatsIcons.Instructor,
        SatsIcons.Invoice,
        SatsIcons.Join,
        SatsIcons.KidsTeens,
        SatsIcons.Kroner,
        SatsIcons.Level,
        SatsIcons.LinkExternal,
        SatsIcons.Linkedin,
        SatsIcons.Loading,
        SatsIcons.Location,
        SatsIcons.Lock,
        SatsIcons.LockPerson,
        SatsIcons.Logout,
        SatsIcons.Mail,
        SatsIcons.MartialArts,
        SatsIcons.Measurement,
        SatsIcons.Mediataion,
        SatsIcons.Megaphone,
        SatsIcons.Menu,
        SatsIcons.Minus,
        SatsIcons.More,
        SatsIcons.MoreHorizontal,
        SatsIcons.MoreVertical,
        SatsIcons.MyPtPackages,
        SatsIcons.NegRemove,
        SatsIcons.Notifications,
        SatsIcons.Nutrition,
        SatsIcons.OpenFolder,
        SatsIcons.Order,
        SatsIcons.Outdoors,
        SatsIcons.Pause,
        SatsIcons.Percentage,
        SatsIcons.Person,
        SatsIcons.Phone,
        SatsIcons.Play,
        SatsIcons.Prformance,
        SatsIcons.Privacy,
        SatsIcons.PrivacyPolicy,
        SatsIcons.Profile,
        SatsIcons.ProfileCard,
        SatsIcons.Profilefilled,
        SatsIcons.ProgramClass,
        SatsIcons.Pt,
        SatsIcons.PtLabel,
        SatsIcons.Qr,
        SatsIcons.QrFilled,
        SatsIcons.Question,
        SatsIcons.Quinyx,
        SatsIcons.Recipe,
        SatsIcons.RecruitFriends,
        SatsIcons.Refresh,
        SatsIcons.Remove,
        SatsIcons.RemoveFromCalendar,
        SatsIcons.Rewards,
        SatsIcons.RewardsElixia,
        SatsIcons.RewardsElixiaFilled,
        SatsIcons.RewardsFilled,
        SatsIcons.Running,
        SatsIcons.Sad,
        SatsIcons.Sats,
        SatsIcons.Satsonline,
        SatsIcons.Save,
        SatsIcons.Scale,
        SatsIcons.Search,
        SatsIcons.SearchOutlined,
        SatsIcons.SearchPerson,
        SatsIcons.Send,
        SatsIcons.Settings,
        SatsIcons.Share,
        SatsIcons.Showing,
        SatsIcons.Skip,
        SatsIcons.Smallgroup,
        SatsIcons.Smartphone,
        SatsIcons.Smiley,
        SatsIcons.SortTool,
        SatsIcons.Sound,
        SatsIcons.Spotify,
        SatsIcons.Square,
        SatsIcons.Star,
        SatsIcons.StarBorder,
        SatsIcons.StarSticker,
        SatsIcons.StarStickerCheck,
        SatsIcons.Statistics,
        SatsIcons.Strength,
        SatsIcons.Strikes,
        SatsIcons.StudiosMarkerBg,
        SatsIcons.StudiosMarkerElixia,
        SatsIcons.StudiosMarkerSats,
        SatsIcons.Sync,
        SatsIcons.Themes,
        SatsIcons.ThumbsUp,
        SatsIcons.Ticket,
        SatsIcons.Time,
        SatsIcons.TimeFilled,
        SatsIcons.Treatments,
        SatsIcons.Trophy,
        SatsIcons.Up,
        SatsIcons.Video,
        SatsIcons.VideoFilled,
        SatsIcons.Vouchers,
        SatsIcons.WarningSign,
        SatsIcons.WorkoutPlan,
        SatsIcons.Workplace,
        SatsIcons.Yoga,
        SatsIcons.Youtube,
        SatsIcons.Zendesk,
    )

@PreviewLightDark
@Composable
private fun IconsSampleScreenPreview() {
    SatsTheme {
        IconsSampleScreen(navigateUp = {})
    }
}
