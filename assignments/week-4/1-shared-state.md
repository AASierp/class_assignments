# Shared State, Lifted State, and State Structure

## Purpose

Extend the existing React course dashboard so multiple components coordinate around the same data.

This assignment focuses on deciding where state should live.

## Setup

Continue using the React TypeScript project from week 3.

Run:

    npm run dev

## Part 1: Identify State Ownership

List the interface values your dashboard currently uses or needs, such as:

* Search text
* Selected level filter
* Selected course
* Enrollment status
* Sort order
* Whether a details panel is open
* Whether a banner is dismissed

For each value, classify it as:

* Local component state
* Lifted parent state
* Derived data
* A possible Context candidate later

Explain why.

## Part 2: Lift Shared State

Build or refactor the dashboard so these components coordinate correctly:

* `DashboardPage`
* `FiltersPanel`
* `CourseList`
* `CourseCard`
* `CourseDetails`

At minimum:

1. Search text must affect the course list.
2. Level filter must affect the course list.
3. Selecting a course from the list must display its details elsewhere.
4. Clearing the selection must update both the list and the details area.
5. A selected course should remain valid when filters change, or be cleared intentionally when no longer visible.

Place shared state in the nearest reasonable parent.

Do not duplicate the same source of truth in multiple sibling components.

## Part 3: Avoid Derived-State Mistakes

Use the existing course data to show:

* Number of visible courses
* Number of enrolled courses
* Whether filters are active

These values should be calculated from existing state when practical instead of stored separately.

Document at least one example of state that should be derived rather than stored.

## Part 4: Structured State Updates

Add one interaction with more than one related field, such as:

* Opening a details panel while setting the selected course
* Resetting all filters and selection together
* Managing a small view-settings object

Choose either:

* Multiple related `useState` values, or
* A reducer with `useReducer`

Explain why your choice is appropriate for this level of complexity.

## Part 5: Prop Flow and Update Requests

Pass shared data downward through props.

Pass event handlers upward so child components can request state changes such as:

* Selecting a course
* Clearing filters
* Toggling enrollment
* Changing sort order

Do not let child components mutate parent-owned data directly.

## Part 6: State Review

For each major state value, record:

State value:
Owner component:
Why it belongs there:
Can it be derived:
Would Redux be excessive here:

## Questions

1. When is local component state sufficient?
2. When should state be lifted?
3. What problem does duplicated state cause?
4. What is derived state?
5. Why is storing both raw data and filtered copies often risky?
6. What makes a reducer useful?
7. When might Context be reasonable even without Redux?
8. How does thoughtful state ownership improve testability?

## Extension

Use React Context for one cross-cutting UI preference such as density or theme, then explain why that value is a better Context candidate than the course data itself.