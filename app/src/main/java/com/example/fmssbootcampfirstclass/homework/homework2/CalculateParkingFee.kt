//Created by canVarli on 12/7/2024

package com.example.fmssbootcampfirstclass.homework.homework2

fun main() {
    println("Kaç saat park edildi?")
    val hours = readln().toIntOrNull() ?: 0
    val fee = calculateParkingFee(hours)
    println("Ödemeniz gereken tutar: $fee")
}

fun calculateParkingFee(hours: Int): Int {
    if (hours > 1) {
        return 50 + (hours - 1) * 10
    } else if (hours <= 1) {
        return 50
    } else {
        return 0
    }
}