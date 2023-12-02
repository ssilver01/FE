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
data class UserLogin(
    @SerializedName("id") val id: String,
    @SerializedName("pwd") val pwd: String,
)
data class UserLogout(
    @SerializedName("id") val id: String,
    @SerializedName("pwd") val pwd: String,
)

data class UserEdit(
    @SerializedName("pwd") val pwd: String,
    @SerializedName("nickname") val nickname: String,
    @SerializedName("profile_img") val profile_img: Int
)

data class  UserIdSearch(
    @SerializedName("phone_number") val phone_number: String,
)
data class  UserPwdSearch(
    @SerializedName("id") val id: String,
    @SerializedName("email") val email: String
)

data class Ranking(
    @SerializedName("total_coin") val total_coin: Int,
    @SerializedName("nickname") val nickname: String,
    @SerializedName("profile_img") val profile_img: Int
)
