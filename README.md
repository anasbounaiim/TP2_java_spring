
# TP2 Java Spring Application

## Project Overview

This Spring Boot application is designed to manage medical consultations, patients, and appointments. It utilizes Spring Data JPA for ORM and interacts with a MySQL database to perform CRUD operations on entities such as patients, consultations, and medical staff.

## Features

- **Entity Management**: Handles entities like `Medecin`, `Patient`, `Consultation`, `RendezVous`, `Role`, and `User`.
- **Repository Layer**: Includes JPA repositories for each entity to abstract complex SQL queries.
- **Service Layer**: Implements business logic through services like `HospitalService` and `UserService`.
- **Controller Layer**: Exposes RESTful endpoints through `PatientRestController` and `UserController` to interact with front-end applications.

## Getting Started

### Prerequisites

- Java 11 or newer
- Maven for dependency management
- XAMPP or any other environment that provides MySQL and Apache

### Running the Application

1. Start your XAMPP Control Panel and ensure that Apache and MySQL are running.
2. Clone this repository to your local machine:
   ```
   git clone https://github.com/anasbounaiim/TP2_java_spring.git
   ```
3. Navigate into the project directory:
   ```
   cd TP2_java_spring
   ```
4. Run the application using Maven:
   ```
   mvn spring-boot:run
   ```

The application should now be running on `http://localhost:8080`.

## Configuration

The application's configuration can be found in `application.properties`, located under `src/main/resources`. Adjust the database connection settings according to your local or cloud-based MySQL configuration.

## Contributions

Contributions are welcome via pull requests. Please ensure that your code adheres to the project's existing style and that all tests pass before submitting a pull request.





