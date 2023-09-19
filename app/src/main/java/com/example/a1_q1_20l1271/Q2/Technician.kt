package com.example.a1_q1_20l1271.Q2

// Class Technician inheriting from Staff
class Technician : Staff() {
    var techType: String = ""

    fun maintain(lab: String): String {
        return "$name (Technician) maintained $lab"
    }

    fun install(system: String): String {
        return "$name (Technician) installed $system"
    }
}