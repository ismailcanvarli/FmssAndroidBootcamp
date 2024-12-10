//Created by canVarli on 12/10/2024

package com.example.fmssbootcampfirstclass.collections

fun main() {
    val product1 = Product(1, "Laptop", 5000.0)
    val product2 = Product(2, "Mouse", 100.0)
    val product3 = Product(3, "Keyboard", 200.0)

    val products = ArrayList<Product>()

    // Add - Ekleme
    products.add(product1)
    products.add(product2)
    products.add(product3)

    for (product in products) {
        println(
            "${product.id} " + "Product Name: ${product.name} " + "Product Price: ${product.price}"
        )
    }

    println("---------------------------------------")

    // Sort - Sıralama
    val sortedProducts = products.sortedBy { it.price } // Ascending

    for (product in sortedProducts) {
        println(
            "${product.id} " + "Product Name: ${product.name} " + "Product Price: ${product.price}"
        )
    }

    println("---------------------------------------")

    val sortedProductsDescending = products.sortedByDescending { it.price } // Descending

    for (product in sortedProductsDescending) {
        println(
            "${product.id} " + "Product Name: ${product.name} " + "Product Price: ${product.price}"
        )
    }

    println("---------------------------------------")
    // Filter - Filtreleme
    val filteredProducts = products.filter { it.price > 100.0 }

    for (product in filteredProducts) {
        println(
            "${product.id} " + "Product Name: ${product.name} " + "Product Price: ${product.price}"
        )
    }

}