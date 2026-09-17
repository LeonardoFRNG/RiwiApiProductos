#  Products & Categories REST API

REST API developed with **Java and Spring Boot** for managing products and categories.

This project is being built progressively to practice backend development using the **Spring ecosystem**, relational databases, REST architecture, authentication, and application security.

---

##  Features

### Categories

* Create categories
* List all categories
* Get category by ID
* Update categories
* Delete categories

### Products

* Create products
* List all products
* Get product by ID
* Update products
* Delete products
* Associate products with categories

### Authentication & Security

* User authentication
* Password hashing
* JWT-based authentication
* Protected endpoints
* Authorization using Spring Security

---

## 🛠️ Technologies

* **Java**
* **Spring Boot**
* **Spring Web**
* **Spring Data JPA**
* **Hibernate**
* **Spring Security**
* **JWT**
* **MySQL**
* **Maven**
* **Lombok**

---

##  Architecture

The project follows a simple layered architecture:

```text
Client
   │
   ▼
Controller
   │
   ▼
Service
   │
   ▼
Repository
   │
   ▼
JPA / Hibernate
   │
   ▼
MySQL
```

### Main layers

| Layer      | Responsibility                           |
| ---------- | ---------------------------------------- |
| Controller | Handles HTTP requests and responses      |
| Service    | Contains business logic                  |
| Repository | Handles database operations              |
| Entity     | Represents database data                 |
| DTO        | Defines data exchanged through the API   |
| Security   | Handles authentication and authorization |

---

##  Domain Model

### Category

```text
Category
├── id
├── name
└── description
```

### Product

```text
Product
├── id
├── name
├── description
├── price
├── stock
└── category
```

### Relationship

A category can contain multiple products, while each product belongs to one category.

```text
Category 1 ─────────── * Product
```

---

##  API Endpoints

### Categories

| Method   | Endpoint               | Description        |
| -------- | ---------------------- | ------------------ |
| `GET`    | `/api/categories`      | Get all categories |
| `GET`    | `/api/categories/{id}` | Get category by ID |
| `POST`   | `/api/categories`      | Create category    |
| `PUT`    | `/api/categories/{id}` | Update category    |
| `DELETE` | `/api/categories/{id}` | Delete category    |

### Products

| Method   | Endpoint             | Description       |
| -------- | -------------------- | ----------------- |
| `GET`    | `/api/products`      | Get all products  |
| `GET`    | `/api/products/{id}` | Get product by ID |
| `POST`   | `/api/products`      | Create product    |
| `PUT`    | `/api/products/{id}` | Update product    |
| `DELETE` | `/api/products/{id}` | Delete product    |

### Authentication

| Method | Endpoint             | Description       |
| ------ | -------------------- | ----------------- |
| `POST` | `/api/auth/login`    | Authenticate user |
| `POST` | `/api/auth/register` | Register user     |

> Endpoints may evolve during development as the API architecture is refined.

---

##  Database

The application uses **MySQL** as its relational database.

The main entities are:

```text
categories
     │
     │ 1:N
     ▼
products
```

JPA and Hibernate are used to map Java entities to database tables and manage persistence.

---

##  Authentication

Authentication is implemented using **Spring Security and JWT**.

After successfully authenticating, the client receives a JWT token.

Authenticated requests send the token using the HTTP `Authorization` header:

```http
Authorization: Bearer <token>
```

Protected resources require a valid token.

---

## 📁 Project Structure

```text
src/
└── main/
    ├── java/
    │   └── com.example.project/
    │       ├── controller/
    │       ├── service/
    │       ├── repository/
    │       ├── entity/
    │       ├── dto/
    │       ├── security/
    │       └── exception/
    │
    └── resources/
        └── application.properties
```

---

##  Requirements

Before running the project, make sure you have installed:

* Java 21+
* Maven
* MySQL 8+
* Git

---

##  Configuration

Create a MySQL database:

```sql
CREATE DATABASE products_api;
```

Configure the database connection in:

```text
src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/products_api
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
```

> Do not commit real database credentials or JWT secrets to the repository.

For local development, sensitive values should be managed through environment variables or a local configuration file excluded from Git.

---

##  Running the Project

Clone the repository:

```bash
git clone https://github.com/YOUR_USERNAME/products-api.git
```

Navigate into the project:

```bash
cd products-api
```

Run the application with Maven:

```bash
./mvnw spring-boot:run
```

On Windows:

```bash
mvnw.cmd spring-boot:run
```

The API will be available at:

```text
http://localhost:8080
```

---

##  API Testing

The API can be tested using tools such as:

* Postman
* Insomnia
* cURL

Example:

```bash
curl http://localhost:8080/api/products
```

---

## 📌 Project Status

🚧 **In development**

Current progress:

* [x] Spring Boot project setup
* [x] REST Controllers
* [x] MySQL integration
* [x] JPA entities
* [ ] Category CRUD
* [ ] Product CRUD
* [ ] Product–Category relationship
* [ ] DTOs
* [ ] Validation
* [ ] Exception handling
* [ ] Spring Security
* [ ] User authentication
* [ ] JWT authentication
* [ ] Protected endpoints

---

## 🎯 Project Goals

This project aims to demonstrate practical knowledge of:

* Building REST APIs with Spring Boot
* Working with relational databases
* Using JPA and Hibernate
* Designing entity relationships
* Implementing layered architecture
* Applying validation and exception handling
* Implementing authentication and authorization
* Securing REST APIs with JWT

---

## 👨‍💻 Author

**Leonardo Jimenez**

Junior Software Developer in Training at RIWI

Focused on:

* Java
* Spring Boot
* Backend Development
* Full-Stack Development
* REST APIs
* Database Development
