# Assignment 2: Notes Application Routing

## Assignment

Replace the original application's view-switching with App Router routes.

## Required Routes

Create this route structure:

```
src/app/
├── layout.tsx
├── page.tsx
├── login/
│   └── page.tsx
├── signup/
│   └── page.tsx
├── dashboard/
│   ├── layout.tsx
│   └── page.tsx
├── notes/
│   ├── new/
│   │   └── page.tsx
│   └── [noteId]/
│       ├── page.tsx
│       └── edit/
│           └── page.tsx
└── profile/
    └── page.tsx
```

The resulting URLs should include:

* `/`
* `/login`
* `/signup`
* `/dashboard`
* `/notes/new`
* `/notes/123`
* `/notes/123/edit`
* `/profile`

## Part 1: Root Layout

Use the root layout for application-wide structure such as:

* Document language
* Global stylesheet
* Application name or metadata
* Content wrapper

Do not place authenticated dashboard controls in the root layout if they should not appear on login and sign-up pages.

## Part 2: Dashboard Layout

Use the dashboard layout for shared authenticated-area UI, such as:

* Dashboard navigation
* Profile link
* Create-note link
* Log-out control
* Main content region

The layout should render its child route through the `children` prop.

## Part 3: Navigation

Replace ordinary internal anchor navigation with the Next.js navigation component where appropriate.

Confirm that users can move among:

* Dashboard
* New note
* Note detail
* Note editing
* Profile settings
* Login or landing page after logout

Use meaningful URL paths rather than storing the current view only in component state.

## Part 4: Dynamic Note Route

Use `[noteId]` for the note-detail route.

Type the route parameter.

In the current App Router, treat the route `params` value as asynchronous and retrieve `noteId` before using it.

Use the same dynamic segment for the note-edit route.

## Part 5: Invalid IDs

Decide how the application should behave when:

* The note ID is not a number, if your IDs are numeric
* The note does not exist
* The note belongs to a different user
* The API cannot be reached

At this stage, document the behavior and create the necessary route-level placeholder UI. Data integration occurs in the next assignment.

## Part 6: URL Design Review

For every route, record:

Route:
Purpose:
Static or dynamic segment:
Shared layout:
Expected navigation source:
Expected destination after completion:

## Focused Questions

1. How does a folder become a URL segment?
2. What makes a route publicly accessible?
3. What is the purpose of `page.tsx`?
4. What is the purpose of `layout.tsx`?
5. Why should the dashboard use a nested layout?
6. What state can a layout preserve while users navigate between child routes?
7. Why is `/notes/[noteId]` preferable to a separate file for every note?
8. How does the URL communicate application structure?
9. What is the difference between a route parameter and a search parameter?
10. Why should note creation and note editing have different URLs?
11. Which components should be shared across these routes?
12. Which components should remain specific to one route?

## Verification

Confirm that:

* Every required URL renders.
* Navigation works without manually changing the URL.
* The root layout appears on every page.
* Dashboard navigation appears only where intended.
* Multiple note IDs use the same dynamic route.
* Refreshing a nested URL still loads the expected page.
* The project builds without route or type errors.
