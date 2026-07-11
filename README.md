Student Information System
Project Overview

The Student Information System is a Java console-based application developed to manage student records. This project demonstrates the fundamentals of Java programming, including Object-Oriented Programming (OOP), classes, objects, methods, encapsulation, ArrayList, Scanner, loops, and conditional statements.

The application provides a simple menu-driven interface that allows users to add, view, search, and update student records.

Objectives

Learn Java programming fundamentals.
Understand Object-Oriented Programming concepts.
Implement Encapsulation using Getter and Setter methods.
Store multiple student records using ArrayList.
Accept user input using the Scanner class.
Develop a menu-driven console application.
Implement search and update operations.
Improve problem-solving and debugging skills.

Features

Add New Student
View All Students
Search Student by Student ID or Name
Update Student Details
Age Validation
Formatted Table Output
Menu-Driven Interface
Dynamic Data Storage using ArrayList
Technologies Used
Java
JDK 17 or later
ArrayList
Scanner
Object-Oriented Programming (OOP)


Installation
Step 1

Install Java JDK (Version 17 or above).

Step 2

Download or clone this repository.

git clone https://github.com/your-username/StudentInformationSystem.git
Step 3

Open the project in Visual Studio Code, IntelliJ IDEA, or Eclipse.

Step 4

Compile the project.

javac StudentInformationSystem.java
Step 5

Run the application.

java StudentInformationSystem

Menu
=== STUDENT INFORMATION SYSTEM ===

1. Add New Student
2. View All Students
3. Search Student
4. Update Student
5. Exit
Sample Output

=== ADD NEW STUDENT ===

Enter Student ID : S001

Enter Name : Sachin

Enter Age : 20

Enter Grade : 85.5

Enter Contact : 9876543210



Technical Concepts Used
Classes and Objects
Constructors
Encapsulation
Getter and Setter Methods
ArrayList Collection
Scanner Class
Loops
Switch Case
Methods
Input Validation
Formatted Output using printf()
Code Explanation
StudentInformationSystem Class

This class stores the details of each student.

Attributes:

Student Name
Student Age
Student Grade
Student ID
Contact Number

Methods:

Constructor
Getter Methods
Setter Methods
displayInfo()
Main Class

The main class controls the complete application.

Functions:

addStudent()
viewAllStudents()
searchStudent()
updateStudent()
Validation

The application performs the following validations:

Age must be greater than zero.
Search works using Student ID or Name.
Updated information replaces the old data.
Testing
Test Case	Input	Expected Output
Add Student	Valid Details	Student Added Successfully
View Students	Existing Records	Student List Displayed
Search Student	Valid Student ID	Student Found
Search Student	Invalid Student ID	Student Not Found
Update Student	Existing Student ID	Student Updated Successfully
