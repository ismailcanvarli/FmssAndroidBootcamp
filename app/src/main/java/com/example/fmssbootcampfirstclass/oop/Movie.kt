//Created by canVarli on 12/5/2024

package com.example.fmssbootcampfirstclass.oop

class Movie(var id: Int, var name: String, var price: Double) {

    init {
        println("Movie class initialized")
    }

    fun movieInfo() {
        println("-----------------------")
        println("Film ID     : $id")
        println("Film Adı    : $name")
        println("Film Fiyatı : $price TL")
    }
}