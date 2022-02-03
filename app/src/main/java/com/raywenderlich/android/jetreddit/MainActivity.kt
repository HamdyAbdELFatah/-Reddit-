package com.raywenderlich.android.jetreddit

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.animation.ExperimentalAnimationApi
import com.raywenderlich.android.jetreddit.viewmodel.MainViewModel
import com.raywenderlich.android.jetreddit.viewmodel.MainViewModelFactory

class MainActivity : AppCompatActivity() {

  private val viewModel: MainViewModel by viewModels(factoryProducer = {
    MainViewModelFactory(
      this,
      (application as JetRedditApplication).dependencyInjector.repository
    )
  })

  @ExperimentalAnimationApi
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    setContent {
      JetRedditApp(viewModel)
    }
  }
}