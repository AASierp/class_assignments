# (OPTIONAL) Assignment 8: Git Bash Shell, Scripting, and Environment Variables

This is an adaptation of some assignments I wrote for a DevOps focused ETS cohort. The vocabulary of the work will be tilted in that direction. This assignment is a purely optional extension. I think it could support you in the future but it will not be necessary for our training course.

---

Work in **Git Bash**

---

## Part 1: Git Bash Shell Practice

### 1. Check your current directory
Run:

```bash
pwd
```

Answer:
- What directory are you currently in?

---

### 2. Create a practice folder and move into it
Run:

```bash
mkdir practice
cd practice
```

Answer:
- What does `mkdir` do?
- What does `cd` do?

---

### 3. Create two subfolders
Run:

```bash
mkdir notes
mkdir drafts
```

Try moving into each folder and back out:

```bash
cd notes
cd ..
cd drafts
cd ..
```

List the contents of the current directory:

```bash
ls
```

Answer:
- What does `..` mean in a path?
- What command shows the contents of the current directory?

Decide where you want to save your files for the rest of this assignment. Future steps assume you are working inside `notes`.

---

### 4. Create an empty file
Inside `notes`, run:

```bash
touch todo.txt
```

Answer:
- What does `touch` do?

---

### 5. Write text into the file
Run:

```bash
echo "Learn Git Bash commands" > todo.txt
cat todo.txt
```

Answer:
- What does `>` do?
- What do you think happens if you run the same `echo ... > todo.txt` command again?

Try it and confirm.

---

### 6. Append another line
Run:

```bash
echo "Practice Bash scripting" >> todo.txt
cat todo.txt
```

Answer:
- What is the difference between `>` and `>>`?

---

### 7. Copy the file
Run:

```bash
cp todo.txt ../drafts/
```

Answer:
- What does `../` mean?

---

### 8. Delete the copied file
Move into `drafts` and remove the copied file:

```bash
cd ../drafts
rm todo.txt
ls
```

Answer:
- How can you verify the file is gone?

---

### 9. Optional cleanup
If you want to remove everything you created, move to the parent of `practice` and run:

```bash
rm -rf practice
```

Warning:
- This permanently deletes the folder and everything inside it.

---

## Part 2: Bash Scripting Exercises

Create one or more `.sh` files and complete the following exercises in Bash.

### Required exercises
1. Write a script that prints a greeting to the console and includes your name and today’s date.
2. Store two numbers in variables and print their sum, difference, product, and quotient.
3. Prompt the user for their name and age using `read`, then print a message using both values.
4. Ask the user for a number and determine whether it is positive, negative, or zero using `if`, `elif`, and `else`.
5. Print the numbers 1 through 10 using a loop.
6. Create a text file and write five lines of text to it, storing the filename in a variable.
7. Read a text file and display each line with its line number starting at 1.
8. Check whether a folder exists and create it if it does not.
9. Write a function that accepts a name and returns or prints a greeting.
10. Prompt the user for a number between 1 and 10 and keep prompting until valid numeric input is provided.
11. Store several names in an array and print each one using a loop.
12. Attempt to read a file that may not exist and handle the error gracefully with a helpful message.
13. Display free disk space using a Git Bash compatible command such as `df -h`.
14. List running processes using a Git Bash compatible command such as `ps`.
15. Write a script that appends the current date and time to a log file each time it runs.
16. Create a script that accepts a file path as an argument, checks whether it exists, and exits with a non-zero code if it does not.
17. Find all `.log` files in a folder and move them to an `archive` folder, creating the folder if needed.

### Script expectations
- Add a shebang such as `#!/usr/bin/env bash`
- Make scripts executable when appropriate
- Use clear variable names
- Use comments only where they improve readability
- Use exit codes intentionally

---

## Part 3: Mini-Project

Write a Bash script that does all of the following:

1. Creates a new Markdown file in your folder in the journal repo using today’s date in the filename.
2. Adds the basic structure of a journal entry using the expected formatting from that repo’s README.
3. Moves any files in your folder that are 7 or more days old into an `archive` folder.

### Requirements
- The script must be runnable from Git Bash
- The filename must use a date-based format
- The script must create the `archive` folder if it does not exist
- The script must avoid overwriting work accidentally
- Document any assumptions you make in the README

---

## Part 4: README

Create a `README.md` for this assignment.

Your README must explain:
- What your script is supposed to do
- How to run it in Git Bash
- What arguments or environment variables it accepts
- What files or folders it creates
- Any limitations, assumptions, or known issues
- The exit codes you chose, if you use custom ones

---

## Part 5: Environment Variables

Before running your main configuration script, set these environment variables in your **Git Bash session**, not inside the script:

| Variable Name | Example Value |
| --- | --- |
| `APP_ENV` | `dev` |
| `APP_NAME` | `sampleapp` |
| `APP_LOCATION` | `eastus` |

Example Git Bash syntax:

```bash
export APP_ENV=dev
export APP_NAME=sampleapp
export APP_LOCATION=eastus
```

---

## Part 6: Parameters vs Environment Variables

Your script must accept these optional arguments:

- `--env`
- `--name`
- `--location`

### Precedence rules
1. If an argument is provided, it overrides everything else.
2. If the argument is not provided, read the corresponding environment variable.
3. Defaulting rules:
   - `location` may default to `eastus` only if no argument is provided and `APP_LOCATION` is missing.
   - `env` and `name` must not have defaults.

### Required mapping
- `env` <- `APP_ENV`
- `name` <- `APP_NAME`
- `location` <- `APP_LOCATION`

---

## Part 7: Configuration Summary

Your script must:
- Resolve the final values based on precedence
- Store them in local variables
- Print them clearly

Example output:

```text
Environment: dev
Application: sampleapp
Location: eastus
Source: env=ENV_VAR, name=ARG, location=DEFAULT
```

The exact wording may vary, but it must be clear where each value came from.

---

## Part 8: Validation

Your script must validate that:
- `env` is present and not empty
- `name` is present and not empty
- `location` is present after defaulting is applied

If validation fails:
- Print a clear error message
- Exit with a non-zero exit code

### Allowed values validation
Validate:
- `env` must be one of `dev`, `test`, `prod`
- `location` must be one of:
  - `eastus`
  - `westus2`
  - `centralus`

If invalid:
- Print the invalid value
- Print the allowed values
- Exit with a non-zero exit code

### Name format validation
Validate `name` with these rules:
- 3 to 24 characters
- Lowercase letters, numbers, and hyphens only
- Must start with a letter
- Must not end with a hyphen

Examples:
- Valid: `sampleapp`, `app-01`, `web-api`
- Invalid: `SampleApp`, `-app`, `app-`, `a`, `my_app`

If invalid:
- Print a clear error message
- Exit with a non-zero exit code

---

## Part 9: Environment-Based Logic

Add conditional behavior based on the final environment.

Required behavior:
- If `env=dev`, print `Using development settings`
- If `env=test`, print `Using test settings`
- If `env=prod`, print `Using PRODUCTION settings - proceed with caution`

Any other value must fail safely with a non-zero exit code, even if validation should already catch it.

---

## Part 10: Production Safeguard

If `env` is `prod`, require explicit user confirmation before continuing.

Your script must:
- Print a clear production warning
- Prompt the user with: `Type YES to continue`
- Continue only if the user types exactly `YES`

Any other input must:
- Print a cancellation message
- Exit safely with a non-zero exit code

---

## Part 11: Logging

Your script must append output to a log file named:

```text
deploy-<env>.log
```

Examples:
- `deploy-dev.log`
- `deploy-test.log`
- `deploy-prod.log`

### Logging requirements
Log at minimum:
- Start of run
- Resolved configuration summary
- Validation results
- Pre-flight check results
- Environment-based mode selection
- Production safeguard outcome
- End of run and exit code

Console output should still show key messages.

---

## Part 12: Pre-Flight Checks

Before any simulated deployment action, perform pre-flight checks.

Required checks:
1. Confirm Bash is available and document any version expectation in the README.
2. Check that a required command exists. Choose one and document it, such as:
   - `git`
   - `find`
   - `sed`
3. Confirm the script can write to the current directory, or confirm a `logs` folder can be created.

If a pre-flight check fails:
- Print a clear explanation
- Explain how to fix it
- Exit with a non-zero exit code

---

## Part 13: Idempotency

Add a simple idempotency mechanism so repeated runs do not blindly repeat work.

Use one of these approaches:
- A state file such as `deploy-state-<env>.json`
- A marker file such as `.deployed-<env>-<name>-<location>`

### Idempotency requirements
- If the same configuration has already succeeded:
  - Print a message such as `No changes detected; deployment already completed for this configuration.`
  - Exit successfully
- If the configuration differs:
  - Continue normally
  - Update the state on success

Production confirmation must still apply when `env=prod`.

---

## Part 14: Security Awareness

Add a required environment variable:

| Variable Name | Purpose |
| --- | --- |
| `APP_SECRET` | Represents a sensitive value such as an API key or password |

### Required behavior
Your script must:
- Verify that `APP_SECRET` exists and is not empty
- Treat it as required in all environments
- Fail validation if it is missing or empty

### Security constraints
Your script must:
- Not print the actual value of `APP_SECRET`
- Not write the actual value of `APP_SECRET` to the log
- Not include the secret in summaries or error messages

Acceptable output examples:
- `APP_SECRET is set`
- `APP_SECRET=***`

---

## Part 15: Test Runs

You must perform and verify at least six runs of your script.

### Required runs
1. Run with `env=dev` using only environment variables.
2. Run with `env=test` using only environment variables.
3. Run with `env=prod` using environment variables and cancel execution when prompted.
4. Run with one or more values overridden using arguments to demonstrate argument precedence over environment variables.
5. Run the script twice with the same resolved configuration to demonstrate idempotency.
6. Run the script with an intentional error such as an invalid `env` or malformed `name`.

For each run, verify:
- Console output
- Correct log file creation or append behavior
- Exit behavior and exit code
- Whether state or marker files behaved correctly

---

## Part 16: Reflection Questions

Answer these in your README or a separate notes section:

1. What is the difference between a shell command, an environment variable, and a script argument?
2. Why is argument precedence over environment variables useful?
3. Why should production actions require explicit confirmation?
4. Why is idempotency important in automation?
5. Why must secrets be handled differently from normal configuration values?
