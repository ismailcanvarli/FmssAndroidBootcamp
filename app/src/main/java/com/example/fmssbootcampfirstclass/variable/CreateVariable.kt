//Created by canVarli on 12/3/2024

package com.example.fmssbootcampfirstclass.variable

fun main() {
    println("Merhaba, Dünya!")

    var studentName = "Hasan"
    var studentAge = 25
    var studentHeight = 1.75
    var studentFirstLetter = 'H'
    var studentAttendance = true

    println("----- Öğrenci -----")
    println("Adı: $studentName")
    println("Yaşı: ${studentAge + 1}")
    println("Boyu: $studentHeight")
    println("İlk Harfi: $studentFirstLetter")
    println("Devamsızlık Durumu: $studentAttendance")

    // Constants - Sabitler (Değiştirilemez)
    var number = 10
    println(number)
    number = 20
    println(number)

    val number1 = 30
    println(number1)

    // Type Casting - Tür Dönüşümü
    // Sayısaldan Sayısala
    val d = 10.56
    val value1 = d.toInt()
    println(value1)

    //Sayısaldan metine
    val value2 = d.toString()
    println(value2)

    //Metinden Sayısala
    val stringNumber = "100"
    val value3 = stringNumber.toInt()
    println(value3)

    if (value3 != null) {
        println(value3)
    } else {
        println("Değer null")
    }

    // Null Safety - Null Güvenliği
    value3?.let {
        println(it)
    } ?: println("Değer null")
}