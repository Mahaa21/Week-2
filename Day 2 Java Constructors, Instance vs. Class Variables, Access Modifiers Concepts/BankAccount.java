public class BankAccount {

    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.printf("Balance: %.2f\n" , balance);
        System.out.println("------------------------------------");
    }
}

class SavingsAccount extends BankAccount {

    public SavingsAccount (int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void DisplayDetails () {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.printf("Balance: %.2f\n" , getBalance());
        System.out.println("------------------------------------");
    }
}

class BankAccountManagement {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1462, "Anna John", 5000.00);
        System.out.println("Before updating balance in main class:");
        bankAccount.display();
        bankAccount.setBalance(93000.00);
        System.out.println("After updating balance in Main class:");
        bankAccount.display();

        SavingsAccount savingsAccount = new SavingsAccount(65135, "John Dew", 85000.00);
        System.out.println("Before updating balance in subclass:");
        savingsAccount.DisplayDetails();
        savingsAccount.setBalance(58000.00);
        System.out.println("After updating balance in subclass:");
        savingsAccount.DisplayDetails();
    }
}