package com.example.coursesgrid.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class CoursesData(
    @StringRes val courseTitle: Int,
    val courseCount: Int,
    @DrawableRes val imageResourceId: Int,
)