/**
 * This class acts as the frame work for 
 * crating every Employee object.
 * Author: Jasdeep Singh
 * Date: March 26, 2019
 */


package jsing287;

public class Employee 
{
	
	// Private fields for the class that act as the object attributes.
	private String m_firstName = " ";
	private String m_lastName = " ";
	private int m_ID = 0;
	private int m_salaray = 0;
	
	
	// Constructing each employees name, ID, and salary.
	public Employee(String fName, String lName, int ID, int salary)
	{
		m_firstName = fName;
		m_lastName = lName;
		m_ID = ID;
		m_salaray = salary;
	}


	// This method prints the Employee info to the console.
	public void printInfo()
	{
		System.out.println(m_firstName + " " + m_lastName + ", ID: " + m_ID + ", Salaray: $" + m_salaray);
		System.out.println();
	}

}
