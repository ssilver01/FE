package com.example.youxmap.retrofit

import com.google.gson.annotations.SerializedName

//부탁드려여
data class User (
    @SerializedName("id") val id: String,
    @SerializedName("pwd") val pwd: String,
    @SerializedName("total_coin") val total_coin: Int,
    @SerializedName("available_coin") val available_coin: Int,
    @SerializedName("nickname") val nickname: String,
    @SerializedName("profile_img") val profile_img: Int
)