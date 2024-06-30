import java.util.ArrayList;
import java.util.List;

abstract class Account {
    private int accountNumber;
    private String holderName;
    private double balance;
    private double withdrawalLimit;
    private List<String> transactionHistory = new ArrayList<>();
    private Loan loan;
    private String notification;

    public Account(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        transactionHistory.add("Deposited: " + amount + " at " + java.time.LocalDateTime.now());
    }

    public void withdraw(double amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Insufficient funds.");
        }
        if (amount > withdrawalLimit) {
            throw new Exception("Withdrawal limit exceeded.");
        }
        balance -= amount;
        transactionHistory.add("Withdrew: " + amount + " at " + java.time.LocalDateTime.now());
    }

    public List<String> getTransactionHistory() {
        return transactionHistory;
    }

    public void setWithdrawalLimit(double limit) {
        this.withdrawalLimit = limit;
    }

    public void applyForLoan(double amount, int term) {
        loan = new Loan(amount, term);
        transactionHistory.add("Loan applied: " + amount + " at " + java.time.LocalDateTime.now());
    }

    public String getLoanStatus() {
        if (loan == null) {
            return "No loan.";
        }
        return loan.toString();
    }

    public void repayLoan(double amount) {
        if (loan != null) {
            loan.repay(amount);
            transactionHistory.add("Loan repaid: " + amount + " at " + java.time.LocalDateTime.now());
        }
    }

    public void setupRecurringDeposit(double amount, int frequency) {
        transactionHistory.add("Recurring deposit set up: " + amount + " every " + frequency + " days at " + java.time.LocalDateTime.now());
    }

    public void setNotification(String message) {
        this.notification = message;
    }

    public String getNotification() {
        return notification;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", holderName='" + holderName + '\'' +
                ", balance=" + balance +
                ", withdrawalLimit=" + withdrawalLimit +
                '}';
    }
}
