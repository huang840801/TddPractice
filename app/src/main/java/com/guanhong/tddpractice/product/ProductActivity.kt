package com.guanhong.tddpractice.product

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.guanhong.tddpractice.R
import org.koin.android.viewmodel.ext.android.viewModel

class ProductActivity : AppCompatActivity() {

    private val viewModel: ProductViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        viewModel.productList.observe(this,
            Observer<List<Product>> { productList ->
                Log.d(
                    "Huang",
                    " productList " + productList
                )
            })
        viewModel.getProduct()
    }
}