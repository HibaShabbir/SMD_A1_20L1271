package com.example.a1_q1_20l1271.Q2

// Class Student inheriting from Person
open class Student : Person() {
    var studentID: String = ""
    var major: String = ""
    var year: Int = 0
    var semester: Int = 0
    var college: String = ""
    var grade: Int = 0

    var coursesRegistered :ArrayList<String> = ArrayList()
    private val courseGrades: MutableMap<String, Int> = mutableMapOf()


    override fun register(course: String): String {
        coursesRegistered.add(course)
        return "$name, a student at $college, registered in course: $course"
    }

    fun assignGrade(course: String, grade: Int) {
        if (this.coursesRegistered.contains(course))
            courseGrades[course] = grade
        else
            println("Can not assign grade to a student not enrolled in the course ($course)")
    }

    fun getGrade(course: String): Int? {
        return courseGrades[course]
    }

    override fun attend(courseClass: String): String {
        return "$name attended $courseClass class"
    }

    fun learn(): String {
        return "$name learned something new"
    }
}
