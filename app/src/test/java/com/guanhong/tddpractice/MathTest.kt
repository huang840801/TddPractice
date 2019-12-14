package com.guanhong.tddpractice

import org.junit.Test

import org.junit.Assert.*

class MathTest {

    @Test
    fun addTwoNum() {

        val expected = Math().addTwoNum(1, 3)
        val actual = 4

        assertEquals(expected, actual)
    }

    @Test
    fun testNum1LessThanNum2() {

        val actual = Math().getMin(3, 7)
        val expect = 3

        assertEquals(expect, actual)
    }

    @Test
    fun testNum2LessThanNum1() {

        val actual = Math().getMin(8, 7)
        val expect = 7

        assertEquals(expect, actual)
    }
}