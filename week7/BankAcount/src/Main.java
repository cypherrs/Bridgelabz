class BankAccount {
    private static String bankName = "Global Bank";
    private static int totalAccounts = 0;

    private String accountHolderName;
    private final int accountNumber;
    private double balance;

    public BankAccount(String accountHolderName, int accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        totalAccounts++;
    }


    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Invalid account!");
        }
    }

}
public class Main {
    // Main method to test functionality
    public static void main(String[] args) {
//        BankAccount acc1 = new BankAccount("Alice", 101, 5000);
//        BankAccount acc2 = new BankAccount("Bob", 102, 7000);
//
//        acc1.displayAccountDetails();
//        acc2.displayAccountDetails();
//
//        BankAccount.getTotalAccounts();

        DemoStack<Integer> s1 = new DemoStack<>();
        s1.deque();
        s1.enque(19);
        s1.enque(69);
        s1.deque();
        s1.deque();

    }
}
