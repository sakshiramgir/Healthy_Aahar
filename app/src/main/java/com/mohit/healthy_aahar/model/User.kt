package com.mohit.healthy_aahar.model

import com.google.gson.annotations.SerializedName

data class User(
    val uid: String,
    val name: String,
    val age: Int,
    val gender: String,
    val weight: Float,
    val height: Float,
    @SerializedName("activity_level")
    val activityLevel: String,

    val goal: String

)