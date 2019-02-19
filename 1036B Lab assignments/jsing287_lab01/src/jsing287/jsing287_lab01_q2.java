/**
 * This class computes students final grade for a given amount of marks.
 * Author: Jasdeep Singh
 * Date: February 5, 2019
 */
package jsing287;

import java.util.Scanner;


public class jsing287_lab01_q2 {

	// This method computes a students final grade from four entered marks and their respective grade weightings
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		// Required header.
		System.out.println("*******************************************");
		System.out.println("ES1036B: Lab 01 Q2");
		System.out.println("Date: February 5 2019");
		System.out.println("Name: Jasdeep Singh");
		System.out.println("Student Number: 251009989");
		System.out.println("Program's mission: This program will calculate the users final grade due to four seperate grade and weight entries. ");
		System.out.println("*******************************************");
		
		// This scanner accepts user inputs for the values used in the program
		Scanner input = new Scanner(System.in);
		
		// Variable to check if the weights add up to 1 or not.
		double sum = 0;
		
		// These variables hold the first grade and its weighting
		int grade1 = 0;
		double weight1 = 0;
		
		// These variables hold the second grade and its weighting
		int grade2 = 0;
		double weight2 = 0;
		
		// These variables hold the third grade and its weighting
		int grade3 = 0;
		double weight3 =0;
		
		// These variables hold the fourth grade and its weighting
		int grade4 = 0;
		double weight4 = 0;
		
		// This integer will hold the final grade
		int finalGrade = 0;
		
		// Asks the user for the first grade and first grade weighting.
		System.out.println("Input the first grade: ");
		grade1 = input.nextInt();
	    System.out.println("Input the first grade weight: ");
		weight1 = input.nextDouble();
		
		// Asks the user for the second grade and seconds grade weighting.
		System.out.println("Input the second grade: ");
		grade2 = input.nextInt();
		System.out.println("Input the second grade weight: ");
		weight2 = input.nextDouble();
		
		// Asks the user for the third grade and third grade weighting.
		System.out.println("Input the third grade: ");
		grade3 = input.nextInt();
		System.out.println("Input the third grade weight: ");
		weight3 = input.nextDouble();
		
		// Asks the user for the fourth grade and fourth grade weighting.
		System.out.println("Input the fourth grade: ");
		 grade4 = input.nextInt();
		System.out.println("Input the fourth grade weight: ");
		weight4 = input.nextDouble();
		
		sum = weight1 + weight2 + weight3 + weight4;
		
		// this if statement checks if the entered weights add up to one. If not the final grade is calculated in a different method.
		if(sum == 1)
		{

			// Computes the final grade of the user.
			finalGrade = (int)(grade1*weight1 + grade2*weight2 + grade3*weight3 + grade4*weight4);
		
			// Outputs the final grade to the user.
			System.out.println("The course grade is: " + finalGrade);
		}
		else {
			
			// Calculates the final grade using an average and then outputs the result to the user.
			finalGrade = (int)((grade1*weight1 + grade2*weight2 + grade3*weight3 + grade4*weight4)/(weight1+weight2+weight3+weight4));
			System.out.println("The final grade is: " + finalGrade);
		}
		
		
		
		
		
	
	}

}
