package com.guanhong.tddpractice

import org.junit.Assert.*
import org.junit.Test
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock

class UmbrellaTest{

    @Test
    fun totalPrice_sunnyDay() {

        val umbrella = Umbrella()
        val weather = mock(IWeather::class.java)

        `when`(weather.isSunny()).thenReturn(true)

        val actual = umbrella.totalPrice(weather, 4, 500)
        val expect = 1800

        assertEquals(expect, actual)
    }

    @Test
    fun totalPrice_rainingDay() {

        val umbrella = Umbrella()
        val stubWeather = StubWeather()

        stubWeather.fakeIsSunny = false

        val actual = umbrella.totalPrice(stubWeather, 4, 500)
        val expect = 2000

        assertEquals(expect, actual)
    }
}