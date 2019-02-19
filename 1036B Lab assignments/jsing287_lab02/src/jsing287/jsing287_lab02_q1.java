/**
 * This class determines if integers are divisors of a reference integer.
 * Author: Jasdeep Singh
 * Date: February 12, 2019
 */
package jsing287;

import java.util.Scanner;


public class jsing287_lab02_q1 {

	// This method accepts three integer variables and determines if the first variable is divisible by the second, and third entered integers.
	public static void main(String[] args) {
		
		
		// Outputting required header.
		System.out.println("*******************************************");
		System.out.println("ES1036B: Lab 02 Q1");
		System.out.println("Date: February 12 2019");
		System.out.println("Name: Jasdeep Singh");
		System.out.println("Student Number: 251009989");
		System.out.println("Program's mission: This program will determine if two integers are divisors of a reference integer.");
		System.out.println("*******************************************");

		// The variables that will be used in the program.
		int initial = 0;
		int first = 0;
		int second = 0;
		
		// Declaring a Scanner in the program named input.
		Scanner input = new Scanner(System.in);
		
		// Asking the user for the integer, divisor one, and divisor two and scanning them in to their respective variables.
		System.out.println("Please enter an integer: ");
		initial = input.nextInt();
		System.out.println("Please enter the first divisor: ");
		first = input.nextInt();
		System.out.println("Please enter the second divisor: ");
		second = input.nextInt();
		
		// A series of if, and else-if statements to determine if the initial variable is a factor of both, or just one of the entered divisors.
		if(initial%first == 0 && initial%second == 0)
		{
			// Outputting to the user that the integer is divisible by both divisors
			System.out.println("The number is divisible by both divisors");
			System.out.println("Goodbye!");
		}
		else if(initial%first == 0 && initial%second != 0)
		{
			// Outputting to the user that the integer is divisible by only the first divisor.
			System.out.println("The number is divisble by the first divisble only.");
			System.out.println("Goodbye!");
		}
		else if(initial%second == 0 && initial%first != 0)
		{
			// Outputting to the user that the integer is divisible by only the second divisor.
			System.out.println("The number is divisble by the second divisble only.");
			System.out.println("Goodbye!");
		}
		else
		{
			// Outputting to the user that the integer is divisible by neither divisor.
			System.out.println("The number is not divisble by either divisor");
			System.out.println("Goodbye!");
		}
		
		
		
	}

}
