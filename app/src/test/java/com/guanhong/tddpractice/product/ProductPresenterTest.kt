package com.guanhong.tddpractice.product

import com.guanhong.tddpractice.argumentCaptor
import com.guanhong.tddpractice.capture
import com.guanhong.tddpractice.product.api.IProductApi
import com.guanhong.tddpractice.product.repository.IProductRepository
import com.guanhong.tddpractice.product.repository.ProductRepository
import org.junit.Before
import org.junit.Test

import org.mockito.ArgumentCaptor
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class ProductPresenterTest {

    private lateinit var presenter: ProductPresenter

    @Mock
    private lateinit var view: ProductContract.View

    @Mock
    private lateinit var repository: ProductRepository

    private val productList = mutableListOf<Product>()

    @Before
    fun setUp() {

        MockitoAnnotations.initMocks(this)

        presenter = ProductPresenter(view, repository)

        productList.add(Product(111, "name1"))
        productList.add(Product(222, "name2"))
    }

    @Test
    fun getProduct() {

        presenter.getProduct()

        val loadProductCallbackCaptor = argumentCaptor<IProductApi.ProductDataCallback>()

        Mockito.verify<IProductRepository>(repository).getProduct(capture(loadProductCallbackCaptor))

        loadProductCallbackCaptor.value.onGetResult(productList)

        Mockito.verify(view).onBindProduct(productList)
    }
}