# JavaScript and Browser APIs Practice

## Assignment

Create a page containing:

- A **Load Users** button
- A status message
- A user list

Request data from:

`https://jsonplaceholder.typicode.com/users`

Your JavaScript must:

1. Use an `async` function.
2. Display a loading message.
3. Call `fetch`.
4. Check `response.ok`.
5. Read the response using `response.json()`.
6. Loop through the returned users.
7. Display each user's name and email.
8. Catch and display errors.
9. Re-enable the button after the request completes.

Use the browser Network tab to inspect the request.

Record:

- Request URL
- Request method
- Status code
- Response type

## Questions

1. What does `fetch` return?
2. What does `await` do?
3. What does `response.json()` do?
4. Why should `response.ok` be checked?
5. What is the difference between an HTTP error and a network failure?
6. Why should the page display a loading state?
7. What is JSON?

## Extension

Test the application with an invalid URL and with the browser set to offline mode.