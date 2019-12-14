package com.guanhong.tddpractice

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class MathTest {

    lateinit var math: Math

    @Before
    fun setup(){

        math = Math()
    }

    @Test
    fun addTwoNum() {

        val expected = math.addTwoNum(1, 3)
        val actual = 4

        assertEquals(expected, actual)
    }

    @Test
    fun testNum1LessThanNum2() {

        val actual = math.getMin(3, 7)
        val expect = 3

        assertEquals(expect, actual)
    }

    @Test
    fun testNum2LessThanNum1() {

        val actual = math.getMin(8, 7)
        val expect = 7

        assertEquals(expect, actual)
    }
}