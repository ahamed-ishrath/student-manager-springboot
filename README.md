# Student Registration System

A Spring Boot CRUD web application for registering students.

## Features

- Add a student (name, email, phone, course, age) with form validation
- View all students in a table
- Edit and update student details
- Delete a student
- Duplicate email check

## Technologies

- Java 17
- Spring Boot 4.1.1 (Spring Web, Spring Data JPA, Validation)
- Thymeleaf
- H2 in-memory database
- Maven

## How to Run

1. Install JDK 17 or later and Git.
2. Clone the repository:
```bash
   git clone https://github.com/<your-username>/student-manager-springboot.git
   cd student-manager-springboot
```
3. Run the application:
```bash
   ./mvnw spring-boot:run
```
   (On Windows: `mvnw.cmd spring-boot:run`)
   You can also run `StudentManagerApplication.java` from VS Code.
4. Open http://localhost:8081 in your browser.(or 8080 if it is available)

## H2 Console

- URL: http://localhost:8081/h2-console
- JDBC URL: `jdbc:h2:mem:studentdb`
- User Name: `sa`
- Password: (leave empty)

## Note

The database is in-memory, so all data is lost when the application stops.
