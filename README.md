# 🎠 RentVideo - Online Video Rental REST API

RentVideo is a Spring Boot-based RESTful API for managing an online video rental system. It includes secure user registration, role-based access control using Basic Authentication, and CRUD operations for video management.

---

## 🔑 Key Features

### 🔐 User Authentication & Authorization
- Basic Authentication with BCrypt password hashing
- Role-based access control (`CUSTOMER` and `ADMIN`)
- **Public endpoints**: user registration, login
- **Protected endpoints**: role-specific access control

### 👥 User Management
- Register with: Email, Password, First Name, Last Name, Role (defaults to `CUSTOMER`)
- Passwords are securely hashed using BCrypt

### 📼 Video Management
- `CUSTOMER`: View all available videos
- `ADMIN`: Add, update, or delete video entries
- **Video fields**: Title, Director, Genre, Availability Status

### ❌ Error Handling
- Returns appropriate HTTP status codes for errors (e.g., `400`, `401`, `403`, `404`)

---

## 🛠️ Technologies Used
- Java 17+
- Spring Boot
- Spring Security
- Spring Data JPA
- MySQL
- Lombok
- Gradle

---

## 📂 API Endpoints Overview

| Endpoint              | Access       | Role     | Description               |
|-----------------------|--------------|----------|---------------------------|
| `POST /api/register`  | Public       | All      | Register a new user       |
| `GET /api/videos`     | Authenticated| All      | View all available videos |
| `POST /api/videos`    | Authenticated| ADMIN    | Add a new video           |
| `PUT /api/videos/{id}`| Authenticated| ADMIN    | Update video details      |
| `DELETE /api/videos/{id}`| Authenticated| ADMIN | Delete a video            |

---

## 🔐 Security Details
- Basic Auth enabled via Spring Security
- Role checks with `@PreAuthorize` for method-level security
- BCrypt used for secure password storage

---

## 🚀 Getting Started

### 1. Clone the repo

```bash
git clone https://github.com/AnanthaKrishnanJ2001/RentVideoBasic.git
cd RentVideoBasic
