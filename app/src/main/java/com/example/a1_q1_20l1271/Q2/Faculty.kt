package com.example.a1_q1_20l1271.Q2

// Class Faculty inheriting from Staff
class Faculty : Staff() {
    var specialization: String = ""
    var section: String = ""
    var noOfStudent: Int = 0
    var qualification: String = ""

    val subjectsTaught: ArrayList<String> = ArrayList()

    fun teach(course: String): String {
        subjectsTaught.add(course)
        return "$name (Faculty) teaches $course"
    }

    fun assessStudent(student: Student, course: String, grade: Int) : String{
        if (subjectsTaught.contains(course)) {
            student.assignGrade(course, grade)
            println("$name (Faculty) assigned a grade of $grade to ${student.name} for the course $course")
        } else {
            println("$name (Faculty) cannot assign a grade for $course to ${student.name}")
        }

        // Define your grading criteria based on marks
        return when (grade) {
            in 90..100 -> "A"
            in 80 until 90 -> "B"
            in 70 until 80 -> "C"
            in 60 until 70 -> "D"
            else -> "F"
        }
    }

}
