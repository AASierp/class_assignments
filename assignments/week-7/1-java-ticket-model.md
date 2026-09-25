# Java Domain Model

## Assignment

Create the first Java model for a repair ticket tracker.

The application should track repair requests submitted by people and handled by technicians. At this stage, focus on representing the main concepts in Java, not on building a complete application.

## Part 1: Identify the Domain Concepts

Identify the main concepts the application needs.

At minimum, consider:

* Repair tickets
* Requesters
* Technicians
* Ticket categories
* Ticket status
* Ticket priority

Decide which concepts should become Java classes and which concepts could be represented another way.

## Part 2: Create Java Classes

Create Java classes that model the core repair ticket concepts.

Each class should have fields that describe the concept it represents.

For example, a ticket might need a title, description, status, priority, and information about who reported it.

Avoid adding every possible field. Choose fields that would matter in an early version of the application.

## Part 3: Add Constructors and Methods

Add constructors and methods that make the objects useful.

Your methods should help other code interact with the object without needing to know every detail of how the object stores its data.

## Part 4: Create Objects

Write a small Java program that creates several example objects.

Use those objects to represent a few realistic repair tickets.

For example, you might create tickets for a broken projector, a leaking sink, or a laptop that will not start.

## Part 5: Explain the Model

Write a short explanation of your class design.

Explain:

* What each class represents
* Which fields are primitive types
* Which fields are reference types
* How object instances relate to class definitions

## Focused Questions

1. Why does a repair ticket deserve its own class?
2. Which values are simple primitives, and which values are references to other objects?
3. What information belongs on a ticket instead of on a requester or technician?
4. How does a class definition differ from an object created from that class?
5. What compiler errors did you encounter, and how did you interpret them?
