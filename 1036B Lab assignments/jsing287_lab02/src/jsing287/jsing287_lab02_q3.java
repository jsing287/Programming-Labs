/**
 * This class creates a program to mimic a calculator.
 * Author: Jasdeep Singh
 * Date: February 12, 2019
 */

package jsing287;

import java.util.Scanner;


public class jsing287_lab02_q3 {

	/**
	 * This method functions as a calculator for the user, allowing calculations
	 * such as addition, subtraction, division, multiplication, modulus, and monthly loan payment.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Outputting required program header.
		System.out.println("*******************************************");
		System.out.println("ES1036B: Lab 02 Q3");
		System.out.println("Date: February 12 2019");
		System.out.println("Name: Jasdeep Singh");
		System.out.println("Student Number: 251009989");
		System.out.println("Program's mission: This program will act as a calculator for the user providing various calculations for two numbers. ");
		System.out.println("*******************************************");
		
		// Declaring the first, second, and choice variables for the program.
		double num1;
		double num2;
		int choice;
	
		// Creating the scanner object and accepting user input for the first, and second numbers to use in the program.
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the first number.");
		num1 = input.nextDouble();
		System.out.println("Please enter the second number.");
		num2 = input.nextDouble();
		
		// Listing the options to the user
		System.out.println("Which operation would you like to perform.");
		System.out.println("1. Addition.");
		System.out.println("2. Subtraction"); 
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Modulo");
		System.out.println("6. Five Year Loan: Monthly Payment");
		
		// Holds the users choice of which options to use in the program
		choice = input.nextInt();
		
		// this switch statements holds the functions of the listed options given to the user above.
		switch(choice)
		{
		case 1: 
			// Holds the sum of the two entered numbers and then outputs the result to the user.
			double sum = num1 + num2;
			System.out.println("The result is " + sum);
			System.out.println("Goodbye!");
		break;
		
		case 2:
			// Holds the difference of the two entered numbers and then outputs the result to the user.
			double difference = num1 = num2;
			System.out.println("The reuslt is " + difference);
			System.out.println("Goodbye!");
		break;
		
		case 3: 
			// Holds the product of the two entered numbers and then outputs the result to the user.
			double product = num1*num2;
			System.out.println("The result is " + product);
		    System.out.println("Goodbye!");
		break;
		
		case 4: 
			// Holds the division of the two entered numbers and then outputs the result to the user.
			double division = num1/num2;
			System.out.println("The result is " + division);
			System.out.println("Goodbye!");
			
		break;
		
		case 5:
			// Holds the remainder of the two entered numbers and then outputs the result to the user.
			double mod = num1%num2;
			System.out.println("The result is " + mod);
			System.out.println("Goodbye!");
		break;
		
		case 6: 
			// Holds the monthly payment of the two entered numbers and then outputs the result to the user.
			double monthlyPayment = (num1 * num2)/(1-(1/(Math.pow(1+num2, 60))));
			System.out.println("The result is " + monthlyPayment);
			System.out.println("Goodbye!");
		break;
		
		default:
			// If the entered choice is not one of the options the default option outputs an error message to the user.
			System.out.println("Invalid choice please re-run the program to try again. \nGoodbye!");
		 
		 
		
		
		
		
		
		
		}
	
		
		
		
		
		
		
		
		
	}

}
