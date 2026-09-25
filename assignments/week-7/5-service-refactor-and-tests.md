# Service Refactor and JUnit Tests

## Assignment

Refactor part of the repair ticket tracker into clearer responsibilities, then test the behavior with JUnit.

The goal is to make the code easier to change and safer to verify.

## Part 1: Identify Responsibilities

Review your code and identify responsibilities that may be mixed together.

For example, one class might currently handle ticket data, ticket workflow rules, technician assignment, and notifications.

Decide which responsibilities should stay together and which should be separated.

## Part 2: Create a Service Class

Create at least one service-style class that coordinates a workflow.

For example, a service might handle creating a ticket, assigning a technician, updating status, or closing a ticket.

The service should use your domain classes instead of replacing them.

## Part 3: Reduce Coupling

Look for places where one class depends too strongly on another concrete class.

Use a small abstraction or constructor parameter where it improves testability or clarity.

Do not add extra layers just to add layers.

## Part 4: Write JUnit Tests

Write JUnit tests for important repair ticket behavior.

Choose tests that verify business behavior, not private implementation details.

Possible test areas include:

* Creating a valid ticket
* Rejecting invalid ticket data
* Assigning a technician
* Changing ticket status
* Preventing an invalid workflow change
* Confirming that a service coordinates a workflow correctly

## Part 5: Review Test Quality

Make sure each test has a clear purpose.

Use readable test names and organize each test around arrange, act, and assert.

## Focused Questions

1. Which responsibility did you move out of a class?
2. How did the service class coordinate behavior without owning every detail?
3. What dependency became easier to test?
4. Which tests verify behavior rather than implementation details?
5. How does this refactor connect to the single responsibility principle?
6. How does dependency inversion make testing easier?
