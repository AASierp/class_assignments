# Library Lending API

This is a minimal Spring Boot REST API for tracking library book loans.

It includes:

- Spring Boot
- Spring Web MVC
- Spring Data JPA
- PostgreSQL
- Swagger UI through Springdoc OpenAPI
- Docker Compose for running the API with Postgres

## Prerequisites

Install:

- Java 17 or newer
- Maven
- Docker Desktop, or another Docker runtime with Docker Compose

Check your versions:

```bash
java --version
mvn --version
docker --version
docker compose version
```

## 1. Generate project with dependencies added

Create `pom.xml`.

Generate your initial project folder with Spring Initializr at `https://start.spring.io`.

For this app, select:

```text
Project: Maven
Language: Java
Spring Boot: 4.1.1
Group: com.example
Artifact: loan
Packaging: Jar
Configuration: Properties
Java: 17
Dependencies:
- Spring Web
- Spring Data JPA
- PostgreSQL Driver
```

## 2. Create the Loan Entity

Create `src/main/java/com/example/loan/model/Loan.java`.

The entity maps Java fields to the `loan` database table:

```java
package com.example.loan.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "patron_name")
    private String patronName;

    @Column(name = "book_title")
    private String bookTitle;

    @Column(name = "checkout_date")
    private String checkoutDate;

    private String status;

    @Column(name = "due_date")
    private String dueDate;

    public Loan() {
    }

    public Long getId() {
        return id;
    }

    public String getPatronName() {
        return patronName;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getCheckoutDate() {
        return checkoutDate;
    }

    public String getStatus() {
        return status;
    }

    public String getDueDate() {
        return dueDate;
    }
}
```

## 3. Create the Repository

Create `src/main/java/com/example/loan/repository/LoanRepository.java`.

```java
package com.example.loan.repository;

import com.example.loan.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {
}
```

`JpaRepository` gives the app methods like:

```text
findAll()
```

## 4. Create the Service

Create `src/main/java/com/example/loan/service/LoanService.java`.

The service gets all loans from the repository:

```java
package com.example.loan.service;

import com.example.loan.model.Loan;
import com.example.loan.repository.LoanRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanService {
    private final LoanRepository loanRepository;

    public LoanService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    public List<Loan> findAll() {
        return loanRepository.findAll();
    }
}
```

## 5. Create the Controller

Create `src/main/java/com/example/loan/controller/LoanController.java`.

The controller exposes one endpoint for listing all loans:

```java
package com.example.loan.controller;

import com.example.loan.service.LoanService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loans")
public class LoanController {
    private final LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @GetMapping
    public ResponseEntity<?> getAllLoans() {
        return ResponseEntity.ok(loanService.findAll());
    }
}
```

## 6. Configure PostgreSQL

Create `src/main/resources/application.properties`.

```properties
spring.application.name=loan

spring.datasource.url=${DATABASE_URL:jdbc:postgresql://localhost:5432/postgres}
spring.datasource.username=${DATABASE_USERNAME:postgres}
spring.datasource.password=${DATABASE_PASSWORD:password}

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

The app reads database settings from environment variables:

```text
DATABASE_URL
DATABASE_USERNAME
DATABASE_PASSWORD
```

If those variables are not provided, it falls back to:

```text
jdbc:postgresql://localhost:5432/postgres
postgres
password
```

## 7. Create the Dockerfile

Create `Dockerfile`.

```dockerfile
FROM maven:3.9.9-eclipse-temurin-17 AS build

WORKDIR /app

COPY pom.xml .
RUN mvn -q -DskipTests dependency:go-offline

COPY src ./src
RUN mvn -q -DskipTests package

FROM eclipse-temurin:17-jre

WORKDIR /app

COPY --from=build /app/target/loan-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
```

## 8. Create Docker Compose

Create `docker-compose.yml`.

```yaml
services:
  app:
    build: .
    environment:
      DATABASE_URL: jdbc:postgresql://host.docker.internal:5432/postgres
      DATABASE_USERNAME: postgres
      DATABASE_PASSWORD: password
    ports:
      - "8080:8080"

volumes:
  postgres-data:
```

Inside Docker Compose, the hostname `postgres` refers to the Postgres container.

That is why the app uses:

```text
jdbc:postgresql://postgres:5432/postgres
```

not:

```text
jdbc:postgresql://localhost:5432/postgres
```

## 9. Start the App with PostgreSQL

From the `spring-test` folder, run:

```bash
docker compose up --build
```

The first run may take a few minutes because Docker needs to download images and Maven dependencies.

When startup finishes, the API is available at:

```text
http://localhost:8080
```

Postgres is available on the host machine at:

```text
localhost:5432
```

## 10. Test the API

Get all loans:

```bash
curl http://localhost:8080/loans
```

## 11. Test with Swagger

Open:

```text
http://localhost:8080/swagger-ui.html
```

Swagger lets you test the API in the browser.

Use the `/loans` section to:

- list loans

