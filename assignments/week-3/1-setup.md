# Vite, JSX, and React Project Structure

### Learning Target
> I can create a Vite React TypeScript project, write valid JSX, and organize the project into reusable files and folders.

## Project Setup

In a terminal, run:

    npm create vite@latest react-course-dashboard -- --template react-ts
    cd react-course-dashboard
    npm install
    npm run dev

Open the local URL shown in the terminal.

Keep the development server running while working.

## Assignment

Remove the starter demonstration code from `App.tsx` and create a small course dashboard.

Organize `src` like this:

    src/
    ├── components/
    │   ├── Header.tsx
    │   ├── CourseCard.tsx
    │   └── Footer.tsx
    ├── data/
    │   └── courses.ts
    ├── styles/
    │   └── app.css
    ├── App.tsx
    └── main.tsx

Create:

- A `Header` component with a heading and navigation
- A `CourseCard` component with a title and description
- A `Footer` component
- An `App` component that composes the other components

Each component must:

- Be a function
- Return valid JSX
- Use properly nested elements
- Use `className` instead of `class`
- Return one parent element or a fragment

## JSX Expressions

Create variables for:

- The dashboard title
- The learner's name
- The number of courses

Display each value using JSX expressions.

Add a conditional message based on whether courses are available.

## JSX Error Practice

Intentionally create and fix:

1. Sibling elements without a wrapper
2. An unclosed element
3. A `class` attribute instead of `className`
4. A JavaScript expression without curly braces
5. Incorrectly nested elements

For each issue, record:

Error:  
Cause:  
Correction:

## Vite Review

Identify the purpose of:

- `index.html`
- `src/main.tsx`
- `src/App.tsx`
- `vite.config.ts`
- `package.json`
- The `npm run dev` command

## Questions

1. What is JSX?
2. How does JSX relate to JavaScript?
3. What role does `main.tsx` play?
4. Why must JSX be properly nested?
5. What do curly braces mean in JSX?
6. Why should components be separated into files?
7. What happens when you save a file while the Vite server is running?

## Extension

Add a `Sidebar` component in its own file and compose it into `App`.