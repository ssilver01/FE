package com.example.youxmap.retrofit

import android.content.Context
import androidx.appcompat.app.AppCompatActivity

fun getUserName(context: Context): String {
    val spf = context.getSharedPreferences("userName_spf", AppCompatActivity.MODE_PRIVATE)
    return spf.getString("userName_spf", 1.toString())!!
}

fun saveUserTotalCoin(context: Context, coin: Int){
    val pref =
        context.getSharedPreferences("userTotalCoin_spf", Context.MODE_PRIVATE) //shared key 설정
    val edit = pref.edit() // 수정모드
    edit.putInt("userTotalCoin_spf", coin) // 값 넣기
    edit.apply() // 적용하기
}

fun getUserTotalCoin(context: Context): Int {
    val spf = context.getSharedPreferences("userTotalCoin_spf", AppCompatActivity.MODE_PRIVATE)
    return spf.getInt("userTotalCoin_spf", -1)!!
}

fun saveUserCoin(context: Context, coin: Int) {
    val pref =
        context.getSharedPreferences("userCoin_spf", Context.MODE_PRIVATE) //shared key 설정
    val edit = pref.edit() // 수정모드
    edit.putInt("userCoin_spf", coin) // 값 넣기
    edit.apply() // 적용하기
}

fun getUserCoin(context: Context): Int {
    val spf = context.getSharedPreferences("userCoin_spf", AppCompatActivity.MODE_PRIVATE)
    return spf.getInt("userCoin_spf", -1)!!
}