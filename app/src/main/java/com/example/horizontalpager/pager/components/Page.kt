package com.example.horizontalpager.pager.components

import androidx.annotation.DrawableRes
import com.example.horizontalpager.ANDROID
import com.example.horizontalpager.JETPACK_COMPOSE
import com.example.horizontalpager.KOTLIN
import com.example.horizontalpager.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)
val pages = listOf(
    Page(
        title = "Android",
        description =ANDROID,
        image = R.drawable.android_ic
    ),
    Page(
        title = "Kotlin",
        description = KOTLIN,
        image = R.drawable.kotlin_ic
    ),
    Page(
        title = "Jetpack Compose",
        description = JETPACK_COMPOSE,
        image = R.drawable.jetpack_compose_ic
    )

)