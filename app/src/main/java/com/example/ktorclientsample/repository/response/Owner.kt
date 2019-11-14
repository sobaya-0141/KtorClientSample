package com.example.ktorclientsample.repository.response

import com.google.gson.annotations.SerializedName

data class Owner (@SerializedName("avatar_url") val avatar: String, val login: String)
