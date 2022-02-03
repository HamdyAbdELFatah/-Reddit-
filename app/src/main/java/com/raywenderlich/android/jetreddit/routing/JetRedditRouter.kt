package com.raywenderlich.android.jetreddit.routing

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.res.stringResource
import com.raywenderlich.android.jetreddit.R


sealed class Screen(val titleResId: Int) {
  object Home : Screen(R.string.home)
  object Subscriptions : Screen(R.string.subreddits)
  object NewPost : Screen(R.string.new_post)
  object MyProfile : Screen(R.string.my_profile)
  object ChooseCommunity : Screen(R.string.choose_community)
}

object JetRedditRouter {
  var currentScreen: MutableState<Screen> = mutableStateOf(
    Screen.Home
  )

  private var previousScreen: MutableState<Screen> = mutableStateOf(
    Screen.Home
  )

  fun navigateTo(destination: Screen) {
    previousScreen.value = currentScreen.value
    currentScreen.value = destination
  }

  fun goBack() {
    currentScreen.value = previousScreen.value
  }
}