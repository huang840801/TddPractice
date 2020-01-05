package com.guanhong.tddpractice.product.repository

import com.guanhong.tddpractice.product.api.IProductApi

interface IProductRepository {

    fun getProduct(callback: IProductApi.ProductDataCallback)
}