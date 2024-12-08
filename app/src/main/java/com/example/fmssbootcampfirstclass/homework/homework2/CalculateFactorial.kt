//Created by canVarli on 12/8/2024

package com.example.fmssbootcampfirstclass.homework.homework2

fun main() {
    println("Faktoriyeli hesaplanacak sayıyı giriniz: ")
    val number = readln().toInt()
    println("Sonuç: ${calculateFactorial(number)}")
}

fun calculateFactorial(number: Int): Int {
    var result = 1
    for (i in 1..number) {
        result *= i
    }
    return result
}