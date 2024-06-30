import java.util.Scanner;

public class BankApplication {

    static Bank bank = new Bank();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        boolean done = true;
        while (done) {
            System.out.println("Welcome to the banking system");
            System.out.println("1. Open a saving account");
            System.out.println("2. Open a fixed deposit account");
            System.out.println("3. Deposit money");
            System.out.println("4. Withdraw money");
            System.out.println("5. View balance");
            System.out.println("6. Show the number of accounts in the system");
            System.out.println("7. Show the info of a specific account");
            System.out.println("8. Transfer money between accounts");
            System.out.println("9. Close an account");
            System.out.println("10. Update account information");
            System.out.println("11. View transaction history");
            System.out.println("12. Calculate interest");
            System.out.println("13. Set withdrawal limit");
            System.out.println("14. Apply for a loan");
            System.out.println("15. View loan status");
            System.out.println("16. Repay loan");
            System.out.println("17. Setup recurring deposits");
            System.out.println("18. Export account statements");
            System.out.println("0. Exit");

            int option = getValidInteger();

            switch (option) {
                case 1 -> openSavingAccount();
                case 2 -> openFixedDepositAccount();
                case 3 -> deposit();
                case 4 -> withdraw();
                case 5 -> viewBalance();
                case 6 -> showNumberOfAccounts();
                case 7 -> showAccountInfo();
                case 8 -> transferMoney();
                case 9 -> closeAccount();
                case 10 -> updateAccountInfo();
                case 11 -> viewTransactionHistory();
                case 12 -> calculateInterest();
                case 13 -> setWithdrawalLimit();
                case 14 -> applyForLoan();
                case 15 -> viewLoanStatus();
                case 16 -> repayLoan();
                case 17 -> setupRecurringDeposits();
                case 18 -> exportAccountStatements();
                case 0 -> done = false;
            }
        }
    }

    private static void openSavingAccount() {
        System.out.println("Enter account number: ");
        int accountNumber = getValidInteger();
        System.out.println("Enter account holder name: ");
        String holderName = input.next();
        System.out.println("Enter account initial balance: ");
        double balance = getValidDouble();
        System.out.println("Enter interest rate: ");
        double interest = getValidDouble();
        SavingsAccount savingAccount = new SavingsAccount(accountNumber, holderName, balance, interest);
        try {
            bank.addAccount(savingAccount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void openFixedDepositAccount() {
        System.out.println("Enter account number please: ");
        int accountNumber = getValidInteger();
        System.out.println("Enter account holder name: ");
        String holderName = input.next();
        System.out.println("Enter account initial balance: ");
        double balance = getValidDouble();
        System.out.println("Enter interest rate: ");
        double interest = getValidDouble();
        System.out.println("Enter maturity period (months): ");
        int maturityPeriod = getValidInteger();
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount(accountNumber, holderName, balance, interest, maturityPeriod);
        try {
            bank.addAccount(fixedDepositAccount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void deposit() {
        System.out.println("Enter account number: ");
        int accountNumber = getValidInteger();
        System.out.println("Enter amount: ");
        double amount = getValidDouble();
        try {
            bank.deposit(accountNumber, amount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void withdraw() {
        System.out.println("Enter account number: ");
        int accountNumber = getValidInteger();
        System.out.println("Enter amount: ");
        double amount = getValidDouble();
        System.out.println("Enter PIN: ");
        int pin = getValidInteger();
        // All accounts have a default PIN 1234 for simplicity
        if (pin != 1234) {
            System.out.println("Invalid PIN");
            return;
        }
        try {
            bank.withdraw(accountNumber, amount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void viewBalance() {
        System.out.println("Enter account number: ");
        int accountNumber = getValidInteger();
        try {
            double balance = bank.displayBalance(accountNumber);
            System.out.println("Balance: " + balance);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void showNumberOfAccounts() {
        int numberOfAccounts = bank.showNumberOfAccounts();
        System.out.println("Number of accounts: " + numberOfAccounts);
    }

    private static void showAccountInfo() {
        System.out.println("Enter account number: ");
        int accountNumber = getValidInteger();
        try {
            bank.displayInfo(accountNumber);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void transferMoney() {
        System.out.println("Enter source account number: ");
        int sourceAccountNumber = getValidInteger();
        System.out.println("Enter destination account number: ");
        int destinationAccountNumber = getValidInteger();
        System.out.println("Enter amount: ");
        double amount = getValidDouble();
        try {
            bank.transfer(sourceAccountNumber, destinationAccountNumber, amount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void closeAccount() {
        System.out.println("Enter account number: ");
        int accountNumber = getValidInteger();
        try {
            bank.closeAccount(accountNumber);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void updateAccountInfo() {
        System.out.println("Enter account number: ");
        int accountNumber = getValidInteger();
        System.out.println("Enter new account holder name: ");
        String holderName = input.next();
        try {
            bank.updateAccountInfo(accountNumber, holderName);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void viewTransactionHistory() {
        System.out.println("Enter account number: ");
        int accountNumber = getValidInteger();
        try {
            bank.viewTransactionHistory(accountNumber);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void calculateInterest() {
        System.out.println("Enter account number: ");
        int accountNumber = getValidInteger();
        try {
            double interest = bank.calculateInterest(accountNumber);
            System.out.println("Calculated interest: " + interest);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void setWithdrawalLimit() {
        System.out.println("Enter account number: ");
        int accountNumber = getValidInteger();
        System.out.println("Enter new withdrawal limit: ");
        double limit = getValidDouble();
        try {
            bank.setWithdrawalLimit(accountNumber, limit);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void applyForLoan() {
        System.out.println("Enter account number: ");
        int accountNumber = getValidInteger();
        System.out.println("Enter loan amount: ");
        double amount = getValidDouble();
        System.out.println("Enter loan term (months): ");
        int term = getValidInteger();
        try {
            bank.applyForLoan(accountNumber, amount, term);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void viewLoanStatus() {
        System.out.println("Enter account number: ");
        int accountNumber = getValidInteger();
        try {
            bank.viewLoanStatus(accountNumber);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void repayLoan() {
        System.out.println("Enter account number: ");
        int accountNumber = getValidInteger();
        System.out.println("Enter repayment amount: ");
        double amount = getValidDouble();
        try {
            bank.repayLoan(accountNumber, amount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void setupRecurringDeposits() {
        System.out.println("Enter account number: ");
        int accountNumber = getValidInteger();
        System.out.println("Enter recurring deposit amount: ");
        double amount = getValidDouble();
        System.out.println("Enter frequency (days): ");
        int frequency = getValidInteger();
        try {
            bank.setupRecurringDeposit(accountNumber, amount, frequency);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void exportAccountStatements() {
        System.out.println("Enter account number: ");
        int accountNumber = getValidInteger();
        try {
            bank.exportAccountStatement(accountNumber);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static int getValidInteger() {
        while (!input.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid number.");
            input.next();
        }
        return input.nextInt();
    }

    private static double getValidDouble() {
        while (!input.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            input.next();
        }
        return input.nextDouble();
    }
}
