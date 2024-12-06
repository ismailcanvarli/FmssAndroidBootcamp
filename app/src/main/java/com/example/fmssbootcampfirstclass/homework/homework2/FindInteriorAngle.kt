//Created by canVarli on 12/6/2024

package com.example.fmssbootcampfirstclass.homework.homework2

fun main() {
    println("Kenar sayısını giriniz: ")
    var numberOfSides = readln().toInt()
    println(findInteriorAngle(numberOfSides))
}

fun findInteriorAngle(numberOfSides : Int ) : Int{
    var ınteriorAngle = ((numberOfSides - 2) * 180) / numberOfSides
    return ınteriorAngle
}