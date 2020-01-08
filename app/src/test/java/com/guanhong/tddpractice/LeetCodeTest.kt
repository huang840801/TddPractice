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

    /**
     * test result
     */

    @Test
    fun test() {

        val expected = 4
        val actual = leetCode.test()

        assertEquals(expected, actual)
    }

    /**
     * 581
     */
    @Test
    fun testFindUnsortedSubarray() {

        val actual = leetCode.findUnsortedSubarray(intArrayOf(1, 2, 3, 4))
        val expected = 4

        assertEquals(expected, actual)
    }

    /**
     * 476
     */
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
    fun testDecimalTransToBinary() {

        val actual = leetCode.decimalTransToBinary(5)
        val expected = "101"

        assertEquals(expected, actual)
    }

    @Test
    fun testCalculateRoot() {

        val actual = leetCode.calculateRoot(2, 2)
        val expected = 4

        assertEquals(expected, actual)
    }

    /**
     * 414
     */
    @Test
    fun testThirdMax() {

        val actual = leetCode.thirdMax(intArrayOf())
        val expected = 0

        assertEquals(expected, actual)
    }

    @Test
    fun testRecursiveThirdMax() {

        val actual = leetCode.recursiveThirdMax(intArrayOf(4, 5, 7, 2, 1), 0)
        val expected = 4

        assertEquals(expected, actual)
    }

    @Test
    fun testRemoveDuplicateElement() {

        val actual = leetCode.removeDuplicateElement(intArrayOf(2, 9, 6))
        val expected = intArrayOf(2, 9, 6)

        assertArrayEquals(expected, actual)
    }

    /**
     * 728
     */
    @Test
    fun testSelfDividingNumbers() {

        val actual = leetCode.selfDividingNumbers(1, 1)
        val expected = listOf(1)

        assertArrayEquals(expected.toIntArray(), actual.toIntArray())
    }

    /**
     * 977
     */
    @Test
    fun testSortedSquares() {

        val actual = leetCode.sortedSquares(intArrayOf(-5))
        val expected = intArrayOf(25)

        assertArrayEquals(expected, actual)
    }
}