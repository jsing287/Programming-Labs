/**
 * 
 */
package jsing287;

import java.util.Scanner;

/**
 * This class asks the user for two integer numbers
 * and then carries out arithmetic with the entered values and
 * outputs the result to the user.
 * Author: Jasdeep Singh
 * Date: January 22, 2019
 */
public class jsing287_lab00_q1 {

	// This method accepts two integer values from the user and carries out a division, multiplication, then addition with those values.
	public static void main(String[] args) {
		//Declare integer variables
		int integer1 = 0;  // first number to be input by user
		int integer2 = 0;  // second number to be input by user
		int result;   // variable in which sum will be stored
		
		
		
		//Declare a different type variable
		Scanner inputScanner = new Scanner(System.in);
		//Ask you TA about this line
		
		System.out.println("Enter an integer: ");
		// prompt; "\n" represents a new line
		// read an integer using the inputScanner variable
		integer1 = inputScanner.nextInt();
		
		System.out.println("Enter a second integer");
		integer2 = inputScanner.nextInt();
		
		//Compute a value.
		result = integer1 / integer2 * integer1 + integer2;
		
		//Output the result to the console
		System.out.println("The result is: " + Integer.toString(result));
		
		// Terminating the scanner object.
		inputScanner.close();

	}

}
