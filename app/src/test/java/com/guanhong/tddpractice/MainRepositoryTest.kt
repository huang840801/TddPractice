package com.guanhong.tddpractice

import android.content.Context
import android.content.SharedPreferences
import org.junit.Test
import org.mockito.ArgumentMatchers
import org.mockito.Mockito.*

class MainRepositoryTest {

    @Test
    fun saveUserAccount() {

        val mockSharedPreferences = mock(SharedPreferences::class.java)
        val mockSharedPreferencesEditor = mock(SharedPreferences.Editor::class.java)
        val mockContext = mock(Context::class.java)

        `when`(mockContext.getSharedPreferences(ArgumentMatchers.anyString(), ArgumentMatchers.anyInt())).thenReturn(mockSharedPreferences)
        `when`(mockSharedPreferences.edit()).thenReturn(mockSharedPreferencesEditor)
        `when`(mockSharedPreferencesEditor.putString(ArgumentMatchers.anyString(), ArgumentMatchers.anyString())).thenReturn(mockSharedPreferencesEditor)

        val userId = "A123456"
        val preferencesKey = "USER_ACCOUNT"

        val mainRepository = MainRepository(mockContext)

        mainRepository.saveUserAccount(userId)

        verify(mockSharedPreferencesEditor).putString(

            argThat { it == preferencesKey },
            argThat { it == userId }
        )

        verify(mockSharedPreferencesEditor).apply()
    }
}