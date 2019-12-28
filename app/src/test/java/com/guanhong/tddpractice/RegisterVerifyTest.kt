package com.guanhong.tddpractice

import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class RegisterVerifyTest {

    private lateinit var registerVerify: RegisterVerify

    @Before
    fun setup(){

        registerVerify = RegisterVerify()
    }

    @Test
    fun testIsAccountCorrect() {

        val actual = registerVerify.isAccountCorrect("ssssssssss")

        assertTrue(actual)
    }

    @Test
    fun testIsPasswordCorrect(){

        val actual = registerVerify.isPasswordCorrect("fw3wwwwui")

        assertTrue(actual)
    }
}