//Created by canVarli on 12/6/2024

package com.example.fmssbootcampfirstclass.homework.homework2

fun main() {
    println("Çalışılan gün sayısını giriniz: ")
    var day = readln().toInt()
    println("Alacağınız maaş: " + calculateSalary(day))
}

fun calculateSalary(day: Int): Int {
    val hour = day * 8
    val hourlyPayment = 40
    val ekstraHourlyPayment = 80
    var salary = 0

    if (hour > 150) { // 150 saatten fazla çalışıldığında saat başı 80 TL alınır.
        salary = 150 * hourlyPayment + (hour - 150) * ekstraHourlyPayment
    } else if (hour < 150) { // 150 saate kadar çalışıldığında saat başı 40 TL alınır.
        salary = hour * hourlyPayment
    } else { // Hatalı giriş yapıldığında hata mesajı verilir.
        println("Hatalı giriş yaptınız.")
    }
    return salary
}