class Vehicle{

    private String ownerName;
    private String vehicleType;
    private static int registrationFee= 12345;

    public Vehicle(String ownerName,String vehicleType){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
    }

    public void  displayVehicleDetails(){
        System.out.println("Owner name : "+ ownerName);
        System.out.println("vehicle Type :"+vehicleType);
        System.out.println("Registration fee:" +registrationFee);
    }

    public static void updateRegistrationFee(int newRegistrationFee){
        registrationFee= newRegistrationFee;
    }

}

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