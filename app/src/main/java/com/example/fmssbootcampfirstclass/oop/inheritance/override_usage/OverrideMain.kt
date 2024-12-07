//Created by canVarli on 12/7/2024

package com.example.fmssbootcampfirstclass.oop.inheritance.override_usage

fun main() {
    val mammalian = Mammalian()
    val dog = Dog()
    val cat = Cat()

    mammalian.makeSound() // Hayvandan kalıtım aldı
    dog.makeSound() // Memeliden kalıtım aldı
    cat.makeSound() // Memeliden kalıtım aldı
}