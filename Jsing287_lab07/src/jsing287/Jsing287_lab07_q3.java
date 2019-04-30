/**
 * This class acts as data feeder into the Employee class. It prompts the user 
 * for employee information and then creates Employee objects and saves them within a 
 * data array.
 * Author: Jasdeep Singh
 * Date: March 26, 2019
 */



package jsing287;

import java.util.Scanner;

public class Jsing287_lab07_q3 
{

	// static scanner field 
	public static Scanner in =  new Scanner(System.in);
	
	
	// The main method prompts the user for the size of database array.
	public static void main(String[] args) 
	{
	
		System.out.println("Please enter the size of the data base: ");
		Employee[] members =  new Employee[in.nextInt()];
		enterData(members);
		printReport(members);

	}
	
	
	// This method allows the user to enter employee information.
	public static void enterData(Employee[] database)
	{
		
		// Local variables to hold the employee information.
		String firstName = " ";
		String lastName = " ";
		int id = 0;
		int salaray = 0;
		
		// Inputting the information for all employees.
		for(int i = 0; i < database.length; i++)
		{
			System.out.println("Please enter the employees first name: ");
			firstName = in.next();
			System.out.println("Please enter the employees last name: ");
			lastName = in.next();
			System.out.println("Pleas enter the employees id number: ");
			id = in.nextInt();
			System.out.println("Please enter the employees salaray: ");
			salaray = in.nextInt();
			while(!(salaray>=0))
			{
				System.out.println("Invalid salarary entry! Please enter a valid amount: ");
				salaray = in.nextInt();
			}
			
			database[i] =  new Employee(firstName, lastName, id, salaray);
		}
	}

	// This method invokes the printInfo method from the Employee class and prints the information of every Employee to the console.
	public static void printReport(Employee[] database)
	{
		System.out.println("Report for all employees: ");
		System.out.println();
		for(int i = 0 ; i<database.length;i++)
		{
			database[i].printInfo();
		}
	}
}
