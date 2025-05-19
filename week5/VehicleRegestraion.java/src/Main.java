public class Main {
    public static void main(String[] args) {
        Vehicle vech1= new Vehicle("Naman","Gt");
        System.out.println("Hello, World!");
        vech1.displayVehicleDetails();
        System.out.println("===================");

        Vehicle.updateRegistrationFee(123456432);
        vech1.displayVehicleDetails();
    }
}