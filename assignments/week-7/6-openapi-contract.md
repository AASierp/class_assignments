# Repair Ticket API Contract

## Assignment

Design an API contract for the repair ticket tracker.

The goal is to describe the backend API before implementing it with Spring.

## Part 1: Identify API Resources

Identify the main resources the API should expose.

For example, the API may expose tickets, technicians, requesters, categories, or status updates.

Decide which concepts need their own endpoints and which concepts can appear inside another response.

## Part 2: Design Endpoints

Design REST endpoints for the first version of the application.

Include endpoints that support a useful repair ticket workflow.

At minimum, consider:

* Viewing a list of tickets
* Viewing one ticket
* Creating a ticket
* Updating ticket status or assignment

Choose endpoint names and HTTP methods that match the resource behavior.

## Part 3: Design Request Shapes

Design the JSON request bodies needed by your endpoints.

Include only the data the client should send.

For example, a create-ticket request may not need the same fields as a ticket response.

## Part 4: Design Response Shapes

Design JSON response bodies for your endpoints.

Decide when the response should include nested objects, IDs, status values, timestamps, or related records.

Keep responses useful for a frontend without exposing unnecessary internal details.

## Part 5: Define Status Codes

Choose HTTP status codes for successful and unsuccessful outcomes.

For example, think about what should happen when:

* A ticket is created
* A ticket is not found
* A request body is invalid
* A workflow change is not allowed

## Part 6: Draft an OpenAPI Specification

Create an OpenAPI draft for the endpoints and data shapes you designed.

The contract does not need to describe every future feature. It should clearly document the first version of the API.

## Focused Questions

1. How is an API resource different from a Java class?
2. Which endpoints expose ticket data, and which endpoints change ticket state?
3. Why might create requests and ticket responses have different shapes?
4. When should a response include nested data instead of only IDs?
5. Which errors should be represented with HTTP status codes?
6. How will this contract help when the Spring API is built later?
