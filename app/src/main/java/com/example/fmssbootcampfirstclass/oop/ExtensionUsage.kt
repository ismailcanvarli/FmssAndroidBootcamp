//Created by canVarli on 12/5/2024

package com.example.fmssbootcampfirstclass.oop

fun main() {
    val result = 5.carpma(3)
    println(result)
}

// Extension Functions (Genişletilmiş Fonksiyonlar)
fun Int.carpma(b: Int): Int {
    return this * b
}