//Created by canVarli on 12/5/2024

package com.example.fmssbootcampfirstclass.oop

class LateinitExample {
    var name: String? = null

    private lateinit var lateName: String

    fun init() {
        lateName = "Hasan"
    }
}