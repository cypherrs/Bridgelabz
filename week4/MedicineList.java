import java.util.ArrayList;

class Medicine {
    String name;
    int expiryYear;

    Medicine(String name, int expiryYear) {
        this.name = name;
        this.expiryYear = expiryYear;
    }


    public String toString() {
        return "Medicine: " + name + " , Expiry Year: " + expiryYear;
    }
}

public class MedicineList {
    public static void main(String[] args) {
        ArrayList<Medicine> medicines = new ArrayList<>();

        medicines.add(new Medicine("Paracetamol", 2025));
        medicines.add(new Medicine("Ibuprofen", 2026));
        medicines.add(new Medicine("Azithromycin", 2024));
        medicines.add(new Medicine("Amoxicillin", 2025));
        medicines.add(new Medicine("Cetirizine", 2026));
        medicines.add(new Medicine("Dolo 650", 2025));
        medicines.add(new Medicine("Metformin", 2027));
        medicines.add(new Medicine("Aspirin", 2025));
        medicines.add(new Medicine("Ranitidine", 2024));
        medicines.add(new Medicine("Pantoprazole", 2026));
        medicines.add(new Medicine("Cough Syrup", 2025));
        medicines.add(new Medicine("Dextromethorphan", 2027));
        medicines.add(new Medicine("Insulin", 2026));
        medicines.add(new Medicine("Prednisolone", 2025));
        medicines.add(new Medicine("Losartan", 2027));
        medicines.add(new Medicine("Omeprazole", 2026));
        medicines.add(new Medicine("Diclofenac", 2025));
        medicines.add(new Medicine("Atorvastatin", 2028));
        medicines.add(new Medicine("Hydroxychloroquine", 2026));
        medicines.add(new Medicine("Vitamin D3", 2027));

        for (Medicine med : medicines) {
            System.out.println(med);
        }
    }
}
