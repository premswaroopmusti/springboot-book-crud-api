# Spring Boot Book CRUD API

A simple RESTful API built with Java and Spring Boot to manage a collection of books. This project demonstrates basic CRUD (Create, Read, Update, Delete) operations on a Book resource using Spring Data JPA with an in-memory H2 database.

---

## Features

- Create a new book
- Retrieve all books
- Retrieve a book by its ID
- Update an existing book
- Delete a book by its ID
- Uses H2 in-memory database for persistence
- Proper HTTP status codes and error handling

---

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- H2 Database (in-memory)
- Maven (build tool)
- Postman (for API testing)

---

## Getting Started

### Prerequisites

- Java installed
- Maven installed
- IDE (IntelliJ IDEA)

### Running the Application

1. Clone the repository:

```bash
git clone https://github.com/your-username/springboot-book-crud-api.git

2. Navigate into the project directory:

cd springboot-book-crud-api

3. Build and run the application:

mvn spring-boot:run

4. The API will be available at: http://localhost:8080/api/books

API Endpoints

| HTTP Method | Endpoint          | Description         |
| ----------- | ----------------- | ------------------- |
| GET         | `/api/books`      | Get all books       |
| GET         | `/api/books/{id}` | Get a book by ID    |
| POST        | `/api/books`      | Create a new book   |
| PUT         | `/api/books/{id}` | Update a book by ID |
| DELETE      | `/api/books/{id}` | Delete a book by ID |

Sample JSON for Creating or Updating a Book

{
  "title": "Clean Code",
  "author": "Robert C. Martin",
  "publishedYear": 2008,
  "genre": "Programming"
}

H2 Console Access
You can access the H2 database console at:

http://localhost:8080/h2-console


