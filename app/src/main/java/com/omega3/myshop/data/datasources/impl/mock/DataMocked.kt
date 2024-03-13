package com.omega3.myshop.data.datasources.impl.mock

import com.omega3.myshop.domain.models.CartItem
import com.omega3.myshop.domain.models.Category
import com.omega3.myshop.domain.models.Product

class DataMocked {

    companion object Data {

        // Categories data mocked
        val category1 = Category(
            "100",
            "Одежда",
            "Clothes",
            "https://storage.googleapis.com/order_now_store_bucket/category-list/category_1.png"
        )
        val category2 = Category(
            "101",
            "Гаджеты",
            "Technology",
            "https://storage.googleapis.com/order_now_store_bucket/category-list/category_2.png"
        )
        val category3 = Category(
            "102",
            "Мебель",
            "Furniture",
            "https://storage.googleapis.com/order_now_store_bucket/category-list/category_3.png"
        )
        val category4 = Category(
            "103",
            "Аксессуары",
            "Accessories",
            "https://storage.googleapis.com/order_now_store_bucket/category-list/category_4.png"
        )

        // Products data mocked
        val product1 = Product(
            "11",
            "Футболка с воротником",
            "Цена и другие детали могут варьироваться в зависимости от размера и цвета товара.",
            "https://storage.googleapis.com/order_now_store_bucket/product-list/product_1.png",
            1000.0,
            category1
        )
        val product2 = Product(
            "21",
            "iPhone черный",
            "Возможна персональная настройка. Купите сейчас с бесплатной доставкой.",
            "https://storage.googleapis.com/order_now_store_bucket/product-list/product_2.png",
            100000.0,
            category2
        )
        val product3 = Product(
            "31",
            "iWatch SE",
            "Возможна персональная настройка. Купите сейчас с бесплатной доставкой.",
            "https://storage.googleapis.com/order_now_store_bucket/product-list/product_3.png",
            60000.0,
            category4
        )
        val product4 = Product(
            "41",
            "Игровая гарнитура",
            "Возможна персональная настройка. Купите сейчас с бесплатной доставкой.",
            "https://storage.googleapis.com/order_now_store_bucket/product-list/product_4.png",
            5000.0,
            category2
        )
        val product5 = Product(
            "51",
            "Стеганая куртка",
            "Цена и другие детали могут варьироваться в зависимости от размера и цвета товара.",
            "https://storage.googleapis.com/order_now_store_bucket/product-list/product_5.png",
            8000.0,
            category1
        )
        val product6 = Product(
            "61",
            "Твердый рюкзак",
            "Купите сейчас с бесплатной доставкой.",
            "https://storage.googleapis.com/order_now_store_bucket/product-list/product_6.png",
            3000.0,
            category4
        )
        val product7 = Product(
            "71",
            "Спортивные шорты",
            "Цена и другие детали могут варьироваться в зависимости от размера и цвета товара..",
            "https://storage.googleapis.com/order_now_store_bucket/product-list/product_7.png",
            2000.0,
            category1
        )
        val product8 = Product(
            "81",
            "Интерьер Стул",
            "Купите сейчас с бесплатной доставкой.",
            "https://storage.googleapis.com/order_now_store_bucket/product-list/product_8.png",
            5000.0,
            category3
        )
        val product9 = Product(
            "91",
            "AirPods Apple",
            "3 поколение. Возможна персональная настройка. Купите сейчас с бесплатной доставкой.",
            "https://storage.googleapis.com/order_now_store_bucket/product-list/product_9.png",
            100000.0,
            category2
        )
        val product10 = Product(
            "101",
            "Чехол для MacBook Pro",
            "13 HardShell. Купите сейчас с бесплатной доставкой.",
            "https://storage.googleapis.com/order_now_store_bucket/product-list/product_10.png",
            10000.0,
            category4
        )
        val product11 = Product(
            "201",
            "Чехол для MacBook Pro",
            "13 HardShell. Возможна персональная настройка. Купите сейчас с бесплатной доставкой.",
            "https://storage.googleapis.com/order_now_store_bucket/product-list/product_11.png",
            50000.0,
            category2
        )
        val product12 = Product(
            "301",
            "Термостат",
            "Цифровая экология. Возможна персональная настройка. Купите сейчас с бесплатной доставкой.",
            "https://storage.googleapis.com/order_now_store_bucket/product-list/product_12.png",
            1000.0,
            category3
        )
        val product13 = Product(
            "401",
            "Лучшие кроссовки",
            "Цена и другие детали могут варьироваться в зависимости от размера и цвета товара..",
            "https://storage.googleapis.com/order_now_store_bucket/product-list/product_13.png",
            5000.0,
            category1
        )
        val product14 = Product(
            "501",
            "Куртка Мужская",
            "Коричневая щель. Цена и другие детали могут варьироваться в зависимости от размера и цвета товара.",
            "https://storage.googleapis.com/order_now_store_bucket/product-list/product_14.png",
            15000.0,
            category1
        )
        val product15 = Product(
            "601",
            "H&M Рубашка поло",
            "Тонкая посадка. Цена и другие детали могут варьироваться в зависимости от размера и цвета товара..",
            "https://storage.googleapis.com/order_now_store_bucket/product-list/product_15.png",
            3000.0,
            category1
        )
        // CartItem data mocked
        val cartItem1 = CartItem(
            1,
            product1
        )
        val cartItem2 = CartItem(
            3,
            product2
        )
        val cartItem3 = CartItem(
            2,
            product3
        )
    }
}