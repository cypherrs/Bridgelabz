import java.util.HashMap;
import java.util.Map;

class StoreFront {
    private Inventory inventory;
    private Map<String, Customer> customerList;

    public StoreFront(Inventory inventory) {
        this.inventory = inventory;
        this.customerList = new HashMap<>();
    }

    public boolean processOrder(String customerName, String itemName, int quantity) {
        if (inventory.reduceStock(itemName, quantity)) {
            Customer customer = customerList.getOrDefault(customerName, new Customer(customerName));
            customer.addItem(itemName, quantity);
            customerList.put(customerName, customer);

            System.out.println("Ordered Item: " + itemName + " | Quantity: " + quantity + " | Product sold to: " + customerName);
            return true;
        } else {
            System.out.println("Order failed for " + customerName + ": " + itemName + " (Insufficient or not available)");
            return false;
        }
    }

    public void printCustomerBill(String customerName) {
        Customer customer = customerList.get(customerName);
        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }

        int totalAmount = 0;
        System.out.println("Bill for " + customerName + ":");
        for (Map.Entry<String, Integer> entry : customer.getPurchasedItems().entrySet()) {
            String itemName = entry.getKey();
            int quantity = entry.getValue();
            Item item = inventory.getItemByName(itemName);
            int cost = quantity * (int) item.price;

            totalAmount += cost;
        }
        System.out.println("Total Amount: ₹" + totalAmount);
    }

    public void showAvailableItems() {

        inventory.showIntentory();
    }


}
