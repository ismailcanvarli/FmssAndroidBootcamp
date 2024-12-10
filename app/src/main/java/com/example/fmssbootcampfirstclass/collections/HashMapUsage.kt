//Created by canVarli on 12/10/2024

package com.example.fmssbootcampfirstclass.collections

fun main() {
    // web tabanlı dillerde json'a eşdeğerdir.
    // key-value çiftlerini tutar.

    val city = hashMapOf<Int, String>()
    city.put(6, "Ankara")
    city.put(34, "İstanbul")
    city.put(35, "İzmir")
    city.put(7, "Antalya")

    println(city)
    // key'e göre value'yu getirir.
    println(city.get(6))

    // Boyutunu verir.
    println(city.size)

    // Silme işlemi yapar.
    city.remove(6)
    println(city)

    // Clear metodu ile tüm elemanları siler.
    city.clear()
}