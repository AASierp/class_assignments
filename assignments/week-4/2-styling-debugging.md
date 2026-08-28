# Styling and Debugging React Components

### Learning Targets

> I can apply consistent React component styling, organize reusable style patterns, and debug component behavior using rendered output, props, state, and browser tools.

## Purpose

Improve the existing React TypeScript course dashboard so it is easier to use, easier to maintain, and easier to troubleshoot.

This assignment combines styling decisions with debugging practice because unclear component structure often causes both visual and behavioral problems.

## Setup

Continue using the React TypeScript dashboard project from week 3 and week 4 assignment 1.

Run:

    npm run dev

Use browser developer tools while working.

## Part 1: Style Audit

Review the current dashboard and identify styling problems such as:

* Inconsistent spacing
* Weak visual hierarchy
* Unclear selected states
* Poor button consistency
* Hard-to-read text
* Missing empty-state styling
* Layout issues at narrow widths
* Focus styles that are missing or difficult to see

Record at least five issues before changing the UI.

For each issue, note:

Issue:
Where it appears:
Why it matters:
How you plan to improve it:

## Part 2: Apply a Consistent Styling Approach

Choose one styling approach already appropriate to the project setup, such as:

* Shared CSS classes
* CSS modules
* A UI library with limited custom CSS
* Tailwind utilities

Use the approach consistently.

Do not mix several unrelated styling strategies unless there is a clear reason.

Keep application logic separate from presentation rules.

## Part 3: Improve Layout and Readability

Refine the dashboard so that the interface includes clearer styling for:

* Page header
* Filter controls
* Course list layout
* Course cards
* Selected-course details
* Empty results
* Enrollment confirmation or status

At minimum, improve:

1. Spacing
2. Typography
3. Alignment
4. Visual grouping
5. Button consistency
6. Responsive behavior

The layout should remain usable on both narrow and wide screens.

## Part 4: Reusable Style Patterns

Identify repeated presentation patterns and extract at least two reusable style solutions.

Possible examples:

* A shared button style
* A panel or card wrapper
* A badge for level or status
* A form-field wrapper
* A reusable empty-state block

Each reusable style pattern should:

1. Reduce repetition
2. Keep names clear
3. Preserve semantic HTML
4. Avoid hiding application-specific logic inside styling abstractions

Explain why each extracted pattern improves maintainability.

## Part 5: Conditional Styling

Use state or props to show distinct styling for UI conditions such as:

* Selected course
* Enrolled course
* Active filter
* Disabled button
* Empty-state message
* Error or warning message

Keep the conditional logic readable.

Prefer clear class choices over deeply nested conditional expressions.

## Part 6: Accessibility and Usability Review

Verify that the interface includes:

* Visible labels
* Visible keyboard focus
* Sufficient contrast
* Clear button text
* Distinct selected states
* Status communication that does not rely only on color
* Reasonable spacing for readability

If you remove a default browser focus style, replace it with an equally visible alternative.

## Part 7: Debugging Practice

Intentionally create and then fix at least four React-related problems.

Choose from issues such as:

* Passing the wrong prop value
* Forgetting a required prop
* Rendering a stale selected item after filters change
* Using the wrong key in a rendered list
* Putting side-effect logic in rendering code
* Incorrect conditional rendering
* A button click updating the wrong state
* A layout bug caused by incorrect component structure
* A style rule not applying because the selector or class name is wrong

For each problem, record:

Bug:
Symptom:
How you investigated:
Cause:
Correction:
How you verified the fix:

## Part 8: Debug with Tools

Use browser developer tools.

Investigate at least these areas:

1. Rendered DOM structure
2. Applied classes or styles
3. Props passed into a component
4. State values affecting rendering
5. Event behavior after a user action

Explain which tool helped most for each issue you inspected.

## Part 9: Re-render Reasoning

Choose one interaction such as:

* Typing in the search field
* Changing the level filter
* Selecting a course
* Enrolling in a course

Explain:

* Which component state changed
* Which components re-rendered
* Which rendered values changed because of props
* Which values were derived rather than stored

Use this to explain why React updated the UI.

## Questions

1. What makes a styling approach consistent in a React project?
2. When should a repeated visual pattern become reusable?
3. Why should styling logic stay separate from application data logic?
4. What clues help determine whether a bug comes from props, state, rendering, or styling?
5. Why can incorrect keys cause confusing UI behavior?
6. What is the risk of storing values that could be derived during rendering?
7. Why is visible focus important?
8. How do developer tools help debug React components more efficiently?
9. Why is it useful to understand why a component re-rendered?
10. What makes a component easier to debug and maintain?

## Extension

Create a small theme or density preference and apply it consistently across multiple components, then explain why that value might be a Context candidate.