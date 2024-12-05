//Created by canVarli on 12/5/2024

package com.example.fmssbootcampfirstclass.oop

fun main() {
    val functions = Functions()
    functions.greating()

    val greatingByName = functions.greating1()
    println(greatingByName)

    functions.greating2("Hasan")

    functions.sum(1, 2)
    functions.sum(1, 2, 3)
}