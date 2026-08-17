
# TypeScript Tooling and Builds Practice

### Learning Target
> I can configure, compile, and troubleshoot a basic TypeScript project.

## Assignment

Create a project folder named `typescript-build-practice`.

The project should contain:

- A `src` folder for TypeScript source files
- A `dist` folder for compiled JavaScript
- A `tsconfig.json` file
- A `package.json` file
- At least one `.ts` source file

## Part 1: Project Setup

Initialize the project with npm.

Install TypeScript as a development dependency.

Create a TypeScript configuration file using the TypeScript compiler.

Configure the project so that:

- Source files come from `src`
- Compiled files go into `dist`
- Strict type checking is enabled
- JavaScript uses a modern language target
- CommonJS or ES modules are selected intentionally

## Part 2: Source and Output

Create `src/index.ts`.

Add:

- A typed variable
- A typed object
- A typed function
- A call to that function
- A console message displaying the result

Run the TypeScript compiler.

Locate the generated JavaScript file in `dist`.

Compare the TypeScript source with the JavaScript output.

Do not edit the generated JavaScript directly.

## Part 3: Build Commands

Add npm scripts for:

- Building the project once
- Watching for TypeScript changes

Run both scripts and verify that the JavaScript output updates when the TypeScript source changes.

## Part 4: Error Practice

Intentionally introduce these errors:

1. Assign the wrong type to a variable.
2. Call a function with a missing argument.
3. Access a property that does not exist.
4. Return the wrong type from a function.

For each error:

1. Read the compiler message.
2. Identify the file and line number.
3. Explain the expected and received types.
4. Correct the source code.
5. Rebuild the project.

## Configuration Review

Locate and briefly explain these `tsconfig` options:

- `target`
- `module`
- `rootDir`
- `outDir`
- `strict`
- `sourceMap`
- `noEmitOnError`

## Questions

1. What is the purpose of the TypeScript compiler?
2. What is the purpose of `tsconfig.json`?
3. What is the difference between `src` and `dist`?
4. Why should generated JavaScript usually not be edited directly?
5. What does strict type checking do?
6. What information does a compiler error provide?
7. What is watch mode useful for?
8. What does `noEmitOnError` change?

## Extension

Enable source maps and use VS Code to connect a runtime error in the compiled JavaScript back to the original TypeScript source.
