/**
 * This class performs computations on a given integer variable to break it down into several components. 
 * Author: Jasdeep Singh
 * Date: February 5, 2019
 */
package jsing287;

import java.util.Scanner;


public class Jsing287_lab01_q3 {

	// This method breaks down the entered year into milleniums, centuries, decades, and single years
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating the subcomponent variables to hold the current year, millennium, century, decade, and  single years. 
		int millennium = 0;
		int centries = 0;
		int decade = 0;
		int year = 0;
		int holder = 0;
		int currentYear = 0;
		
		// Creating a new scanner to accept user input
		Scanner input = new Scanner(System.in);
		
		// Required header
		System.out.println("*******************************************");
		System.out.println("ES1036B: Lab 01 Q3");
		System.out.println("Date: February 5 2019");
		System.out.println("Name: Jasdeep Singh");
		System.out.println("Student Number: 251009989");
		System.out.println("Program's mission: This program will break the any given year into subcomponents ");
		System.out.println("*******************************************");
	
		// Asking the user for the current year.
		System.out.println("Please enter the current year: ");
		currentYear = input.nextInt();
		
		// Computing the subcomponents of the entered year.
		millennium = currentYear/1000; // Hold the millenniums. 
	    holder = currentYear - 1000*millennium;
		centries = holder/100; // Holds the centuries
		holder = currentYear - (1000*millennium + centries*100);
		decade = holder/10; // Holds the decades
		year = currentYear - millennium*1000 - centries*100 -  decade*10; // Holds the single years
		 
		 // Outputting the subcomponents of the year to the user.
		System.out.println("The current year is composed of " + millennium 
		+ " millenniums, " + centries+ " centries, " + decade + " decades and " + year + " single years");
		
		

	}

}
