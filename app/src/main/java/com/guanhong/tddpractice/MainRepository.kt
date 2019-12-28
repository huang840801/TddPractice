package com.guanhong.tddpractice

import android.content.Context

class MainRepository(private val context: Context) {

    fun saveUserAccount(account: String) {

        val sharedPreferences = context.getSharedPreferences("USER_DATA", Context.MODE_PRIVATE)

        sharedPreferences.edit().putString("USER_ACCOUNT", account).apply()
    }
}