package com.guanhong.tddpractice.product

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guanhong.tddpractice.product.api.IProductApi
import com.guanhong.tddpractice.product.repository.IProductRepository

class ProductViewModel(private val repository: IProductRepository) : ViewModel() {

    val productList = MutableLiveData<List<Product>>()

    fun getProduct() {

        repository.getProduct(object : IProductApi.ProductDataCallback {
            override fun onGetResult(productResponse: List<Product>) {

                productList.value = productResponse
            }
        })
    }
}