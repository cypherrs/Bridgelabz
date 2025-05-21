import java.util.*;
class Patient {
    String name;
    int severity;
    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
    @Override
    public String toString() {
        return name;
    }
}
public class HospitalTriage {
    public static void main(String[] args) {
        PriorityQueue<Patient> pq = new PriorityQueue<>((p1, p2) -> p2.severity - p1.severity);
        pq.add(new Patient("John", 3));
        pq.add(new Patient("Alice", 5));
        pq.add(new Patient("Bob", 2));
        System.out.println("Order of treatment:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}