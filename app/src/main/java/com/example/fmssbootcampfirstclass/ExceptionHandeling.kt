//Created by canVarli on 12/10/2024

package com.example.fmssbootcampfirstclass

fun main() {
    // 2 Tip Exception vardır
    // 1. Compile Time Exception
    // 2. Runtime Exception

    // Compile Time Exception
    val x = 10
    // val x = 0 yazarsak hata alırız.

    // Runtime Exception
    val y = 0
    // println(x/y) // 0'a bölme hatası alırız.

    // Exception Handling
    try {
        println(x / y)
    } catch (e: Exception) {
        println("Bir hata oluştu: ${e.localizedMessage}")
    } finally {
        println("Finally bloğu çalıştı.")
    }
}