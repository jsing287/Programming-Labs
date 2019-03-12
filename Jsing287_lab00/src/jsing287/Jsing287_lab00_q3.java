/**
 * This class was created to accept Cartesian points from users and calculate distances from these values
 * Created by: Jasdeep Singh
 * Created on: January 22, 2019
 */

package jsing287;

import java.util.Scanner;


public class Jsing287_lab00_q3 {


	// This method takes points on a Cartesian grid given by the user input and calculates the parameters of a triangle
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Initializes a Scanner to read in user input from the keyboard
		Scanner inputScanner = new Scanner(System.in);
		
		// Initializes the Double  x and y variables of the first and second point and side lengths of the triangle
		Double x1 = 0.0, y1 = 0.0, x2 = 0.0 , y2 = 0.0, side1 = 0.0, side2 = 0.0, distance = 0.0, perimeter = 0.0;
		
		
		// Prints to the console asking the user for the x value of the first point
		System.out.println("Please enter the x value of the first point:");
		
		// Sets the x1 variable equal to a number given by the user 
		x1 = inputScanner.nextDouble();
		
		
		// Prints to the console asking the user for the y value of the first point
		System.out.println("Please enter the y value of the first point:");
		
		// Sets the y value of the first point equal to a value given by the user
		y1 = inputScanner.nextDouble();
		
		// Asks the user for the x value of the second point
		System.out.println("Please enter the x value of the second point:");
		
		// Sets the x value of the second point equal to a value given by the user
		x2 = inputScanner.nextDouble();
		
		// Asks the user for the y value of the second point
		System.out.println("Please enter the y value of the second point:");
		
		// Sets the y value of the second point equal to a value given by the user 
		y2 = inputScanner.nextDouble();
		
		// Calculating the side lengths of the triangle
		side1 = Math.abs(y2-y1); // Takes the absolute value of difference between the y-components of the two points
		
		side2 = Math.abs(x2-x1); // Takes the absolute value of the difference between the x-components of the two points

		
		// Calculating the hypotenuse of the triangle also being the distance between points 1 and 2.
		distance = Math.sqrt((Math.pow(side1, 2.0) + Math.pow(side2, 2.0)));
		
		// Summing the three sides of the triangle and holding that value in the perimeter variable
		perimeter = side1 + side2 + distance;
		
		
		// Outputs the perimeter of the triangle formed by the points given by the user to the console
		System.out.println("The perimeter of the triangle formed by points " + "(" + Double . toString(x1) + ',' 
				+ 	Double . toString(y1) + ")" + 
				" and " + "(" + Double . toString(x2) + ',' 
				+ Double . toString(y2) + ")" + " is " + perimeter );
		
		

	}

}
