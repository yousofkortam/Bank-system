public class Loan {
    private final double amount;
    private final int term;
    private double amountRepaid;

    public Loan(double amount, int term) {
        this.amount = amount;
        this.term = term;
        this.amountRepaid = 0.0;
    }

    public double getAmount() {
        return amount;
    }

    public int getTerm() {
        return term;
    }

    public double getAmountRepaid() {
        return amountRepaid;
    }

    public void repay(double amount) {
        amountRepaid += amount;
    }

    public double getOutstandingAmount() {
        return amount - amountRepaid;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "amount=" + amount +
                ", term=" + term +
                ", amountRepaid=" + amountRepaid +
                ", outstandingAmount=" + getOutstandingAmount() +
                '}';
    }
}
