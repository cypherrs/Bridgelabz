import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InventoryList inventory = new InventoryList();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Inventory Management ---");
            System.out.println("1. Add Item at Beginning");
            System.out.println("2. Add Item at End");
            System.out.println("3. Add Item at Specific Position");
            System.out.println("4. Delete by Item ID");
            System.out.println("5. Update Quantity by Item ID");
            System.out.println("6. Search by Item ID");
            System.out.println("7. Search by Item Name");
            System.out.println("8. Display All Items");
            System.out.println("9. Total Inventory Value");
            System.out.println("10. Sort by Name (Ascending)");
            System.out.println("11. Sort by Name (Descending)");
            System.out.println("12. Sort by Price (Ascending)");
            System.out.println("13. Sort by Price (Descending)");
            System.out.println("14. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            int id, qty, pos;
            String name;
            double price;

            switch (choice) {
                case 1:
                    System.out.print("Enter ID, Name, Quantity, Price: ");
                    id = sc.nextInt();
                    name = sc.next();
                    qty = sc.nextInt();
                    price = sc.nextDouble();
                    inventory.addAtBeginning(id, name, qty, price);
                    break;
                case 2:
                    System.out.print("Enter ID, Name, Quantity, Price: ");
                    id = sc.nextInt();
                    name = sc.next();
                    qty = sc.nextInt();
                    price = sc.nextDouble();
                    inventory.addAtEnd(id, name, qty, price);
                    break;
                case 3:
                    System.out.print("Enter Position: ");
                    pos = sc.nextInt();
                    System.out.print("Enter ID, Name, Quantity, Price: ");
                    id = sc.nextInt();
                    name = sc.next();
                    qty = sc.nextInt();
                    price = sc.nextDouble();
                    inventory.addAtPosition(pos, id, name, qty, price);
                    break;
                case 4:
                    System.out.print("Enter Item ID to Delete: ");
                    id = sc.nextInt();
                    inventory.deleteByItemId(id);
                    break;
                case 5:
                    System.out.print("Enter Item ID and New Quantity: ");
                    id = sc.nextInt();
                    qty = sc.nextInt();
                    inventory.updateQuantityById(id, qty);
                    break;
                case 6:
                    System.out.print("Enter Item ID to Search: ");
                    id = sc.nextInt();
                    inventory.searchByItemId(id);
                    break;
                case 7:
                    System.out.print("Enter Item Name to Search: ");
                    name = sc.next();
                    inventory.searchByItemName(name);
                    break;
                case 8:
                    inventory.displayAllItems();
                    break;
                case 9:
                    inventory.displayTotalInventoryValue();
                    break;
                case 10:
                    inventory.sortByName(true);
                    break;
                case 11:
                    inventory.sortByName(false);
                    break;
                case 12:
                    inventory.sortByPrice(true);
                    break;
                case 13:
                    inventory.sortByPrice(false);
                    break;
                case 14:
                    System.out.println("Exiting Inventory Management System.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 14);

        sc.close();
    }
}
