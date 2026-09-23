# PostgreSQL and DBeaver Setup

## Part 1: Create the Database Setup Folder

Create a folder for the database setup.

Suggested structure:

```text
database/
- docker-compose.yml
```

## Part 2: Create the Docker Compose File

Create `database/docker-compose.yml`:

```yaml
services:
  postgres:
    image: postgres:latest
    container_name: postgres
    restart: unless-stopped
    environment:
      POSTGRES_USER: admin
      POSTGRES_PASSWORD: admin
      POSTGRES_DB: postgres
    ports:
      - "5432:5432"
    volumes:
      - postgres_data:/var/lib/postgresql

volumes:
  postgres_data:
```

## Part 3: Start PostgreSQL Headlessly

From the `database` folder, run:

```bash
docker compose up -d
```

The `-d` flag runs the database in the background.

Check that the container is running:

```bash
docker ps
```

You should see your container.

## Part 4: Manage the Container in Docker Desktop

Open Docker Desktop.

Use Docker Desktop to:

* Confirm that your container is running
* Start the container if it is stopped
* Stop the container when you are done
* View container logs
* Confirm that the port's mapping

The PostgreSQL data is stored in a Docker volume, so stopping the container does not delete the database.

## Part 5: Connect with DBeaver

Open DBeaver and create a new database connection.

Choose:

```text
PostgreSQL
```

Use these connection settings:

```text
Host: localhost
Port: 5432
Database: postgres
Username: admin
Password: admin
```

Test the connection.

If DBeaver asks to download PostgreSQL drivers, allow it.

## Part 6: Create a Test Query

After connecting, open a SQL editor in DBeaver and run:

```sql
SELECT current_database();
```

Then run:

```sql
SELECT current_user;
```

You should see:

```text
fitness_booking
app_user
```

## Part 7: Stop the Database

To stop the database without deleting data, run this from the `database` folder:

```bash
docker compose stop
```

To start it again later:

```bash
docker compose up -d
```

## Part 8: Reset the Database

Only reset the database if you intentionally want to delete all local PostgreSQL data for this setup.

From the `database` folder, run:

```bash
docker compose down -v
```

Then start fresh:

```bash
docker compose up -d
```

The `-v` flag removes the Docker volume, which deletes the stored database data.
