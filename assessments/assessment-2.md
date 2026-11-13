# Bankend Banking Assessment

## Feature Requirements

We’re seeking a streamlined back-end solution to power our banking operations. The system should enable seamless customer onboarding, account management, transaction processing, and fund transfers, all aligned with our business workflows.

### 1. Customer Management
- Create a new customer (first name, last name, email, phone)
- Read customer details by ID and list all customers
- Update customer contact information
- Delete a customer (only if they have no open accounts)

### 2. Account Management
- Create a bank account for an existing customer (account type: CHECKING or SAVINGS, initial deposit)
- Read account details by account number and list all accounts for a customer
- Update account status (ACTIVE, CLOSED, SUSPENDED)
- Delete (close) an account (only if balance is zero)

### 3. Transaction Processing
- Record deposits and withdrawals against an account (amount, timestamp, transaction type)
- Read a specific transaction by ID and list all transactions for an account
- Enforce overdraft rules: withdrawals may not exceed account balance

### 4. Funds Transfer
- Endpoint to transfer funds between two accounts (source account → target account)
- Atomicity: transfer must debit one account and credit the other in a single transaction

### 5. DTO Mapping & Validation
- Use request/response DTOs where necessary
- Validate input (e.g. non-null fields, positive amounts).

### 6. Transaction Filtering
- Filter transactions by account number, transaction type, date range, and amount range
- Endpoint: `GET /api/transactions` with optional query parameters: accountNo, type, fromDate, toDate, minAmount, maxAmount

### 7. Error Handling
- Return appropriate HTTP status codes
- Error responses should include a JSON body with timestamp, status, error, and message.

### 8. Bonus
- Implement a a validation method to ensure the person calling a specific endpoint is allowed to call that endpoint.
- Implement an audit trail system to log all pertinent information about backend requests for our security analysts. The logs should be stored either in database or in separate log files produced by the application.

## API Endpoints

| Endpoint | Method | Description |
|---|---|---|
| `/api/customers` | POST | Create customer |
| `/api/customers` | GET | List all customers |
| `/api/customers/{id}` | GET | Get customer by ID |
| `/api/customers/{id}` | PUT | Update customer |
| `/api/customers/{id}` | DELETE | Delete customer |
| `/api/customers/{id}/accounts` | GET | List accounts for customer |
| `/api/accounts` | POST | Create account |
| `/api/accounts/{acctNo}` | GET | Get account by account number |
| `/api/accounts/{acctNo}` | PUT | Update account status |
| `/api/accounts/{acctNo}` | DELETE | Close account |
| `/api/accounts/{acctNo}/transa ctions` | GET | List transactions for account |
| `/api/transactions` | POST | Record deposit or withdrawal |
| `/api/transfers` | POST | Transfer funds between two accounts |

## Project Requirements

### Languages & Frameworks
- Java 21
- Spring Boot

### Allowed Dependencies
- Spring Boot Starter Web
- Spring Boot Starter Data JPA
- Spring Boot DevTools
- PostgreSQL JDBC Driver
- Spring DOC Open API

No other third-party libraries allowed.

### Database
- PostgreSQL
- Schema auto-generation via JPA.

### Version Control
- Git repository under your organization; name it `<first_initial>-<last_name>-banking-backend`
- Include ERD and API documentation in `/docs`