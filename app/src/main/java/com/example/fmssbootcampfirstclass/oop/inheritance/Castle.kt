//Created by canVarli on 12/7/2024

package com.example.fmssbootcampfirstclass.oop.inheritance

class Castle(var tower: Int, windowCount: Int) : Home(windowCount) {
    fun castleInfo() {
        println("Castle has $tower towers and $windows windows")
    }
}