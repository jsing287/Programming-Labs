/**
 * This class populates an array then prints it out.
 * Author: Jasdeep Singh
 * Date: March 19, 2019
 * 
 * 
 */
package jsing287;


public class Jsing287_lab06_q1 {

	// This method fills in array with values 0-9 then prints it to the console.
	public static void main(String[] args) 
	{
		
		
		// Declaring the integer array.
		Integer[] numbers =  new Integer[10];
	
		
		// A for loop to populates the array.
		for(int i = 0; i<10;i++)
		{
			numbers[i] = i;
			
		}

		// This for-loop prints the array out.
		for(int e =0; e<10;e++)
		{
			System.out.println(numbers[e]);
		}
	}

}
