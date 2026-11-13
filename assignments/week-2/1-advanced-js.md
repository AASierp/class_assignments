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

1. Declare variables using `const` by default and `let` only when reassignment is needed. - done
2. Use at least one arrow function. -done
3. Use at least one template literal to build displayed text. -done
4. Use dot notation to access one object property. - done
5. Use bracket notation to access one object property. - done
6. Read a value from a nested object. - done
7. Update a value inside the object. -done
8. Use array destructuring to pull values from the `hobbies` array. - done
9. Use object destructuring to pull values from the `user` object. -done
10. Use the spread operator to create a copy of the `user` object or one of its nested objects. -done
11. Use the rest operator in a function parameter or during destructuring. -done
12. Use the nullish coalescing operator (`??`) to provide a fallback value. - done
13. Use a ternary operator to display different text based on a condition. - done
14. Include an example that demonstrates truthy and falsy behavior. - done
15. Show the difference between block scope and function scope in your code comments or written answers.
16. Avoid using `var` in your solution. - done

## Page Behavior

Your page should display:

- A welcome message using the user’s name - done
- The user’s location from the nested `address` object - done
- A nickname display that falls back to `"Guest"` if the nickname is `null` or `undefined` - done
- A list of hobbies - done
- A message showing whether the user is logged in - done
- A section showing the result of at least two truthy/falsy checks 

## Example Features

You may include buttons such as:

- `Toggle Login` - check
- `Change Theme` - check
- `Add Hobby` - check
- `Reset Nickname` -check

At least one interaction must update the object and re-render part of the page.

## Written Questions

Answer these in complete sentences:

1. What is the difference between `||` and `??`?

|| provides and default value when the value to the left of the operator is falsy. ?? provides an alternative for null and undefined specifically.

2. Why might bracket notation be necessary instead of dot notation?



3. What is the difference between spread and rest?

The spread operator takes values and spreads them out somewhere else. While the rest operator collects values and stoer those values in a variable. 

4. What is the difference between global, function, and block scope?

A global variable can be accessed throughout the program. A function scoped variable is only accessible in the function and a block scoped variable is only accessible in the block that it was declared in.

5. Why is `const` usually preferred over `let`?

const does not allow reassignment, so unless reassignment is necessary you should you const to prevent accidental overwriting.

6. What makes objects different from primitive values?

Primitive values are simple immutable types, like strings, numbers, boolean. While an object value can be complex, a collection of both values and functions.
A object is also mutable. 

7. What is one falsy value for each of these categories: boolean, number, string, null, and undefined?

boolean: false, number: 0, string: "", null and undefined are both falsy

8. Why can `0` be a problem when using `||` for default values?

Since 0 evaluates to falsy, it may be swapped out for the default, when 0 is actually a the value you want.

9. What is hoisting?

hoisting is when something is accessible in the program prior to its definition.

10. What is the temporal dead zone?



## Extension

Add a second object, such as `adminSettings` or `accountStats`, and merge it with part of the original data using the spread operator.

## Reflection

After finishing, explain:

- where you used destructuring

I used destructuring to extract information from user into individaul vairables/objects. I also used it to extrack part of the nickNames array into individual and array variables.

- where you used spread

  I used the operator to copy the user object. I spread the contents of the user obj into a new obj variable.` 

- where you used rest

I used the rest operator in destructuring the nickNames array.
to collect the remaining values in the array into a new array variable.

- where you used `??`

  in nickName to create a default value in case the value ends up as null or undefined.

- where you demonstrated truthy/falsy behavior

- I created a box that user could input a value and be told whether or not it was a truthy or falsy value;