package com.guanhong.tddpractice

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class MathTest {

    lateinit var math: Math

    @Before
    fun setup() {

        math = Math()
    }

    @Test
    fun findComplement() {

        val expected = math.findComplement(5)
        val actual = 2

        assertEquals(expected, actual)
    }

    @Test
    fun binaryTransToDecimal() {

        val expected = math.binaryTransToDecimal("1000")
        val actual = 8

        assertEquals(expected, actual)
    }

    @Test
    fun calculateRoot() {

        val actual = math.calculateRoot(2, 2)
        val expected = 4

        assertEquals(expected, actual)
    }

    @Test
    fun decimalTransToBinary() {

        val actual = math.decimalTransToBinary(5)
        val expected = "101"

        assertEquals(expected, actual)
    }

    @Test
    fun addTwoNum() {

        val actual = math.addTwoNum(1, 3)
        val expected = 4

        assertEquals(expected, actual)
    }

    @Test
    fun testNum1LessThanNum2() {

        val actual = math.getMin(3, 7)
        val expected = 3

        assertEquals(expected, actual)
    }

    @Test
    fun testNum2LessThanNum1() {

        val actual = math.getMin(8, 7)
        val expected = 7

        assertEquals(expected, actual)
    }
}