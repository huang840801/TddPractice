package com.guanhong.tddpractice

import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class LeetCodeTest {

    private lateinit var leetCode: LeetCode

    @Before
    fun setUp() {

        leetCode = LeetCode()
    }

    @Test
    fun testFindUnsortedSubarray() {

        val actual = leetCode.findUnsortedSubarray(intArrayOf(0, 6, 0, 4, 7, 12))
        val expected = 4

        assertEquals(expected, actual)
    }

    @Test
    fun testFindComplement() {

        val expected = leetCode.findComplement(5)
        val actual = 2

        assertEquals(expected, actual)
    }

    @Test
    fun testBinaryTransToDecimal() {

        val expected = leetCode.binaryTransToDecimal("1000")
        val actual = 8

        assertEquals(expected, actual)
    }

    @Test
    fun testCalculateRoot() {

        val actual = leetCode.calculateRoot(2, 2)
        val expected = 4

        assertEquals(expected, actual)
    }

    @Test
    fun testDecimalTransToBinary() {

        val actual = leetCode.decimalTransToBinary(5)
        val expected = "101"

        assertEquals(expected, actual)
    }

    @Test
    fun testThirdMax() {

        val actual = leetCode.thirdMax(intArrayOf())
        val expected = 0

        assertEquals(expected, actual)
    }

    @Test
    fun testRemoveDuplicateElement() {

        val actual = leetCode.removeDuplicateElement(intArrayOf(2, 9, 6))
        val expected = intArrayOf(2, 9, 6)

        assertArrayEquals(expected, actual)
    }
}