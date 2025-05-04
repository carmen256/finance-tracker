# Personal Finance Tracker

A modern web-based personal finance management application that automatically syncs with your bank accounts and provides detailed insights into your financial health.

## Overview

This Personal Finance Tracker is a full-stack web application that helps you monitor and manage your financial accounts in one place. It automatically syncs with your bank accounts using the Plaid API, providing real-time updates and insights into your financial transactions. Access your financial data securely from anywhere with an internet connection.

## Tech Stack

### Frontend
- HTMX for dynamic content updates
- Tailwind CSS for styling
- Server-side rendered HTML for optimal performance

### Backend
- Ktor (Kotlin) for the REST API server
- Kotlin for business logic
- PostgreSQL for data storage
- Background worker for bank sync operations

### Integration
- Plaid API for bank account connectivity
- Real-time transaction syncing

## Core Features

- 🏦 Bank Account Integration
  - Secure connection to multiple bank accounts
  - Automatic transaction syncing
  - Real-time balance updates

- 💰 Transaction Management
  - Categorized transactions
  - Search and filtering capabilities
  - Custom transaction tags

- 📊 Financial Insights
  - Spending patterns analysis
  - Monthly budget tracking
  - Category-wise expense breakdown

## Project Structure

```
finance-tracker/
├── api/                 # Ktor API server
├── worker/             # Background worker for bank syncing
├── frontend/           # HTMX + Tailwind frontend
├── shared/            # Shared code/models
├── docs/              # Documentation
└── docker-compose.yml # Development environment
```

## Getting Started

### Sign Up
1. Visit [app.financetracker.com](https://app.financetracker.com) (example URL)
2. Create your account using email or Google authentication
3. Complete the secure onboarding process

### Connect Your Bank Accounts
1. Click "Add Account" in the dashboard
2. Select your bank from the list of supported institutions
3. Securely authenticate with your bank credentials
4. Your transactions will begin syncing automatically

## Status

🚀 This application is under development.
