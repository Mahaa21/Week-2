public class BankAccount {

    private static String bankName = "Bank of Baroda";
    private String accountHolderName;
    private final int accountNumber;
    private static int totalAccounts = 0;

    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    static int getTotalAccounts() {
        return totalAccounts;
    }

    public void display() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Total Accounts: " + getTotalAccounts());
        System.out.println("-----------------------------------------------");
    }
}

class Main {

    public static void main(String[] args){

        BankAccount account1 = new BankAccount("Nax", 560);
        if (account1 instanceof BankAccount) {
            System.out.println("account1 is an instance of BankAccount.");
        }
        account1.display();

        BankAccount account2 = new BankAccount("Navaneethan", 561);
        if (account2 instanceof BankAccount) {
            System.out.println("account2 is an instance of BankAccount.");
        }
        account2.display();
    }
}
