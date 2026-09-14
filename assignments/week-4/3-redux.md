# Redux State Management Practice

### Learning Targets

> I can distinguish local and global state, update centralized state predictably, and explain tradeoffs between local state, Context, and Redux.

## Purpose

Build a small reading-list application that uses Redux for shared application data.

The project will help you compare local state, lifted state, Context, and Redux before building the larger notes application without Redux.

## Setup

Create a Vite React TypeScript project:
```bash
npm create vite@latest redux-state-practice -- --template react-ts
cd redux-state-practice
npm install
```


Install:
* Redux Toolkit
* React Redux

## Part 1: Classify State

The application should include:

* A list of saved articles
* A title filter
* A selected article
* A compact or comfortable display setting
* A temporary form-validation message

Before writing Redux code, classify each value as:

* Local component state
* Shared parent state
* Context candidate
* Redux candidate
* Derived data

Explain each decision.

## Part 2: Redux Store

Create centralized state for the saved articles.

The store should contain article objects with:

* `id`
* `title`
* `category`
* `saved`

Create predictable updates for:

* Adding an article
* Removing an article
* Toggling its saved status
* Clearing all saved articles

Use selectors to read:

* All articles
* Saved articles
* The number of saved articles

Do not access or mutate the store directly from components.

## Part 3: Connect React

Create:

* `ArticleForm`
* `ArticleList`
* `ArticleCard`
* `SavedSummary`

Use Redux for shared article data.

Keep temporary form-input state local to `ArticleForm`.

Keep one short-lived presentation setting local or in Context so you can compare the approaches.

## Part 4: Compare State Strategies

For each important value, explain why you chose local state, lifted state, Context, or Redux.

Discuss:

* Number of components using the value
* Frequency of updates
* Whether the value represents application data or temporary UI state
* Whether predictable transitions and debugging history are valuable

Include at least one example of:

* State that belongs in Redux
* State that should remain local
* State that could reasonably use Context instead

## Part 5: Predictable Updates

Show that all shared-data updates happen through Redux actions and reducers.

Review your application for these mistakes and correct them if found:

* Direct mutation in a component
* Duplicate copies of the same shared data
* Derived values stored unnecessarily
* Local UI state being pushed into Redux without a clear reason

Document one example of a mistake you avoided or corrected.

## Part 6: Redux Review

For each major shared value, record:

State value:
Where it is read:
Where it is updated:
Why Redux is or is not appropriate:
Could it be derived:
Would local state or Context be simpler:

## Questions

1. What state is a good Redux candidate?
2. What is the role of the store?
3. What is an action?
4. What is a reducer?
5. What is a selector?
6. Why should form-input state often remain local?
7. When might Context be sufficient?
8. What tradeoffs does Redux introduce?
9. Why is it useful to separate app data from temporary UI state?
10. What risks come from storing duplicate or derived data in a Redux store?

## Connection to the Notes Assessment

Although Redux is not allowed in the assessment, use this comparison to decide where notes-app state belongs.

This assignment should strengthen decisions about:

* Authentication-related UI state
* Notes data ownership
* Selection and filtering
* Form state
* Loading and error handling