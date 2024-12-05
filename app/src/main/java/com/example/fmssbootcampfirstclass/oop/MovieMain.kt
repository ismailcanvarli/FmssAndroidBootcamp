//Created by canVarli on 12/5/2024

package com.example.fmssbootcampfirstclass.oop

fun main() {
    // Nesne oluşturma
    val movie1 = Movie(1, "Matrix", 100.0)

    // Değer okuma
    println("------------------")
    println("Film Adı: ${movie1.id}")
    println("Film Adı: ${movie1.name}")
    println("Film Fiyatı: ${movie1.price} TL")

    // Değer atama
    movie1.price = 120.0
    movie1.movieInfo()

    val movie2 = Movie(2, "Inception", 150.0)
    movie2.movieInfo()
}