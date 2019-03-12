
package jsing287;

import java.util.Scanner;

/**
 * @author jasdeepsingh
 *
 */
public class Jsing287_lab05_q1 {

	public static Scanner input = new Scanner(System.in);
	
	
	// This method acts as the control center for the factorial program, and calls the other methods in appropriate order.
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		// Declaring header variables
		int question = 1;
		int labNum = 5;
		String firstName = "Jasdeep";
		String lastName = "Singh";
		String missionStatement = "To determine the factorial of a user given number.";
		
		// Passing header arguments to the header method and calling it.
		printHeader(labNum, question, firstName, lastName, missionStatement);
		
		// Retrieving the number to calculate the factorial of.
		int factorialNumber = getPositiveNumber();
		
		// Passing the number to get its factorial and getting placing it in finalAnswer.
		double finalAnswer = computeFactorial(factorialNumber);
		
		// Printing the final answer out.
		System.out.println("The resulting factorial is: " + finalAnswer);
		

	}
	
	
	
	
	
	// This method uses specific arguments given from the main method and prints it out to the console.
	public static void printHeader(int labNum, int questionNum, String fName, String lName, String mission)
	{
		int missionLength = mission.length();
		for(int i = 0; i < missionLength; i++)
		{
			System.out.print("*");
		}
		System.out.println();
		System.out.println(mission);
		for(int i = 0; i < missionLength; i++)
		{
			System.out.print("*");
		}
		// Printing out the lab, question, and name variables.
		System.out.println();
	    System.out.println("Lab " + labNum);
		System.out.println("Question " + questionNum);
		System.out.println("Name: " + fName + " " + lName);
		for(int i = 0; i < missionLength; i++)
		{
			System.out.print("*");
		}
		
		
	}
	
	// This method asks the user to enter the number in which they want the factorial of.
	public static int getPositiveNumber()
	{
		// Prompting the user for the number.
		System.out.println();
		System.out.println("Input an integer number to calculate its factorial: ");
		int firstNum = input.nextInt();
		
		// Validating the entered number.
		while(!(firstNum>=0))
		{
			System.out.println("Invalid Entry! Please input a positive integer: ");
			firstNum = input.nextInt();
		}
		
		// Returning the number.
		return firstNum;
		
	}

	// This method computes the factorial.
	public static double computeFactorial(int value)
	{
		double factorial = 1;
		
		// This for loop sums the products of each number 1 to the users entered number.
		for(int i = 1; i <= value; i++)
		{
			factorial*=i;
		}
		
		// Returns the factorial.
		return factorial;
	}
}
