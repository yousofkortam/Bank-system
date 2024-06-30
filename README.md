# Banking Application

Welcome to the Banking Application project repository! This application allows customers to manage their savings accounts, perform deposits and withdrawals, transfer money, apply for loans, and view their account balance among other features. The project is structured using the following classes:

- `Account`: A superclass containing account details and methods for transactions.
- `SavingsAccount`: A subclass of `Account` with an interest rate field and interest calculation.
- `FixedDepositAccount`: A subclass of `Account` with an interest rate field and maturity period.
- `Loan`: A class to manage loan details and repayments.
- `Bank`: A class to manage account operations and transactions.
- `BankApplication`: A command-line interface for customers to interact with the banking system.

## Table of Contents

- [Introduction](#introduction)
- [Classes](#classes)
  - [Account](#account)
  - [SavingsAccount](#savingsaccount)
  - [FixedDepositAccount](#fixeddepositaccount)
  - [Loan](#loan)
  - [Bank](#bank)
  - [BankApplication](#bankapplication)
- [Usage](#usage)
- [Installation](#installation)
- [Contributing](#contributing)

## Introduction

Managing personal finances is crucial, and this project offers a comprehensive banking application to help customers handle their accounts conveniently. With a user-friendly command-line interface, users can perform transactions, transfer money, apply for loans, set up recurring deposits, and stay updated about their account balance and loan status.

## Classes

### Account

The `Account` superclass contains the essential fields and methods for account management.

#### Attributes

- `accountNumber`: Unique account number.
- `accountHolderName`: Name of the account holder.
- `balance`: Current account balance.
- `withdrawalLimit`: Limit for withdrawals.
- `transactionHistory`: List of transaction logs.
- `loan`: A `Loan` object for managing loans.
- `notification`: Notification messages for the account.

#### Methods

- `deposit(amount)`: Deposit money into the account.
- `withdraw(amount)`: Withdraw money from the account.
- `setWithdrawalLimit(limit)`: Set the withdrawal limit for the account.
- `applyForLoan(amount, term)`: Apply for a loan.
- `getLoanStatus()`: Get the current loan status.
- `repayLoan(amount)`: Repay a specified amount of the loan.
- `setupRecurringDeposit(amount, frequency)`: Set up recurring deposits.
- `setNotification(message)`: Set a notification message for the account.

### SavingsAccount

The `SavingsAccount` subclass extends `Account` and includes additional features for interest calculation.

#### Attributes

- `interestRate`: Annual interest rate for the account.

#### Methods

- `calculateInterest()`: Calculate and return the interest on the account balance.

### FixedDepositAccount

The `FixedDepositAccount` subclass extends `Account` and includes features for fixed deposits.

#### Attributes

- `interestRate`: Annual interest rate for the account.
- `maturityPeriod`: Maturity period for the fixed deposit in months.

### Loan

The `Loan` class manages loan details and repayments.

#### Attributes

- `amount`: Total loan amount.
- `term`: Loan term in months.
- `amountRepaid`: Amount repaid so far.

#### Methods

- `repay(amount)`: Repay a specified amount of the loan.
- `getOutstandingAmount()`: Get the outstanding loan amount.

### Bank

The `Bank` class manages account-related operations.

#### Methods

- `addAccount(account)`: Add a new account to the bank.
- `deposit(accountNumber, amount)`: Deposit money into a specific account.
- `withdraw(accountNumber, amount)`: Withdraw money from a specific account.
- `getAccountBalance(accountNumber)`: Get the current balance of a specific account.
- `transfer(sourceAccountNumber, destinationAccountNumber, amount)`: Transfer money between accounts.
- `closeAccount(accountNumber)`: Close a specific account.
- `updateAccountInfo(accountNumber, holderName)`: Update account holder information.
- `viewTransactionHistory(accountNumber)`: View transaction history of a specific account.
- `calculateInterest(accountNumber)`: Calculate the interest for a specific account.
- `setWithdrawalLimit(accountNumber, limit)`: Set the withdrawal limit for a specific account.
- `applyForLoan(accountNumber, amount, term)`: Apply for a loan for a specific account.
- `viewLoanStatus(accountNumber)`: View the loan status of a specific account.
- `repayLoan(accountNumber, amount)`: Repay the loan for a specific account.
- `setupRecurringDeposit(accountNumber, amount, frequency)`: Set up recurring deposits for a specific account.
- `exportAccountStatement(accountNumber)`: Export the account statement for a specific account.

### BankApplication

The `BankApplication` class provides a command-line interface for customers to interact with the banking system.

## Usage

1. Clone the repository:

   ```bash
   git clone https://github.com/yousofkortam/Bank-system.git
   cd Bank-system
   ```

2. Compile the Java source files:

   ```bash
   javac *.java
   ```

3. Run the `BankApplication` class:

   ```bash
   java BankApplication
   ```

## Installation

Follow the steps mentioned in the [Usage](#usage) section to set up and run the banking application.

## Contributing

Contributions to this project are welcome! If you would like to contribute, please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Make your changes and test thoroughly.
4. Create a pull request explaining your changes and the problem they solve.
