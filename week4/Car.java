//Create parent class Vehicle
class Vehicle{
	String brand;
	int speed;
	
	void start(){
		System.out.println(brand+" is starting... ");
	}
	
	void stop(){
		System.out.println(brand+" is stoping");
	}
	
}
//create child class Car
class Car extends Vehicle{
	int numberOfDoors;
	
    void displayCarInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + "km/h, Doors: " + numberOfDoors);
    }
	
	
	public static void main(String[] args){
		Car car= new Car();
		car.brand= "ford";
		car.speed= 180;
		car.numberOfDoors = 4;
		
		car.start();
		car.stop();
		car.displayCarInfo();
	}
}