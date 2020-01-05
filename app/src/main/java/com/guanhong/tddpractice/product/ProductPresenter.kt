package com.guanhong.tddpractice.product

import com.guanhong.tddpractice.product.api.IProductApi
import com.guanhong.tddpractice.product.repository.IProductRepository

class ProductPresenter(
    private val view: ProductContract.View,
    private val repository: IProductRepository
) : ProductContract.Presenter {

    override fun getProduct() {

        repository.getProduct(object : IProductApi.ProductDataCallback {
            override fun onGetResult(productResponse: List<Product>) {

                view.onBindProduct(productResponse)
            }
        })
    }
}