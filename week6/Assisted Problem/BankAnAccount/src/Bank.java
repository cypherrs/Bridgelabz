import java.util.ArrayList;
import java.util.List;

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
