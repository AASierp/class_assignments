# GitHub Actions and CI/CD Practice

### Learning Targets

> I can configure automated validation, interpret workflow failures, and separate safe build and test work from intentional deployment side effects.

## Purpose

Create a GitHub Actions workflow for a Vite React TypeScript project.

The workflow should validate changes without automatically deploying them.

## Prerequisites

Use a GitHub-hosted Vite project containing:

* `package.json`
* A lock file
* A build script
* A test script, when tests are configured
* Source code committed to the repository

## Part 1: Workflow Structure

Create:

```
.github/workflows/ci.yml
```

Configure the workflow to run for:

* Pull requests targeting the main branch
* Pushes to the main branch

The workflow should contain one validation job.

Use a GitHub-hosted runner.

## Part 2: Validation Steps

Add steps that:

1. Check out the repository
2. Set up the required Node version
3. Install dependencies from the lock file
4. Run the TypeScript or application build
5. Run automated tests when configured

Use `npm ci` rather than a general install command in CI when a valid lock file is committed.

## Part 3: Workflow Vocabulary

Identify each item in your workflow:

* Workflow
* Trigger
* Job
* Runner
* Step
* Action
* Command

Explain how they relate to one another.

## Part 4: Failure Investigation

Cause and investigate at least three failures:

1. A TypeScript error
2. A failing test
3. An incorrect npm script name or missing dependency

For each failure, record:

Failed job:
Failed step:
Relevant log output:
Cause:
Correction:
Result after rerunning:

## Part 5: Local and CI Consistency

Before pushing a correction, run locally:

```
npm ci
npm run build
npm test
```

Adjust the test command to match the project.

Explain why local and CI commands should be as similar as possible.

## Part 6: Separate Validation from Deployment

Add a second job named `deploy-placeholder`.

Do not perform a real deployment.

Configure it so that it:

* Depends on the validation job
* Does not run for ordinary pull requests
* Runs only for an intentional deployment condition
* Uses an environment such as `production`
* Contains a harmless message instead of a real deployment command

Explain why deployment should not be mixed into the validation job.

## Part 7: Triggers and Gates

Compare these possible triggers:

* Pull request
* Push to the main branch
* Manual workflow dispatch
* Version tag
* Release event

For each, identify whether it is appropriate for:

* Build validation
* Test validation
* Preview deployment
* Production deployment

Choose a deliberate production trigger and explain the choice.

## Part 8: Variables and Secrets

Document the difference between:

* A normal workflow environment variable
* A repository variable
* A repository secret
* An environment-specific secret

Do not commit credentials to the repository.

Create a fake variable for a public API base URL.

Describe where a real deployment token would be stored, but do not create or display a real token.

## Part 9: Side-Effect Review

Classify each operation as validation or side effect:

* Installing dependencies
* Type checking
* Running tests
* Building static files
* Uploading an artifact
* Publishing a package
* Updating a database
* Deploying a website
* Invalidating a cache
* Sending a release notification

Explain why side-effecting operations require stronger triggers and safeguards.

## Questions

1. What problem does GitHub Actions solve?
2. What causes a workflow to run?
3. What is the difference between a job and a step?
4. What does a runner do?
5. Why should build and test jobs run on pull requests?
6. Why should deployment jobs depend on successful validation?
7. What is the difference between a safe validation step and a deployment side effect?
8. Why should deployment be repeatable?
9. Why should deployment output be observable?
10. Why should secrets never appear in source code or logs?
11. What information in the logs helps locate a failure?
12. How does CI shorten team feedback cycles?

