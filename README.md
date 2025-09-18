# Library Management System

## Overview
A Spring Boot Library Management System with role-based access control.

## Technology Stack
- Java 17
- Spring Boot
- Spring Security
- JPA/Hibernate
- H2/MySQL (relational database)

## Features
- Book, Member, and System User management
- Borrow and Return functionality
- Role-based access: ADMIN, LIBRARIAN, STAFF
- Basic Authentication

## Running the Project
1. Clone the repository
2. Configure `application.properties` for your database
3. Run the application with `mvn spring-boot:run`
4. Access APIs at `http://localhost:8080/api/...`  

## Default Admin
- Username: `admin`
- Password: `admin123`
