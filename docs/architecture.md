# Finance Tracker Architecture

## MVP User Stories

### Authentication & User Management
- As a new user, I want to sign up using my email or Google account
- As a user, I want to securely log in to my account
- As a user, I want to update my profile information

### Bank Account Integration
- As a user, I want to connect my bank account using Plaid
- As a user, I want to see a list of my connected bank accounts
- As a user, I want to disconnect a bank account

### Transaction Management
- As a user, I want to see my recent transactions
- As a user, I want to categorize my transactions
- As a user, I want to search and filter my transactions

### Financial Insights
- As a user, I want to see my spending by category
- As a user, I want to view my monthly spending trends
- As a user, I want to see my top spending categories

## System Architecture

The system architecture is documented in the following diagrams:

- [System Architecture Diagram](../architecture.mmd) - Shows the high-level components and their interactions

## Entity Relationship Diagram

```mermaid
erDiagram
    User ||--o{ BankAccount : has
    User ||--o{ Transaction : makes
    User ||--o{ Category : creates
    BankAccount ||--o{ Transaction : contains
    Transaction ||--o{ Category : belongs_to

    User {
        uuid id PK
        string email
        string name
        timestamp created_at
        timestamp updated_at
    }

    BankAccount {
        uuid id PK
        uuid user_id FK
        string plaid_account_id
        string institution_name
        string account_name
        string account_type
        decimal balance
        timestamp created_at
        timestamp updated_at
    }

    Transaction {
        uuid id PK
        uuid user_id FK
        uuid bank_account_id FK
        uuid category_id FK
        decimal amount
        string description
        date transaction_date
        string merchant_name
        timestamp created_at
        timestamp updated_at
    }

    Category {
        uuid id PK
        uuid user_id FK
        string name
        string color
        timestamp created_at
        timestamp updated_at
    }
```

## Key Entities

### User
- Core user information
- Authentication details
- Profile settings

### BankAccount
- Connected bank accounts
- Account details from Plaid
- Current balances

### Transaction
- Financial transactions
- Categorization
- Merchant information
- Transaction dates and amounts

### Category
- Custom transaction categories
- Category colors for visualization
- User-defined categorization rules
