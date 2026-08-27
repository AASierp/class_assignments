# Tailwind CSS Integration

### Learning Target
> I can install and use Tailwind CSS in a Vite React TypeScript project while preserving accessibility, consistency, reusable component design, and clear application data flow.

## Setup

Continue using the existing Vite React TypeScript course-dashboard project.

Install Tailwind CSS and the Vite integration:

    npm install tailwindcss @tailwindcss/vite

Update `vite.config.ts` to include the Tailwind Vite plugin.

In the application's main stylesheet, import Tailwind:

    @import "tailwindcss";

Confirm that the stylesheet is imported by `main.tsx`.

Start the development server:

    npm run dev

Verify that Tailwind utility classes affect the rendered interface.

## Part 1: Apply Core Utility Classes

Use Tailwind classes to style the main dashboard layout.

Your application must demonstrate utilities for:

- Background colors
- Text colors
- Font size and weight
- Width and maximum width
- Margin and padding
- Borders
- Border radius
- Shadows
- Flexbox
- Grid
- Gap
- Responsive breakpoints

Apply styles using React's `className` attribute.

Do not use inline style objects for properties that can be expressed clearly with Tailwind utilities.

## Part 2: Create a Responsive Layout

Update the course list so that it uses:

- One column on small screens
- Two columns on medium screens
- Three columns on large screens

Use responsive Tailwind prefixes such as:

- `sm:`
- `md:`
- `lg:`

Test the layout using browser responsive-design tools.

## Part 3: Style Reusable Components

Apply Tailwind classes to:

- `AppHeader`
- `CourseFilters`
- `CourseCard`
- `CourseDetails`
- `AppFooter`

Keep app-specific behavior inside the React components.

Tailwind should control presentation, not application state or business logic.

## Part 4: Create Reusable Style Patterns

Identify utility combinations that appear repeatedly.

Create at least two reusable React components that apply consistent Tailwind styles.

Possible examples include:

- `AppButton`
- `StatusBadge`
- `Panel`
- `FormField`
- `SectionHeading`

Each reusable component should:

1. Accept typed props.
2. Render appropriate semantic HTML.
3. Apply consistent Tailwind utilities.
4. Allow limited variations through props.
5. Avoid unnecessary use of `any`.

## Part 5: Add Component Variants

Add typed variants to at least one reusable component.

For example, an `AppButton` might support:

- `primary`
- `secondary`
- `danger`

A `StatusBadge` might support:

- `success`
- `warning`
- `error`
- `neutral`

Use React props to select the appropriate Tailwind classes.

Keep the number of variants limited and intentional.

## Part 6: Style Interactive States

Add visible styles for appropriate interaction states:

- Hover
- Focus
- Focus-visible
- Disabled
- Selected
- Loading

Ensure keyboard users can identify the currently focused control.

Do not remove focus outlines unless an equally visible replacement is provided.

## Part 7: Style Application States

Use Tailwind to create distinct presentation for:

- Loading
- Success
- Empty results
- Error
- Enrolled course
- Selected course

Do not communicate status using color alone.

Include text, icons, labels, or other visible indicators where appropriate.

## Part 8: Controlled Class Composition

Some Tailwind classes should change based on props or state.

Use readable conditional class logic.

Avoid constructing class names dynamically from incomplete strings because Tailwind may not detect them reliably.

Prefer complete class-name choices such as:

    isSelected
        ? "border-blue-600 bg-blue-50"
        : "border-slate-200 bg-white"

If conditional styles become difficult to read, move the class-selection logic into a helper function.

## Part 9: Accessibility Review

Confirm that:

- Inputs have visible labels.
- Buttons have clear accessible names.
- Keyboard focus is visible.
- Disabled controls remain understandable.
- Error messages are associated with the relevant controls.
- Color is not the only indication of state.
- Text maintains readable contrast.
- Layout remains usable at narrow widths.
- Interactive elements use appropriate semantic HTML.

## Part 10: Maintainability Review

Review the project for overly long or duplicated class lists.

For each repeated pattern, decide whether it belongs in:

- A reusable React component
- A helper function
- A shared class constant
- The original component because it is unique

Do not extract every class list automatically.

Create abstractions only when they make the code easier to understand and maintain.

## Required Features

The completed dashboard must include:

- Tailwind installed through the Vite project
- Tailwind imported into the main stylesheet
- Responsive utility classes
- Flexbox utilities
- Grid utilities
- Typography utilities
- Spacing utilities
- Hover and focus states
- Disabled or loading states
- At least two reusable styled components
- At least one typed visual variant
- Accessible labels and focus indicators
- No unnecessary inline styles
- No unnecessary `any`
- Clear separation between styling and application logic

## Questions

1. What problem does Tailwind solve?
2. How is Tailwind different from writing traditional CSS selectors?
3. What does a responsive prefix such as `md:` do?
4. Why should repeated utility combinations sometimes become reusable components?
5. When should a Tailwind class list remain local to one component?
6. Why should application state remain separate from Tailwind styling?
7. Why can dynamically constructed class names cause problems?
8. How can component props control visual variants safely?
9. What accessibility responsibilities remain when using Tailwind?
10. When might traditional CSS still be preferable?

## Extension

Complete one of the following:

- Add light and dark themes using Tailwind's dark-mode utilities.
- Create a reusable typed `Alert` component.
- Add responsive navigation that changes layout on small screens.
- Add animated loading feedback using motion and transition utilities.
- Create a reusable card component that accepts typed visual variants.
