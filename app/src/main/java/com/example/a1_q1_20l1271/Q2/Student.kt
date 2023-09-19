package com.example.a1_q1_20l1271.Q2

// Class Student inheriting from Person
open class Student : Person() {
    var studentID: String = ""
    var major: String = ""
    var year: Int = 0
    var semester: Int = 0
    var college: String = ""
    var grade: Int = 0

    override fun register(UID: String): String {
        return "$name, a student at $college, registered with UID: $UID"
    }

    fun getGrade(course: String): Int {
        // Implement grade retrieval logic here
        return grade
    }

    fun attend(courseClass: String): String {
        return "$name attended $courseClass class"
    }

    fun learn(): String {
        return "$name learned something new"
    }
}