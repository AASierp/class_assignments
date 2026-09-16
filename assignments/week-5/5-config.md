# Configuration and Environment Management

## Assignment

Remove hard-coded API configuration and complete the Next.js refactor.

Do not add a deployment service or unrelated API.

## Part 1: Environment Files

Create:

```
.env.local
.env.example
```

Use a server-only variable for requests made by Server Components or server-side data functions.

Use a `NEXT_PUBLIC_` variable only when a Client Component must read the value directly.

Example categories:

* Server-only mock API base URL
* Browser-exposed mock API base URL

Do not place passwords, private tokens, or real credentials in public variables.

Do not commit `.env.local`.

Commit `.env.example` with safe placeholder values.

## Part 2: Remove Hard-Coded URLs

Search the project for:

* `localhost`
* The `json-server` port
* Repeated API route strings
* Vite environment-variable names

Replace duplicated configuration with the appropriate Next.js environment variables and data-access helpers.

## Part 3: Build-Time and Runtime Review

For each environment value, record:

Variable:
Used by server or browser code:
Secret or public:
Required while building:
Required while running:
What happens if it is missing:

Explain that a browser-exposed variable becomes part of browser-delivered code and must not contain secrets.

## Part 4: Configuration Files

Review:

* `next.config.ts`
* `tsconfig.json`
* `eslint.config.mjs`
* `package.json`
* `.gitignore`
* Environment files

For each file, explain:

1. Its purpose
2. Whether the project currently needs customization
3. What kind of mistake in that file could break the application

Do not add configuration merely to make the file look more complex.

## Part 5: Troubleshooting Practice

Intentionally create and correct:

1. A misspelled environment-variable name
2. A missing public prefix for a value needed in a Client Component
3. A server-only value incorrectly exposed as public
4. An incorrect API port
5. A malformed dynamic-route folder
6. An import-alias error
7. A production-build error that did not block development immediately

For each issue, record:

Symptom:
Development-server output:
Browser output:
Build output:
Cause:
Correction:
Verification:

## Part 6: Verify Before External Integration

Before relying on `json-server`, verify routes and components with typed local fixture data.

Confirm:

* Every route renders
* Layouts appear correctly
* Dynamic parameters are read correctly
* Forms render and validate
* Loading UI renders
* Empty UI renders
* Error UI can render
* Components accept the expected props
* Navigation reaches the correct URL

Then reconnect the API.

This separates page and component problems from network and API problems.

## Part 7: Final Refactor Review

Compare the original Vite application with the Next.js application.

Confirm that the Next.js version still supports:

* Sign up
* Login
* Logout
* Profile editing
* Note creation
* Note editing
* Note deletion
* Note listing
* Note details
* Date filtering
* Multiple-tag filtering
* Persistent `db.json` data

Do not count the refactor as complete if framework setup works but an original feature is missing.

## Part 8: Production Build

Run:

```
npm run lint
npm run build
npm start
```

Use the exact scripts available in the generated project.

Test the production server separately from the development server.

Verify that environment configuration is available in the intended environment.

## Focused Questions

1. What is the purpose of `next.config.ts`?
2. What is the purpose of `tsconfig.json`?
3. What does the import alias change?
4. Why is `.env.local` normally ignored by Git?
5. What does the `NEXT_PUBLIC_` prefix mean?
6. Why must public environment values never contain secrets?
7. What is the difference between build-time and runtime configuration?
8. Why might changing an environment file require restarting the development server?
9. Why can the application work in development but fail during a production build?
10. How can an incorrect API base URL appear as a rendering problem?
11. How can a malformed route folder affect navigation?
12. Why should components be verified with fixture data before API integration?
13. Which concerns belong in routes?
14. Which concerns belong in reusable UI components?
15. Which concerns belong in data-access modules?
16. How did the framework refactor change routing, rendering, and data loading?
17. Which original React and TypeScript practices remained unchanged?

## Final Submission Evidence

Submit:

* Next.js repository
* Updated README
* Route map
* Server/Client Component decision table
* Environment-variable example file
* Data-fetching decision table
* Completed migration checklist
* Passing lint output
* Passing production-build output
* Brief comparison of the Vite and Next.js versions
