# Normalization and Data Shape

## Assignment

Refine the fitness class booking data model so repeated data is separated into related tables. You will not need to add data to your model yet.

The goal is to reduce duplication while keeping the data useful for application features.

## Part 1: Review Unnormalized Data

Start with this sample record:

```text
Member: Jordan Lee
Email: jordan@example.com
Class: Morning Strength
Class Type: Strength Training
Location: Downtown Studio
Room: Studio A
Trainer 1: Amara Singh
Trainer 2: Chris Taylor
Equipment: Dumbbells, Mats, Resistance Bands
Booking Status: confirmed
Booked At: 2026-09-21 09:00
```

Identify which values would be duplicated if records like this were stored repeatedly.

Look especially for values that describe different kinds of things, such as people, scheduled events, places, and equipment.

## Part 2: Separate Repeated Concepts

Revise the data model so repeated concepts are moved into their own tables.

For example, a trainer should not need to be retyped every time they teach a class session, and a location address should not need to be copied onto every scheduled class.

As you revise the model, decide which relationships need join tables.

At minimum, think about relationships where:

* One record can connect to many other records
* Both sides of the relationship can have many matches
* The relationship itself may need extra information

## Part 3: Apply Normalization Rules

Review the model for common normalization issues.

Look for:

* Multiple values stored in one field
* The same fact repeated in many rows
* Fields that depend on the wrong table
* Data that would be hard to update consistently

Revise the model so each fact is stored in the most appropriate place.

## Part 4: Test the Model Against Application Needs

Choose two application views and decide what data each view would need.

For example, a class session detail view might need the session time, class type, location, assigned trainers, equipment, and booked members.

Use this step to check whether the normalized model still supports useful application data shapes.

## Focused Questions

1. What duplicated data did normalization remove?
2. Which fields were hardest to place in the right table?
3. Which relationships need join tables, and why?
4. What information belongs on a scheduled class session?
5. What information belongs on a class type?
6. How can normalized data still support useful frontend views?
7. What tradeoff comes with splitting data across more tables?
