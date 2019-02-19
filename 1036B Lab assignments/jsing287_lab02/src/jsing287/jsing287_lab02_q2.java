
/**
 * This class is a program that calculates the users tax from their income.
 * Author: Jasdeep Singh
 * Date: February 12, 2019
 */
package jsing287;

import java.util.Scanner;

public class jsing287_lab02_q2 {

	
	// This method calculates how much tax the user pays on their income depending on their tax category.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Outputting required header.
		System.out.println("*******************************************");
		System.out.println("ES1036B: Lab 02 Q2");
		System.out.println("Date: February 12 2019");
		System.out.println("Name: Jasdeep Singh");
		System.out.println("Student Number: 251009989");
		System.out.println("Program's mission: This program will calculate how much the user pays in taxes based on their respective category.");
		System.out.println("*******************************************");
		
		// Creating the income, tax, and choice variables that the user will later enter.
		int income;
		int choice;
		int tax;
		
		// Declaring the scanner object, asking the user for their taxable income, and storing the input in the income variable
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter you taxable income");
		income = input.nextInt();
		
		// Outputting the different tax brackets(options) to the user.
		 System.out.println("Please enter the corresponding number to your most appropriate status.");
		 System.out.println(" 1. Single\n 2. Married Filing Jointly or Qualifying Widow(er)"
		 		+ "\n 3. Married Filing Seperately\n 4. Head of house hold");
		 
		 // Storing the users choice in the choice variable.
		 choice = input.nextInt();
		 
		 // A switch statement that will carry out different operations on the users income based on their previous decisions in the program.
		 switch(choice)
		 {
		 
		 
		 // This case will run if the user is filing under the Single tax bracket.
		 case 1: 
			 
			 // A series of if-else-if statement to determine the appropriate tax percentage on the user income.
			 if(income>=0 && income <= 8350)
			 {
				tax = ((int)(income*0.10));
			 }
			 else if(income>=8351 && income<=33950)
			 {
				 tax = ((int)(income*0.15));
			 }
			 else if(income>=33951 && income<=82250)
			 {
				 tax = ((int)(income*0.25));
			 }
			 else if(income>=82251 && income<=171550)
			 {
				 tax = ((int)(income*0.28));
			 }
			 else if(income>=171551 && income<=372950)
			 {
				 tax = ((int)(income*0.33));
			 }
			 else
			 {
				 tax = ((int)(income*0.35));
			 }
			 // Outputting the users tax amount.
			 System.out.println("Your tax is " + tax + " dollars.");
			 break;
			 
		 // This case will run if the user is filing under of Married Filing Jointly or Qualifying Widow(er).
		 case 2:
			 

			 // A series of if-else-if statement to determine the appropriate tax percentage on the user income.
			 if(income>=0 && income <= 16700)
			 {
				tax = ((int)(income*0.10));
			 }
			 else if(income>= 16701 && income<=67900)
			 {
				 tax = ((int)(income*0.15));
			 }
			 else if(income>= 67901 && income<=137050)
			 {
				 tax = ((int)(income*0.25));
			 }
			 else if(income>= 137051 && income<=208850)
			 {
				 tax = ((int)(income*0.28));
			 }
			 else if(income>= 208851 && income<= 372950)
			 {
				 tax = ((int)(income*0.33));
			 }
			 else
			 {
				 tax = ((int)(income*0.35));
			 }
			 
			 // Outputting the users tax amount.
			 System.out.println("Your tax is " + tax + " dollars.");
			 break;
			 
		// This case will run if the user is filing under Married Filing Separately.
		 case 3:
			 

			 // A series of if-else-if statement to determine the appropriate tax percentage on the user income.
			 if(income>=0 && income <= 8350)
			 {
				tax = ((int)(income*0.10));
			 }
			 else if(income>=8351 && income<=33950)
			 {
				 tax = ((int)(income*0.15));
			 }
			 else if(income>=33951 && income<=68525)
			 {
				 tax = ((int)(income*0.25));
			 }
			 else if(income>=68526 && income<=104425)
			 {
				 tax = ((int)(income*0.28));
			 }
			 else if(income>=104426 && income<= 186475)
			 {
				 tax = ((int)(income*0.33));
			 }
			 else
			 {
				 tax = ((int)(income*0.35));
			 }
			 // Outputting the users tax amount.
			 System.out.println("Your tax is " + tax + " dollars.");
			 break;
			 
			// This case will run if the user is filing under Head of house hold.
		 case 4:
			 

			 // A series of if-else-if statement to determine the appropriate tax percentage on the user income.
			 if(income>=0 && income <= 11950)
			 {
				tax = ((int)(income*0.10));
			 }
			 else if(income>=11951 && income<= 45500)
			 {
				 tax = ((int)(income*0.15));
			 }
			 else if(income>= 45501 && income<= 117450)
			 {
				 tax = ((int)(income*0.25));
			 }
			 else if(income>= 117451 && income<= 190200)
			 {
				 tax = ((int)(income*0.28));
			 }
			 else if(income>= 1902001 && income<= 372950)
			 {
				 tax = ((int)(income*0.33));
			 }
			 else
			 {
				 tax = ((int)(income*0.35));
			 }
			 
			 // Outputting the users tax amount.
			 System.out.println("Your tax is " + tax + " dollars.");
			 break;
			 
			 
		 }
	}

}
