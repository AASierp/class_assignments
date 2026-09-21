# Joins and Related Records

## Assignment

Write SQL queries that combine related fitness class booking data across multiple tables.

Focus on `INNER JOIN`, `LEFT JOIN`, and many-to-many relationships.

## Part 1: Join Direct Relationships

Write queries that combine tables with direct relationships.

For example, a class session might need information from its class type or location.

Use joins to make the result easier for a person or application to understand.

## Part 2: Join Through Relationship Tables

Write queries that use many-to-many relationship tables.

For example, use a join table to find which members booked a session, or which trainers are assigned to a session.

Pay attention to what information comes from the main tables and what information comes from the relationship table.

## Part 3: Compare Join Types

Write at least one query using `INNER JOIN` and at least one query using `LEFT JOIN`.

Choose a case where the difference matters.

For example, compare showing only sessions with bookings against showing all sessions whether or not anyone has booked them.

## Part 4: Build Application-Friendly Results

Choose two application views that need related data from multiple tables.

Write a query for each view and explain why the joined result is more useful than separate table data.

## Focused Questions

1. What does an `INNER JOIN` exclude?
2. What does a `LEFT JOIN` preserve?
3. Why does a booking query need more than two tables?
4. Why is `session_trainers` a relationship table instead of a trainer detail table?
5. What extra information can a join table store?
6. How do joins help normalized data become useful application data?

