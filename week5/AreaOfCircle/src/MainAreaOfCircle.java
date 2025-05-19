package AreaOfCircle.src;

import java.util.Scanner;

public class MainAreaOfCircle{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double radii = input.nextDouble();
		Circle circle= new Circle(radii);
		
		circle.displaydetail();
		
		input.close();
	}
	
}