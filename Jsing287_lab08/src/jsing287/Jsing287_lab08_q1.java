/**
 * This class acts as the control panel for this Employee database program. This class accepts 
 * user input for the information relating to specific employees the user is entering into the data base.
 * Three different Employee types exist, Manager, Warehouse, and Other.
 * Author: Jasdeep Singh
 * Created on: March 26, 2019
 */



package jsing287;

import java.util.Scanner;

public class Jsing287_lab08_q1 
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
		int type = 0;
		int id = 0;
		int salaray = 0;
		int storeCode = 0;
		double opBudget = 0;
		int shipments = 0;
		
		// This for loop iterates until the data base is full.
		for(int i = 0 ; i< database.length; i++)
		{
			// Prompting the user for the employee type.
			System.out.println("What type of employee will be entered: ");
			System.out.println("1. Manager");
			System.out.println("2. Warehouse");
			System.out.println("3. Other");
			type = in.nextInt();
			
			
			// This series of if-else statements asks specific questions to the user based on which type of employee is being created.
			if(type  == 3)
			{
				
				    // Accepting user inputs for employee information.
					System.out.println("Please enter the employees first name: ");
					firstName = in.next();
					System.out.println("Please enter the employees last name: ");
					lastName = in.next();
					System.out.println("Please enter the employees id number: ");
					id = in.nextInt();
					System.out.println("Please enter the employees salaray: ");
					salaray = in.nextInt();
					
					// This while loop verifies the salary amount is not negative.
					while(!(salaray>=0))
					{
						System.out.println("Invalid salarary entry! Please enter a valid amount: ");
						salaray = in.nextInt();
					}
					
					
					// Creating a new employee object that is saved in the database array at position i given by the for-loop.
					database[i] =  new Employee(firstName, lastName, id, salaray);
				
			
			}
			
			// This else statement runs if the employee being created is a Warehouse type employee.
			else if(type ==2)
			{
				
				    // Asking user for preliminary employee information.
					System.out.println("Please enter the employees first name: ");
					firstName = in.next();
					System.out.println("Please enter the employees last name: ");
					lastName = in.next();
					System.out.println("Please enter the employees id number: ");
					id = in.nextInt();
					System.out.println("Please enter the employees salaray: ");
					salaray = in.nextInt();
					
					// Verifying salary is not negative.
					while(!(salaray>=0))
					{
						System.out.println("Invalid salarary entry! Please enter a valid amount: ");
						salaray = in.nextInt();
					}
					
					System.out.println("Please input the daily shipments assigned: ");
					shipments = in.nextInt();
					
					// Creating a new Warehouse object and saving it in the database array at position i given by the for-loop.
					database[i] =  new Warehouse(firstName, lastName, id, salaray, shipments);
				
			}
			
			
			// This else-if statement runs if the type of employee being created is a Manager.
			else if(type ==1)
			{
				
				    // Accepting preliminary information about the employee.
					System.out.println("Please enter the employees first name: ");
					firstName = in.next();
					System.out.println("Please enter the employees last name: ");
					lastName = in.next();
					System.out.println("Please enter the employees id number: ");
					id = in.nextInt();
					System.out.println("Please enter the employees salaray: ");
					salaray = in.nextInt();
					
					// Verifying the salary is not negative.
					while(!(salaray>=0))
					{
						System.out.println("Invalid salarary entry! Please enter a valid amount: ");
						salaray = in.nextInt();
					}
					System.out.println("Please enter the store code: ");
					storeCode = in.nextInt();
					System.out.println("Please enter the operating budget: ");
					opBudget =  in.nextDouble();
					
					// Creating a new Manager object that is saved in the database array at position i given  by the for-loop.
					database[i] =  new Manager(firstName, lastName, id, salaray, storeCode, opBudget);
				
			}
			
			
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
