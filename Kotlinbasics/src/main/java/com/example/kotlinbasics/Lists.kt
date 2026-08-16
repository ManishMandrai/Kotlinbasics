package com.example.kotlinbasics

fun main(){
    var shoppingList = mutableListOf("Ram", "Graphics Card RTX 4090", "MotherBoard", "SSD", "Processor")

    //adding items to list
    shoppingList.add("GPU")
    println(shoppingList)

    //removing item form list
    shoppingList.remove("Ram")
    println(shoppingList)

    //access to the index
    println(shoppingList[2])

    //modifying item in list
    shoppingList[0] = "Graphics Card RTX 3060"
    println(shoppingList)
}