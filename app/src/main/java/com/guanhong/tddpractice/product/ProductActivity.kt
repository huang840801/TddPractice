package com.guanhong.tddpractice.product

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.guanhong.tddpractice.R
import com.guanhong.tddpractice.product.api.ProductApi
import com.guanhong.tddpractice.product.repository.ProductRepository

class ProductActivity : AppCompatActivity(), ProductContract.View {

    private lateinit var presenter: ProductPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        presenter = ProductPresenter(this, ProductRepository(ProductApi()))

        presenter.getProduct()
    }

    override fun onBindProduct(productList: List<Product>) {

    }
}