Next.js Foundations

## Assignment

Begin the notes-app refactor by migrating shared types, reusable presentation components, and the landing page.

Do not migrate authentication or note CRUD behavior yet.

## Part 1: Reuse Existing React Knowledge

Move reusable presentation components that do not depend on routing or browser state.

Possible components include:

* Button
* Form field
* Page heading
* Note card
* Tag badge
* Empty-state message
* Loading indicator
* Error message

Preserve:

* Typed props
* Semantic HTML
* Accessible labels
* Existing class names
* Existing component behavior

Do not add `"use client"` automatically.

## Part 2: Rebuild the Landing Page

Use `src/app/page.tsx` for the landing page.

The page should provide navigation to:

* Sign up
* Log in

Preserve the purpose and content of the original landing view.

Do not add state or effects unless the landing page genuinely requires interaction.

## Part 3: Classify Components

For every migrated component, classify it as one of these:

* Server Component
* Client Component
* Not yet migrated

A component should normally remain a Server Component when it only:

* Receives props
* Returns JSX
* Formats data
* Composes other noninteractive components

A component requires a client boundary when it uses:

* State
* Event handlers
* Effects
* Browser APIs
* Custom hooks that depend on client features

## Part 4: Compare Rendering Approaches

For each notes-app view, choose the most reasonable high-level approach:

* Static or prerendered output
* Server-rendered output
* Client-rendered interactive output
* A server page containing smaller Client Components

Classify:

* Landing page
* Sign-up form
* Login form
* Notes dashboard
* Note editor
* Note detail
* Profile settings

Your answer should describe an initial design decision. It may change as the refactor progresses.

## Part 5: Verify Existing Styling

Move only the styles needed by the migrated components.

Organize styling into:

* Global styles
* Reusable component styles
* Route-specific styles

Confirm that the landing page remains usable at narrow and wide viewport sizes.

## Focused Questions

1. How is Next.js different from a client-only Vite React application?
2. What work can Next.js perform before JavaScript reaches the browser?
3. What is a Server Component?
4. What is a Client Component?
5. Why should `"use client"` be placed at the smallest reasonable boundary?
6. Why does a component with an `onClick` handler require client execution?
7. Which parts of the original notes app can render without browser JavaScript?
8. Which parts require browser state or event handlers?
9. At a high level, when is static output appropriate?
10. At a high level, when is server rendering appropriate?
11. When is client rendering appropriate?
12. How do framework conventions reduce configuration while also limiting file placement?

## Verification

Before continuing:

* The project builds.
* The landing page renders.
* Shared types compile.
* Migrated presentation components preserve their behavior.
* No component contains an unnecessary client directive.
* No unrelated features have been added.
