package com.guanhong.tddpractice

import org.junit.Test
import org.mockito.Mockito.*

class OrderTest {

    @Test
    fun testInsertOrder() {

        val order = Order()

        val mockEmailUtil = mock(IEmailUtil::class.java)

        val testEmail = "test@gmail.com"

        order.insertOrder(testEmail, 3, 600, mockEmailUtil)

        verify(mockEmailUtil).sendCustomer(testEmail)
    }
}