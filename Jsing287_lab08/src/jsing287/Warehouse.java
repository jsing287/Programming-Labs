/**
 * Warehouse is a subclass of Employee and only has the shipment attribute
 * which makes it unique from the other classes in the program. All
 * other Warehouse attributes are inherited from Employee.
 * Author: Jasdeep Singh
 * Created on: March 26, 2019
 */


package jsing287;

public class Warehouse extends Employee 
{

	// Private field of Warehouse which holds the number of shipments.
	private int shipments;
	
	
// Constructing Warehouse objects that hold all of the Employee fields and specific ones to Warehouse.
   public Warehouse(String fName, String lName, int ID, int salary, int ship)
   {
	   super(fName, lName, ID, salary);
	   shipments = ship;
	   
	   
   }
   
   
   // This method overrides Employee's printInfo method when called by a database[] object of type Warehouse.
   public void printInfo()
	{
		System.out.println(m_firstName + " " + m_lastName + ", ID: " + m_ID + ", Salaray: $" + m_salaray + ", Shipments: " + shipments);
		System.out.println();
	}

}
