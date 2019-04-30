/**
 * This class sorts the length of entered

 * Strings from shortest to longest
 * Author: Jasdeep Singh
 * Date: March 26, 2019
 */

package jsing287;

import java.util.Scanner;

public class Jsing287_lab07_q1 {

	// The main method prompts the user to enter the amount of Strings they wish to sort and then the individual Strings
	public static void main(String[] args)
	{
		
		// Prompting the user for the amount of Strings
		int numStrings = 0;
		Scanner in  =  new Scanner(System.in);
		System.out.println("How many String would you like to sort?");
		numStrings = in.nextInt();
		
		
		// Initializing String array of length numStrings.
		String[] letters =  new String[numStrings];
		
		
		// Filling the array of the user entered arrays.
		for(int i = 0; i <letters.length; i++)
		{
			System.out.println("Please enter string " + (i+1) + ": ");
			letters[i] = in.next();
		}
		
	
		// Sorting the entered array.
		sortLength(letters);
		
		
		// Outputting the sorted Strings to the console.
		System.out.println("Your sorted array is: ");
		for(int i = 0; i <letters.length; i++)
		{
			System.out.println(letters[i]);
		}
		System.out.println("Good Bye!");
		


	}
	
	
	// This method sorts an array of Strings from shortest to longest.
	public static void sortLength(String temp[])
	{
	
		// Local variables to hold temporary memory locations, check a while loop, and increment a count.
		String bigString = " ";
		String smallString = " ";
		boolean check = true;
		int count = 0;
		
		
		// This while loop will continue until the algorithm detects no misplaced strings.
		while(check == true)
		{
			
			// This for loop cycles through the array and compares adjacent array locations and their string length and switches them if needed.
			for(int i = 0; i < temp.length-1;i++)
			{
				// Checking if the current String is bigger than the next String.
				if(temp[i].length()>temp[i+1].length())
				{
					// Switches the array contents the organize the array,
					bigString = temp[i];
					smallString = temp[i+1];
					temp[i+1] = bigString;
					temp[i] = smallString;
				}
				// If the strings are sorted properly continue.
				else
				{
					continue;
				}
			}
			
			// This for loop checks the array again and if it finds a longer string before a smaller string it restarts the algorithm
			for(int i = 0; i < temp.length-1; i++)
			{
				if(temp[i].length() > temp[i+1].length())
				{
					check = true;
					break;
				}
				count++;
			}
			
			if(count == temp.length-1)
			{
				check = false;
			}
			else
			{
				count = 0;
			}
			
		
		}
		
		
	}

}
