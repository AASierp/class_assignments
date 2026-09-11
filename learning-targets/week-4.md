## Week 4 – Learning Targets

### Advanced React State Management
1. I can explain when local component state is sufficient and when shared or lifted state is needed.
2. I can lift state to the appropriate parent component to coordinate behavior across multiple child components.
3. I can manage more complex UI behavior using patterns such as reducers, context, or structured state composition.
4. I can avoid unnecessary duplication of state and explain the risks of derived-state mistakes.
5. I can organize stateful React code so that components remain understandable and testable.

---

### Styling React Components
1. I can apply styles to React components using a consistent approach appropriate to the project setup.
2. I can distinguish between app-level styles, reusable component styles, and one-off presentation rules.
3. I can style components based on props, state, or UI conditions without making the component logic difficult to follow.
4. I can organize styling so components remain reusable, readable, and maintainable.
5. I can troubleshoot styling issues in React components using browser developer tools and component structure awareness.

---

### Debugging React Components
1. I can debug React components by inspecting props, state, rendered output, and event behavior.
2. I can identify common React issues such as incorrect prop usage, stale state assumptions, missing keys, and misplaced side effects.
3. I can use browser developer tools and React-focused debugging tools to trace component behavior and rendering problems.
4. I can determine whether a React bug comes from component logic, state updates, effects, event handling, or external data.
5. I can explain why a component re-rendered and use that understanding to troubleshoot unexpected UI behavior.

---

### Redux Fundamentals
1. I can explain what kinds of application state are good candidates for centralized state management.
2. I can describe the roles of a store, actions, reducers, and selectors in a Redux-based application.
3. I can connect React components to shared application state without confusing local UI state and global app state responsibilities.
4. I can update shared state through predictable state transitions rather than ad hoc cross-component mutation.
5. I can explain tradeoffs between local state, context, and Redux for frontend state management.

---

### Frontend Testing
1. I can explain the difference between unit, integration, and UI-focused frontend tests.
2. I can write tests that validate rendered output and user behavior rather than internal implementation details.
3. I can test React components that render conditionally, respond to events, and update state.
4. I can test form behavior, validation, and asynchronous UI states at a practical level.
5. I can use test failures to diagnose regressions in React components and application flow.

---

### Behavior and Functional Testing
1. I can explain the difference between component-level tests and behavior-focused tests that validate user-visible outcomes.
2. I can write tests that verify complete user flows such as entering input, submitting forms, and seeing updated UI states.
3. I can test React features through user interactions and rendered behavior rather than relying on implementation details.
4. I can verify loading, success, error, and empty states as part of realistic frontend behavior.
5. I can identify which frontend behaviors are important enough to protect with higher-value functional tests.

---

### GitHub Actions Fundamentals
1. I can explain the purpose of GitHub Actions in a software delivery workflow.
2. I can describe the relationship between workflows, jobs, steps, triggers, and runners.
3. I can configure a workflow that installs dependencies, builds an application, and runs tests.
4. I can read GitHub Actions logs to understand why a workflow passed or failed.
5. I can explain how CI automation reduces delivery risk and improves team feedback cycles.

---

### Build, Test, Deploy, and Side Effects
1. I can distinguish between safe validation steps and side-effecting deployment steps in a CI/CD pipeline.
2. I can configure workflow triggers appropriately for pull requests, pushes, and deployment events.
3. I can separate build/test jobs from deployment jobs so production-like actions happen intentionally.
4. I can use environment variables and repository secrets safely in automated workflows.
5. I can explain why deployment automation should be repeatable, observable, and gated.
