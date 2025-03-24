interface Loanable {
    void applyForLoan();
    boolean calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    protected double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getter for holderName
    public String getHolderName() {
        return holderName;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(getHolderName() + " deposited $" + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(getHolderName() + " withdrew $" + amount);
        } else {
            System.out.println("Insufficient balance for " + getHolderName());
        }
    }

    public abstract double calculateInterest();

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + getHolderName());
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate = 0.04; // 4% annual interest

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public void applyForLoan() {
        System.out.println(getHolderName() + " applied for a savings loan.");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return balance > 1000;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    private double interestRate = 0.01; // 1% annual interest

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public void applyForLoan() {
        System.out.println(getHolderName() + " applied for a current account loan.");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return balance > 5000;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount[] accounts = {
                new SavingsAccount("SA101", "Alice", 2000.0),
                new CurrentAccount("CA202", "Bob", 8000.0)
        };

        for (BankAccount acc : accounts) {
            System.out.println("\n==============================");
            acc.displayAccountDetails();
            acc.deposit(500);
            acc.withdraw(1000);
            System.out.println("Interest Earned: $" + acc.calculateInterest());

            if (acc instanceof Loanable) {
                Loanable loanAcc = (Loanable) acc;
                loanAcc.applyForLoan();
                boolean eligible = loanAcc.calculateLoanEligibility();
                System.out.println("Loan Eligibility: " + (eligible ? "Eligible" : "Not Eligible"));
            }
        }
    }
}
