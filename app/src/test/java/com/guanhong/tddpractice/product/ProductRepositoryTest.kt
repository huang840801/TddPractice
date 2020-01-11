package com.guanhong.tddpractice.product

import com.guanhong.tddpractice.argumentCaptor
import com.guanhong.tddpractice.capture
import com.guanhong.tddpractice.product.api.IProductApi
import com.guanhong.tddpractice.product.repository.ProductRepository
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class ProductRepositoryTest {

    private lateinit var repository: ProductRepository

    @Mock
    private lateinit var productAPI: IProductApi

    @Mock
    private lateinit var callback: IProductApi.ProductDataCallback

    @Before
    fun setUp() {

        MockitoAnnotations.initMocks(this)

        repository = ProductRepository(productAPI)
    }

    @Test
    fun getProduct() {

        repository.getProduct(callback)

        val loadProductCallbackCaptor = argumentCaptor<IProductApi.ProductDataCallback>()

        Mockito.verify<IProductApi>(productAPI).getProduct(capture(loadProductCallbackCaptor))
    }
}