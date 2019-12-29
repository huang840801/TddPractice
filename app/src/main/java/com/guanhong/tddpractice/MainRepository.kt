package com.guanhong.tddpractice

class MainRepository(private val sharedPreferenceManager: ISharedPreferenceManager) {

    fun saveUserAccount(account: String) {

        sharedPreferenceManager.saveString("USER_ID", account)
    }
}