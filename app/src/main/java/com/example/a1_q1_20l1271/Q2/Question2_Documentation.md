# Kotlin Class Implementation (Class Hierarchy)

This file provides an overview of the Kotlin classes implemented. The code demonstrates the hierarchy of classes, inheritance, and usage of various functions.


 ## **Person** (Abstract Base Class)
  - Contains common properties for all individuals.
  - Provides methods for registration, performing duties, including services, and liking items.
  - Includes an abstract method `attend`.

- The `Person` class serves as the abstract base class for all individuals in our system.
- It includes common properties such as `aadharID`, `name`, `address`, `phone`, and `profession`.
- The `open` function `register(UID: String)` is provided to allow individuals to register with a unique identifier (UID).
- Other functions like `perform`, `include`, and `like` offer generic functionalities.
- The `abstract` function `attend(dutyOrClass: String)` is left for subclasses to implement, as it can vary for students, staff, and faculty.


  ## **Student** (Inheriting from Person Polymorphic Class)
  - Inherits properties and methods from the `Person` class.
  - Adds properties specific to students such as `studentID`, `major`, `year`, `semester`, `college`, and `grade`.
  - Implements methods for registering in courses, assigning grades, and attending classes.
    
- The `Student` class inherits properties and methods from the `Person` class.
- Additional properties specific to students are introduced, including `studentID`, `major`, `year`, `semester`, `college`, and `grade`.
- The `register` function is overridden to include the registration of courses.
- It includes functions like `assignGrade` to assign grades to courses and `getGrade` to retrieve a student's grade for a specific course.
- The `attend` function is implemented to indicate class attendance for students.
- An extra function `learn` is included to demonstrate a student-specific action.


  ## **PG_Student** (Inheriting from Student Concrete Class)
  - Extends the `Student` class to include `rollNo` and `specialization`.
  - Introduces a method `submitThesis` to demonstrate additional functionality for postgraduate students.
 
- The `PG_Student` class extends the `Student` class to include additional properties like `rollNo` and `specialization`.
- It introduces a new function, `submitThesis`, to represent a unique action for postgraduate students.


  ## **Staff** (Inheriting from Person Polymorphic Class)
  - Inherits properties and methods from the `Person` class.
  - Adds properties specific to staff members such as `empID`, `empRole`, `empDepartment`, `empSalary`, and `empExperience`.
  - Provides methods for attending duties, receiving promotions, and obtaining salary information.
    
- The `Staff` class inherits properties and methods from the `Person` class.
- It adds staff-specific properties such as `empID`, `empRole`, `empDepartment`, `empSalary`, and `empExperience`.
- It includes functions like `getPromotion` to handle promotions and `getSalary` to obtain salary information.

  ## **Faculty** (Inheriting from Staff Concrete Class)
  - Extends the `Staff` class with `specialization`, `section`, `noOfStudent`, and `qualification` properties.
  - Introduces methods for teaching courses and assessing student grades based on specified grading criteria.

- The `Faculty` class extends the `Staff` class with additional properties like `specialization`, `section`, `noOfStudent`, and `qualification`.
- It introduces functions for faculty-specific actions:
  - `teach` allows faculty to indicate the courses they teach and keeps track of the subjects taught.
  - `assessStudent` assesses a student's grade for a specific course, considering the grading criteria.
- The grading criteria is defined within the `assessStudent` function.

  ## **Technician** (Inheriting from Staff Concrete Class)
  - Extends the `Staff` class by introducing `techType`.
  - Implements methods for maintaining labs and installing systems.
    
- The `Technician` class extends the `Staff` class by introducing the `techType` property.
- It implements functions such as `maintain` to maintain lab equipment and `install` to install systems.


## Usage Examples

The `main` function in the code provides examples of how to create instances of these classes and demonstrate their functionality. Here are some key examples:

- Creating and using a `PG_Student` instance to submit a thesis.
- Creating and using a `Faculty` instance to teach a course and assess a student's grade.
- Creating and using a `Technician` instance to install a computer system.
- Creating and using a `Student` instance to register for a course, assign a grade, and attend a class.
- Creating and using another `Faculty` instance to teach another course and assess a grade.

The code snippets in the `main` function showcase various interactions and operations performed with these classes.

