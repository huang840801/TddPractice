package com.guanhong.tddpractice.product

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.guanhong.tddpractice.argumentCaptor
import com.guanhong.tddpractice.capture
import com.guanhong.tddpractice.product.api.IProductApi
import com.guanhong.tddpractice.product.repository.IProductRepository
import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class ProductViewModelTest {

    @get:Rule
    var instantExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var viewModel: ProductViewModel

    @Mock
    private lateinit var repository: IProductRepository

    private val productList = mutableListOf<Product>()

    @Before
    fun setUp() {

        MockitoAnnotations.initMocks(this)

        viewModel = ProductViewModel(repository)

        productList.add(Product(111, "name1"))
        productList.add(Product(222, "name2"))
    }

    @Test
    fun getProduct() {

        viewModel.getProduct()

        val loadProductCallbackCaptor = argumentCaptor<IProductApi.ProductDataCallback>()

        //驗證是否有呼叫IProductRepository.getProduct
        Mockito.verify<IProductRepository>(repository)
            .getProduct(capture(loadProductCallbackCaptor))

        //將callback攔截下載並指定productList的值。
        loadProductCallbackCaptor.value.onGetResult(productList)

        assertEquals(viewModel.productList.value?.get(0), productList[0])
    }
}