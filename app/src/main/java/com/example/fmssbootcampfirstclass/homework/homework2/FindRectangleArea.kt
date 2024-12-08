//Created by canVarli on 12/8/2024

package com.example.fmssbootcampfirstclass.homework.homework2

fun main() {
    println("Uzunluğu giriniz:")
    val width = readln().toInt()
    println("Yüksekliği giriniz:")
    val height = readln().toInt()
    println("Dikdörtgenin alanı: " + findRectangleArea(width, height))
}

fun findRectangleArea(width: Int, height: Int): Int {
    return width * height
}