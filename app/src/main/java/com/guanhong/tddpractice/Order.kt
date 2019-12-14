package com.guanhong.tddpractice

class Order {

    fun insertOrder(email: String, quantity: Int, price: Int, emailUtil: IEmailUtil) {

        val weather = Weather()
        val umbrella = Umbrella()

        umbrella.totalPrice(weather, quantity, price)

        //新增訂單...(省略)

        //寄送Email給使用者
        emailUtil.sendCustomer(email)
    }
}

class EmailUtil : IEmailUtil {

    override fun sendCustomer(email: String) {

    }
}

class StubEmailUtil : IEmailUtil {

    var receiveEmail: String? = null

    override fun sendCustomer(email: String) {

        receiveEmail = email
    }
}

interface IEmailUtil {
    fun sendCustomer(email: String)
}