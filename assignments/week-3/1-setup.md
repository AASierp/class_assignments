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

1. Sibling elements without a wrapper -- "adjacent  jsx elements must have one parent element" (wrap everything in a div or fragment)
2. An unclosed element - [Parse_error] expected corresponding JSX closing tag for 'p' - applied closing tag
3. A `class` attribute instead of `className` - "Property "class" does not exist on type - use className
4. A JavaScript expression without curly braces - Parse Error - unexpected token. - Use curly braces

5. Incorrectly nested elements 

For each issue, record:

Error:  
Cause:  
Correction:

## Vite Review

Identify the purpose of:

- `index.html` - the single html root page entry point. Where react takes over
- `src/main.tsx` - entry point for the app - imports and uses the main component "APP"
- `src/App.tsx` - top level application component, brings together the other smaller compnents 
- `vite.config.ts` - configures vite
- `package.json` - the npm config file - has things like scripts, dependencies
- The `npm run dev` command - runs vite's server, provides a runtime environ.

## Questions

1. What is JSX? - a language extension that allows the use of an HTML like language, inside the component
2. How does JSX relate to JavaScript? jsx is js with the extension that allows an html like markup lang to be used with it.
3. What role does `main.tsx` play? main is the entry point ot the program and where the central component "APP" is rendered
4. Why must JSX be properly nested? - because it is a tree structure and valid parent child relationship are required to traverse it.
5. What do curly braces mean in JSX? that the code between them is JS and should be executed as such
6. Why should components be separated into files? - it is really more a convention than a requirement, but it promotes readability, maintainability, scalability and just feels good to be clean and orderly
7. What happens when you save a file while the Vite server is running? - it will trigger a rerender by useing "Hot Module Replacement" which allows the ui to update without having to restart app

## Extension

Add a `Sidebar` component in its own file and compose it into `App`.