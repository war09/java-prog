package ch2.ch2_2;

public class ComputeArea {
	public static void main(String[] args) {
		double radius; // declare radius
		double area; // declare area
		// 'double' type handles precision value like 1.752,
		// for decimal like 1,2,3 etc. use integer 'int'.
		
		radius = 20;
		// assign a value to radius
		
		area = radius * radius * 3.14159;
		// calculate using circle area formula
		// AreaOfCircle = r^2 * pi
		
		System.out.println("The area of the circle of radius " + radius + " is " + area);
		//this is how to combine text and expression in a print statement
		// this is to display the result
		
	}

}
