package com.example.kotlinbasics

fun main() {
    makeCoffee(sugarCount = 1, name = "Ammy")
    makeCoffee(sugarCount = 3, name = "Jimmy")
    makeCoffee(sugarCount = 0, name = "Kali")
    makeCoffee(sugarCount = 20, name = "Radon")
}

fun makeCoffee(sugarCount: Int, name: String) {
    if (sugarCount == 1) {
        println("Coffee with $sugarCount spoon of sugar is ready $name")
    }else if (sugarCount == 0) {
        println("Coffee with no sugar is ready $name")
    } else {
        println("Coffee with $sugarCount spoons of sugar is ready $name")
    }
}
