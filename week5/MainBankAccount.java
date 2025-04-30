class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;


    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

  
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

   
    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
    }
}

public class MainBankAccount {
    public static void main(String[] args) {
  
        BankAccount account1 = new BankAccount("roshan", 123456, 1000.00);

        account1.displayBalance();
        account1.deposit(500);
        account1.displayBalance();
        account1.withdraw(300);
        account1.displayBalance();
        account1.withdraw(1500); 
		}
}
