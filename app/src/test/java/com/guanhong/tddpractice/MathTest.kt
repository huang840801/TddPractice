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
    fun testAddTwoNum() {

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

    @Test
    fun testSortArrayMinToMax() {

        val actual = math.sortArrayMaxToMin(intArrayOf(6, 5, 8, 2, 2, 4))
        val expected = intArrayOf(8, 6, 5, 4, 2, 2)

        assertArrayEquals(expected, actual)
    }

}