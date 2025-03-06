#  Book Management System  

A simple Java-based book management system using Hibernate for database interaction. Provides basic CRUD operations.  

##  Features  
-  Add new books  
-  Retrieve all books or a specific book  
-  Update book details  
-  Delete books  

##  Technologies  
- **Java**  
- **Hibernate** (ORM)  
- **HikariCP** (Connection Pooling)  
- **JDBC** (Database Connectivity)  
- **PostgreSQL/MySQL** (or another database)

- ##  API Endpoints  

| **Method** | **URL**        | **Description**          |
|-----------|----------------|--------------------------|
| **GET**   | `/books`        |  Retrieve all books   |
| **GET**   | `/books/{id}`   |  Retrieve a book by ID |
| **POST**  | `/books`        |  Add a new book        |
| **PUT**   | `/books/{id}`   |  Update book details  |
| **DELETE**| `/books/{id}`   |  Delete a book        |
  
