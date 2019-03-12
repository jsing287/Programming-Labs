/**
 * This class finds specific attributes within a set of numbers
 * which is obtained from user input.
 * Author: Jasdeep Singh
 * Date: February 26, 2019
 */
package jsing287;

import java.util.Scanner;



public class Jsing287_lab03_q3 {

	// This method asks the user for an amount integers they decide and finds the max, min, odd, even, and mean of that set of integers.
	public static void main(String[] args) 
	{
		// Outputting required program header.
		System.out.println("*******************************************");
		System.out.println("ES1036B: Lab 03 Q3");
		System.out.println("Date: February 26 2019");
		System.out.println("Name: Jasdeep Singh");
		System.out.println("Student Number: 251009989");
		System.out.println("Program's mission: This program will output the max,min,odd,even, and mean of a set of numbers along with the variance. ");
		System.out.println("*******************************************");

		// Declaring variables to hold the loop counts, sum of entered values, max value, odd value, and even value, etc1
		int loop = 0;
		int sum = 0;
		int count = 0;
		int max = 0;
		int odd = 0;
		int even = 0;
		double sum2 = 0;
		double variance = 0;
		double mean = 0;
	    
		// Initializing a Scanner object called in
		Scanner in = new Scanner(System.in);
		
		// Prompting the user to enter the size of the set of integers they will be entering.
		System.out.println("Enter an integer for the number of loop iterations: ");
		loop = in.nextInt();
		
		// A while loop the check that the entered Integer is greater than 0.
		while(!(loop > 0))
		{
			System.out.println("Invalid entry. Please enter an integer greater than 0");
			loop = in.nextInt();
		}
		
		
		// Creating a one-dimensional array the size of the set of numbers the user will be entering.
		Integer[] numbers = new Integer[loop];

		// A while loop the runs until the user has entered enough integers to fill the set.
		while(count < loop)
		{
			// Prompting the user to enter an integer and then storing that integer in a new entry within the numbers array.
			System.out.println("Enter integer" + (count+1) + ": ");
			int num = in.nextInt();
			numbers[count] = num;

				
				 // This sorting algorithm sorts the array from smallest to greatest number to allow easy access of numbers in the program.
			    for (int e = 0; e < numbers.length-1 && numbers[e] != null; e++)
			    {
			    	
			    	    // Declaring local variable entry and a nested for loop that goes through the array and switches entries to sort the array 
			        int entry = e;
			        for (int j = e + 1; j < numbers.length && numbers[j] != null; j++)
			        {
			        	    // An if statement that check if number at j is less that numbers at entry.
			            if (numbers[j] < numbers[entry]) 
			                entry = j;
			            
			            
			        //Switches the positions of the integers at e and entry in the numbers array to sort the array.
			        int smallerNum = numbers[entry];  
			        numbers[entry] = numbers[e];
			        numbers[e] = smallerNum;
			        }
			    }
			    
			
				// This for loop sums all the integer entries in the numbers array.
				for(int w = 0; w < numbers.length; w++)
				{
					if(numbers[w] == null)
					{
						break;
					}
					else
					{
						sum += numbers[w];
						
					}
					 
				}
				
				// Declaring local variables divide, mean, and min to later output to the user and setting max equal to the last entry in the array..
				int divide = count+1;
			     mean = ((double)sum)/divide;
		        int min = numbers[0];
		        max  = numbers[count];
			 
			 
		       // This for loop finds all the odd and even integers in the numbers array.
			 for(int d = 0; d < numbers.length; d++)
			 {
				 // An if statement that checks if an entry is null in the array.
				 if(numbers[d] == null)
				 {
					 break;
				 }
				 // Runs if the integer at d is divisible by 3.
				 else if(numbers[d] %2 ==0)
				 {
					 even++;
				 }
				 // Runs if the integer at d is not divisible by 2.
				 else 
				 {
					 odd++;
				 }
				
			 }
			 
			
			 // Outputting the mean, max, min, even, and odd integers present in the program.
			 System.out.println("The mean of " + (count+1) + " input(s) is: " + mean);
			 System.out.println("Max Value: " + max);
			 System.out.println("Min Value: " + min);
			 System.out.println("Even count: " + even);
			 System.out.println("Odd count: " + odd);
			 System.out.println();
			 System.out.println();
			 
			 // Checking to see if all integers are entered and outputting good bye.
			 if(count == loop-1)
			 {
				 System.out.println("Good Bye!");
				 break;
			 }
			 
			 
			 // Incrementing count, and resetting all other local variables within the loops.
			 count++;
			 sum = 0;
			 mean = 0;
			 even = 0;
			 odd = 0;
			}
			
		// This for loop gathers the sum of all variances within the numbers array.
		for(int i = 0; i < numbers.length; i++)
		{
			sum2 += (Math.pow(((double)numbers[i])-mean, 2.0))/loop;
		}
		
		// Assigning the value of sum2 to variance
		variance = sum2;
		
		System.out.println("The variance is " + variance);
		
		
	}
		
		
	}



