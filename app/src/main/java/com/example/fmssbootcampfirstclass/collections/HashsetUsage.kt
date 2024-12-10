//Created by canVarli on 12/10/2024

package com.example.fmssbootcampfirstclass.collections

fun main() {
    val fruit = hashSetOf("apple", "banana", "cherry", "apple")
    println(fruit)

    // Aynı elemanı eklemeye çalıştığımızda hata vermez,
    // sadece eklemeye çalıştığımız elemanı eklemeyecektir.
    fruit.add("apple")
    println(fruit)

    // Elemanı yazdırmak için index numarasını kullanamayız.
    println(fruit.elementAt(1))

    // Elemanı silmek için remove fonksiyonunu kullanabiliriz.
    fruit.remove("apple")
    println(fruit)

    // Eleman sayısını yazdırmak için size fonksiyonunu kullanabiliriz.
    println(fruit.size)

    // Elemanların hepsini silmek için clear fonksiyonunu kullanabiliriz.
    fruit.clear()
}