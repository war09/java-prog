package ch2.ch2_3;

//import 'Scanner' to read user input
import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
	//This program is to get the radius input from user
	//and calculate the area of the circle
	// this is improvement of previous program

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Initiate object 'Scanner'
		// 'input' is an object variable, can be changed to other names
		Scanner input = new Scanner(System.in);
		
		// prompt user for radius
		System.out.print("Enter the radius of a circle: ");
		// declare radius and get the user input
		// use '.nextDouble' since we want input with double type
		double radius = input.nextDouble();
		input.close(); //close input stream (actually this line is not compulsory)
		
		// declare area and calculate the circle's area
		// note that this can be done in one line
		// we can declare and assign value in a same statement
		double area = radius * radius * 3.14159;
		
		System.out.println("The area of the circle of radius " + radius + " is " + area);
		// display the result and done!!

	}

}
