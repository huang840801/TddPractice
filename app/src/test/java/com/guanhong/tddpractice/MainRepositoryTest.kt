package com.guanhong.tddpractice

import org.junit.Test
import org.mockito.Mockito.*

class MainRepositoryTest {

    @Test
    fun saveUserAccount() {

        val mockISharedPreferenceManager = mock(ISharedPreferenceManager::class.java)

        val key = "USER_ID"
        val account = "A1234567890"

        val mainRepository = MainRepository(mockISharedPreferenceManager)

        mainRepository.saveUserAccount(account)

        verify(mockISharedPreferenceManager).saveString(key, account)
    }
}