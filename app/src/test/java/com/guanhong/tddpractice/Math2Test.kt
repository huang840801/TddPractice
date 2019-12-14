package com.guanhong.tddpractice

import org.junit.Test

import org.junit.Assert.*

class Math2Test {

    @Test
    fun addTwoNum() {

        val math2 = Math2()

        math2.addTwoNum(3, 5)

        val actual = math2.result
        val expect = 8

        assertEquals(expect, actual)
    }
}