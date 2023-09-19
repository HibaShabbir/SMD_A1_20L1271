package com.example.a1_q1_20l1271.Q1

// Define the Cricketer interface with properties and a print method.
interface Cricketer {
    var name: String
    var age: Int
    var nationality: String

    fun print() {
        println("| Cricketer: $name")
        println("| Age: $age")
        println("| Nationality: $nationality")

    }
}