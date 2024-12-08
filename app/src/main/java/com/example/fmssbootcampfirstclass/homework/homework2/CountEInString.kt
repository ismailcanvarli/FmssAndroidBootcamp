//Created by canVarli on 12/8/2024

package com.example.fmssbootcampfirstclass.homework.homework2

fun main() {
    println("Bir kelime giriniz:")
    val word = readln()
    println("Kelimenin içinde geçen 'e' harfi sayısı: " + countEInString(word))
}

fun countEInString(input: String): Int {
    return input.count { it == 'e' }
}

