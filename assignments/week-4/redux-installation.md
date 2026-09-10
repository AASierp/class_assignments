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

## 6. Replace the local reducer with Redux

The original `Counter` uses `useReducer` for its reducer count:

```tsx
const [state, dispatch] = useReducer(
  reducer,
  { count: Number(initialCount) },
)
```

The reducer and its action types are also defined inside `Counter.tsx`.

Remove lines 1–102 from `src/Counter.tsx` and replace the complete file with:

```tsx
import {
  useContext,
  useEffect,
  useRef,
  useState,
} from 'react'
import {
  decrement,
  increment,
  reset,
} from './features/counter/counterSlice'
import { useAppDispatch, useAppSelector } from './app/hooks'
import { ThemeContext } from './ThemeContext'
import type { CounterProps } from './types/props'

export default function Counter({
  initialCount,
  pageTitle,
  changeText,
}: CounterProps) {
  const [count, setCount] = useState<number>(
    Number(initialCount),
  )
  const [refCountSnapshot, setRefCountSnapshot] =
    useState<number>(0)
  const [textToBeChanged, setTextToBeChanged] =
    useState('')

  const clickCountRef = useRef<number>(0)
  const themeContext = useContext(ThemeContext)

  const reduxCount = useAppSelector(
    (state) => state.counter.value,
  )
  const dispatch = useAppDispatch()

  if (!themeContext) {
    throw new Error(
      'Counter must be used inside ThemeContext.Provider',
    )
  }

  useEffect(() => {
    console.log(`Count has updated. It is now ${count}.`)
  }, [count])

  useEffect(() => {
    console.log('Component has loaded.')
  }, [])

  function handleStateUpdate() {
    setCount((currentCount) => currentCount + 1)
    setRefCountSnapshot(clickCountRef.current)
  }

  function handleRefOnlyUpdate() {
    clickCountRef.current += 1

    console.log(
      `ref updated without re-render: ${clickCountRef.current}`,
    )
  }

  function changeTextToBeChanged(newText: string) {
    setTextToBeChanged(newText)
  }

  return (
    <div>
      <h1>{pageTitle}</h1>

      <p>Count: {count}</p>
      <p>Redux count: {reduxCount}</p>
      <p>Ref count snapshot: {refCountSnapshot}</p>

      <button onClick={handleStateUpdate}>
        Add 1 to local counter
      </button>

      <button onClick={handleRefOnlyUpdate}>
        Update ref only
      </button>

      <button onClick={() => dispatch(increment())}>
        Increment Redux count
      </button>

      <button onClick={() => dispatch(decrement())}>
        Decrement Redux count
      </button>

      <button onClick={() => dispatch(reset())}>
        Reset Redux count
      </button>

      <input
        value={textToBeChanged}
        onChange={(event) =>
          changeTextToBeChanged(event.target.value)
        }
      />

      <button
        onClick={() => changeText(textToBeChanged)}
      >
        Do the text update in the parent
      </button>
    </div>
  )
}
```

The component no longer defines or calls `useReducer`.

It reads the Redux count with a selector:

```tsx
const reduxCount = useAppSelector(
  (state) => state.counter.value,
)
```

It obtains Redux’s `dispatch` function with:

```tsx
const dispatch = useAppDispatch()
```

It dispatches action objects by calling action creators:

```tsx
dispatch(increment())
dispatch(decrement())
dispatch(reset())
```

The update flow is:

```text
User clicks button
        ↓
Component dispatches an action
        ↓
Counter slice reducer handles the action
        ↓
Redux store receives the new state
        ↓
Subscribed components render the new value
```

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
