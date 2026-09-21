# Tables and Relationships

## Assignment

Design the first version of a relational database for a fitness class booking system.

The system should track members, trainers, class types, scheduled class sessions, locations, equipment, bookings, trainer assignments, and equipment requirements.

## Part 1: Identify Entities

Identify the main entities in the system.

For each entity, list the important fields that should be stored.

## Part 2: Identify Relationships

Describe the relationships between the entities.

## Part 3: Identify Keys

For each table, identify:

* Primary key
* Foreign keys
* Fields that should be required
* Fields that should be unique, if any

## Part 4: Join Tables

Define the join tables needed for the many-to-many relationships.

For each join table, explain what real-world relationship it represents.

## Part 5: Initial Schema Plan

Create a table plan using [ChartDB](https://dbdiagram.io/) or another tool.

## Focused Questions

1. Which relationships are one-to-many?
2. Which relationships are many-to-many?
3. Why does a many-to-many relationship need a join table?
4. What information belongs directly on `class_sessions`?
5. What information belongs in `bookings` instead of directly on `members` or `class_sessions`?
6. Why is `session_trainers` more flexible than storing one trainer directly on `class_sessions`?
7. Why is `class_type_equipment` more useful than listing equipment names in a text field?

