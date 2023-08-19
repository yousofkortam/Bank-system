import java.util.ArrayList;
import java.util.List;

public class Bank {
    List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public int showNumberOfAccounts() {
        return accounts.size();
    }

    private Account findAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber)
                return account;
        }
        return null;
    }

    public void addAccount(Account account) throws Exception {
        Account searchAccount = findAccount(account.getAccountNumber());
        if (searchAccount == null) {
            accounts.add(account);
            System.out.println("Account added successfully");
            return;
        }
        throw new Exception("Account already use");
    }

    public void deposit(int accountNumber, double amount) throws IllegalArgumentException {
        Account account = findAccount(accountNumber);
        if (account == null) {
            throw new IllegalArgumentException("Account not found");
        }
        account.deposit(amount);
    }

    public void withdraw(int accountNumber, double amount) throws IllegalArgumentException {
        Account account = findAccount(accountNumber);
        if (account == null) {
            throw new IllegalArgumentException("Account not found");
        }
        account.withdraw(amount);
    }

    public double displayBalance(int accountNumber) throws IllegalArgumentException {
        Account account = findAccount(accountNumber);
        if (account == null) {
            throw new IllegalArgumentException("Account not found");
        }
        return account.getBalance();
    }

    public void displayInfo(int accountNumber) throws IllegalArgumentException {
        Account account = findAccount(accountNumber);
        if (account == null) {
            throw new IllegalArgumentException("Account not found");
        }
        System.out.println(account.showAccountInfo());
    }
}
