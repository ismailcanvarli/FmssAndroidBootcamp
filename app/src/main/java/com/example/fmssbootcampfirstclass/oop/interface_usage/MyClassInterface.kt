//Created by canVarli on 12/7/2024

package com.example.fmssbootcampfirstclass.oop.interface_usage

class MyClassInterface : MyInterface {
    override val myVariable: String
        get() = "My Variable"

    override fun myFunction() {
        println("My Function")
    }
}