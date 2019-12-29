package com.guanhong.tddpractice

interface ISharedPreferenceManager {

    fun saveString(key: String, value: String)
    fun getString(key: String): String
}
