package com.guanhong.tddpractice

import android.content.Context
import android.content.SharedPreferences

class SharedPreferenceManager(context: Context) : ISharedPreferenceManager {

    private val sharedPreferenceKey = "USER_DATA"

    private var sharedPreferences: SharedPreferences

    init {

        sharedPreferences = context.getSharedPreferences(sharedPreferenceKey, Context.MODE_PRIVATE)
    }

    override fun saveString(key: String, value: String) {

        sharedPreferences.edit().putString(key, value).apply()
    }

    override fun getString(key: String): String {

        return sharedPreferences.getString(key, "")!!
    }
}