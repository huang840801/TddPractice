package com.guanhong.tddpractice

import org.junit.Assert.*
import org.junit.Test

class OrderTest {

    @Test
    fun testInsertOrder() {

        val order = Order()
        val stubEmailUtil = StubEmailUtil()

        val testEmail = "test@gmail.com"

        order.insertOrder(testEmail, 3, 600, stubEmailUtil)

        assertEquals(testEmail, stubEmailUtil.receiveEmail)
    }
}