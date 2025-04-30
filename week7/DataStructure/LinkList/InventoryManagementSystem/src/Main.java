import java.util.Scanner;

class Item {
    String itemName;
    int itemId;
    int quantity;
    double price;
    Item next;

    public Item(int itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class InventoryList {
    private Item head;

    public void addAtBeginning(int id, String name, int qty, double price) {
        Item newItem = new Item(id, name, qty, price);
        newItem.next = head;
        head = newItem;
        System.out.println("Item added at the beginning.");
    }

    public void addAtEnd(int id, String name, int qty, double price) {
        Item newItem = new Item(id, name, qty, price);
        if (head == null) {
            head = newItem;
            System.out.println("Item added as the first item.");
            return;
        }
        Item temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newItem;
        System.out.println("Item added at the end.");
    }

    public void addAtPosition(int position, int id, String name, int qty, double price) {
        if (position <= 0) {
            System.out.println("Invalid position.");
            return;
        }
        if (position == 1) {
            addAtBeginning(id, name, qty, price);
            return;
        }

        Item newItem = new Item(id, name, qty, price);
        Item temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        newItem.next = temp.next;
        temp.next = newItem;
        System.out.println("Item added at position " + position);
    }

    public void deleteByItemId(int id) {
        Item temp = head, prev = null;
        while (temp != null && temp.itemId != id) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Item not found.");
            return;
        }

        if (prev == null) {
            head = temp.next;
        } else {
            prev.next = temp.next;
        }

        System.out.println("Item with ID " + id + " deleted.");
    }

    public void updateQuantityById(int id, int newQty) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                System.out.println("Old Quantity: " + temp.quantity);
                temp.quantity = newQty;
                System.out.println("Updated quantity for Item ID " + id);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }

    public void searchByItemId(int id) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                System.out.println("Found: ID: " + temp.itemId + ", Name: " + temp.itemName +
                        ", Quantity: " + temp.quantity + ", Price: " + temp.price);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }

    public void searchByItemName(String name) {
        Item temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                System.out.println("Found: ID: " + temp.itemId + ", Name: " + temp.itemName +
                        ", Quantity: " + temp.quantity + ", Price: " + temp.price);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("Item not found.");
        }
    }

    public void displayTotalInventoryValue() {
        Item temp = head;
        double total = 0.0;
        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: " + total);
    }

    public void displayAllItems() {
        if (head == null) {
            System.out.println("No items in inventory.");
            return;
        }

        Item temp = head;
        System.out.println("Inventory List:");
        while (temp != null) {
            System.out.println("ID: " + temp.itemId + ", Name: " + temp.itemName +
                    ", Quantity: " + temp.quantity + ", Price: " + temp.price);
            temp = temp.next;
        }
    }

    public void sortByName(boolean ascending) {
        head = mergeSortByName(head, ascending);
        System.out.println("Inventory sorted by name.");
    }

    public void sortByPrice(boolean ascending) {
        head = mergeSortByPrice(head, ascending);
        System.out.println("Inventory sorted by price.");
    }

    private Item mergeSortByName(Item head, boolean ascending) {
        if (head == null || head.next == null)
            return head;

        Item mid = getMid(head);
        Item nextMid = mid.next;
        mid.next = null;

        Item left = mergeSortByName(head, ascending);
        Item right = mergeSortByName(nextMid, ascending);

        return mergeByName(left, right, ascending);
    }

    private Item mergeSortByPrice(Item head, boolean ascending) {
        if (head == null || head.next == null)
            return head;

        Item mid = getMid(head);
        Item nextMid = mid.next;
        mid.next = null;

        Item left = mergeSortByPrice(head, ascending);
        Item right = mergeSortByPrice(nextMid, ascending);

        return mergeByPrice(left, right, ascending);
    }

    private Item mergeByName(Item a, Item b, boolean ascending) {
        if (a == null) return b;
        if (b == null) return a;

        int cmp = a.itemName.compareToIgnoreCase(b.itemName);
        if ((ascending && cmp <= 0) || (!ascending && cmp > 0)) {
            a.next = mergeByName(a.next, b, ascending);
            return a;
        } else {
            b.next = mergeByName(a, b.next, ascending);
            return b;
        }
    }

    private Item mergeByPrice(Item a, Item b, boolean ascending) {
        if (a == null) return b;
        if (b == null) return a;

        if ((ascending && a.price <= b.price) || (!ascending && a.price > b.price)) {
            a.next = mergeByPrice(a.next, b, ascending);
            return a;
        } else {
            b.next = mergeByPrice(a, b.next, ascending);
            return b;
        }
    }

    private Item getMid(Item head) {
        Item slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

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
