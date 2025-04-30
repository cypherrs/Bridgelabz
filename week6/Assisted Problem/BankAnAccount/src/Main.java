import java.util.ArrayList;
import java.util.List;

class Customer {
    private String name;
    private String customerId;
    private List<Account> accounts;

    public Customer(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account){

        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("Account Balances for " + name + ":");
        for (Account acc : accounts) {
            System.out.println(" - Account " + acc.getAccountNumber() + ": $" + acc.getBalance());
        }
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }
}

class Bank {
    private String bankName;
    private List<Customer> customers;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Customer " + customer.getName() + " added to " + bankName);
    }

    public void openAccount(Customer customer, String accountNumber) {
        Account newAccount = new Account(accountNumber);
        customer.addAccount(newAccount);
        System.out.println("Account " + accountNumber + " opened for " + customer.getName());
    }
}


class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0; // default balance
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("State Bank of Java");


        Customer customer1 = new Customer("Naman", "C001");
        Customer customer2 = new Customer("rup", "C002");


        bank.addCustomer(customer1);
        bank.addCustomer(customer2);


        bank.openAccount(customer1, "A101");
        bank.openAccount(customer1, "A102");
        bank.openAccount(customer2, "A101");



        customer1.viewBalance();
        customer2.viewBalance();

    }
}
