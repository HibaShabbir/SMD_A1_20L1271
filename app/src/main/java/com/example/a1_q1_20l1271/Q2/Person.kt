package com.example.a1_q1_20l1271.Q2

// Base class Person
abstract class Person {
    var aadharID: Int = 0
    var name: String = ""
    var address: String = ""
    var phone: Int = 0
    var profession: String = ""

    open fun register(UID: String): String {
        return "$name registered with UID: $UID"
    }

    fun perform(duty: String): String {
        return "$name performed duty: $duty"
    }

    fun include(service: String): String {
        return "$name included service: $service"
    }

    fun like(item: String): String {
        return "$name liked item: $item"
    }

    abstract fun attend(dutyOrClass: String):String
}
