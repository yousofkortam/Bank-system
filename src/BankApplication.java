import java.util.Scanner;

public class BankApplication {

    static Bank bank = new Bank();

    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

        boolean done = true;
        while (done) {
            System.out.println("Welcome to the banking system");
            System.out.println("1. Open a saving account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. View balance");
            System.out.println("5. Show the Number of accounts in the System");
            System.out.println("6. Show the info of a specific account");
            System.out.println("0. Exit");

            int option = getValidInteger();

            switch (option) {
                case 1 -> openSavingAccount();
                case 2 -> deposit();
                case 3 -> withdraw();
                case 4 -> viewBalance();
                case 5 -> showNumberOfAccounts();
                case 6 -> showAccountInfo();
                case 0 -> done = false;
            }
        }

    }

    private static void openSavingAccount() {
        System.out.println("Enter account number : ");
        int accountNumber = getValidInteger();
        System.out.println("Enter account holder name : ");
        String holderName = input.next();
        System.out.println("Enter account initial balance : ");
        double balance = getValidDouble();
        System.out.println("Enter interest rate : ");
        double interest = getValidDouble();
        SavingsAccount savingAccount = new SavingsAccount(accountNumber, holderName, balance, interest);
        try {
            bank.addAccount(savingAccount);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void deposit() {
        System.out.println("Enter account number : ");
        int accountNumber = getValidInteger();
        System.out.println("Enter amount : ");
        double amount = getValidDouble();

        try {
            bank.deposit(accountNumber, amount);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private  static void withdraw() {
        System.out.println("Enter account number : ");
        int accountNumber = getValidInteger();
        System.out.println("Enter amount : ");
        double amount = getValidDouble();

        try {
            bank.withdraw(accountNumber, amount);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private  static void viewBalance() {
        System.out.println("Enter account number");
        int accountNumber = getValidInteger();
        try {
            System.out.println("Balance : " + bank.displayBalance(accountNumber));
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private  static void showNumberOfAccounts() {
        try {
            System.out.println("Number of accounts : " + bank.showNumberOfAccounts());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private  static void showAccountInfo() {
        System.out.print("Enter account number : ");
        int accountNumber = getValidInteger();
        try {
            bank.displayInfo(accountNumber);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static int getValidInteger() {
        int validInteger;
        do {
            String userInput = input.nextLine();
            try {
                validInteger =  Integer.parseInt(userInput);
                break;
            }catch (Exception e) {
                System.out.println("Please enter a valid number!!");
            }
        }while (true);
        return validInteger;
    }

    private static double getValidDouble() {
        double validDouble;
        do {
            String userInput = input.next();
            try {
                validDouble =  Double.parseDouble(userInput);
                break;
            }catch (Exception e) {
                System.out.println("Please enter a valid number!!");
            }
        }while (true);
        return validDouble;
    }


}