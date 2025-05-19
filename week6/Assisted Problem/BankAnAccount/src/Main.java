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
