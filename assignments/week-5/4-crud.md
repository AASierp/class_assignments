# Rendering and Data Fetching

## Assignment

Connect the routed Next.js application to the existing `json-server` API.

Use the original endpoints and data model whenever possible.

## Part 1: Centralize Data Access

Create a data-access area such as:

```
src/lib/
├── notes.ts
└── users.ts
```

Create typed functions for existing operations, including:

* Reading notes
* Reading one note
* Creating a note
* Updating a note
* Deleting a note
* Reading or updating a user

Do not scatter base URLs and repeated request handling throughout components.

## Part 2: Server-Side Page Fetching

Use server-side fetching where it is appropriate for initial route data.

Good refactor candidates include:

* Initial note-detail data
* Initial note-edit data
* Initial dashboard note data when the current mock-session design makes this practical

The page should pass typed results into reusable UI or interactive Client Components.

Do not move a request to the server when doing so would break the assessment's existing session model. Document that decision instead.

## Part 3: Browser Fetching

Use browser-side fetching for interactions such as:

* Form submissions
* Creating notes
* Updating notes
* Deleting notes
* Profile updates
* Requests that depend on browser-only mock-session data

After a mutation, deliberately decide whether to:

* Update local state
* Navigate
* Refresh route data
* Refetch from the API

Explain the selected approach.

## Part 4: Dashboard Filtering

Preserve the assessment filters:

* Date filtering
* One or more selected tags

Choose whether filtering occurs:

* In the browser after notes are loaded, or
* Through query parameters sent to `json-server`

Do not store a second filtered notes array as independent state unless necessary.

Use URL search parameters only if doing so improves navigation or makes the filtered view shareable. Do not add them solely to demonstrate another API.

## Part 5: Route-Level States

Add predictable handling for:

* Loading
* Error
* Empty notes list
* Missing note
* Invalid route parameter

Use the relevant App Router conventions where appropriate:

* `loading.tsx`
* `error.tsx`
* `not-found.tsx`
* `notFound()`

Keep form-level errors inside the form when they do not represent a route failure.

## Part 6: Loading Boundaries

Add loading UI to the route segment that performs slower note loading.

Verify that navigation can display the route's loading state.

Avoid placing all data fetching in a shared layout merely to reuse code, because route loading boundaries do not cover uncached work performed in the parent layout.

## Part 7: Freshness Decision

For each request, document:

Data requested:
Server or browser request:
Must always be fresh?
Can it be cached?
What invalidates it?
What does stale data risk?

At minimum, evaluate:

* Notes list
* Note detail
* User profile
* Static landing-page content

## Part 8: Type Safety

Type:

* Fetch results
* Note-list props
* Note-detail props
* Route parameters
* Search parameters, if used
* Loading and error state
* Form input models

Do not solve uncertain external data with `any`.

## Focused Questions

1. What is the difference between a server request and a browser request?
2. Who can see a server-only API URL?
3. When is browser fetching necessary?
4. Why might an initial page request be performed on the server?
5. What happens when a server page waits for an uncached request?
6. What problem does a route loading boundary solve?
7. What kind of failure belongs in `error.tsx`?
8. What kind of condition belongs in `not-found.tsx`?
9. How is an empty successful response different from an error?
10. Why can frequently changing notes data become incorrect if cached too aggressively?
11. When could static generation be appropriate in this application?
12. What performance benefit can caching provide?
13. What freshness risk can caching introduce?
14. Why should API functions return explicit application types?
15. Why should route-level loading and form-submission loading be handled separately?

## Verification

Test:

* API available
* API unavailable
* No notes
* Multiple notes
* Existing note ID
* Missing note ID
* Invalid note ID
* Successful create
* Successful update
* Successful delete
* Failed create or update
* Tag filtering
* Date filtering
* Direct navigation to a note URL
