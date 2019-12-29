package com.guanhong.tddpractice

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SharedPreferenceManagerTest {

    @Test
    fun saveString() {

        val targetContext = InstrumentationRegistry.getInstrumentation().targetContext

        val key = "User_Id"
        val value = "A123456789"

        val sharedPreferenceManager: ISharedPreferenceManager = SharedPreferenceManager(targetContext)

        sharedPreferenceManager.saveString(key, value)

        val accountFromSP = sharedPreferenceManager.getString(key)

        assertEquals("A123456789", accountFromSP)
    }
}