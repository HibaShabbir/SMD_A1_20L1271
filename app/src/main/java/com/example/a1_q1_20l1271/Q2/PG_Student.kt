package com.example.a1_q1_20l1271.Q2

// Class PG_Student inheriting from Student
class PG_Student : Student() {
    var rollNo: String = ""
    var specialization: String = ""

    fun submitThesis() {
        // Implement thesis submission logic here
        println("$name (Roll No: $rollNo) submitted a thesis in $specialization")
    }
}