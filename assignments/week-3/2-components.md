# React Components, Props, and Composition

### Learning Target
> I can build reusable components, pass data through props, and compose smaller components into a larger interface.

## Setup

Continue using the `react-course-dashboard` Vite project.

Start the development server when needed:

    npm run dev

## Course Data

In `src/data/courses.ts`, create an array containing at least three course objects.

Each course must contain:

- `id`
- `title`
- `description`
- `duration`
- `level`

## CourseCard Component

Update `CourseCard` so it receives its data through props.

Display:

- Title
- Description
- Duration
- Level

Do not hard-code course information inside the component.

## CourseList Component

Create `src/components/CourseList.tsx`.

It must:

1. Receive the courses through props.
2. Use `map` to render them.
3. Render one `CourseCard` per course.
4. Give each rendered item a stable `key`.

Render `CourseList` from `App`.

## Optional Props

Add an optional `featured` prop to `CourseCard`.

When it is true, display:

    Featured Course

Use the same component for both featured and standard courses.

## Component Composition

The application should now include:

- `App`
- `Header`
- `CourseList`
- `CourseCard`
- `Footer`

Course data should flow downward through props.

Child components must not modify their props.

## Questions

1. What is a React component? - it is a function that returns jsx
2. What are props? - they are properties that are passed from a parent comp to a child comp
3. Why are props treated as read-only? - the parent owns the data, it should not be modified by the child
4. What is one-way data flow? - the data flows in one direction, top to bottom, parent to child, through props.
5. Why is `CourseCard` more reusable when it receives props? - because it allows you to pass different data inside. Rather than hard coding values.
6. Why does React require keys for rendered lists? It has something to do with managing state - it needs a reference so it knows what to change, when changes occur. 
7. What is component composition? - creating a larger component for smaller components. (APP.jsx)

## Extension

Create a reusable `Badge` component for course level and featured status.