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
