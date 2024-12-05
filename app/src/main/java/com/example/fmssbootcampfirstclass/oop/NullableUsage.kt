//Created by canVarli on 12/5/2024

package com.example.fmssbootcampfirstclass.oop

fun main() {
    // Nullable - Null Safety (Null Güvenliği)
    var name: String?
    name = "Hasan"

    println("Name: ${name?.uppercase()}")

    println("Name: ${name!!.uppercase()}")

    if (name != null) {
        println("Name: ${name.uppercase()}")
    } else {
        println("Name is null")
    }

    name.let { println("Name: ${it.uppercase()}") }
}