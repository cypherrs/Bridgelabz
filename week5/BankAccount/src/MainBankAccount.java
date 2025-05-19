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
