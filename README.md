🎓 Student Management System (Java OOP + ArrayList)

A console-based Student Management System built using Core Java, implementing Object-Oriented Programming principles and the Java Collection Framework (ArrayList).

This project demonstrates clean architecture, proper layering, and CRUD operations using dynamic data storage.

📌 Project Overview

The system allows users to:

Add new students

View all students

Search students by ID

Update student details

Delete students

Sort students by marks (Descending)

All student records are stored dynamically using:

ArrayList<Student>

🧠 Concepts Used

Object-Oriented Programming (OOP)

Encapsulation

Abstraction

Java Collection Framework

ArrayList

Comparator

Method Overriding

Menu-driven console application

Clean layered architecture

🏗 Project Architecture
StudentManagementSystem/
│
├── model/
│     └── Student.java
│
├── service/
│     └── StudentService.java
│
└── Main.java

🔹 Model Layer

Handles data structure and object definition.

🔹 Service Layer

Contains business logic and operations on the ArrayList.

🔹 Main (UI Layer)

Handles user interaction and menu system.

⚙️ Features
Feature	Description
Add Student	Insert new student object
View Students	Display all stored records
Search Student	Search using unique ID
Update Student	Modify existing student data
Delete Student	Remove student record
Sort by Marks	Sort students in descending order
💻 Sample Output
===== STUDENT MANAGEMENT SYSTEM =====
1. Add Student
2. View Students
3. Search Student
4. Update Student
5. Delete Student
6. Sort by Marks
7. Exit
Enter choice:

🚀 How to Run
1️⃣ Clone Repository
https://github.com/Dheerajparihar111/Stundent-Management-System/tree/main

<img width="1918" height="1011" alt="Student-Mangement-System output1" src="https://github.com/user-attachments/assets/7ad43b3a-bfa3-4ef8-9334-d4a4e57727b9" />
<img width="1917" height="1016" alt="Student-Mangement-System output2" src="https://github.com/user-attachments/assets/7eef848b-283b-485a-99dd-4f15f2cfd878" />

2️⃣ Open in IDE

IntelliJ IDEA

Eclipse

VS Code

3️⃣ Run

Run Main.java

📊 Technical Highlights

Uses dynamic memory via ArrayList

Comparator for sorting

Modular code design

Follows clean coding principles

Easy to extend (File handling / Database / GUI)

🔮 Future Enhancements

File persistence (Save & Load records)

Input validation & exception handling

Grade calculation system

Ranking system

JavaFX GUI version

Database integration (JDBC + MySQL)

REST API version using Spring Boot

📚 Learning Outcome

This project strengthens understanding of:

Data structures in Java

CRUD logic implementation

OOP-based application design

Layered architecture in real-world projects

👨‍💻 Author

Dheeraj Parihar
Electronics & Telecommunications Engineering Student
Aspiring Software Developer & Entrepreneur
