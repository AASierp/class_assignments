# Assignment 2: Support Ticket Console App

## Project

Build a small console-based support ticket app in TypeScript.

The app should model customers, support agents, and tickets, then print useful ticket information to the console. The goal is to show that you can create safe TypeScript models for data that can take multiple forms and safely branch based on what kind of data you are handling.

## App Requirements

Your app must:

1. Create and store several support tickets.
2. Create at least one customer and one support agent.
3. Allow a ticket to be assigned to either no one, a customer-created record, or a support agent workflow step depending on how you model it.
4. Display each ticket’s title, priority, status, and ownership information.
5. Include at least one escalated ticket with extra escalation details.
6. Print different output depending on whether the owner or actor is a customer or an agent.
7. Simulate receiving one piece of external ticket data that must be checked before it is used.
8. Include at least one function that accepts more than one possible type and safely narrows before using type-specific behavior.

## TypeScript Concepts That Must Be Demonstrated

Your solution must clearly demonstrate:

- string, number, boolean - check
- arrays - check
- object types - check
- interfaces or type aliases - check
- union types - check
- intersection types - check
- string literal types or enums - check
- function parameter types -check
- function return types -check
- type guards using at least two different narrowing strategies - check
- unknown - check
- void - check
- never -check
- a justified type assertion

## Required Features

### Ticket Modeling
Your app must model:
- Customer
- Agent
- SupportTicket

Each ticket must include:
- id
- title
- description
- priority
- status
- createdBy
- assignedTo
- tags

### Escalation Modeling
Create a second ticket shape or composed type for escalated tickets that includes:
- escalatedBy
- escalationReason
- escalatedAt

### Status and Priority Rules
Restrict priority and status to a limited set of valid values.

Examples of valid sets:
- priority: low, medium, high
- status: open, in_progress, resolved

### Narrowing Behavior
Your app must include logic that safely narrows:
- a value that could be a string or number
- a value that could be a customer or an agent
- a ticket-related union where different branches have different properties

### Special Types
Include small examples that demonstrate:
- any
- unknown
- void
- never

Do not just declare them. Show them in real usage and explain why they are or are not safe.

## Output Expectations

When the program runs, it should print:
- a list of tickets
- a formatted summary for each ticket
- a different message for escalated tickets
- a different message depending on who is associated with the ticket
- a short section showing your special type examples

## Reflection Questions

1. Why is a union type useful in this app?
2. Why is an intersection type useful in this app?
3. Why do literal types or enums improve safety?
4. What is the difference between any and unknown in practice?
5. Why should type assertions be used carefully?
6. Which narrowing strategy felt most useful and why?

## Extension

Add a discriminated union for ticket events such as created, assigned, escalated, and resolved, then print different messages for each event type.