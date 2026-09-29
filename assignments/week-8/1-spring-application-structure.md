# Spring Application Structure

## Assignment

Create the first Spring version of the repair ticket tracker.

The goal is to organize the application into clear Spring responsibilities before adding a full database-backed workflow.

## Part 1: Create a Spring Project

Create a basic Spring application for the repair ticket tracker.

The project should be able to start successfully and expose at least one simple endpoint.

## Part 2: Identify Application Layers

Identify the major layers in the application.

At minimum, consider:

* Controllers
* Services
* Repositories
* Configuration
* Domain or entity classes

Decide what each layer should be responsible for.

## Part 3: Create a Controller

Create a controller that handles repair ticket API requests.

Start with a small endpoint, such as viewing a welcome message or returning a list of example tickets.

The controller should focus on request and response behavior.

## Part 4: Create a Service

Create a service class that contains application logic.

Move workflow decisions out of the controller and into the service.

The controller should call the service instead of handling every detail directly.

## Part 5: Use Dependency Injection

Use Spring dependency injection to connect the controller to the service.

Avoid creating service objects manually inside controller methods.

## Focused Questions

1. What role does Spring play in this application?
2. What responsibility belongs in the controller?
3. What responsibility belongs in the service?
4. How does dependency injection reduce tight coupling?
5. Why is it useful to separate request handling from business logic?
