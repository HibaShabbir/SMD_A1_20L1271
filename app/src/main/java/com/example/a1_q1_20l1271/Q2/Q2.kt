package com.example.a1_q1_20l1271.Q2

fun main() {
    // Create a PG_Student instance
    val student = PG_Student()
    student.name = "John"
    student.rollNo = "PG123"
    student.specialization = "Computer Science"

    // John submits his thesis
    student.submitThesis()

    // Create a Faculty instance
    val faculty = Faculty()
    faculty.name = "Dr. Smith"
    faculty.section = "A"
    faculty.noOfStudent = 30

    // Dr. Smith teaches Computer Science
    println(faculty.teach("Computer Science"))

    // Now, let's assess the grade for John in Computer Science
    val grade = faculty.assessStudent(student, "Computer Science", 90)
    println("John's grade in Computer Science: $grade")


    // John attends a class
    val johnClassAttendance = student.attend("Computer Science class")
    println(johnClassAttendance)

    // Dr. Smith attends a faculty meeting
    val facultyMeetingAttendance = faculty.attend("Faculty meeting")
    println(facultyMeetingAttendance)


    // Create a Technician instance
    val technician = Technician()
    technician.name = "Alice"
    technician.techType = "Hardware"

    // Alice installs a new computer system
    val installationResult = technician.install("New Computer System")
    println(installationResult)


    // Create another Student instance
    val anotherStudent = Student()
    anotherStudent.name = "Alice"
    anotherStudent.college = "ABC College"

    // Alice registers for a course
    val registrationResult = anotherStudent.register("Physics")
    println(registrationResult)

    // Alice assigns a grade to herself
    anotherStudent.assignGrade("Physics", 95)

    // Alice attends a class
    val aliceClassAttendance = anotherStudent.attend("Physics")
    println(aliceClassAttendance)

    // Create another Faculty instance
    val anotherFaculty = Faculty()
    anotherFaculty.name = "Prof. Johnson"
    anotherFaculty.section = "B"
    anotherFaculty.noOfStudent = 25

    // Prof. Johnson teaches Biology
    println(anotherFaculty.teach("Biology"))

    // Prof. Johnson assesses a grade for Alice
    val aliceGrade = anotherFaculty.assessStudent(anotherStudent, "Biology", 88)
    println("Alice's grade in Biology: $aliceGrade")

    // Prof. Johnson attends a faculty workshop
    val facultyWorkshopAttendance = anotherFaculty.attend("Faculty workshop")
    println(facultyWorkshopAttendance)
}