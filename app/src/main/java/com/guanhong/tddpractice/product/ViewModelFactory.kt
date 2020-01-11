package com.guanhong.tddpractice.product

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.guanhong.tddpractice.product.repository.ProductRepository

class ViewModelFactory constructor(private val repository: ProductRepository) :
    ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T =
        with(modelClass) {

            when {
                isAssignableFrom(ProductViewModel::class.java) -> ProductViewModel(repository)

                else ->
                    throw IllegalArgumentException(
                        "Unknown ViewModel class: ${modelClass.name}"
                    )
            }

        } as T
}