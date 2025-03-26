import java.util.ArrayList;

class Bank {
    private String bankName;
    private ArrayList<Customer> customers;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    public void openAccount(Customer customer, double initialDeposit) {
        BankAccount newAccount = new BankAccount(initialDeposit);
        customer.addAccount(newAccount);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        System.out.println("Account opened for " + customer.getName() + " at " + bankName + " with ₹" + initialDeposit);
    }

    public String getBankName() {
        return bankName;
    }
}

class Customer {
    private String name;
    private ArrayList<BankAccount> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("\n" + name + "'s Account Balances:");
        for (BankAccount account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber() + ", Balance: ₹" + account.getBalance());
        }
    }

    public String getName() {
        return name;
    }
}

class BankAccount {
    private static int accountCounter = 1000; // Unique account number generator
    private int accountNumber;
    private double balance;

    public BankAccount(double initialDeposit) {
        this.accountNumber = accountCounter++;
        this.balance = initialDeposit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

class BankSystem {
    public static void main(String[] args) {
        Bank myBank = new Bank("SBI Bank");

        Customer c1 = new Customer("Navaneethan");
        Customer c2 = new Customer("Elen");

        myBank.openAccount(c1, 5000);
        myBank.openAccount(c1, 10000);
        myBank.openAccount(c2, 7000);

        c1.viewBalance();
        c2.viewBalance();
    }
}
