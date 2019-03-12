/**
 * This class is created to use mathematical operations to 
 * calculate the difference between two points on a 2-D Cartesian grid.
 * Author: Jasdeep singh
 * Date: January 22, 2019
 */
package jsing287;


public class Jsing287_lab00_q2 {

	
	// This method calculates the distance between to points
	public static void main(String[] args) {
		
		// Declaring double variables to use as points.
		double x1 = 1, y1 = 2, x2 = 4, y2 = 7,  // setting x and y  values for the two points on the grid.
				side1 = 0, side2 = 0, distance = 0; // initializing variables for triangle parameters and distance between points
		
		
		// Find the side lengths using the difference between two points.
		side1 = x2 - x1;
		side2 = y2 - y1;
		
		// Calculates the distance between the points by using the Pythagorean Theorem
		distance =  Math.sqrt(side1*side1 + Math.pow(side2, 2.0));
		
		//Outputs the distance between the two points to the user in the Console.
		System . out . println (" The distance between points (" +
				Double . toString ( x1 ) + "," + Double . toString ( y1 ) +
				") and (" + Double . toString ( x2 ) + "," +
				Double . toString ( y2 ) + ") is " +
				Double . toString ( distance ));
		

	}

}
