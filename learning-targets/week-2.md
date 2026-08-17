## Week 2 – Learning Targets

### JavaScript Syntax, Objects, and Scope
1. I can use `const` by default and `let` only when reassignment is necessary.
2. I can use modern JavaScript syntax such as arrow functions, template literals, ternary expressions, and the nullish coalescing operator (`??`) in practical code.
3. I can work with objects and arrays using dot notation, bracket notation, nested property access, destructuring, and the spread operator.
4. I can explain the difference between spread and rest and identify practical use cases for each.
5. I can model application state with nested objects and arrays, update that state, and re-render UI based on changes.
6. I can distinguish between truthy and falsy values and explain when `||` and `??` produce different results.
7. I can explain the difference between global, function, and block scope, including hoisting and the temporal dead zone.
8. I can explain how objects differ from primitive values in JavaScript.

---

### TypeScript Fundamentals
1. I can explain why TypeScript is used in JavaScript applications and what problems static typing helps prevent.
2. I can add explicit type annotations to variables, function parameters, and return values.
3. I can distinguish between common TypeScript types such as `string`, `number`, `boolean`, arrays, unions, and object types.
4. I can define object shapes with interfaces or type aliases and use them to model application data.
5. I can use union types to represent a limited set of valid values.
6. I can identify, interpret, and correct common TypeScript compile-time errors.
7. I can use intersection types to combine multiple object shapes into a single type.
8. I can use enums to define a limited set of named values.
9. I can narrow types safely using guards such as typeof, in, and instanceof.
10. I can explain the difference between any, unknown, never, and void.
11. I can use type assertions when TypeScript needs more information about a value.

---

### Interfaces, Type Composition, and Generics
1. I can define interfaces that describe consistent object shapes across an application.
2. I can extend interfaces to build more specific models from shared base data.
3. I can compose reusable types to reduce duplication and represent derived data clearly.
4. I can write generic functions and generic types that preserve type information while remaining reusable.
5. I can explain when a generic solution is appropriate and when it is unnecessarily complex.
6. I can model reusable structures such as API responses, paginated data, and collections using appropriate TypeScript patterns.

---

### TypeScript Tooling and Builds
1. I can initialize a basic TypeScript project with `package.json`, `tsconfig.json`, source files, and compiled output folders.
2. I can configure a TypeScript build so source files come from `src`, compiled files are emitted to `dist`, and strict type checking is enabled.
3. I can explain the purpose of key `tsconfig` options such as `target`, `module`, `rootDir`, `outDir`, `strict`, `sourceMap`, and `noEmitOnError`.
4. I can run the TypeScript compiler directly and through npm scripts for both one-time builds and watch mode.
5. I can distinguish between source TypeScript files and generated JavaScript output and explain why compiled files usually should not be edited directly.
6. I can use compiler output to locate errors, understand expected versus received types, and correct source code efficiently.
7. I can apply utility types such as Partial, Readonly, and Record to simplify and reuse object typing.

### Classes and Async TypeScript
1. I can use access modifiers such as public, private, and protected in classes.
2. I can use readonly in classes to protect values that should not change after creation.
3. I can type asynchronous code using Promise<T> and async/await.