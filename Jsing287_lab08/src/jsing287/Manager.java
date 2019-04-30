/**
 * Manager is a subclass of the Employee class.
 * This class has unique two unique fields of a store code and 
 * operating budget. All other information about objects of this class are 
 * given from the Employee class.
 * Author: Jasdeep Singh
 * Created on: March 26, 2019
 */


package jsing287;

public class Manager extends Employee
{

	// Private fields of Manager.
	private int opCode;
	private double budget;
	
	
	
	// Constructing a new Manager Object with all of the Employee fields and specific ones pertaining only to this subclass.
	public Manager(String firstName, String lastName, int number, int salary, int operating, double money)
	{
		super(firstName, lastName, number, salary);
		opCode  = operating;
		budget = money;
		
	}
	
	
	
	// This method overrides the Employee class's printInfo method when called.
	public void printInfo()
	{
		System.out.println(m_firstName + " " + m_lastName + ", ID: " + m_ID + ", Salaray: $" + m_salaray + ", Store Code: " + opCode + ", Budget: $" + budget);
		System.out.println();
	}
	
	


}
