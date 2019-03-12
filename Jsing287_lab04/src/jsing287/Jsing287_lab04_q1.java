/**
 * This class is a factorial calculator
 * Author: Jasdeep Singh
 * Date: March 5, 2019
 */


package jsing287;

import java.util.Scanner;

public class Jsing287_lab04_q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Declaring local variables and the scanner.
		double factorial = 1;
		int number = 0;
		Scanner input = new Scanner(System.in);
		
		// Prompting user for the factorial number.
		System.out.println("Input an integer number to determine its factorial: ");
		
		number = input.nextInt();
		
		// Verifying input
		while(!(number >= 0))
		{
			System.out.println("Invalid Entry! Please enter a positive integer: ");
			number = input.nextInt();
		}
		
	
		// Calculating factorial.
		for(int i = 1; i <=number; i++)
		{
			factorial *= i;
		}
		
		System.out.println("The resulting factorial is " + factorial);
		
		
		
	}
	

}
