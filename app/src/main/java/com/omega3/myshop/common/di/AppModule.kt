package com.omega3.myshop.common.di

import com.omega3.myshop.data.datasources.CartDataSource
import com.omega3.myshop.data.datasources.CategoryDataSource
import com.omega3.myshop.data.datasources.PaymentDataSource
import com.omega3.myshop.data.datasources.ProductDataSource
import com.omega3.myshop.data.datasources.impl.mock.CartMocked
import com.omega3.myshop.data.datasources.impl.mock.CategoryMocked
import com.omega3.myshop.data.datasources.impl.mock.PaymentMocked
import com.omega3.myshop.data.datasources.impl.mock.ProductMocked
import com.omega3.myshop.data.repositories.CartRepository
import com.omega3.myshop.data.repositories.CategoryRepository
import com.omega3.myshop.data.repositories.PaymentRepository
import com.omega3.myshop.data.repositories.ProductRepository
import com.omega3.myshop.domain.ports.CartRepositoryPort
import com.omega3.myshop.domain.ports.CategoryRepositoryPort
import com.omega3.myshop.domain.ports.PaymentRepositoryPort
import com.omega3.myshop.domain.ports.ProductRepositoryPort
import com.omega3.myshop.domain.usecases.cart.*
import com.omega3.myshop.domain.usecases.payment.DoPayment
import com.omega3.myshop.domain.usecases.payment.PaymentUseCases
import com.omega3.myshop.domain.usecases.product.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideProductDataSource(): ProductDataSource {
        return ProductMocked()
    }

    @Provides
    @Singleton
    fun provideCategoryDataSource(): CategoryDataSource {
        return CategoryMocked()
    }

    @Provides
    @Singleton
    fun provideCartProductDataSource(): CartDataSource {
        return CartMocked()
    }

    @Provides
    @Singleton
    fun providePaymentDataSource(): PaymentDataSource {
        return PaymentMocked()
    }

    @Provides
    @Singleton
    fun provideProductRepository(
        productDataSource: ProductDataSource,
    ): ProductRepositoryPort {
        return ProductRepository(productDataSource)
    }

    @Provides
    @Singleton
    fun provideCategoryRepository(
        categoryDataSource: CategoryDataSource,
    ): CategoryRepositoryPort {
        return CategoryRepository(categoryDataSource)
    }

    @Provides
    @Singleton
    fun provideCartRepository(
        cartDataSource: CartDataSource,
    ): CartRepositoryPort {
        return CartRepository(cartDataSource)
    }

    @Provides
    @Singleton
    fun providePaymentRepository(
        paymentDataSource: PaymentDataSource,
    ): PaymentRepositoryPort {
        return PaymentRepository(paymentDataSource)
    }

    @Provides
    @Singleton
    fun provideProductUseCases(
        productRepository: ProductRepositoryPort,
        categoryRepository: CategoryRepositoryPort,
    ): ProductUseCases {
        return ProductUseCases(
            getProducts = GetProductList(productRepository),
            getProduct = GetProductDetail(productRepository),
            getCategories = GetCategoryList(categoryRepository)
        )
    }

    @Provides
    @Singleton
    fun provideCartUseCases(
        cartRepository: CartRepositoryPort,
    ): CartUseCases {
        return CartUseCases(
            saveItemCart = SaveItemCart(cartRepository),
            removeItemCart = RemoveItemCart(cartRepository),
            getCartItems = GetCartItems(cartRepository),
            updateCartItems = UpdateCartItems(cartRepository)
        )
    }

    @Provides
    @Singleton
    fun providePaymentUseCases(
        paymentRepository: PaymentRepositoryPort,
    ): PaymentUseCases {
        return PaymentUseCases(
            doPayment = DoPayment(paymentRepository)
        )
    }
}