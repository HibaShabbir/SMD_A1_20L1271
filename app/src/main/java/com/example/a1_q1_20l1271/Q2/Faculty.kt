package com.example.a1_q1_20l1271.Q2

// Class Faculty inheriting from Staff
class Faculty : Staff() {
    var specialization: String = ""
    var section: String = ""
    var noOfStudent: Int = 0
    var qualification: String = ""

    fun teach(course: String): String {
        return "$name (Faculty) taught $course to $noOfStudent students"
    }

    fun assess(studentGrade: String): String {
        return "$name (Faculty) assessed student's grade: $studentGrade"
    }
}
