class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a; // Reference of parent class

        a = new Dog(); // Dog object
        a.sound(); // Dog barks

        a = new Cat(); // Cat object
        a.sound(); // Cat meows
    }
}
