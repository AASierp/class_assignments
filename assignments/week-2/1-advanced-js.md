# JavaScript Syntax, Objects, and Scope Practice

## Assignment

*This is a bit of a catch-all of some intermediate concepts I didn't want you to miss. Lots of googling to be done here.*

Create a small profile and settings page in plain JavaScript.

Your page must model and display information about a user, allow updates to that data, and demonstrate modern JavaScript syntax features.

## Starter Data

Create a `user` object with:

- `name`
- `age`
- `isLoggedIn`
- `address` as a nested object with:
  - `city`
  - `state`
- `preferences` as a nested object with:
  - `theme`
  - `nickname`
- `hobbies` as an array

## Requirements

Your application must:

1. Declare variables using `const` by default and `let` only when reassignment is needed.
2. Use at least one arrow function.
3. Use at least one template literal to build displayed text.
4. Use dot notation to access one object property.
5. Use bracket notation to access one object property.
6. Read a value from a nested object.
7. Update a value inside the object.
8. Use array destructuring to pull values from the `hobbies` array.
9. Use object destructuring to pull values from the `user` object.
10. Use the spread operator to create a copy of the `user` object or one of its nested objects.
11. Use the rest operator in a function parameter or during destructuring.
12. Use the nullish coalescing operator (`??`) to provide a fallback value.
13. Use a ternary operator to display different text based on a condition.
14. Include an example that demonstrates truthy and falsy behavior.
15. Show the difference between block scope and function scope in your code comments or written answers.
16. Avoid using `var` in your solution.

## Page Behavior

Your page should display:

- A welcome message using the user’s name
- The user’s location from the nested `address` object
- A nickname display that falls back to `"Guest"` if the nickname is `null` or `undefined`
- A list of hobbies
- A message showing whether the user is logged in
- A section showing the result of at least two truthy/falsy checks

## Example Features

You may include buttons such as:

- `Toggle Login`
- `Change Theme`
- `Add Hobby`
- `Reset Nickname`

At least one interaction must update the object and re-render part of the page.

## Written Questions

Answer these in complete sentences:

1. What is the difference between `||` and `??`?
2. Why might bracket notation be necessary instead of dot notation?
3. What is the difference between spread and rest?
4. What is the difference between global, function, and block scope?
5. Why is `const` usually preferred over `let`?
6. What makes objects different from primitive values?
7. What is one falsy value for each of these categories: boolean, number, string, null, and undefined?
8. Why can `0` be a problem when using `||` for default values?
9. What is hoisting?
10. What is the temporal dead zone?

## Extension

Add a second object, such as `adminSettings` or `accountStats`, and merge it with part of the original data using the spread operator.

## Reflection

After finishing, explain:

- where you used destructuring
- where you used spread
- where you used rest
- where you used `??`
- where you demonstrated truthy/falsy behavior