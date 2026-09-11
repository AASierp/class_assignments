# Basic Redux Toolkit Setup

The following state remains local because it is only needed by `Counter`:

- The regular `useState` count
- The input value
- The ref and ref snapshot

The Redux count becomes global because both `Counter` and `CounterSummary` use it.

## 1. Install Redux Toolkit and React Redux

Open a terminal and run:

```bash
npm install @reduxjs/toolkit react-redux
```

`@reduxjs/toolkit` provides the recommended Redux APIs, including `configureStore` and `createSlice`.

`react-redux` connects React components to the Redux store through `Provider`, `useSelector`, and `useDispatch`.

## 2. Create the counter slice

Add `src/features/counter/counterSlice.ts`, starting at line 1:

```ts
import { createSlice } from '@reduxjs/toolkit'

type CounterState = {
  value: number
}

const initialState: CounterState = {
  value: 1,
}

const counterSlice = createSlice({
  name: 'counter',
  initialState,
  reducers: {
    increment(state) {
      state.value += 1
    },
    decrement(state) {
      state.value -= 1
    },
    reset(state) {
      state.value = initialState.value
    },
  },
})

export const { increment, decrement, reset } = counterSlice.actions

export default counterSlice.reducer
```

A slice groups together:

- The initial state
- The reducer functions that update that state
- The action creators used to request those updates

Redux Toolkit uses Immer internally. This allows reducers to use statements such as:

```ts
state.value += 1
```

Redux Toolkit converts that code into an immutable state update.

## 3. Configure the Redux store

Add `src/app/store.ts`, starting at line 1:

```ts
import { configureStore } from '@reduxjs/toolkit'
import counterReducer from '../features/counter/counterSlice'

export const store = configureStore({
  reducer: {
    counter: counterReducer,
  },
})

export type RootState = ReturnType<typeof store.getState>
export type AppDispatch = typeof store.dispatch
```

The store contains the application’s Redux state.

Its state currently has this shape:

```ts
{
  counter: {
    value: 1
  }
}
```

The `counter` property comes from the name used in the store configuration:

```ts
reducer: {
  counter: counterReducer,
}
```

`RootState` describes the complete Redux state. `AppDispatch` describes the store’s dispatch function.

## 4. Create typed Redux hooks

Add `src/app/hooks.ts`, starting at line 1:

```ts
import {
  useDispatch,
  useSelector,
  type TypedUseSelectorHook,
} from 'react-redux'
import type { AppDispatch, RootState } from './store'

export const useAppDispatch = () => useDispatch<AppDispatch>()

export const useAppSelector: TypedUseSelectorHook<RootState> =
  useSelector
```

These hooks are typed versions of React Redux’s standard hooks:

- `useAppSelector` reads data from the store.
- `useAppDispatch` dispatches actions to the store.

Defining these hooks once prevents components from repeatedly importing and supplying the store types.

## 5. Provide the store to React

In `src/main.tsx`, remove lines 1–10 and replace the complete file with:

```tsx
import { createRoot } from 'react-dom/client'
import { Provider } from 'react-redux'
import App from './App.tsx'
import { store } from './app/store'
import './index.css'

createRoot(document.getElementById('root')!).render(
  <Provider store={store}>
    <App />
  </Provider>,
)
```

`Provider` makes the store available to every component beneath it.

The component tree now looks like this:

```text
Provider
└── App
    ├── Counter
    └── CounterSummary
```

Both sibling components can access the same Redux store without receiving the Redux count through props.

## 6. Use Redux state in a component

Now update `src/Counter.tsx` so it reads the Redux count and dispatches Redux actions.

Replace the complete file with:

```tsx
import {
  decrement,
  increment,
  reset,
} from './features/counter/counterSlice'
import { useAppDispatch, useAppSelector } from './app/hooks'

export default function Counter() {
  const reduxCount = useAppSelector(
    (state) => state.counter.value,
  )
  const dispatch = useAppDispatch()

  return (
    <section>
      <h1>Redux Counter</h1>

      <p>Redux count: {reduxCount}</p>

      <button onClick={() => dispatch(increment())}>
        Add 1
      </button>

      <button onClick={() => dispatch(decrement())}>
        Subtract 1
      </button>

      <button onClick={() => dispatch(reset())}>
        Reset
      </button>
    </section>
  )
}
```

This component uses two Redux hooks:

- `useAppSelector` reads the current count from the Redux store.
- `useAppDispatch` sends actions to the Redux store.

This line reads the value:

```tsx
const reduxCount = useAppSelector(
  (state) => state.counter.value,
)
```

The full Redux state currently looks like this:

```ts
{
  counter: {
    value: 1
  }
}
```

So `state.counter.value` gives the component the number stored in Redux.

These lines update the value:

```tsx
dispatch(increment())
dispatch(decrement())
dispatch(reset())
```

Each dispatched action runs one reducer from `counterSlice.ts`.

At this point, the component no longer needs `useState` for the shared counter. The count belongs in Redux because another component will read the same value in the next step.

## 7. Add the sibling component

Add `src/CounterSummary.tsx`, starting at line 1:

```tsx
import { useAppSelector } from './app/hooks'

export default function CounterSummary() {
  const count = useAppSelector(
    (state) => state.counter.value,
  )

  return (
    <section aria-labelledby="counter-summary-title">
      <h2 id="counter-summary-title">
        Counter Summary
      </h2>

      <p>Shared Redux count: {count}</p>
    </section>
  )
}
```

`CounterSummary` only reads state, so it needs `useAppSelector` but does not need `useAppDispatch`.

`Counter` and `CounterSummary` now read the same value from the same store.

When `Counter` dispatches `increment()`, both components display the updated count.

## 8. Render the sibling component

In `src/App.tsx`, add this import after the existing `Counter` import near line 7:

```tsx
import CounterSummary from './CounterSummary'
```

In `src/App.tsx`, find the `Counter` near line 72:

```tsx
<Counter {...counterProps} />
```

Replace it with:

```tsx
<Counter {...counterProps} />
<CounterSummary />
```

The two components are siblings because they are rendered next to each other under the same parent.

`App` does not have to import the Redux count or pass it through props.

The relevant portion of the component tree is:

```text
App
├── Counter
│   ├── reads the Redux count
│   └── dispatches counter actions
└── CounterSummary
    └── reads the Redux count
```
