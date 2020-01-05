package com.guanhong.tddpractice.product

interface ProductContract {

    interface View{

        fun onBindProduct(productList: List<Product>)
    }

    interface Presenter{

        fun getProduct()
    }
}