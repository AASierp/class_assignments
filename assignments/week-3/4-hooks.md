# React Hooks and Remote Data

### Learning Target
> I can use `useEffect` for side effects and apply dependency arrays appropriately.

## Setup

Continue using the course dashboard.

Start Vite with:

    npm run dev

Use a practice API selected by your instructor.

## Request State

Create state for:

- Remote recommendations
- Loading status
- Error message
- Selected recommendation category

Use clear initial values.

## Load Data with useEffect

Use `useEffect` to request recommendations after the component first renders.

The effect must:

1. Set loading to true.
2. Clear the previous error.
3. Call `fetch`.
4. Check the response.
5. Parse the JSON.
6. Store the data in state.
7. Catch failures.
8. Clear loading when finished.

Use an empty dependency array when the request should run only once.

## Request States

Display distinct UI for:

- Loading
- Success
- Empty results
- Error

Only the appropriate state should appear.

## Dependency Practice

Modify the request so it depends on the selected category.

Include the category in the dependency array.

Experiment with:

1. Including the dependency
2. Omitting the dependency
3. Adding an unnecessary changing dependency

Record what happens in each case.

## Separate Responsibilities

Move response-conversion logic into a helper function.

Create a separate component for recommendation cards.

Keep the effect focused on the side effect itself.

## Side-Effect Classification

For each item, state whether it belongs in an effect:

- Filtering an existing array
- Updating the browser document title
- Fetching remote data
- Handling a button click
- Subscribing to a browser event
- Calculating a course count

Explain each choice.

## Questions

1. What is a side effect?
2. When does an effect with `[]` run?
3. What happens when an effect dependency changes?
4. What problem can a missing dependency cause?
5. What problem can an unnecessary dependency cause?
6. Why should calculated display data usually not require an effect?
7. When should logic move to a helper or component?

## Extension

Use `AbortController` to cancel an unfinished request during effect cleanup.