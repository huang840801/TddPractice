package com.guanhong.tddpractice

class RegisterVerify {

    fun isAccountCorrect(account: String): Boolean {

        return (account.count() >= 6 && account[0].toUpperCase() in 'A'..'Z')
    }

    fun isPasswordCorrect(password: String): Boolean {

        val numList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)

        return (password.count() >= 8 &&
                password[0].toUpperCase() in 'A'..'Z'
                && (numList.any { password.contains(it.toString()) }))
    }
}
