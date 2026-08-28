# Practice React Assessment

I’d like you to build a simple notes application. This app should allow users to sign up, log in, and manage personal notes.

## Feature Requirements

### 1. Account Management

- **Sign Up**
  - Collect user’s email and password.

- **Log In / Log Out**
  - Authenticate users and end sessions.

- **Profile Editing**
  - Allow users to update their email and password.

### 2. Note Management

- **Create Notes**
  - Each note must have a title, content, creation date, and optional tags.

- **Edit Notes**
  - Users can edit the title, content, and tags of notes they own.

- **Delete Notes**
  - Users can remove notes they own.

- **View Notes**
  - Display a list of the user’s notes, showing title, creation date, and tag list.

### 3. Searching & Filtering

- **Tag Filter**
  - Select one or more tags to filter the notes list.

## Pages / Views

### 1. Landing / Sign Up / Log In

### 2. Dashboard / Notes List
- Includes search/filter controls for date and tags.
- Button to create a new note.

### 3. Note Editor
- Form for title, content, and tags.

### 4. Note Detail
- Show the details of a note.

### 5. Profile Settings
- Edit email and password.

## Technical Requirements

### Languages & Frameworks
- React
- TypeScript
- HTML & CSS

### Allowed Libraries
- `vite` (for setup)
- `json-server` (for mock backend)
- No other third-party libraries

### Data Persistence
- All data stored in a single `db.json` file.
- Use `json-server` for CRUD operations and auth mocking.

### Version Control
- Repository hosted under the `Thrivent-ETS-Cohort-2026` organization.
- Repo name: `<firstName>-<lastName>-notes`
- Example: for Steven Petersen, it would be `spetersen-notes`
- Repository must be private.

### Documentation & Planning
- Include a brief `README` outlining setup steps, data model, and API routes.
- Optionally, provide a visual guide demonstrating how your app works.