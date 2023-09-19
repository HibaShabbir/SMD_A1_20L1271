package com.example.a1_q1_20l1271.Q2

fun main() {
    val student = PG_Student()
    student.name = "John"
    student.rollNo = "PG123"
    student.specialization = "Computer Science"
    student.submitThesis()

    val faculty = Faculty()
    faculty.name = "Dr. Smith"
    faculty.section = "A"
    faculty.noOfStudent = 30
    println(faculty.teach("Computer Science"))
    println(faculty.assess("A"))

    val technician = Technician()
    technician.name = "Alice"
    technician.techType = "Hardware"
    println(technician.install("New Computer System"))
}