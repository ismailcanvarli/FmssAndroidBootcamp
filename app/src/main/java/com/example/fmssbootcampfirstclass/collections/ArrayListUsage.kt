//Created by canVarli on 12/10/2024

package com.example.fmssbootcampfirstclass.collections

fun main() {
    // ArrayList
    // Belirli bir boyutu olmayan ve elemanları sıralı bir şekilde tutan bir koleksiyon tipidir.

    val fruit = ArrayList<String>()

    // Add - Ekleme
    fruit.add("Apple")
    fruit.add("Banana")
    fruit.add("Orange")
    println(fruit)

    // Update - Güncelleme
    fruit[1] = "Pineapple"
    println(fruit)

    // Insert - Araya Ekleme
    fruit.add(1, "Grape")
    println(fruit)

    // Remove - Silme
    fruit.remove("Apple")
    println(fruit)

    // RemoveAt - İndexe Göre Silme
    fruit.removeAt(1)
    println(fruit)

    // Clear - Temizleme
    fruit.clear()
    println(fruit)

    // isEmpty - Boş mu kontrolü
    println(fruit.isEmpty())

    fruit.add("Apple")
    fruit.add("Banana")
    fruit.add("Orange")

    // Size - Eleman sayısı
    println(fruit.size)

    // Contains - Elemanın varlığını kontrol etme
    fruit.contains("Apple")

    // Reverse - Ters çevirme
    fruit.reverse()
    println(fruit)

    // Sort - Sıralama
    fruit.sort()
    println(fruit)

    // For Each
    for (item in fruit) {
        println("Sonuç: $item")
    }
}