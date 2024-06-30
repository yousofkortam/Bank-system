class FixedDepositAccount extends Account {
    private final double interest;
    private final int maturityPeriod;

    public FixedDepositAccount(int accountNumber, String accountHolderName, double balance, double interest, int maturityPeriod) {
        super(accountNumber, accountHolderName, balance);
        this.interest = interest;
        this.maturityPeriod = maturityPeriod;
    }

//    public double getInterest() {
//        return interest;
//    }

//    public int getMaturityPeriod() {
//        return maturityPeriod;
//    }

    public double calculateMaturityAmount() {
        double balance = getBalance();
        return balance + (balance * interest / 100.0 * maturityPeriod / 12);
    }
}
