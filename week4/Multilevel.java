class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving...");
    }
}

class ElectricCar extends Car {
    void chargeBattery() {
        System.out.println("Battery charging...");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar();
        tesla.start(); // From Vehicle
        tesla.drive(); // From Car
        tesla.chargeBattery(); // Own method
    }
}
