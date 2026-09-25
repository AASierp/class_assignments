# Abstraction and Polymorphism

## Assignment

Add one small abstraction to the repair ticket tracker.

The goal is to practice interface-style behavior, inheritance, composition, or polymorphism without making the design unnecessarily complicated.

## Part 1: Find a Flexible Behavior

Identify one behavior that could have more than one implementation.

For example:

* Sending notifications
* Calculating ticket urgency
* Formatting ticket summaries
* Choosing which technician should receive a ticket

Choose one behavior that would benefit from flexibility.

## Part 2: Create an Abstraction

Create an abstraction for the behavior you chose.

This might be an interface, an abstract class, or a small hierarchy of related classes.

Use the option that makes the design clearer.

## Part 3: Create Multiple Implementations

Create at least two implementations of the behavior.

For example, one notification implementation might print to the console, while another might store messages for testing.

The exact implementation is up to you.

## Part 4: Use Polymorphism

Write code that can use the abstraction without depending on a specific implementation.

The calling code should not need to know which exact class is being used.

## Part 5: Evaluate the Design

Write a short explanation of why the abstraction helps.

Also explain why adding too many patterns or layers could make this small application harder to understand.

## Focused Questions

1. What behavior did you abstract?
2. Why might this behavior need more than one implementation?
3. How did polymorphism allow different objects to be used through the same type?
4. Where did you use composition, inheritance, or both?
5. How can a design pattern help, and how can it become overengineering?
