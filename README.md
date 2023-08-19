# Banking Application

Welcome to the Banking Application project repository! This application allows customers to manage their savings accounts, perform deposits and withdrawals, and view their account balance. The project is structured using the following classes:

- `Account`: A superclass containing account details and methods for transactions.
- `SavingsAccount`: A subclass of `Account` with an interest rate field and interest calculation.
- `Bank`: A class to manage account operations and transactions.
- `BankApplication`: A command-line interface for customers to interact with the banking system.

## Table of Contents

- [Introduction](#introduction)
- [Classes](#classes)
- - [Account](#account)
- - [SavingsAccount](#savingsaccount)
- - [Bank](#bank)
- - [BankApplication](#bankapplication)
- [Usage](#usage)
- [Installation](#installation)
- [Contributing](#contributing)

## Introduction

Managing personal finances is crucial, and this project offers a simple banking application to help customers handle their savings accounts conveniently. With a user-friendly command-line interface, users can perform transactions, calculate interest, and stay updated about their account balance.

## Classes

### Account

The `Account` superclass contains the essential fields and methods for account management.

#### Attributes

- `accountNumber`: Unique account number.
- `accountHolderName`: Name of the account holder.
- `balance`: Current account balance.

#### Methods

- `deposit(amount)`: Deposit money into the account.
- `withdraw(amount)`: Withdraw money from the account.

### SavingsAccount

The `SavingsAccount` subclass extends `Account` and includes additional features for interest calculation.

#### Attributes

- `interestRate`: Annual interest rate for the account.

#### Methods

- `calculateInterest()`: Calculate and return the interest on the account balance.

### Bank

The `Bank` class manages account-related operations.

#### Methods

- `addAccount(account)`: Add a new account to the bank.
- `deposit(accountNumber, amount)`: Deposit money into a specific account.
- `withdraw(accountNumber, amount)`: Withdraw money from a specific account.
- `getAccountBalance(accountNumber)`: Get the current balance of a specific account.

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
   
---

Feel free to customize this README according to your project's specific details. Good luck with your Banking Application project! If you need any further assistance, please don't hesitate to ask.
