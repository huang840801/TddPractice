package com.guanhong.tddpractice.product

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.guanhong.tddpractice.R
import com.guanhong.tddpractice.product.api.ProductApi
import com.guanhong.tddpractice.product.repository.ProductRepository

class ProductActivity : AppCompatActivity() {

    private lateinit var viewModel: ProductViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val factory = ViewModelFactory(ProductRepository(ProductApi()))

        viewModel = ViewModelProviders.of(this,factory).get(ProductViewModel::class.java)

        viewModel.productList.observe(this,
            Observer<List<Product>> { productList -> Log.d("Huang"," productList "+productList) })
        viewModel.getProduct()
    }
}