class SavingsAccount extends Account {
    private final double interest;

    public SavingsAccount(int accountNumber, String accountHolderName, double balance, double interest) {
        super(accountNumber, accountHolderName, balance);
        this.interest = interest;
    }

    public double getInterest() {
        return interest;
    }

    public double calculateInterest() {
        double balance = getBalance();
        return balance * interest / 100.0;
    }
}
