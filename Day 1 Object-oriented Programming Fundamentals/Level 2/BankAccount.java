import java.util.Scanner;
public class BankAccount {

    private String accountHolder;
    private String accountNumber;
    private int balance;

    public BankAccount (String accountHolder, String accountNumber, int balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int DepositMoney (int deposit){
        if (deposit > 0) {
            balance += deposit;
            System.out.println("Successfully Deposited ₹" + deposit);
        }
        else {
            System.out.println("Amount is not valid!");
        }
        return balance;
    }

    public void Withdrawal (int withdraw) {
        if (withdraw > balance) {
            System.out.println("Insufficient Balance!");
        }
        else if (withdraw > 0 && withdraw <= balance){
            balance -= withdraw;
            System.out.println("Successfully Withdrawn ₹" + balance);
        }
        else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: ₹" + balance);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount bank = new BankAccount("Alex Park", "9845615", 100000);
        while (true) {
            System.out.println("ATM Menu:");
            System.out.println("1. Deposit  Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit ATM");
            System.out.print("Choose an option: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ₹");
                    int depositAmount = input.nextInt();
                    bank.DepositMoney(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    int withdrawAmount = input.nextInt();
                    bank.Withdrawal(withdrawAmount);
                    break;

                case 3:
                    bank.displayBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM!");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");

            }
        }
    }
}

