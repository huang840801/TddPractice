package com.guanhong.tddpractice.product.repository

import com.guanhong.tddpractice.product.api.IProductApi

class ProductRepository(private val productAPI: IProductApi) : IProductRepository {

    override fun getProduct(callback: IProductApi.ProductDataCallback) {

        productAPI.getProduct(callback)
    }
}