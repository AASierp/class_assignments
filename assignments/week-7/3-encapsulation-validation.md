# Encapsulation and Validation

## Assignment

Revise the repair ticket tracker so objects protect their own data.

The goal is to prevent invalid state and make the model easier to use safely.

## Part 1: Review Public Data

Review your classes and identify any fields that other code can change directly.

Decide which fields should be private and which values should only change through methods.

## Part 2: Encapsulate Fields

Use access modifiers to hide implementation details.

Expose only the methods that other code needs in order to use each object.

Do not create setters automatically for every field. Decide which values should be changeable after the object is created.

## Part 3: Add Validation

Add validation for important rules in the model.

For example, your application might prevent:

* A ticket with no title
* A ticket with no requester
* A resolved ticket being moved back to an invalid status
* A technician being assigned when the ticket is already closed

Choose rules that make sense for your design.

## Part 4: Represent Failure

Decide how your code should respond when an operation is invalid.

For this assignment, focus on making invalid operations visible and understandable.

You may use return values, exceptions, or another clear approach.

## Part 5: Explain the Public API

Write a short explanation of how another developer should use your classes.

Describe what they can do safely and what your classes prevent.

## Focused Questions

1. Why should fields usually be private?
2. Which fields should not have ordinary setters?
3. What invalid state did your code prevent?
4. How did you make invalid operations understandable?
5. How does encapsulation make later API or database work safer?
