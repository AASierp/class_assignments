# React State and User Interaction

### Learning Target
> I can use state to represent changing interface data and update it in response to user actions.

## Setup

Continue using the same Vite project.

Run:

    npm run dev

## Search State

Add a search input to the dashboard.

Use `useState` to store its current value.

The input must be controlled by React:

- Its displayed value comes from state.
- Typing updates state.
- The course list displays only matching titles.

## Level Filter

Add a select containing:

- All Levels
- Beginner
- Intermediate
- Advanced

Store the selected level in state.

Search and level filtering must work together.

## Selected Course

Add a `View Details` button to each `CourseCard`.

When selected:

1. Store that course in state.
2. Render a `CourseDetails` component.
3. Allow the learner to clear the selection.

## Enrollment State

Add an `Enroll` button to `CourseDetails`.

After enrollment:

- Display a confirmation message.
- Change or disable the button.
- Keep the interface driven by state.

Do not mutate state directly.

## Empty Results

When no courses match the filters, display:

    No courses match your search.

## Questions

1. What does `useState` return?
2. Why does a state update cause React to render again?
3. What is the difference between props and state?
4. Why should state not be mutated?
5. Which component should own the filter state?
6. How can a child component request a parent state update?
7. Which displayed values can be calculated instead of stored in state?

## Extension

Add a reset button that clears all filters, selections, and enrollment state.