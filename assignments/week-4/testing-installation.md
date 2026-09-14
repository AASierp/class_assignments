# Jest Testing Setup

Follow these steps to add Jest and React Testing Library to this Vite, React, and TypeScript project.

## 1. Install the testing dependencies

Open a terminal in the run:

```bash
npm install --save-dev jest jest-environment-jsdom @types/jest babel-jest @babel/core @babel/preset-env @babel/preset-react @babel/preset-typescript @testing-library/react @testing-library/dom @testing-library/jest-dom @testing-library/user-event identity-obj-proxy
```

Use these packages to run Jest, render React components, provide a browser-like test environment, transform TypeScript and JSX, and add DOM-specific assertions.

## 2. Configure Babel

Add `babel.config.cjs` to the root of `my-app`:

```js
module.exports = {
  presets: [
    ['@babel/preset-env', { targets: { node: 'current' } }],
    ['@babel/preset-react', { runtime: 'automatic' }],
    '@babel/preset-typescript',
  ],
}
```

Use Babel to transform modern JavaScript, React JSX, and TypeScript before Jest runs each test.

Do not add the `allExtensions` or `isTSX` options. Babel 8 no longer supports those options.

## 3. Configure Jest

Add `jest.config.cjs` to the root of `my-app`:

```js
module.exports = {
  clearMocks: true,
  restoreMocks: true,
  testEnvironment: 'jsdom',
  setupFilesAfterEnv: [],
  testMatch: ['<rootDir>/src/**/*.test.{ts,tsx}'],
  transform: {
    '^.+\\.[jt]sx?$': 'babel-jest',
  },
  moduleNameMapper: {
    '\\.(css|less|scss|sass)$': 'identity-obj-proxy',
  },
}
```

Use `jsdom` to provide browser APIs such as `document` and `window` to component tests.

Clear mock usage data and restore spies between tests to prevent one test from affecting another.

## 5. Add the Jest types to TypeScript

In `tsconfig.app.json`, find:

```json
"types": ["vite/client"],
```

Remove it and add:

```json
"types": ["vite/client", "jest", "@testing-library/jest-dom"],
```

Allow TypeScript to recognize Jest globals and React Testing Library matchers.

## 6. Add the test scripts

In the `scripts` section of `package.json`, add:

```json
"test": "jest",
"test:watch": "jest --watch",
"test:coverage": "jest --coverage"
```