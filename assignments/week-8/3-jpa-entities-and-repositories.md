# JPA Entities and Repositories

## Assignment

Add persistence modeling to the repair ticket tracker using JPA.

The goal is to map Java objects to database tables and use a repository to read and write data.

## Part 1: Choose Entities

Decide which repair ticket concepts should become JPA entities.

At minimum, consider:

* Repair tickets
* Requesters
* Technicians
* Categories
* Status values

Choose a small model that supports the current application.

## Part 2: Create Entity Classes

Create entity classes with fields, identifiers, and simple relationships.

Each entity should have an ID field.

Use relationships only where they make the model clearer.

## Part 3: Create a Repository

Create a repository for at least one entity.

Use the repository to save and retrieve data instead of storing everything in memory.

## Part 4: Connect the Service to Persistence

Update the service layer so it uses the repository.

The controller should still call the service, and the service should coordinate persistence behavior.

## Part 5: Explain the Mapping

Write a short explanation of how the Java model maps to database tables.

Include notes about entity identity, relationships, and how object references relate to database records.

## Focused Questions

1. What makes a class a good candidate for a JPA entity?
2. Why does each entity need an identifier?
3. Which fields became database columns?
4. Which relationships did you model, and why?
5. How does a repository simplify reading and writing data?
6. What is one tradeoff of using an ORM like JPA?
