/**
 * This class acts as the frame work for 
 * creating every Employee object. It is also the super class of the program.
 * Author: Jasdeep Singh
 * Created on: March 26, 2019
 */


package jsing287;

public class Employee 
{
	
	//Fields for the class that act as the object attributes.
	public String m_firstName = " ";
	public String m_lastName = " ";
	public int m_ID = 0;
	public  int m_salaray = 0;
	
	
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
