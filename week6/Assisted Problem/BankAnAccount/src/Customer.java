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

    public void addAccount(Account account) {

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
