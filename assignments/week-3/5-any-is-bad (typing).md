# React with TypeScript

### Learning Target
> I can type React props, state, events, lists, and asynchronous data without unnecessary use of `any`.

## Setup

Continue using the Vite React TypeScript project.

Run the development server:

    npm run dev

Check the production build regularly:

    npm run build

## Shared Domain Types

Create:

    src/types/course.ts

Define reusable types for:

- `CourseLevel`
- `Course`
- `EnrollmentStatus`
- `RemoteCourse`
- Request status

Use a union type for values such as course level and request status.

## Typed Component Props

Create explicit prop types for:

- `Header`
- `CourseList`
- `CourseCard`
- `CourseDetails`
- `Recommendations`

Include typed callback props for actions such as:

- Selecting a course
- Clearing a selection
- Enrolling
- Changing a filter

## Typed State

Type state that may contain different values.

Examples:

- A selected course or `null`
- An error message or `null`
- An array of courses
- A request-status union

Handle possibly missing values safely.

## Typed Events

Add appropriate types for:

- Text input changes
- Select changes
- Form submissions
- Button events when the event object is required

Do not use `any`.

## Typed Remote Data

Model the expected remote response.

Convert remote records into the local `Course` shape before rendering them.

Do not assume external data automatically matches the application's model.

## Type Error Practice

Intentionally create and fix:

1. A missing required prop
2. A prop with the wrong type
3. An invalid course level
4. Incompatible state initialization
5. A callback with the wrong parameter type
6. Unsafe access to a nullable course
7. A remote object missing a required property

For each error, record:

Compiler message:  
Cause:  
Correction:

## Build Verification

Run:

    npm run build

Fix every TypeScript or build error before continuing.

## Questions

1. Why should props have explicit types?
2. When should state include `null`?
3. Why is a union safer than a general string?
4. How does TypeScript validate callback props?
5. Why must remote data be modeled carefully?
6. What safety is lost when using `any`?
7. When is a shared type file useful?
8. How does TypeScript support safer refactoring?

## Extension

Create a generic component that displays loading, error, empty, or successful data states.