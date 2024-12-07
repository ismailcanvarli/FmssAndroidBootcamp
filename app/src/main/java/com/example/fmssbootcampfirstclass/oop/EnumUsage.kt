//Created by canVarli on 12/7/2024

package com.example.fmssbootcampfirstclass.oop

fun main() {
    println(bill(10, Canned.LITTLE))
    println(bill(10, Canned.MEDIUM))
    println(bill(10, Canned.BIG))
}

fun bill(unit: Int, canned: Canned): Int {
    return unit * when (canned) {
        Canned.LITTLE -> 1
        Canned.MEDIUM -> 2
        Canned.BIG -> 3
    }
}