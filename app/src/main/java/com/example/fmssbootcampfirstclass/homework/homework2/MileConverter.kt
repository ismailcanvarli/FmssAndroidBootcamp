//Created by canVarli on 12/8/2024

package com.example.fmssbootcampfirstclass.homework.homework2

fun main() {
    println("Mesafe birimini giriniz (km/mil): ")
    val distanceUnit = readln().toDouble()
    println("Mil'e çevirdiğimizde " + convertKmToMile(distanceUnit) + " mil yapar.")

}

fun convertKmToMile(km: Double): Double {
    return km * 0.621
}