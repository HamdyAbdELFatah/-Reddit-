package com.raywenderlich.android.jetreddit.models
import androidx.annotation.StringRes
import com.raywenderlich.android.jetreddit.R

data class SubredditModel(
    @StringRes val nameStringRes: Int,
    @StringRes val membersStringRes: Int,
    @StringRes val descriptionStringRes: Int
) {

    companion object {

        val DEFAULT_SUBREDDIT =
            SubredditModel(R.string.android, R.string.members_400k, R.string.welcome_to_android)
    }
}