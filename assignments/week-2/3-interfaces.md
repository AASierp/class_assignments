# Assignment 3: Learning Platform Data Model App

## Project

Build a small TypeScript app that models a learning platform.

The app should manage instructors, students, lessons, and courses, then print summaries that show how the data relates. The goal is to show that you can build reusable, maintainable TypeScript models instead of repeating object shapes.

## App Requirements

Your app must:

1. Model a small course platform with at least:
   - two students - check
   - one instructor - check
   - two lessons - check
   - one course - check
2. Store relationships between those objects. - check
3. Print a course summary that includes instructor info and student counts. - check
4. Create a reusable response shape for successful and failed data operations.
5. Simulate updating course data without requiring a full course object. - check
6. Prevent editing of data that should be treated as published or locked. - check
7. Store some data in a keyed lookup structure. - check 
8. Use at least two generic utilities or functions on multiple data types.

## TypeScript Concepts That Must Be Demonstrated

Your solution must clearly demonstrate:

- interfaces - check
- interface extension - check
- reusable object shapes - check
- derived or composed types - check
- generic functions - check
- generic types - check
- Partial - check
- Readonly - check
- Record - check
- typed arrays - check
- typed function parameters - check
- typed return values - check

## Required Features

### Base Models
Create interfaces for:
- Person - check
- Student - check
- Instructor - check
- Lesson - check
- Course - check

Use extension where it makes sense.

### Reusable Derived Shapes
Create at least one derived type such as:
- CourseSummary - check
- StudentSummary
- EnrollmentReport

This type should be built from existing models rather than rewritten from scratch.

### Utility Types
You must use:
- Partial for an update object - check
- Readonly for data that should not change after publishing - check
- Record for storing keyed data such as progress, titles, or lookup tables - check

### Generic Functions
Create at least two generic functions such as:
- getLastItem
- wrapSuccessResponse
- findById - check
- groupByKey

Each generic function must be used with more than one data type.

### Generic Types
Create at least two generic types such as:
- ApiResponse<T>
- PaginatedResponse<T>
- LookupTable<T>

Use them with actual app data.

## Output Expectations

When the program runs, it should print:
- a course summary
- a student summary or progress report
- an example of a partial update object
- an example of readonly published data
- an example of a record-based lookup
- generic function results using different data types
- one successful typed response and one failed typed response

## Reflection Questions

1. Why are interfaces helpful in an app with related data models?
2. When is interface extension better than repeating properties?
3. Why is Partial useful for updates?
4. Why is Readonly useful for published data?
5. Why is Record useful for keyed application data?
6. What makes a generic function safer than using broad types?
7. When would a generic abstraction be too much for a small app?

## Extension

Add a paginated course list and create a generic paginated response model that can work with courses, lessons, or students.