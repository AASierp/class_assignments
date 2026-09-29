# REST API Controller

## Assignment

Implement REST endpoints for the repair ticket tracker.

The goal is to practice resource-oriented API design and connect HTTP requests to Java methods.

## Part 1: Review the API Contract

Review the API contract you designed for the repair ticket tracker.

Choose a small set of endpoints to implement first.

At minimum, consider:

* Viewing all tickets
* Viewing one ticket
* Creating a ticket
* Updating a ticket
* Deleting or closing a ticket

## Part 2: Implement GET Endpoints

Create controller methods that handle `GET` requests.

The endpoints should return structured data that could be used by a frontend.

Use clear resource paths, such as `/tickets` or `/tickets/{id}`.

## Part 3: Implement POST or PUT Endpoints

Create an endpoint that accepts request data.

Map incoming JSON to a Java object.

Use the request data to create or update a repair ticket.

## Part 4: Return Useful Responses

Return responses that include useful data and appropriate HTTP status codes.

For example, think about what should happen when:

* A ticket is created
* A ticket is found
* A ticket does not exist
* A request body is invalid

## Part 5: Test the API Manually

Use a browser, Postman, curl, or another API tool to test the endpoints.

Verify both successful and unsuccessful requests.

## Focused Questions

1. Which endpoints did you implement first, and why?
2. How did the URL paths represent resources?
3. How did Spring map request data to Java objects?
4. Which HTTP status codes did you use?
5. How did testing the API reveal whether the controller worked correctly?
