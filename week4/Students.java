import java.util.ArrayList;

class Student {
    String name;
    int age;
    int id;

    Student(String n, int age, int id) {
        this.name = n;
        this.age = age;
        this.id = id;
    }

    // Override toString() for proper ArrayList printing
    @Override
    public String toString() {
        return "Name: " + name + " , Age: " + age + " , ID: " + id;
    }
}

public class Students {
    public static void main(String[] args) {
        ArrayList<Student> s1 = new ArrayList<>();
        s1.add(new Student("ram", 21, 1));
        s1.add(new Student("tam", 21, 2));
        s1.add(new Student("sam", 21, 3));
        s1.add(new Student("kam", 21, 4));
        s1.add(new Student("cam", 21, 5));
        s1.add(new Student("lam", 21, 6));
        s1.add(new Student("yam", 21, 7));
        s1.add(new Student("pam", 21, 8));
        s1.add(new Student("oam", 21, 9));
        s1.add(new Student("fam", 21, 10));
        s1.add(new Student("gam", 21, 11));
        s1.add(new Student("vam", 21, 12));
        s1.add(new Student("bam", 21, 13));
        s1.add(new Student("xam", 21, 14));
        s1.add(new Student("mam", 21, 15));
        s1.add(new Student("uam", 21, 16));
        s1.add(new Student("ram", 21, 17));
        s1.add(new Student("ram", 21, 18));
        s1.add(new Student("ram", 21, 19));
        s1.add(new Student("ram", 21, 20));

        // Iterate through the list and print each student
        for (Student student : s1) {
            System.out.println(student);
        }
    }
}
