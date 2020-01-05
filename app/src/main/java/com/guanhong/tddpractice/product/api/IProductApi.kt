package com.guanhong.tddpractice.product.api

import com.guanhong.tddpractice.product.Product

interface IProductApi {

    interface ProductDataCallback {
        fun onGetResult(productResponse: List<Product>)
    }

    fun getProduct(callback: ProductDataCallback)
}