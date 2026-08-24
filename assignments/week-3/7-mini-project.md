# Week 3 Vite React Course Dashboard

### Learning Target
> I can combine Vite, JSX, components, props, state, hooks, TypeScript, and a UI component library into a maintainable React application.

## Project Setup

Use these commands during development:

    npm run dev
    npm run build
    npm run preview

Use `npm run dev` while developing.

Use `npm run build` to verify the production build.

Use `npm run preview` to inspect the built application locally.

## Required Structure

Use a structure similar to:

    src/
    ├── components/
    │   ├── AppHeader.tsx
    │   ├── CourseFilters.tsx
    │   ├── CourseList.tsx
    │   ├── CourseCard.tsx
    │   ├── CourseDetails.tsx
    │   ├── Recommendations.tsx
    │   └── AppFooter.tsx
    ├── data/
    │   └── courses.ts
    ├── hooks/
    │   └── useRecommendations.ts
    ├── styles/
    │   └── app.css
    ├── types/
    │   └── course.ts
    ├── utils/
    │   └── courseFilters.ts
    ├── App.tsx
    └── main.tsx

## Required Features

The application must include:

- Valid JSX
- At least five functional components
- Reusable typed props
- A typed course model
- A course list rendered from data
- Search and level filters
- Selected-course details
- Enrollment state
- Remote recommendation data
- Loading, success, empty, and error states
- At least one appropriate `useEffect`
- Correct effect dependencies
- Typed form or input events
- No unnecessary `any`
- At least four library components
- Visible focus states
- Accessible labels
- Responsive layout

## Architecture Requirements

- Components should have clear responsibilities.
- Shared types should not be duplicated.
- Calculated values should not become unnecessary state.
- Side-effect logic should not be placed in rendering code.
- App-specific logic should not be hidden inside UI-library wrappers.
- Remote data should be converted into the local application model.
- Rendered lists should use stable keys.

## Required Verification

Before submitting:

1. Run `npm run dev`.
2. Test every interaction.
3. Check the browser console.
4. Test loading and failure states.
5. Test with only the keyboard.
6. Run `npm run build`.
7. Fix every build and type error.
8. Run `npm run preview`.
9. Inspect the production version.
10. Remove unused files, imports, state, and logging.

## Reflection

1. Which component owns each state value?
2. Which information flows through props?
3. Which logic belongs in a helper?
4. Which logic belongs in a custom hook?
5. What TypeScript error prevented a runtime problem?
6. Which UI-library components were used?
7. Which components are specific to this application?
8. Which effect dependencies were required?
9. How did Vite support the development process?
10. What would need improvement before production use?

## Extension

Add one feature:

- Local-storage persistence
- Course sorting
- Pagination
- A reusable modal
- A custom fetching hook
- A reducer for complex state
- Automated component tests