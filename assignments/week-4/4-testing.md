# Frontend Testing Practice

## Purpose

Add practical frontend tests to a small React TypeScript application.

This assignment focuses on behavior-first testing rather than implementation-detail testing.

## Setup

Continue from the Redux reading-list project created in week 4 assignment 3.

Use the testing examples from the lecture as a reference, but write tests for the components and services in your own reading-list application. Do not copy the `Counter` or `addUser` tests into this project.

### 1. Install the Testing Dependencies

From the root of the project, run:

```bash
npm install --save-dev jest jest-environment-jsdom @types/jest babel-jest @babel/core @babel/preset-env @babel/preset-react @babel/preset-typescript @testing-library/react @testing-library/dom @testing-library/jest-dom @testing-library/user-event identity-obj-proxy
```

These packages provide:

* Jest as the test runner
* JSDOM as a browser-like test environment
* Babel support for TypeScript and JSX
* React Testing Library for rendering and querying components
* `user-event` for realistic user interactions
* Jest DOM matchers such as `toBeInTheDocument`
* A CSS module substitute for tests

### 2. Configure Babel

Create `babel.config.cjs` in the project root:

```js
module.exports = {
  presets: [
    ['@babel/preset-env', { targets: { node: 'current' } }],
    ['@babel/preset-react', { runtime: 'automatic' }],
    '@babel/preset-typescript',
  ],
}
```

Babel transforms modern JavaScript, JSX, and TypeScript before Jest runs the tests.

Do not add the `allExtensions` or `isTSX` options.

### 3. Configure Jest

Create `jest.config.cjs` in the project root:

```js
module.exports = {
  clearMocks: true,
  restoreMocks: true,
  testEnvironment: 'jsdom',
  setupFilesAfterEnv: ['<rootDir>/jest.setup.ts'],
  testMatch: ['<rootDir>/src/**/*.test.{ts,tsx}'],
  transform: {
    '^.+\\.[jt]sx?$': 'babel-jest',
  },
  moduleNameMapper: {
    '\\.(css|less|scss|sass)$': 'identity-obj-proxy',
  },
}
```

This configuration:

* Runs component tests in JSDOM
* Loads the custom DOM matchers before every test
* Finds test files under `src`
* Transforms TypeScript and JSX
* Prevents imported style files from breaking tests
* Clears mocks and restores spies between tests

### 4. Add the Jest Types to TypeScript

In `tsconfig.app.json`, find:

```json
"types": ["vite/client"]
```

Remove it and add:

```json
"types": ["vite/client", "jest", "@testing-library/jest-dom"]
```

This allows TypeScript to recognize Jest globals and Jest DOM matchers.

### 5. Add the Test Scripts

Add the following entries to the `scripts` object in `package.json`:

```json
"test": "jest",
"test:watch": "jest --watch",
"test:coverage": "jest --coverage"
```

Do not remove the existing `dev`, `build`, `lint`, or `preview` scripts.

### 6. Verify the Configuration

Create the tests required below, and then run:

```bash
npm test
npm run build
```

Jest uses Babel to transform TypeScript, but Babel does not type-check it. Therefore, both commands must pass.

## Part 1: Select Behaviors to Test

Review your reading-list application and select behaviors that are important to its users.

Identify:

* One component that displays reading-list information
* One conditionally rendered state, such as an empty list or selected item
* One user interaction, such as adding, removing, filtering, or selecting an article
* One service function that communicates with an API, if your application has one

For each behavior, explain:

* What the user expects
* Why the behavior is important
* Whether it should be tested as rendered component behavior or as a service function

Use the lecture examples to guide the structure of your tests, but choose components, props, context, Redux state, and service functions from your own application.

## Part 2: Component Behavior Tests

Write at least three tests for components in your reading-list application.

Your tests must include:

1. A component displays the expected visible text, heading, label, or list content.
2. The rendered output changes when different props, context values, or Redux state are supplied.
3. A user interaction changes what appears on the page.

You may also test:

* An empty reading-list state
* Validation feedback
* Filtering behavior
* Selected or saved article state
* Conditional buttons or messages

Use accessible queries whenever possible:

```ts
screen.getByRole(...)
screen.getByLabelText(...)
screen.getByText(...)
```

Use userEvent for interactions:

```ts
const user = userEvent.setup()
await user.click(...)
await user.type(...)
```


## Part 3: Integration Flow Test

Write at least one test that renders multiple connected parts of the reading-list application together.

Test a realistic user flow, such as:

* Adding an article and seeing it appear in the list
* Removing an article and seeing the list update
* Filtering the list and seeing only matching articles
* Selecting an article and seeing its details
* Toggling an article's saved state

The test must:

1. Begin from a known rendered state
2. Perform at least one user interaction
3. Verify the resulting user-visible behavior

If the components depend on Redux or React context, render them with the required provider and test data.

For Redux-connected components, create a test helper or wrapper that renders the component inside a Redux `Provider`. The test should supply a known store state so the expected behavior is predictable.

Interact with the page through visible controls instead of directly calling component functions.

## Part 4: Mocked Service Test

If your reading-list application has a service function that uses `fetch`, test that service function.

If your application does not currently have a service function, create a small article service such as `createArticle`, `loadArticles`, or `saveArticle`, then write a mocked `fetch` test for that function.

Write a test that:

1. Replaces `fetch` with a Jest mock
2. Provides an appropriate mocked response
3. Calls the service function
4. Verifies that the correct API endpoint was used
5. Verifies the expected HTTP method, headers, or request body

For example, a service that creates an article could be tested with this general structure:

```ts
beforeEach(() => {
  globalThis.fetch = jest.fn()
})

test('sends the article to the API', async () => {
  const fetchMock = jest
    .spyOn(globalThis, 'fetch')
    .mockResolvedValue({
      ok: true,
    } as Response)

  // Call your application's service function.

  expect(fetchMock).toHaveBeenCalledTimes(1)
  expect(fetchMock).toHaveBeenCalledWith(
    // Add the URL and request configuration
    // required by your service.
  )
})
```

Adapt the test to your own service. Do not use the lecture’s addUser function or users endpoint.
Do not start json-server while running this unit test. The mock should prevent the test from making a real network request.
Explain:
- Why fetch is mocked
- What request behavior the assertions protect
- Why the test should produce the same result whether json-server is running or stopped



## Part 5: Regression Practice

Intentionally break one important behavior, then run the tests.

Choose one of these examples:

* An incorrect heading or label
* A broken button action
* An incorrect empty-state condition
* A list that no longer updates
* An incorrect service URL
* An incorrect HTTP method or request body

Use the test failure to identify:

Failed test:
Expected behavior:
Observed result:
Likely cause:
Correction:
Result after rerunning:

## Part 6: Test Design Review

Review your tests and explain:

* Which tests are closest to unit tests
* Which tests are integration tests
* Which tests protect the highest-value user behavior
* Which tests would be too coupled to implementation details
* Which behaviors still rely on manual verification

## Questions

1. What roles do Jest, JSDOM, Babel, and React Testing Library play?
2. Why does a component test sometimes require a Redux or context provider?
3. What makes a frontend test behavior-focused?
4. Why are accessible queries such as `getByRole` generally preferred?
5. Why should interactions be performed through rendered controls?
6. Why should `fetch` be mocked in a service unit test?
7. Why should `json-server` remain stopped during the mocked service test?
8. What does `toHaveBeenCalledWith` verify?
9. What is the difference between a component test and an integration flow test?
10. Why must `npm run build` run separately from Jest?
11. How can a failing test help identify a regression?
12. Which reading-list behavior deserves the strongest testing protection?
