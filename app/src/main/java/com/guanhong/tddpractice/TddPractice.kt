package com.guanhong.tddpractice

import android.app.Application
import com.guanhong.tddpractice.product.ProductViewModel
import com.guanhong.tddpractice.product.api.ProductApi
import com.guanhong.tddpractice.product.repository.ProductRepository
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

class TddPractice : Application() {

    override fun onCreate() {
        super.onCreate()
//MVP
//        startKoin {
//
//            androidLogger()
//            androidContext(this@TddPractice)
//            modules(koinModule)
//        }

        //MVVM
        startKoin {

            androidLogger()
            androidContext(this@TddPractice)
            modules(listOf(appModule))
        }
    }
}

// For MVP
val koinModule = module {

    factory {

        ProductViewModel(ProductRepository(ProductApi()))
    }
}
//For MVVM
val appModule = module {

    viewModel {
        val productAPI = ProductApi()
        val productRepository = ProductRepository(productAPI)

        ProductViewModel(productRepository)
    }
}