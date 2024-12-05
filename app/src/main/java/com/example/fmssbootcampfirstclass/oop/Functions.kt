//Created by canVarli on 12/5/2024

package com.example.fmssbootcampfirstclass.oop

class Functions {
    // IOS : Protocol(interface) tabanlı bir dil
    // Android : fonksiyon(metod) tabanlı bir dil

    // void: Geri dönüş tipi olmayan fonksiyon
    fun greating() {
        val name = "Hello hasan"
        println(name)
    }

    // return: Geri dönüş tipi olan fonksiyon
    fun greating1(): String {
        val name = "Hello hasan"
        return name
    }

    // parametre: Fonksiyonun içine veri göndermek için kullanılır
    fun greating2(name: String) {
        val name1 = "Hello $name"
        println(name1)
    }

    // overloading: Aynı isimde birden fazla fonksiyon tanımlanabilir
    fun sum(a: Int, b: Int) {
        println(a + b)
    }

    fun sum(a: Int, b: Int, c: Int) {
        println(a + b + c)
    }
}