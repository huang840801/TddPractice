package com.guanhong.tddpractice.product.api

import android.os.Handler
import com.guanhong.tddpractice.product.Product

class ProductApi : IProductApi {

    override fun getProduct(callback: IProductApi.ProductDataCallback) {

        Handler().postDelayed({

            val listOf = listOf(
                Product(1, "product1"),
                Product(2, "product2"),
                Product(3, "product3")
            )

            callback.onGetResult(listOf)
        }, 3000)
    }
}