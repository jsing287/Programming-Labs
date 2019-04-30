/**
 * This class asks a user how many times they would like 
 * to roll a dice and then outputs statistics on the numbers
 * found during each roll.
 * Author: Jasdeep Singh
 * Date: March 19, 2019
 */
package jsing287;

import java.util.Scanner;

public class Jsing287_lab06_q2 {

	
	// The main method asks the user how many rolls they would like carried out, calls the rollDice method for these numbers, and then computes information based on those rolls.
	public static void main(String[] args) 
	{
		
		// Declaring local variables.
		int rolls = 0;
		int num = 0;
		int count = 1;
		int mean = 0;
		int sumStandard = 0;
		boolean check =  false;
		
		// Initializing Scanner object named input.
		Scanner input = new Scanner(System.in);
		
		// Prompting user for the amount of rolls and storing data in variable rolls.
		System.out.println("How many times would you like to roll the dice: ");
        rolls = input.nextInt();
        
        // Initializing 1D array named dice to hold each roll, that is why the size of the array is the amount of roll.s.
        Integer[] dice = new Integer[rolls];
        
        // Storing each random number generated from the rollDice method in the dice array.
        for(int i = 0; i<dice.length; i++)
        {
        	   dice[i] = rollDice();
        }
        
        
        
        // Outputting how many 1's,2's,3's,4's,5's, and 6's were rolled.
        System.out.println("Here are the statistics: ");
        
        // This while loops through the dice array 6 times recording how many of each number on a dice was rolled.
        while(check != true)
        {
        	
        	// A for loop to loop through the dice array.
        	  for(int w = 0; w< dice.length; w++)
        	  {
        		  // if the number at position w in dice[] is equal to the variable count which holds numbers from 1-6, increment num.
        		  if(dice[w] == count)
        		  {
        			  num++;
        		  }
        		  // if no such numbers are found move to the next iteration.
        		  else
        		  {
        			  continue;
        		  }
        			  
        	  }
        	  // Output how many of that certain number was found.
        	  System.out.println(count + "'s: " + num);
        	  // Reset the number found for the next iteration.
        	  num = 0;
        	  // Move count to the next number.
        	  count++;
        	  
        	  // if the count has reached 7 which is not on a dice, stop the loop.
        	  if(count == 7)
        	  {
        		  check =true;
        	  }
        }
        
        
        	   
        // This for loop adds up all the numbers in dice[].
        for(int q = 0; q<dice.length; q++)
        {
        	   mean+=dice[q];
        }
        // Calculating the mean but rounding it to a whole number as a dice can only show whole numbers then outputting it to the user.
        double finalMean = Math.round(mean/rolls);
        System.out.println("Mean: " + finalMean);
        
        
        // Finding the standard deviation of the set of numbers.
        for(int u = 0; u<dice.length; u++)
        {
        	  sumStandard+= (Math.pow((dice[u]-finalMean), 2.0));
        }
        // Calculating the final result and outputting it to the console.
        double finalStandard =  Math.round(Math.pow((sumStandard/rolls), 0.5));
        System.out.println("Std: " + finalStandard);
      
        
		
		

	}
	
	
	// This method generates a random integer number from 1-6 and returns that value to the caller.
	public static int rollDice()
	{
		int random  = (int)(Math.random()*6+1);
		return random;
	}

}
