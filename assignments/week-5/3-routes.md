# Server and Client Component Boundaries

## Assignment

Migrate the interactive behavior of the notes application while making deliberate Server and Client Component decisions.

Do not rewrite working React logic solely to make it look different.

## Part 1: Migrate Interactive Forms

Migrate:

* Sign-up form
* Login form
* Note editor
* Profile form
* Search and tag controls
* Log-out control

These components may require client boundaries because they use state, events, effects, or browser-based session behavior.

Keep route pages as Server Components when possible and compose the interactive form inside them.

## Part 2: Separate Page and Form Responsibilities

A route page should generally handle route-level concerns such as:

* Route parameters
* Initial data request
* Page title
* Missing-resource behavior
* Composition of page sections

A form component should generally handle:

* Controlled inputs
* Validation messages
* Submission events
* Pending state
* User interaction
* Client-side navigation after success

Review each route and move logic to the most understandable location.

## Part 3: Preserve One-Way Data Flow

When a page or parent component already has data:

1. Type the data.
2. Pass it into child components through props.
3. Pass callbacks only where interaction is needed.
4. Avoid fetching the same record again in several children without a reason.
5. Avoid copying props into state unless the state represents an editable draft.

## Part 4: Editable Draft State

For the note-edit route:

* The fetched note is source data.
* The form fields are an editable draft.
* Saving sends the draft to the API.
* Canceling should not mutate the original note.
* A successful save should navigate to the appropriate note route.

Explain why editable form values may appropriately begin from props and then become local state.

## Part 5: Browser-Only Session Behavior

Identify any existing code that uses:

* `localStorage`
* `window`
* `document`
* Browser events
* Client navigation hooks

Ensure that this code does not execute as server code.

Document the limitation of the assessment's mocked authentication. Do not describe it as production security.

## Part 6: Rendering Strategy Table

Complete this table for each route:

Route:
Server page?
Client child component?
Initial data source:
Interactive state:
Reason for the boundary:

Include all required notes-app routes.

## Focused Questions

1. Why are route pages Server Components by default?
2. Why can a Server Component not use `useState`?
3. Why can a Client Component not safely access server-only secrets?
4. Can a Server Component render a Client Component?
5. What data may be passed from a server page to a Client Component?
6. Why is it useful to keep the page server-rendered while making only the form a Client Component?
7. Why is an editable form draft different from duplicated derived state?
8. Which original hooks still belong in the refactored application?
9. Which effects can be removed because the server page now loads initial data?
10. What hydration or rendering problem could occur when browser-only values are read too early?
11. How does the server/client boundary affect the amount of JavaScript sent to the browser?
12. Which assessment features necessarily remain interactive in the browser?

## Verification

Confirm that:

* Interactive forms work.
* Server pages do not use client-only hooks.
* Browser APIs appear only behind client boundaries.
* Props and API data retain explicit TypeScript types.
* Existing user flows still behave as they did in the Vite application.
* No unnecessary duplicate requests were introduced.
