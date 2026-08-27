# React Hooks and Remote Data

### Learning Target
> I can use `useEffect` for side effects and apply dependency arrays appropriately.

## Setup

Continue using the course dashboard.

Start Vite with:

    npm run dev

Use ```https://dummyjson.com/``` or another API of your choosing.

## Request State

Create state for:

- Loading status
- Error message

Use clear initial values.

## Load Data with useEffect

Use `useEffect` to make an API request after the component first renders.

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

Make requests to different parts of the API based on different selected categories.

## Separate Responsibilities

Move response-conversion logic into a helper function.

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