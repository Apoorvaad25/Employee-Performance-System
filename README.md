# Employee Performance Evaluation System
Review 1 – Project Documentation

## 1. Introduction
The Employee Performance Evaluation System is a console-based Java application designed to manage core employee information and establish the foundational architecture for performance evaluation features. Review 1 focuses on implementing Core Java principles, Object-Oriented Programming (OOP), JDBC connectivity, and initial database integration.

This document outlines the system structure, implemented features, database configuration, and execution steps relevant to Review 1.

## 2. System Overview
The project demonstrates the following in Review 1:

- Core Java and OOP fundamentals
- JDBC-based connectivity with MySQL
- Basic CRUD operations (Insert and Retrieve)
- Modular project structure with separate responsibilities
- Console-based user interaction

This phase serves as the foundation for further modules such as manager evaluation, goal setting, tracking, feedback, and reporting.

## 3. Project Directory Structure
EmployeePerformanceSystem/
│
├── src/
│   ├── Main.java
│   ├── Admin.java
│   ├── Employee.java
│   └── DbConnection.java
│
└── README.md

Main.java — Entry point of execution  
Admin.java — Contains administrative operations  
Employee.java — Employee model class  
DbConnection.java — Manages database connectivity  

## 4. Features Implemented (Review 1 Requirements)

### 4.1 Admin Module (Basic)
The Admin module includes two primary functions:

a. Add Employee  
- Accepts employee name and role  
- Stores data in the "employees" table using JDBC PreparedStatement  

b. View All Employees  
- Fetches employee records from the database  
- Displays them in console format  

### 4.2 Database Connectivity
- Implemented via MySQL JDBC Driver  
- Centralized connection handling through DbConnection.java  
- Basic exception handling for connection failures  

### 4.3 Object-Oriented Structure
- Employee attributes encapsulated using private fields  
- Public getters and setters for secure access  
- Modular design for scalability  
- Clear separation of concerns between classes  

## 5. Database Configuration

### 5.1 Create Database
CREATE DATABASE your_database;

### 5.2 Select Database
USE your_database;

### 5.3 Create Table
CREATE TABLE employees (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    role VARCHAR(100)
);

### 5.4 Update DbConnection.java
Modify these fields with your values:

URL  
USER  
PASSWORD

## 6. How to Run the Application

### 6.1 Requirements
- JDK 8 or higher  
- MySQL Server installed  
- MySQL Connector/J  
- Any IDE or command-line compiler  

### 6.2 Compile (command line)
cd src  
javac *.java

### 6.3 Run the Project
java Main

### 6.4 Application Menu
--- Admin Menu ---  
1. Add Employee  
2. View Employees  
3. Logout  

## 7. Technologies Used
Java (Core + OOP)  
JDBC  
MySQL  
Console Input/Output  

## 8. Scope Covered in Review 1
- Project structure creation  
- OOP model for Employee  
- JDBC database connection  
- Insert and View operations  
- Working admin menu  
- Clean and organized code  

## 9. Future Enhancements (For Upcoming Reviews)
- Manager module  
- Performance evaluation features  
- Goal setting, feedback, and progress tracking  
- Performance report generation  
- Enhanced UI and exception handling  
- Additional database structures and relationships  

# End of Review 1 Documentation
