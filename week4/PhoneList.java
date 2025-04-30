import java.util.ArrayList;

class Phone {
    String brand;
    String model;
    int year;

    Phone(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String toString() {
        return "Brand: " + brand + " , Model: " + model + " , Year: " + year;
    }
}

public class PhoneList {
    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<>();

        
        phones.add(new Phone("Apple", "iPhone 13", 2021));
        phones.add(new Phone("Samsung", "Galaxy S22", 2022));
        phones.add(new Phone("Google", "Pixel 7", 2022));
        phones.add(new Phone("OnePlus", "9 Pro", 2021));
        phones.add(new Phone("Xiaomi", "Mi 11", 2021));
        phones.add(new Phone("Sony", "Xperia 5 III", 2021));
        phones.add(new Phone("Nokia", "G50", 2021));
        phones.add(new Phone("Realme", "GT 2", 2022));
        phones.add(new Phone("Asus", "ROG Phone 6", 2022));
        phones.add(new Phone("Huawei", "P50 Pro", 2021));
        phones.add(new Phone("Apple", "iPhone 14 Pro", 2022));
        phones.add(new Phone("Samsung", "Galaxy Z Fold 4", 2022));
        phones.add(new Phone("Google", "Pixel 6a", 2022));
        phones.add(new Phone("OnePlus", "Nord 2", 2021));
        phones.add(new Phone("Xiaomi", "Redmi Note 11", 2022));
        phones.add(new Phone("Sony", "Xperia 1 IV", 2022));
        phones.add(new Phone("Nokia", "X30", 2022));
        phones.add(new Phone("Realme", "Narzo 50", 2022));
        phones.add(new Phone("Asus", "Zenfone 9", 2022));
        phones.add(new Phone("Huawei", "Mate 50", 2022));

        
        for (Phone phone : phones) {
            System.out.println(phone);
        }
    }
}
