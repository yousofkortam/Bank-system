import java.util.ArrayList;
import java.util.List;

class Bank {
    private List<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void deposit(int accountNumber, double amount) throws Exception {
        Account account = findAccount(accountNumber);
        account.deposit(amount);
        if (account.getBalance() < 100) {
            account.setNotification("Low balance alert!");
        }
    }

    public void withdraw(int accountNumber, double amount) throws Exception {
        Account account = findAccount(accountNumber);
        account.withdraw(amount);
        if (account.getBalance() < 100) {
            account.setNotification("Low balance alert!");
        }
    }

    public double displayBalance(int accountNumber) throws Exception {
        Account account = findAccount(accountNumber);
        return account.getBalance();
    }

    public int showNumberOfAccounts() {
        return accounts.size();
    }

    public void displayInfo(int accountNumber) throws Exception {
        Account account = findAccount(accountNumber);
        System.out.println(account);
    }

    public void transfer(int sourceAccountNumber, int destinationAccountNumber, double amount) throws Exception {
        Account sourceAccount = findAccount(sourceAccountNumber);
        Account destinationAccount = findAccount(destinationAccountNumber);
        sourceAccount.withdraw(amount);
        destinationAccount.deposit(amount);
    }

    public void closeAccount(int accountNumber) throws Exception {
        Account account = findAccount(accountNumber);
        accounts.remove(account);
    }

    public void updateAccountInfo(int accountNumber, String holderName) throws Exception {
        Account account = findAccount(accountNumber);
        account.setHolderName(holderName);
    }

    public void viewTransactionHistory(int accountNumber) throws Exception {
        Account account = findAccount(accountNumber);
        System.out.println(account.getTransactionHistory());
    }

    public double calculateInterest(int accountNumber) throws Exception {
        Account account = findAccount(accountNumber);
        if (account instanceof SavingsAccount) {
            return ((SavingsAccount) account).calculateInterest();
        } else if (account instanceof FixedDepositAccount) {
            return ((FixedDepositAccount) account).calculateMaturityAmount() - account.getBalance();
        } else {
            throw new Exception("Interest calculation is only available for savings and fixed deposit accounts.");
        }
    }

    public void setWithdrawalLimit(int accountNumber, double limit) throws Exception {
        Account account = findAccount(accountNumber);
        account.setWithdrawalLimit(limit);
    }

    public void applyForLoan(int accountNumber, double amount, int term) throws Exception {
        Account account = findAccount(accountNumber);
        account.applyForLoan(amount, term);
    }

    public void viewLoanStatus(int accountNumber) throws Exception {
        Account account = findAccount(accountNumber);
        System.out.println(account.getLoanStatus());
    }

    public void repayLoan(int accountNumber, double amount) throws Exception {
        Account account = findAccount(accountNumber);
        account.repayLoan(amount);
    }

    public void setupRecurringDeposit(int accountNumber, double amount, int frequency) throws Exception {
        Account account = findAccount(accountNumber);
        account.setupRecurringDeposit(amount, frequency);
    }

    public void exportAccountStatement(int accountNumber) throws Exception {
        Account account = findAccount(accountNumber);
        System.out.println("Exporting statement for account: " + account);
        // Implementation for exporting the statement to a file can be added here
    }

    private Account findAccount(int accountNumber) throws Exception {
        return accounts.stream()
                .filter(account -> account.getAccountNumber() == accountNumber)
                .findFirst()
                .orElseThrow(() -> new Exception("Account not found."));
    }
}
