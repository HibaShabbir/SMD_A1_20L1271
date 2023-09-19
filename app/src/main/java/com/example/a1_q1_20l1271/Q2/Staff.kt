package com.example.a1_q1_20l1271.Q2

// Class Staff inheriting from Person
open class Staff : Person() {
    var empID: String = ""
    var empRole: String = ""
    var empDepartment: String = ""
    var empSalary: Float = 0.0f
    var empExperience: Int = 0

    fun attend(duty: String): String {
        return "$name attended duty: $duty"
    }

    fun getPromotion(): String {
        return "$name received a promotion to $empRole"
    }

    fun getSalary(): Float {
        return empSalary
    }
}